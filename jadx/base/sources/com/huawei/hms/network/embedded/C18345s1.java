package com.huawei.hms.network.embedded;

import Oooo0.C20856OooooOo;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.common.check.ProviderCheckUtil;
import com.huawei.hms.framework.common.hianalytics.HianalyticsHelper;
import com.huawei.hms.network.inner.api.PolicyNetworkService;
import com.huawei.hms.network.inner.utils.CheckConfigUtils;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.s1 */
/* JADX INFO: loaded from: classes9.dex */
public class C18345s1 {

    /* JADX INFO: renamed from: e */
    public static final String f56071e = "ConfigManager";

    /* JADX INFO: renamed from: f */
    public static final String f56072f = "content://com.huawei.hms.contentprovider/com.huawei.hms.networkkit/remoteconfig";

    /* JADX INFO: renamed from: g */
    public static final String f56073g = "retCode";

    /* JADX INFO: renamed from: h */
    public static final String f56074h = "retDesc";

    /* JADX INFO: renamed from: i */
    public static final int f56075i = 100301;

    /* JADX INFO: renamed from: j */
    public static final String f56076j = "getConfig";

    /* JADX INFO: renamed from: k */
    public static final int f56077k = 5000;

    /* JADX INFO: renamed from: l */
    public static final int f56078l = 10000;

    /* JADX INFO: renamed from: m */
    public static final int f56079m = 500;

    /* JADX INFO: renamed from: a */
    public Map<String, AbstractC18384v1> f56084a;

    /* JADX INFO: renamed from: b */
    public Map<String, Object> f56085b;

    /* JADX INFO: renamed from: c */
    public Timer f56086c;

    /* JADX INFO: renamed from: d */
    public String f56087d;

    /* JADX INFO: renamed from: o */
    public static final String f56081o = "profile_base";

    /* JADX INFO: renamed from: n */
    public static final String f56080n = "profile_restful";

    /* JADX INFO: renamed from: p */
    public static final String f56082p = "profile_filemanager";

    /* JADX INFO: renamed from: q */
    public static final List<String> f56083q = Arrays.asList(f56081o, f56080n, f56082p);

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.s1$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f56088a;

        static {
            int[] iArr = new int[EnumC18436z1.values().length];
            f56088a = iArr;
            try {
                iArr[EnumC18436z1.RESTFUL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56088a[EnumC18436z1.FILE_MANAGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.s1$b */
    public static class b extends TimerTask {

        /* JADX INFO: renamed from: a */
        public Bundle f56089a;

        public b(Bundle bundle) {
            this.f56089a = bundle;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (HianalyticsHelper.getInstance().isEnableReportNoSeed(ContextHolder.getAppContext())) {
                C18332r1 c18332r1 = new C18332r1();
                c18332r1.put("error_code", this.f56089a.getInt(C18345s1.f56073g));
                c18332r1.put(C18332r1.f55992d, this.f56089a.getString(C18345s1.f56074h));
                c18332r1.put("config_version", this.f56089a.getString("core_configversion"));
                HianalyticsHelper.getInstance().getReportExecutor().execute(new c(c18332r1));
                Logger.m76958d(C18345s1.f56071e, "ConfigHianalyticsData：" + c18332r1.toString());
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.s1$c */
    public static class c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final C18332r1 f56090a;

        public c(C18332r1 c18332r1) {
            this.f56090a = c18332r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            Logger.m76966v(C18345s1.f56071e, "remote config sdk report data to aiops is: %s", new JSONObject(this.f56090a.get()));
            HianalyticsHelper.getInstance().onEvent(this.f56090a.get(), C18332r1.f55990b);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.s1$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public static C18345s1 f56091a = new C18345s1(null);
    }

    public C18345s1() {
        this.f56085b = new ConcurrentHashMap();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f56084a = concurrentHashMap;
        EnumC18371u1 enumC18371u1 = EnumC18371u1.REMOTE_AGC;
        concurrentHashMap.put(f56081o, new C18397w1(enumC18371u1));
        this.f56084a.put(f56080n, new C18423y1(enumC18371u1));
        this.f56084a.put(f56082p, new C18410x1(enumC18371u1));
    }

    /* JADX INFO: renamed from: b */
    private int m79473b() {
        String str = (String) this.f56085b.get("core_configversion");
        if (str == null) {
            return 0;
        }
        String[] strArrSplit = str.split("\\.");
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrSplit) {
            sb.append(str2);
        }
        return Integer.parseInt(sb.toString());
    }

    /* JADX INFO: renamed from: c */
    public static C18345s1 m79477c() {
        return d.f56091a;
    }

    /* JADX INFO: renamed from: d */
    private boolean m79480d() {
        Object objM79474b = m79474b(C18358t1.f56150d);
        if (objM79474b instanceof String) {
            return Boolean.parseBoolean((String) objM79474b);
        }
        if (objM79474b instanceof Boolean) {
            return ((Boolean) objM79474b).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public Bundle m79481a(Context context, String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        Uri uri = Uri.parse(f56072f);
        if (!ProviderCheckUtil.isValid(uri)) {
            Logger.m76967w(f56071e, "package name is invalid");
            return null;
        }
        bundle.putString("hms_cp_bundle_key", "content://com.huawei.hms.networkkit");
        try {
            return context.getContentResolver().call(uri, str, str2, bundle);
        } catch (RuntimeException unused) {
            Logger.m76958d(f56071e, "remote config base service kit not exist ");
            Bundle bundle2 = new Bundle();
            bundle2.putInt(f56073g, C18332r1.f55994f);
            bundle2.putString(f56074h, "cross process call failed");
            return bundle2;
        }
    }

    public /* synthetic */ C18345s1(a aVar) {
        this();
    }

    /* JADX INFO: renamed from: b */
    private Object m79474b(String str) {
        Object obj = this.f56085b.get(str);
        return obj != null ? obj : C18358t1.m79542b().m79544a(str);
    }

    /* JADX INFO: renamed from: c */
    private Object m79478c(String str, EnumC18436z1 enumC18436z1) {
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        if (!TextUtils.equals("core_configversion", lowerCase) && m79480d()) {
            if (m79473b() < 100301) {
                Logger.m76958d(f56071e, "configVersion is lower than 100301");
                return m79474b(lowerCase);
            }
            AbstractC18384v1 abstractC18384v1 = this.f56084a.get(f56081o);
            boolean zM79815a = C18397w1.m79815a(this.f56087d, abstractC18384v1);
            Logger.m76958d(f56071e, "isExclude:" + zM79815a);
            if (zM79815a) {
                return m79474b(lowerCase);
            }
            boolean zM79817b = C18397w1.m79817b(this.f56087d, abstractC18384v1);
            Logger.m76958d(f56071e, "isInclude:" + zM79817b);
            if (!zM79817b) {
                return m79474b(lowerCase);
            }
            boolean zM79818c = C18397w1.m79818c(lowerCase, abstractC18384v1);
            Logger.m76958d(f56071e, "isAbTestConfig:" + zM79818c);
            return zM79818c ? m79474b(lowerCase) : m79468a(lowerCase, enumC18436z1);
        }
        return m79474b(lowerCase);
    }

    /* JADX INFO: renamed from: a */
    public Object m79482a(String str) {
        EnumC18436z1 enumC18436z1;
        if (str == null || str.length() == 0) {
            return null;
        }
        Logger.m76958d(f56071e, "getValue:".concat(str));
        if (str.contains("|")) {
            String[] strArrSplit = str.split("\\|");
            if (strArrSplit.length != 2) {
                return null;
            }
            if (TextUtils.equals(strArrSplit[0], PolicyNetworkService.ProfileConstants.RESTFUL)) {
                str = strArrSplit[1];
                enumC18436z1 = EnumC18436z1.RESTFUL;
            } else if (TextUtils.equals(strArrSplit[0], PolicyNetworkService.ProfileConstants.FILE_MANAGER)) {
                str = strArrSplit[1];
                enumC18436z1 = EnumC18436z1.FILE_MANAGER;
            } else {
                str = strArrSplit[1];
                enumC18436z1 = EnumC18436z1.DEFAULT;
            }
        } else {
            enumC18436z1 = EnumC18436z1.DEFAULT;
        }
        return m79475b(str, enumC18436z1);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Object m79468a(String str, EnumC18436z1 enumC18436z1) {
        Map<String, AbstractC18384v1> map;
        String str2;
        Object objM79665a;
        int i = a.f56088a[enumC18436z1.ordinal()];
        if (i == 1) {
            map = this.f56084a;
            str2 = f56080n;
        } else {
            if (i != 2) {
                objM79665a = null;
                if (objM79665a == null) {
                    return objM79665a;
                }
                Object objM79665a2 = this.f56084a.get(f56081o).m79665a(str);
                return objM79665a2 != null ? objM79665a2 : C18358t1.m79542b().m79544a(str);
            }
            map = this.f56084a;
            str2 = f56082p;
        }
        objM79665a = map.get(str2).m79665a(str);
        if (objM79665a == null) {
        }
    }

    /* JADX INFO: renamed from: b */
    private Object m79475b(String str, EnumC18436z1 enumC18436z1) {
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        try {
            return m79478c(lowerCase, enumC18436z1);
        } catch (Exception unused) {
            Logger.m76967w(f56071e, "search configs occurs error, return default config");
            return C18358t1.m79542b().m79544a(lowerCase);
        }
    }

    /* JADX INFO: renamed from: c */
    private JSONObject m79479c(String str) {
        try {
            return TextUtils.isEmpty(str) ? new JSONObject() : new JSONObject(str);
        } catch (JSONException unused) {
            Logger.m76967w(f56071e, "call method stringToJson occur JSONException");
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m79469a() {
        Object obj = this.f56085b.get(PolicyNetworkService.RequestConstants.CONNECT_TIMEOUT);
        Object obj2 = this.f56085b.get(PolicyNetworkService.RequestConstants.CONCURRENT_CONNECT_DELAY);
        if (obj != null && obj2 != null) {
            int iStringToInteger = StringUtils.stringToInteger(String.valueOf(obj), 10000);
            int iStringToInteger2 = StringUtils.stringToInteger(String.valueOf(obj2), 500);
            if (iStringToInteger2 >= iStringToInteger) {
                Logger.m76958d(f56071e, C20856OooooOo.OooO0O0("concurrent_connect_delay :", iStringToInteger2, ",is not less than connect_timeout: ", ",reset the two values to the default values", iStringToInteger));
                iStringToInteger2 = 500;
                iStringToInteger = 10000;
            }
            this.f56085b.put(PolicyNetworkService.RequestConstants.CONNECT_TIMEOUT, Integer.valueOf(iStringToInteger));
            this.f56085b.put(PolicyNetworkService.RequestConstants.CONCURRENT_CONNECT_DELAY, Integer.valueOf(iStringToInteger2));
        }
        for (String str : f56083q) {
            AbstractC18384v1 abstractC18384v1 = this.f56084a.get(str);
            Map<String, Object> mapM79666a = abstractC18384v1.m79666a();
            Object obj3 = mapM79666a.get(PolicyNetworkService.RequestConstants.CONNECT_TIMEOUT);
            Object obj4 = mapM79666a.get(PolicyNetworkService.RequestConstants.CONCURRENT_CONNECT_DELAY);
            if (obj3 != null && obj4 != null) {
                int iStringToInteger3 = StringUtils.stringToInteger(String.valueOf(obj3), 10000);
                int iStringToInteger4 = StringUtils.stringToInteger(String.valueOf(obj4), 500);
                if (iStringToInteger4 >= iStringToInteger3) {
                    Logger.m76958d(f56071e, C20856OooooOo.OooO0O0("concurrent_connect_delay :", iStringToInteger4, ",is not less than connect_timeout: ", ",reset the two values to the default values", iStringToInteger3));
                    iStringToInteger4 = 500;
                    iStringToInteger3 = 10000;
                }
                abstractC18384v1.m79668a(PolicyNetworkService.RequestConstants.CONNECT_TIMEOUT, Integer.valueOf(iStringToInteger3));
                abstractC18384v1.m79668a(PolicyNetworkService.RequestConstants.CONCURRENT_CONNECT_DELAY, Integer.valueOf(iStringToInteger4));
            }
            this.f56084a.put(str, abstractC18384v1);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m79476b(Context context) {
        Bundle bundleM79481a = m79481a(context, f56076j, this.f56087d, null);
        if (bundleM79481a == null || bundleM79481a.size() == 0) {
            return;
        }
        for (String str : C18358t1.m79542b().m79545a()) {
            Object obj = bundleM79481a.get(str);
            if (obj != null && CheckConfigUtils.checkIsCorrect(str, obj)) {
                this.f56085b.put(str, obj);
                Logger.m76959d(f56071e, "put independentConfigs key: %s, value: %s", str, obj);
            }
        }
        if (!m79480d()) {
            Logger.m76958d(f56071e, "Profile ability is disabled");
            m79470a(bundleM79481a);
            return;
        }
        for (String str2 : f56083q) {
            Logger.m76959d(f56071e, "updateConfigs profileName: %s", str2);
            AbstractC18384v1 abstractC18384v1 = this.f56084a.get(str2);
            Object obj2 = bundleM79481a.get(str2);
            if (obj2 instanceof String) {
                m79471a(abstractC18384v1, (String) obj2);
            } else {
                Logger.m76958d(f56071e, "obj is not String");
            }
        }
        m79470a(bundleM79481a);
    }

    /* JADX INFO: renamed from: a */
    public void m79483a(Context context) {
        Context appContext = ContextHolder.getAppContext();
        this.f56087d = appContext != null ? appContext.getPackageName() : context.getPackageName();
        C18358t1.m79542b();
        m79476b(context);
        m79469a();
    }

    /* JADX INFO: renamed from: a */
    private void m79470a(Bundle bundle) {
        this.f56086c = new Timer("NetworkKit_Remote_Config_Timer");
        this.f56086c.schedule(new b(bundle), 5000L);
    }

    /* JADX INFO: renamed from: a */
    private void m79471a(AbstractC18384v1 abstractC18384v1, String str) {
        Logger.m76959d(f56071e, "parseJsonStr: %s", str);
        m79472a(abstractC18384v1, m79479c(str));
    }

    /* JADX INFO: renamed from: a */
    private void m79472a(AbstractC18384v1 abstractC18384v1, JSONObject jSONObject) {
        Object obj;
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                obj = jSONObject.get(next);
            } catch (JSONException e) {
                Logger.m76969w(f56071e, "JSONException: %s", e.getMessage());
                obj = null;
            }
            if (obj instanceof JSONObject) {
                Logger.m76959d(f56071e, "%s is JSONObject", obj);
                m79472a(abstractC18384v1, (JSONObject) obj);
            } else if (next.startsWith(C18358t1.f56147a)) {
                String strSubstring = next.substring(11);
                if (CheckConfigUtils.checkIsCorrect(strSubstring, obj)) {
                    abstractC18384v1.m79668a(strSubstring, obj);
                    Logger.m76959d(f56071e, "put key: %s, value: %s", strSubstring, obj);
                }
            } else if (CheckConfigUtils.checkIsCorrect(next, obj)) {
                abstractC18384v1.m79668a(next, obj);
                Logger.m76959d(f56071e, "put key: %s, value: %s", next, obj);
            }
        }
    }
}

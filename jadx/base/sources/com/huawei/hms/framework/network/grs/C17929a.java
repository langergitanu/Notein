package com.huawei.hms.framework.network.grs;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.local.model.CountryCodeBean;
import com.huawei.hms.framework.network.grs.p577e.C17933a;
import com.huawei.hms.framework.network.grs.p577e.C17934b;
import com.huawei.hms.framework.network.grs.p577e.C17935c;
import com.huawei.hms.framework.network.grs.p578f.C17937b;
import com.huawei.hms.framework.network.grs.p579g.C17944d;
import com.huawei.hms.framework.network.grs.p579g.C17948h;
import com.huawei.hms.framework.network.grs.p579g.p581k.C17953c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.huawei.hms.framework.network.grs.a */
/* JADX INFO: loaded from: classes7.dex */
public class C17929a {

    /* JADX INFO: renamed from: e */
    private static final String f53615e = "a";

    /* JADX INFO: renamed from: a */
    private final GrsBaseInfo f53616a;

    /* JADX INFO: renamed from: b */
    private C17933a f53617b;

    /* JADX INFO: renamed from: c */
    private C17948h f53618c;

    /* JADX INFO: renamed from: d */
    private C17935c f53619d;

    /* JADX INFO: renamed from: com.huawei.hms.framework.network.grs.a$a */
    public static class a implements InterfaceC17930b {

        /* JADX INFO: renamed from: a */
        String f53620a;

        /* JADX INFO: renamed from: b */
        Map<String, String> f53621b;

        /* JADX INFO: renamed from: c */
        IQueryUrlsCallBack f53622c;

        /* JADX INFO: renamed from: d */
        Context f53623d;

        /* JADX INFO: renamed from: e */
        GrsBaseInfo f53624e;

        /* JADX INFO: renamed from: f */
        C17933a f53625f;

        public a(String str, Map<String, String> map, IQueryUrlsCallBack iQueryUrlsCallBack, Context context, GrsBaseInfo grsBaseInfo, C17933a c17933a) {
            this.f53620a = str;
            this.f53621b = map;
            this.f53622c = iQueryUrlsCallBack;
            this.f53623d = context;
            this.f53624e = grsBaseInfo;
            this.f53625f = c17933a;
        }

        @Override // com.huawei.hms.framework.network.grs.InterfaceC17930b
        /* JADX INFO: renamed from: a */
        public void mo76981a() {
            Map<String, String> map = this.f53621b;
            if (map != null && !map.isEmpty()) {
                Logger.m76963i(C17929a.f53615e, "get expired cache localUrls");
                this.f53622c.onCallBackSuccess(this.f53621b);
            } else {
                if (this.f53621b != null) {
                    this.f53622c.onCallBackFail(-3);
                    return;
                }
                Logger.m76963i(C17929a.f53615e, "access local config for return a domain.");
                this.f53622c.onCallBackSuccess(C17937b.m77046a(this.f53623d.getPackageName(), this.f53624e).m77050a(this.f53623d, this.f53625f, this.f53624e, this.f53620a, true));
            }
        }

        @Override // com.huawei.hms.framework.network.grs.InterfaceC17930b
        /* JADX INFO: renamed from: a */
        public void mo76982a(C17944d c17944d) {
            Map<String, String> mapM76974a = C17929a.m76974a(c17944d.m77110j(), this.f53620a);
            if (!mapM76974a.isEmpty()) {
                Logger.m76963i(C17929a.f53615e, "get url is from remote server");
                this.f53622c.onCallBackSuccess(mapM76974a);
                return;
            }
            Map<String, String> map = this.f53621b;
            if (map != null && !map.isEmpty()) {
                Logger.m76963i(C17929a.f53615e, "get expired cache localUrls");
                this.f53622c.onCallBackSuccess(this.f53621b);
            } else {
                if (this.f53621b != null) {
                    this.f53622c.onCallBackFail(-5);
                    return;
                }
                Logger.m76963i(C17929a.f53615e, "access local config for return a domain.");
                this.f53622c.onCallBackSuccess(C17937b.m77046a(this.f53623d.getPackageName(), this.f53624e).m77050a(this.f53623d, this.f53625f, this.f53624e, this.f53620a, true));
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.framework.network.grs.a$b */
    public static class b implements InterfaceC17930b {

        /* JADX INFO: renamed from: a */
        String f53626a;

        /* JADX INFO: renamed from: b */
        String f53627b;

        /* JADX INFO: renamed from: c */
        IQueryUrlCallBack f53628c;

        /* JADX INFO: renamed from: d */
        String f53629d;

        /* JADX INFO: renamed from: e */
        Context f53630e;

        /* JADX INFO: renamed from: f */
        GrsBaseInfo f53631f;

        /* JADX INFO: renamed from: g */
        C17933a f53632g;

        public b(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack, String str3, Context context, GrsBaseInfo grsBaseInfo, C17933a c17933a) {
            this.f53626a = str;
            this.f53627b = str2;
            this.f53628c = iQueryUrlCallBack;
            this.f53629d = str3;
            this.f53630e = context;
            this.f53631f = grsBaseInfo;
            this.f53632g = c17933a;
        }

        @Override // com.huawei.hms.framework.network.grs.InterfaceC17930b
        /* JADX INFO: renamed from: a */
        public void mo76981a() {
            if (!TextUtils.isEmpty(this.f53629d)) {
                Logger.m76963i(C17929a.f53615e, "get expired cache localUrl");
                this.f53628c.onCallBackSuccess(this.f53629d);
            } else {
                if (!TextUtils.isEmpty(this.f53629d)) {
                    this.f53628c.onCallBackFail(-3);
                    return;
                }
                Logger.m76963i(C17929a.f53615e, "access local config for return a domain.");
                this.f53628c.onCallBackSuccess(C17937b.m77046a(this.f53630e.getPackageName(), this.f53631f).m77049a(this.f53630e, this.f53632g, this.f53631f, this.f53626a, this.f53627b, true));
            }
        }

        @Override // com.huawei.hms.framework.network.grs.InterfaceC17930b
        /* JADX INFO: renamed from: a */
        public void mo76982a(C17944d c17944d) {
            Map<String, String> mapM76974a = C17929a.m76974a(c17944d.m77110j(), this.f53626a);
            if (mapM76974a.containsKey(this.f53627b)) {
                Logger.m76963i(C17929a.f53615e, "get url is from remote server");
                this.f53628c.onCallBackSuccess(mapM76974a.get(this.f53627b));
            } else if (!TextUtils.isEmpty(this.f53629d)) {
                Logger.m76963i(C17929a.f53615e, "get expired cache localUrl");
                this.f53628c.onCallBackSuccess(this.f53629d);
            } else {
                if (!TextUtils.isEmpty(this.f53629d)) {
                    this.f53628c.onCallBackFail(-5);
                    return;
                }
                Logger.m76963i(C17929a.f53615e, "access local config for return a domain.");
                this.f53628c.onCallBackSuccess(C17937b.m77046a(this.f53630e.getPackageName(), this.f53631f).m77049a(this.f53630e, this.f53632g, this.f53631f, this.f53626a, this.f53627b, true));
            }
        }
    }

    public C17929a(GrsBaseInfo grsBaseInfo, C17933a c17933a, C17948h c17948h, C17935c c17935c) {
        this.f53616a = grsBaseInfo;
        this.f53617b = c17933a;
        this.f53618c = c17948h;
        this.f53619d = c17935c;
    }

    /* JADX INFO: renamed from: a */
    public static CountryCodeBean m76970a(Context context, boolean z) {
        return new CountryCodeBean(context, z);
    }

    /* JADX INFO: renamed from: a */
    public String m76976a(Context context, String str) {
        C17944d c17944dM77123a = this.f53618c.m77123a(new C17953c(this.f53616a, context), str, this.f53619d);
        return c17944dM77123a == null ? "" : c17944dM77123a.m77113m() ? this.f53617b.m77010a().m77020a(this.f53616a.getGrsParasKey(true, true, context), "") : c17944dM77123a.m77110j();
    }

    /* JADX INFO: renamed from: a */
    public String m76977a(String str, String str2, Context context) {
        C17934b c17934b = new C17934b();
        String strM77049a = m76973a(str, c17934b, context).get(str2);
        if (c17934b.m77018a() && !TextUtils.isEmpty(strM77049a)) {
            Logger.m76964i(f53615e, "get unexpired cache localUrl: %s", StringUtils.anonymizeMessage(strM77049a));
            C17937b.m77047a(context, this.f53616a);
            return strM77049a;
        }
        String str3 = m76974a(m76976a(context, str), str).get(str2);
        if (!TextUtils.isEmpty(str3)) {
            Logger.m76963i(f53615e, "get url is from remote server");
            C17937b.m77047a(context, this.f53616a);
            return str3;
        }
        if (TextUtils.isEmpty(strM77049a)) {
            Logger.m76963i(f53615e, "access local config for return a domain.");
            strM77049a = C17937b.m77046a(context.getPackageName(), this.f53616a).m77049a(context, this.f53617b, this.f53616a, str, str2, true);
        } else {
            Logger.m76963i(f53615e, "get expired cache localUrl");
        }
        Logger.m76964i(f53615e, "synGetGrsUrl: %s", StringUtils.anonymizeMessage(strM77049a));
        return strM77049a;
    }

    /* JADX INFO: renamed from: a */
    public static Map<String, Map<String, String>> m76972a(String str) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
        if (TextUtils.isEmpty(str)) {
            Logger.m76965v(f53615e, "isSpExpire jsonValue is null.");
            return concurrentHashMap;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                if (!TextUtils.isEmpty(next)) {
                    concurrentHashMap.put(next, m76975a(jSONObject2));
                }
            }
            return concurrentHashMap;
        } catch (JSONException e) {
            Logger.m76969w(f53615e, "getServicesUrlsMap occur a JSONException: %s", StringUtils.anonymizeMessage(e.getMessage()));
            return concurrentHashMap;
        }
    }

    /* JADX INFO: renamed from: a */
    public Map<String, String> m76978a(String str, Context context) {
        C17934b c17934b = new C17934b();
        Map<String, String> mapM76973a = m76973a(str, c17934b, context);
        if (c17934b.m77018a() && !mapM76973a.isEmpty()) {
            Logger.m76964i(f53615e, "get unexpired cache localUrls: %s", StringUtils.anonymizeMessage(new JSONObject(mapM76973a).toString()));
            C17937b.m77047a(context, this.f53616a);
            return mapM76973a;
        }
        Map<String, String> mapM76974a = m76974a(m76976a(context, str), str);
        if (!mapM76974a.isEmpty()) {
            Logger.m76963i(f53615e, "get url is from remote server");
            C17937b.m77047a(context, this.f53616a);
            return mapM76974a;
        }
        if (mapM76973a.isEmpty()) {
            Logger.m76963i(f53615e, "access local config for return a domain.");
            mapM76973a = C17937b.m77046a(context.getPackageName(), this.f53616a).m77050a(context, this.f53617b, this.f53616a, str, true);
        } else {
            Logger.m76963i(f53615e, "get expired cache localUrls");
        }
        Logger.m76964i(f53615e, "synGetGrsUrls: %s", StringUtils.anonymizeMessage(mapM76973a != null ? new JSONObject(mapM76973a).toString() : ""));
        return mapM76973a;
    }

    /* JADX INFO: renamed from: a */
    private Map<String, String> m76973a(String str, C17934b c17934b, Context context) {
        Map<String, String> mapM77011a = this.f53617b.m77011a(this.f53616a, str, c17934b, context);
        if (mapM77011a == null || mapM77011a.isEmpty()) {
            Map<String, String> mapM77050a = C17937b.m77046a(context.getPackageName(), this.f53616a).m77050a(context, this.f53617b, this.f53616a, str, false);
            return mapM77050a != null ? mapM77050a : new HashMap();
        }
        C17937b.m77047a(context, this.f53616a);
        return mapM77011a;
    }

    /* JADX INFO: renamed from: a */
    public static Map<String, String> m76974a(String str, String str2) {
        HashMap map = new HashMap();
        if (TextUtils.isEmpty(str)) {
            Logger.m76967w(f53615e, "isSpExpire jsonValue from server is null.");
            return map;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = jSONObject.has(str2) ? jSONObject.getJSONObject(str2) : null;
            if (jSONObject2 == null) {
                Logger.m76969w(f53615e, "getServiceNameUrls: paser null from server json data by {%s}.", str2);
                return map;
            }
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject2.get(next).toString());
            }
            return map;
        } catch (JSONException e) {
            Logger.m76969w(f53615e, "Method{getServiceNameUrls} query url from SP occur an JSONException: %s", StringUtils.anonymizeMessage(e.getMessage()));
            return map;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Map<String, String> m76975a(JSONObject jSONObject) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String string = jSONObject.get(next).toString();
                if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(string)) {
                    concurrentHashMap.put(next, string);
                }
            }
            return concurrentHashMap;
        } catch (JSONException e) {
            Logger.m76969w(f53615e, "getServiceUrls occur a JSONException: %s", StringUtils.anonymizeMessage(e.getMessage()));
            return concurrentHashMap;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m76979a(String str, IQueryUrlsCallBack iQueryUrlsCallBack, Context context) {
        C17934b c17934b = new C17934b();
        Map<String, String> mapM76973a = m76973a(str, c17934b, context);
        if (!c17934b.m77018a()) {
            this.f53618c.m77125a(new C17953c(this.f53616a, context), new a(str, mapM76973a, iQueryUrlsCallBack, context, this.f53616a, this.f53617b), str, this.f53619d);
            return;
        }
        String str2 = f53615e;
        Logger.m76963i(str2, "get unexpired cache localUrls");
        if (mapM76973a.isEmpty()) {
            iQueryUrlsCallBack.onCallBackFail(-5);
            return;
        }
        C17937b.m77047a(context, this.f53616a);
        Logger.m76964i(str2, "ayncGetGrsUrls: %s", StringUtils.anonymizeMessage(new JSONObject(mapM76973a).toString()));
        iQueryUrlsCallBack.onCallBackSuccess(mapM76973a);
    }

    /* JADX INFO: renamed from: a */
    public void m76980a(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack, Context context) {
        C17934b c17934b = new C17934b();
        String str3 = m76973a(str, c17934b, context).get(str2);
        if (!c17934b.m77018a()) {
            this.f53618c.m77125a(new C17953c(this.f53616a, context), new b(str, str2, iQueryUrlCallBack, str3, context, this.f53616a, this.f53617b), str, this.f53619d);
            return;
        }
        String str4 = f53615e;
        Logger.m76963i(str4, "get unexpired cache localUrl");
        if (TextUtils.isEmpty(str3)) {
            iQueryUrlCallBack.onCallBackFail(-5);
            return;
        }
        C17937b.m77047a(context, this.f53616a);
        Logger.m76964i(str4, "ayncGetGrsUrl: %s", StringUtils.anonymizeMessage(str3));
        iQueryUrlCallBack.onCallBackSuccess(str3);
    }
}

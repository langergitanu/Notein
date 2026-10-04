package com.huawei.hms.framework.network.grs.p578f;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.local.model.C17962a;
import com.huawei.hms.framework.network.grs.local.model.C17963b;
import com.huawei.hms.framework.network.grs.local.model.C17964c;
import com.huawei.hms.framework.network.grs.local.model.C17965d;
import com.huawei.hms.framework.network.grs.p577e.C17933a;
import com.huawei.hms.framework.network.grs.p582h.C17957c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.huawei.hms.framework.network.grs.f.a */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC17936a {

    /* JADX INFO: renamed from: a */
    protected C17962a f53659a;

    /* JADX INFO: renamed from: b */
    protected List<C17963b> f53660b;

    /* JADX INFO: renamed from: c */
    protected Map<String, String> f53661c = new ConcurrentHashMap(16);

    /* JADX INFO: renamed from: d */
    protected boolean f53662d = false;

    /* JADX INFO: renamed from: e */
    protected boolean f53663e = false;

    /* JADX INFO: renamed from: f */
    protected boolean f53664f = false;

    /* JADX INFO: renamed from: g */
    protected Set<String> f53665g = new HashSet(16);

    /* JADX INFO: renamed from: b */
    private int m77026b(String str, Context context) {
        if (m77027f(C17957c.m77155a(str, context)) != 0) {
            return -1;
        }
        Logger.m76964i("AbstractLocalManager", "load APP_CONFIG_FILE success{%s}.", str);
        return 0;
    }

    /* JADX INFO: renamed from: f */
    private int m77027f(String str) {
        int iMo77037b;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (this.f53663e && (iMo77037b = mo77037b(str)) != 0) {
            return iMo77037b;
        }
        int iMo77029a = mo77029a(str);
        return iMo77029a != 0 ? iMo77029a : mo77044e(str);
    }

    /* JADX INFO: renamed from: g */
    private int m77028g(String str) {
        List<C17963b> list;
        int iM77040c;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return (!this.f53663e || !((list = this.f53660b) == null || list.isEmpty()) || (iM77040c = m77040c(str)) == 0) ? m77042d(str) : iM77040c;
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo77029a(String str);

    /* JADX INFO: renamed from: a */
    public int m77030a(String str, Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(GrsApp.getInstance().getBrand("/"));
        sb.append(str);
        return m77026b(sb.toString(), context) != 0 ? -1 : 0;
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo77037b(String str);

    /* JADX INFO: renamed from: c */
    public int m77040c(String str) {
        JSONArray jSONArray;
        this.f53660b = new ArrayList(16);
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("countryOrAreaGroups")) {
                jSONArray = jSONObject.getJSONArray("countryOrAreaGroups");
            } else if (jSONObject.has("countryGroups")) {
                jSONArray = jSONObject.getJSONArray("countryGroups");
            } else {
                Logger.m76960e("AbstractLocalManager", "maybe local config json is wrong because the default countryOrAreaGroups isn't config.");
                jSONArray = null;
            }
            if (jSONArray == null) {
                return -1;
            }
            this.f53660b.addAll(m77032a(jSONArray));
            return 0;
        } catch (JSONException e) {
            Logger.m76969w("AbstractLocalManager", "parse countrygroup failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e.getMessage()));
            return -1;
        }
    }

    /* JADX INFO: renamed from: d */
    public int m77042d(String str) {
        try {
            m77039b(new JSONObject(str).getJSONArray("services"));
            return 0;
        } catch (JSONException e) {
            Logger.m76969w("AbstractLocalManager", "parse 2.0 services failed maybe because of json style.please check! %s", StringUtils.anonymizeMessage(e.getMessage()));
            return -1;
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract int mo77044e(String str);

    /* JADX INFO: renamed from: e */
    public boolean m77045e() {
        return this.f53662d;
    }

    /* JADX INFO: renamed from: a */
    public String m77031a(Context context, C17933a c17933a, GrsBaseInfo grsBaseInfo, String str, String str2, boolean z) {
        Map<String, String> mapM77033a = m77033a(context, c17933a, grsBaseInfo, str, z);
        if (mapM77033a != null) {
            return mapM77033a.get(str2);
        }
        Logger.m76969w("AbstractLocalManager", "addresses not found by routeby in local config{%s}", str);
        return null;
    }

    /* JADX INFO: renamed from: b */
    public C17962a m77038b() {
        return this.f53659a;
    }

    /* JADX INFO: renamed from: c */
    public Set<String> m77041c() {
        return this.f53665g;
    }

    /* JADX INFO: renamed from: d */
    public boolean m77043d() {
        return this.f53664f;
    }

    /* JADX INFO: renamed from: a */
    public List<C17963b> m77032a(JSONArray jSONArray) {
        JSONArray jSONArray2;
        if (jSONArray == null || jSONArray.length() == 0) {
            return new ArrayList();
        }
        try {
            ArrayList arrayList = new ArrayList(16);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                C17963b c17963b = new C17963b();
                c17963b.m77175b(jSONObject.getString("id"));
                c17963b.m77176c(jSONObject.getString("name"));
                c17963b.m77172a(jSONObject.getString("description"));
                if (jSONObject.has("countriesOrAreas")) {
                    jSONArray2 = jSONObject.getJSONArray("countriesOrAreas");
                } else if (jSONObject.has("countries")) {
                    jSONArray2 = jSONObject.getJSONArray("countries");
                } else {
                    Logger.m76967w("AbstractLocalManager", "current country or area group has not config countries or areas.");
                    jSONArray2 = null;
                }
                HashSet hashSet = new HashSet(16);
                if (jSONArray2 != null && jSONArray2.length() != 0) {
                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                        hashSet.add((String) jSONArray2.get(i2));
                    }
                    c17963b.m77173a(hashSet);
                    arrayList.add(c17963b);
                }
                return new ArrayList();
            }
            return arrayList;
        } catch (JSONException e) {
            Logger.m76969w("AbstractLocalManager", "parse countrygroup failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e.getMessage()));
            return new ArrayList();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[PHI: r10
      0x0060: PHI (r10v5 java.lang.String) = (r10v0 java.lang.String), (r10v1 java.lang.String) binds: [B:17:0x005e, B:20:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c6 A[PHI: r5
      0x00c6: PHI (r5v10 java.lang.String) = (r5v8 java.lang.String), (r5v9 java.lang.String) binds: [B:33:0x00c4, B:36:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e5  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m77039b(JSONArray jSONArray) throws JSONException {
        List<C17963b> listM77032a;
        String string;
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            C17964c c17964c = new C17964c();
            String string2 = jSONObject.getString("name");
            c17964c.m77182b(string2);
            if (!this.f53665g.contains(string2)) {
                this.f53665g.add(string2);
                if (this.f53663e) {
                    c17964c.m77183c(jSONObject.getString("routeBy"));
                    JSONArray jSONArray2 = jSONObject.getJSONArray("servings");
                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                        JSONObject jSONObject2 = (JSONObject) jSONArray2.get(i2);
                        C17965d c17965d = new C17965d();
                        String str = "countryOrAreaGroup";
                        if (jSONObject2.has("countryOrAreaGroup")) {
                            string = jSONObject2.getString(str);
                        } else {
                            str = "countryGroup";
                            if (!jSONObject2.has("countryGroup")) {
                                Logger.m76966v("AbstractLocalManager", "maybe this service{%s} routeBy is unconditional.", string2);
                                string = "no-country";
                            }
                        }
                        c17965d.m77185a(string);
                        JSONObject jSONObject3 = jSONObject2.getJSONObject("addresses");
                        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
                        Iterator<String> itKeys = jSONObject3.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            String string3 = jSONObject3.getString(next);
                            if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(string3)) {
                                concurrentHashMap.put(next, jSONObject3.getString(next));
                            }
                        }
                        c17965d.m77186a(concurrentHashMap);
                        c17964c.m77179a(c17965d.m77187b(), c17965d);
                    }
                    String str2 = "countryOrAreaGroups";
                    if (jSONObject.has("countryOrAreaGroups")) {
                        listM77032a = m77032a(jSONObject.getJSONArray(str2));
                        c17964c.m77180a(listM77032a);
                        if (this.f53659a == null) {
                            this.f53659a = new C17962a();
                        }
                        this.f53659a.m77168a(string2, c17964c);
                    } else {
                        str2 = "countryGroups";
                        if (!jSONObject.has("countryGroups")) {
                            Logger.m76963i("AbstractLocalManager", "service use default countryOrAreaGroup");
                            listM77032a = null;
                        }
                        c17964c.m77180a(listM77032a);
                        if (this.f53659a == null) {
                        }
                        this.f53659a.m77168a(string2, c17964c);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public Map<String, String> m77033a(Context context, C17933a c17933a, GrsBaseInfo grsBaseInfo, String str, boolean z) {
        C17962a c17962a = this.f53659a;
        if (c17962a == null) {
            Logger.m76967w("AbstractLocalManager", "application data is null.");
            return null;
        }
        C17964c c17964cM77165a = c17962a.m77165a(str);
        if (c17964cM77165a == null) {
            Logger.m76969w("AbstractLocalManager", "service not found in local config{%s}", str);
            return null;
        }
        String strM77057b = C17940e.m77057b(context, c17933a, c17964cM77165a.m77181b(), grsBaseInfo, z);
        if (strM77057b == null) {
            Logger.m76969w("AbstractLocalManager", "country not found by routeby in local config{%s}", c17964cM77165a.m77181b());
            return null;
        }
        List<C17963b> listM77178a = c17964cM77165a.m77178a();
        C17965d c17965dM77177a = c17964cM77165a.m77177a(((listM77178a == null || listM77178a.size() == 0) ? this.f53661c : m77025a(listM77178a, grsBaseInfo, strM77057b)).get(strM77057b));
        if (c17965dM77177a == null) {
            return null;
        }
        return c17965dM77177a.m77184a();
    }

    /* JADX INFO: renamed from: a */
    private Map<String, String> m77025a(List<C17963b> list, GrsBaseInfo grsBaseInfo, String str) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
        concurrentHashMap.put("no_route_country", "no-country");
        for (C17963b c17963b : list) {
            if (c17963b.m77171a().contains(grsBaseInfo.getIssueCountry())) {
                concurrentHashMap.put(grsBaseInfo.getIssueCountry(), c17963b.m77174b());
            }
            if (c17963b.m77171a().contains(grsBaseInfo.getRegCountry())) {
                concurrentHashMap.put(grsBaseInfo.getRegCountry(), c17963b.m77174b());
            }
            if (c17963b.m77171a().contains(grsBaseInfo.getSerCountry())) {
                concurrentHashMap.put(grsBaseInfo.getSerCountry(), c17963b.m77174b());
            }
            if (c17963b.m77171a().contains(str)) {
                Logger.m76965v("AbstractLocalManager", "get countryGroupID from geoIp");
                concurrentHashMap.put(str, c17963b.m77174b());
            }
        }
        return concurrentHashMap;
    }

    /* JADX INFO: renamed from: a */
    public void m77034a() {
        C17962a c17962a = this.f53659a;
        if (c17962a != null) {
            c17962a.m77166a();
            this.f53664f = true;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m77035a(Context context, List<String> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (String str : list) {
            if (Pattern.matches("^grs_sdk_global_route_config_[a-zA-Z]+\\.json$", str)) {
                Object[] objArr = {str};
                if (m77028g(C17957c.m77155a(GrsApp.getInstance().getBrand("/") + str, context)) == 0) {
                    Logger.m76964i("AbstractLocalManager", "load SDK_CONFIG_FILE: %s, sucess.", objArr);
                } else {
                    Logger.m76964i("AbstractLocalManager", "load SDK_CONFIG_FILE: %s, failure.", objArr);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m77036a(GrsBaseInfo grsBaseInfo) {
        this.f53661c.put("no_route_country", "no-country");
        List<C17963b> list = this.f53660b;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (C17963b c17963b : this.f53660b) {
            if (c17963b.m77171a().contains(grsBaseInfo.getIssueCountry())) {
                this.f53661c.put(grsBaseInfo.getIssueCountry(), c17963b.m77174b());
            }
            if (c17963b.m77171a().contains(grsBaseInfo.getRegCountry())) {
                this.f53661c.put(grsBaseInfo.getRegCountry(), c17963b.m77174b());
            }
            if (c17963b.m77171a().contains(grsBaseInfo.getSerCountry())) {
                this.f53661c.put(grsBaseInfo.getSerCountry(), c17963b.m77174b());
            }
        }
        this.f53660b = null;
    }
}

package com.huawei.hms.framework.network.grs.p578f;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.local.model.C17962a;
import com.huawei.hms.framework.network.grs.local.model.C17963b;
import com.huawei.hms.framework.network.grs.local.model.C17964c;
import com.huawei.hms.framework.network.grs.local.model.C17965d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.huawei.hms.framework.network.grs.f.c */
/* JADX INFO: loaded from: classes7.dex */
public class C17938c extends AbstractC17936a {
    public C17938c(Context context, boolean z) {
        this.f53663e = z;
        if (m77030a("grs_sdk_global_route_config.json", context) == 0) {
            this.f53662d = true;
        }
    }

    @Override // com.huawei.hms.framework.network.grs.p578f.AbstractC17936a
    /* JADX INFO: renamed from: a */
    public int mo77029a(String str) {
        this.f53659a = new C17962a();
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("application");
            String string = jSONObject.getString("name");
            long j = jSONObject.getLong("cacheControl");
            JSONArray jSONArray = jSONObject.getJSONArray("services");
            this.f53659a.m77170b(string);
            this.f53659a.m77167a(j);
            if (jSONArray != null) {
                if (jSONArray.length() != 0) {
                    return 0;
                }
            }
            return -1;
        } catch (JSONException e) {
            Logger.m76969w("LocalManagerV1", "parse appbean failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e.getMessage()));
            return -1;
        }
    }

    @Override // com.huawei.hms.framework.network.grs.p578f.AbstractC17936a
    /* JADX INFO: renamed from: b */
    public int mo77037b(String str) {
        JSONObject jSONObject;
        this.f53660b = new ArrayList(16);
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            if (jSONObject2.has("countryOrAreaGroups")) {
                jSONObject = jSONObject2.getJSONObject("countryOrAreaGroups");
            } else if (jSONObject2.has("countryGroups")) {
                jSONObject = jSONObject2.getJSONObject("countryGroups");
            } else {
                Logger.m76960e("LocalManagerV1", "maybe local config json is wrong because the default countryOrAreaGroups isn't config.");
                jSONObject = null;
            }
            if (jSONObject == null) {
                return -1;
            }
            if (jSONObject.length() == 0) {
                return 0;
            }
            this.f53660b.addAll(m77054a(jSONObject));
            return 0;
        } catch (JSONException e) {
            Logger.m76969w("LocalManagerV1", "parse countrygroup failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e.getMessage()));
            return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x010d A[Catch: JSONException -> 0x0072, TryCatch #0 {JSONException -> 0x0072, blocks: (B:3:0x000c, B:4:0x001d, B:6:0x0024, B:8:0x003a, B:10:0x0043, B:11:0x0056, B:13:0x005c, B:15:0x006d, B:23:0x0087, B:24:0x009d, B:26:0x00a3, B:28:0x00b7, B:30:0x00bd, B:32:0x00ce, B:18:0x0075, B:20:0x007b, B:21:0x0080, B:33:0x00e2, B:35:0x00ed, B:39:0x00fc, B:41:0x0106, B:43:0x010d, B:44:0x0114, B:36:0x00f2, B:38:0x00f8, B:40:0x0101), top: B:49:0x000c }] */
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
    @Override // com.huawei.hms.framework.network.grs.p578f.AbstractC17936a
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int mo77044e(String str) {
        JSONObject jSONObject;
        String string;
        String str2 = "countryGroup";
        String str3 = "countryOrAreaGroup";
        try {
            JSONObject jSONObject2 = new JSONObject(str).getJSONObject("services");
            Iterator<String> itKeys = jSONObject2.keys();
            while (true) {
                int i = 0;
                if (!itKeys.hasNext()) {
                    return 0;
                }
                String next = itKeys.next();
                C17964c c17964c = new C17964c();
                c17964c.m77182b(next);
                if (!this.f53665g.contains(next)) {
                    this.f53665g.add(next);
                    if (this.f53663e) {
                        JSONObject jSONObject3 = jSONObject2.getJSONObject(next);
                        c17964c.m77183c(jSONObject3.getString("routeBy"));
                        JSONArray jSONArray = jSONObject3.getJSONArray("servings");
                        while (i < jSONArray.length()) {
                            JSONObject jSONObject4 = (JSONObject) jSONArray.get(i);
                            C17965d c17965d = new C17965d();
                            if (jSONObject4.has(str3)) {
                                string = jSONObject4.getString(str3);
                            } else if (jSONObject4.has(str2)) {
                                string = jSONObject4.getString(str2);
                            } else {
                                Logger.m76965v("LocalManagerV1", "maybe this service routeBy is unconditional.");
                                string = "no-country";
                            }
                            c17965d.m77185a(string);
                            JSONObject jSONObject5 = jSONObject4.getJSONObject("addresses");
                            String str4 = str2;
                            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
                            Iterator<String> itKeys2 = jSONObject5.keys();
                            while (itKeys2.hasNext()) {
                                Iterator<String> it = itKeys2;
                                String next2 = itKeys2.next();
                                String string2 = jSONObject5.getString(next2);
                                if (TextUtils.isEmpty(next2) || TextUtils.isEmpty(string2)) {
                                    itKeys2 = it;
                                } else {
                                    concurrentHashMap.put(next2, jSONObject5.getString(next2));
                                    itKeys2 = it;
                                    str3 = str3;
                                }
                            }
                            c17965d.m77186a(concurrentHashMap);
                            c17964c.m77179a(c17965d.m77187b(), c17965d);
                            i++;
                            str2 = str4;
                            str3 = str3;
                        }
                        String str5 = str2;
                        String str6 = str3;
                        List<C17963b> listM77055a = null;
                        if (jSONObject3.has("countryOrAreaGroups")) {
                            jSONObject = jSONObject3.getJSONObject("countryOrAreaGroups");
                        } else if (jSONObject3.has("countryGroups")) {
                            jSONObject = jSONObject3.getJSONObject("countryGroups");
                        } else {
                            Logger.m76965v("LocalManagerV1", "service use default countryOrAreaGroup");
                            c17964c.m77180a(listM77055a);
                            if (this.f53659a == null) {
                                this.f53659a = new C17962a();
                            }
                            this.f53659a.m77168a(next, c17964c);
                            str2 = str5;
                            str3 = str6;
                        }
                        listM77055a = m77055a((JSONArray) null, jSONObject);
                        c17964c.m77180a(listM77055a);
                        if (this.f53659a == null) {
                        }
                        this.f53659a.m77168a(next, c17964c);
                        str2 = str5;
                        str3 = str6;
                    }
                }
            }
        } catch (JSONException e) {
            Logger.m76969w("LocalManagerV1", "parse 1.0 services failed maybe because of json style.please check! %s", StringUtils.anonymizeMessage(e.getMessage()));
            return -1;
        }
    }

    /* JADX INFO: renamed from: a */
    public List<C17963b> m77055a(JSONArray jSONArray, JSONObject jSONObject) {
        return (jSONObject == null || jSONObject.length() == 0) ? new ArrayList() : m77054a(jSONObject);
    }

    /* JADX INFO: renamed from: a */
    private List<C17963b> m77054a(JSONObject jSONObject) {
        JSONArray jSONArray;
        try {
            ArrayList arrayList = new ArrayList(16);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                C17963b c17963b = new C17963b();
                c17963b.m77175b(next);
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                c17963b.m77176c(jSONObject2.getString("name"));
                c17963b.m77172a(jSONObject2.getString("description"));
                if (jSONObject2.has("countriesOrAreas")) {
                    jSONArray = jSONObject2.getJSONArray("countriesOrAreas");
                } else if (jSONObject2.has("countries")) {
                    jSONArray = jSONObject2.getJSONArray("countries");
                } else {
                    Logger.m76967w("LocalManagerV1", "current country or area group has not config countries or areas.");
                    jSONArray = null;
                }
                HashSet hashSet = new HashSet(16);
                if (jSONArray != null && jSONArray.length() != 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        hashSet.add((String) jSONArray.get(i));
                    }
                    c17963b.m77173a(hashSet);
                    arrayList.add(c17963b);
                }
                return new ArrayList();
            }
            return arrayList;
        } catch (JSONException e) {
            Logger.m76969w("LocalManagerV1", "parse countryGroups failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e.getMessage()));
            return new ArrayList();
        }
    }
}

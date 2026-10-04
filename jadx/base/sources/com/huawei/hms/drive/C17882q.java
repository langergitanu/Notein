package com.huawei.hms.drive;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.drive.C17884s;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.PLSharedPreferences;
import com.huawei.hms.network.embedded.C18252l2;
import com.huawei.hms.network.embedded.C18385v2;
import com.huawei.hms.network.embedded.C18437z2;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.huawei.hms.drive.q */
/* JADX INFO: loaded from: classes6.dex */
public class C17882q {
    /* JADX INFO: renamed from: a */
    public static C17884s m76837a(C17884s c17884s, String str) {
        if (TextUtils.isEmpty(str)) {
            return c17884s;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C17884s.a.C19116a().m76870b(str).m76869a());
        c17884s.m76857a(arrayList);
        return c17884s;
    }

    /* JADX INFO: renamed from: a */
    public static C17884s m76838a(String str) {
        String str2;
        int i;
        String str3;
        String str4 = C18385v2.f56336h;
        Logger.m76965v("DNKeeperCallable", "parseResponse: " + str);
        C17884s c17884s = new C17884s();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString(C18437z2.f56754h);
                c17884s.m76856a(string);
                JSONArray jSONArray = jSONObject.getJSONArray("addressList");
                c17884s.m76854a(jSONObject.getLong(C18252l2.f55571g));
                int length = jSONArray.length();
                int i2 = 0;
                while (i2 < length) {
                    JSONObject jSONObject2 = (JSONObject) jSONArray.get(i2);
                    String string2 = jSONObject2.getString("value");
                    if (TextUtils.isEmpty(string2)) {
                        str2 = str4;
                        i = length;
                        str3 = string;
                    } else if (C18385v2.f56342n.equals(string)) {
                        c17884s.m76856a(str4);
                        try {
                            InetAddress[] allByName = InetAddress.getAllByName(string2);
                            int length2 = allByName.length;
                            int i3 = 0;
                            while (i3 < length2) {
                                InetAddress inetAddress = allByName[i3];
                                str2 = str4;
                                try {
                                    i = length;
                                    str3 = string;
                                    try {
                                        c17884s.m76855a(new C17884s.a.C19116a().m76870b(inetAddress.getHostAddress()).m76867a(jSONObject2.getLong("ttl") * 1000).m76868a(inetAddress instanceof Inet4Address ? str2 : C18385v2.f56337i).m76869a());
                                        i3++;
                                        string = str3;
                                        str4 = str2;
                                        length = i;
                                    } catch (IllegalArgumentException e) {
                                        e = e;
                                        Logger.m76968w("DNKeeperCallable", "DNKeeperManager parseResponse failed, Exception: " + string2, e);
                                        i2++;
                                        string = str3;
                                        str4 = str2;
                                        length = i;
                                    } catch (NullPointerException e2) {
                                        e = e2;
                                        Logger.m76968w("DNKeeperCallable", "DNKeeperManager parseResponse failed, Exception: " + string2, e);
                                        i2++;
                                        string = str3;
                                        str4 = str2;
                                        length = i;
                                    } catch (UnknownHostException unused) {
                                        Logger.m76967w("DNKeeperCallable", "DNKeeperManager parseResponse failed,UnknownHostException:" + string2);
                                        i2++;
                                        string = str3;
                                        str4 = str2;
                                        length = i;
                                    }
                                } catch (IllegalArgumentException e3) {
                                    e = e3;
                                    i = length;
                                    str3 = string;
                                    Logger.m76968w("DNKeeperCallable", "DNKeeperManager parseResponse failed, Exception: " + string2, e);
                                    i2++;
                                    string = str3;
                                    str4 = str2;
                                    length = i;
                                } catch (NullPointerException e4) {
                                    e = e4;
                                    i = length;
                                    str3 = string;
                                    Logger.m76968w("DNKeeperCallable", "DNKeeperManager parseResponse failed, Exception: " + string2, e);
                                    i2++;
                                    string = str3;
                                    str4 = str2;
                                    length = i;
                                } catch (UnknownHostException unused2) {
                                    i = length;
                                    str3 = string;
                                    Logger.m76967w("DNKeeperCallable", "DNKeeperManager parseResponse failed,UnknownHostException:" + string2);
                                    i2++;
                                    string = str3;
                                    str4 = str2;
                                    length = i;
                                }
                            }
                            str2 = str4;
                            i = length;
                            str3 = string;
                        } catch (IllegalArgumentException e5) {
                            e = e5;
                            str2 = str4;
                            i = length;
                            str3 = string;
                            Logger.m76968w("DNKeeperCallable", "DNKeeperManager parseResponse failed, Exception: " + string2, e);
                            i2++;
                            string = str3;
                            str4 = str2;
                            length = i;
                        } catch (NullPointerException e6) {
                            e = e6;
                            str2 = str4;
                            i = length;
                            str3 = string;
                            Logger.m76968w("DNKeeperCallable", "DNKeeperManager parseResponse failed, Exception: " + string2, e);
                            i2++;
                            string = str3;
                            str4 = str2;
                            length = i;
                        } catch (UnknownHostException unused3) {
                            str2 = str4;
                        }
                    } else {
                        str2 = str4;
                        i = length;
                        str3 = string;
                        c17884s.m76855a(new C17884s.a.C19116a().m76870b(string2).m76868a(jSONObject2.getString(C18437z2.f56754h)).m76867a(jSONObject2.getLong("ttl") * 1000).m76869a());
                    }
                    i2++;
                    string = str3;
                    str4 = str2;
                    length = i;
                }
            } catch (JSONException e7) {
                Logger.m76968w("DNKeeperCallable", "parseResponse", e7);
                return c17884s;
            }
        }
        return c17884s;
    }

    /* JADX INFO: renamed from: a */
    public static String m76839a(C17878m c17878m) {
        Context appContext = ContextHolder.getAppContext();
        if (c17878m == null) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        String strM76819b = c17878m.m76819b();
        if (TextUtils.isEmpty(strM76819b) && appContext != null) {
            strM76819b = appContext.getPackageName();
        }
        try {
            jSONObject.put("DomainName", c17878m.m76815a());
            jSONObject.put("ApkName", strM76819b);
            jSONObject.put("DnsFailType", c17878m.m76821c());
            jSONObject.put("FailIP", c17878m.m76822d());
            jSONObject.put("accelerate", c17878m.m76823e());
            return jSONObject.toString();
        } catch (JSONException e) {
            Logger.m76968w("DNKeeperCallable", "getRequestStr", e);
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m76840a(HashSet<C17878m> hashSet) {
        Context appContext = ContextHolder.getAppContext();
        if (hashSet == null) {
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        for (C17878m c17878m : hashSet) {
            JSONObject jSONObject = new JSONObject();
            String strM76819b = c17878m.m76819b();
            if (TextUtils.isEmpty(strM76819b) && appContext != null) {
                strM76819b = appContext.getPackageName();
            }
            try {
                jSONObject.put("DomainName", c17878m.m76815a());
                jSONObject.put("ApkName", strM76819b);
                jSONObject.put("DnsFailType", c17878m.m76821c());
                jSONObject.put("FailIP", c17878m.m76822d());
                jSONObject.put("accelerate", c17878m.m76823e());
                jSONArray.put(jSONObject);
                Logger.m76965v("DNKeeperCallable", "jsonObject  : " + jSONObject.toString());
            } catch (JSONException e) {
                Logger.m76959d("DNKeeperCallable", "getRequestStr :", e);
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("queryInfos", jSONArray);
        } catch (JSONException e2) {
            Logger.m76969w("DNKeeperCallable", "getRequestStr :", e2.getClass().getSimpleName());
        }
        return jSONObject2.toString();
    }

    /* JADX INFO: renamed from: a */
    public static void m76841a(JSONArray jSONArray, int i, String str, String str2, long j) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C18437z2.f56754h, str);
            jSONObject.put("value", str2);
            jSONObject.put("ttl", j);
            jSONArray.put(i, jSONObject);
        } catch (JSONException e) {
            Logger.m76968w("DNKeeperCallable", "JSONException", e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m76842a(C17884s c17884s) {
        return c17884s == null || c17884s.m76859c();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m76843a(PLSharedPreferences pLSharedPreferences, String str) {
        if (pLSharedPreferences == null) {
            return true;
        }
        C17884s c17884sM76838a = m76838a(pLSharedPreferences.getString(str));
        if (!m76842a(c17884sM76838a)) {
            if (System.currentTimeMillis() - c17884sM76838a.m76858b() < 604800000) {
                return false;
            }
        }
        return true;
    }
}

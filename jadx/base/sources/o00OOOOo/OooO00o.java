package o00OOOOo;

import Oooo0oO.o0Oo0oo;
import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import o00OOOoO.C25016OooO00o;
import o00Oo00o.C25039OooO0OO;
import o00Oo00o.C25040OooO0Oo;
import o00Oo0o0.C25047OooO00o;
import o00Oo0oO.C25052OooO0Oo;
import o00Oo0oO.OooOO0O;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: o00OOOOo.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C19664OooO00o {
        public static synchronized C19665OooO00o OooO00o(Context context) {
            try {
                String strOooO0O0 = OooOO0O.OooO0O0(context, "alipay_cashier_statistic_record", null, null);
                if (TextUtils.isEmpty(strOooO0O0)) {
                    return new C19665OooO00o();
                }
                return new C19665OooO00o(strOooO0O0);
            } catch (Throwable th) {
                C25052OooO0Oo.OooO00o(th);
                return new C19665OooO00o();
            }
        }

        public static synchronized void OooO0O0(Context context, String str) {
            if (context != null) {
                if (!TextUtils.isEmpty(str)) {
                    C19665OooO00o c19665OooO00oOooO00o = OooO00o(context);
                    if (c19665OooO00oOooO00o.f84885OooO00o.isEmpty()) {
                        return;
                    }
                    try {
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry<String, String> entry : c19665OooO00oOooO00o.f84885OooO00o.entrySet()) {
                            if (str.equals(entry.getValue())) {
                                arrayList.add(entry.getKey());
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            c19665OooO00oOooO00o.f84885OooO00o.remove((String) it.next());
                        }
                        OooO0Oo(context, c19665OooO00oOooO00o);
                        arrayList.size();
                    } catch (Throwable th) {
                        C25052OooO0Oo.OooO00o(th);
                        c19665OooO00oOooO00o.f84885OooO00o.size();
                        OooO0Oo(context, new C19665OooO00o());
                    }
                }
            }
        }

        public static synchronized void OooO0OO(Context context, String str, String str2) {
            if (context != null) {
                try {
                    if (!TextUtils.isEmpty(str)) {
                        if (TextUtils.isEmpty(str2)) {
                            str2 = UUID.randomUUID().toString();
                        }
                        C19665OooO00o c19665OooO00oOooO00o = OooO00o(context);
                        if (c19665OooO00oOooO00o.f84885OooO00o.size() > 20) {
                            c19665OooO00oOooO00o.f84885OooO00o.clear();
                        }
                        c19665OooO00oOooO00o.f84885OooO00o.put(str2, str);
                        OooO0Oo(context, c19665OooO00oOooO00o);
                    }
                } finally {
                }
            }
        }

        public static synchronized void OooO0Oo(Context context, C19665OooO00o c19665OooO00o) {
            try {
                OooOO0O.OooO0OO(context, "alipay_cashier_statistic_record", c19665OooO00o.OooO00o(), null);
            } finally {
            }
        }

        /* JADX INFO: renamed from: o00OOOOo.OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C19665OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final LinkedHashMap<String, String> f84885OooO00o = new LinkedHashMap<>();

            public C19665OooO00o() {
            }

            public final String OooO00o() {
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry<String, String> entry : this.f84885OooO00o.entrySet()) {
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.put(entry.getKey()).put(entry.getValue());
                        jSONArray.put(jSONArray2);
                    }
                    return jSONArray.toString();
                } catch (Throwable th) {
                    C25052OooO0Oo.OooO00o(th);
                    return new JSONArray().toString();
                }
            }

            public C19665OooO00o(String str) {
                try {
                    JSONArray jSONArray = new JSONArray(str);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONArray jSONArray2 = jSONArray.getJSONArray(i);
                        this.f84885OooO00o.put(jSONArray2.getString(0), jSONArray2.getString(1));
                    }
                } catch (Throwable th) {
                    C25052OooO0Oo.OooO00o(th);
                }
            }
        }
    }

    public static final class OooO0O0 {
        public static synchronized void OooO00o(Context context, o00OOOOo.OooO0OO oooO0OO, String str, String str2) {
            if (context == null || oooO0OO == null || str == null) {
                return;
            }
            String strOooO0O0 = oooO0OO.OooO0O0(str);
            synchronized (OooO0O0.class) {
                try {
                    if (!TextUtils.isEmpty(strOooO0O0)) {
                        C19664OooO00o.OooO0OO(context, strOooO0O0, str2);
                    }
                    new Thread(new o00OOOOo.OooO0O0(strOooO0O0, context)).start();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public static boolean OooO0O0(Context context, String str) {
            synchronized (OooO0O0.class) {
                try {
                    try {
                        if ((C25016OooO00o.OooO00o().f84914OooO0oo ? new C25039OooO0OO() : new C25040OooO0Oo()).OooO0o0(context, str, null) == null) {
                            return false;
                        }
                        C19664OooO00o.OooO0O0(context, str);
                        return true;
                    } catch (Throwable th) {
                        C25052OooO0Oo.OooO00o(th);
                        return false;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static final class OooO0OO {
    }

    /* JADX INFO: renamed from: o00OOOOo.OooO00o$OooO0Oo, reason: case insensitive filesystem */
    public static final class C25010OooO0Oo {
        public static synchronized long OooO00o(Context context, String str) {
            long j;
            String strOooO0O0;
            try {
                strOooO0O0 = OooOO0O.OooO0O0(context, str, null, null);
            } catch (Throwable unused) {
            }
            j = (!TextUtils.isEmpty(strOooO0O0) ? Long.parseLong(strOooO0O0) : 0L) + 1;
            try {
                OooOO0O.OooO0OO(context, str, Long.toString(j), null);
            } catch (Throwable unused2) {
            }
            return j;
        }
    }

    /* JADX INFO: renamed from: o00OOOOo.OooO00o$OooO0o0, reason: case insensitive filesystem */
    public static final class C25011OooO0o0 {
    }

    public static synchronized void OooO00o(Context context, String str, String str2, C25047OooO00o c25047OooO00o) {
        if (context == null || c25047OooO00o == null) {
            return;
        }
        try {
            C19664OooO00o.OooO0OO(context, c25047OooO00o.f85043OooOO0o.OooO0O0(str), str2);
        } finally {
        }
    }

    public static void OooO0O0(String str, C25047OooO00o c25047OooO00o) {
        if (c25047OooO00o == null) {
            return;
        }
        c25047OooO00o.f85043OooOO0o.OooO0o0("biz", str);
    }

    public static void OooO0OO(C25047OooO00o c25047OooO00o, String str, String str2, String str3) {
        if (c25047OooO00o == null) {
            return;
        }
        o00OOOOo.OooO0OO oooO0OO = c25047OooO00o.f85043OooOO0o;
        oooO0OO.getClass();
        oooO0OO.OooO0o0(str, str2 + "|" + str3);
    }

    public static void OooO0Oo(C25047OooO00o c25047OooO00o, String str, String str2, Throwable th) {
        if (c25047OooO00o == null) {
            return;
        }
        o00OOOOo.OooO0OO oooO0OO = c25047OooO00o.f85043OooOO0o;
        oooO0OO.getClass();
        oooO0OO.OooO0o(str, str2, o00OOOOo.OooO0OO.OooO0OO(th));
    }

    public static synchronized void OooO0o(Context context, String str, String str2, C25047OooO00o c25047OooO00o) {
        if (context == null || c25047OooO00o == null) {
            return;
        }
        OooO0O0.OooO00o(context, c25047OooO00o.f85043OooOO0o, str, str2);
    }

    public static void OooO0o0(C25047OooO00o c25047OooO00o, String str, Throwable th, String str2) {
        if (c25047OooO00o == null) {
            return;
        }
        o00OOOOo.OooO0OO oooO0OO = c25047OooO00o.f85043OooOO0o;
        oooO0OO.getClass();
        oooO0OO.OooO0o("biz", str, o0Oo0oo.OooO0Oo(str2, ": ", o00OOOOo.OooO0OO.OooO0OO(th)));
    }

    public static void OooO0oO(C25047OooO00o c25047OooO00o, String str, String str2, String str3) {
        if (c25047OooO00o == null) {
            return;
        }
        c25047OooO00o.f85043OooOO0o.OooO0o(str, str2, str3);
    }
}

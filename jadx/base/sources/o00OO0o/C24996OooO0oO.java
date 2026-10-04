package o00OO0o;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.Iterator;
import kotlin.jvm.internal.OooOOO0;
import o00Oo0oO.C25052OooO0Oo;
import oO0O00oo.C32520OooO0oo;
import oO0O00oo.OooO;
import oO0OooO0.C33479OooO0o;
import oO0o0O0o.C33595OooOOo;
import oO0o0O0o.C33599OooOo0O;

/* JADX INFO: renamed from: o00OO0o.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24996OooO0oO implements o00OO0OO.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f84809OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f84810OooO0O0 = 0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final /* synthetic */ int f84811OooO0OO = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ int f84812OooO0Oo = 0;

    public static C33479OooO0o OooO00o(C33479OooO0o c33479OooO0o, String str, String str2, int i) {
        char cCharAt;
        char cCharAt2;
        Integer next;
        boolean z = (i & 4) != 0;
        if ((i & 8) != 0) {
            str2 = null;
        }
        if (!c33479OooO0o.f120980OooOo) {
            String strOooO0OO = c33479OooO0o.OooO0OO();
            if (C33595OooOOo.OooOoO0(strOooO0OO, str, false) && strOooO0OO.length() != str.length() && ('a' > (cCharAt = strOooO0OO.charAt(str.length())) || cCharAt >= '{')) {
                if (str2 != null) {
                    return C33479OooO0o.OooO0o0(str2.concat(C33599OooOo0O.OoooO0(strOooO0OO, str)));
                }
                if (!z) {
                    return c33479OooO0o;
                }
                String strOoooO0 = C33599OooOo0O.OoooO0(strOooO0OO, str);
                if (strOoooO0.length() != 0 && C25052OooO0Oo.OooO0o0(0, strOoooO0)) {
                    if (strOoooO0.length() != 1 && C25052OooO0Oo.OooO0o0(1, strOoooO0)) {
                        Iterator<Integer> it = new OooO(0, strOoooO0.length() - 1, 1).iterator();
                        while (true) {
                            if (!((C32520OooO0oo) it).f116817OooOoO0) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            if (!C25052OooO0Oo.OooO0o0(next.intValue(), strOoooO0)) {
                                break;
                            }
                        }
                        Integer num = next;
                        if (num != null) {
                            int iIntValue = num.intValue() - 1;
                            String strSubstring = strOoooO0.substring(0, iIntValue);
                            OooOOO0.OooO0o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                            String strOooO0o = C25052OooO0Oo.OooO0o(strSubstring);
                            String strSubstring2 = strOoooO0.substring(iIntValue);
                            OooOOO0.OooO0o(strSubstring2, "this as java.lang.String).substring(startIndex)");
                            strOoooO0 = strOooO0o.concat(strSubstring2);
                        } else {
                            strOoooO0 = C25052OooO0Oo.OooO0o(strOoooO0);
                        }
                    } else if (strOoooO0.length() != 0 && 'A' <= (cCharAt2 = strOoooO0.charAt(0)) && cCharAt2 < '[') {
                        char lowerCase = Character.toLowerCase(cCharAt2);
                        String strSubstring3 = strOoooO0.substring(1);
                        OooOOO0.OooO0o(strSubstring3, "this as java.lang.String).substring(startIndex)");
                        strOoooO0 = lowerCase + strSubstring3;
                    }
                }
                if (C33479OooO0o.OooO0o(strOoooO0)) {
                    return C33479OooO0o.OooO0o0(strOoooO0);
                }
            }
        }
        return null;
    }

    @Override // o00OO0OO.OooO00o
    /* JADX INFO: renamed from: a */
    public String mo1a(Context context) {
        Object obj;
        Method method;
        if (context == null) {
            return null;
        }
        if (((o00OOOO.OooO00o.f84878OooO0O0 == null || o00OOOO.OooO00o.f84877OooO00o == null) ? false : true) && (obj = o00OOOO.OooO00o.f84877OooO00o) != null && (method = o00OOOO.OooO00o.f84879OooO0OO) != null) {
            try {
                Object objInvoke = method.invoke(obj, context);
                if (objInvoke != null) {
                    return (String) objInvoke;
                }
            } catch (Exception e) {
                Log.e("IdentifierManager", "invoke exception!", e);
            }
        }
        return null;
    }
}

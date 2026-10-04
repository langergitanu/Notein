package ooo0o;

import Oooo0oO.C21111o0ooOoO;
import oO00ooO.C32442OooOO0o;
import oO0Oo0.EnumC33191OooO0Oo;
import oO0o0O0o.C33599OooOo0O;
import ooo0o.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOOO {
    public static OooOOO0 OooO00o(String representation) {
        EnumC33191OooO0Oo enumC33191OooO0Oo;
        kotlin.jvm.internal.OooOOO0.OooO0oO(representation, "representation");
        char cCharAt = representation.charAt(0);
        EnumC33191OooO0Oo[] enumC33191OooO0OoArrValues = EnumC33191OooO0Oo.values();
        int length = enumC33191OooO0OoArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                enumC33191OooO0Oo = null;
                break;
            }
            enumC33191OooO0Oo = enumC33191OooO0OoArrValues[i];
            if (enumC33191OooO0Oo.OooO0OO().charAt(0) == cCharAt) {
                break;
            }
            i++;
        }
        if (enumC33191OooO0Oo != null) {
            return new OooOOO0.OooO0OO(enumC33191OooO0Oo);
        }
        if (cCharAt == 'V') {
            return new OooOOO0.OooO0OO(null);
        }
        if (cCharAt == '[') {
            String strSubstring = representation.substring(1);
            kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring, "this as java.lang.String).substring(startIndex)");
            return new OooOOO0.OooO00o(OooO00o(strSubstring));
        }
        if (cCharAt == 'L') {
            C33599OooOo0O.OooOooo(representation, ';');
        }
        String strSubstring2 = representation.substring(1, representation.length() - 1);
        kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
        return new OooOOO0.OooO0O0(strSubstring2);
    }

    public static String OooO0O0(OooOOO0 type) {
        String strOooO0OO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(type, "type");
        if (type instanceof OooOOO0.OooO00o) {
            return "[" + OooO0O0(((OooOOO0.OooO00o) type).f126378OooO);
        }
        if (type instanceof OooOOO0.OooO0OO) {
            EnumC33191OooO0Oo enumC33191OooO0Oo = ((OooOOO0.OooO0OO) type).f126380OooO;
            return (enumC33191OooO0Oo == null || (strOooO0OO = enumC33191OooO0Oo.OooO0OO()) == null) ? "V" : strOooO0OO;
        }
        if (type instanceof OooOOO0.OooO0O0) {
            return C21111o0ooOoO.OooO0OO(((OooOOO0.OooO0O0) type).f126379OooO, ';', new StringBuilder("L"));
        }
        throw new C32442OooOO0o();
    }
}

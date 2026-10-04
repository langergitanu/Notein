package oO0OOo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oO0O0Oo0.C32692Oooo0o0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO f119479OooO00o = new OooO();

    public final C33033OooO0O0 OooO00o(List list, C32692Oooo0o0 c32692Oooo0o0, oO0O0O0o.OooOO0O oooOO0O) {
        List listO0ooOO0 = oOo000Oo.OooOo.o0ooOO0(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = listO0ooOO0.iterator();
        while (it.hasNext()) {
            AbstractC33038OooO0oO abstractC33038OooO0oOOooO0O0 = OooO0O0(it.next(), null);
            if (abstractC33038OooO0oOOooO0O0 != null) {
                arrayList.add(abstractC33038OooO0oOOooO0O0);
            }
        }
        return c32692Oooo0o0 != null ? new OooOo(arrayList, c32692Oooo0o0.f117524OooOoO.OooOOOo(oooOO0O)) : new C33033OooO0O0(arrayList, new C33039OooO0oo(oooOO0O));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [oOo000Oo.OooOoO] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [oO0OOo.OooO] */
    public final AbstractC33038OooO0oO OooO0O0(Object obj, C32692Oooo0o0 c32692Oooo0o0) {
        if (obj instanceof Byte) {
            return new C33035OooO0Oo(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new C33046OooOo0O(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new OooOOO(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new OooOo00(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            Character ch = (Character) obj;
            ch.getClass();
            return new C33037OooO0o0(ch);
        }
        if (obj instanceof Float) {
            return new OooOOO0(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new OooOO0(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            Boolean bool = (Boolean) obj;
            bool.getClass();
            return new C33034OooO0OO(bool);
        }
        if (obj instanceof String) {
            String value = (String) obj;
            kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
            return new C33047OooOo0o(value);
        }
        if (obj instanceof byte[]) {
            return OooO00o(oOo000Oo.OooOOO.OoooO00((byte[]) obj), c32692Oooo0o0, oO0O0O0o.OooOO0O.BYTE);
        }
        if (obj instanceof short[]) {
            return OooO00o(oOo000Oo.OooOOO.o000oOoO((short[]) obj), c32692Oooo0o0, oO0O0O0o.OooOO0O.SHORT);
        }
        boolean z = obj instanceof int[];
        ?? OooO0oO2 = C34434OooOoO.f123453OooOo0o;
        int i = 0;
        if (z) {
            int[] iArr = (int[]) obj;
            kotlin.jvm.internal.OooOOO0.OooO0oO(iArr, "<this>");
            int length = iArr.length;
            ?? OoooOOO2 = OooO0oO2;
            if (length != 0) {
                OoooOOO2 = length != 1 ? oOo000Oo.OooOOO.OoooOOO(iArr) : com.facebook.soloader.OooOo.OooO0oO(Integer.valueOf(iArr[0]));
            }
            return OooO00o(OoooOOO2, c32692Oooo0o0, oO0O0O0o.OooOO0O.INT);
        }
        if (obj instanceof long[]) {
            return OooO00o(oOo000Oo.OooOOO.OoooO((long[]) obj), c32692Oooo0o0, oO0O0O0o.OooOO0O.LONG);
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            kotlin.jvm.internal.OooOOO0.OooO0oO(cArr, "<this>");
            int length2 = cArr.length;
            if (length2 != 0) {
                if (length2 != 1) {
                    OooO0oO2 = new ArrayList(cArr.length);
                    int length3 = cArr.length;
                    while (i < length3) {
                        OooO0oO2.add(Character.valueOf(cArr[i]));
                        i++;
                    }
                } else {
                    OooO0oO2 = com.facebook.soloader.OooOo.OooO0oO(Character.valueOf(cArr[0]));
                }
            }
            return OooO00o(OooO0oO2, c32692Oooo0o0, oO0O0O0o.OooOO0O.CHAR);
        }
        if (obj instanceof float[]) {
            return OooO00o(oOo000Oo.OooOOO.OoooO0O((float[]) obj), c32692Oooo0o0, oO0O0O0o.OooOO0O.FLOAT);
        }
        if (obj instanceof double[]) {
            return OooO00o(oOo000Oo.OooOOO.OoooO0((double[]) obj), c32692Oooo0o0, oO0O0O0o.OooOO0O.DOUBLE);
        }
        if (!(obj instanceof boolean[])) {
            if (obj == null) {
                return new C33045OooOo0(null);
            }
            return null;
        }
        boolean[] zArr = (boolean[]) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(zArr, "<this>");
        int length4 = zArr.length;
        if (length4 != 0) {
            if (length4 != 1) {
                OooO0oO2 = new ArrayList(zArr.length);
                int length5 = zArr.length;
                while (i < length5) {
                    OooO0oO2.add(Boolean.valueOf(zArr[i]));
                    i++;
                }
            } else {
                OooO0oO2 = com.facebook.soloader.OooOo.OooO0oO(Boolean.valueOf(zArr[0]));
            }
        }
        return OooO00o(OooO0oO2, c32692Oooo0o0, oO0O0O0o.OooOO0O.BOOLEAN);
    }
}

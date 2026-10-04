package OooOoo0;

import OooooOO.C21368o0ooOoO;
import java.util.ArrayList;
import o00O0oo0.InterfaceC24962OooO0O0;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo00 implements InterfaceC24962OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f59295OooO00o = 0;

    public static final C20664OooOOoo OooO00o(float f, long j) {
        return new C20664OooOOoo(f, new C21368o0ooOoO(j));
    }

    public static void OooO0O0(Boolean bool) {
        if (!bool.booleanValue()) {
            throw new IllegalArgumentException();
        }
    }

    public static void OooO0OO(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void OooO0Oo(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(OooO0oO(str, objArr));
        }
    }

    public static void OooO0o(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void OooO0o0(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(str));
        }
    }

    public static String OooO0oO(String str, Object... objArr) {
        int iIndexOf;
        StringBuilder sb = new StringBuilder((objArr.length * 16) + str.length());
        int i = 0;
        int i2 = 0;
        while (i < objArr.length && (iIndexOf = str.indexOf("%s", i2)) != -1) {
            sb.append(str.substring(i2, iIndexOf));
            sb.append(objArr[i]);
            i2 = iIndexOf + 2;
            i++;
        }
        sb.append(str.substring(i2));
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i3 = i + 1; i3 < objArr.length; i3++) {
                sb.append(", ");
                sb.append(objArr[i3]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static final Object OooO0oo(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }
}

package OoooOOo;

import Oooo0.C20856OooooOo;
import Oooo0oO.o0Oo0oo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oO00O0o0.C32197OooOoOO;
import oO00O0o0.InterfaceC32195OooOoO;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;
import oOo00OoO.C34545OooOoO0;

/* JADX INFO: renamed from: OoooOOo.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21197OooOO0O {
    public static final int OooO00o(int[] iArr, int i) {
        int length = iArr.length - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) >>> 1;
            int i4 = iArr[i3];
            if (i > i4) {
                i2 = i3 + 1;
            } else {
                if (i >= i4) {
                    return i3;
                }
                length = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final void OooO0O0(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException((i != i2 ? C20856OooooOo.OooO0O0("Both size ", i, " and step ", " must be greater than zero.", i2) : o0Oo0oo.OooO0O0(i, "size ", " must be greater than zero.")).toString());
        }
    }

    public static final InterfaceC32195OooOoO OooO0OO(C32197OooOoOO c32197OooOoOO) {
        C32197OooOoOO c32197OooOoOO2 = new C32197OooOoOO();
        for (String str : c32197OooOoOO.f123698OooO00o.keySet()) {
            List<String> listOooO0o = c32197OooOoOO.OooO0o(str);
            if (listOooO0o == null) {
                listOooO0o = C34434OooOoO.f123453OooOo0o;
            }
            String strOooO0o0 = oO00O0o0.OooO0O0.OooO0o0(0, 0, 15, str);
            List<String> list = listOooO0o;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(oO00O0o0.OooO0O0.OooO0o0(0, 0, 11, (String) it.next()));
            }
            c32197OooOoOO2.OooO00o(strOooO0o0, arrayList);
        }
        return c32197OooOoOO2.OooO();
    }

    public static final boolean OooO0Oo(Throwable th) {
        Class<?> superclass = th.getClass();
        while (!kotlin.jvm.internal.OooOOO0.OooO0O0(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }

    public static final int OooO0o0(C34545OooOoO0 c34545OooOoO0, int i) {
        int i2;
        kotlin.jvm.internal.OooOOO0.OooO0oO(c34545OooOoO0, "<this>");
        int i3 = i + 1;
        int length = c34545OooOoO0.f123787OooOoOO.length;
        int[] iArr = c34545OooOoO0.f123788OooOoo0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(iArr, "<this>");
        int i4 = length - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= i4) {
                i2 = (i5 + i4) >>> 1;
                int i6 = iArr[i2];
                if (i6 >= i3) {
                    if (i6 <= i3) {
                        break;
                    }
                    i4 = i2 - 1;
                } else {
                    i5 = i2 + 1;
                }
            } else {
                i2 = (-i5) - 1;
                break;
            }
        }
        return i2 >= 0 ? i2 : ~i2;
    }
}

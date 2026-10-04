package oO0oO00;

import java.util.Arrays;
import oO0o.AbstractC33534OooOO0o;
import oO0o.InterfaceC33531OooO0o0;
import oOo00OO0.C34480OooO0Oo;
import oOo00OO0.C34483OooO0oo;

/* JADX INFO: loaded from: classes10.dex */
public final class o0ooOOo {
    public static final int OooO00o(C34480OooO0Oo c34480OooO0Oo, C34483OooO0oo c34483OooO0oo) {
        int i = c34483OooO0oo.f123570OooO00o;
        int i2 = c34483OooO0oo.f123571OooO0O0;
        if (i < i2 && !io.ktor.utils.p616io.Oooo000.OooO0o0(c34480OooO0Oo.charAt(i))) {
            do {
                i++;
                if (i >= i2) {
                    break;
                }
            } while (!io.ktor.utils.p616io.Oooo000.OooO0o0(c34480OooO0Oo.charAt(i)));
        }
        return i;
    }

    public static final int OooO0O0(InterfaceC33531OooO0o0 interfaceC33531OooO0o0, InterfaceC33531OooO0o0[] typeParams) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC33531OooO0o0, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(typeParams, "typeParams");
        int iHashCode = (interfaceC33531OooO0o0.OooO0oo().hashCode() * 31) + Arrays.hashCode(typeParams);
        int iOooO0o0 = interfaceC33531OooO0o0.OooO0o0();
        int i = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iOooO0o0 > 0)) {
                break;
            }
            int i2 = iOooO0o0 - 1;
            int i3 = i * 31;
            String strOooO0oo = interfaceC33531OooO0o0.OooO0Oo(interfaceC33531OooO0o0.OooO0o0() - iOooO0o0).OooO0oo();
            if (strOooO0oo != null) {
                iHashCode2 = strOooO0oo.hashCode();
            }
            i = i3 + iHashCode2;
            iOooO0o0 = i2;
        }
        int iOooO0o02 = interfaceC33531OooO0o0.OooO0o0();
        int iHashCode3 = 1;
        while (true) {
            if (!(iOooO0o02 > 0)) {
                return (((iHashCode * 31) + i) * 31) + iHashCode3;
            }
            int i4 = iOooO0o02 - 1;
            int i5 = iHashCode3 * 31;
            AbstractC33534OooOO0o kind = interfaceC33531OooO0o0.OooO0Oo(interfaceC33531OooO0o0.OooO0o0() - iOooO0o02).getKind();
            iHashCode3 = i5 + (kind != null ? kind.hashCode() : 0);
            iOooO0o02 = i4;
        }
    }

    public static final void OooO0OO(C34480OooO0Oo c34480OooO0Oo, C34483OooO0oo c34483OooO0oo) {
        int i = c34483OooO0oo.f123570OooO00o;
        int i2 = c34483OooO0oo.f123571OooO0O0;
        if (i >= i2 || !io.ktor.utils.p616io.Oooo000.OooO0o0(c34480OooO0Oo.charAt(i))) {
            return;
        }
        do {
            i++;
            if (i >= i2) {
                break;
            }
        } while (io.ktor.utils.p616io.Oooo000.OooO0o0(c34480OooO0Oo.charAt(i)));
        c34483OooO0oo.f123570OooO00o = i;
    }
}

package o0Oo0o00;

import oO0Ooo.AbstractC33316OooOo0o;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.AbstractC33354o00o0O;
import oO0Oooo.C33514OooO0o;

/* JADX INFO: loaded from: classes10.dex */
public final class o0OOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f100023OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f100024OooO0O0 = 0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final /* synthetic */ int f100025OooO0OO = 0;

    public static int OooO00o(int i) {
        int i2 = -1;
        while (i != 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    public static final boolean OooO0O0(AbstractC33320OooOoo abstractC33320OooOoo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(abstractC33320OooOoo, "<this>");
        AbstractC33354o00o0O abstractC33354o00o0OO00000OO = abstractC33320OooOoo.o00000OO();
        if (abstractC33354o00o0OO00000OO instanceof C33514OooO0o) {
            return true;
        }
        return (abstractC33354o00o0OO00000OO instanceof AbstractC33316OooOo0o) && (((AbstractC33316OooOo0o) abstractC33354o00o0OO00000OO).o00000oO() instanceof C33514OooO0o);
    }

    public static int OooO0OO(int i, int i2, int i3) {
        int iOooO0Oo = OooO0Oo(i, i3);
        int iOooO0Oo2 = OooO0Oo(i2, i3);
        int i4 = 0;
        if (iOooO0Oo2 != 0) {
            int iOooO00o = 1 << OooO00o(i3);
            while (iOooO0Oo != 0) {
                if (((byte) (iOooO0Oo & 1)) == 1) {
                    i4 ^= iOooO0Oo2;
                }
                iOooO0Oo >>>= 1;
                iOooO0Oo2 <<= 1;
                if (iOooO0Oo2 >= iOooO00o) {
                    iOooO0Oo2 ^= i3;
                }
            }
        }
        return i4;
    }

    public static int OooO0Oo(int i, int i2) {
        if (i2 == 0) {
            System.err.println("Error: to be divided by 0");
            return 0;
        }
        while (OooO00o(i) >= OooO00o(i2)) {
            i ^= i2 << (OooO00o(i) - OooO00o(i2));
        }
        return i;
    }
}

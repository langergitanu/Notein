package OooOooo;

import o0000Ooo.EnumC24238OooOOO;
import o0000Ooo.InterfaceC24229OooO0OO;

/* JADX INFO: renamed from: OooOooo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20745OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C20747OooO0o0 f59598OooO00o = new C20747OooO0o0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooO0o f59599OooO0O0 = new OooO0o();

    /* JADX INFO: renamed from: OooOooo.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C18973OooO00o {
        public final String toString() {
            return "Arrangement#Center";
        }
    }

    /* JADX INFO: renamed from: OooOooo.OooO00o$OooO0O0 */
    public static final class OooO0O0 {
        public final String toString() {
            return "Arrangement#SpaceAround";
        }
    }

    /* JADX INFO: renamed from: OooOooo.OooO00o$OooO0OO */
    public static final class OooO0OO {
        public final String toString() {
            return "Arrangement#SpaceBetween";
        }
    }

    /* JADX INFO: renamed from: OooOooo.OooO00o$OooO0Oo, reason: case insensitive filesystem */
    public static final class C20746OooO0Oo {
        public final String toString() {
            return "Arrangement#SpaceEvenly";
        }
    }

    /* JADX INFO: renamed from: OooOooo.OooO00o$OooO0o */
    public static final class OooO0o {
        public final void OooO00o(InterfaceC24229OooO0OO interfaceC24229OooO0OO, int i, int[] sizes, int[] iArr) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC24229OooO0OO, "<this>");
            kotlin.jvm.internal.OooOOO0.OooO0oO(sizes, "sizes");
            C20745OooO00o.OooO00o(false, sizes, iArr);
        }

        public final String toString() {
            return "Arrangement#Top";
        }
    }

    /* JADX INFO: renamed from: OooOooo.OooO00o$OooO0o0, reason: case insensitive filesystem */
    public static final class C20747OooO0o0 {
        public final void OooO00o(InterfaceC24229OooO0OO interfaceC24229OooO0OO, int i, int[] sizes, EnumC24238OooOOO layoutDirection, int[] iArr) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC24229OooO0OO, "<this>");
            kotlin.jvm.internal.OooOOO0.OooO0oO(sizes, "sizes");
            kotlin.jvm.internal.OooOOO0.OooO0oO(layoutDirection, "layoutDirection");
            if (layoutDirection == EnumC24238OooOOO.f81494OooOo0o) {
                C20745OooO00o.OooO00o(false, sizes, iArr);
            } else {
                C20745OooO00o.OooO0O0(i, sizes, iArr, true);
            }
        }

        public final String toString() {
            return "Arrangement#Start";
        }
    }

    public static void OooO00o(boolean z, int[] size, int[] iArr) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(size, "size");
        int i = 0;
        if (!z) {
            int length = size.length;
            int i2 = 0;
            int i3 = 0;
            while (i < length) {
                int i4 = size[i];
                iArr[i2] = i3;
                i3 += i4;
                i++;
                i2++;
            }
            return;
        }
        int length2 = size.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i5 = size[length2];
            iArr[length2] = i;
            i += i5;
        }
    }

    public static void OooO0O0(int i, int[] size, int[] iArr, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(size, "size");
        int i2 = 0;
        int i3 = 0;
        for (int i4 : size) {
            i3 += i4;
        }
        int i5 = i - i3;
        if (!z) {
            int length = size.length;
            int i6 = 0;
            while (i2 < length) {
                int i7 = size[i2];
                iArr[i6] = i5;
                i5 += i7;
                i2++;
                i6++;
            }
            return;
        }
        int length2 = size.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i8 = size[length2];
            iArr[length2] = i5;
            i5 += i8;
        }
    }
}

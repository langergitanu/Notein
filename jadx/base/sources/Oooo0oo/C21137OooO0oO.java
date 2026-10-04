package Oooo0oo;

import Oooo0oO.C21047OooOoo0;
import Oooo0oO.C21096o0000oO0;
import Oooo0oO.InterfaceC21026OooO0oO;
import Oooo0oO.o000000O;
import java.util.Arrays;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: Oooo0oo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21137OooO0oO extends AbstractC21138OooO0oo {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f61322OooO0O0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f61324OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f61325OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f61327OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f61328OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public AbstractC21116OooO0Oo[] f61321OooO00o = new AbstractC21116OooO0Oo[16];

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int[] f61323OooO0OO = new int[16];

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Object[] f61326OooO0o0 = new Object[16];

    /* JADX INFO: renamed from: Oooo0oo.OooO0oO$OooO00o */
    public final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f61329OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f61330OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f61331OooO0OO;

        public OooO00o() {
        }

        public final int OooO00o(int i) {
            return C21137OooO0oO.this.f61323OooO0OO[this.f61330OooO0O0 + i];
        }

        public final <T> T OooO0O0(int i) {
            return (T) C21137OooO0oO.this.f61326OooO0o0[this.f61331OooO0OO + i];
        }
    }

    /* JADX INFO: renamed from: Oooo0oo.OooO0oO$OooO0O0 */
    public static final class OooO0O0 {
        public static final void OooO00o(C21137OooO0oO c21137OooO0oO, int i, int i2) {
            int i3 = 1 << i;
            int i4 = c21137OooO0oO.f61327OooO0oO;
            if ((i4 & i3) == 0) {
                c21137OooO0oO.f61327OooO0oO = i3 | i4;
                c21137OooO0oO.f61323OooO0OO[(c21137OooO0oO.f61324OooO0Oo - c21137OooO0oO.o00Oo0().f61285OooO00o) + i] = i2;
            } else {
                o000000O.OooO0OO("Already pushed argument " + c21137OooO0oO.o00Oo0().OooO0O0(i));
                throw null;
            }
        }

        public static final <T> void OooO0O0(C21137OooO0oO c21137OooO0oO, int i, T t) {
            int i2 = 1 << i;
            int i3 = c21137OooO0oO.f61328OooO0oo;
            if ((i3 & i2) == 0) {
                c21137OooO0oO.f61328OooO0oo = i2 | i3;
                c21137OooO0oO.f61326OooO0o0[(c21137OooO0oO.f61325OooO0o - c21137OooO0oO.o00Oo0().f61286OooO0O0) + i] = t;
            } else {
                o000000O.OooO0OO("Already pushed argument " + c21137OooO0oO.o00Oo0().OooO0OO(i));
                throw null;
            }
        }
    }

    public static final int OoooooO(C21137OooO0oO c21137OooO0oO, int i) {
        c21137OooO0oO.getClass();
        if (i == 0) {
            return 0;
        }
        return (-1) >>> (32 - i);
    }

    public final void Ooooooo() {
        this.f61322OooO0O0 = 0;
        this.f61324OooO0Oo = 0;
        Arrays.fill(this.f61326OooO0o0, 0, this.f61325OooO0o, (Object) null);
        this.f61325OooO0o = 0;
    }

    public final boolean o00O0O() {
        return this.f61322OooO0O0 != 0;
    }

    public final AbstractC21116OooO0Oo o00Oo0() {
        AbstractC21116OooO0Oo abstractC21116OooO0Oo = this.f61321OooO00o[this.f61322OooO0O0 - 1];
        OooOOO0.OooO0Oo(abstractC21116OooO0Oo);
        return abstractC21116OooO0Oo;
    }

    public final void o00Ooo(AbstractC21116OooO0Oo abstractC21116OooO0Oo) {
        int i = abstractC21116OooO0Oo.f61285OooO00o;
        int i2 = abstractC21116OooO0Oo.f61286OooO0O0;
        if (i == 0 && i2 == 0) {
            o00o0O(abstractC21116OooO0Oo);
            return;
        }
        o000000O.OooO0O0("Cannot push " + abstractC21116OooO0Oo + " without arguments because it expects " + i + " ints and " + i2 + " objects.");
        throw null;
    }

    public final void o00o0O(AbstractC21116OooO0Oo abstractC21116OooO0Oo) {
        this.f61327OooO0oO = 0;
        this.f61328OooO0oo = 0;
        int i = this.f61322OooO0O0;
        AbstractC21116OooO0Oo[] abstractC21116OooO0OoArr = this.f61321OooO00o;
        if (i == abstractC21116OooO0OoArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(abstractC21116OooO0OoArr, i + (i > 1024 ? 1024 : i));
            OooOOO0.OooO0o(objArrCopyOf, "copyOf(this, newSize)");
            this.f61321OooO00o = (AbstractC21116OooO0Oo[]) objArrCopyOf;
        }
        int i2 = this.f61324OooO0Oo + abstractC21116OooO0Oo.f61285OooO00o;
        int[] iArr = this.f61323OooO0OO;
        int length = iArr.length;
        if (i2 > length) {
            int i3 = length + (length > 1024 ? 1024 : length);
            if (i3 >= i2) {
                i2 = i3;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i2);
            OooOOO0.OooO0o(iArrCopyOf, "copyOf(this, newSize)");
            this.f61323OooO0OO = iArrCopyOf;
        }
        int i4 = this.f61325OooO0o;
        int i5 = abstractC21116OooO0Oo.f61286OooO0O0;
        int i6 = i4 + i5;
        Object[] objArr = this.f61326OooO0o0;
        int length2 = objArr.length;
        if (i6 > length2) {
            int i7 = length2 + (length2 <= 1024 ? length2 : 1024);
            if (i7 >= i6) {
                i6 = i7;
            }
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr, i6);
            OooOOO0.OooO0o(objArrCopyOf2, "copyOf(this, newSize)");
            this.f61326OooO0o0 = objArrCopyOf2;
        }
        AbstractC21116OooO0Oo[] abstractC21116OooO0OoArr2 = this.f61321OooO00o;
        int i8 = this.f61322OooO0O0;
        this.f61322OooO0O0 = i8 + 1;
        abstractC21116OooO0OoArr2[i8] = abstractC21116OooO0Oo;
        this.f61324OooO0Oo += abstractC21116OooO0Oo.f61285OooO00o;
        this.f61325OooO0o += i5;
    }

    public final void o0OoOo0(InterfaceC21026OooO0oO interfaceC21026OooO0oO, C21096o0000oO0 c21096o0000oO0, C21047OooOoo0.OooO00o oooO00o) {
        C21137OooO0oO c21137OooO0oO;
        int i;
        if (o00O0O()) {
            OooO00o oooO00o2 = new OooO00o();
            do {
                c21137OooO0oO = C21137OooO0oO.this;
                AbstractC21116OooO0Oo abstractC21116OooO0Oo = c21137OooO0oO.f61321OooO00o[oooO00o2.f61329OooO00o];
                OooOOO0.OooO0Oo(abstractC21116OooO0Oo);
                abstractC21116OooO0Oo.OooO00o(oooO00o2, interfaceC21026OooO0oO, c21096o0000oO0, oooO00o);
                int i2 = oooO00o2.f61329OooO00o;
                if (i2 >= c21137OooO0oO.f61322OooO0O0) {
                    break;
                }
                AbstractC21116OooO0Oo abstractC21116OooO0Oo2 = c21137OooO0oO.f61321OooO00o[i2];
                OooOOO0.OooO0Oo(abstractC21116OooO0Oo2);
                oooO00o2.f61330OooO0O0 += abstractC21116OooO0Oo2.f61285OooO00o;
                oooO00o2.f61331OooO0OO += abstractC21116OooO0Oo2.f61286OooO0O0;
                i = oooO00o2.f61329OooO00o + 1;
                oooO00o2.f61329OooO00o = i;
            } while (i < c21137OooO0oO.f61322OooO0O0);
        }
        Ooooooo();
    }

    public final boolean ooOO() {
        return this.f61322OooO0O0 == 0;
    }
}

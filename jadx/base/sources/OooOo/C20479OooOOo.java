package OooOo;

import java.util.Arrays;

/* JADX INFO: renamed from: OooOo.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20479OooOOo extends AbstractC20475OooO0oO {
    public C20479OooOOo() {
        this.f58478OooO00o = new int[16];
    }

    public final void OooO0O0(int i) {
        int i2 = this.f58479OooO0O0 + 1;
        int[] iArr = this.f58478OooO00o;
        if (iArr.length < i2) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(i2, (iArr.length * 3) / 2));
            kotlin.jvm.internal.OooOOO0.OooO0o(iArrCopyOf, "copyOf(this, newSize)");
            this.f58478OooO00o = iArrCopyOf;
        }
        int[] iArr2 = this.f58478OooO00o;
        int i3 = this.f58479OooO0O0;
        iArr2[i3] = i;
        this.f58479OooO0O0 = i3 + 1;
    }

    public final int OooO0OO(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f58479OooO0O0)) {
            StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(i, "Index ", " must be in 0..");
            sbOooO0OO.append(this.f58479OooO0O0 - 1);
            throw new IndexOutOfBoundsException(sbOooO0OO.toString());
        }
        int[] iArr = this.f58478OooO00o;
        int i3 = iArr[i];
        if (i != i2 - 1) {
            Oooo.OooO0OO.OooO0oO(iArr, iArr, i, i + 1, i2);
        }
        this.f58479OooO0O0--;
        return i3;
    }

    public final void OooO0Oo(int i, int i2) {
        if (i < 0 || i >= this.f58479OooO0O0) {
            StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(i, "set index ", " must be between 0 .. ");
            sbOooO0OO.append(this.f58479OooO0O0 - 1);
            throw new IndexOutOfBoundsException(sbOooO0OO.toString());
        }
        int[] iArr = this.f58478OooO00o;
        int i3 = iArr[i];
        iArr[i] = i2;
    }
}

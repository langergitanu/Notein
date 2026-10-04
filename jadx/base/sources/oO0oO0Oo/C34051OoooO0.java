package oO0oO0Oo;

import java.io.IOException;

/* JADX INFO: renamed from: oO0oO0Oo.OoooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34051OoooO0 extends AbstractC34015OooO0OO {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final int f122399OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final AbstractC34015OooO0OO[] f122400OooOoOO;

    public C34051OoooO0(byte[] bArr, int i) {
        super(bArr, i);
        this.f122400OooOoOO = null;
        this.f122399OooOoO = 1000;
    }

    public static byte[] OooOo0(AbstractC34015OooO0OO[] abstractC34015OooO0OOArr) {
        int length = abstractC34015OooO0OOArr.length;
        if (length == 0) {
            return new byte[]{0};
        }
        if (length == 1) {
            return abstractC34015OooO0OOArr[0].f122319OooOo0o;
        }
        int i = length - 1;
        int length2 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            byte[] bArr = abstractC34015OooO0OOArr[i2].f122319OooOo0o;
            if (bArr[0] != 0) {
                throw new IllegalArgumentException("only the last nested bitstring can have padding");
            }
            length2 += bArr.length - 1;
        }
        byte[] bArr2 = abstractC34015OooO0OOArr[i].f122319OooOo0o;
        byte b = bArr2[0];
        byte[] bArr3 = new byte[length2 + bArr2.length];
        bArr3[0] = b;
        int i3 = 1;
        for (AbstractC34015OooO0OO abstractC34015OooO0OO : abstractC34015OooO0OOArr) {
            byte[] bArr4 = abstractC34015OooO0OO.f122319OooOo0o;
            int length3 = bArr4.length - 1;
            System.arraycopy(bArr4, 1, bArr3, i3, length3);
            i3 += length3;
        }
        return bArr3;
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final void OooO(C34035OooOoO0 c34035OooOoO0, boolean z) throws IOException {
        boolean zOooOO0 = OooOO0();
        byte[] bArr = this.f122319OooOo0o;
        if (!zOooOO0) {
            int length = bArr.length;
            c34035OooOoO0.OooOOO0(3, z);
            c34035OooOoO0.OooO0oo(length);
            c34035OooOoO0.OooO0oO(bArr, 0, length);
            return;
        }
        c34035OooOoO0.OooOOO0(35, z);
        c34035OooOoO0.OooO0o(128);
        AbstractC34015OooO0OO[] abstractC34015OooO0OOArr = this.f122400OooOoOO;
        if (abstractC34015OooO0OOArr != null) {
            c34035OooOoO0.OooOOO(abstractC34015OooO0OOArr);
        } else if (bArr.length >= 2) {
            byte b = bArr[0];
            int length2 = bArr.length;
            int i = length2 - 1;
            int i2 = this.f122399OooOoO;
            int i3 = i2 - 1;
            while (i > i3) {
                c34035OooOoO0.OooO0o(3);
                c34035OooOoO0.OooO0oo(i2);
                c34035OooOoO0.OooO0o(0);
                c34035OooOoO0.OooO0oO(bArr, length2 - i, i3);
                i -= i3;
            }
            c34035OooOoO0.OooO0o(3);
            c34035OooOoO0.OooO0oo(i + 1);
            c34035OooOoO0.OooO0o(b);
            c34035OooOoO0.OooO0oO(bArr, length2 - i, i);
        }
        c34035OooOoO0.OooO0o(0);
        c34035OooOoO0.OooO0o(0);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final boolean OooOO0() {
        return this.f122400OooOoOO != null || this.f122319OooOo0o.length > this.f122399OooOoO;
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final int OooOO0O(boolean z) throws IOException {
        boolean zOooOO0 = OooOO0();
        byte[] bArr = this.f122319OooOo0o;
        if (!zOooOO0) {
            return C34035OooOoO0.OooO0Oo(bArr.length, z);
        }
        int iOooOO0O = z ? 4 : 3;
        AbstractC34015OooO0OO[] abstractC34015OooO0OOArr = this.f122400OooOoOO;
        if (abstractC34015OooO0OOArr != null) {
            for (AbstractC34015OooO0OO abstractC34015OooO0OO : abstractC34015OooO0OOArr) {
                iOooOO0O += abstractC34015OooO0OO.OooOO0O(true);
            }
            return iOooOO0O;
        }
        if (bArr.length < 2) {
            return iOooOO0O;
        }
        int length = bArr.length - 2;
        int i = this.f122399OooOoO;
        int i2 = i - 1;
        int i3 = length / i2;
        return C34035OooOoO0.OooO0Oo(bArr.length - (i2 * i3), true) + (C34035OooOoO0.OooO0Oo(i, true) * i3) + iOooOO0O;
    }

    public C34051OoooO0(AbstractC34015OooO0OO[] abstractC34015OooO0OOArr) {
        super(OooOo0(abstractC34015OooO0OOArr), false);
        this.f122400OooOoOO = abstractC34015OooO0OOArr;
        this.f122399OooOoO = 1000;
    }
}

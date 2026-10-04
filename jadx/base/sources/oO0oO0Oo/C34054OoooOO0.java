package oO0oO0Oo;

import java.io.IOException;

/* JADX INFO: renamed from: oO0oO0Oo.OoooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34054OoooOO0 extends AbstractC34033OooOo0o {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final int f122403OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final AbstractC34033OooOo0o[] f122404OooOoOO;

    public C34054OoooOO0(byte[] bArr, AbstractC34033OooOo0o[] abstractC34033OooOo0oArr) {
        super(bArr);
        this.f122404OooOoOO = abstractC34033OooOo0oArr;
        this.f122403OooOoO = 1000;
    }

    public static byte[] OooOOoo(AbstractC34033OooOo0o[] abstractC34033OooOo0oArr) {
        int length = abstractC34033OooOo0oArr.length;
        if (length == 0) {
            return AbstractC34033OooOo0o.f122361OooOoO0;
        }
        if (length == 1) {
            return abstractC34033OooOo0oArr[0].f122362OooOo0o;
        }
        int length2 = 0;
        for (AbstractC34033OooOo0o abstractC34033OooOo0o : abstractC34033OooOo0oArr) {
            length2 += abstractC34033OooOo0o.f122362OooOo0o.length;
        }
        byte[] bArr = new byte[length2];
        int length3 = 0;
        for (AbstractC34033OooOo0o abstractC34033OooOo0o2 : abstractC34033OooOo0oArr) {
            byte[] bArr2 = abstractC34033OooOo0o2.f122362OooOo0o;
            System.arraycopy(bArr2, 0, bArr, length3, bArr2.length);
            length3 += bArr2.length;
        }
        return bArr;
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final void OooO(C34035OooOoO0 c34035OooOoO0, boolean z) throws IOException {
        if (!OooOO0()) {
            byte[] bArr = this.f122362OooOo0o;
            int length = bArr.length;
            c34035OooOoO0.OooOOO0(4, z);
            c34035OooOoO0.OooO0oo(length);
            c34035OooOoO0.OooO0oO(bArr, 0, length);
            return;
        }
        c34035OooOoO0.OooOOO0(36, z);
        c34035OooOoO0.OooO0o(128);
        AbstractC34033OooOo0o[] abstractC34033OooOo0oArr = this.f122404OooOoOO;
        if (abstractC34033OooOo0oArr == null) {
            int i = 0;
            while (true) {
                byte[] bArr2 = this.f122362OooOo0o;
                if (i >= bArr2.length) {
                    break;
                }
                int iMin = Math.min(bArr2.length - i, this.f122403OooOoO);
                byte[] bArr3 = this.f122362OooOo0o;
                c34035OooOoO0.OooOOO0(4, true);
                c34035OooOoO0.OooO0oo(iMin);
                c34035OooOoO0.OooO0oO(bArr3, i, iMin);
                i += iMin;
            }
        } else {
            c34035OooOoO0.OooOOO(abstractC34033OooOo0oArr);
        }
        c34035OooOoO0.OooO0o(0);
        c34035OooOoO0.OooO0o(0);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final boolean OooOO0() {
        return this.f122404OooOoOO != null || this.f122362OooOo0o.length > this.f122403OooOoO;
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final int OooOO0O(boolean z) throws IOException {
        boolean zOooOO0 = OooOO0();
        byte[] bArr = this.f122362OooOo0o;
        if (!zOooOO0) {
            return C34035OooOoO0.OooO0Oo(bArr.length, z);
        }
        int iOooOO0O = z ? 4 : 3;
        AbstractC34033OooOo0o[] abstractC34033OooOo0oArr = this.f122404OooOoOO;
        if (abstractC34033OooOo0oArr != null) {
            for (AbstractC34033OooOo0o abstractC34033OooOo0o : abstractC34033OooOo0oArr) {
                iOooOO0O += abstractC34033OooOo0o.OooOO0O(true);
            }
            return iOooOO0O;
        }
        int length = bArr.length;
        int i = this.f122403OooOoO;
        int i2 = length / i;
        int iOooO0Oo = (C34035OooOoO0.OooO0Oo(i, true) * i2) + iOooOO0O;
        int length2 = bArr.length - (i2 * i);
        return length2 > 0 ? C34035OooOoO0.OooO0Oo(length2, true) + iOooO0Oo : iOooO0Oo;
    }
}

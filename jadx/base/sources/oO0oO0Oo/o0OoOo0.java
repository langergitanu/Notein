package oO0oO0Oo;

import java.io.IOException;
import oOO000oO.C34336OooO0o;

/* JADX INFO: loaded from: classes10.dex */
public final class o0OoOo0 extends C34025OooOOO0 {
    @Override // oO0oO0Oo.C34025OooOOO0, oO0oO0Oo.AbstractC34036OooOoOO
    public final void OooO(C34035OooOoO0 c34035OooOoO0, boolean z) throws IOException {
        c34035OooOoO0.OooOO0(24, OooOo0o(), z);
    }

    @Override // oO0oO0Oo.C34025OooOOO0, oO0oO0Oo.AbstractC34036OooOoOO
    public final int OooOO0O(boolean z) {
        return C34035OooOoO0.OooO0Oo(OooOo0o().length, z);
    }

    @Override // oO0oO0Oo.C34025OooOOO0, oO0oO0Oo.AbstractC34036OooOoOO
    public final AbstractC34036OooOoOO OooOOOO() {
        return this;
    }

    @Override // oO0oO0Oo.C34025OooOOO0, oO0oO0Oo.AbstractC34036OooOoOO
    public final AbstractC34036OooOoOO OooOOOo() {
        return this;
    }

    public final byte[] OooOo0o() {
        byte[] bArr = this.f122340OooOo0o;
        if (bArr[bArr.length - 1] == 90) {
            if (!(OooOo0(10) && OooOo0(11))) {
                byte[] bArr2 = new byte[bArr.length + 4];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length - 1);
                String str = C34336OooO0o.f123266OooO00o;
                byte[] bArr3 = new byte[5];
                for (int i = 0; i != 5; i++) {
                    bArr3[i] = (byte) "0000Z".charAt(i);
                }
                System.arraycopy(bArr3, 0, bArr2, bArr.length - 1, 5);
                return bArr2;
            }
            if (!(OooOo0(12) && OooOo0(13))) {
                byte[] bArr4 = new byte[bArr.length + 2];
                System.arraycopy(bArr, 0, bArr4, 0, bArr.length - 1);
                String str2 = C34336OooO0o.f123266OooO00o;
                byte[] bArr5 = new byte[3];
                for (int i2 = 0; i2 != 3; i2++) {
                    bArr5[i2] = (byte) "00Z".charAt(i2);
                }
                System.arraycopy(bArr5, 0, bArr4, bArr.length - 1, 3);
                return bArr4;
            }
            if (OooOo00()) {
                int length = bArr.length - 2;
                while (length > 0 && bArr[length] == 48) {
                    length--;
                }
                if (bArr[length] == 46) {
                    byte[] bArr6 = new byte[1 + length];
                    System.arraycopy(bArr, 0, bArr6, 0, length);
                    bArr6[length] = 90;
                    return bArr6;
                }
                byte[] bArr7 = new byte[length + 2];
                int i3 = length + 1;
                System.arraycopy(bArr, 0, bArr7, 0, i3);
                bArr7[i3] = 90;
                return bArr7;
            }
        }
        return bArr;
    }
}

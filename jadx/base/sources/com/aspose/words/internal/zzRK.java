package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzRK {
    private zzZO0 zzMW;
    private boolean zzMX;
    private int zzMY;
    private byte[] zzMZ;
    private int zzN0;
    private String zzN1;
    private int zzN2;
    private byte[] zzN3;
    private long zzN4;
    private zzZOP zzN5;

    public zzRK(zzZOP zzzop) throws Exception {
        this(zzzop, null);
    }

    private int zzQV() {
        byte[] bArr = this.zzMZ;
        if (bArr.length == zzT8.zzQs.length) {
            return bArr.length;
        }
        return 0;
    }

    private void zzQW() throws Exception {
        this.zzN5.zzH(this.zzN4);
        this.zzN2 = 0;
        while (true) {
            zzZOP zzzop = this.zzN5;
            byte[] bArr = this.zzN3;
            int i = this.zzN2;
            int i2 = zzzop.read(bArr, i, bArr.length - i);
            if (i2 == 0) {
                return;
            } else {
                this.zzN2 += i2;
            }
        }
    }

    private boolean zzQX() throws Exception {
        if (zzR0()) {
            return false;
        }
        int i = this.zzN2;
        byte[] bArr = this.zzN3;
        this.zzN3 = new byte[bArr.length == 0 ? 512 : bArr.length * 4];
        zzQW();
        return this.zzN2 > i;
    }

    private boolean zzR0() {
        return this.zzN2 != this.zzN3.length;
    }

    public final boolean contains(String str) {
        String str2 = this.zzN1;
        return zzZKN.zzZ(str2, str, 0, Math.min(str2.length(), 512), zzZOF.ORDINAL$4894b8c8) != -1;
    }

    public final char readChar() throws Exception {
        if (!zzR2()) {
            return (char) 0;
        }
        this.zzMY--;
        String str = this.zzN1;
        int i = this.zzN0;
        this.zzN0 = i + 1;
        return str.charAt(i);
    }

    public final void resetState() throws Exception {
        this.zzN5.zzH(this.zzN4);
        this.zzN1 = null;
        this.zzN0 = 0;
        this.zzMX = true;
        zzR6();
    }

    public final int zzQY() {
        return this.zzN0;
    }

    public final zzZO0 zzQZ() {
        return this.zzMW;
    }

    public final zzZOP zzR1() {
        return this.zzN5;
    }

    public final boolean zzR2() throws Exception {
        if (this.zzMY <= 0) {
            return false;
        }
        if (this.zzN0 < this.zzN1.length()) {
            return true;
        }
        if (!zzR0() && zzQX()) {
            zzZO0 zzzo0 = this.zzMW;
            byte[] bArr = this.zzN3;
            byte[] bArr2 = this.zzMZ;
            this.zzN1 = zzzo0.zzR(bArr, bArr2.length, this.zzN2 - bArr2.length);
        }
        return this.zzN0 < this.zzN1.length();
    }

    public final void zzR3() {
        this.zzN0 = 0;
        this.zzMX = true;
        zzR6();
    }

    public final void zzR4() {
        this.zzMY++;
        this.zzN0--;
    }

    public final void zzR5() {
        this.zzMX = false;
    }

    public final void zzR6() {
        if (this.zzMX) {
            this.zzMY = 1024;
        }
    }

    public final void zzR7() throws Exception {
        resetState();
        int iZzM = zzT8.zzM(this.zzMZ);
        if (iZzM != Integer.MIN_VALUE) {
            this.zzMW = zzZO0.zzQz(iZzM);
        }
        zzZO0 zzzo0 = this.zzMW;
        byte[] bArr = this.zzN3;
        byte[] bArr2 = this.zzMZ;
        this.zzN1 = zzzo0.zzR(bArr, bArr2.length, this.zzN2 - bArr2.length);
    }

    public final void zzR8() throws Exception {
        resetState();
        zzZO0 zzzo0 = this.zzMW;
        byte[] bArr = this.zzN3;
        byte[] bArr2 = this.zzMZ;
        this.zzN1 = zzzo0.zzR(bArr, bArr2.length, this.zzN2 - bArr2.length);
    }

    public final void zzR9() throws Exception {
        this.zzN5.zzH(this.zzN4 + ((long) zzQV()));
    }

    public final boolean zzj(String str) {
        if (this.zzN2 < str.length()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if ((this.zzN3[i] & 255) != str.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public final boolean zzp(byte[] bArr) {
        if (this.zzN2 < bArr.length) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.zzN2 - bArr.length && !z; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= bArr.length) {
                    break;
                }
                if (this.zzN3[i2 + i] != bArr[i2]) {
                    z = false;
                    break;
                }
                i2++;
                z = true;
            }
        }
        return z;
    }

    public final boolean zzq(byte[] bArr) {
        if (this.zzN2 < bArr.length) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (this.zzN3[i] != bArr[i]) {
                return false;
            }
        }
        return true;
    }

    public zzRK(zzZOP zzzop, zzZO0 zzzo0) throws Exception {
        this.zzN3 = zzZ1.zzXW;
        this.zzMX = true;
        zzR6();
        this.zzN5 = zzzop;
        this.zzN4 = zzzop.getPosition();
        zzzo0 = zzzo0 == null ? zzUU.zzS(this.zzN5) : zzzo0;
        this.zzMW = zzzo0;
        if (zzzo0 == null) {
            this.zzMW = zzZO0.zzhV();
        }
        zzQX();
        byte[] bArrZzL = zzT8.zzL(this.zzN3);
        this.zzMZ = bArrZzL;
        this.zzN1 = this.zzMW.zzR(this.zzN3, bArrZzL.length, this.zzN2 - bArrZzL.length);
    }
}

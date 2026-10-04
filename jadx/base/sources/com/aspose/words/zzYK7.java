package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYK7 {
    private int zzXCU;
    private byte[] zzXCV;
    private int zzXCW;
    private int zzXCX;
    private com.aspose.words.internal.zzH7 zzYtR;
    private com.aspose.words.internal.zzFU zzYLT = com.aspose.words.internal.zzS1.zzRu();
    private int zzXCY = 65537;

    private com.aspose.words.internal.zzZZU zzR(String str, byte[] bArr) {
        com.aspose.words.internal.zzZO0 zzzo0ZzhU = com.aspose.words.internal.zzZO0.zzhU();
        if (str == null) {
            str = "";
        }
        byte[] bytes = zzzo0ZzhU.getBytes(str);
        if (this.zzXCY == 65537) {
            this.zzXCW = 5;
            this.zzXCX = 16;
            com.aspose.words.internal.zzH7 zzh7ZzYu = com.aspose.words.internal.zzS1.zzYu(8);
            this.zzYtR = zzh7ZzYu;
            this.zzXCV = com.aspose.words.internal.zzIL.zzZ(zzh7ZzYu, bytes);
            byte[] bArr2 = new byte[StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_2];
            for (int i = 0; i < 16; i++) {
                int i2 = i * 21;
                com.aspose.words.internal.zzZKV.zzZ(this.zzXCV, 0, bArr2, i2, 5);
                com.aspose.words.internal.zzZKV.zzZ(bArr, 0, bArr2, i2 + 5, 16);
            }
            this.zzXCV = com.aspose.words.internal.zzIL.zzZ(this.zzYtR, bArr2);
        } else {
            this.zzXCW = 20;
            this.zzXCX = 24;
            this.zzYtR = com.aspose.words.internal.zzS1.zzYu(1);
            byte[] bArr3 = new byte[bArr.length + bytes.length];
            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            com.aspose.words.internal.zzZKV.zzZ(bytes, 0, bArr3, bArr.length, bytes.length);
            this.zzXCV = com.aspose.words.internal.zzIL.zzZ(this.zzYtR, bArr3);
        }
        com.aspose.words.internal.zzZZU zzzzu = new com.aspose.words.internal.zzZZU();
        zzZ(zzzzu, 0);
        return zzzzu;
    }

    private void zzS(com.aspose.words.internal.zzZOW zzzow, String str) throws Exception {
        byte[] bArrZzZjP = zzZjP();
        byte[] bArrZzZjP2 = zzZjP();
        com.aspose.words.internal.zzZZU zzzzuZzR = zzR(str, bArrZzZjP);
        byte[] bArr = new byte[16];
        byte[] bArr2 = new byte[16];
        zzzzuZzR.zzT(bArrZzZjP2, bArr);
        zzzzuZzR.zzT(com.aspose.words.internal.zzIL.zzZ(this.zzYtR, bArrZzZjP2), bArr2);
        zzzow.writeBytes(bArrZzZjP);
        zzzow.writeBytes(bArr);
        zzzow.writeBytes(bArr2);
    }

    private void zzX(com.aspose.words.internal.zzKD zzkd, String str) throws Exception {
        com.aspose.words.internal.zzZZU zzzzu = new com.aspose.words.internal.zzZZU();
        zzZ(zzzzu, zzkd, str, 52);
        zzZ(zzzzu, zzkd, "WordDocument", 68);
        zzZ(zzzzu, zzkd, "Data", 0);
    }

    private byte[] zzZjP() {
        byte[] bArr = new byte[16];
        this.zzYLT.nextBytes(bArr);
        return bArr;
    }

    public final void zzT(com.aspose.words.internal.zzZOW zzzow, String str) throws Exception {
        com.aspose.words.internal.zzZYD.zzXk(str);
        zzzow.zzl(65537);
        zzS(zzzow, str);
    }

    public final void zzY(com.aspose.words.internal.zzKD zzkd, String str) throws Exception {
        zzX(zzkd, str);
    }

    public final void zzZ(com.aspose.words.internal.zzKD zzkd, String str, String str2) throws Exception {
        byte[] bArrZzn;
        byte[] bArr;
        byte[] bArr2;
        com.aspose.words.internal.zzZOX zzzox = new com.aspose.words.internal.zzZOX(zzkd.zzIf().zzYs(str));
        int iZzXc = zzzox.zzXc();
        this.zzXCY = iZzXc;
        if (iZzXc != 65537) {
            switch (iZzXc) {
                case 131074:
                case 131075:
                case 131076:
                    zzzox.zzXc();
                    zzZUJ zzzuj = new zzZUJ(zzzox);
                    if (!zzY(zzzuj)) {
                        throw new IllegalStateException("Unsupported encryption parameters.");
                    }
                    zzZUG zzzug = new zzZUG(zzzox, false);
                    bArr = zzzug.zzYL3;
                    bArrZzn = zzzug.zzYL2;
                    bArr2 = zzzug.zzYL0;
                    this.zzXCU = zzzuj.zzYLi;
                    break;
                    break;
                default:
                    throw new IllegalStateException("Unexpected encryption version.");
            }
        } else {
            byte[] bArrZzn2 = zzzox.zzn(16);
            bArrZzn = zzzox.zzn(16);
            byte[] bArrZzn3 = zzzox.zzn(16);
            bArr = bArrZzn2;
            bArr2 = bArrZzn3;
        }
        if (!zzZ(bArr, bArrZzn, bArr2, str2)) {
            throw new IncorrectPasswordException("The document password is incorrect.");
        }
        zzX(zzkd, str);
    }

    private static boolean zzY(zzZUJ zzzuj) {
        if (zzzuj.zzYLk != 26625 || zzzuj.zzYLj != 32772) {
            return false;
        }
        int i = zzzuj.zzYLi;
        return (i == 128 || i == 40) && (zzzuj.zzZjA & 4) != 0;
    }

    private void zzZ(com.aspose.words.internal.zzZZU zzzzu, com.aspose.words.internal.zzKD zzkd, String str, int i) throws Exception {
        com.aspose.words.internal.zzZOR zzzorZzYt = zzkd.zzIf().zzYt(str);
        if (zzzorZzYt == null) {
            return;
        }
        byte[] bArr = new byte[i];
        zzzorZzYt.zzH(0L);
        zzzorZzYt.read(bArr, 0, i);
        zzZ(zzzzu, zzzorZzYt);
        zzzorZzYt.zzH(0L);
        zzzorZzYt.write(bArr, 0, i);
    }

    private void zzZ(com.aspose.words.internal.zzZZU zzzzu, com.aspose.words.internal.zzZOP zzzop) throws Exception {
        if (zzzop == null) {
            return;
        }
        zzzop.zzH(0L);
        zzZ(zzzzu, 0);
        byte[] bArr = new byte[16];
        int i = 0;
        int i2 = 0;
        while (i < zzzop.getLength()) {
            int i3 = zzzop.read(bArr, 0, 16);
            zzzzu.zzH(bArr, i3);
            zzzop.zzH(zzzop.getPosition() - ((long) i3));
            zzzop.write(bArr, 0, i3);
            i += i3;
            if (i % 512 == 0) {
                i2++;
                zzZ(zzzzu, i2);
            }
        }
        zzzop.zzH(0L);
    }

    private void zzZ(com.aspose.words.internal.zzZZU zzzzu, int i) {
        byte[] bArr = new byte[this.zzXCX];
        com.aspose.words.internal.zzZKV.zzZ(this.zzXCV, 0, bArr, 0, this.zzXCW);
        com.aspose.words.internal.zzZKV.zzZ(com.aspose.words.internal.zzZQK.getBytes(i), 0, bArr, this.zzXCW, 4);
        byte[] bArrZzZ = com.aspose.words.internal.zzIL.zzZ(this.zzYtR, bArr, 0, this.zzXCW + 4);
        int i2 = this.zzXCU;
        if (i2 == 40) {
            for (int i3 = i2 / 8; i3 < bArrZzZ.length; i3++) {
                bArrZzZ[i3] = 0;
            }
        }
        zzzzu.zzG(bArrZzZ, 16);
    }

    private boolean zzZ(byte[] bArr, byte[] bArr2, byte[] bArr3, String str) {
        com.aspose.words.internal.zzZZU zzzzuZzR = zzR(str, bArr);
        zzzzuZzR.zzH(bArr2, 16);
        zzzzuZzR.zzH(bArr3, this.zzYtR.zzQI());
        return com.aspose.words.internal.zzZ1.zzZ(com.aspose.words.internal.zzIL.zzZ(this.zzYtR, bArr2), bArr3, 16);
    }
}

package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzXB {
    private com.aspose.words.internal.zzZOX zzW6;
    private com.aspose.words.internal.zzDB zzZAP = new com.aspose.words.internal.zzDB();

    private String zz6Y() throws Exception {
        return com.aspose.words.internal.zzZO0.zzhU().zzZn(this.zzW6.zzn((this.zzW6.readByte() & 255) * 2));
    }

    private void zz6Z() throws Exception {
        short sZzXa = this.zzW6.zzXa();
        for (int i = 0; i < sZzXa; i++) {
            zz6Y();
        }
        this.zzW6.zzXa();
        this.zzW6.zzXa();
        this.zzW6.zzXa();
        this.zzW6.zzXa();
        zz6Y();
    }

    private void zz70() throws Exception {
        if (this.zzW6.zzXc() == 1) {
            zz6Y();
        }
    }

    private void zz71() throws Exception {
        this.zzW6.zzn(this.zzW6.zzXc() - 10);
    }

    private void zz72() throws Exception {
        byte b = this.zzW6.readByte();
        if ((b & 8) != 0) {
            zz71();
            zz71();
        }
        if ((b & 16) != 0) {
            this.zzW6.zzX9();
        }
        if ((b & 4) != 0) {
            zz6Y();
        }
    }

    private void zz73() throws Exception {
        zz6Y();
        this.zzW6.zzXc();
        zz6Y();
        zz6Y();
        zz6Y();
        this.zzW6.readByte();
        this.zzW6.readByte();
    }

    private void zz74() throws Exception {
        byte b = this.zzW6.readByte();
        if ((b & 1) != 0) {
            zz6Y();
        }
        if ((b & 2) != 0) {
            zz6Y();
            zz6Y();
        }
        if ((b & 4) != 0) {
            zz73();
        }
    }

    private void zz75() throws Exception {
        zzY77 zzy77 = new zzY77(this.zzW6);
        int i = zzy77.zzX7f;
        if (i != 1 && i != 4177) {
            this.zzW6.zzXc();
        }
        if (zzy77.zzX7g != 22) {
            zz74();
            int i2 = zzy77.zzX7g;
            if (i2 != 1) {
                if (i2 != 2 && i2 != 3 && i2 != 4 && i2 != 6) {
                    if (i2 != 16) {
                        if (i2 != 20 && i2 != 9) {
                            if (i2 != 10) {
                                switch (i2) {
                                }
                                return;
                            }
                            zz70();
                            return;
                        }
                    }
                }
                if (zzy77.zzX7f == 1) {
                    zz6Z();
                    return;
                }
                return;
            }
            zz72();
        }
    }

    private void zz76() throws Exception {
        zzZZR.zzZ(this.zzW6, true, false);
        this.zzW6.zzn(this.zzW6.zzXc() - 4);
        int iZzXc = this.zzW6.zzXc();
        for (int i = 0; i < iZzXc; i++) {
            zz75();
        }
    }

    private void zz77() throws Exception {
        this.zzW6.readByte();
        this.zzW6.readByte();
        this.zzW6.zzXc();
        this.zzW6.zzXc();
        int position = (int) this.zzW6.zzq().getPosition();
        this.zzW6.zzXc();
        short sZzX9 = this.zzW6.zzX9();
        this.zzW6.zzX9();
        if ((sZzX9 & 1) != 0) {
            this.zzZAP.add(position);
        }
    }

    private void zz78() throws Exception {
        int iZzXc = this.zzW6.zzXc();
        this.zzW6.zzXa();
        short sZzXa = this.zzW6.zzXa();
        if (iZzXc == 0) {
            zz76();
            return;
        }
        for (int i = 0; i < sZzXa; i++) {
            zz77();
        }
    }

    private void zz79() throws Exception {
        this.zzW6.readByte();
        this.zzW6.zzXa();
        this.zzW6.readByte();
        this.zzW6.zzXa();
        this.zzW6.zzXa();
        this.zzW6.zzXa();
        short sZzXa = this.zzW6.zzXa();
        this.zzW6.zzn(this.zzW6.zzXc());
        for (int i = 0; i < sZzXa; i++) {
            zz78();
        }
    }

    private void zzI(byte[] bArr, int i, int i2) throws Exception {
        if (this.zzZAP.getCount() == 0) {
            return;
        }
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR(bArr);
        com.aspose.words.internal.zzZOX zzzox = new com.aspose.words.internal.zzZOX(zzzor);
        com.aspose.words.internal.zzZOW zzzow = new com.aspose.words.internal.zzZOW(zzzor);
        for (int i3 = 0; i3 < this.zzZAP.getCount(); i3++) {
            long j = this.zzZAP.get(i3) - i;
            zzzox.zzq().zzH(j);
            int iZzXc = (zzzox.zzXc() - i) + i2;
            zzzox.zzq().zzH(j);
            zzzow.zzl(iZzXc);
        }
    }

    public final byte[] zzT(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        this.zzW6 = zzzox;
        int position = (int) zzzox.zzq().getPosition();
        zz79();
        int position2 = ((int) this.zzW6.zzq().getPosition()) - position;
        this.zzW6.zzq().zzH(position);
        byte[] bArrZzn = this.zzW6.zzn(position2);
        zzI(bArrZzn, position, 0);
        return bArrZzn;
    }

    public final byte[] zzx(byte[] bArr, int i) throws Exception {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        this.zzW6 = new com.aspose.words.internal.zzZOX(new com.aspose.words.internal.zzZOR(bArr));
        zz79();
        byte[] bArr2 = new byte[bArr.length];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr2[i2] = bArr[i2];
        }
        zzI(bArr2, 0, i);
        return bArr2;
    }
}

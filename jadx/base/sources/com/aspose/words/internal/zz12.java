package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz12 {
    private byte[] zzTZ;
    private zz11 zzfd;
    private zz16 zzfi;

    public zz12(zz11 zz11Var, zz16 zz16Var) {
        this.zzfd = zz11Var;
        this.zzfi = zz16Var;
    }

    private static byte zzTw(int i) {
        if (i == 1) {
            return (byte) 1;
        }
        if (i == 2) {
            return (byte) 3;
        }
        if (i == 4) {
            return (byte) 15;
        }
        if (i == 8) {
            return (byte) -1;
        }
        throw new IllegalArgumentException("Unexpected component size. Size must be 1, 2, 4 or 8.");
    }

    private int zzTx(int i) {
        int iZzsH = (this.zzfd.zzsH() * i) / 8;
        int iZzsH2 = 8 - (((i * this.zzfd.zzsH()) % 8) + this.zzfd.zzsH());
        return ((this.zzTZ[iZzsH] & 255) & ((zzTw(this.zzfd.zzsH()) & 255) << iZzsH2)) >> iZzsH2;
    }

    private static byte zzTy(int i) {
        return (byte) (Math.ceil(((double) i) / 31.0d) * 255.0d);
    }

    private byte[] zzY(zz0Y zz0y) throws Exception {
        if (this.zzfd.zzsH() == 5) {
            return zzsN();
        }
        if (this.zzfd.zzsH() == 8) {
            return zzsO();
        }
        zz0y.zzT(0, "Unexpected component size, image will not be rendered.");
        return zzEF.zzDL();
    }

    private byte[] zzsM() throws Exception {
        zzZQ5 zzzq5 = new zzZQ5(0, 0, (int) this.zzfd.zzZj().getWidth(), (int) this.zzfd.zzZj().getHeight());
        zzXN zzxn = new zzXN(zzzq5.getWidth(), zzzq5.getHeight());
        try {
            zzXQ zzxqZzWz = zzxn.zzWz();
            int i = 0;
            for (int i2 = 0; i2 < zzxn.getHeight(); i2++) {
                for (int i3 = 0; i3 < zzxn.getWidth(); i3++) {
                    zzPV zzpvZzA = this.zzfi.zzA(zzTx(i));
                    byte bZzPA = (byte) zzpvZzA.zzPA();
                    byte bZzPB = (byte) zzpvZzA.zzPB();
                    zzxqZzWz.zzY((zzxn.getWidth() * i2) + i3, (byte) zzpvZzA.zzPD(), (byte) zzpvZzA.zzPC(), bZzPB, bZzPA);
                    i++;
                }
                if (i % 2 > 0) {
                    i++;
                }
            }
            zzxqZzWz.zzWQ();
            zzZOR zzzor = new zzZOR();
            try {
                zzxn.zzZ(zzzor, 6);
                byte[] bArrZzWy = zzzor.zzWy();
                zzxn.dispose();
                return bArrZzWy;
            } finally {
                zzzor.close();
            }
        } catch (Throwable th) {
            zzxn.dispose();
            throw th;
        }
    }

    private byte[] zzsN() throws Exception {
        zzZQ5 zzzq5 = new zzZQ5(0, 0, (int) this.zzfd.zzZj().getWidth(), (int) this.zzfd.zzZj().getHeight());
        zzXN zzxn = new zzXN(zzzq5.getWidth(), zzzq5.getHeight());
        try {
            zzXQ zzxqZzWz = zzxn.zzWz();
            int i = 0;
            for (int i2 = 0; i2 < zzxn.getHeight(); i2++) {
                for (int i3 = 0; i3 < zzxn.getWidth(); i3++) {
                    short sZzB = zzZQK.zzB(this.zzTZ, i);
                    int i4 = 65535 & sZzB;
                    zzxqZzWz.zzY((zzxn.getWidth() * i2) + i3, -1, zzTy(sZzB & 31), zzTy((i4 >> 5) & 31), zzTy((i4 >> 10) & 31));
                    i += 2;
                }
            }
            zzxqZzWz.zzWQ();
            zzZOR zzzor = new zzZOR();
            try {
                zzxn.zzZ(zzzor, 6);
                byte[] bArrZzWy = zzzor.zzWy();
                zzxn.dispose();
                return bArrZzWy;
            } finally {
                zzzor.close();
            }
        } catch (Throwable th) {
            zzxn.dispose();
            throw th;
        }
    }

    private byte[] zzsO() throws Exception {
        zzZQ5 zzzq5 = new zzZQ5(0, 0, (int) this.zzfd.zzZj().getWidth(), (int) this.zzfd.zzZj().getHeight());
        zzXN zzxn = new zzXN(zzzq5.getWidth(), zzzq5.getHeight());
        try {
            zzXQ zzxqZzWz = zzxn.zzWz();
            byte b = -1;
            for (int i = 0; i < zzxn.getHeight(); i++) {
                int i2 = 0;
                int i3 = 0;
                while (i2 < zzxn.getWidth()) {
                    int width = (zzxn.getWidth() * i * this.zzfd.zzsI()) + i3;
                    int width2 = (zzxn.getWidth() * i * this.zzfd.zzsI()) + i3 + zzxn.getWidth();
                    int width3 = (zzxn.getWidth() * 2) + (zzxn.getWidth() * i * this.zzfd.zzsI()) + i3;
                    if (this.zzfd.zzsI() == 4) {
                        b = this.zzTZ[(zzxn.getWidth() * i * this.zzfd.zzsI()) + i3];
                        width += zzxn.getWidth();
                        width2 += zzxn.getWidth();
                        width3 += zzxn.getWidth();
                    }
                    int i4 = width2;
                    byte b2 = b;
                    byte[] bArr = this.zzTZ;
                    byte b3 = bArr[width3];
                    zzxqZzWz.zzY((zzxn.getWidth() * i) + i2, b2, bArr[width], bArr[i4], b3);
                    i3++;
                    i2++;
                    b = b2;
                }
            }
            zzxqZzWz.zzWQ();
            zzZOR zzzor = new zzZOR();
            try {
                zzxn.zzZ(zzzor, 6);
                byte[] bArrZzWy = zzzor.zzWy();
                zzxn.dispose();
                return bArrZzWy;
            } finally {
                zzzor.close();
            }
        } catch (Throwable th) {
            zzxn.dispose();
            throw th;
        }
    }

    public final void setData(byte[] bArr) {
        this.zzTZ = bArr;
    }

    public final byte[] zzZ(zz0Y zz0y) throws Exception {
        return this.zzTZ == null ? zzEF.zzDL() : this.zzfd.zzsK() == 16 ? zzY(zz0y) : zzsM();
    }
}

package com.aspose.words.internal;

import com.aspose.words.ref.RefInt;

/* JADX INFO: loaded from: classes5.dex */
public final class zzKD {
    private static byte[] zzBQ = {-48, -49, 17, -32};
    private zzAA zzBR;
    private zzZOR zzP3;
    private zzQS zzP4;
    private zzZZ5 zzP5;
    private zzKH zzP6;
    private zzIH zzP7;
    private zzZOP zzP8;

    public zzKD(zzAA zzaa) {
        this.zzBR = zzaa;
    }

    public static byte[] zzIe() {
        return zzBQ;
    }

    private void zzJ(zzZOP zzzop) throws Exception {
        this.zzP8 = zzzop;
        zzzop.zzH(512L);
        zzIH zzih = new zzIH();
        this.zzP7 = zzih;
        this.zzP6 = new zzKH(this.zzP8, zzih);
        this.zzP5 = new zzZZ5();
        this.zzP3 = new zzZOR();
        this.zzP4 = new zzQS();
        zzZ(this.zzBR, (zzQT) null);
        if (this.zzP3.getLength() > 0) {
            this.zzP4.zzYl(0).zzLz = zzY(this.zzP3, true);
            this.zzP4.zzYl(0).zzLy = this.zzP3.getLength();
            RefInt refInt = new RefInt(0);
            this.zzP7.zzy2 = zzZ(this.zzP5.zzQH(), true, refInt);
            this.zzP7.zzy1 = refInt.get();
        } else {
            this.zzP7.zzy2 = -2;
        }
        this.zzP7.zzy4 = zzY(this.zzP4.zzQH(), true);
        this.zzP6.zzIg();
        this.zzP8.zzH(0L);
        this.zzP7.zzZ(new zzZOW(this.zzP8, zzZO0.zzhU()));
        zzZOP zzzop2 = this.zzP8;
        zzzop2.zzH(zzzop2.getLength());
    }

    private void zzK(zzZOP zzzop) throws Exception {
        zzZOR zzzor = new zzZOR();
        try {
            zzJ(zzzor);
            zzzor.zzH(0L);
            zzZYQ.zzX(zzzor, zzzop);
        } finally {
            zzzor.close();
        }
    }

    public static boolean zzM(zzZOP zzzop) throws Exception {
        long position = zzzop.getPosition();
        byte[] bArr = new byte[4];
        int i = zzzop.read(bArr, 0, 4);
        zzzop.zzH(position);
        return zzQ(bArr, i);
    }

    public static boolean zzQ(byte[] bArr, int i) {
        byte[] bArr2 = zzBQ;
        return i >= bArr2.length && bArr[0] == bArr2[0] && bArr[1] == bArr2[1] && bArr[2] == bArr2[2] && bArr[3] == bArr2[3];
    }

    private void zzR(zzZOP zzzop) throws Exception {
        this.zzP8 = zzzop;
        zzzop.zzH(0L);
        zzIH zzih = new zzIH(new zzZOX(this.zzP8, zzZO0.zzhU()));
        this.zzP7 = zzih;
        zzKH zzkh = new zzKH(this.zzP8, zzih);
        this.zzP6 = zzkh;
        zzkh.zzIh();
        zzSc();
        zzIH zzih2 = this.zzP7;
        this.zzP5 = new zzZZ5(zzZ(zzih2.zzy2, zzih2.zzGq(), this.zzP7.zzGq(), true));
        zzSb();
    }

    private void zzSa() throws Exception {
        zzZ(this.zzP4.zzYl(0), (zzAA) null);
    }

    private void zzSb() throws Exception {
        this.zzP4 = new zzQS();
        zzZOX zzzox = new zzZOX(this.zzP8, zzZO0.zzhU());
        int i = this.zzP7.zzy4;
        zzIM zzim = new zzIM();
        while (i != -2) {
            this.zzP8.zzH(zzZZ4.zzD(i, true));
            for (int i2 = 0; i2 < 4; i2++) {
                this.zzP4.zzZ(new zzQT(zzzox));
            }
            zzim.add(Integer.valueOf(i));
            i = this.zzP6.get(i);
            if (zzim.contains(Integer.valueOf(i))) {
                throw new IllegalStateException("The structured storage file seems to be corrupt. FAT contains cycles.");
            }
        }
    }

    private void zzSc() {
        int iMin = Math.min(10, this.zzP6.getCount());
        for (int i = 0; (((long) i) & 4294967295L) < iMin; i++) {
            if (this.zzP6.get(i) != 0) {
                return;
            }
        }
        throw new IllegalStateException("The FAT in the structured storage document seems to be corrupted.");
    }

    private int zzY(zzZOP zzzop, boolean z) throws Exception {
        RefInt refInt = new RefInt(0);
        int iZzZ = zzZ(zzzop, z, refInt);
        refInt.get();
        return iZzZ;
    }

    private void zzZ(zzAA zzaa, zzQT zzqt) throws Exception {
        zzQT zzqt2;
        if (zzqt == null) {
            zzqt = new zzQT("Root Entry", true, zzaa.zzAC());
            this.zzP4.zzZ(zzqt);
        }
        if (zzaa.getCount() > 0) {
            zzqt.zzLE = this.zzP4.getCount();
        }
        for (int i = 0; i < zzaa.getCount(); i++) {
            String strZzV4 = zzaa.zzV4(i);
            Object objZzVY = zzaa.zzVY(i);
            zzAA zzaa2 = (zzAA) zzZKW.zzZ(objZzVY, zzAA.class);
            zzZOP zzzop = (zzZOP) zzZKW.zzZ(objZzVY, zzZOP.class);
            if (zzaa2 != null) {
                zzqt2 = new zzQT(strZzV4, false, zzaa2.zzAC());
                this.zzP4.zzZ(zzqt2);
                zzZ(zzaa2, zzqt2);
            } else {
                if (zzzop == null) {
                    throw new IllegalStateException("Unknown object in memory storage.");
                }
                zzQT zzqt3 = new zzQT(strZzV4, zzzop.getLength());
                this.zzP4.zzZ(zzqt3);
                zzqt3.zzLz = zzY(zzzop, false);
                zzqt2 = zzqt3;
            }
            if (i < zzaa.getCount() - 1) {
                zzqt2.zzLF = this.zzP4.getCount();
            }
        }
    }

    public final zzAA zzIf() throws Exception {
        if (this.zzBR == null) {
            zzSa();
        }
        return this.zzBR;
    }

    public final void zzL(zzZOP zzzop) throws Exception {
        if (zzzop == null || zzzop.zzRG()) {
            zzJ(zzzop);
        } else {
            zzK(zzzop);
        }
    }

    public final boolean zzZR(String str) {
        return this.zzP4.zzc(str) != null;
    }

    public final zzZOR zzZS(String str) throws Exception {
        zzQT zzqtZzc = this.zzP4.zzc(str);
        if (zzqtZzc != null) {
            return zzZ(zzqtZzc.zzLz, (int) zzqtZzc.zzLy, 512, false);
        }
        throw new IllegalStateException(zzZKN.format("Cannot find directory entry {0}.", str));
    }

    public zzKD(zzZOZ zzzoz) {
        this(new zzAA(zzzoz));
    }

    public zzKD(zzZOP zzzop) throws Exception {
        zzR(zzzop);
    }

    private int zzZ(zzZOP zzzop, boolean z, RefInt refInt) throws Exception {
        refInt.set(0);
        if (zzzop.getLength() == 0) {
            return -2;
        }
        int i = 1;
        boolean z2 = this.zzP7.zzZZ(zzzop.getLength()) || z;
        zzZZ5 zzzz5 = z2 ? this.zzP6 : this.zzP5;
        zzZOP zzzop2 = z2 ? this.zzP8 : this.zzP3;
        int i2 = z2 ? 512 : 64;
        int iZzU = zzZZ4.zzU(zzzop2.getPosition(), z2);
        zzzop.zzH(0L);
        zzZYQ.zzX(zzzop, zzzop2);
        zzZYQ.zzV(zzzop2, i2);
        refInt.set(zzAN.zzO(zzzop.getLength(), i2));
        while (true) {
            long j = ((long) i) & 4294967295L;
            if (j < refInt.get()) {
                zzzz5.add((int) ((4294967295L & ((long) iZzU)) + j));
                i++;
            } else {
                zzzz5.add(-2);
                return iZzU;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a4 A[EDGE_INSN: B:49:0x00a4->B:45:0x00a4 BREAK  A[LOOP:0: B:32:0x0064->B:44:0x009f], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzZOR zzZ(int i, int i2, int i3, boolean z) throws Exception {
        int i4;
        int iMin = Math.min(i2, i3);
        zzZOR zzzor = new zzZOR(iMin);
        zzzor.setLength(iMin);
        int i5 = 0;
        boolean z2 = z || this.zzP7.zzZZ((long) i2);
        if (!z2) {
            zzQT zzqtZzYl = this.zzP4.zzYl(0);
            int i6 = zzqtZzYl.zzLz;
            if (i6 != -1 && this.zzP3 == null) {
                long j = zzqtZzYl.zzLy;
                this.zzP3 = zzZ(i6, (int) j, (int) j, true);
            }
            if (this.zzP7.zzGq() == 0 || this.zzP3 == null) {
                zzzor.setLength(0L);
                return zzzor;
            }
        }
        zzZZ5 zzzz5 = z2 ? this.zzP6 : this.zzP5;
        zzZOP zzzop = z2 ? this.zzP8 : this.zzP3;
        int i7 = z2 ? 512 : 64;
        long position = zzzop.getPosition();
        while (i != -2 && i != -1) {
            long jZzD = zzZZ4.zzD(i, z2);
            if (position != jZzD) {
                if (jZzD > zzzop.getLength()) {
                    break;
                }
                zzzop.zzH(jZzD);
                position = jZzD;
                i4 = iMin - i5;
                if (i4 != 0) {
                }
            } else {
                i4 = iMin - i5;
                if (i4 != 0) {
                    break;
                }
                int iMin2 = Math.min(i7, i4);
                zzzop.read(zzzor.zziA(), i5, iMin2);
                i5 += iMin2;
                position += (long) iMin2;
                if ((((long) i) & 4294967295L) >= zzzz5.getCount()) {
                    break;
                }
                i = zzzz5.get(i);
            }
        }
        return zzzor;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzZ(zzQT zzqt, zzAA zzaa) throws Exception {
        zzAA zzaa2;
        zzQT zzqtZzZ;
        while (!zzqt.zzLx) {
            zzqt.zzLx = true;
            int i = zzqt.zzLI;
            if (i == 0) {
                return;
            }
            if (i == 1) {
                zzaa2 = new zzAA(zzqt.zzLD);
                if (zzqt.zzLI != 5 && this.zzBR == null) {
                    this.zzBR = zzaa2;
                } else {
                    zzaa.zzZ(zzqt.zzLJ, zzaa2);
                }
                zzqtZzZ = this.zzP4.zzZ(zzqt, zzqt.zzLE);
                if (zzqtZzZ != null) {
                    zzZ(zzqtZzZ, zzaa2);
                }
            } else if (i == 2) {
                long j = zzqt.zzLy;
                if (((int) j) >= 0) {
                    zzaa.zzZ(zzqt.zzLJ, zzZ(zzqt.zzLz, (int) j, (int) j, false));
                }
            } else {
                if (i != 5) {
                    throw new IllegalStateException("Unknown type of directory entry in the structured storage.");
                }
                zzaa2 = new zzAA(zzqt.zzLD);
                if (zzqt.zzLI != 5) {
                    zzaa.zzZ(zzqt.zzLJ, zzaa2);
                    zzqtZzZ = this.zzP4.zzZ(zzqt, zzqt.zzLE);
                    if (zzqtZzZ != null) {
                    }
                }
            }
            zzQT zzqtZzZ2 = this.zzP4.zzZ(zzqt, zzqt.zzLG);
            if (zzqtZzZ2 != null) {
                zzZ(zzqtZzZ2, zzaa);
            }
            zzqt = this.zzP4.zzZ(zzqt, zzqt.zzLF);
            if (zzqt == null) {
                return;
            }
        }
    }
}

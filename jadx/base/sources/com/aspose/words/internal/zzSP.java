package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzSP {
    private zzSL zzP2;
    private zzZOR zzP3;
    private zzQS zzP4;
    private zzZZ5 zzP5;
    private zzKH zzP6;
    private zzIH zzP7;
    private zzZOP zzP8;

    public zzSP(zzZOP zzzop) throws Exception {
        zzR(zzzop);
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
        this.zzP5 = new zzZZ5(zzT(zzih2.zzy2, zzih2.zzGq(), this.zzP7.zzGq()));
        zzSb();
    }

    private zzZOR zzS8() throws Exception {
        zzQT zzqtZzYl;
        int i;
        if (this.zzP7.zzGq() == 0) {
            this.zzP3 = new zzZOR(0);
        }
        if (this.zzP3 == null && (i = (zzqtZzYl = this.zzP4.zzYl(0)).zzLz) != -1) {
            long j = zzqtZzYl.zzLy;
            this.zzP3 = zzT(i, (int) j, (int) j);
        }
        return this.zzP3;
    }

    private void zzSa() throws Exception {
        zzZ(this.zzP4.zzYl(0), null);
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

    private zzZOR zzT(int i, int i2, int i3) throws Exception {
        int iMin = Math.min(i2, i3);
        zzZOR zzzor = new zzZOR(iMin);
        zzzor.setLength(iMin);
        zzKH zzkh = this.zzP6;
        zzZOP zzzop = this.zzP8;
        long position = zzzop.getPosition();
        int i4 = 0;
        while (i != -2 && i != -1) {
            long jZzD = zzZZ4.zzD(i, true);
            if (position != jZzD) {
                zzzop.zzH(jZzD);
                position = jZzD;
            }
            int i5 = iMin - i4;
            if (i5 == 0) {
                break;
            }
            int iMin2 = Math.min(512, i5);
            zzzop.read(zzzor.zziA(), i4, iMin2);
            i4 += iMin2;
            position += (long) iMin2;
            i = zzkh.get(i);
        }
        return zzzor;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzZ(zzQT zzqt, zzSL zzsl) throws Exception {
        zzSL zzsl2;
        zzQT zzqtZzZ;
        while (!zzqt.zzLx) {
            zzqt.zzLx = true;
            int i = zzqt.zzLI;
            if (i == 0) {
                return;
            }
            if (i == 1) {
                zzsl2 = new zzSL(zzqt.zzLD);
                if (zzqt.zzLI == 5 || this.zzP2 != null) {
                    zzsl.zzZ(zzqt.zzLJ, zzsl2);
                } else {
                    this.zzP2 = zzsl2;
                }
                zzqtZzZ = this.zzP4.zzZ(zzqt, zzqt.zzLE);
                if (zzqtZzZ != null) {
                    zzZ(zzqtZzZ, zzsl2);
                }
            } else if (i != 2) {
                if (i != 5) {
                    throw new IllegalStateException("Unknown type of directory entry in the structured storage.");
                }
                zzsl2 = new zzSL(zzqt.zzLD);
                if (zzqt.zzLI == 5) {
                    zzsl.zzZ(zzqt.zzLJ, zzsl2);
                    zzqtZzZ = this.zzP4.zzZ(zzqt, zzqt.zzLE);
                    if (zzqtZzZ != null) {
                    }
                }
            } else {
                int i2 = (int) zzqt.zzLy;
                boolean zZzZZ = this.zzP7.zzZZ(i2);
                zzsl.zzZ(zzqt.zzLJ, new zzSK(zZzZZ ? this.zzP8 : zzS8(), zZzZZ ? this.zzP6 : this.zzP5, zzqt.zzLz, i2, zZzZZ ? 512 : 64));
            }
            zzQT zzqtZzZ2 = this.zzP4.zzZ(zzqt, zzqt.zzLG);
            if (zzqtZzZ2 != null) {
                zzZ(zzqtZzZ2, zzsl);
            }
            zzqt = this.zzP4.zzZ(zzqt, zzqt.zzLF);
            if (zzqt == null) {
                return;
            }
        }
    }

    public final zzSL zzS9() throws Exception {
        if (this.zzP2 == null) {
            zzSa();
        }
        return this.zzP2;
    }
}

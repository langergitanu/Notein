package com.aspose.words;

import com.aspose.slides.C22213OooOoOO;
import com.aspose.words.ref.RefInt;

/* JADX INFO: loaded from: classes6.dex */
final class zzYI7 {
    private int zzXLL = zzYIB.zzP(zza6());
    private zzYCP zzXwG;
    private int zzXwH;
    private int zzXwI;
    private int zzXwJ;
    private int zzXwK;
    private int zzXwL;
    private zzYCP zzXwM;
    private zzY09 zzXwN;
    private int zzXwO;
    private int zzXwP;
    private int zzXwQ;
    private boolean zzXwR;
    private zzYIA zzXwS;
    private zzYIA zzXwY;
    private int zzXwZ;

    public zzYI7(zzYIA zzyia) throws Exception {
        this.zzXwY = zzyia;
        this.zzXwL = zzyia.zzZZJ().zz5X();
        this.zzXwK = zzyia.zzZZJ().zzZXT();
        zzYIC zzyic = (zzYIC) zza6().zzZXZ();
        int iZzZ = zzWU.zzZ((zzWV) zzyic.zzZXZ(), 1);
        int iZzZ2 = zzWU.zzZ((zzWV) ((zzWV) zzyic.zzZXY()).zzYTo(), 2);
        int iZzZ3 = zzWU.zzZ((zzWV) zzyic.zzZXZ(), 2);
        boolean z = zzyia.zza7().zzZYM() && !zzYji();
        this.zzXwR = z;
        if (z) {
            zzYIA zzyia2 = zzyia;
            while (!zzyia2.zzYjH()) {
                zzyia2 = (zzYIA) zzyia2.zzZXJ();
            }
            this.zzXwS = zzyia2;
            this.zzXwH = 0;
            this.zzXwJ = (-iZzZ) / 2;
            this.zzXwI = (-iZzZ2) / 2;
            int x = zzyia2.zz5T() ? (this.zzXwS.getX() + this.zzXwS.getWidth()) - this.zzXLL : this.zzXwS.getX();
            int i = this.zzXLL + x;
            this.zzXwP = x;
            this.zzXwG = new zzYCP(Math.max(x + this.zzXwJ, this.zzXwL), Math.min(i - this.zzXwI, this.zzXwK));
        } else {
            this.zzXwS = zzyia;
            this.zzXwJ = zzWU.zzV((zzWV) ((zzYIC) zza6().zzZXZ()).zzZXZ());
            this.zzXwI = zzWU.zzT((zzWV) ((zzWV) this.zzXwY.zza5().zzZXY()).zzYTo());
            this.zzXwH = ((zzZ3B) ((zzWT) this.zzXwY.zz6x()).zza4().zzYTt()).getRightPadding();
            if (this.zzXwY.zza5().zzYk4()) {
                this.zzXwH = C22213OooOoOO.OooO0O0(zzyia.zza5().zzYKt(), 2, this.zzXwH, iZzZ3);
            }
            this.zzXwP = zzyia.getX();
            this.zzXwG = zzYCP.zzXnG;
        }
        this.zzXwQ = this.zzXwS.zzYjB() ? zza6().zzXYi() : 0;
        this.zzXwO = zzyia.getY() - zzYjk();
        this.zzXwZ = this.zzXwY.zzZZJ().zz60() == 1024 ? ((zzZKY) this.zzXwY.zzZZJ()).zzZ4Q() : zzYjj() ? this.zzXwY.zzZZJ().getHeight() : 1073741823;
    }

    private zzY5N zz5O() {
        zzTF zztfZzZZJ = this.zzXwY.zzZZJ();
        return zzYji() ? ((zzWT) zztfZzZZJ).zzYG(false) : zztfZzZZJ.zzZ8m().zzYG(false);
    }

    private boolean zzO(RefInt refInt) throws Exception {
        boolean zZzp7;
        zzYIA zzyia = this.zzXwS;
        int iZzYjd = (zzYjd() + zzYje()) - (this.zzXwJ + this.zzXwI);
        if (this.zzXwR) {
            zZzp7 = zzp6(iZzYjd);
            int iZzZ = zzYIB.zzZ(zzyia, this.zzXwM.getStart(), this.zzXwM.getEnd());
            if (this.zzXwY.zz5T()) {
                refInt.set((zzYIB.zzZ(zzyia, iZzZ, this.zzXwM.getStart(), this.zzXwM.getEnd()) + zzyia.getWidth()) - this.zzXLL);
            } else {
                refInt.set(iZzZ);
            }
        } else if (zzyia.zz5T()) {
            refInt.set(zzYjm());
            zZzp7 = zzp7(refInt.get() + zzYjd());
        } else {
            zZzp7 = zzp6(iZzYjd);
            boolean z = ((zzYIC) zzyia.zza9()).zzYk1().getAlignment() == 2 && !zzyia.zza7().getLayoutRawTableWidth();
            if (zZzp7 && z) {
                zZzp7 = ((zzZ3B) ((zzWV) ((zzWT) zzyia.zz6x()).zza9()).zzYTt()).getLeftPadding() <= ((zzZ3B) ((zzWV) ((zzWV) ((zzYIC) zzyia.zza9()).zzZXY()).zzYTo()).zzYTt()).getRightPadding();
            }
            refInt.set(zzYIB.zzZ(zzyia, this.zzXwM.getStart(), this.zzXwM.getEnd()));
        }
        if (zZzp7) {
            zza6().zzVc(this.zzXwM.getStart(), this.zzXwM.getEnd());
        }
        return zZzp7;
    }

    private void zzR(boolean z, int i) {
        if (z) {
            zza6().zzjY(i);
            if (this.zzXwR) {
                this.zzXwS.zzYjE();
                zza6().zzjZ(i);
            }
        }
    }

    private boolean zzS(boolean z, int i) {
        boolean z2 = !z ? i != 2 : i != 0;
        return z ? !this.zzXwR || z2 : this.zzXwR && z2;
    }

    private boolean zzV(int i, RefInt refInt) throws Exception {
        zzYIA zzyia = this.zzXwS;
        int iZzYjd = zzYjd();
        if (!zzyia.zz5T()) {
            int start = this.zzXwM.getStart();
            refInt.set(start + i);
            boolean zZzp6 = zzp6((iZzYjd + i) - this.zzXwI);
            zzR(zZzp6, start);
            return zZzp6;
        }
        int iMax = Math.max(zza6().zzXYb(), zzYjh());
        int i2 = (this.zzXwK - i) + iMax;
        boolean zZzp7 = zzp7(i2);
        refInt.set(i2 - iZzYjd);
        zzR(zZzp7, iMax);
        return zZzp7;
    }

    private zzY09 zzVZ(int i, int i2) throws Exception {
        zzYBL zzybl = (zzYBL) this.zzXwY.zzZZJ();
        long jZzYjl = zzYjl();
        int i3 = (int) jZzYjl;
        int i4 = (int) (jZzYjl >> 32);
        zzY09 zzy09ZzZ = zz5O().zzZ(new com.aspose.words.internal.zzZQ5(zzybl.zz5X() + i3, i + i4, zzybl.zzZXS(), i2), this.zzXwZ + i4, zzybl);
        zzy09ZzZ.offset(-i3, -i4);
        return zzy09ZzZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0099 A[LOOP:0: B:15:0x0051->B:26:0x0099, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009b A[EDGE_INSN: B:48:0x009b->B:27:0x009b BREAK  A[LOOP:0: B:15:0x0051->B:26:0x0099], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private long zzW0(int i, int i2) throws Exception {
        int i3;
        int i4;
        boolean zZzV;
        int i5;
        boolean zZzY = false;
        int iZzP = this.zzXwS.zzYjE() ? 0 : zzYIB.zzP(this.zzXwS);
        int size = this.zzXwN.zzyD().size() - 1;
        if (zzS(this.zzXwS.zz5T(), ((zzYIC) this.zzXwS.zza9()).zzYk1().getAlignment())) {
            i3 = -1;
            i4 = 0;
        } else {
            i3 = 1;
            i4 = size;
            size = 0;
        }
        if (!this.zzXwR && this.zzXwN.zzyD().size() > 0) {
            i4 = size;
        }
        while (size != i4 + i3) {
            this.zzXwM = this.zzXwN.zzyD().get(size);
            if (this.zzXwS.zzYjE()) {
                RefInt refInt = new RefInt(i);
                zZzV = zzO(refInt);
                i5 = refInt.get();
            } else if (this.zzXwR) {
                zZzY = this.zzXwG.zzY(this.zzXwM);
                if (!zZzY) {
                    break;
                }
                size += i3;
            } else {
                RefInt refInt2 = new RefInt(i);
                zZzV = zzV(iZzP, refInt2);
                i5 = refInt2.get();
            }
            int i6 = i5;
            zZzY = zZzV;
            i = i6;
            if (!zZzY) {
            }
        }
        if (!zZzY) {
            i2 = this.zzXwN.zzXRV();
            if (this.zzXwR) {
                i = this.zzXwP;
            } else if (this.zzXwS.zzYjE()) {
                i = zzYIB.zzU(this.zzXwS);
                zza6().zzVc(this.zzXwL, this.zzXwK);
            } else {
                int iZzXYc = (this.zzXwR || this.zzXwY.zzYnZ()) ? zza6().zzXYc() : this.zzXwL;
                zza6().zzjY(iZzXYc);
                i = this.zzXwY.zz5T() ? zzYIB.zzY(this.zzXwY, iZzP) : iZzXYc + iZzP;
            }
        }
        return com.aspose.words.internal.zzZPZ.zzZm(i, i2);
    }

    private void zzW1(int i, int i2) throws Exception {
        boolean z;
        int i3 = i - this.zzXwP;
        int i4 = i2 - this.zzXwO;
        zzYIA zzyia = this.zzXwS;
        do {
            zzyia.setX(zzyia.getX() + i3);
            zzyia.setY(zzyia.getY() + i4);
            z = zzyia == this.zzXwY;
            zzyia = (zzYIA) com.aspose.words.internal.zzZKW.zzZ(zzyia.zzZXK(), zzYIA.class);
        } while (!z);
    }

    private int zzYjd() throws Exception {
        return this.zzXwR ? this.zzXLL : this.zzXwY.getWidth();
    }

    private int zzYje() {
        if (!this.zzXwR || ((zzYIC) zza6().zzZXZ()).zzYk1().getAlignment() == 0) {
            return zza6().zzY6a().zzYM7();
        }
        return 0;
    }

    private int zzYjf() {
        return this.zzXwK - zzYjg();
    }

    private int zzYjg() {
        return this.zzXwM.getStart() - this.zzXwL;
    }

    private int zzYjh() {
        return this.zzXwK - this.zzXwM.getEnd();
    }

    private boolean zzYji() {
        return this.zzXwY.zzZZJ().zz60() == 16;
    }

    private boolean zzYjj() {
        return this.zzXwY.zzZZJ().zz60() == 2;
    }

    private int zzYjk() throws Exception {
        return (this.zzXwY.getY() - this.zzXwS.getY()) + this.zzXwQ;
    }

    private long zzYjl() throws Exception {
        zzYBL zzybl = (zzYBL) this.zzXwY.zzZZJ();
        if (zzYji()) {
            return 0L;
        }
        return com.aspose.words.internal.zzZPZ.zzZm(zzybl.getX(), zzybl.getY());
    }

    private int zzYjm() throws Exception {
        int iZzU;
        int iZzYjh;
        int alignment = ((zzYIC) this.zzXwY.zza9()).zzYk1().getAlignment();
        if (alignment == 0) {
            iZzU = zzYIB.zzU(this.zzXwY);
            iZzYjh = zzYjh();
        } else {
            if (alignment != 1) {
                ((zzYIC) this.zzXwY.zza9()).zzYk1().getAlignment();
                return (zzYjh() * 2) + zzYIB.zzU(this.zzXwY) + zzYjg();
            }
            iZzYjh = (zzYjh() * 2) + zzYIB.zzZ(zza6(), 1, this.zzXwM.getStart(), this.zzXwM.getEnd());
            iZzU = zzYIB.zzP(zza6()) - zzYIB.zzU((zzYIC) this.zzXwY.zza9());
        }
        return iZzU + iZzYjh;
    }

    private int zzYjn() throws Exception {
        int iZz56 = this.zzXwQ + this.zzXwS.zz56();
        if (!this.zzXwS.zzYjE() || !((zzYIC) this.zzXwS.zza9()).zzYk1().zzBz()) {
            return iZz56;
        }
        zzYIA zzyia = this.zzXwS;
        int height = 0;
        while (zzyia != this.zzXwY && ((zzYIC) zzyia.zza9()).zzBz()) {
            height += zzyia.getHeight();
            zzyia = (zzYIA) zzyia.zzZXK();
        }
        int iZz562 = height + zzyia.zz56();
        zza6().zzhk();
        return iZz562;
    }

    private int zzYjo() throws Exception {
        int i;
        int i2;
        boolean z;
        int iZzI = zzYIB.zzI(this.zzXwY) + zzYjk();
        int i3 = this.zzXwO;
        int i4 = this.zzXwP;
        boolean z2 = true;
        while (true) {
            zzY09 zzy09ZzVZ = zzVZ(i3, iZzI);
            this.zzXwN = zzy09ZzVZ;
            if (!zzy09ZzVZ.zzXRU()) {
                break;
            }
            if (this.zzXwY.zzYjE() && zza6().zzXYn()) {
                this.zzXwY.zzZZJ();
                return 1;
            }
            long jZzW0 = zzW0(i4, i3);
            i = (int) (jZzW0 >> 32);
            boolean z3 = i == i3;
            i2 = (int) jZzW0;
            z = i < this.zzXwZ;
            if (z3 || !z) {
                break;
            }
            i3 = i;
            i4 = i2;
            z2 = z;
        }
        i3 = i;
        i4 = i2;
        z2 = z;
        if (this.zzXwR) {
            boolean z4 = iZzI + i3 <= this.zzXwZ;
            boolean z5 = this.zzXwS.zzYnZ() && (this.zzXwY.zzZZJ().zz60() == 2 && ((zzZ35) ((zzZ2D) ((zzUZ) this.zzXwY.zzZZJ()).zza9()).zzYTt()).getColumnsCount() == 1) && i3 < this.zzXwZ;
            if (!z4 && !z5) {
                long jZzp8 = zzp8(i3);
                i4 = (int) jZzp8;
                i3 = (int) (jZzp8 >> 32);
            }
        } else if (!z2 && zzYjj()) {
            zzUZ zzuz = (zzUZ) this.zzXwY.zzZZJ();
            if (this.zzXwY.zzYnZ() && zzuz.zz0m()) {
                i3 = this.zzXwO;
            }
        }
        zzW1(i4, i3);
        return 0;
    }

    private boolean zzYjp() {
        if (this.zzXwY.zzZXN() != null) {
            return false;
        }
        if (this.zzXwY.zzaa().zzbD()) {
            return true;
        }
        return this.zzXwY.zzaa().zzZ4E() && (zzYji() || this.zzXwY.zza7().zzZYM());
    }

    private zzY6N zza6() {
        return (zzY6N) ((zzYIC) this.zzXwY.zza9()).zza9();
    }

    private boolean zzp6(int i) throws Exception {
        return this.zzXwY.zza7().getLayoutRawTableWidth() ? this.zzXwY.getWidth() <= this.zzXwM.getLength() : i <= this.zzXwM.getLength() && this.zzXwM.getLength() > 0;
    }

    private boolean zzp7(int i) throws Exception {
        return this.zzXwY.zza7().getLayoutRawTableWidth() ? this.zzXwY.getWidth() <= this.zzXwM.getLength() : i - this.zzXwH <= zzYjf();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007e A[PHI: r12
      0x007e: PHI (r12v4 int) = (r12v3 int), (r12v6 int) binds: [B:10:0x005b, B:17:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private long zzp8(int i) throws Exception {
        int i2;
        zzY5N zzy5nZz5O = zz5O();
        long jZzYjl = zzYjl();
        int iMin = Math.min(i, this.zzXwZ);
        int i3 = this.zzXwP;
        int i4 = (int) (jZzYjl >> 32);
        com.aspose.words.internal.zzDB zzdbZzV6 = zzy5nZz5O.zzV6(this.zzXwO + i4, iMin + i4);
        if (i4 != 0) {
            for (int i5 = 0; i5 < zzdbZzV6.getCount(); i5++) {
                zzdbZzV6.set(i5, zzdbZzV6.get(i5) - i4);
            }
        }
        int iZzYjk = zzYjk() + this.zzXwY.zz0t();
        int iZzYjn = zzYjn();
        zzdbZzV6.zz4(0, this.zzXwO);
        zzdbZzV6.zz4(zzdbZzV6.getCount(), iMin);
        int count = zzdbZzV6.getCount();
        int i6 = count - 1;
        while (true) {
            i2 = zzdbZzV6.get(i6);
            if (i2 + iZzYjn <= this.zzXwZ) {
                zzY09 zzy09ZzVZ = zzVZ(i2, iZzYjk);
                this.zzXwN = zzy09ZzVZ;
                if (!zzy09ZzVZ.zzXRU()) {
                    break;
                }
                long jZzW0 = zzW0(i3, i2);
                if (i2 == ((int) (jZzW0 >> 32))) {
                    i3 = (int) jZzW0;
                    break;
                }
                count--;
                this.zzXwZ = zzdbZzV6.get(count);
                if (count == i6) {
                    i6--;
                }
                if (i6 < 0) {
                    break;
                }
            }
        }
        return com.aspose.words.internal.zzZPZ.zzZm(i3, i2);
    }

    public final int zzYjq() throws Exception {
        if (this.zzXwY.zzYjE()) {
            zza6().zzVc(this.zzXwL, this.zzXwK);
        } else if (this.zzXwY.zzYnZ()) {
            zza6().zzjY(zza6().zzXYc());
        }
        if (!zzYjp()) {
            return 0;
        }
        zza6();
        if (zz5O() == null) {
            return 0;
        }
        return zzYjo();
    }

    public final int zzYjw() {
        return this.zzXwZ;
    }
}

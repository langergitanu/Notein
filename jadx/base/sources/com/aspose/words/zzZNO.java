package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZNO {
    private boolean zzYy1;
    private zzUZ zzYy2;
    private boolean zzYy3;
    private zzZ39 zzYy7;
    private zzYMD zzYy8;
    private zzYMD zzYy9;
    private Object zzYya;
    private zzTF zzZss;
    private int zzZst = Integer.MIN_VALUE;
    private int zzYy6 = 0;
    private zzXR zzYy5 = null;
    private zzXR zzYy4 = null;

    public zzZNO(Object obj, zzZ39 zzz39, zzYMD zzymd, zzYMD zzymd2) {
        this.zzYya = obj;
        this.zzYy7 = zzz39;
        this.zzYy9 = zzymd;
        this.zzYy8 = zzymd2;
    }

    public static zzZNO zzQ(zzYMD zzymd) {
        if (!zzymd.zzaa().zzZZB()) {
            return null;
        }
        zzZNO zzznoZzN = zzZNH.zzN(zzymd);
        if (zzznoZzN == null && (zzznoZzN = zzZNM.zzO(zzymd)) != null && zzznoZzN.zzhk()) {
            return null;
        }
        return zzznoZzN == null ? zzZNG.zzL(zzymd) : zzznoZzN;
    }

    public static zzZNO zzR(zzYMD zzymd) throws Exception {
        return zzZ((zzZNO) null, zzymd);
    }

    private int zzXr(int i, int i2) {
        if (zzhk() && zzZ8Y()) {
            i = Math.max(i, ((zzWT) zzZZJ()).zz5W() + i2);
        }
        return zzXw(i, i2);
    }

    private long zzZ8U() {
        int iZzZXQ;
        if (zzhk()) {
            iZzZXQ = ((zzWT) zzZZJ()).zzZXQ();
        } else {
            iZzZXQ = this.zzZst;
            if (iZzZXQ == Integer.MIN_VALUE) {
                iZzZXQ = 0;
            }
        }
        return com.aspose.words.internal.zzZPZ.zzZm(0, iZzZXQ);
    }

    private zzTF zzZ8i() {
        return zzhk() ? this.zzYy9.zzYnX() : this.zzYy9.zzZ8m();
    }

    private void zzZ8r() {
        this.zzYy2 = (zzUZ) this.zzYy9.zzqh(2);
    }

    public static int zzh(int i, int i2, int i3) {
        return i + i2 > i3 ? i3 - i2 : i;
    }

    public final void unregister() throws Exception {
        if (zzZ8Y() && zzZZJ().isActive()) {
            (zzhk() ? ((zzWT) zzZZJ()).zz5O() : ((zzYN8) zzZZJ()).zzYG(true)).zzYQ(this.zzYya);
        }
    }

    public final int zzBC(int i) throws Exception {
        return zzXs(i, 0);
    }

    public final int zzBD(int i) throws Exception {
        return zzXv(i, 0);
    }

    public boolean zzBE(int i) throws Exception {
        return (zzbD() || zzhk() || !this.zzYy7.zzYMc() || this.zzYy9.zzYnZ() || zzZ8y() + this.zzYy8.getBottom() <= i) ? false : true;
    }

    public final void zzMG(int i) {
        zzhk();
        this.zzZst = i;
    }

    public final void zzP(zzYMD zzymd) {
        this.zzYy8 = zzymd;
    }

    public abstract zzXR zzU(zzXR zzxr) throws Exception;

    public zzY0B zzV(zzTF zztf) {
        return new zzY0B(zztf);
    }

    public final void zzVG(boolean z) {
        this.zzYy1 = z;
    }

    public final zzXR zzVH(boolean z) throws Exception {
        if (this.zzYy4 == null) {
            zzTF zztf = this.zzZss;
            if (zztf != null && zztf.zzab().zzZoQ()) {
                zzZ8Y();
                return zzU(zzZ8p());
            }
            if (z) {
                this.zzYy4 = zzU(zzVI(true));
            }
        }
        return this.zzYy4;
    }

    public final zzXR zzVI(boolean z) throws Exception {
        if (this.zzYy5 == null) {
            zzTF zztf = this.zzZss;
            if (zztf != null && zztf.zzab().zzZoQ()) {
                zzZ8Y();
                return zzZ8p();
            }
            if (z) {
                this.zzYy5 = zzZ8p();
                zzZ8r();
                this.zzYy5.zz7G();
            }
        }
        return this.zzYy5;
    }

    public final void zzVJ(boolean z) {
        this.zzYy3 = z;
    }

    public final void zzW(zzXR zzxr) throws Exception {
        this.zzYy5 = zzxr;
        zzZ8r();
        this.zzYy4 = zzU(this.zzYy5);
    }

    public int zzXp(int i, int i2) {
        if (zzhk()) {
            zzZ8Y();
        }
        return Math.max(i, i2);
    }

    public int zzXq(int i, int i2) throws Exception {
        return i;
    }

    public final int zzXs(int i, int i2) throws Exception {
        zzYCP zzycpZzZ8l = zzZ8l();
        int start = zzycpZzZ8l.getStart();
        int end = zzycpZzZ8l.getEnd();
        int verticalAlignment = this.zzYy7.getVerticalAlignment();
        if (this.zzYy7.zzYMe()) {
            if (zzhk()) {
                verticalAlignment = 1;
            } else if (!((zzYN8) this.zzYy9.zzqh(1)).zzYqk()) {
                if (verticalAlignment == 4) {
                    verticalAlignment = 5;
                } else if (verticalAlignment == 5) {
                    verticalAlignment = 4;
                }
            }
        }
        int iZzZ8t = -i2;
        if (verticalAlignment != 1) {
            if (verticalAlignment == 2) {
                return (((start + end) - i) / 2) + iZzZ8t;
            }
            if (verticalAlignment != 3) {
                if (verticalAlignment != 4) {
                    if (verticalAlignment != 5) {
                        int top = this.zzYy7.getTop() + start;
                        if (this.zzYy7.getHorizontalAlignment() != 0 && !zzZZJ().zzab().zza7().zzZYM()) {
                            top += Math.max(0, iZzZ8t);
                        }
                        if (zzhk()) {
                            if (((zzWV) ((zzWT) zzZZJ()).zza9()).zz6m() == 0) {
                                top = zzXq(top, i);
                            }
                        } else if (zzZ8v()) {
                            int i3 = i2 + i;
                            int iZzZ8u = zzZ8u();
                            boolean z = this.zzYy7.zzYMd() == 2 || this.zzYy7.zzYMd() == 3;
                            if (zzZ99() == 25604 && zzZZJ().zza7().zzZYM() && z) {
                                this.zzYy1 = (top + i3 > iZzZ8u) && !(start + ((zzZ55) ((zzY9X) this.zzYya).zzZZJ()).getHeight() < iZzZ8u - i3);
                            }
                            top = zzh(top, i3, iZzZ8u);
                            iZzZ8t += zzZ8t();
                        }
                        return zzXr(top, iZzZ8t);
                    }
                }
            }
            return (end - i) + iZzZ8t;
        }
        return start + iZzZ8t;
    }

    public int zzXt(int i, int i2) throws Exception {
        return i;
    }

    public final int zzXu(int i, int i2) throws Exception {
        zzYCP zzycpZzZ8C = zzZ8C();
        int start = zzycpZzZ8C.getStart();
        int end = zzycpZzZ8C.getEnd();
        int iZzZ8o = zzZ8o();
        if (iZzZ8o == -2) {
            zzhk();
            return start - i;
        }
        if (iZzZ8o != -1) {
            return iZzZ8o != 1 ? iZzZ8o != 2 ? iZzZ8o != 3 ? start + this.zzYy7.getLeft() : (end - i) + i2 : (((start + end) - i) / 2) + i2 : start + i2;
        }
        zzhk();
        return start;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0065, code lost:
    
        if (r7.zzYy7.zzYMf() == 2) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzXv(int i, int i2) throws Exception {
        int i3 = -i2;
        int iZzXu = zzXu(i, i3);
        if (zzhk()) {
            int iZzXt = zzXt(iZzXu, i);
            return zzZ8Y() ? zzXp(iZzXt, i3) : iZzXt;
        }
        int i4 = i2 + i;
        boolean z = false;
        boolean z2 = this.zzYy7.zzYMf() == 1;
        int iZzZ8o = zzZ8o();
        if (iZzZ8o == 1) {
            if (z2 && this.zzYy7.getHorizontalAlignment() == 3) {
                z = true;
            }
            if (zzZ8w() || z) {
                iZzXu = zzh(iZzXu, i4, zzZ8m().getWidth());
            }
            return zzXw(iZzXu, i3);
        }
        if (iZzZ8o != 2) {
            if (iZzZ8o != 3) {
                if (zzZ8w()) {
                    iZzXu = zzh(iZzXu, i4, zzZ8m().getWidth());
                }
                return zzXw(iZzXu, i3);
            }
            if (z2 && this.zzYy7.getHorizontalAlignment() == 1) {
                z = true;
            }
            if (zzZ8w() || z) {
                return Math.max(iZzXu, i3);
            }
            return iZzXu;
        }
    }

    public int zzXw(int i, int i2) {
        return Math.max(i, i2);
    }

    public final zzXR zzXx(int i, int i2) throws Exception {
        if (this.zzYy7.getWrapType() != 1 && this.zzYy7.getWrapSide() == 0) {
            return zzVH(false);
        }
        com.aspose.words.internal.zzZQ5 zzzq5 = new com.aspose.words.internal.zzZQ5(i, zzVH(false).getY(), i2, zzVH(false).getHeight());
        int wrapSide = this.zzYy7.getWrapSide();
        if (this.zzYy7.getWrapSide() == 1 && this.zzYy7.getWrapType() == 2 && !zzZZJ().zza7().zzZYM() && zzVH(false).getX() - i < zzZ98()) {
            wrapSide = 0;
        }
        return zzVH(false).zzZ(this.zzYy7.getWrapType(), wrapSide, zzzq5);
    }

    public void zzZ(zzXR zzxr, boolean z) throws Exception {
    }

    public com.aspose.words.internal.zzZQ5 zzZ8A() throws Exception {
        return zzVH(false).zz7G();
    }

    public final boolean zzZ8B() {
        return this.zzYy1;
    }

    public final zzYCP zzZ8C() throws Exception {
        int pageWidth;
        int iZzYMf = this.zzYy7.zzYMf();
        zzYN8 zzyn8ZzZ8m = zzZ8m();
        boolean zZzYqk = zzyn8ZzZ8m.zzYqk();
        if (iZzYMf == 7 && !zZzYqk) {
            iZzYMf = 6;
        } else if (iZzYMf == 6 && !zZzYqk) {
            iZzYMf = 7;
        }
        int iZzZ7J = 0;
        if (zzhk()) {
            zzWT zzwt = (zzWT) zzZZJ();
            if (iZzYMf == 0) {
                iZzZ7J = zzwt.zz5X();
                pageWidth = zzwt.zzZXT();
            } else if (iZzYMf == 1) {
                pageWidth = zzwt.getWidth();
            } else if (iZzYMf == 3) {
                iZzZ7J = ((zzZNH) this).zzZ7S();
                pageWidth = iZzZ7J;
            } else if (iZzYMf == 4) {
                pageWidth = zzwt.zz5X();
            } else if (iZzYMf == 5 || iZzYMf == 6) {
                iZzZ7J = zzwt.zzZXT();
                pageWidth = zzwt.getWidth();
            } else {
                if (iZzYMf != 7) {
                    return zzZ8q();
                }
                pageWidth = zzwt.zz5X();
            }
        } else {
            if (iZzYMf == 1) {
                int horizontalAlignment = this.zzYy7.getHorizontalAlignment();
                if (horizontalAlignment == 1) {
                    iZzYMf = 4;
                } else if (horizontalAlignment == 3) {
                    iZzYMf = 5;
                }
                if (zzZ8k()) {
                    iZzYMf = 2;
                }
            }
            zzZ2D zzz2d = (!zzbD() || (zzZ99() == 25604 && zzyn8ZzZ8m.zza7().zzZYM())) ? (zzZ2D) zzyn8ZzZ8m.zza9() : (zzZ2D) this.zzYy9.zza9().zzYTk();
            long jZzZ = zzZ(zzz2d, zZzYqk);
            if (iZzYMf == 0) {
                iZzZ7J = (int) jZzZ;
                pageWidth = (int) (jZzZ >> 32);
            } else if (iZzYMf == 1) {
                pageWidth = ((zzZ35) zzz2d.zzYTt()).getPageWidth();
            } else if (iZzYMf == 3) {
                iZzZ7J = ((zzZNH) this).zzZ7J();
                pageWidth = iZzZ7J;
            } else if (iZzYMf == 4) {
                pageWidth = (int) jZzZ;
            } else if (iZzYMf == 5 || iZzYMf == 6) {
                iZzZ7J = (int) (jZzZ >> 32);
                pageWidth = ((zzZ35) zzz2d.zzYTt()).getPageWidth();
            } else {
                if (iZzYMf != 7) {
                    return zzZ8q();
                }
                pageWidth = (int) jZzZ;
            }
        }
        return new zzYCP(iZzZ7J, pageWidth);
    }

    public final zzZNL zzZ8D() {
        int iZzZ8Z = zzZ8Z();
        if (iZzZ8Z == 1) {
            return ((zzYN8) zzZZJ()).zzYE(true);
        }
        if (iZzZ8Z == 2) {
            return ((zzWT) zzZZJ()).zz5M();
        }
        if (iZzZ8Z == 3) {
            return ((zzYN8) zzZZJ()).zzYF(true);
        }
        if (iZzZ8Z == 4) {
            return ((zzWT) zzZZJ()).zz5N();
        }
        throw new IllegalStateException("Unexpected floater impact value.");
    }

    public final zzTC zzZ8E() {
        zzTC zztcZzZ92 = zzZ92();
        return (zzZ8Z() == 4 || this.zzYy9.zzqh(16) == null) ? zztcZzZ92 : zzYJP.zzn(zztcZzZ92);
    }

    public final boolean zzZ8F() {
        for (zzYMD zzymdZzZZJ = this.zzYy9; zzymdZzZZJ != null; zzymdZzZZJ = zzymdZzZZJ.zzZZJ()) {
            if (zzymdZzZZJ == zzZZJ()) {
                return false;
            }
        }
        return true;
    }

    public final zzZ39 zzZ8G() {
        return this.zzYy7;
    }

    public final boolean zzZ8H() {
        if (zzhk() || this.zzYy2 == null) {
            return false;
        }
        return zzW(this.zzYy2, (zzUZ) this.zzYy9.zzqh(2));
    }

    public final zzUZ zzZ8I() {
        return this.zzYy2;
    }

    public void zzZ8J() throws Exception {
    }

    public final void zzZ8K() throws Exception {
        zzW(zzZ8p());
    }

    public final zzXR zzZ8L() throws Exception {
        return zzU(zzZ8p());
    }

    public int zzZ8M() {
        return this.zzYy7.zzYMi();
    }

    public int zzZ8N() {
        return this.zzYy7.zzYMk();
    }

    public zzXR zzZ8O() throws Exception {
        return zzVH(false);
    }

    public final void zzZ8P() {
        this.zzYy2 = null;
    }

    public void zzZ8Q() {
        this.zzYy5 = null;
        this.zzYy4 = null;
        this.zzYy1 = false;
        this.zzYy2 = null;
    }

    public final zzXR zzZ8R() throws Exception {
        return zzVH(false);
    }

    public final long zzZ8S() throws Exception {
        long jZzZ = zzhk() ? zzYMD.zzZ(zzZZJ(), 1, true, false) : 0L;
        zzXR zzxrZzVI = zzVI(true);
        return com.aspose.words.internal.zzZPZ.zzZm(((int) zzxrZzVI.zzZE()) + ((int) jZzZ) + ((int) zzZ8U()), ((int) (zzxrZzVI.zzZE() >> 32)) + ((int) (jZzZ >> 32)) + ((int) (zzZ8U() >> 32)));
    }

    public final boolean zzZ8T() {
        return this.zzYy5 != null;
    }

    public final zzXR zzZ8V() throws Exception {
        return zzVI(false);
    }

    public final boolean zzZ8W() {
        Object obj = this.zzYya;
        if ((obj instanceof zzZ6T) && ((zzZ6T) obj).zza9() == null) {
            return true;
        }
        Object obj2 = this.zzYya;
        return (obj2 instanceof zzY9X) && ((zzY9X) obj2).zza9() == null;
    }

    public final boolean zzZ8X() {
        return this.zzYy3;
    }

    public final boolean zzZ8Y() {
        return zzZ8Z() == 3 || zzZ8Z() == 4;
    }

    public final int zzZ8Z() {
        if (this.zzYy6 == 0) {
            this.zzYy6 = zzYJP.zzZ1(this.zzYya);
        }
        return this.zzYy6;
    }

    public final boolean zzZ8h() throws Exception {
        if (zzZ99() == 25604) {
            return false;
        }
        zzTC zztc = (zzTC) this.zzYy9;
        zzYBL zzybl = (zzYBL) zztc.zzZZJ();
        do {
            zztc = (zzTC) zzybl.zzh(zztc);
            if (zztc == null) {
                break;
            }
        } while (!zzY39.zzJ(zztc));
        return zztc != null;
    }

    public final zzYCP zzZ8j() throws Exception {
        zzYN8 zzyn8ZzZ8m = zzZ8m();
        int iZzYqo = zzyn8ZzZ8m.zzYqo();
        int iZzYqn = zzyn8ZzZ8m.zzYqn();
        zzZ2D zzz2d = (zzZ2D) zzyn8ZzZ8m.zza9();
        zzYCT zzyctZzYTk = this.zzYy9.zza9().zzYTk();
        boolean z = zzyctZzYTk.zzaa().zzbD() && zzz2d != zzyctZzYTk;
        if (z) {
            zzZ2D zzz2d2 = (zzZ2D) zzyctZzYTk;
            int iZzTr = zzz2d2.zzTr(zzyn8ZzZ8m.zzYqk());
            if (iZzYqo < iZzTr) {
                iZzYqo = iZzTr;
            }
            int height = zzyn8ZzZ8m.getHeight() - Math.abs(((zzZ35) zzz2d2.zzYTt()).zzZRf());
            if (height < iZzYqn) {
                iZzYqn = height;
            }
        }
        if (zzZ99() != 25604) {
            iZzYqo = z ? ((zzZ35) ((zzZ2D) zzyctZzYTk).zzYTt()).zzZRg() : zzz2d.zzTr(zzyn8ZzZ8m.zzYqk());
            iZzYqn = zzyn8ZzZ8m.getHeight() - (z ? (zzZ35) ((zzZ2D) zzyctZzYTk).zzYTt() : (zzZ35) zzz2d.zzYTt()).zzZRf();
        }
        return new zzYCP(iZzYqo, iZzYqn);
    }

    public final boolean zzZ8k() {
        zzZNO zzznoZzZXN;
        return zzZ99() == 25604 && zzZZJ().zza7().zzZYM() && (zzznoZzZXN = ((zzZ55) ((zzY9X) this.zzYya).zzZZJ()).zzZXN()) != null && zzznoZzZXN.zzZ99() == 21537;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzYCP zzZ8l() throws Exception {
        int end;
        int iZzZ7R;
        zzYIA zzyia;
        if (zzhk()) {
            zzWT zzwt = (zzWT) this.zzYy9.zzqh(16);
            int iZzYMd = this.zzYy7.zzYMd();
            if (iZzYMd == 0) {
                iZzZ7R = zzwt.zz5W();
            } else {
                if (iZzYMd == 1) {
                    return zzZ8x();
                }
                if (iZzYMd == 3) {
                    iZzZ7R = ((zzZNH) this).zzZ7R();
                } else if (iZzYMd != 4 && iZzYMd != 5 && iZzYMd != 6 && iZzYMd != 7) {
                    iZzZ7R = zzZ8y();
                }
            }
            return new zzYCP(iZzZ7R, end);
        }
        int iZzYMd2 = this.zzYy7.zzYMd();
        zzYN8 zzyn8 = (zzYN8) this.zzYy9.zzqh(1);
        if (!zzyn8.zzYqk()) {
            if (iZzYMd2 == 6) {
                iZzYMd2 = 7;
            } else if (iZzYMd2 == 7) {
                zzyn8.zza7();
                iZzYMd2 = 6;
            }
        }
        zzYCP zzycpZzZ8j = zzZ8j();
        int start = zzycpZzZ8j.getStart();
        end = zzycpZzZ8j.getEnd();
        if (iZzYMd2 == 0) {
            iZzZ7R = start;
        } else {
            if (iZzYMd2 == 1) {
                return zzZ8x();
            }
            if (iZzYMd2 == 3) {
                iZzZ7R = ((zzZNH) this).zzZ7R();
            } else if (iZzYMd2 == 4) {
                iZzZ7R = 0;
                end = start;
            } else if (iZzYMd2 == 5) {
                end = zzyn8.getHeight();
                iZzZ7R = end;
            } else if (iZzYMd2 != 6) {
                if (iZzYMd2 != 7) {
                    if (zzZ99() != 25604 || (zzyia = (zzYIA) this.zzYy9.zzqh(8)) == null) {
                        iZzZ7R = zzZ8y();
                    } else {
                        while (zzyia.zzZZJ().zz60() == 16) {
                            zzyia = (zzYIA) zzyia.zzZZJ().zzqh(8);
                        }
                        int iZzZ = (int) (zzYMD.zzZ(zzyia, 1, false, false) >> 32);
                        end = (zzyia.zzac() ? zzyia.getHeight() : Integer.MIN_VALUE) + iZzZ;
                        iZzZ7R = iZzZ;
                    }
                }
            }
        }
        return new zzYCP(iZzZ7R, end);
        end = iZzZ7R;
        return new zzYCP(iZzZ7R, end);
    }

    public final zzYN8 zzZ8m() {
        return (zzYN8) this.zzYy9.zzqh(1);
    }

    public boolean zzZ8n() {
        return !zzhk() && this.zzYy7.zzYMf() == 1;
    }

    public final int zzZ8o() {
        int horizontalAlignment = this.zzYy7.getHorizontalAlignment();
        if (horizontalAlignment != 1) {
            if (horizontalAlignment != 3) {
                if (horizontalAlignment == 4) {
                    return zzZ8m().zzYqk() ? 1 : 3;
                }
                if (horizontalAlignment == 5) {
                    return zzZ8m().zzYqk() ? 3 : 1;
                }
            } else if (zzZ8n()) {
                return 1;
            }
        } else if (zzZ8n()) {
            return 3;
        }
        return horizontalAlignment;
    }

    public abstract zzXR zzZ8p() throws Exception;

    public zzYCP zzZ8q() throws Exception {
        if (zzhk()) {
            zzWT zzwt = (zzWT) zzZZJ();
            return new zzYCP(zzwt.zz5X(), zzwt.zzZXT());
        }
        zzYMD zzymdZzqh = this.zzYy9.zzaa().zzbD() ? this.zzYy9.zzqh(2) : this.zzYy9.zzaa().zz6x();
        int iZzZ = (int) zzYMD.zzZ(zzymdZzqh, 1, false, false);
        return new zzYCP(iZzZ, zzymdZzqh.getWidth() + iZzZ);
    }

    public final void zzZ8s() {
        if (zzbD() || zzhk() || ((zzZ35) ((zzZ2D) this.zzYy9.zzZ8m().zza9()).zzYTt()).zzZRg() >= 0) {
            return;
        }
        this.zzYy3 = true;
    }

    public int zzZ8t() throws Exception {
        return 0;
    }

    public int zzZ8u() throws Exception {
        int height = zzZ8m().getHeight();
        if (zzbD() || ((zzZKV) this.zzYy9.zzaa()).zzZ4D() || !this.zzYy7.zzYMc()) {
            return height;
        }
        if (this.zzYy7.zzYMd() == 3 && this.zzYy7.zzYMf() != 2) {
            return height;
        }
        zzZ3A zzz3aZza7 = zzZZJ().zza7();
        return zzz3aZza7.zzYMw() <= 11 ? (zzz3aZza7.zzYMw() != 0 || zzz3aZza7.getUICompat97To2003()) ? zzZ8m().zzYqp().getY() + ((zzZ35) ((zzZ2D) zzZ8m().zza9()).zzYTt()).zzYLx() : height : height;
    }

    public abstract boolean zzZ8v();

    public boolean zzZ8w() {
        return false;
    }

    public zzYCP zzZ8x() throws Exception {
        int height;
        int i;
        zzYN8 zzyn8 = (zzYN8) this.zzYy9.zzqh(1);
        if (zzhk()) {
            int iZz5W = ((zzWT) this.zzYy9.zzqh(16)).zz5W();
            return new zzYCP(iZz5W, iZz5W);
        }
        if (this.zzYy7.getVerticalAlignment() == 4 || this.zzYy7.getVerticalAlignment() == 5) {
            zzZ35 zzz35 = (zzZ35) ((zzZ2D) zzyn8.zza9()).zzYTt();
            int iZzYLy = zzz35.zzYLy() / 2;
            height = zzyn8.getHeight() - (zzz35.zzYLx() / 2);
            i = iZzYLy;
        } else {
            height = zzyn8.getHeight();
            i = 0;
        }
        return new zzYCP(i, height);
    }

    public abstract int zzZ8y() throws Exception;

    public boolean zzZ8z() throws Exception {
        return false;
    }

    public final Object zzZ90() {
        return this.zzYya;
    }

    public final zzYMD zzZ91() {
        return this.zzYy8;
    }

    public zzTC zzZ92() {
        return (zzTC) this.zzYy9;
    }

    public final zzYMD zzZ93() {
        return this.zzYy9;
    }

    public boolean zzZ94() {
        return false;
    }

    public boolean zzZ95() {
        return false;
    }

    public final boolean zzZ96() {
        int iZzYMd;
        int iZzYMf = this.zzYy7.zzYMf();
        return iZzYMf == 2 || iZzYMf == 3 || (iZzYMd = this.zzYy7.zzYMd()) == 2 || iZzYMd == 3;
    }

    public final boolean zzZ97() {
        zzUZ zzuz = (zzUZ) this.zzYy9.zzqh(2);
        return zzuz != null && zzuz.zz0p();
    }

    public abstract int zzZ98();

    public abstract int zzZ99();

    public boolean zzZ9a() {
        return zzYBL.zzX(this.zzYy9, this.zzYy8.zz5Z());
    }

    public final int zzZXQ() {
        if (zzhk()) {
            return 0;
        }
        return this.zzZst;
    }

    public final zzTF zzZZJ() {
        if (this.zzZss == null) {
            this.zzZss = zzZ8i();
        }
        return this.zzZss;
    }

    public abstract void zzZoN() throws Exception;

    public final void zzZoU() throws Exception {
        for (zzYMD zzymdZz5Z = this.zzYy9; zzymdZz5Z != null; zzymdZz5Z = zzymdZz5Z.zz5Z()) {
            zzymdZz5Z.zzNd(1);
            if (zzymdZz5Z == this.zzYy8) {
                return;
            }
        }
    }

    public final boolean zzbD() {
        zzYMD zzymd = this.zzYy9;
        if (zzymd != null) {
            zzymd.zzaa();
        }
        return this.zzYy9.zzaa().zzbD();
    }

    public final boolean zzhk() {
        int iZzZ8Z = zzZ8Z();
        if (iZzZ8Z == 1) {
            return false;
        }
        if (iZzZ8Z != 2) {
            if (iZzZ8Z == 3) {
                return false;
            }
            if (iZzZ8Z != 4) {
                throw new IllegalStateException("Unexpected floater impact value.");
            }
        }
        return true;
    }

    private void zzV(zzZNO zzzno) {
        if (this == zzzno) {
            return;
        }
        zzYMD zzymd = this.zzYy9;
        zzYMD zzymd2 = zzzno.zzYy9;
        if (zzymd != zzymd2) {
            this.zzYy9 = zzymd2;
            this.zzYy8 = zzzno.zzYy8;
            zzZ8Q();
        }
        if (this.zzYy8 != zzzno.zzYy8) {
            if (zzhk() || zzZ99() == 21537) {
                this.zzYy8 = zzzno.zzYy8;
                zzZ8Q();
            }
        }
    }

    private static zzZNO zzZ(zzZNO zzzno, zzYMD zzymd) throws Exception {
        zzZNO zzznoZzQ = zzzno == null ? zzQ(zzymd) : zzzno;
        if (zzznoZzQ == null) {
            if (zzymd.zzqh(2048) == null) {
                return null;
            }
            throw new IllegalStateException("Floating shape not allowed inside textbox.");
        }
        zzZNO zzznoZzZu = zzznoZzQ.zzZ8D().zzZu(zzznoZzQ.zzYya);
        if (zzznoZzZu != null) {
            if (zzzno != null) {
                zzznoZzZu.zzV(zzznoZzQ);
            }
            return zzznoZzZu;
        }
        zzznoZzQ.zzZ8D().zzU(zzznoZzQ);
        if (zzznoZzQ.zzhk()) {
            ((zzWT) zzznoZzQ.zzZZJ()).zza4().zza5().zzYjY();
        }
        return zzznoZzQ;
    }

    public static zzZNO zzW(zzZNO zzzno) throws Exception {
        return zzZ(zzzno, zzzno.zzYy9);
    }

    private static boolean zzW(zzUZ zzuz, zzUZ zzuz2) {
        if (zzuz2 == null) {
            return false;
        }
        while (zzuz != null) {
            zzuz = (zzUZ) zzuz.zzYo1();
            if (zzuz == zzuz2) {
                return true;
            }
        }
        return false;
    }

    public long zzZ(zzZ2D zzz2d, boolean z) {
        return zzz2d.zzZN(0, z);
    }

    public final zzXR zzV(zzXR zzxr) throws Exception {
        zzXR zzxrZzU = zzU(zzxr);
        zzXR zzxrZzZ = zzZNK.zzZ(this, zzxrZzU);
        int x = zzxrZzZ.getX() - zzxrZzU.getX();
        int y = zzxrZzZ.getY() - zzxrZzU.getY();
        boolean z = (x == 0 && y == 0) ? false : true;
        if (z) {
            zzxr = zzxr.zzYB(x, y);
        }
        zzZ(zzxr, z);
        return zzxr;
    }
}

package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZNH extends zzZNO {
    private zzXR zzYxQ;
    private zzXR zzYxR;

    private zzZNH(zzY9X zzy9x) {
        super(zzy9x, zzy9x.zzY6M().zzYLJ(), zzy9x, zzy9x);
    }

    private int zzBu(int i) throws Exception {
        zzY5N zzy5nZzYG;
        long jZzZ;
        int x;
        int right;
        zzZ55 zzz55 = (zzZ55) ((zzY9X) zzZ90()).zzZZJ();
        if (zzz55.zza7().zzZYM() || !zzbD() || zzz55.zzYQg() || zzY5N.zze(zzz55)) {
            return 0;
        }
        if (zzhk()) {
            zzWT zzwt = (zzWT) ((zzYBL) zzz55.zzZZJ());
            zzy5nZzYG = zzwt.zzYG(false);
            jZzZ = com.aspose.words.internal.zzZPZ.zzZm(zzz55.getX(), zzz55.getY());
            x = zzwt.zz5X();
        } else {
            zzy5nZzYG = zzz55.zzZ8m().zzYG(false);
            jZzZ = zzYMD.zzZ(zzz55, 1, false, false);
            x = zzz55.zzZZJ().getX();
        }
        if (zzy5nZzYG == null) {
            return 0;
        }
        int i2 = (int) (jZzZ >> 32);
        int height = zzz55.getHeight();
        int iZzYQF = zzz55.zzYQj().zzYQF();
        int i3 = i2 + iZzYQF;
        int iMax = Math.max(0, (height - iZzYQF) - zzz55.zzYQj().zzYQE());
        if (zzz55.zzYQ5()) {
            height = 1;
            iMax = 1;
        }
        int iMax2 = Math.max(1, ((int) jZzZ) - i);
        zzXR zzxr = new zzXR(i, i2, iMax2, height);
        zzXR zzxr2 = new zzXR(i, i3, iMax2, iMax);
        int i4 = 0;
        for (int iZzXVR = zzy5nZzYG.zzXVR(); iZzXVR < zzy5nZzYG.zzXVS().getCount(); iZzXVR++) {
            zzZNO zzznoZzBz = zzy5nZzYG.zzXVS().zzBz(iZzXVR);
            if (zzznoZzBz.zzZ8T() && (((zzYMM) zzz55.zza9()) != zzQ(zzznoZzBz) || !((zzY9X) zzZ90()).zzY70())) {
                zzXR zzxrZzZ8R = zzznoZzBz.zzZ8R();
                zzXR[] zzxrArrZzZ = zzXP.zzZ(zzxrZzZ8R, zzznoZzBz.zzZ8G().zzYMg() ? zzxr2 : zzxr);
                boolean z = zzxrArrZzZ != null && zzxrArrZzZ.length > 0;
                boolean z2 = (zzz55.zz5T() && zzxrZzZ8R.getLeft() - x > zzznoZzBz.zzZ98() && zzznoZzBz.zzZ8G().getWrapType() == 2) ? false : true;
                if (z && z2 && (right = zzxrZzZ8R.getRight()) > i4) {
                    i4 = right;
                }
            }
        }
        return i4;
    }

    private static zzYIA zzM(zzYMD zzymd) {
        zzTF zztfZzZZJ = zzymd.zzZZJ();
        zzYIA zzyia = null;
        while (zztfZzZZJ.zz60() == 16) {
            zzyia = (zzYIA) ((zzWT) zztfZzZZJ).zzZZJ();
            zztfZzZZJ = zzyia.zzZZJ();
        }
        return zzyia;
    }

    public static zzZNH zzN(zzYMD zzymd) {
        zzY9X zzy9x = (zzY9X) com.aspose.words.internal.zzZKW.zzZ(zzymd, zzY9X.class);
        if (zzy9x == null || !zzy9x.zzY6M().zzYLJ().isFloating()) {
            return null;
        }
        return new zzZNH(zzy9x);
    }

    private static zzYMM zzQ(zzZNO zzzno) {
        if (zzzno.zzZ99() == 25604) {
            return ((zzY9X) zzzno.zzZ90()).zzY6S();
        }
        return null;
    }

    private static zzZNO zzX(zzZ55 zzz55) {
        zzYIA zzyiaZzM = zzM(zzz55);
        return zzyiaZzM == null ? zzz55.zzZXN() : zzyiaZzM.zzZXN();
    }

    private boolean zzZ7G() throws Exception {
        zzZZJ().zza7();
        zzWT zzwt = (zzWT) com.aspose.words.internal.zzZKW.zzZ(zzZ92().zzqh(16), zzWT.class);
        if (zzwt == null || zzwt.zzZZJ().zzqh(16) != null || ((zzYIC) ((zzWV) zzwt.zza9()).zza9()).zzYk1().getHeightRule() != 0) {
            return false;
        }
        zzZ3B zzz3b = (zzZ3B) ((zzWV) zzwt.zza9()).zzYTt();
        if (zzz3b.zzYMV().zzwz(3) != null && !zzz3b.zzYMV().zzwz(3).isVisible() && zzz3b.zzYMV().zzwz(0) != null && !zzz3b.zzYMV().zzwz(0).isVisible()) {
            return false;
        }
        int height = ((zzYIC) ((zzWV) zzwt.zza9()).zza9()).zzYk1().getHeight();
        zzYN8 zzyn8 = (zzYN8) com.aspose.words.internal.zzZKW.zzZ(zzwt.zzqh(1), zzYN8.class);
        return height > zzyn8.zzYqn() - zzyn8.zzYqo();
    }

    private int zzZ7H() throws Exception {
        zzZ55 zzz55 = (zzZ55) ((zzY9X) zzZ90()).zzZZJ();
        int iZzZ = 0;
        if (!zzhk()) {
            if (zzz55.zzZXN() != null) {
                zzz55.zzZXN();
                zzz55.zzZXN().zzhk();
                iZzZ = zzz55.zzZXL();
            } else {
                iZzZ = (int) (zzYMD.zzZ(zzz55.zzZZJ(), 1, false, false) >> 32);
            }
        }
        int iZzYPK = zzz55.zzYPK();
        if (!zzZZJ().zza7().zzZYM()) {
            iZzYPK = (zzz55.getY() - iZzYPK) + (zzz55.zzYPJ() ? zzz55.zzYQv() : zzYJP.zzZZ(zzz55));
        }
        return iZzZ + iZzYPK;
    }

    private boolean zzZ7I() {
        return zzhk() && ((zzWV) ((zzWT) zzZZJ()).zza9()).zz6c();
    }

    private int zzZ7K() throws Exception {
        zzhk();
        return zzZ7J() - ((int) zzYMD.zzZ(zzZZJ(), 1, false, false));
    }

    private String zzZ7L() {
        return com.aspose.words.internal.zzZKN.format("{0} text orientation not handled", Integer.valueOf(((zzZ3B) ((zzWV) ((zzWT) zzZZJ()).zza9()).zzYTt()).getOrientation()));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzYCP zzZ7M() throws Exception {
        int iZzZXT;
        int iZzZ7P;
        zzhk();
        zzWT zzwt = (zzWT) ((zzZ55) ((zzY9X) zzZ90()).zzZZJ()).zzZZJ();
        if (((zzWV) zzwt.zza9()).zz6c()) {
            zzZ55 zzz55ZzYos = ((zzYMM) ((zzZ55) ((zzY9X) zzZ90()).zzZZJ()).zza9()).zzYos();
            ((zzZ55) ((zzY9X) zzZ90()).zzZZJ()).zzZ8m();
            zzz55ZzYos.zzZ8m();
            int iZzZZ = zzYJP.zzZZ(zzz55ZzYos) - zzwt.zz5W();
            int orientation = ((zzZ3B) ((zzWV) zzwt.zza9()).zzYTt()).getOrientation();
            if (orientation == 1) {
                iZzZXT = zzwt.zzZXT() - iZzZZ;
                iZzZ7P = iZzZXT;
            } else {
                if (orientation == 3) {
                    iZzZXT = zzwt.zz5X() + iZzZZ;
                } else if (orientation != 5) {
                    zzZ7L();
                    iZzZXT = 0;
                }
                iZzZ7P = iZzZXT;
            }
        } else {
            iZzZXT = ((zzWV) zzwt.zza9()).zz6a() ? Math.max(zzWU.zzZ((zzWV) zzwt.zza9(), 2) / 2, ((zzZ3B) ((zzWV) zzwt.zza9()).zzYTt()).getLeftPadding()) : zzwt.zz5X();
            iZzZ7P = zzZ7P();
            int iZzBu = zzBu(iZzZXT);
            if (iZzBu != 0) {
                iZzZ7P = (iZzZ7P - iZzZXT) + iZzBu;
                iZzZXT = iZzBu;
            }
        }
        return new zzYCP(iZzZXT, iZzZ7P);
    }

    private int zzZ7N() throws Exception {
        if (zzZZJ().zz60() != 16) {
            return 0;
        }
        zzWT zzwt = (zzWT) zzZZJ();
        zzwt.getHeight();
        return zzWU.zzV(zzwt) - (((zzWV) zzwt.zza9()).zz6m() == 1 ? zzYI9.zzI(zzwt).zzYjI() : ((zzYIA) zzwt.zzZZJ()).zzYjI());
    }

    private int zzZ7O() throws Exception {
        zzhk();
        zzWT zzwt = (zzWT) zzZZJ();
        zzWV zzwv = (zzWV) zzwt.zza9();
        int iZz68 = zzwv.zz68() / 2;
        int iZz67 = zzwv.zz67() / 2;
        int leftPadding = ((zzZ3B) zzwv.zzYTt()).getLeftPadding() - iZz68;
        int rightPadding = ((zzZ3B) zzwv.zzYTt()).getRightPadding() - iZz67;
        return (zzwt.getWidth() - iZz67) + (leftPadding * rightPadding < 0 ? Math.min(Math.abs(leftPadding), Math.abs(rightPadding)) : 0);
    }

    private int zzZ7P() throws Exception {
        zzhk();
        zzWT zzwt = (zzWT) ((zzZ55) ((zzY9X) zzZ90()).zzZZJ()).zzZZJ();
        int iZz68 = ((zzWV) zzwt.zza9()).zz68() / 2;
        int iZz67 = (((zzWV) zzwt.zza9()).zz67() / 2) + iZz68;
        int rightPadding = ((zzZ3B) ((zzWV) zzwt.zza9()).zzYTt()).getRightPadding();
        int leftPadding = ((zzZ3B) ((zzWV) zzwt.zza9()).zzYTt()).getLeftPadding();
        return Math.max(iZz68, leftPadding) + (zzwt.getWidth() - Math.max(rightPadding + leftPadding, iZz67));
    }

    private boolean zzZ7Q() {
        boolean zZzZYM = zzZZJ().zza7().zzZYM();
        if (!zZzZYM && zzhk()) {
            zzYIA zzyia = (zzYIA) ((zzWT) zzZZJ()).zzZZJ();
            zzZ36 zzz36ZzYk1 = ((zzYIC) zzyia.zza9()).zzYk1();
            if (zzyia.zzZZJ().zz60() == 16 && zzz36ZzYk1.getHeightRule() == 0) {
                return false;
            }
        }
        if (!zZzZYM ? zzhk() || zzZ8G().zzYMf() == 2 || zzZ8G().zzYMd() == 2 : zzbD() && (zzZ8G().zzYMd() == 2 || zzZ8G().zzYMd() == 3)) {
            if (zzZ8Y()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.aspose.words.zzZNO
    public final boolean zzBE(int i) {
        return false;
    }

    @Override // com.aspose.words.zzZNO
    public final zzXR zzU(zzXR zzxr) {
        if (zzZ8G().zzYMg()) {
            zzxr = this.zzYxQ.zzYB(zzxr.getX() - this.zzYxR.getX(), zzxr.getY() - this.zzYxR.getY());
        }
        zzXR zzxrZzYA = zzxr.zzYA(zzZ8G().getWrapType(), 4);
        if (zzZ8G().zzYMg() && ((zzxrZzYA.getHeight() <= 0 || zzxrZzYA.getWidth() <= 0) && !zzZZJ().zzab().zza7().zzZYM())) {
            return zzxrZzYA;
        }
        int iZzYMj = zzZ8G().zzYMj();
        int iZzYMh = zzZ8G().zzYMh();
        if (!zzZZJ().zzab().zza7().zzZYM() && zzZ8G().zzYMg()) {
            iZzYMj = 0;
            iZzYMh = 0;
        }
        return zzxrZzYA.zzM(zzZ8G().zzYMk(), iZzYMj, zzZ8G().zzYMi(), iZzYMh);
    }

    @Override // com.aspose.words.zzZNO
    public final zzY0B zzV(zzTF zztf) {
        return new zzY0A(zztf, (zzY9X) zzZ90());
    }

    @Override // com.aspose.words.zzZNO
    public final int zzXp(int i, int i2) {
        if (zzhk()) {
            zzZ8Y();
        }
        return Math.max(i, (((zzWV) ((zzWT) zzZZJ()).zza9()).zz68() / 2) - Math.min(0, -i2));
    }

    @Override // com.aspose.words.zzZNO
    public final int zzXq(int i, int i2) throws Exception {
        zzhk();
        return (zzZZJ().zza7().zzZYM() || zzZ7G()) ? i : zzZNO.zzh(i, i2, zzZ8u());
    }

    @Override // com.aspose.words.zzZNO
    public final int zzXt(int i, int i2) throws Exception {
        zzhk();
        if (!zzhk() || !zzZ8Y()) {
            return i;
        }
        return zzZNO.zzh(i, i2 + this.zzYxR.getX(), zzZ7O());
    }

    @Override // com.aspose.words.zzZNO
    public final int zzXw(int i, int i2) {
        return zzZ7Q() ? super.zzXw(i, i2) : i;
    }

    @Override // com.aspose.words.zzZNO
    public final long zzZ(zzZ2D zzz2d, boolean z) {
        return zzz2d.zzZN(3, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzZ7J() throws Exception {
        int iZzlW;
        if (zzZ8G().zzYMf() == 3 && !((zzZ55) ((zzY9X) zzZ90()).zzZZJ()).zz5T()) {
            if (((zzY9X) zzZ90()).zzY53().zzYS7()) {
                zzYAU zzyau = (zzYAU) ((zzY9X) zzZ90()).zz5Y();
                iZzlW = 0;
                boolean z = false;
                while (zzyau != null) {
                    if (!zzyau.zzY74()) {
                        if (zzyau.zzY75() && !zzyau.zzYol() && zzyau.zzY7r() != 5121) {
                            zzY9X zzy9x = (zzY9X) com.aspose.words.internal.zzZKW.zzZ(zzyau, zzY9X.class);
                            if (zzy9x == null || !zzy9x.zzY4Y() || !z) {
                                break;
                            }
                            iZzlW += zzyau.getWidth();
                        }
                        zzyau = (zzYAU) zzyau.zz5Y();
                    } else {
                        if (iZzlW > 0) {
                            break;
                        }
                        z = true;
                        zzyau = (zzYAU) zzyau.zz5Y();
                    }
                }
                if (iZzlW <= 0) {
                    iZzlW = zzyau != null ? zzyau.zzlW(zzyau.getLength() - 1) : 0;
                }
            }
            return ((int) zzYMD.zzZ((zzY9X) zzZ90(), 1, false, false)) - iZzlW;
        }
        return (int) zzYMD.zzZ((zzY9X) zzZ90(), 1, false, false);
    }

    public final int zzZ7R() throws Exception {
        if (!zzZ7I()) {
            return zzZ7H();
        }
        zzWT zzwt = (zzWT) zzZZJ();
        int iZzZ7K = zzZ7K() - zzwt.zz5X();
        int orientation = ((zzZ3B) ((zzWV) zzwt.zza9()).zzYTt()).getOrientation();
        if (orientation != 1) {
            if (orientation == 3) {
                return (zzZ7N() - iZzZ7K) - this.zzYxR.getHeight();
            }
            if (orientation != 5) {
                zzZ7L();
                return 0;
            }
        }
        return zzwt.zz5W() + iZzZ7K;
    }

    public final int zzZ7S() throws Exception {
        zzhk();
        zzWT zzwt = (zzWT) zzZZJ();
        if (!((zzWV) zzwt.zza9()).zz6c()) {
            return zzZ7K();
        }
        int iZzZ7H = zzZ7H() - zzwt.zz5W();
        int orientation = ((zzZ3B) ((zzWV) zzwt.zza9()).zzYTt()).getOrientation();
        if (orientation != 1) {
            if (orientation == 3) {
                return zzwt.zz5X() + iZzZ7H;
            }
            if (orientation != 5) {
                zzZ7L();
                return 0;
            }
        }
        return (zzwt.zzZXT() - iZzZ7H) - this.zzYxR.getRight();
    }

    @Override // com.aspose.words.zzZNO
    public final com.aspose.words.internal.zzZQ5 zzZ8A() throws Exception {
        if (zzZZJ().zza7().zzZYM() || !zzZ8G().zzYMg()) {
            return super.zzZ8A();
        }
        zzXR zzxrZzZ8V = zzZ8V();
        return new com.aspose.words.internal.zzZQ5(this.zzYxQ.getX() + (zzxrZzZ8V.getX() - this.zzYxR.getX()), this.zzYxQ.getY() + (zzxrZzZ8V.getY() - this.zzYxR.getY()), this.zzYxQ.getWidth(), this.zzYxQ.getHeight());
    }

    @Override // com.aspose.words.zzZNO
    public final int zzZ8M() {
        return 0;
    }

    @Override // com.aspose.words.zzZNO
    public final int zzZ8N() {
        return 0;
    }

    @Override // com.aspose.words.zzZNO
    public final zzXR zzZ8O() throws Exception {
        return zzZ8V();
    }

    @Override // com.aspose.words.zzZNO
    public final boolean zzZ8n() {
        return super.zzZ8n() && !zzZZJ().zza7().zzZYM();
    }

    @Override // com.aspose.words.zzZNO
    public final zzXR zzZ8p() throws Exception {
        if (this.zzYxR == null) {
            zzYC5 zzyc5ZzU = zzZ68.zzU((zzY9X) zzZ90());
            this.zzYxR = new zzXR(zzyc5ZzU != null ? com.aspose.words.internal.zzSA.zzQ(zzyc5ZzU.zz7s()) : new com.aspose.words.internal.zzZQ5(0, 0, ((zzY9X) zzZ90()).zzZXS(), ((zzY9X) zzZ90()).getContentHeight()));
            if (zzZ8G().zzYMg()) {
                if (zzyc5ZzU == null || zzyc5ZzU.zz6L() == null) {
                    this.zzYxQ = this.zzYxR;
                } else {
                    zzYLC zzylcZz6L = zzyc5ZzU.zz6L();
                    zzylcZz6L.zzRx(true);
                    this.zzYxQ = new zzXR(zzylcZz6L);
                }
            }
        }
        return zzZNK.zzZ(this, this.zzYxR.zzYB(zzXv(this.zzYxR.getWidth(), this.zzYxR.getX()), zzXs(this.zzYxR.getHeight(), this.zzYxR.getY())));
    }

    @Override // com.aspose.words.zzZNO
    public final zzYCP zzZ8q() throws Exception {
        if (zzhk()) {
            return zzZ7M();
        }
        zzYCP zzycpZzZ8q = super.zzZ8q();
        int start = zzycpZzZ8q.getStart();
        int end = zzycpZzZ8q.getEnd();
        zzZ55 zzz55 = (zzZ55) ((zzY9X) zzZ90()).zzZZJ();
        zzZNO zzznoZzX = zzX(zzz55);
        if (zzznoZzX != null) {
            int x = zzznoZzX.zzZ8V().getX();
            if (zzznoZzX.zzZ99() == 21595) {
                x += ((zzWT) ((zzYIA) zzznoZzX.zzZ93()).zz6x()).zz5X();
            }
            end += x - start;
            start = x;
        } else {
            zzTF zztfZzZZJ = zzz55.zzZZJ();
            if (zztfZzZZJ.zz60() != 16) {
                int iZzBu = zzBu(zzycpZzZ8q.getStart());
                if (iZzBu != 0) {
                    end = (end - start) + iZzBu;
                    start = iZzBu;
                }
                if (!zzz55.zza7().zzZYM()) {
                    int horizontalAlignment = zzZ8G().getHorizontalAlignment();
                    if (horizontalAlignment == 1) {
                        start += ((zzYMM) zzz55.zza9()).zzYM7();
                    } else if (horizontalAlignment == 3) {
                        end -= ((zzYMM) zzz55.zza9()).zzYM4();
                    }
                }
            } else if (((zzY9X) zzZ90()).zzY57()) {
                zzWT zzwt = (zzWT) zztfZzZZJ;
                start = ((zzZ3B) ((zzWV) zzwt.zza9()).zzYTt()).getLeftPadding() + ((int) zzYMD.zzZ(zzwt, 1, false, false));
                end = (zzwt.getWidth() + start) - ((zzZ3B) ((zzWV) zzwt.zza9()).zzYTt()).getRightPadding();
            }
        }
        return new zzYCP(start, end);
    }

    @Override // com.aspose.words.zzZNO
    public final int zzZ8t() throws Exception {
        if (!zzZ7Q()) {
            return Integer.MIN_VALUE;
        }
        if (zzhk()) {
            return 0;
        }
        return zzZZJ().zza7().zzZYM() ? zzZ8m().zzYqo() : super.zzZ8t();
    }

    @Override // com.aspose.words.zzZNO
    public final int zzZ8u() throws Exception {
        if (!zzZ7Q()) {
            return 1073741823;
        }
        if (!zzhk()) {
            return zzZZJ().zza7().zzZYM() ? zzZ8m().zzYqn() : super.zzZ8u();
        }
        zzZ55 zzz55 = (zzZ55) ((zzY9X) zzZ90()).zzZZJ();
        return zzZ8m().zzYqn() - (zzbD() ? (int) (zzYMD.zzZ(zzz55.zzZZJ(), 1, false, false) >> 32) : ((int) (zzYMD.zzZ(zzz55.zzZZJ(), 1024, false, false) >> 32)) + ((zzZ35) ((zzZ2D) zzZ8m().zza9()).zzYTt()).zzYLy());
    }

    @Override // com.aspose.words.zzZNO
    public final boolean zzZ8v() {
        return zzZ7Q();
    }

    @Override // com.aspose.words.zzZNO
    public final boolean zzZ8w() {
        return (zzhk() || zzZ8G().zzYMf() == 2 || zzZ8G().zzYMd() == 2) && zzZ8Y();
    }

    @Override // com.aspose.words.zzZNO
    public final zzYCP zzZ8x() throws Exception {
        if (zzhk() || !zzZ8k()) {
            return super.zzZ8x();
        }
        int y = ((zzZ55) ((zzY9X) zzZ90()).zzZZJ()).zzZXN().zzZ8V().getY();
        return new zzYCP(y, y);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    @Override // com.aspose.words.zzZNO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzZ8y() throws Exception {
        zzZ55 zzz55;
        int iZz5W;
        if (!zzhk()) {
            zzZ93().zzqh(16);
        }
        zzYMD zzymdZzZZJ = ((zzY9X) zzZ90()).zzZZJ();
        while (true) {
            zzz55 = (zzZ55) zzymdZzZZJ;
            if (((zzZ55) zzz55.zzYo0()) == null || zzz55.zzYo0().zzZZJ() != zzz55.zzZZJ()) {
                break;
            }
            zzymdZzZZJ = zzz55.zzYo0();
        }
        if (zzZ7I()) {
            zzWT zzwt = (zzWT) zzZZJ();
            int orientation = ((zzZ3B) ((zzWV) zzwt.zza9()).zzYTt()).getOrientation();
            if (orientation == 1) {
                iZz5W = zzwt.zz5W();
            } else if (orientation == 3) {
                iZz5W = zzZ7N();
            } else if (orientation != 5) {
                zzZ7L();
                iZz5W = 0;
            }
        } else {
            iZz5W = zzYJP.zzZZ(zzz55);
        }
        if (zzYJP.zzl(zzz55)) {
            return iZz5W + zzz55.zzZXL();
        }
        return iZz5W + (zzhk() ? 0 : (int) (zzz55.zzZZJ().zzYqr() >> 32));
    }

    @Override // com.aspose.words.zzZNO
    public final zzTC zzZ92() {
        return (zzZ55) ((zzY9X) zzZ90()).zzZZJ();
    }

    @Override // com.aspose.words.zzZNO
    public final boolean zzZ94() {
        int iZzYMd = zzZ8G().zzYMd();
        if (iZzYMd != 0) {
            return iZzYMd == 4;
        }
        boolean zZzYqk = ((zzYN8) zzZ93().zzqh(1)).zzYqk();
        int verticalAlignment = zzZ8G().getVerticalAlignment();
        if (verticalAlignment == 3) {
            return false;
        }
        if (verticalAlignment == 4) {
            return zZzYqk;
        }
        if (verticalAlignment != 5) {
            return true;
        }
        return !zZzYqk;
    }

    @Override // com.aspose.words.zzZNO
    public final boolean zzZ95() {
        boolean zZzYqk = ((zzYN8) zzZ93().zzqh(1)).zzYqk();
        int iZzYMd = zzZ8G().zzYMd();
        if (iZzYMd == 0) {
            int verticalAlignment = zzZ8G().getVerticalAlignment();
            if (verticalAlignment == 2 || verticalAlignment == 3) {
                return true;
            }
            if (verticalAlignment == 4) {
                return !zZzYqk;
            }
            if (verticalAlignment != 5) {
                return false;
            }
        } else {
            if (iZzYMd == 5) {
                return true;
            }
            if (iZzYMd == 6) {
                return !zZzYqk;
            }
            if (iZzYMd != 7) {
                return false;
            }
        }
        return zZzYqk;
    }

    @Override // com.aspose.words.zzZNO
    public final int zzZ98() {
        int wrapType = ((zzY9X) zzZ90()).zzY6M().zzYLJ().getWrapType();
        return com.aspose.words.internal.zzSA.zzn((wrapType == 4 || wrapType == 5) ? 9.0d : ((zzY9X) zzZ90()).zzY53().zzYS7() ? 19.2d : 18.3d);
    }

    @Override // com.aspose.words.zzZNO
    public final int zzZ99() {
        return 25604;
    }

    @Override // com.aspose.words.zzZNO
    public final boolean zzZ9a() {
        return true;
    }

    @Override // com.aspose.words.zzZNO
    public final void zzZoN() {
    }
}

package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzZNG extends zzZNO {
    private zzZND zzYxP;
    private static int zzYxO = com.aspose.words.internal.zzSA.zzn(17.999d);
    static int zzYxN = com.aspose.words.internal.zzSA.zzn(0.5d);
    static int zzYxM = com.aspose.words.internal.zzSA.zzn(0.75d);

    private zzZNG(zzY6N zzy6n, zzYIA zzyia, zzYIA zzyia2) {
        super(zzy6n, zzy6n.zzY6a().zzYLJ(), zzZ(zzy6n, zzyia), zzY(zzy6n, zzyia2));
        zzZ8s();
    }

    private int zzBn(int i) throws Exception {
        int iMax = 0;
        int iMax2 = Math.max(0, zzWU.zzZ((zzWV) ((zzYIC) ((zzY6N) ((zzYIC) ((zzYIA) zzZ93()).zza9()).zza9()).zzZXZ()).zzZXZ(), 1) / 2);
        for (zzYIC zzyic = (zzYIC) ((zzYIA) zzZ93()).zza9(); zzyic != null; zzyic = (zzYIC) zzyic.zzYTp()) {
            zzWV zzwv = (zzWV) ((zzWV) zzyic.zzZXY()).zzYTo();
            iMax = Math.max(iMax, ((zzWU.zzX(zzwv) + zzwv.getWidth()) + (zzWU.zzZ(zzwv, 2) / 2)) - i);
        }
        return i + iMax2 + iMax;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int zzBo(int i) throws Exception {
        int iZzYqo;
        int iMax;
        if (zzhk()) {
            return i;
        }
        if (zzZ7B()) {
            iZzYqo = zzZ8y();
            if (zzZ8G().zzYMd() == 2 && zzZ7E()) {
                int i2 = 0;
                if (((zzY6N) zzZ90()).zza7().zzZYM()) {
                    int top = zzZ8G().getTop();
                    if (zzZ8G().getTop() >= 0) {
                        i2 = top;
                        iMax = i2 + iZzYqo;
                    } else {
                        if (zzZ93().zzZZJ().zz60() == 2) {
                            ((zzUZ) zzZ93().zzZZJ()).zza9();
                        }
                        if (zzZ93().zzZZJ().zzYnZ() && !zzZ8h()) {
                        }
                        iMax = i2 + iZzYqo;
                    }
                } else {
                    iMax = Math.max(zzZ8G().getTop() + iZzYqo, 0);
                }
            }
            return zzg(i, iZzYqo, iMax);
        }
        iZzYqo = ((zzYN8) zzZZJ()).zzYqo();
        zzYIA zzyia = (zzYIA) zzZ93();
        if (zzyia.zzYjB()) {
            iZzYqo += ((zzY6N) ((zzYIC) zzyia.zza9()).zza9()).zzXYi();
        }
        iMax = iZzYqo;
        return zzg(i, iZzYqo, iMax);
    }

    private int zzBp(int i) throws Exception {
        int iZzBo = zzBo(i);
        if (!zzZ7B()) {
            return zzZZJ().zz60() == 1 ? ((zzYN8) zzZZJ()).zzYqo() : zzZZJ().zz5W();
        }
        int iZzBC = zzBC(iZzBo);
        if (!zzhk() && ((zzY6N) zzZ90()).zza7().zzZYM() && zzZ8G().zzYMd() != 2) {
            zzg(iZzBo, zzZ8y(), iZzBC);
        }
        return iZzBC;
    }

    private int zzBq(int i) throws Exception {
        return (zzhk() ? zzBD(i) : zzXk(zzXu(i, 0), i)) + zzZ7A();
    }

    private void zzBr(int i) throws Exception {
        zzhk();
        if (zzZ8B()) {
            return;
        }
        zzVG(zzBt(i));
    }

    private static void zzK(zzYMD zzymd) {
        if (!(zzymd instanceof zzYIA) || !(zzymd.zzZZJ() instanceof zzUZ)) {
            return;
        }
        Object objZz6x = ((zzYIA) com.aspose.words.internal.zzZKW.zzZ(zzymd, zzYIA.class)).zz6x();
        while (true) {
            zzWT zzwt = (zzWT) objZz6x;
            if (zzwt.isVirtual()) {
                return;
            }
            zzwt.zz5N().clear();
            zzwt.zz5M().clear();
            objZz6x = com.aspose.words.internal.zzZKW.zzZ(zzwt.zz5Z(), zzWT.class);
        }
    }

    public static zzZNG zzL(zzYMD zzymd) {
        if (zzYJP.zzk(zzymd) >= 0) {
            return null;
        }
        zzYIA zzyia = (zzYIA) zzymd;
        return new zzZNG((zzY6N) ((zzYIC) zzyia.zza9()).zza9(), zzyia, ((zzY6N) ((zzYIC) zzyia.zza9()).zza9()) == zzyia.zzZZJ().zz6w().zza9().zza9() ? (zzYIA) zzyia.zzZZJ().zz6w() : (zzYIA) ((zzYIC) ((zzY6N) ((zzYIC) zzyia.zza9()).zza9()).zzZXY()).zz6w());
    }

    private void zzT(zzXR zzxr) throws Exception {
        zzhk();
        if (!zzZ8B() && zzbD()) {
            zzYIA zzyia = (zzYIA) zzZ93();
            if (zzyia.zzYjE() && !zzyia.zzYjD()) {
                zzVG(!(zzxr.getBottom() <= ((zzYN8) zzZZJ()).zzYqn()));
            }
        }
    }

    private int zzXk(int i, int i2) throws Exception {
        zzhk();
        zzZNE zzzneZzZ7z = zzZ7z();
        int iZzZ7r = i + zzzneZzZ7z.zzZ7r();
        return zzZ8G().getHorizontalAlignment() == 3 ? zzZNO.zzh(iZzZ7r, i2 - zzzneZzZ7z.zzZ7s(), zzZ8m().getWidth()) : (zzZ8G().getHorizontalAlignment() == 1 || zzZ8G().getHorizontalAlignment() == 0) ? zzXw(iZzZ7r, ((zzY6N) zzZ90()).zzY6a().zzZz() ? 0 : -zzzneZzZ7z.zzZ7t()) : iZzZ7r;
    }

    private boolean zzXl(int i, int i2) throws Exception {
        zzYIA zzyia = (zzYIA) zzZ93();
        if (zzyia.zza7().zzZYM()) {
            return false;
        }
        zzZ36 zzz36ZzYk1 = ((zzYIC) zzyia.zza9()).zzYk1();
        return (i2 >= zzyia.zz0t()) && (Math.max(zzyia.zzYjR(), zzz36ZzYk1.getHeightRule() == 2 ? 0 : zzz36ZzYk1.getHeight()) > i) && (zzZ7E() || zzZ93() == zzZ91());
    }

    private static zzYMD zzY(zzY6N zzy6n, zzYMD zzymd) {
        return zzymd == null ? ((zzYIC) zzy6n.zzZXY()).zz6w() : zzymd;
    }

    private int zzZ7A() {
        if (((zzY6N) zzZ90()).zza7().zzZYM() || ((zzY6N) zzZ90()).zzY6a().zzZz()) {
            return 0;
        }
        int iZzYM7 = ((zzY6N) zzZ90()).zzY6a().zzYM7();
        int iZzZ8o = zzZ8o();
        if (iZzZ8o == 2) {
            return iZzYM7 / 2;
        }
        if (iZzZ8o != 3) {
            return iZzYM7;
        }
        return 0;
    }

    private boolean zzZ7B() {
        return ((zzYIA) zzZ93()).zzYjE();
    }

    private boolean zzZ7C() {
        zzhk();
        return (zzZ93().zzYnZ() && zzZ93().zzZZJ().zzYnZ()) ? false : true;
    }

    private boolean zzZ7D() {
        return ((zzY6N) zzZ90()).zzaa().getStoryType() == 1;
    }

    private zzZND zzZ7y() {
        if (this.zzYxP == null) {
            this.zzYxP = new zzZND(this, zzZ8o());
        }
        return this.zzYxP;
    }

    private zzZNE zzZ7z() {
        if (((zzY6N) zzZ90()).zzXY9() == null) {
            ((zzY6N) zzZ90()).zzZ(new zzZNE(this, zzZ8o()));
        }
        return ((zzY6N) zzZ90()).zzXY9();
    }

    private int zzg(int i, int i2, int i3) throws Exception {
        if (zzhk() || !zzbD()) {
            return i;
        }
        zzYN8 zzyn8 = (zzYN8) zzZZJ();
        boolean zZzZ7E = zzZ7E();
        int iZzYqn = (zZzZ7E || !(zzZ7B() && zzZ8G().zzYMd() != 2)) ? zzyn8.zzYqn() : zzyn8.getBottom();
        int i4 = iZzYqn - i3;
        int i5 = iZzYqn - i2;
        if (zzXl(i4, i5)) {
            zzP(zzZ93());
        } else if (!zZzZ7E || i4 < 0 || zzZ7F()) {
            zzVG(!(i4 >= i));
        } else {
            boolean zZzBs = zzBs(i4);
            if (zzZ8G().zzYMd() == 2 && zzZ8G().getTop() < 0 && !((zzY6N) zzZ90()).zza7().zzZYM()) {
                zZzBs = zZzBs && (zzZ91().getY() + zzZ91().zz0t()) - zzZ93().getY() <= i5;
            }
            if (!zZzBs) {
                boolean z = zzZ8G().zzYMd() != 2;
                if (z) {
                    zzP(zzZ93());
                }
                zZzBs = z;
            }
            zzVG(!zZzBs);
        }
        return (zzZ91().getY() + zzZ91().zz0t()) - zzZ93().getY();
    }

    public final void zz5S() throws Exception {
        if (zzZ8T()) {
            zzXR zzxrZzZ8V = zzZ8V();
            zzW(new zzXR(zzxrZzZ8V.getX(), zzxrZzZ8V.getY(), zzxrZzZ8V.getWidth(), zzZ91().getBottom() - zzZ93().getY()));
        }
    }

    public final boolean zzBs(int i) throws Exception {
        int iMax = Math.max(i, 0);
        zzYIA zzyiaZzYjS = (zzYIA) zzZ93();
        zzYIA zzyia = null;
        int height = 0;
        while (true) {
            if (zzyiaZzYjS == null) {
                zzyiaZzYjS = zzyia;
                break;
            }
            if (zzyiaZzYjS.zz0t() + height <= iMax) {
                height += zzyiaZzYjS.getHeight();
                if (zzyiaZzYjS == zzZ91()) {
                    break;
                }
                zzyia = zzyiaZzYjS;
                zzyiaZzYjS = zzyiaZzYjS.zzYjS();
            } else {
                int iZzW = zzYI6.zzW(zzyiaZzYjS, iMax - height, true);
                if (iZzW == 5 || iZzW == 6) {
                    zzyiaZzYjS = zzyia;
                }
                if (zzyiaZzYjS != null) {
                    zzP(zzyiaZzYjS);
                    zzYIA zzyiaZzYjS2 = zzyiaZzYjS.zzYjS();
                    if (zzyiaZzYjS2 != null && zzyiaZzYjS2.zzZXN() == zzyiaZzYjS.zzZXN()) {
                        zzyiaZzYjS2.zzX(zzL(zzyiaZzYjS2));
                    }
                    zzK(zzyiaZzYjS2);
                }
            }
        }
        return zzyiaZzYjS != null;
    }

    public final boolean zzBt(int i) throws Exception {
        if (!zzZ93().zza7().zzZYM() || !zzbD() || ((zzZ35) ((zzZ2D) ((zzUZ) zzZ93().zzqh(2)).zza9()).zzYTt()).zzYLt().length > 1 || zzZ8G().zzYMd() == 2) {
            return false;
        }
        int iZzZ8y = zzZ8y();
        if (!zzhk()) {
            zzYIA zzyia = (zzYIA) zzZ91();
            if (zzyia == ((zzYIA) ((zzYIC) ((zzY6N) ((zzYIC) zzyia.zza9()).zza9()).zzZXY()).zz6w())) {
                if (((zzYN8) zzZZJ()).zzYqn() - iZzZ8y >= zzZ91().getBottom() - zzZ93().getY()) {
                    return false;
                }
            }
        }
        return i < iZzZ8y;
    }

    @Override // com.aspose.words.zzZNO
    public final zzXR zzU(zzXR zzxr) {
        int iZzZ7q = zzZ7y().zzZ7q();
        int iZzZ7p = zzZ7y().zzZ7p();
        int iZzYMj = zzZ8G().zzYMj();
        return new zzXR(zzxr.getX() - iZzZ7q, zzxr.getY() - iZzYMj, zzxr.getWidth() + iZzZ7q + iZzZ7p, zzxr.getHeight() + iZzYMj + zzZ8G().zzYMh());
    }

    @Override // com.aspose.words.zzZNO
    public final int zzXq(int i, int i2) {
        zzhk();
        ((zzWT) zzZZJ()).zza9();
        zzZ36 zzz36ZzYk1 = ((zzYIC) ((zzYIA) ((zzWT) zzZZJ()).zzZZJ()).zza9()).zzYk1();
        int iZz5W = zzZZJ().zz5W();
        return (zzz36ZzYk1.getHeightRule() != 1 || i + i2 <= zzz36ZzYk1.getHeight() - iZz5W) ? i : Math.max(zzZZJ().zz5W(), (zzz36ZzYk1.getHeight() + iZz5W) - i2);
    }

    @Override // com.aspose.words.zzZNO
    public final int zzXt(int i, int i2) throws Exception {
        zzhk();
        if (!zzhk()) {
            return i;
        }
        zzWT zzwt = (zzWT) zzZZJ();
        return zzZNO.zzh(i, zzBn(i2), zzwt.getWidth() - (zzWU.zzZ((zzWV) zzwt.zza9(), 2) / 2));
    }

    @Override // com.aspose.words.zzZNO
    public final void zzZ(zzXR zzxr, boolean z) throws Exception {
        if (zzhk()) {
            return;
        }
        if (z) {
            zzT(zzxr);
        }
        zzBr(zzxr.getY());
    }

    public final boolean zzZ7E() {
        if (!zzZZJ().zza7().getDoNotBreakWrappedTables() && zzZ93().zzaa().zzbD()) {
            return ((zzZ35) ((zzZ2D) zzZ93().zza9().zzYTk()).zzYTt()).zzYLt().length <= 1 || zzhk();
        }
        return false;
    }

    public final boolean zzZ7F() throws Exception {
        if (zzZ7B() && zzZ8G().zzYMd() == 2 && zzZ8G().getTop() < 0) {
            if (zzhk()) {
                return zzZ8h();
            }
            if (((zzY6N) zzZ90()).zza7().zzZYM()) {
                return zzZ7C();
            }
        }
        return false;
    }

    @Override // com.aspose.words.zzZNO
    public final void zzZ8Q() {
        super.zzZ8Q();
        this.zzYxP = null;
    }

    @Override // com.aspose.words.zzZNO
    public final zzXR zzZ8p() throws Exception {
        int iZzg;
        zzYIC zzyic = (zzYIC) ((zzYIA) zzZ93()).zza9();
        int iZzV = zzYIB.zzV(zzyic);
        int iZzBq = zzBq(iZzV);
        int bottom = zzZ91().getBottom() - zzZ93().getY();
        zzVG(false);
        int iZzBp = zzBp(bottom);
        int bottom2 = zzZ91().getBottom() - zzZ93().getY();
        if (!zzyic.zzBz()) {
            bottom2 += ((zzY6N) zzyic.zza9()).zzXYi();
        }
        zzXR zzxr = new zzXR(iZzBq, iZzBp, iZzV, bottom2);
        zzXR zzxrZzV = zzV(zzxr);
        return (zzZ8B() || zzxr.getY() == zzxrZzV.getY() || bottom2 == (iZzg = zzg(bottom2, 0, zzxrZzV.getY()))) ? zzxrZzV : new zzXR(zzxrZzV.getX(), zzxrZzV.getY(), zzxrZzV.getWidth(), iZzg);
    }

    @Override // com.aspose.words.zzZNO
    public final boolean zzZ8v() {
        return (zzZ7D() && zzZ8G().zzYMd() == 2) ? false : true;
    }

    @Override // com.aspose.words.zzZNO
    public final int zzZ8y() throws Exception {
        int iZz5W;
        zzYIA zzyia = (zzYIA) zzZ93();
        if (!zzyia.zzYTm() || !zzyia.zza9().zzYTm()) {
            return 0;
        }
        int iZzYqr = zzhk() ? 0 : (int) (zzZ93().zzZZJ().zzYqr() >> 32);
        zzYMD zzymdZzZ93 = zzZ93();
        while (true) {
            zzymdZzZ93 = zzymdZzZ93.zz5Y();
            if (zzymdZzZ93 == null) {
                iZz5W = zzZ93().zzZZJ().zz5W();
                break;
            }
            if (!zzYJP.zzl(zzymdZzZ93)) {
                iZz5W = zzymdZzZ93.getBottom();
                break;
            }
        }
        return iZz5W + iZzYqr;
    }

    @Override // com.aspose.words.zzZNO
    public final boolean zzZ8z() throws Exception {
        zzhk();
        return ((zzY6N) zzZ90()).zza7().zzZYM() ? zzZ7C() : zzZ8h();
    }

    @Override // com.aspose.words.zzZNO
    public final int zzZ98() {
        return zzYxO;
    }

    @Override // com.aspose.words.zzZNO
    public final int zzZ99() {
        return 21595;
    }

    @Override // com.aspose.words.zzZNO
    public final void zzZoN() throws Exception {
        for (zzTC zztcZzZXK = (zzTC) zzZ93(); zztcZzZXK != null; zztcZzZXK = zztcZzZXK.zzZXK()) {
            zztcZzZXK.zzO(zzZ93().zzZZJ());
            zzYIA zzyia = (zzYIA) zztcZzZXK;
            zzyia.zzX(this);
            zzYI9.zzB(zzyia);
            if (zzZ93().isActive()) {
                zzZ93().zzZZJ();
            }
            if (!zzZ91().isActive()) {
                zzP(((zzYIC) ((zzY6N) zzZ90()).zzZXY()).zz6w());
            }
            if (zztcZzZXK == zzZ91()) {
                return;
            }
        }
    }

    private static zzYMD zzZ(zzY6N zzy6n, zzYMD zzymd) {
        return zzymd == null ? ((zzYIC) zzy6n.zzZXZ()).zz6x() : zzymd;
    }
}

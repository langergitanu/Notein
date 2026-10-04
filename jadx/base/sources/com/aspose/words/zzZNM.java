package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZNM extends zzZNO {
    private int zzVL;
    private int zzVN;
    private int zzYxX;
    private int zzYxY;

    private zzZNM(zzYMM zzymm, zzYMD zzymd, zzYMD zzymd2) {
        super(zzymm, ((zzZ37) zzymm.zzYTt()).zzTV(true), zzymd, zzymd2);
        this.zzVL = Integer.MIN_VALUE;
        this.zzVN = Integer.MIN_VALUE;
        zzZ8s();
    }

    private int getRotation() {
        int orientation = zzZ8G().getOrientation();
        if (orientation != 1) {
            if (orientation == 3) {
                return -1;
            }
            if (orientation != 5) {
                return 0;
            }
        }
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int zzBA(int i) throws Exception {
        zzOz(i);
        if (zzZ8G().getWidth() > 0) {
            return -1;
        }
        if (zzZ93().zz60() == 8) {
            return zzZ8a();
        }
        boolean z = true;
        if (zzZ93() != zzZ91()) {
            if (!zzZ93().zza7().zzZYM()) {
                zzZ55 zzz55 = (zzZ55) zzZ93();
                zzYAU zzyauZzI = zzz55.zzI(true, true);
                if (zzyauZzI.zzZo6() == 25604 && zzyauZzI.zzY6M().zzYLJ().getWrapType() == 0 && zzyauZzI.zzY7r() != 5121 && ((zzY9X) zzyauZzI).zzY53().hasImage()) {
                    zzYAU zzyauZzZ = (zzYAU) zzyauZzI.zzYo1();
                    if (zzyauZzZ != null) {
                        zzyauZzZ = zzVE.zzZ(zzyauZzZ, (zzYAU) zzz55.zz6w());
                    }
                    if (zzyauZzZ != null && !zzY9R.zzmW(zzyauZzZ.zzZo6())) {
                    }
                } else {
                    z = false;
                }
            }
        }
        if (!z) {
            return -1;
        }
        zzZ55 zzz552 = (zzZ55) zzZ93();
        int iZzr = zzZ59.zzr(zzz552);
        return Math.max(0, zzZ59.zzq(zzz552)) + Math.max(0, iZzr) + zzZ55.zzc(zzz552);
    }

    public static zzZNM zzO(zzYMD zzymd) {
        zzYMM zzymmZzQ;
        if (zzYJP.zzk(zzymd) <= 0) {
            return null;
        }
        zzYIA zzyia = (zzYIA) com.aspose.words.internal.zzZKW.zzZ(zzymd, zzYIA.class);
        if (zzyia != null) {
            zzymmZzQ = zzYJP.zzQ((zzY6N) ((zzYIC) zzyia.zza9()).zza9());
        } else {
            zzZ55 zzz55 = (zzZ55) com.aspose.words.internal.zzZKW.zzZ(zzymd, zzZ55.class);
            zzymmZzQ = zzz55 != null ? (zzYMM) zzz55.zza9() : null;
        }
        if (zzymmZzQ == null) {
            return null;
        }
        zzYMD zzymdZzN = zzYJP.zzN(zzymmZzQ);
        zzYMD zzymdZzO = zzYJP.zzO(zzymmZzQ);
        if (zzymdZzO instanceof zzYIA) {
            zzymmZzQ = zzYJP.zzQ((zzY6N) zzymdZzO.zzqh(8).zza9().zza9());
        }
        return new zzZNM(zzymmZzQ, zzymdZzO, zzymdZzN);
    }

    private void zzOz(int i) throws Exception {
        int width = zzZ93().zzZZJ().getWidth();
        zzZ93().zzZZJ().setWidth(i);
        zzTB zztb = new zzTB();
        zzTC zztcZzZXK = ((zzTC) zzZ91()).zzZXK();
        zzTC zztcZzZXK2 = (zzTC) zzZ93();
        while (zztcZzZXK2 != zztcZzZXK) {
            zztcZzZXK2.zzO(zzZ93().zzZZJ());
            zztcZzZXK2.zzX(this);
            zztb.zzZ(zztcZzZXK2, Integer.MAX_VALUE, true);
            if (zztb.zzZXG() != null) {
                zztb.zzZXG().isActive();
            }
            zzTC zztcZzZXG = zztb.zzZXG();
            zzP(zztcZzZXG);
            zztcZzZXK2 = zztcZzZXG.zzZXK();
        }
        zzZ89();
        zzZ93().zzZZJ().setWidth(width);
    }

    private void zzZ85() throws Exception {
        if (zzbD() && zzZ8G().zzYMd() == 2) {
            zzVG(!(zzZ8y() + this.zzVN <= ((zzYN8) zzZZJ()).zzYqn()));
        }
    }

    private int zzZ86() throws Exception {
        int iZzBC = zzBC(this.zzVN);
        zzZ85();
        return iZzBC;
    }

    private int zzZ87() throws Exception {
        int height = zzZ8G().getHeight();
        if (height <= 0) {
            int bottom = zzZ91().getBottom() - zzZ93().getY();
            height = height == 0 ? bottom : Math.max(-height, bottom);
        }
        return Math.min(height, zzZZJ().getHeight());
    }

    private void zzZ88() throws Exception {
        for (zzYMD zzymdZzZ93 = zzZ93(); zzymdZzZ93 != null; zzymdZzZ93 = zzymdZzZ93.zz5Z()) {
            if (zzymdZzZ93.zz60() == 32) {
                zzZ55 zzz55 = (zzZ55) zzymdZzZ93;
                int x = zzz55.getX();
                int width = zzz55.getWidth();
                int width2 = zzz55.zzZZJ().getWidth();
                int i = getRotation() != 0 ? this.zzVN : this.zzVL;
                zzZ59.zzU(zzz55, i);
                zzz55.zzZZJ().setWidth(i);
                zzZ5H.zzT(zzz55);
                zzz55.setX(x);
                zzz55.setWidth(width);
                zzz55.zzZZJ().setWidth(width2);
            }
            if (zzymdZzZ93 == zzZ91()) {
                return;
            }
        }
    }

    private void zzZ89() throws Exception {
        for (zzYMD zzymdZzZ93 = zzZ93(); zzymdZzZ93 != null; zzymdZzZ93 = zzymdZzZ93.zz5Z()) {
            if (zzymdZzZ93.zz60() == 32) {
                zzZ55 zzz55 = (zzZ55) zzymdZzZ93;
                if (((zzZ37) ((zzYMM) zzz55.zza9()).zzYTt()).getAlignment() != 0) {
                    zzZ5H.zzR(zzz55);
                }
            }
            if (zzymdZzZ93 == zzZ91()) {
                return;
            }
        }
    }

    private int zzZ8a() throws Exception {
        boolean zZzZYM = zzZ93().zza7().zzZYM();
        zzYMD zzymdZz5Z = zzZ91().zz5Z();
        int iMax = Integer.MIN_VALUE;
        for (zzYMD zzymdZzZ93 = zzZ93(); zzymdZzZ93 != zzymdZz5Z; zzymdZzZ93 = zzymdZzZ93.zz5Z()) {
            if (zzymdZzZ93.zz60() == 8) {
                zzYIA zzyia = (zzYIA) zzymdZzZ93;
                iMax = Math.max(iMax, zzyia.getRight() - (zZzZYM ? 0 : zzWU.zzT((zzWV) ((zzWV) ((zzYIC) zzyia.zza9()).zzZXY()).zzYTo())));
            }
        }
        return iMax;
    }

    private void zzZ8b() {
        zzTC zztcZzZXK = ((zzTC) zzZ91()).zzZXK();
        boolean zZzZYM = zzZ93().zza7().zzZYM();
        int iMax = 0;
        int iMax2 = 0;
        int iMax3 = 0;
        int iMax4 = 0;
        for (zzZ6T zzz6tZza9 = zzZ93().zza9(); zzz6tZza9 != null && (zztcZzZXK == null || zzz6tZza9 != zztcZzZXK.zza9()); zzz6tZza9 = zzz6tZza9.zzYTj()) {
            int iZz6y = zzz6tZza9.zz6y();
            if (iZz6y != 8) {
                if (iZz6y != 32) {
                    throw new IllegalStateException("Unexpected layout type.");
                }
                zzYMM zzymm = (zzYMM) zzz6tZza9;
                zzZ3C zzz3cZzYMV = ((zzZ37) zzymm.zzYTt()).zzYMV();
                int iZzYN3 = zzz3cZzYMV.zzwz(1).isVisible() ? (zzz3cZzYMV.zzwz(1).zzYN3() + zzZ3D.zzYN2()) - Math.max(0, ((zzZ37) zzymm.zzYTt()).zzYM7()) : 0;
                int iZzYN32 = zzz3cZzYMV.zzwz(2).isVisible() ? (zzz3cZzYMV.zzwz(2).zzYN3() + zzZ3D.zzYN2()) - ((zzZ37) zzymm.zzYTt()).zzYM4() : 0;
                iMax = Math.max(iMax, iZzYN3);
                iMax2 = Math.max(iMax2, iZzYN32);
            } else if (!zZzZYM) {
                zzYIC zzyic = (zzYIC) zzz6tZza9;
                int iZzYN33 = ((zzZ3B) ((zzWV) zzyic.zzZXZ()).zzYTt()).zzYMV().zzwz(1).zzYN3();
                int iZzYN34 = ((zzZ3B) ((zzWV) ((zzWV) zzyic.zzZXY()).zzYTo()).zzYTt()).zzYMV().zzwz(2).zzYN3();
                int leftPadding = (iZzYN33 / 2) + ((zzZ3B) ((zzWV) zzyic.zzZXZ()).zzYTt()).getLeftPadding();
                int rightPadding = (iZzYN34 / 2) + ((zzZ3B) ((zzWV) ((zzWV) zzyic.zzZXY()).zzYTo()).zzYTt()).getRightPadding();
                iMax3 = Math.max(iMax3, Math.max(iZzYN33, leftPadding));
                iMax4 = Math.max(iMax4, Math.max(iZzYN34, rightPadding));
            }
        }
        this.zzYxY = Math.max(iMax3, iMax);
        this.zzYxX = Math.max(iMax4, iMax2);
    }

    private void zzZ8c() throws Exception {
        if (zzZ91().zz60() != 32) {
            return;
        }
        int bottom = (getRotation() != 0 ? this.zzVL : this.zzVN) - (zzZ91().getBottom() - zzZ93().getY());
        if (bottom > 0) {
            zzZ91().setHeight(zzZ91().getHeight() + bottom);
        }
    }

    @Override // com.aspose.words.zzZNO
    public final zzXR zzU(zzXR zzxr) {
        zzXR zzxrZzM = zzxr.zzYA(zzZ8G().getWrapType(), 2).zzM(zzZ8G().zzYMk() + this.zzYxY, zzZ8G().zzYMj(), zzZ8G().zzYMi() + this.zzYxX, zzZ8G().zzYMh());
        zzxrZzM.zz7F();
        return zzxrZzM;
    }

    @Override // com.aspose.words.zzZNO
    public final void zzZ8J() throws Exception {
        if (!zzZ8Y() && zzZ8T()) {
            zzXR zzxrZzZ8p = zzZ8p();
            zzXR zzxrZzZ8V = zzZ8V();
            zzXR zzxrZzYB = zzxrZzZ8p.zzYB(0, zzxrZzZ8V.getY() - zzxrZzZ8p.getY());
            if (zzxrZzZ8V.zzY(zzxrZzYB)) {
                return;
            }
            zzW(zzxrZzYB);
        }
    }

    public final int zzZ8d() {
        return this.zzYxX;
    }

    public final int zzZ8e() {
        return this.zzYxY;
    }

    @Override // com.aspose.words.zzZNO
    public final zzXR zzZ8p() throws Exception {
        int iZzBD = zzBD(this.zzVL);
        if (zzZ8G().zzYMf() == 1) {
            if (zzZ8G().getHorizontalAlignment() == 1) {
                iZzBD = Math.max(0, iZzBD - zzZ8G().zzYMi());
            } else if (zzZ8G().getHorizontalAlignment() == 3) {
                iZzBD = Math.min(iZzBD + zzZ8G().zzYMk(), zzZ8m().getWidth() - this.zzVL);
            }
        }
        return zzV(new zzXR(iZzBD, zzZ86(), this.zzVL, this.zzVN));
    }

    @Override // com.aspose.words.zzZNO
    public final boolean zzZ8v() {
        return true;
    }

    @Override // com.aspose.words.zzZNO
    public final int zzZ8y() throws Exception {
        int iZz5W;
        long jZzYqr;
        zzYMD zzymdZzZ93 = zzZ93();
        while (true) {
            zzymdZzZ93 = zzymdZzZ93.zz5Y();
            if (zzymdZzZ93 == null) {
                iZz5W = zzZ93().zzZZJ().zz5W();
                jZzYqr = zzZ93().zzZZJ().zzYqr();
                break;
            }
            if (!zzYJP.zzl(zzymdZzZ93)) {
                iZz5W = zzymdZzZ93.getBottom();
                jZzYqr = zzZ93().zzZZJ().zzYqr();
                break;
            }
        }
        return iZz5W + ((int) (jZzYqr >> 32));
    }

    @Override // com.aspose.words.zzZNO
    public final boolean zzZ8z() throws Exception {
        return zzZ8h();
    }

    @Override // com.aspose.words.zzZNO
    public final int zzZ98() {
        return com.aspose.words.internal.zzSA.zzn(zzZ93().zza7().zzZYM() ? 18.0d : 72.0d);
    }

    @Override // com.aspose.words.zzZNO
    public final int zzZ99() {
        return 21537;
    }

    @Override // com.aspose.words.zzZNO
    public final void zzZoN() throws Exception {
        int width = zzZ8G().getWidth() > 0 ? zzZ8G().getWidth() : zzZ93().zzZZJ().getWidth();
        int iZzBA = zzBA(width);
        if (iZzBA >= 0) {
            zzZoU();
            zzOz(iZzBA);
            this.zzVL = iZzBA;
        } else {
            this.zzVL = width;
        }
        this.zzVN = zzZ87();
        if (getRotation() != 0) {
            if (iZzBA >= 0) {
                this.zzVN = this.zzVL;
                this.zzVL = zzZ91().getBottom() - zzZ93().getY();
            } else {
                zzZoU();
                zzOz(this.zzVN);
            }
        }
        zzZ8b();
        zzZ8c();
        zzZ88();
    }
}

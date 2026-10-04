package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
abstract class zz53 extends zzZLD implements zzZCH, Cloneable {
    private boolean zzZ1a;
    private zz4S zzZ1b;
    private com.aspose.words.internal.zzZYG<zz82> zzZ58;
    private zz5A zzZ7k;
    private com.aspose.words.internal.zzZYG<zz82> zzZEy;
    protected zz07 zzZji;

    private void zzH(int i, Object obj) {
        zzH0 zzh0ZzZwy;
        zz8E zz75Var;
        if (zzZHY() != 2 || (zzh0ZzZwy = ((zz3V) this).zzZwy()) == null) {
            return;
        }
        ArrayList<zz8E> arrayListZzZQ7 = zzh0ZzZwy.zzZQ1().zzZQ7();
        if (!((Boolean) obj).booleanValue()) {
            for (int i2 = 0; i2 < arrayListZzZQ7.size(); i2++) {
                if (arrayListZzZQ7.get(i2).getType() == i) {
                    arrayListZzZQ7.remove(i2);
                    return;
                }
            }
            return;
        }
        if (i != 7) {
            zz75Var = i != 13 ? null : new zz75();
        } else {
            zzH3 zzh3 = new zzH3();
            zzh3.zzYV(0.5d);
            zz75Var = zzh3;
        }
        if (zz75Var != null) {
            arrayListZzZQ7.add(zz75Var);
        }
    }

    private double zzHA(int i) {
        if (zzZHY() != 2) {
            return 0.5d;
        }
        zzH1 zzh1ZzZQ1 = ((zz3V) this).zzZwy().zzZQ1();
        if (zzh1ZzZQ1.zzZQ7().size() <= 0) {
            return 0.5d;
        }
        for (zz8E zz8e : zzh1ZzZQ1.zzZQ7()) {
            if (zz8e.getType() == 15) {
                if (i == 264) {
                    return ((zz5E) zz8e).getContrast();
                }
                if (i == 265) {
                    return ((zz5E) zz8e).getBrightness();
                }
            }
        }
        return 0.5d;
    }

    private double zzHB(int i) {
        int iZzZtD;
        if (zzZHY() != 8 && zzZHY() != 0) {
            return 0.0d;
        }
        zz10 zz10VarZzZTl = ((zz2O) this).zzZTl();
        switch (i) {
            case 129:
                iZzZtD = zz10VarZzZTl.zzZtD();
                break;
            case 130:
                iZzZtD = zz10VarZzZTl.zzZtF();
                break;
            case 131:
                iZzZtD = zz10VarZzZTl.zzZtE();
                break;
            case 132:
                iZzZtD = zz10VarZzZTl.zzZtG();
                break;
            default:
                return 0.0d;
        }
        return ((double) iZzZtD) / 12700.0d;
    }

    private double zzHy(int i) {
        if (zzZHY() != 2) {
            return 0.0d;
        }
        zz3Z zz3zZzZPZ = ((zz3V) this).zzZwy().zzZPZ();
        switch (i) {
            case 256:
                return com.aspose.words.internal.zzZKQ.zzR(zz3zZzZPZ.zzZwG(), 5);
            case 257:
                return com.aspose.words.internal.zzZKQ.zzR(zz3zZzZPZ.zzZwH(), 5);
            case StyleIdentifier.COLORFUL_LIST_ACCENT_6 /* 258 */:
                return com.aspose.words.internal.zzZKQ.zzR(zz3zZzZPZ.zzZwF(), 5);
            case StyleIdentifier.COLORFUL_GRID_ACCENT_6 /* 259 */:
                return com.aspose.words.internal.zzZKQ.zzR(zz3zZzZPZ.zzZwE(), 5);
            default:
                return 0.0d;
        }
    }

    private boolean zzHz(int i) {
        if (zzZHY() != 2) {
            return false;
        }
        zzH1 zzh1ZzZQ1 = ((zz3V) this).zzZwy().zzZQ1();
        if (zzh1ZzZQ1.zzZQ7().size() <= 0) {
            return false;
        }
        Iterator<zz8E> it = zzh1ZzZQ1.zzZQ7().iterator();
        while (it.hasNext()) {
            if (it.next().getType() == i) {
                return true;
            }
        }
        return false;
    }

    private void zzV(int i, double d) {
        if (zzZHY() == 8 || zzZHY() == 0) {
            int iZzp = com.aspose.words.internal.zzSA.zzp(d);
            zz2O zz2o = (zz2O) this;
            if (zz2o.zzZAk() == null) {
                zz2o.zzY(new zz0J());
            }
            switch (i) {
                case 129:
                    zz2o.zzZTl().zzGO(iZzp);
                    break;
                case 130:
                    zz2o.zzZTl().zzGQ(iZzp);
                    break;
                case 131:
                    zz2o.zzZTl().zzGP(iZzp);
                    break;
                case 132:
                    zz2o.zzZTl().zzGR(iZzp);
                    break;
            }
        }
    }

    private void zzW(zz07 zz07Var) {
        ShapeBase shapeBase = this.zzZBi;
        if (shapeBase == null || shapeBase.isTopLevel()) {
            return;
        }
        zzYC3 zzyc3ZzYvW = this.zzZBi.zzYvW();
        zzyc3ZzYvW.zzQ(4129, Double.valueOf(zz07Var.zzQb()));
        zzyc3ZzYvW.zzQ(4130, Double.valueOf(zz07Var.zzYm()));
        zzyc3ZzYvW.zzQ(4131, Double.valueOf(zz07Var.getWidth()));
        zzyc3ZzYvW.zzQ(4132, Double.valueOf(zz07Var.getHeight()));
    }

    private void zzXN(double d) {
        double dZzZJ = com.aspose.words.internal.zzAN.zzZJ(d);
        com.aspose.words.internal.zzZQ4 zzzq4ZzW9 = this.zzZBi.zzW9(dZzZJ);
        com.aspose.words.internal.zzZQ4 zzzq4ZzY = com.aspose.words.internal.zzJ6.zzY(this.zzZBi.zzY9N(), ((float) dZzZJ) - ((float) this.zzZBi.getRotation()));
        int iZzYB = com.aspose.words.internal.zzSA.zzYB(Math.max((int) (zzzq4ZzW9.zzZm() - zzzq4ZzY.zzZm()), 0));
        int iZzYB2 = com.aspose.words.internal.zzSA.zzYB(Math.max((int) (zzzq4ZzW9.zzZo() - zzzq4ZzY.zzZo()), 0));
        int iZzYB3 = com.aspose.words.internal.zzSA.zzYB(Math.max((int) (zzzq4ZzY.zzkw() - zzzq4ZzW9.zzkw()), 0));
        int iZzYB4 = com.aspose.words.internal.zzSA.zzYB(Math.max((int) (zzzq4ZzY.zzZn() - zzzq4ZzW9.zzZn()), 0));
        this.zzZBi.setShapeAttr(4143, Integer.valueOf(iZzYB));
        this.zzZBi.setShapeAttr(4144, Integer.valueOf(iZzYB2));
        this.zzZBi.setShapeAttr(4145, Integer.valueOf(iZzYB3));
        this.zzZBi.setShapeAttr(4146, Integer.valueOf(iZzYB4));
    }

    private zz3Z zzZyn() {
        if (zzZHY() != 2) {
            return null;
        }
        return ((zz3V) this).zzZwy().zzZPZ();
    }

    @Override // com.aspose.words.zzZLD
    public String getAlternativeText() {
        return !this.zzZBi.isTopLevel() ? this.zzZ1b.zzZxV() != null ? this.zzZ1b.zzZxV().getDescription() : "" : (String) this.zzZBi.fetchShapeAttr(897);
    }

    @Override // com.aspose.words.zzZLD
    public boolean getAspectRatioLocked() {
        if (this.zzZBi.isTopLevel()) {
            if (this.zzZBi.zzYvW().contains(120)) {
                return ((Boolean) this.zzZBi.zzYvW().zzPk(120)).booleanValue();
            }
            return false;
        }
        Object objZzHE = this.zzZBi.zzY9i().zzZ1b.zzZxW().zzZFL().zzHE(3);
        if (objZzHE != null) {
            return ((Boolean) objZzHE).booleanValue();
        }
        return false;
    }

    @Override // com.aspose.words.zzZLD
    public final boolean getBiLevel() {
        return zzHz(7);
    }

    @Override // com.aspose.words.zzZLD
    public final double getBrightness() {
        return zzHA(StyleIdentifier.BIBLIOGRAPHY);
    }

    @Override // com.aspose.words.zzZLD
    public final double getContrast() {
        return zzHA(StyleIdentifier.BOOK_TITLE);
    }

    @Override // com.aspose.words.zzZLD
    public final double getCropBottom() {
        return zzHy(257);
    }

    @Override // com.aspose.words.zzZLD
    public final double getCropLeft() {
        return zzHy(StyleIdentifier.COLORFUL_LIST_ACCENT_6);
    }

    @Override // com.aspose.words.zzZLD
    public final double getCropRight() {
        return zzHy(StyleIdentifier.COLORFUL_GRID_ACCENT_6);
    }

    @Override // com.aspose.words.zzZLD
    public final double getCropTop() {
        return zzHy(256);
    }

    @Override // com.aspose.words.zzZCH
    public com.aspose.words.internal.zzZYG<zz82> getExtensions() {
        return this.zzZEy;
    }

    @Override // com.aspose.words.zzZLD
    public final boolean getExtrusionEnabled() {
        zzZC0 zzzc0 = (zzZC0) com.aspose.words.internal.zzZKW.zzZ(this, zzZC0.class);
        if (zzzc0 != null) {
            return (zzzc0.zzZTc() == null && zzzc0.zzZTd() == null) ? false : true;
        }
        return false;
    }

    @Override // com.aspose.words.zzZLD
    public final boolean getFitShapeToText() {
        return (zzZHY() == 8 || zzZHY() == 0) && ((zz2K) com.aspose.words.internal.zzZKW.zzZ(((zz2O) this).zzZTl().zzZtH(), zz2K.class)) != null;
    }

    @Override // com.aspose.words.zzZLD
    public final int getFlipOrientation() {
        return zzZTh().getFlipOrientation();
    }

    @Override // com.aspose.words.zzZLD
    public final boolean getGrayScale() {
        return zzHz(13);
    }

    public final int getHeight() {
        return (int) zzZTh().getHeight();
    }

    @Override // com.aspose.words.zzZLD
    public boolean getHidden() {
        zz4S zz4s;
        return (this.zzZBi.isTopLevel() || (zz4s = this.zzZ1b) == null || zz4s.zzZxV() == null) ? ((Boolean) this.zzZBi.fetchShapeAttr(958)).booleanValue() : this.zzZ1b.zzZxV().getHidden();
    }

    @Override // com.aspose.words.zzZLD
    public final double getInternalMarginBottom() {
        return zzHB(132);
    }

    @Override // com.aspose.words.zzZLD
    public final double getInternalMarginLeft() {
        return zzHB(129);
    }

    @Override // com.aspose.words.zzZLD
    public final double getInternalMarginRight() {
        return zzHB(131);
    }

    @Override // com.aspose.words.zzZLD
    public final double getInternalMarginTop() {
        return zzHB(130);
    }

    @Override // com.aspose.words.zzZLD
    public final int getLayoutFlow() {
        if (zzZHY() != 8 && zzZHY() != 0) {
            return 0;
        }
        zz2O zz2o = (zz2O) this;
        return zzZZZ.zz8(zz2o.zzZTl().zzZtu(), zz2o.zzZ1a);
    }

    @Override // com.aspose.words.zzZLD
    public String getName() {
        return !this.zzZBi.isTopLevel() ? this.zzZ1b.zzZxV() != null ? this.zzZ1b.zzZxV().getName() : "" : (String) this.zzZBi.fetchShapeAttr(896);
    }

    @Override // com.aspose.words.zzZLD
    public final OleFormat getOleFormat() {
        return null;
    }

    @Override // com.aspose.words.zzZLD
    public final double getRotation() {
        return zzZTh().zzZCC().zzZQQ();
    }

    @Override // com.aspose.words.zzZLD
    public final boolean getShadowEnabled() {
        zz7S zz7s = (zz7S) com.aspose.words.internal.zzZKW.zzZ(this, zz7S.class);
        if (zz7s == null || zz7s.zzZTe() == null) {
            return false;
        }
        for (zz2F zz2f : zz7s.zzZTe()) {
            if (zz2f.zzZvh() == 1 || zz2f.zzZvh() == 6 || zz2f.zzZvh() == 2) {
                return true;
            }
        }
        return false;
    }

    @Override // com.aspose.words.zzZLD
    public final int getShapeType() {
        if (zzZHY() == 3 || zzZHY() == 9 || zzZHY() == 10 || zzZHY() == 4 || zzZHY() == 5 || zzZHY() == 12) {
            return -1;
        }
        if (zzZHY() == 2) {
            return 75;
        }
        if (zzZHY() != 0 && zzZHY() != 8 && zzZHY() != 1) {
            return 0;
        }
        int iZzOL = zz84.zzOL(((zz2O) this).zzZTf().zzZAO());
        if (!this.zzZBi.zzY9o() || iZzOL != 1) {
            return iZzOL;
        }
        zz4S zz4s = this.zzZ1b;
        zzBX zzbx = (zz4s == null || zz4s.zzZxW() == null) ? null : (zzBX) com.aspose.words.internal.zzZKW.zzZ(this.zzZ1b.zzZxW(), zzBX.class);
        if (zzbx == null || !zzbx.zzZFH()) {
            return iZzOL;
        }
        return 202;
    }

    @Override // com.aspose.words.zzZLD
    public final int getTextBoxWrapMode() {
        if (zzZHY() == 8 || zzZHY() == 0) {
            return ((zz2O) this).zzZTl().zzZts();
        }
        return 2;
    }

    @Override // com.aspose.words.zzZLD
    public final TextPath getTextPath() {
        return new TextPath(this.zzZBi);
    }

    @Override // com.aspose.words.zzZLD
    public String getTitle() {
        return !this.zzZBi.isTopLevel() ? this.zzZ1b.zzZxV() != null ? this.zzZ1b.zzZxV().getTitle() : "" : (String) this.zzZBi.fetchShapeAttr(4157);
    }

    public final int getWidth() {
        return (int) zzZTh().getWidth();
    }

    @Override // com.aspose.words.zzZLD
    public final boolean isHorizontalRule() {
        return false;
    }

    @Override // com.aspose.words.zzZLD
    public final boolean isWordArt() {
        return false;
    }

    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.aspose.words.zzZLD
    public void setAlternativeText(String str) {
        if (!this.zzZBi.isTopLevel()) {
            if (this.zzZ1b.zzZxV() == null) {
                this.zzZ1b.zzY(new zz4T());
            }
            this.zzZ1b.zzZxV().setDescription(str);
        }
        this.zzZBi.setShapeAttr(897, str);
    }

    @Override // com.aspose.words.zzZLD
    public void setAspectRatioLocked(boolean z) {
        if (this.zzZBi.isTopLevel()) {
            this.zzZBi.zzYvW().zzQ(120, Boolean.valueOf(z));
        }
        this.zzZBi.zzY9i().zzZ1b.zzZxW().zzZFL().zza(3, z);
    }

    @Override // com.aspose.words.zzZLD
    public final void setBiLevel(boolean z) {
        zzH(7, Boolean.valueOf(z));
    }

    @Override // com.aspose.words.zzZLD
    public final void setBrightness(double d) {
        zzU(StyleIdentifier.BIBLIOGRAPHY, d);
    }

    @Override // com.aspose.words.zzZLD
    public final void setContrast(double d) {
        zzU(StyleIdentifier.BOOK_TITLE, d);
    }

    @Override // com.aspose.words.zzZLD
    public final void setCropBottom(double d) {
        zzT(257, d);
    }

    @Override // com.aspose.words.zzZLD
    public final void setCropLeft(double d) {
        zzT(StyleIdentifier.COLORFUL_LIST_ACCENT_6, d);
    }

    @Override // com.aspose.words.zzZLD
    public final void setCropRight(double d) {
        zzT(StyleIdentifier.COLORFUL_GRID_ACCENT_6, d);
    }

    @Override // com.aspose.words.zzZLD
    public final void setCropTop(double d) {
        zzT(256, d);
    }

    @Override // com.aspose.words.zzZCH
    public void setExtensions(com.aspose.words.internal.zzZYG<zz82> zzzyg) {
        this.zzZEy = zzzyg;
    }

    @Override // com.aspose.words.zzZLD
    public final void setFitShapeToText(boolean z) {
        if (zzZHY() == 8 || zzZHY() == 0) {
            zz2O zz2o = (zz2O) this;
            if (zz2o.zzZAk() == null) {
                zz2o.zzY(new zz0J());
            }
            zz10 zz10VarZzZTl = zz2o.zzZTl();
            if (z) {
                zz10VarZzZTl.zzZ(new zz2K());
            } else {
                zz10VarZzZTl.zzZ(new zz55());
            }
        }
    }

    @Override // com.aspose.words.zzZLD
    public final void setFlipOrientation(int i) {
        zzZTh().setFlipOrientation(i);
    }

    @Override // com.aspose.words.zzZLD
    public final void setGrayScale(boolean z) {
        zzH(13, Boolean.valueOf(z));
    }

    @Override // com.aspose.words.zzZLD
    public final void setInternalMarginBottom(double d) {
        zzV(132, d);
    }

    @Override // com.aspose.words.zzZLD
    public final void setInternalMarginLeft(double d) {
        zzV(129, d);
    }

    @Override // com.aspose.words.zzZLD
    public final void setInternalMarginRight(double d) {
        zzV(131, d);
    }

    @Override // com.aspose.words.zzZLD
    public final void setInternalMarginTop(double d) {
        zzV(130, d);
    }

    @Override // com.aspose.words.zzZLD
    public final void setLayoutFlow(int i) {
        if (zzZHY() == 8 || zzZHY() == 0) {
            zz2O zz2o = (zz2O) this;
            if (zz2o.zzZAk() == null) {
                zz2o.zzY(new zz0J());
            }
            zz2o.zzZTl().zzGJ(zzZZZ.zzGz(i));
        }
    }

    @Override // com.aspose.words.zzZLD
    public void setName(String str) {
        if (!this.zzZBi.isTopLevel()) {
            if (this.zzZ1b.zzZxV() == null) {
                this.zzZ1b.zzY(new zz4T());
            }
            this.zzZ1b.zzZxV().setName(str);
        }
        this.zzZBi.setShapeAttr(896, str);
    }

    @Override // com.aspose.words.zzZLD
    public final void setRotation(double d) {
        zzXN(d);
        zzZTh().zzX(zzHK.zzYR(d));
    }

    @Override // com.aspose.words.zzZLD
    public final void setTextBoxWrapMode(int i) {
        if (zzZHY() == 8 || zzZHY() == 0) {
            zz2O zz2o = (zz2O) this;
            if (zz2o.zzZAk() == null) {
                zz2o.zzY(new zz0J());
            }
            zz2o.zzZTl().zzGH(i);
        }
    }

    @Override // com.aspose.words.zzZLD
    public void setTitle(String str) {
        if (!this.zzZBi.isTopLevel()) {
            if (this.zzZ1b.zzZxV() == null) {
                this.zzZ1b.zzY(new zz4T());
            }
            this.zzZ1b.zzZxV().setTitle(str);
        }
        this.zzZBi.setShapeAttr(4157, str);
    }

    @Override // com.aspose.words.zzZLD
    public final void zzHC(int i) {
        zz6X zz6x = (zz6X) com.aspose.words.internal.zzZKW.zzZ(zzZTh(), zz6X.class);
        if (zz6x != null) {
            zz6x.zzXS(i);
        }
    }

    @Override // com.aspose.words.zzZLD
    public final void zzHD(int i) {
        zz6X zz6x = (zz6X) com.aspose.words.internal.zzZKW.zzZ(zzZTh(), zz6X.class);
        if (zz6x != null) {
            zz6x.zzXT(i);
        }
    }

    @Override // com.aspose.words.zzZLD
    public final void zzHv(int i) {
        if (zzZTh() instanceof zz6X) {
            ((zz6X) zzZTh()).zzXQ(i);
        } else {
            zzZTh().zzV(i);
        }
    }

    @Override // com.aspose.words.zzZLD
    public final void zzHw(int i) {
        if (zzZTh() instanceof zz6X) {
            ((zz6X) zzZTh()).zzXR(i);
        } else {
            zzZTh().zzW(i);
        }
    }

    @Override // com.aspose.words.zzZLD
    public final void zzHx(int i) {
        if (zzZHY() == 8 || zzZHY() == 0) {
            zz2O zz2o = (zz2O) this;
            if (zz2o.zzZAk() == null) {
                zz2o.zzY(new zz0J());
            }
            zz2o.zzZTl().zzGN(zzZZZ.zzGx(i));
        }
    }

    public final void zzM(com.aspose.words.internal.zzZYG<zz82> zzzyg) {
        this.zzZ58 = zzzyg;
    }

    public final void zzO(ShapeBase shapeBase) {
        this.zzZBi = shapeBase;
    }

    @Override // com.aspose.words.zzZLD
    public final void zzT(double d, boolean z) {
        double dZzZ = zzYBZ.zzZ(this.zzZBi, d, z, "height");
        this.zzZBi.setShapeAttr(4132, Double.valueOf(dZzZ));
        this.zzZBi.setShapeAttr(StyleIdentifier.INTENSE_EMPHASIS, Double.valueOf(com.aspose.words.internal.zzSA.zzp(dZzZ)));
        if (this.zzZBi.isTopLevel()) {
            dZzZ = com.aspose.words.internal.zzSA.zzp(dZzZ);
        }
        zzZTh().setHeight(com.aspose.words.internal.zzAN.zzZG(dZzZ));
    }

    @Override // com.aspose.words.zzZLD
    public final void zzU(double d, boolean z) {
        double dZzZ = zzYBZ.zzZ(this.zzZBi, d, z, "width");
        this.zzZBi.setShapeAttr(4131, Double.valueOf(dZzZ));
        this.zzZBi.setShapeAttr(StyleIdentifier.SUBTLE_EMPHASIS, Double.valueOf(com.aspose.words.internal.zzSA.zzp(dZzZ)));
        if (this.zzZBi.isTopLevel()) {
            dZzZ = com.aspose.words.internal.zzSA.zzp(dZzZ);
        }
        zzZTh().setWidth(com.aspose.words.internal.zzAN.zzZG(dZzZ));
    }

    public final void zzWY(boolean z) {
        this.zzZ1a = z;
    }

    @Override // com.aspose.words.zzZLD
    public final void zzWZ(boolean z) {
        if (zzZHY() == 8 || zzZHY() == 0) {
            zz2O zz2o = (zz2O) this;
            if (zz2o.zzZAk() == null) {
                zz2o.zzY(new zz0J());
            }
            zz2o.zzZTl().zzWE(z);
        }
    }

    @Override // com.aspose.words.zzZLD
    public final void zzXh(boolean z) {
        if (this.zzZ58 == null) {
            this.zzZ58 = new com.aspose.words.internal.zzZYG<>();
        }
        zz82.zzZ(this.zzZ58, "{C183D7F6-B498-43B3-948B-1728B52AA6E4}").zzXh(z);
    }

    public zz53 zzY(boolean z, zzZA5 zzza5) {
        zz53 zz53Var = (zz53) memberwiseClone();
        zz4S zz4s = this.zzZ1b;
        if (zz4s != null) {
            zz53Var.zzZ1b = zz4s.zzZxX();
        }
        zz07 zz07Var = this.zzZji;
        if (zz07Var != null) {
            zz53Var.zzZji = zz07Var.zzZAi();
        }
        zz53Var.zzZEy = zz80.zzN(this.zzZEy);
        return zz53Var;
    }

    public final void zzZ(zz07 zz07Var) {
        this.zzZji = zz07Var;
        zzW(zz07Var);
    }

    @Override // com.aspose.words.zzZLD
    public final boolean zzZBM() {
        com.aspose.words.internal.zzZYG<zz82> zzzyg;
        return com.aspose.words.internal.zzZKN.equals((String) this.zzZBi.fetchShapeAttr(897), "") && (zzzyg = this.zzZ58) != null && zzzyg.get("{C183D7F6-B498-43B3-948B-1728B52AA6E4}") != null && this.zzZ58.get("{C183D7F6-B498-43B3-948B-1728B52AA6E4}").zzZBM();
    }

    public final zz5A zzZEC() {
        return this.zzZ7k;
    }

    public void zzZFl() {
        this.zzZji = new zz07();
    }

    public abstract int zzZHY();

    public final zz07 zzZTh() {
        if (this.zzZji == null) {
            zzZFl();
        }
        return this.zzZji;
    }

    public final ShapeBase zzZyb() {
        return this.zzZBi;
    }

    public final zz4S zzZyc() {
        return this.zzZ1b;
    }

    public final boolean zzZyd() {
        return this.zzZ1a;
    }

    public final Node zzZye() {
        return this.zzZBi.getParentNode();
    }

    @Override // com.aspose.words.zzZLD
    public final zzZKI zzZyf() {
        return null;
    }

    @Override // com.aspose.words.zzZLD
    public final int zzZyg() {
        return (int) (zzZTh() instanceof zz6X ? ((zz6X) zzZTh()).zzZAd() : zzZTh().zzYm());
    }

    @Override // com.aspose.words.zzZLD
    public final int zzZyh() {
        return (int) (zzZTh() instanceof zz6X ? ((zz6X) zzZTh()).zzZAe() : zzZTh().zzQb());
    }

    @Override // com.aspose.words.zzZLD
    public final int zzZyi() {
        zz6X zz6x = (zz6X) com.aspose.words.internal.zzZKW.zzZ(zzZTh(), zz6X.class);
        return zz6x != null ? zzZHY() == 10 ? com.aspose.words.internal.zzSA.zzp(this.zzZBi.getHeight()) : (int) zz6x.zzZAg() : getHeight();
    }

    @Override // com.aspose.words.zzZLD
    public final int zzZyj() {
        zz6X zz6x = (zz6X) com.aspose.words.internal.zzZKW.zzZ(zzZTh(), zz6X.class);
        return zz6x != null ? zzZHY() == 10 ? com.aspose.words.internal.zzSA.zzp(this.zzZBi.getWidth()) : (int) zz6x.zzZAh() : getWidth();
    }

    @Override // com.aspose.words.zzZLD
    public final int zzZyk() {
        if (zzZHY() == 8 || zzZHY() == 0) {
            return zzZZZ.zzGy(((zz2O) this).zzZTl().zzMg());
        }
        return 0;
    }

    @Override // com.aspose.words.zzZLD
    public final boolean zzZyl() {
        if (zzZHY() == 8 || zzZHY() == 0) {
            return ((zz2O) this).zzZTl().zzZtv();
        }
        return false;
    }

    public final com.aspose.words.internal.zzZYG<zz82> zzZym() {
        return this.zzZ58;
    }

    public boolean zzZyo() {
        return true;
    }

    public final void zzZ(zz5A zz5a) {
        this.zzZ7k = zz5a;
    }

    public final void zzZ(zz4S zz4s) {
        this.zzZ1b = zz4s;
    }

    private void zzT(int i, double d) {
        zz3Z zz3zZzZyn = zzZyn();
        if (zz3zZzZyn == null) {
            return;
        }
        switch (i) {
            case 256:
                zz3zZzZyn.zzXG(com.aspose.words.internal.zzZKQ.zzR(d, 5));
                break;
            case 257:
                zz3zZzZyn.zzXH(com.aspose.words.internal.zzZKQ.zzR(d, 5));
                break;
            case StyleIdentifier.COLORFUL_LIST_ACCENT_6 /* 258 */:
                zz3zZzZyn.zzXF(com.aspose.words.internal.zzZKQ.zzR(d, 5));
                break;
            case StyleIdentifier.COLORFUL_GRID_ACCENT_6 /* 259 */:
                zz3zZzZyn.zzXE(com.aspose.words.internal.zzZKQ.zzR(d, 5));
                break;
        }
    }

    private void zzU(int i, double d) {
        zzH0 zzh0ZzZwy;
        zz5E zz5e;
        if (zzZHY() != 2 || (zzh0ZzZwy = ((zz3V) this).zzZwy()) == null) {
            return;
        }
        zzH1 zzh1ZzZQ1 = zzh0ZzZwy.zzZQ1();
        int i2 = 0;
        while (true) {
            if (i2 >= zzh1ZzZQ1.zzZQ7().size()) {
                zz5e = null;
                break;
            } else {
                if (zzh1ZzZQ1.zzZQ7().get(i2).getType() == 15) {
                    zz5e = (zz5E) zzh1ZzZQ1.zzZQ7().get(i2);
                    break;
                }
                i2++;
            }
        }
        if (zz5e == null) {
            zz5e = new zz5E();
            zzh1ZzZQ1.zzZQ7().add(zz5e);
        }
        if (i == 264) {
            zz5e.setContrast(d);
        } else {
            if (i != 265) {
                return;
            }
            zz5e.setBrightness(d);
        }
    }
}

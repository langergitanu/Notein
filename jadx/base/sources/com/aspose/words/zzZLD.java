package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZLD {
    protected ShapeBase zzZBi;

    public abstract String getAlternativeText();

    public abstract boolean getAspectRatioLocked();

    public abstract boolean getBiLevel();

    public abstract double getBrightness();

    public abstract double getContrast();

    public abstract double getCropBottom();

    public abstract double getCropLeft();

    public abstract double getCropRight();

    public abstract double getCropTop();

    public abstract boolean getExtrusionEnabled();

    public abstract boolean getFitShapeToText();

    public abstract int getFlipOrientation();

    public abstract boolean getGrayScale();

    public abstract boolean getHidden();

    public abstract double getInternalMarginBottom();

    public abstract double getInternalMarginLeft();

    public abstract double getInternalMarginRight();

    public abstract double getInternalMarginTop();

    public abstract int getLayoutFlow();

    public abstract String getName();

    public abstract OleFormat getOleFormat();

    public abstract double getRotation();

    public abstract boolean getShadowEnabled();

    public abstract int getShapeType();

    public abstract int getTextBoxWrapMode();

    public abstract TextPath getTextPath();

    public abstract String getTitle();

    public abstract boolean isHorizontalRule();

    public abstract boolean isWordArt();

    public abstract void setAlternativeText(String str);

    public abstract void setAspectRatioLocked(boolean z);

    public abstract void setBiLevel(boolean z);

    public abstract void setBrightness(double d);

    public abstract void setContrast(double d);

    public abstract void setCropBottom(double d);

    public abstract void setCropLeft(double d);

    public abstract void setCropRight(double d);

    public abstract void setCropTop(double d);

    public abstract void setFitShapeToText(boolean z);

    public abstract void setFlipOrientation(int i);

    public abstract void setGrayScale(boolean z);

    public void setHRef(String str) {
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            this.zzZBi.setShapeAttr(898, str);
        } else {
            this.zzZBi.removeShapeAttr(898);
        }
    }

    public abstract void setInternalMarginBottom(double d);

    public abstract void setInternalMarginLeft(double d);

    public abstract void setInternalMarginRight(double d);

    public abstract void setInternalMarginTop(double d);

    public abstract void setLayoutFlow(int i);

    public abstract void setName(String str);

    public abstract void setRotation(double d);

    public abstract void setTextBoxWrapMode(int i);

    public abstract void setTitle(String str);

    public abstract void zzHC(int i);

    public abstract void zzHD(int i);

    public abstract void zzHv(int i);

    public abstract void zzHw(int i);

    public abstract void zzHx(int i);

    public abstract void zzT(double d, boolean z);

    public abstract void zzU(double d, boolean z);

    public abstract void zzWZ(boolean z);

    public final void zzXI(long j) {
        zzHD((int) j);
        zzHC((int) (j >>> 32));
    }

    public abstract void zzXh(boolean z);

    public abstract boolean zzZBM();

    public abstract zzZKI zzZyf();

    public abstract int zzZyg();

    public abstract int zzZyh();

    public abstract int zzZyi();

    public abstract int zzZyj();

    public abstract int zzZyk();

    public abstract boolean zzZyl();
}

package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class ViewOptions implements Cloneable {
    private int zzWZW = 4;
    private int zzWZV = 0;
    private int zzWZU = 100;
    private boolean zzWZT = false;
    private boolean zzWZS = false;
    private boolean zzWZR = false;

    public static boolean zzjc(int i) {
        return i >= 10 && i <= 500;
    }

    public boolean getDisplayBackgroundShape() {
        return this.zzWZS;
    }

    public boolean getDoNotDisplayPageBoundaries() {
        return this.zzWZT;
    }

    public boolean getFormsDesign() {
        return this.zzWZR;
    }

    public int getViewType() {
        return this.zzWZW;
    }

    public int getZoomPercent() {
        return this.zzWZU;
    }

    public int getZoomType() {
        return this.zzWZV;
    }

    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public void setDisplayBackgroundShape(boolean z) {
        this.zzWZS = z;
    }

    public void setDoNotDisplayPageBoundaries(boolean z) {
        this.zzWZT = z;
    }

    public void setFormsDesign(boolean z) {
        this.zzWZR = z;
    }

    public void setViewType(int i) {
        this.zzWZW = i;
    }

    public void setZoomPercent(int i) {
        if (i == 0) {
            i = 100;
        }
        if (!zzjc(i)) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
        }
        this.zzWZU = i;
    }

    public void setZoomType(int i) {
        this.zzWZV = i;
    }

    public final ViewOptions zzXTL() {
        return (ViewOptions) memberwiseClone();
    }
}

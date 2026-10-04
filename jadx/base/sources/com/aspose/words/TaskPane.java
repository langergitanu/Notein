package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class TaskPane {
    private boolean zzBK;
    private WebExtension zzX4l = new WebExtension();
    private int zzX4m;
    private int zzX4n;
    private boolean zzXu;
    private double zzXy;

    public int getDockState() {
        return this.zzX4m;
    }

    public int getRow() {
        return this.zzX4n;
    }

    public WebExtension getWebExtension() {
        return this.zzX4l;
    }

    public double getWidth() {
        return this.zzXy;
    }

    public void isLocked(boolean z) {
        this.zzBK = z;
    }

    public void isVisible(boolean z) {
        this.zzXu = z;
    }

    public void setDockState(int i) {
        this.zzX4m = i;
    }

    public void setRow(int i) {
        this.zzX4n = i;
    }

    public void setWidth(double d) {
        this.zzXy = d;
    }

    public boolean isLocked() {
        return this.zzBK;
    }

    public boolean isVisible() {
        return this.zzXu;
    }
}

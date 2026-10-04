package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class TextWatermarkOptions {
    private String zzX3n = "Calibri";
    private int zz3V = com.aspose.words.internal.zzZQ1.zzkq();
    private boolean zzX3m = true;
    private float zz8W = 0.0f;
    private int zzX3l = 315;

    private void zzW0(double d) {
        this.zz8W = (float) com.aspose.words.internal.zzZ4.zzZ(d, 0.0d, 0.0d, 1638.0d, 1638.0d, true, "Size");
    }

    public int getColor() {
        return this.zz3V;
    }

    public String getFontFamily() {
        return this.zzX3n;
    }

    public float getFontSize() {
        return this.zz8W;
    }

    public int getLayout() {
        return this.zzX3l;
    }

    public boolean isSemitrasparent() {
        return this.zzX3m;
    }

    public void setColor(int i) {
        this.zz3V = i;
    }

    public void setFontFamily(String str) {
        this.zzX3n = str;
    }

    public void setFontSize(float f) {
        zzW0(f);
    }

    public void setLayout(int i) {
        this.zzX3l = i;
    }

    public final boolean zzXVY() {
        return this.zz8W == 0.0f;
    }

    public void isSemitrasparent(boolean z) {
        this.zzX3m = z;
    }
}

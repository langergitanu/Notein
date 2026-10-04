package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class HorizontalRuleFormat {
    private Shape zzZ2R;

    public HorizontalRuleFormat(Shape shape) {
        this.zzZ2R = shape;
    }

    private void zzX0(double d) throws Exception {
        this.zzZ2R.setHeight(com.aspose.words.internal.zzZ4.zzZ(d, 0.0d, 0.0d, 1584.0d, 1584.0d, true, "Height"));
    }

    private void zzX1(double d) {
        this.zzZ2R.zzY9h().zzZyf().zzX3(com.aspose.words.internal.zzZ4.zzZ(d, 1.0d, 1.0d, 100.0d, 100.0d, true, "WidthPercent"));
    }

    public int getAlignment() {
        return this.zzZ2R.zzY9h().zzZyf().zzZ4w();
    }

    public int getColor() {
        return this.zzZ2R.getFillColor();
    }

    public double getHeight() {
        return this.zzZ2R.getHeight();
    }

    public boolean getNoShade() {
        return this.zzZ2R.zzY9h().zzZyf().getNoShade();
    }

    public double getWidthPercent() {
        return this.zzZ2R.zzY9h().zzZyf().zzZ4v();
    }

    public void setAlignment(int i) {
        this.zzZ2R.zzY9h().zzZyf().zzAc(i);
    }

    public void setColor(int i) {
        this.zzZ2R.setFillColor(i);
    }

    public void setHeight(double d) throws Exception {
        zzX0(d);
    }

    public void setNoShade(boolean z) {
        this.zzZ2R.zzY9h().zzZyf().setNoShade(z);
    }

    public void setWidthPercent(double d) {
        zzX1(d);
    }
}

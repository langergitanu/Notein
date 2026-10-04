package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class Stroke implements zzZAV {
    private com.aspose.words.internal.zzPF zzXaC;
    private zzZ95 zzXaD;
    private Fill zzZyc;

    public Stroke(zzZ95 zzz95) {
        this.zzXaD = zzz95;
    }

    private static int zzHQ(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        if (i == 5) {
                            return 5;
                        }
                        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: type");
                    }
                }
            }
        }
        return i2;
    }

    private static int zzHq(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: endCap");
    }

    private void zzY3Z() {
        com.aspose.words.internal.zzPD zzpd = new com.aspose.words.internal.zzPD();
        zzpd.setType(zzHQ(getStartArrowType()));
        zzpd.setLength(zzlf(getStartArrowLength()));
        zzpd.setWidth(zzlg(getStartArrowWidth()));
        com.aspose.words.internal.zzPD zzpd2 = new com.aspose.words.internal.zzPD();
        zzpd2.setType(zzHQ(getEndArrowType()));
        zzpd2.setLength(zzlf(getEndArrowLength()));
        zzpd2.setWidth(zzlg(getEndArrowWidth()));
        this.zzXaC = new com.aspose.words.internal.zzPF(zzpd, zzpd2, zzHq(getEndCap()), (float) getWeight());
    }

    private zz7X zzY41() {
        zz7X strokeFill = this.zzXaD.getStrokeFill();
        if (strokeFill == null) {
            return null;
        }
        strokeFill.zzZ(this);
        return strokeFill;
    }

    private zz7X zzZ7d() {
        zz1C zz1c = new zz1C();
        this.zzXaD.setStrokeFill(zz1c);
        zz1c.zzZ(this);
        return zz1c;
    }

    private void zzi(com.aspose.words.internal.zzPV zzpv) {
        this.zzXaD.setStrokeBackColor(zzpv);
    }

    private static int zzlf(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: length");
    }

    private static int zzlg(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: width");
    }

    public int getBackColor() {
        return zzZBx().zzPG();
    }

    public int getBackThemeColor() throws Exception {
        return getFillableBackThemeColor();
    }

    public double getBackTintAndShade() {
        return getFillableBackTintAndShade();
    }

    public int getBaseForeColor() {
        return this.zzXaD.getStrokeBaseForeColor().zzPG();
    }

    public int getColor() {
        return getForeColor();
    }

    public int getColor2() {
        return getBackColor();
    }

    public int getDashStyle() {
        return this.zzXaD.getDashStyle();
    }

    public int getEndArrowLength() {
        return this.zzXaD.getEndArrowLength();
    }

    public int getEndArrowType() {
        return this.zzXaD.getEndArrowType();
    }

    public int getEndArrowWidth() {
        return this.zzXaD.getEndArrowWidth();
    }

    public int getEndCap() {
        return this.zzXaD.getEndCap();
    }

    public Fill getFill() {
        if (this.zzZyc == null) {
            this.zzZyc = new Fill(this);
        }
        return this.zzZyc;
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public int getFillType() {
        zz7X zz7xZzY41 = zzY41();
        if (zz7xZzY41 == null) {
            return 0;
        }
        return zz7xZzY41.getFillType();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public int getFillableBackColor() {
        return getFillableVisible() ? this.zzXaD.getStrokeBackColor().zzPF().zzPG() : com.aspose.words.internal.zzZQ1.zz2p;
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public int getFillableBackThemeColor() throws Exception {
        if (getFillableVisible()) {
            return this.zzXaD.getStrokeBackThemeColor();
        }
        return -1;
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public double getFillableBackTintAndShade() {
        if (getFillableVisible()) {
            return this.zzXaD.getStrokeBackTintAndShade();
        }
        return 0.0d;
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public int getFillableBaseForeColor() {
        return getFillableVisible() ? this.zzXaD.getStrokeBaseForeColor().zzPF().zzPG() : com.aspose.words.internal.zzZQ1.zz2p;
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public int getFillableForeColor() {
        return getFillableVisible() ? this.zzXaD.getStrokeForeColor().zzPF().zzPG() : com.aspose.words.internal.zzZQ1.zz2p;
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public int getFillableForeThemeColor() throws Exception {
        if (getFillableVisible()) {
            return this.zzXaD.getStrokeForeThemeColor();
        }
        return -1;
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public double getFillableForeTintAndShade() {
        if (getFillableVisible()) {
            return this.zzXaD.getStrokeForeTintAndShade();
        }
        return 0.0d;
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public byte[] getFillableImageBytes() {
        return null;
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public zzZ90 getFillableThemeProvider() {
        return this.zzXaD.getStrokeThemeProvider();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public double getFillableTransparency() {
        return this.zzXaD.getStrokeTransparency();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public boolean getFillableVisible() {
        return this.zzXaD.getStrokeVisible();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public int getFilledColor() {
        return getFillableForeColor();
    }

    public int getForeColor() {
        return zz8Q().zzPG();
    }

    public int getForeThemeColor() throws Exception {
        return getFillableForeThemeColor();
    }

    public double getForeTintAndShade() {
        return getFillableForeTintAndShade();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public double getGradientAngle() {
        zz7X zz7xZzY41 = zzY41();
        if (zz7xZzY41 == null) {
            return 0.0d;
        }
        return zz7xZzY41.zzZBu();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public GradientStopCollection getGradientStops() {
        zz7C zz7c = (zz7C) com.aspose.words.internal.zzZKW.zzZ(zzY41(), zz7C.class);
        if (zz7c != null) {
            return zz7c.zzZAx();
        }
        throw new IllegalStateException("Object doesn't support this action.");
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public int getGradientStyle() {
        zz7X zz7xZzY41 = zzY41();
        if (zz7xZzY41 == null) {
            return -1;
        }
        return zz7xZzY41.getGradientStyle();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public int getGradientVariant() {
        zz7X zz7xZzY41 = zzY41();
        if (zz7xZzY41 == null) {
            return 0;
        }
        return zz7xZzY41.getGradientVariant();
    }

    public byte[] getImageBytes() throws Exception {
        return this.zzXaD.getStrokeImageBytes();
    }

    public int getJoinStyle() {
        return this.zzXaD.getJoinStyle();
    }

    public final int getLineFillType() {
        return this.zzXaD.getLineFillType();
    }

    public int getLineStyle() {
        return this.zzXaD.getLineStyle();
    }

    @ReservedForInternalUse
    @Deprecated
    public boolean getOldOn() {
        return getFillableVisible();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public double getOldOpacity() {
        return 1.0d - getFillableTransparency();
    }

    public boolean getOn() {
        return getVisible();
    }

    public double getOpacity() {
        return 1.0d - getTransparency();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public int getPatternType() {
        throw new IllegalStateException("Pattern cannot be applied to Stroke.");
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public int getPresetTexture() {
        throw new IllegalStateException("Preset texture cannot be applied to Stroke.");
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public boolean getRotateWithObject() {
        throw new IllegalStateException("Object doesn't support this action.");
    }

    public int getStartArrowLength() {
        return this.zzXaD.getStartArrowLength();
    }

    public int getStartArrowType() {
        return this.zzXaD.getStartArrowType();
    }

    public int getStartArrowWidth() {
        return this.zzXaD.getStartArrowWidth();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public int getTextureAlignment() {
        return 9;
    }

    public double getTransparency() {
        return this.zzXaD.getStrokeTransparency();
    }

    public boolean getVisible() {
        return this.zzXaD.getStrokeVisible();
    }

    public double getWeight() {
        return this.zzXaD.getWeight();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void oneColorGradient(int i, int i2, double d) {
        zz7X zz7xZzY41 = zzY41();
        zzBW zzbwZzj = (zz7xZzY41 == null || zz7xZzY41.zzZBn() == null) ? zzBW.zzj(com.aspose.words.internal.zzPV.zzKa) : zz7xZzY41.zzZBn().zzZHt();
        zzBW zzbwZzZHt = zzbwZzj.zzZHt();
        if (!com.aspose.words.internal.zzAN.zzL(d, 0.5d)) {
            zz5C zz5c = new zz5C();
            zz5B zz5b = new zz5B();
            if (com.aspose.words.internal.zzAN.zzK(d, 0.5d)) {
                zz5c.setValue(d * 2.0d);
                zz5b.setValue(0.0d);
            } else {
                zz5c.setValue((1.0d - d) * 2.0d);
                zz5b.setValue(1.0d - zz5c.getValue());
            }
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz5C>) zzbwZzZHt.zzZNX(), zz5c);
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz5B>) zzbwZzZHt.zzZNX(), zz5b);
        }
        setFill(new zz7C(zzbwZzj, zzbwZzZHt, i, i2, this.zzXaD.getStrokeThemeProvider()));
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void patterned(int i) {
        throw new IllegalStateException("Pattern cannot be applied to Stroke.");
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void presetTextured(int i) {
        throw new IllegalStateException("Preset texture cannot be applied to Stroke.");
    }

    public void setBackColor(int i) {
        zzi(com.aspose.words.internal.zzPV.zzYR(i));
    }

    public void setBackThemeColor(int i) throws Exception {
        setFillableBackThemeColor(i);
    }

    public void setBackTintAndShade(double d) {
        setFillableBackTintAndShade(d);
    }

    public void setColor(int i) {
        setForeColor(i);
    }

    public void setColor2(int i) {
        setBackColor(i);
    }

    public void setDashStyle(int i) {
        this.zzXaD.setDashStyle(i);
    }

    public void setEndArrowLength(int i) {
        this.zzXaD.setEndArrowLength(i);
    }

    public void setEndArrowType(int i) {
        this.zzXaD.setEndArrowType(i);
    }

    public void setEndArrowWidth(int i) {
        this.zzXaD.setEndArrowWidth(i);
    }

    public void setEndCap(int i) {
        this.zzXaD.setEndCap(i);
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setFill(zzZAW zzzaw) {
        zz7X zz7x = (zz7X) com.aspose.words.internal.zzZKW.zzZ(zzzaw, zz7X.class);
        if (zz7x == null || !(zz7x.zzZQ4() == 5 || zz7x.zzZQ4() == 1 || zz7x.zzZQ4() == 3)) {
            throw new IllegalStateException("Invalid fill type for this object.");
        }
        zz7x.zzZ(this);
        this.zzXaD.setStrokeFill(zz7x);
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setFillableBackColor(int i) {
        this.zzXaD.setStrokeBackColor(com.aspose.words.internal.zzPV.zzYR(i));
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setFillableBackThemeColor(int i) throws Exception {
        this.zzXaD.setStrokeBackThemeColor(i);
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setFillableBackTintAndShade(double d) {
        this.zzXaD.setStrokeBackTintAndShade(d);
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setFillableForeColor(int i) {
        this.zzXaD.setStrokeForeColor(com.aspose.words.internal.zzPV.zzYR(i));
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setFillableForeThemeColor(int i) throws Exception {
        this.zzXaD.setStrokeForeThemeColor(i);
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setFillableForeTintAndShade(double d) {
        this.zzXaD.setStrokeForeTintAndShade(d);
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setFillableTransparency(double d) {
        this.zzXaD.setStrokeTransparency(d);
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setFillableVisible(boolean z) {
        this.zzXaD.setStrokeVisible(z);
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setFilledColor(int i) {
        setFillableForeColor(i);
    }

    public void setForeColor(int i) {
        zzm(com.aspose.words.internal.zzPV.zzYR(i));
    }

    public void setForeThemeColor(int i) throws Exception {
        setFillableForeThemeColor(i);
    }

    public void setForeTintAndShade(double d) {
        setFillableForeTintAndShade(d);
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setGradientAngle(double d) {
        zz7X zz7xZzY41 = zzY41();
        if (zz7xZzY41 != null) {
            zz7xZzY41.zzXV(d);
        }
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setImage(byte[] bArr) {
        throw new IllegalStateException("SetImage cannot be applied to a fill of the Stroke.");
    }

    public void setJoinStyle(int i) {
        this.zzXaD.setJoinStyle(i);
    }

    public void setLineStyle(int i) {
        this.zzXaD.setLineStyle(i);
    }

    @ReservedForInternalUse
    @Deprecated
    public void setOldOn(boolean z) {
        setFillableVisible(z);
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setOldOpacity(double d) {
        setFillableTransparency(1.0d - d);
    }

    public void setOn(boolean z) {
        setVisible(z);
    }

    public void setOpacity(double d) {
        com.aspose.words.internal.zzZ4.zzZ(d, 0.0d, 1.0d, "Opacity");
        setTransparency(1.0d - d);
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setRotateWithObject(boolean z) {
        throw new IllegalStateException("Object doesn't support this action.");
    }

    public void setStartArrowLength(int i) {
        this.zzXaD.setStartArrowLength(i);
    }

    public void setStartArrowType(int i) {
        this.zzXaD.setStartArrowType(i);
    }

    public void setStartArrowWidth(int i) {
        this.zzXaD.setStartArrowWidth(i);
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setTextureAlignment(int i) {
        throw new IllegalStateException("TextureAlignment cannot be applied to Stroke.");
    }

    public void setTransparency(double d) {
        com.aspose.words.internal.zzZ4.zzZ(d, 0.0d, 1.0d, "Transparency");
        this.zzXaD.setStrokeTransparency(d);
    }

    public void setVisible(boolean z) {
        this.zzXaD.setStrokeVisible(z);
    }

    public void setWeight(double d) {
        this.zzXaD.setWeight(d);
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void solid() {
        zz7X zz7xZzY41 = zzY41();
        if (zz7xZzY41 == null) {
            setVisible(true);
        } else {
            if (zz7xZzY41.zzZQ4() == 5) {
                return;
            }
            zzZ7d();
        }
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void twoColorGradient(int i, int i2) {
        zz7X zz7xZzY41 = zzY41();
        setFill(new zz7C((zz7xZzY41 == null || zz7xZzY41.zzZBn() == null) ? zzBW.zzj(com.aspose.words.internal.zzPV.zzKa) : zz7xZzY41.zzZBn().zzZHt(), (zz7xZzY41 == null || zz7xZzY41.zzZBm() == null) ? zzBW.zzj(com.aspose.words.internal.zzPV.zzKa) : zz7xZzY41.zzZBm().zzZHt(), i, i2, this.zzXaD.getStrokeThemeProvider()));
    }

    public final com.aspose.words.internal.zzPV zz8Q() {
        return this.zzXaD.getStrokeForeColor();
    }

    public final com.aspose.words.internal.zzPF zzNO() {
        if (this.zzXaC == null) {
            zzY3Z();
        }
        return this.zzXaC;
    }

    public final boolean zzY40() {
        return (getStartArrowType() == 0 && getEndArrowType() == 0) ? false : true;
    }

    public final com.aspose.words.internal.zzPV zzZBx() {
        return this.zzXaD.getStrokeBackColor();
    }

    public final void zzm(com.aspose.words.internal.zzPV zzpv) {
        this.zzXaD.setStrokeForeColor(zzpv);
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public double getTransparency(zzBW zzbw) {
        if (zzbw.zzZFG() == null) {
            return 0.0d;
        }
        return 1.0d - zzbw.zzZFG().getValue();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setTransparency(zzBW zzbw, double d) {
        zzbw.zzY0(1.0d - d);
    }
}

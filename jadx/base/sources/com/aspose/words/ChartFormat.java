package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class ChartFormat implements zzZ95, zzZAV {
    private Stroke zzZyb;
    private Fill zzZyc;
    private zzZD3 zzZyd;

    public ChartFormat(zzZD3 zzzd3) {
        this.zzZyd = zzzd3;
    }

    private zz4G zz30() {
        zz4G outline = this.zzZyd.getOutline();
        outline.getFill().zzZ(this);
        return outline;
    }

    private zz7X zz31() {
        zz7X fill = this.zzZyd.getFill();
        fill.zzZ(this);
        return fill;
    }

    private void zz32() {
        if (!this.zzZyd.isFillSupported()) {
            throw new IllegalStateException("Fill is not supported by this chart element.");
        }
        this.zzZyd.materializeSpPr();
    }

    private void zzZ(zzBW zzbw, int i, int i2, double d) {
        zzBW zzbwZzZHt = zzbw.zzZHt();
        if (!com.aspose.words.internal.zzAN.zzL(d, 0.5d)) {
            com.aspose.words.internal.zzZQG.zzZ(zzbwZzZHt.zzZNX(), com.aspose.words.internal.zzAN.zzK(d, 0.5d) ? new zz2P(d * 2.0d) : new zz0C((1.0d - d) * 2.0d));
        }
        zzZ(zzbw, zzbwZzZHt, i, i2);
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public int getDashStyle() {
        return zz30().getDashStyle();
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public int getEndArrowLength() {
        return zz30().getEndArrowLength();
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public int getEndArrowType() {
        return zz30().getEndArrowType();
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public int getEndArrowWidth() {
        return zz30().getEndArrowWidth();
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public int getEndCap() {
        return zz30().getEndCap();
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
        return zz31().getFillType();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public int getFillableBackColor() {
        return zz31().zzZBx().zzPF().zzPG();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public int getFillableBackThemeColor() {
        return -1;
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public double getFillableBackTintAndShade() {
        return 0.0d;
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public int getFillableBaseForeColor() {
        return zz31().zzZBy().zzPF().zzPG();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public int getFillableForeColor() {
        return zz31().zz8Q().zzPF().zzPG();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public int getFillableForeThemeColor() {
        return -1;
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public double getFillableForeTintAndShade() {
        return 0.0d;
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public byte[] getFillableImageBytes() {
        if (zz31().zzZQ4() == 0) {
            return ((zzH0) zz31()).zzZQ1().zzZQa();
        }
        return null;
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public zzZ90 getFillableThemeProvider() {
        return this.zzZyd.getThemeProvider() != null ? this.zzZyd.getThemeProvider() : Theme.zzXVL();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public double getFillableTransparency() {
        return 1.0d - zz31().getOpacity();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public boolean getFillableVisible() {
        return zz31().getOn();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public int getFilledColor() {
        return getFillableForeColor();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public double getGradientAngle() {
        return zz31().zzZBu();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public GradientStopCollection getGradientStops() {
        zz7C zz7c = (zz7C) com.aspose.words.internal.zzZKW.zzZ(zz31(), zz7C.class);
        if (zz7c == null) {
            throw new IllegalStateException("Object doesn't support this action.");
        }
        this.zzZyd.materializeSpPr();
        return zz7c.zzZAx();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public int getGradientStyle() {
        return zz31().getGradientStyle();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public int getGradientVariant() {
        return zz31().getGradientVariant();
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public int getJoinStyle() {
        return zz30().getJoinStyle();
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public int getLineFillType() {
        return zz30().getLineFillType();
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public int getLineStyle() {
        return zz30().getLineStyle();
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

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public int getPatternType() {
        if (zz31().getFillType() == 1) {
            return ((zz41) zz31()).zzZwL();
        }
        return -1;
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public int getPresetTexture() throws Exception {
        return zzZO0.zzBQ(com.aspose.words.internal.zzIL.zz3(zz31().getImageBytes()).hashCode());
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public boolean getRotateWithObject() {
        return zz31().zzZQ5();
    }

    public int getShapeType() {
        return this.zzZyd.getShapeType();
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public int getStartArrowLength() {
        return zz30().getStartArrowLength();
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public int getStartArrowType() {
        return zz30().getStartArrowType();
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public int getStartArrowWidth() {
        return zz30().getStartArrowWidth();
    }

    public Stroke getStroke() {
        if (this.zzZyb == null) {
            this.zzZyb = new Stroke(this);
        }
        return this.zzZyb;
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public com.aspose.words.internal.zzPV getStrokeBackColor() {
        return zz30().zzZBx().zzPF();
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public int getStrokeBackThemeColor() {
        return -1;
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public double getStrokeBackTintAndShade() {
        return 0.0d;
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public com.aspose.words.internal.zzPV getStrokeBaseForeColor() {
        return zz30().getFill().zzZBy().zzPF();
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public zz7X getStrokeFill() {
        return zz30().getFill();
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public com.aspose.words.internal.zzPV getStrokeForeColor() {
        return zz30().zz8Q().zzPF();
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public int getStrokeForeThemeColor() {
        return -1;
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public double getStrokeForeTintAndShade() {
        return 0.0d;
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public byte[] getStrokeImageBytes() throws Exception {
        return zz30().getImageBytes();
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public zzZ90 getStrokeThemeProvider() {
        return this.zzZyd.getThemeProvider();
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public double getStrokeTransparency() {
        return 1.0d - zz30().getOpacity();
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public boolean getStrokeVisible() {
        return zz30().getOn();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public int getTextureAlignment() {
        zzGY zzgy;
        zzH0 zzh0 = (zzH0) com.aspose.words.internal.zzZKW.zzZ(zz31(), zzH0.class);
        if (zzh0 == null || (zzgy = (zzGY) com.aspose.words.internal.zzZKW.zzZ(zzh0.zzZPY(), zzGY.class)) == null) {
            return 9;
        }
        return zzZO0.zzBJ(zzgy.getAlignment());
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

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public double getWeight() {
        if (!zz30().getOn() || zz30().zzLh(0)) {
            return zz30().getWeight();
        }
        return 0.75d;
    }

    public boolean isDefined() {
        return this.zzZyd.isFormatDefined();
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void oneColorGradient(int i, int i2, double d) {
        zzZ(zz31().zzZBn() != null ? zz31().zzZBn().zzZHt() : getFillableThemeProvider().getThemeColor(4), i, i2, d);
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void patterned(int i) {
        zz32();
        zz41 zz41Var = new zz41();
        zz41Var.zzHf(i);
        zz41Var.zzM(zz31().zzZBn() != null ? zz31().zzZBn().zzZHt() : getFillableThemeProvider().getThemeColor(4));
        zz41Var.zzN(zz31().zzZBm() != null ? zz31().zzZBm().zzZHt() : getFillableThemeProvider().getThemeColor(14));
        zzZ(zz41Var);
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void presetTextured(int i) {
        String strZzBP = zzZO0.zzBP(i);
        if (com.aspose.words.internal.zzZKN.equals(strZzBP, "")) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: The specified texture is out of range.");
        }
        zz32();
        zzH0 zzh0 = new zzH0();
        zzh0.zzZ(new zzGY());
        zzh0.zzZQ1().zzYt(zzZO0.zzLu(strZzBP));
        zzZ(zzh0);
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public void setDashStyle(int i) {
        this.zzZyd.materializeSpPr();
        zz30().setDashStyle(i);
    }

    public void setDefaultFill() {
        if (isDefined()) {
            zz32();
            this.zzZyd.setFill(null);
        }
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public void setEndArrowLength(int i) {
        this.zzZyd.materializeSpPr();
        zz30().setEndArrowLength(i);
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public void setEndArrowType(int i) {
        this.zzZyd.materializeSpPr();
        zz30().setEndArrowType(i);
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public void setEndArrowWidth(int i) {
        this.zzZyd.materializeSpPr();
        zz30().setEndArrowWidth(i);
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public void setEndCap(int i) {
        this.zzZyd.materializeSpPr();
        zz30().setEndCap(i);
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setFill(zzZAW zzzaw) {
        zz7X zz7x = (zz7X) com.aspose.words.internal.zzZKW.zzZ(zzzaw, zz7X.class);
        if (zz7x == null) {
            throw new IllegalStateException("Invalid fill type for this object.");
        }
        zzZ(zz7x);
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setFillableBackColor(int i) {
        zz32();
        if (zz31().zzZQ4() != 3) {
            zz31().zzi(com.aspose.words.internal.zzPV.zzYR(i));
        }
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setFillableBackThemeColor(int i) {
        throw new UnsupportedOperationException("Method or property is not implemented for ChartFormat.");
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setFillableBackTintAndShade(double d) {
        throw new UnsupportedOperationException("Method or property is not implemented for ChartFormat.");
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setFillableForeColor(int i) {
        zz32();
        if (zz31().zzZQ4() == 3) {
            zzZ(new zz1C());
        }
        zz31().zzm(com.aspose.words.internal.zzPV.zzYR(i));
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setFillableForeThemeColor(int i) {
        throw new UnsupportedOperationException("Method or property is not implemented for ChartFormat.");
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setFillableForeTintAndShade(double d) {
        throw new UnsupportedOperationException("Method or property is not implemented for ChartFormat.");
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setFillableTransparency(double d) {
        zz32();
        if (zz31().zzZQ4() == 3) {
            zzZ(new zz1C());
        }
        zz31().setOpacity(1.0d - d);
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setFillableVisible(boolean z) {
        zz32();
        zz31().setOn(z);
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setFilledColor(int i) {
        setFillableForeColor(i);
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setGradientAngle(double d) {
        zz31().zzXV(d);
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setImage(byte[] bArr) {
        zz32();
        zzZ(new zzH0());
        zz31().setImageBytes(bArr);
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public void setJoinStyle(int i) {
        this.zzZyd.materializeSpPr();
        zz30().setJoinStyle(i);
    }

    @ReservedForInternalUse
    @Deprecated
    public void setLineFillType(int i) {
        this.zzZyd.materializeSpPr();
        zz30().setLineFillType(i);
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public void setLineStyle(int i) {
        this.zzZyd.materializeSpPr();
        zz30().setLineStyle(i);
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

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setRotateWithObject(boolean z) {
        zz32();
        zz31().zzY6(z);
    }

    public void setShapeType(int i) {
        this.zzZyd.setShapeType(i);
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public void setStartArrowLength(int i) {
        this.zzZyd.materializeSpPr();
        zz30().setStartArrowLength(i);
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public void setStartArrowType(int i) {
        this.zzZyd.materializeSpPr();
        zz30().setStartArrowType(i);
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public void setStartArrowWidth(int i) {
        this.zzZyd.materializeSpPr();
        zz30().setStartArrowWidth(i);
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public void setStrokeBackColor(com.aspose.words.internal.zzPV zzpv) {
        this.zzZyd.materializeSpPr();
        zz30().zzi(zzpv);
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public void setStrokeBackThemeColor(int i) {
        throw new UnsupportedOperationException("Method or property is not implemented for ChartFormat.");
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public void setStrokeBackTintAndShade(double d) {
        throw new UnsupportedOperationException("Method or property is not implemented for ChartFormat.");
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public void setStrokeFill(zz7X zz7x) {
        zz30().setFill(zz7x);
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public void setStrokeForeColor(com.aspose.words.internal.zzPV zzpv) {
        this.zzZyd.materializeSpPr();
        if (zz30().getFill().zzZQ4() == 3) {
            zz30().setFill(new zz1C());
        }
        zz30().zzm(zzpv);
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public void setStrokeForeThemeColor(int i) {
        throw new UnsupportedOperationException("Method or property is not implemented for ChartFormat.");
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public void setStrokeForeTintAndShade(double d) {
        throw new UnsupportedOperationException("Method or property is not implemented for ChartFormat.");
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public void setStrokeTransparency(double d) {
        this.zzZyd.materializeSpPr();
        if (zz30().getFill().zzZQ4() == 3) {
            zz30().setFill(new zz1C());
        }
        zz30().setOpacity(1.0d - d);
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public void setStrokeVisible(boolean z) {
        this.zzZyd.materializeSpPr();
        zz30().setOn(z);
        if (z && zz30().getFill().zzZQ4() == 3) {
            zz30().setFill(new zz1C());
        }
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setTextureAlignment(int i) {
        if (i == 9) {
            throw new IllegalStateException("TextureAlignment.None cannot be applied directly.");
        }
        zzH0 zzh0 = (zzH0) com.aspose.words.internal.zzZKW.zzZ(zz31(), zzH0.class);
        if (zzh0 == null) {
            throw new IllegalStateException("Texture alignment can be applied to a texture fill only.");
        }
        zzGY zzgy = (zzGY) com.aspose.words.internal.zzZKW.zzZ(zzh0.zzZPY(), zzGY.class);
        if (zzgy == null) {
            throw new IllegalStateException("Texture alignment can be applied to a tile texture fill only.");
        }
        zzgy.setAlignment(zzZO0.zzBI(i));
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void setTransparency(zzBW zzbw, double d) {
        zzbw.zzY0(1.0d - d);
    }

    @Override // com.aspose.words.zzZ95
    @ReservedForInternalUse
    @Deprecated
    public void setWeight(double d) {
        this.zzZyd.materializeSpPr();
        zz30().setWeight(d);
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void solid() {
        zz32();
        if (zz31().zzZQ4() == 5) {
            return;
        }
        zzZ(new zz1C());
        zz31().zzi(com.aspose.words.internal.zzPV.zzI5);
    }

    @Override // com.aspose.words.zzZAV
    @ReservedForInternalUse
    @Deprecated
    public void twoColorGradient(int i, int i2) {
        zzZ90 fillableThemeProvider = getFillableThemeProvider();
        zzZ(zz31().zzZBn() != null ? zz31().zzZBn().zzZHt() : fillableThemeProvider.getThemeColor(4), zz31().zzZBm() != null ? zz31().zzZBm().zzZHt() : fillableThemeProvider.getThemeColor(14), i, i2);
    }

    private void zzZ(zzBW zzbw, zzBW zzbw2, int i, int i2) {
        zz32();
        zzZ(new zz7C(zzbw, zzbw2, i, i2, getFillableThemeProvider()));
        zz31().zzY6(true);
    }

    private void zzZ(zz7X zz7x) {
        this.zzZyd.setFill(zz7x);
        if (zz7x != null) {
            zz7x.zzZ(this);
        }
    }
}

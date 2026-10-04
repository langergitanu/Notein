package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class ChartMarker implements zzZD3, Cloneable {
    private zzZ90 zzZxX;
    private zzEF zzZxY;
    private ChartFormat zzZyE;

    public ChartMarker(zzGK zzgk) {
        this(zzgk.getDocument().zzZqI());
    }

    @Override // com.aspose.words.zzZD3
    @ReservedForInternalUse
    @Deprecated
    public zz7X getFill() {
        return zzaQ().getFill();
    }

    public ChartFormat getFormat() {
        if (this.zzZyE == null) {
            this.zzZyE = new ChartFormat(this);
        }
        return this.zzZyE;
    }

    @Override // com.aspose.words.zzZD3
    @ReservedForInternalUse
    @Deprecated
    public zz4G getOutline() {
        return zzaQ().getOutline();
    }

    @Override // com.aspose.words.zzZD3
    @ReservedForInternalUse
    @Deprecated
    public int getShapeType() {
        return 0;
    }

    public int getSize() {
        return ((Integer) this.zzZxY.zzLv(1)).intValue();
    }

    public int getSymbol() {
        return ((Integer) this.zzZxY.zzLv(0)).intValue();
    }

    @Override // com.aspose.words.zzZD3
    @ReservedForInternalUse
    @Deprecated
    public zzZ90 getThemeProvider() {
        return this.zzZxX;
    }

    @Override // com.aspose.words.zzZD3
    @ReservedForInternalUse
    @Deprecated
    public boolean isFillSupported() {
        return true;
    }

    @Override // com.aspose.words.zzZD3
    @ReservedForInternalUse
    @Deprecated
    public boolean isFormatDefined() {
        return this.zzZxY.zzLh(2) && !zzaQ().isEmpty();
    }

    @Override // com.aspose.words.zzZD3
    @ReservedForInternalUse
    @Deprecated
    public void materializeSpPr() {
        if (this.zzZxY.zzLh(2)) {
            return;
        }
        zzD9 zzd9 = (zzD9) this.zzZxY.zzLv(2);
        this.zzZxY.zzL(2, zzd9 != null ? zzd9.zzZI4() : new zzD9());
    }

    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.aspose.words.zzZD3
    @ReservedForInternalUse
    @Deprecated
    public void setFill(zz7X zz7x) {
        zzaQ().setFill(zz7x);
    }

    @ReservedForInternalUse
    @Deprecated
    public void setOutline(zz4G zz4g) {
        zzaQ().setOutline(zz4g);
    }

    @Override // com.aspose.words.zzZD3
    @ReservedForInternalUse
    @Deprecated
    public void setShapeType(int i) {
        if (i != 0) {
            throw new IllegalStateException("Cannot change the shape type of this chart element.");
        }
    }

    public void setSize(int i) {
        if (i < 2 || i > 72) {
            throw new IllegalArgumentException("Marker size has to be in range from 2 to 72.");
        }
        this.zzZxY.zzL(1, Integer.valueOf(i));
    }

    public void setSymbol(int i) {
        this.zzZxY.zzL(0, Integer.valueOf(i));
    }

    public final boolean zz2M() throws Exception {
        if (getSymbol() != 6) {
            return getSymbol() != 5;
        }
        zzH0 zzh0 = (zzH0) com.aspose.words.internal.zzZKW.zzZ(zzaQ().getFill(), zzH0.class);
        return (zzh0 == null || zzh0.getImageBytes() == null || zzh0.getImageBytes().length == 0) ? false : true;
    }

    public final boolean zz2N() {
        return !this.zzZxY.zzLh(1);
    }

    public final zzEF zz2O() {
        return this.zzZxY;
    }

    public final ChartMarker zz2P() {
        ChartMarker chartMarker = (ChartMarker) memberwiseClone();
        chartMarker.zzZxY = this.zzZxY.zzZLg();
        chartMarker.zzZyE = null;
        return chartMarker;
    }

    public final boolean zz3n() {
        return this.zzZxY.zz3n();
    }

    public final com.aspose.words.internal.zzZQ4 zzX(long j, float f) throws Exception {
        if (getSymbol() == 6 && zz2M()) {
            com.aspose.words.internal.zzEG zzegZzZT = com.aspose.words.internal.zzEF.zzZT(((zzH0) com.aspose.words.internal.zzZKW.zzZ(zzaQ().getFill(), zzH0.class)).getImageBytes());
            return new com.aspose.words.internal.zzZQ4(Float.intBitsToFloat((int) j) - (zzegZzZT.zzDQ() / 2), com.aspose.words.internal.zzZPY.zzYC(j) - (zzegZzZT.zzDP() / 2), zzegZzZT.zzDQ(), zzegZzZT.zzDP());
        }
        float fZzp = com.aspose.words.internal.zzSA.zzp(com.aspose.words.internal.zzAN.zzf(f) ? getSize() : f);
        float f2 = fZzp / 2.0f;
        return new com.aspose.words.internal.zzZQ4(Float.intBitsToFloat((int) j) - f2, com.aspose.words.internal.zzZPY.zzYC(j) - f2, fZzp, fZzp);
    }

    public final com.aspose.words.internal.zzZQ4 zzYh(long j) throws Exception {
        return zzX(j, 0.0f);
    }

    public final zzD9 zzaQ() {
        return (zzD9) this.zzZxY.zzLv(2);
    }

    public ChartMarker(zzZ90 zzz90) {
        this.zzZxY = new zzEF();
        this.zzZxX = zzz90;
    }
}

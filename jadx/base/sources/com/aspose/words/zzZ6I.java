package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ6I extends zzZ6L {
    private ShapeBase zzYfi;

    public zzZ6I(ShapeBase shapeBase) {
        this.zzYfi = shapeBase;
        this.zzYV = shapeBase.zzYzG().getSize();
    }

    @Override // com.aspose.words.zzZ6L
    public final String getHRef() {
        return this.zzYfi.getHRef();
    }

    @Override // com.aspose.words.zzZ6L
    public final double getHeight() throws Exception {
        zzYS4();
        return com.aspose.words.internal.zzZPW.zzYz(this.zzYV);
    }

    @Override // com.aspose.words.zzZ6L
    public final boolean getHidden() {
        return this.zzYfi.zzY9h().getHidden();
    }

    @Override // com.aspose.words.zzZ6L
    public final Node getNode() {
        return this.zzYfi;
    }

    @Override // com.aspose.words.zzZ6L
    public final String getScreenTip() {
        return this.zzYfi.getTarget();
    }

    @Override // com.aspose.words.zzZ6L
    public final long getSize() throws Exception {
        double dDoubleValue = ((Double) this.zzYfi.zzYvW().zzPj(4160)).doubleValue();
        double dDoubleValue2 = ((Double) this.zzYfi.zzYvW().zzPj(4161)).doubleValue();
        return (dDoubleValue <= 0.0d || dDoubleValue2 <= 0.0d) ? super.getSize() : com.aspose.words.internal.zzZPW.zzG((float) dDoubleValue, (float) dDoubleValue2);
    }

    @Override // com.aspose.words.zzZ6L
    public final double getWidth() throws Exception {
        zzYS4();
        return Float.intBitsToFloat((int) this.zzYV);
    }

    @Override // com.aspose.words.zzZ6L
    public final int getWrapType() {
        return this.zzYfi.getWrapType();
    }

    @Override // com.aspose.words.zzZ6L
    public final boolean hasChart() {
        return false;
    }

    @Override // com.aspose.words.zzZ6L
    public final boolean hasChildNodes() {
        return this.zzYfi.zzZYy();
    }

    @Override // com.aspose.words.zzZ6L
    public final boolean hasImage() throws Exception {
        return zzZ6L.zz8(this.zzYfi);
    }

    @Override // com.aspose.words.zzZ6L
    public final boolean hasSmartArt() {
        return false;
    }

    @Override // com.aspose.words.zzZ6L
    public final boolean isImage() {
        return this.zzYfi.isImage();
    }

    @Override // com.aspose.words.zzZ6L
    public final boolean isInline() {
        return this.zzYfi.isInline();
    }

    @Override // com.aspose.words.zzZ6L
    public final boolean isWordArt() {
        return this.zzYfi.isWordArt();
    }

    @Override // com.aspose.words.zzZ6L
    public final void zzV(zzY9X zzy9x) {
        if (zzy9x.zzY55() == null && zzy9x.zzY56() == null) {
            this.zzYfj = zzy9x;
        }
    }

    @Override // com.aspose.words.zzZ6L
    public final boolean zzYS3() {
        return ((Double) this.zzYfi.zzYvW().zzPj(4160)).doubleValue() > 0.0d && ((Double) this.zzYfi.zzYvW().zzPj(4161)).doubleValue() > 0.0d;
    }

    @Override // com.aspose.words.zzZ6L
    public final boolean zzYS6() {
        if (this.zzYfi.getNodeType() == 18) {
            Shape shape = (Shape) this.zzYfi;
            if (shape.zzY9h().zzZyf() != null && shape.zzY9h().zzZyf().getOn() && shape.zzY9h().zzZyf().zzZ4v() > 0.0d) {
                return true;
            }
        }
        return false;
    }

    @Override // com.aspose.words.zzZ6L
    public final boolean zzYS7() {
        return false;
    }

    @Override // com.aspose.words.zzZ6L
    public final String zzZe() {
        return this.zzYfi.getTarget();
    }

    @Override // com.aspose.words.zzZ6L
    public final boolean zzZid() {
        return this.zzYfi.zzZid();
    }
}

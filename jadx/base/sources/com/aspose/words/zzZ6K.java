package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ6K extends zzZ6L {
    private ShapeBase zzYfi;

    public zzZ6K(ShapeBase shapeBase) {
        this.zzYfi = shapeBase;
        this.zzYV = com.aspose.words.internal.zzZPW.zzG((float) shapeBase.getWidth(), (float) shapeBase.getHeight());
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
        return this.zzYfi.getScreenTip();
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
        Shape shape = (Shape) com.aspose.words.internal.zzZKW.zzZ(this.zzYfi, Shape.class);
        if (shape == null) {
            return false;
        }
        return shape.hasChart();
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
        Shape shape = (Shape) com.aspose.words.internal.zzZKW.zzZ(this.zzYfi, Shape.class);
        if (shape == null) {
            return false;
        }
        return shape.hasSmartArt();
    }

    @Override // com.aspose.words.zzZ6L
    public final boolean isImage() {
        return this.zzYfi.isImage();
    }

    @Override // com.aspose.words.zzZ6L
    public final boolean isInline() {
        return this.zzYfi.zzYvW().getWrapType() == 0;
    }

    @Override // com.aspose.words.zzZ6L
    public final boolean isWordArt() {
        return false;
    }

    @Override // com.aspose.words.zzZ6L
    public final void zzV(zzY9X zzy9x) {
        this.zzYfj = zzy9x;
    }

    @Override // com.aspose.words.zzZ6L
    public final boolean zzYS5() {
        zz2O zz2oZzY9a = this.zzYfi.zzY9a();
        return zz2oZzY9a != null && zz2oZzY9a.zzZvv();
    }

    @Override // com.aspose.words.zzZ6L
    public final boolean zzYS7() {
        return true;
    }

    @Override // com.aspose.words.zzZ6L
    public final String zzZe() {
        return this.zzYfi.getTarget();
    }
}

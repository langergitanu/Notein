package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY2B extends zzYC1 {
    public zzY2B(ShapeBase shapeBase) {
        super(shapeBase);
    }

    private static void zzY4(ShapeBase shapeBase) throws Exception {
        Shape shape = (Shape) com.aspose.words.internal.zzZKW.zzZ(shapeBase, Shape.class);
        if (shape == null || shape.getImageData().hasImage() || shape.getOleFormat() == null || !"opendocument.ChartDocument.1".equals(shape.getOleFormat().getProgId())) {
            return;
        }
        zzY07.zzXRS().zzs(shape);
    }

    @Override // com.aspose.words.zzYC1
    public final com.aspose.words.internal.zzG zzY(zzYC5 zzyc5) throws Exception {
        return zzYCF.zzZ(zzyc5);
    }

    @Override // com.aspose.words.zzYC1
    public final zzYC5 zzZua() throws Exception {
        zzY4(zz7u());
        return new zzYC5(zz7u());
    }
}

package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZP1 extends zzZP6 {
    private com.aspose.words.internal.zzZOP zz56;
    private MergeFieldImageDimension zzYDn;
    private MergeFieldImageDimension zzYDo;

    public zzZP1(Field field, com.aspose.words.internal.zzZOP zzzop, MergeFieldImageDimension mergeFieldImageDimension, MergeFieldImageDimension mergeFieldImageDimension2) {
        super(field);
        this.zz56 = zzzop;
        this.zzYDo = mergeFieldImageDimension;
        this.zzYDn = mergeFieldImageDimension2;
    }

    @Override // com.aspose.words.zzZP6
    public final void zzZhW() throws Exception {
        com.aspose.words.internal.zzZOY zzzoyZzZbn = getField().zzZgn().zzZbn();
        try {
            DocumentBuilder documentBuilder = new DocumentBuilder(getDocument());
            documentBuilder.moveTo(getField().getEnd());
            com.aspose.words.internal.zzZOP zzzop = this.zz56;
            if (zzzop != null) {
                Shape shapeZzZt = documentBuilder.zzZt(zzzop);
                this.zz56.close();
                if (MergeFieldImageDimension.zzY(this.zzYDo) || MergeFieldImageDimension.zzY(this.zzYDn)) {
                    ImageSize imageSize = shapeZzZt.getImageData().getImageSize();
                    shapeZzZt.zze(MergeFieldImageDimension.zzZ(this.zzYDo, imageSize.getWidthPoints()), MergeFieldImageDimension.zzZ(this.zzYDn, imageSize.getHeightPoints()));
                }
            }
            zzzoyZzZbn.dispose();
        } catch (Throwable th) {
            zzzoyZzZbn.dispose();
            throw th;
        }
    }
}

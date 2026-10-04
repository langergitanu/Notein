package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY79 extends zzZNQ {
    private com.aspose.words.internal.zzZY3 zzX7i;

    private static com.aspose.words.internal.zzZY5 zzQ(zzYDZ zzydz) {
        SvgSaveOptions svgSaveOptions = (SvgSaveOptions) com.aspose.words.internal.zzZKW.zzZ(zzydz.zzXpa, SvgSaveOptions.class);
        com.aspose.words.internal.zzZY5 zzzy5ZzZW = svgSaveOptions != null ? svgSaveOptions.zzZW(zzydz.zzYfy) : null;
        ImageSaveOptions imageSaveOptions = (ImageSaveOptions) com.aspose.words.internal.zzZKW.zzZ(zzydz.zzXpa, ImageSaveOptions.class);
        if (imageSaveOptions != null) {
            zzzy5ZzZW = imageSaveOptions.zzY(zzydz.zzYfy.zzZqx());
        }
        if (zzzy5ZzZW != null) {
            return zzzy5ZzZW;
        }
        throw new IllegalArgumentException("Unexpected type of SaveOptions.");
    }

    @Override // com.aspose.words.zzZNQ
    public final void zzT(com.aspose.words.internal.zzZH zzzh) throws Exception {
        this.zzX7i.zzO(zzzh);
    }

    @Override // com.aspose.words.zzZNQ
    public final void zzZ(zzYDZ zzydz, com.aspose.words.internal.zzQR zzqr) throws Exception {
        com.aspose.words.internal.zzZY5 zzzy5ZzQ = zzQ(zzydz);
        zzzy5ZzQ.zzb(zzqr.zzQG());
        zzZNQ.zzZ(zzzy5ZzQ, zzydz.getFileName());
        com.aspose.words.internal.zzZY3 zzzy3 = new com.aspose.words.internal.zzZY3(zzydz.zzXpb, zzzy5ZzQ, null, new com.aspose.words.internal.zzZNI(false));
        this.zzX7i = zzzy3;
        zzzy3.startDocument();
    }

    @Override // com.aspose.words.zzZNQ
    public final SaveOutputParameters zzZ9c() throws Exception {
        this.zzX7i.endDocument();
        return new SaveOutputParameters("image/svg+xml");
    }
}

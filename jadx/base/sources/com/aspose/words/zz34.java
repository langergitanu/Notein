package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz34 implements zzZC3 {
    private zzZBY zzYZG;
    private zz0S zzYZH;
    private zzZC5 zzYZI;
    private DocumentBase zzZG3;
    private zzZ90 zzZxX;

    public zz34(DocumentBase documentBase, zzZC5 zzzc5) {
        this.zzZG3 = documentBase;
        this.zzZxX = documentBase.zzZqI();
        this.zzYZG = new zz0O(documentBase);
        this.zzYZI = zzzc5;
    }

    private static Theme zzZwa() throws Exception {
        return new zzZXV().zzZmw();
    }

    @Override // com.aspose.words.zzZC3
    public final DocumentBase getDocument() {
        return this.zzZG3;
    }

    @Override // com.aspose.words.zzZC3
    public final zzZ90 getThemeProvider() throws Exception {
        if (this.zzZxX == null) {
            this.zzZxX = zzZwa();
        }
        return this.zzZxX;
    }

    @Override // com.aspose.words.zzZC3
    public final com.aspose.words.internal.zzF4 zzI() {
        return zzZw8().zzI();
    }

    @Override // com.aspose.words.zzZC3
    public final void zzV(zzZ90 zzz90) {
        this.zzZxX = zzz90;
    }

    @Override // com.aspose.words.zzZC3
    public final zz0S zzZw7() {
        if (this.zzYZH == null) {
            this.zzYZH = new zz0S(this.zzZG3.zzZqx());
        }
        return this.zzYZH;
    }

    @Override // com.aspose.words.zzZC3
    public final zzZC5 zzZw8() {
        if (this.zzYZI == null) {
            this.zzYZI = new zz4I();
        }
        return this.zzYZI;
    }

    @Override // com.aspose.words.zzZC3
    public final zzZBY zzZw9() {
        return this.zzYZG;
    }
}

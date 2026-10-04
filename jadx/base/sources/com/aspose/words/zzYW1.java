package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYW1 extends zzYWI {
    private int zzXUS;
    private DocumentVisitor zzXUT;
    private zzZA2 zzXVD;

    public zzYW1(zzYWB zzywb, DocumentVisitor documentVisitor, zzZA2 zzza2, int i) {
        super(zzywb);
        this.zzXUT = documentVisitor;
        this.zzXVD = zzza2;
        this.zzXUS = 1;
    }

    public final void zzYzN() throws Exception {
        while (zzYAu()) {
            if (next().isComposite()) {
                ((CompositeNode) next()).acceptStart(this.zzXUT);
            } else {
                Node nodeZzZ = zzZ(this.zzXVD, this.zzXUS);
                if (nodeZzZ != null) {
                    nodeZzZ.accept(this.zzXUT);
                }
            }
        }
    }

    @Override // com.aspose.words.zzYWI
    public final void zztA(int i) {
        if (i == 4) {
            try {
                ((CompositeNode) next()).acceptEnd(this.zzXUT);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}

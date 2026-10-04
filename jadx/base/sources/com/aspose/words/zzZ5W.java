package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ5W extends zzZXU {
    private com.aspose.words.internal.zz77 zzYf0;

    public zzZ5W(Document document, com.aspose.words.internal.zz79 zz79Var, com.aspose.words.internal.zz77 zz77Var, zzZWG zzzwg, zzZWH zzzwh, zzZX3 zzzx3, zzZWM zzzwm) throws Exception {
        super(zz79Var, zz77Var, document, new LoadOptions(), new zzYO3(), zzzwg, zzzwh, zzzx3, zzzwm);
        this.zzYf0 = zz77Var;
    }

    @Override // com.aspose.words.zzZXT
    public final zzZW1 zzNJ(String str) throws Exception {
        if (com.aspose.words.internal.zzZKN.equals(str, zzZWV.zz0(10, false))) {
            return new zzZW1(this.zzYf0, new zzYO3());
        }
        return null;
    }

    @Override // com.aspose.words.zzZXT, com.aspose.words.zzZ8W
    public final byte[] zzNO(String str) {
        return new byte[0];
    }

    @Override // com.aspose.words.zzZXT, com.aspose.words.zzYVB, com.aspose.words.zzZ8W
    public final String zzY9(String str) {
        return com.aspose.words.internal.zzZKN.format("reltaget/{0}", str);
    }

    @Override // com.aspose.words.zzZXU, com.aspose.words.zzZXT
    public final void zzZmu() {
        throw new UnsupportedOperationException();
    }

    @Override // com.aspose.words.zzZXU, com.aspose.words.zzYVB
    public final boolean zzZmv() {
        return false;
    }
}

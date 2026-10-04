package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzI1 extends zzI8 {
    @Override // com.aspose.words.internal.zzI8
    public final String getMimeType() {
        return "ttf";
    }

    @Override // com.aspose.words.internal.zzI8
    public final String zzG4() {
        return "truetype";
    }

    @Override // com.aspose.words.internal.zzI8
    public final String zzG5() {
        return "ttf";
    }

    @Override // com.aspose.words.internal.zzI8
    public final byte[] zzY(zzJO zzjo) throws Exception {
        zzZOR zzzor = new zzZOR();
        try {
            zzjo.zzY(zzzor);
            return zzzor.zzWy();
        } finally {
            zzzor.close();
        }
    }
}

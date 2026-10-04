package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ1S extends zzZ24 {
    public zzZ1S(zzY4T zzy4t, zzZ9G zzz9g) {
        super(zzy4t);
        this.zzY46 = zzz9g != null && zzZ7R.zzW(zzz9g, 80);
    }

    @Override // com.aspose.words.zzZ24
    public final boolean zzW(zzZ9G zzz9g) {
        return zzz9g != null && zzZ7R.zzW(zzz9g, 80);
    }

    @Override // com.aspose.words.zzZ24
    public final String zzYIW() {
        return this.zzY47 ? "</s>" : "~~";
    }

    @Override // com.aspose.words.zzZ24
    public final String zzYIX() {
        return this.zzY47 ? "<s>" : "~~";
    }
}

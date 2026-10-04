package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ29 extends zzZ24 {
    private String zzYhW;

    public zzZ29(zzY4T zzy4t, zzZ9G zzz9g) {
        super(zzy4t);
        this.zzYhW = "**";
        this.zzY46 = zzz9g != null && zzZ7R.zzW(zzz9g, 60);
    }

    @Override // com.aspose.words.zzZ24
    public final boolean zzW(zzZ9G zzz9g) {
        return zzz9g != null && zzZ7R.zzW(zzz9g, 60);
    }

    @Override // com.aspose.words.zzZ24
    public final String zzYIW() {
        return this.zzY47 ? "</b>" : this.zzYhW;
    }

    @Override // com.aspose.words.zzZ24
    public final String zzYIX() {
        return this.zzY47 ? "<b>" : this.zzYhW;
    }

    @Override // com.aspose.words.zzZ24
    public final boolean zzYIY() {
        if (zzYIA() != 1 || this.zzY47) {
            return false;
        }
        if (!"__".equals(this.zzYhW)) {
            this.zzYhW = "__";
            zzIE("__");
        }
        return true;
    }
}

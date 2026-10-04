package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ8J implements zzZAN {
    private zzZ9A zzYtA;

    public zzZ8J(zzZ9A zzz9a) {
        this.zzYtA = zzz9a;
    }

    @Override // com.aspose.words.zzZAN
    public final byte[] getImageBytes() {
        return com.aspose.words.internal.zzSJ.zzK((byte[]) this.zzYtA.fetchShapeAttr(4102));
    }

    @Override // com.aspose.words.zzZAN
    public final String getSourceFullName() {
        return (String) this.zzYtA.fetchShapeAttr(4104);
    }

    @Override // com.aspose.words.zzZAN
    public final void setImageBytes(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            this.zzYtA.removeShapeAttr(4102);
        } else {
            this.zzYtA.setShapeAttr(4102, bArr);
        }
    }

    @Override // com.aspose.words.zzZAN
    public final void setSourceFullName(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "value");
        this.zzYtA.setShapeAttr(4104, str);
    }

    @Override // com.aspose.words.zzZAN
    public final boolean zzZjT() {
        return com.aspose.words.internal.zzZ1.zzX((byte[]) this.zzYtA.fetchShapeAttr(4102));
    }
}

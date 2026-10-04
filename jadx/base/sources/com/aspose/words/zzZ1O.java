package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ1O extends zzZ24 {
    public zzZ1O(zzY4T zzy4t, zzZ9G zzz9g) {
        super(zzy4t);
        boolean z = false;
        if (zzz9g != null && ((Integer) zzZ7R.zzZ(zzz9g, 140, 0)).intValue() != 0) {
            z = true;
        }
        this.zzY46 = z;
    }

    @Override // com.aspose.words.zzZ24
    public final boolean zzW(zzZ9G zzz9g) {
        return (zzz9g == null || ((Integer) zzZ7R.zzZ(zzz9g, 140, 0)).intValue() == 0) ? false : true;
    }

    @Override // com.aspose.words.zzZ24
    public final String zzYIW() {
        return this.zzY47 ? "</u>" : "++";
    }

    @Override // com.aspose.words.zzZ24
    public final String zzYIX() {
        return this.zzY47 ? "<u>" : "++";
    }
}

package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ1Q extends zzZ24 {
    public zzZ1Q(zzY4T zzy4t, zzZ9G zzz9g) {
        super(zzy4t);
        this.zzY46 = zzT(zzz9g);
    }

    private static boolean zzT(zzZ9G zzz9g) {
        Object directRunAttr;
        return (zzz9g == null || (directRunAttr = zzz9g.getDirectRunAttr(210)) == null || ((Integer) directRunAttr).intValue() != 1) ? false : true;
    }

    @Override // com.aspose.words.zzZ24
    public final boolean zzW(zzZ9G zzz9g) {
        return zzT(zzz9g);
    }

    @Override // com.aspose.words.zzZ24
    public final String zzYIW() {
        return "</sup>";
    }

    @Override // com.aspose.words.zzZ24
    public final String zzYIX() {
        return "<sup>";
    }
}

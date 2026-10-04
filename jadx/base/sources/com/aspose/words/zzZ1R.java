package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ1R extends zzZ24 {
    public zzZ1R(zzY4T zzy4t, zzZ9G zzz9g) {
        super(zzy4t);
        this.zzY46 = zzU(zzz9g);
    }

    private static boolean zzU(zzZ9G zzz9g) {
        Object directRunAttr;
        return (zzz9g == null || (directRunAttr = zzz9g.getDirectRunAttr(210)) == null || ((Integer) directRunAttr).intValue() != 2) ? false : true;
    }

    @Override // com.aspose.words.zzZ24
    public final boolean zzW(zzZ9G zzz9g) {
        return zzU(zzz9g);
    }

    @Override // com.aspose.words.zzZ24
    public final String zzYIW() {
        return "</sub>";
    }

    @Override // com.aspose.words.zzZ24
    public final String zzYIX() {
        return "<sub>";
    }
}

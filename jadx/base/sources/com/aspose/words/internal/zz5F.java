package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz5F extends zzY {
    private zz3H zzko;

    public zz5F(zz3H zz3h) {
        super(true);
        this.zzko = zz3h;
    }

    @Override // com.aspose.words.internal.zzY
    public final void zzZ(zzZOP zzzop) throws Exception {
        zzZYV<int[]> zzzyvZzuf = this.zzko.zzuf();
        zzY.zzZ(zzzop, "{0} beginbfchar", zzJB.zzWD(zzzyvZzuf.getCount()));
        for (int i = 0; i < zzzyvZzuf.getCount(); i++) {
            int iZzT3 = zzzyvZzuf.zzT3(i);
            int[] iArrZzVY = zzzyvZzuf.zzVY(i);
            if (iArrZzVY.length != 0) {
                zzY.zzY(zzzop, zzZKN.format("<{0}><{1}>", zzJB.zzWu(iZzT3), zzY.zzZ(iArrZzVY)));
            }
        }
        zzY.zzY(zzzop, "endbfchar");
    }
}

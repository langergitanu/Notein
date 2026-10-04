package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz1N extends zzYC1 {
    public zz1N(ShapeBase shapeBase) {
        super(shapeBase);
    }

    private boolean zzZu9() {
        return zzY3X.zzS(zz7u(), zz7u().zzY9i().zzZHY() == 11 && "application/inkml+xml".equals(((zzB4) zz7u().zzY9i()).zzZF0().getContentType()));
    }

    @Override // com.aspose.words.zzYC1
    public final com.aspose.words.internal.zzG zzY(zzYC5 zzyc5) throws Exception {
        if (zzZu9()) {
            if (zz7u().zzY9n() != null) {
                return zzYCF.zzZ(zzyc5);
            }
            if (zz7u().zzY9i().zzZHY() != 13) {
                return new com.aspose.words.internal.zzG();
            }
        }
        return zz2L.zzZ(zzyc5);
    }

    @Override // com.aspose.words.zzYC1
    public final zzYC5 zzZua() {
        return (!zzZu9() || zz7u().zzY9n() == null) ? new zzYC5(zz7u()) : new zzYC5(zz7u().zzY9n());
    }
}

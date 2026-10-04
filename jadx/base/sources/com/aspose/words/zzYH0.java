package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYH0 extends zzYHS {
    public zzYH0(zzYFT zzyft) {
        super(zzyft);
    }

    private int getHeaderFooterType() {
        switch (zzYiN().getType()) {
            case 32:
            case 33:
                return 1;
            case 34:
            case 35:
                return 3;
            case 36:
                return 0;
            case 37:
                return 4;
            case 38:
                return 2;
            case 39:
                return 5;
            default:
                throw new IllegalStateException("Unexpected destination type.");
        }
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzYjb() throws Exception {
        switch (zzYiN().getType()) {
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
                zzYiM().zzYWN();
                break;
            default:
                super.zzYjb();
                break;
        }
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzZ(zzYET zzyet) throws Exception {
        switch (zzYiN().getType()) {
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
                zzYiQ();
                zzYiR();
                zzYiM().zzys(getHeaderFooterType());
                break;
            default:
                super.zzZ(zzyet);
                break;
        }
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final zzYHQ zzZ(zzYHP zzyhp) throws Exception {
        switch (zzyhp.getType()) {
            case 81:
            case 82:
            case 84:
            case 85:
                return this;
            case 83:
            default:
                return super.zzZ(zzyhp);
        }
    }
}

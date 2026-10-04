package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYFE extends zzYHQ {
    private String zzZ3F;
    private ShapeBase zzZBi;
    private String zzjl;

    public zzYFE(zzYFT zzyft, ShapeBase shapeBase) {
        super(zzyft);
        this.zzZBi = shapeBase;
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzY(zzYET zzyet) {
        int type = zzYiN().getType();
        if (type == 96) {
            this.zzjl = zzyet.zzYR();
        } else {
            if (type != 97) {
                return;
            }
            this.zzZ3F = zzyet.zzYR();
        }
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzYjb() {
        if (zzYiN().getType() == 95) {
            this.zzZBi.setHRef(com.aspose.words.internal.zzZVR.zz5(this.zzZ3F, this.zzjl));
        }
    }

    @Override // com.aspose.words.zzYHQ
    public final zzYHQ zzZ(zzYHP zzyhp) {
        switch (zzyhp.getType()) {
            case 96:
            case 97:
            case 98:
                return this;
            default:
                return null;
        }
    }
}

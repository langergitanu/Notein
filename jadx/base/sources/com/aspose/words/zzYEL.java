package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYEL extends zzYHQ {
    private int zzXqm;

    public zzYEL(zzYFT zzyft) {
        super(zzyft);
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzY(zzYET zzyet) {
        if (zzYiN().getType() != 122) {
            return;
        }
        this.zzXw4.zzk(this.zzXqm, zzyet.zzYR());
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzZ(zzYET zzyet) throws Exception {
        if (zzYiN().getType() != 122) {
            return;
        }
        this.zzXqm = zzyet.zzYeT();
    }

    @Override // com.aspose.words.zzYHQ
    public final zzYHQ zzZ(zzYHP zzyhp) {
        if (zzyhp.getType() != 122) {
            return null;
        }
        return this;
    }
}

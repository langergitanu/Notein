package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYHE extends zzYHQ {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\fid");
    private int zzXvP;
    private String zzZS;

    public zzYHE(zzYFT zzyft) {
        super(zzyft);
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzT(zzYET zzyet) throws Exception {
        if (zzUR.zzTP(zzyet.getName()) != 0) {
            this.zzXw4.zzC0(zzyet.getName());
        } else {
            this.zzXvP = zzyet.zzYeT();
        }
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzY(zzYET zzyet) throws Exception {
        if (zzYiN().getType() == 136) {
            this.zzZS = com.aspose.words.internal.zzZVR.zz2(this.zzXw4.getDocument().getOriginalFileName(), zzyet.zzYR());
        }
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzYjb() {
        if (zzYiN().getType() == 136) {
            this.zzXw4.zzYgs().add(this.zzXvP, this.zzZS);
        }
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzZ(zzYET zzyet) {
        if (zzYiN().getType() == 136) {
            this.zzZS = null;
        }
    }

    @Override // com.aspose.words.zzYHQ
    public final zzYHQ zzZ(zzYHP zzyhp) {
        if (zzyhp.getType() != 136) {
            return null;
        }
        return this;
    }
}

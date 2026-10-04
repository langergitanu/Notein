package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYFP extends zzYHQ {
    private zzYFT zzXwE;

    public zzYFP(zzYFT zzyft) {
        super(zzyft);
        this.zzXwE = zzyft;
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzT(zzYET zzyet) throws Exception {
        if ("\\rsid".equals(zzyet.getName())) {
            this.zzXwE.getDocument().zzZpV().zzYVj.add(Integer.valueOf(zzyet.zzYeT()));
        }
    }
}

package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzOG extends zzOO {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzOG() {
        zzOT zzot = zzL4.zzZnb;
        super("line-height", true, zzot, zzL3.zzZ(zzL3.zzJ(zzot), zzL3.zzZki, zzL3.zzZkh, zzL3.zzZkf));
    }

    @Override // com.aspose.words.zzOP
    public final zzMP zzZ(zzMP zzmp, zzQK zzqk) {
        if (zzmp.getCount() == 1 && zzmp.zzZVx().getValueType() == 5 && !com.aspose.words.internal.zzAN.zzZD(zzqk.zzZWE())) {
            zzmp = new zzMP(new zzOI((zzqk.zzZWE() * ((zzMU) zzmp.zzZVx()).getDoubleValue()) / 100.0d, 4));
        }
        return zzOP.zzX(zzmp, zzqk);
    }
}

package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzLQ extends zzOO {
    public zzLQ() {
        super("text-align", true, zzL4.zzZmA, zzL3.zzX(zzL4.zzZmH, zzL4.zzZmG, zzL4.zzZmF, zzL4.zzZmE));
    }

    @Override // com.aspose.words.zzOP
    public final zzMP zzZ(zzMP zzmp, zzQK zzqk) {
        if (!zzmp.zzP(zzL4.zzZmz)) {
            return zzmp;
        }
        zzPT zzptZzSx = zzqk.zzZWG().zzSx("text-align");
        return (zzptZzSx == null || zzptZzSx.zzZWj().zzP(zzL4.zzZmA)) ? zzL5.zzMe(zzL5.zzM(zzqk.zzZWG())) : zzptZzSx.zzZWj();
    }
}

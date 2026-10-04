package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzIA extends zzID {
    private float zzZhv;

    public zzIA(long j) {
        super(j);
        this.zzZhv = Float.intBitsToFloat((int) j);
    }

    @Override // com.aspose.words.zzID
    public final void zzS(zzIE zzie) {
        zzZZ(zzT(zzie));
        zzie.zzA(com.aspose.words.internal.zzZPY.zzG(zzZRp(), zzZSh().getY()));
        zzZA().add(zzie);
        float fZzZRp = zzZRp();
        zzZv(zzZRp() + zzie.zzZRI());
        if (!zzie.zzZRr()) {
            fZzZRp = zzZRp();
        }
        this.zzZhv = fZzZRp;
    }

    @Override // com.aspose.words.zzID
    public final com.aspose.words.internal.zzZQ4 zzT(zzIE zzie) {
        float fMax = Math.max(zzZSh().getHeight(), zzie.getHeight());
        float fZzZm = zzZSh().zzZm();
        float fZzkw = zzZSh().zzkw();
        if (zzie.zzZRq()) {
            fZzZm = Math.min(fZzZm, zzZRp());
            fZzkw = Math.max(fZzkw, zzZRp() + zzie.getWidth());
        }
        return new com.aspose.words.internal.zzZQ4(fZzZm, zzZSh().getY(), fZzkw - fZzZm, fMax);
    }

    @Override // com.aspose.words.zzID
    public final zzID zzZ(boolean z, float f) {
        return z ? new zzI9(com.aspose.words.internal.zzZPY.zzG(this.zzZhv, zzZSh().zzZn() + f)) : new zzIA(com.aspose.words.internal.zzZPY.zzG(0.0f, zzZSh().zzZn() + f));
    }
}

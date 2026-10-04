package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzIB extends zzID {
    public zzIB(long j) {
        super(j);
    }

    @Override // com.aspose.words.zzID
    public final void zzS(zzIE zzie) {
        float fMax = Math.max(zzZSh().getHeight(), zzie.getHeight());
        float fZzZm = zzZSh().zzZm();
        float fZzkw = zzZSh().zzkw();
        if (zzie.zzZRq()) {
            fZzZm = Math.min(fZzZm, zzZRp() - zzie.getWidth());
            fZzkw = Math.max(fZzkw, zzZRp());
        }
        float f = fZzkw - fZzZm;
        zzie.zzA(com.aspose.words.internal.zzZPY.zzG(zzZRp() - zzie.getWidth(), zzZSh().getY()));
        zzZA().add(zzie);
        zzZv(zzZRp() - zzie.zzZRI());
        zzZw(-((fZzZm + fZzkw) / 2.0f));
        zzZZ(new com.aspose.words.internal.zzZQ4((-f) / 2.0f, zzZSh().getY(), f, fMax));
    }

    @Override // com.aspose.words.zzID
    public final com.aspose.words.internal.zzZQ4 zzT(zzIE zzie) {
        float fMax = Math.max(zzZSh().getHeight(), zzie.getHeight());
        float fZzZm = zzZSh().zzZm();
        float fZzkw = zzZSh().zzkw();
        if (zzie.zzZRq()) {
            fZzZm = Math.min(fZzZm, zzZRp() - zzie.getWidth());
            fZzkw = Math.max(fZzkw, zzZRp());
        }
        float f = fZzkw - fZzZm;
        return new com.aspose.words.internal.zzZQ4((-f) / 2.0f, zzZSh().getY(), f, fMax);
    }

    @Override // com.aspose.words.zzID
    public final zzID zzZ(boolean z, float f) {
        return new zzIC(com.aspose.words.internal.zzZPY.zzG(0.0f, zzZSh().zzZn() + f));
    }
}

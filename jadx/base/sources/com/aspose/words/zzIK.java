package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzIK extends zzIL {
    public zzIK(long j, int i, int i2, float f) {
        super(j, i, i2, f);
    }

    private float zzY(zzIE zzie) {
        float fZzU = zzZRE().zzU(zzie);
        float fZzV = zzZRE().zzV(zzie);
        float fZzZRy = zzZRE().zzZRy();
        float fMax = Math.max(fZzU, fZzV);
        return fZzZRy > 0.0f ? Math.max(fMax, fZzZRy) : fMax;
    }

    private zzII zzZz(float f) {
        zzII zzii = new zzII(zzZRE().zzZRu(), f, zzZRE().zzZRt(), zzZRE().getOffset(), zzZRD());
        zzii.zzZRz();
        for (zzIE zzie : zzZRE().zzZRv()) {
            if (!zzii.zzX(zzie)) {
                zzii.zzW(zzie);
            }
        }
        return zzii;
    }

    @Override // com.aspose.words.zzIL
    public final void zzZ(zzIE zzie) {
        while (!zzZRE().zzX(zzie) && !zzZRE().zzW(zzie)) {
            zzZ(zzZz(zzY(zzie)));
        }
    }
}

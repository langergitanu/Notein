package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
class zz8O implements zzGB {
    private int zzDB;
    private zzZQ4 zzG8 = zzZQ4.zz2T;
    private zzZZQ zzph = new zzZZQ();

    @Override // com.aspose.words.internal.zzGB
    public final int getHandle() {
        return this.zzDB;
    }

    @Override // com.aspose.words.internal.zzGB
    public final int getType() {
        return 4;
    }

    public final void zzT(zzO8 zzo8) throws Exception {
        zzo8.zzXc();
        zzo8.zzXc();
        int iZzXc = zzo8.zzXc();
        zzo8.zzXc();
        this.zzG8 = zzo8.zzMY();
        this.zzph.clear();
        for (int i = 0; i < iZzXc; i++) {
            this.zzph.zzf(zzo8.zzMY());
        }
    }

    @Override // com.aspose.words.internal.zzGB
    public final void zzWe(int i) {
        this.zzDB = i;
    }

    public final void zzX(zzZV1 zzzv1) throws Exception {
        try {
            zzzv1.zzXa();
            zzzv1.zzXa();
            zzzv1.zzXc();
            zzzv1.zzXa();
            short sZzXa = zzzv1.zzXa();
            zzzv1.zzXa();
            this.zzG8 = zzzv1.zzn0();
            this.zzph.clear();
            for (int i = 0; i < sZzXa; i++) {
                int iZzXa = zzzv1.zzXa() & 65535;
                int iZzXa2 = zzzv1.zzXa() & 65535;
                int iZzXa3 = zzzv1.zzXa() & 65535;
                for (int i2 = 0; i2 < iZzXa / 2; i2++) {
                    this.zzph.zzf(new zzZQ4(zzzv1.zzXa() & 65535, iZzXa2, (zzzv1.zzXa() & 65535) - r8, iZzXa3 - iZzXa2));
                }
                zzzv1.zzXa();
            }
        } catch (Exception unused) {
        }
    }

    public final zzZQ4 zzZj() {
        return this.zzG8;
    }

    public final zzZZQ zzyF() {
        return this.zzph;
    }
}

package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzT1 {
    private zzT2[] zzQ8;
    private zzT3[] zzQ9;

    public zzT1(zzY0 zzy0) throws Exception {
        long position = zzy0.zzq().getPosition();
        zzy0.zzX9();
        int iZzXa = zzy0.zzXa();
        int iZzXc = zzy0.zzXc();
        int iZzXc2 = zzy0.zzXc();
        int iZzXa2 = zzy0.zzXa();
        zzy0.zzq().zzH(((long) iZzXc) + position);
        this.zzQ9 = new zzT3[iZzXa];
        for (int i = 0; i < iZzXa; i++) {
            zzT3 zzt3 = new zzT3();
            zzt3.zzQd = zzy0.zzX9() & 65535;
            zzt3.zzQc = zzy0.zzX9() & 65535;
            zzt3.zzQb = 65535 & zzy0.zzX9();
            this.zzQ9[i] = zzt3;
        }
        zzy0.zzq().zzH(position + ((long) iZzXc2));
        this.zzQ8 = new zzT2[iZzXa2];
        for (int i2 = 0; i2 < iZzXa2; i2++) {
            zzT2 zzt2 = new zzT2();
            zzt2.zzQd = zzy0.zzX9() & 65535;
            zzt2.zzQa = zzy0.zzX9() & 65535;
            this.zzQ8[i2] = zzt2;
        }
    }

    public final zzT2[] zzTo() {
        return this.zzQ8;
    }

    public final zzT3[] zzTp() {
        return this.zzQ9;
    }
}

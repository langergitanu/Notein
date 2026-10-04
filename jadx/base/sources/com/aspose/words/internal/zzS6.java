package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzS6 {
    private zzPV[] zzOe;

    public zzS6(zzY0 zzy0) throws Exception {
        long position = zzy0.zzq().getPosition();
        zzy0.zzX9();
        int iZzX9 = zzy0.zzX9() & 65535;
        zzy0.zzX9();
        zzy0.zzX9();
        zzy0.zzq().zzH(position + ((long) zzy0.zzXc()) + ((long) ((65535 & zzy0.zzX9()) * 4)));
        this.zzOe = new zzPV[iZzX9];
        for (int i = 0; i < iZzX9; i++) {
            byte b = zzy0.readByte();
            byte b2 = zzy0.readByte();
            byte b3 = zzy0.readByte();
            this.zzOe[i] = new zzPV(zzy0.readByte() & 255, b3 & 255, b2 & 255, b & 255);
        }
    }

    public final zzPV[] zzRx() {
        return this.zzOe;
    }
}

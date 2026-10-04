package com.aspose.words.internal;

import com.orion.notein.domain.models.backup.BackupEvent;

/* JADX INFO: loaded from: classes5.dex */
final class zzKH extends zzZZ5 {
    private zzZOP zzN5;
    private zzIH zzP7;

    public zzKH(zzZOP zzzop, zzIH zzih) {
        this.zzN5 = zzzop;
        this.zzP7 = zzih;
    }

    public final void zzIg() throws Exception {
        zzZOR zzzorZzQH = zzQH();
        zzZOW zzzow = new zzZOW(this.zzN5, zzZO0.zzhU());
        int iZzU = zzZZ4.zzU(this.zzN5.getPosition(), true);
        int count = getCount();
        int iZzO = zzAN.zzO(zzAN.zzO(count, 128) + count, 128);
        this.zzN5.write(zzzorZzQH.zziA(), 0, (int) zzzorZzQH.getLength());
        for (int i = 0; i < iZzO; i++) {
            zzzow.zzl(-3);
        }
        int iZzO2 = zzAN.zzO(count + iZzO, 128);
        if (iZzO2 > 109) {
            int iZzO3 = zzAN.zzO(iZzO2 + BackupEvent.ERROR_GUID_NOT_EXIST, 127);
            for (int i2 = 0; i2 < iZzO3; i2++) {
                zzzow.zzl(-3);
            }
            for (int i3 = 0; i3 < iZzO3; i3++) {
                zzzow.zzl(-4);
            }
            iZzO2 = zzAN.zzO(r3 + iZzO3, 128);
        }
        this.zzP7.zzy5 = iZzO2;
        zzZZ4.zzY(zzzow);
        zzQV.zzZ(this.zzN5, iZzU, iZzO2, this.zzP7);
    }

    public final void zzIh() throws Exception {
        zzZOP zzzop = this.zzN5;
        zzIH zzih = this.zzP7;
        zzZZ5 zzzz5ZzZ = zzQV.zzZ(zzzop, zzih.zzy5, zzih.zzy0, zzih.zzxZ);
        byte[] bArr = new byte[512];
        zzZOX zzzox = new zzZOX(new zzZOR(bArr), zzZO0.zzhU());
        for (int i = 0; (((long) i) & 4294967295L) < this.zzP7.zzy5; i++) {
            this.zzN5.zzH(zzZZ4.zzD(zzzz5ZzZ.get(i), true));
            this.zzN5.read(bArr, 0, 512);
            zzzox.zzq().zzH(0L);
            for (int i2 = 0; i2 < 128; i2++) {
                add(zzzox.zzXc());
            }
        }
    }
}

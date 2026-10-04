package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class zz0C {
    private zzZOZ zzOF;
    private ArrayList<zz0B> zzdY;

    public zz0C() {
        this.zzOF = zzZOZ.zzZXP;
        this.zzdY = new ArrayList<>();
    }

    public final void zzL(zzZOP zzzop) throws Exception {
        zzZOW zzzow = new zzZOW(zzzop, zzZO0.zzhU());
        zzzow.zzK((short) -2);
        zzzow.zzK((short) 0);
        zzzow.zzl(131333);
        zzzow.writeBytes(this.zzOF.toByteArray());
        zzzow.zzl(this.zzdY.size());
        int size = (this.zzdY.size() * 20) + ((int) zzzop.getPosition());
        zzZOR zzzor = new zzZOR();
        for (int i = 0; i < this.zzdY.size(); i++) {
            zz0B zz0b = this.zzdY.get(i);
            zzzow.writeBytes(zz0b.zzs5().toByteArray());
            zzzow.zzl(((int) zzzor.getLength()) + size);
            byte[] byteArray = zz0b.toByteArray();
            zzzor.write(byteArray, 0, byteArray.length);
        }
        zzzop.write(zzzor.zziA(), 0, (int) zzzor.getLength());
    }

    public final ArrayList<zz0B> zzs7() {
        return this.zzdY;
    }

    public zz0C(zzZOP zzzop, int i) throws Exception {
        this.zzOF = zzZOZ.zzZXP;
        this.zzdY = new ArrayList<>();
        zzzop.zzH(0L);
        zzZOX zzzox = new zzZOX(zzzop, zzZO0.zzhU());
        zzzox.zzXa();
        if (zzzox.zzXa() == 0) {
            zzzox.zzXc();
            this.zzOF = new zzZOZ(zzzox.zzn(16));
            int iZzXc = zzzox.zzXc();
            if (iZzXc < 0 || iZzXc > i) {
                return;
            }
            zzZOZ[] zzzozArr = new zzZOZ[iZzXc];
            int[] iArr = new int[iZzXc];
            for (int i2 = 0; i2 < iZzXc; i2++) {
                zzzozArr[i2] = new zzZOZ(zzzox.zzn(16));
                iArr[i2] = zzzox.zzXc();
            }
            for (int i3 = 0; i3 < iZzXc; i3++) {
                zzzox.zzq().zzH(iArr[i3]);
                zzZQG.zzZ(this.zzdY, new zz0B(zzzozArr[i3], zzzox));
            }
            return;
        }
        throw new UnsupportedOperationException("Cannot read property set in this format.");
    }
}

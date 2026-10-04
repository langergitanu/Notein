package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzY8U {
    private ArrayList<byte[]> zzZm = new ArrayList<>();

    public final int getCount() {
        return this.zzZm.size();
    }

    public final void zzB1(String str) {
        zzXJ(com.aspose.words.internal.zzZO0.zzhU().getBytes(str));
    }

    public final void zzF(com.aspose.words.internal.zzZOX zzzox, int i) throws Exception {
        zzzox.zzq().zzH(i);
        zzzox.zzX9();
        short sZzXa = zzzox.zzXa();
        zzzox.zzX9();
        for (int i2 = 0; i2 < sZzXa; i2++) {
            byte[] bArrZzn = zzzox.zzn(zzzox.zzXa() * 2);
            zzzox.zzX9();
            com.aspose.words.internal.zzZQG.zzZ(this.zzZm, bArrZzn);
        }
    }

    public final int zzV(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        int size = this.zzZm.size();
        if (size == 0) {
            return 0;
        }
        long position = zzzow.zzq().getPosition();
        zzzow.zzJ((short) -1);
        zzzow.zzK((short) size);
        zzzow.zzK((short) 2);
        for (int i = 0; i < size; i++) {
            byte[] bArr = this.zzZm.get(i);
            zzzow.zzK((short) (bArr.length / 2));
            zzzow.writeBytes(bArr);
            zzzow.zzK((short) 1);
        }
        return (int) (zzzow.zzq().getPosition() - position);
    }

    public final String zzWU(int i) {
        return com.aspose.words.internal.zzZO0.zzhU().zzZn(zzl7(i));
    }

    public final void zzXJ(byte[] bArr) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZm, bArr);
    }

    public final byte[] zzl7(int i) {
        return this.zzZm.get(i);
    }
}

package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzIJ {
    byte zzN7;
    byte zzN8;
    byte[] zzyf;

    public static zzIJ zzZ(zzY0 zzy0, int i, int i2) throws Exception {
        int i3 = i + 2;
        if (i2 < i3) {
            throw new IllegalStateException("Wrong hdmx device record size.");
        }
        zzIJ zzij = new zzIJ();
        zzij.zzN8 = zzy0.readByte();
        zzij.zzN7 = zzy0.readByte();
        zzij.zzyf = zzy0.zzn(i);
        zzy0.zzq().zzH(zzy0.zzq().getPosition() + ((long) (i2 - i3)));
        return zzij;
    }

    public final void zzS(zzXZ zzxz, int i) throws Exception {
        if (i < this.zzyf.length + 2) {
            throw new IllegalStateException("Wrong hdmx device record size.");
        }
        zzX(zzxz);
        zzxz.writeBytes(this.zzyf);
        zzxz.zzq().zzH(zzxz.zzq().getPosition() + ((long) (i - (this.zzyf.length + 2))));
    }

    public final void zzX(zzXZ zzxz) throws Exception {
        zzxz.writeByte(this.zzN8);
        zzxz.writeByte(this.zzN7);
    }
}

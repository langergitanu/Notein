package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZVK {
    public short zz7y;
    public short zzBj;
    public short zzBl;

    public static zzZVK zzm(zzY0 zzy0) throws Exception {
        zzZVK zzzvk = new zzZVK();
        zzzvk.zz7y = zzy0.zzX9();
        zzzvk.zzBj = zzy0.zzXa();
        zzzvk.zzBl = zzy0.zzXa();
        return zzzvk;
    }

    public final void zzX(zzXZ zzxz) throws Exception {
        zzxz.zzi(this.zz7y & 65535);
        zzxz.zzj(this.zzBj);
        zzxz.zzj(this.zzBl);
    }
}

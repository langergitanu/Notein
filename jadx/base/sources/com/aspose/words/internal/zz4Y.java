package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz4Y {
    private zz4W zzkV;
    private zzZYT<zzFW> zzlk = new zzZYT<>();
    private zzZYT<zzFW> zzjL = new zzZYT<>();
    private zzZYT<zzFW> zzjK = new zzZYT<>();
    private zzZYT<zzFW> zzjJ = new zzZYT<>();
    private zzZYT<zzFW> zzjI = new zzZYT<>();

    public zz4Y(zz4W zz4w) {
        this.zzkV = zz4w;
    }

    public final zz3Q zzL(zzPM zzpm) throws Exception {
        return zzZ(zzpm, null);
    }

    public final zz4A zzN(float f, float f2) {
        zz4A zz4aZzN = this.zzkV.zzvb().zzN(f, f2);
        this.zzjK.set(zz4aZzN.zzF1(), zz4aZzN);
        return zz4aZzN;
    }

    public final zz34 zzU(byte[] bArr, zzEP zzep) throws Exception {
        zz34 zz34VarZzU = this.zzkV.zzvb().zzU(bArr, zzep);
        this.zzjJ.set(zz34VarZzU.zzF1(), zz34VarZzU);
        return zz34VarZzU;
    }

    public final zz27 zzX(zzZ8 zzz8) throws Exception {
        zz27 zz27VarZzX = this.zzkV.zzvb().zzX(zzz8);
        this.zzjI.set(zz27VarZzX.zzF1(), zz27VarZzX);
        return zz27VarZzX;
    }

    public final zz3Q zzZ(zzPM zzpm, String str) throws Exception {
        zz3Q zz3qZzZ = this.zzkV.zzvb().zzZ(zzpm, str);
        this.zzlk.set(zz3qZzZ.zzF1(), zz3qZzZ);
        return zz3qZzZ;
    }

    public final boolean zzvf() {
        return this.zzlk.getCount() > 0 || this.zzjL.getCount() > 0 || this.zzjK.getCount() > 0 || this.zzjJ.getCount() > 0 || this.zzjI.getCount() > 0;
    }

    public final void zzL(zzFY zzfy) throws Exception {
        zzfy.zzFd();
        zzZ(zzfy, "/Font", this.zzlk);
        zzZ(zzfy, "/Pattern", this.zzjL);
        zzZ(zzfy, "/ExtGState", this.zzjK);
        zzZ(zzfy, "/XObject", this.zzjJ);
        zzZ(zzfy, "/Shading", this.zzjI);
        zzfy.zzFc();
    }

    public final zz2F zzZ(zzPY zzpy, zzZQ4 zzzq4, zz3A zz3a) throws Exception {
        zz2F zz2fZzZ = this.zzkV.zzvb().zzZ(zzpy, zzzq4, zz3a);
        if (zz2fZzZ != null) {
            this.zzjL.set(zz2fZzZ.zzF1(), zz2fZzZ);
        }
        return zz2fZzZ;
    }

    public final void zzZ(zzFW zzfw) {
        if (this.zzjL.containsKey(zzfw.zzF1())) {
            return;
        }
        this.zzjL.zzB(zzfw.zzF1(), zzfw);
    }

    public final zz49 zzZ(zz3D zz3d) {
        zz49 zz49VarZzZ = this.zzkV.zzvb().zzZ(zz3d);
        this.zzjK.set(zz49VarZzZ.zzF1(), zz49VarZzZ);
        return zz49VarZzZ;
    }

    public final void zzZ(zz5E zz5e) {
        if (this.zzjJ.containsKey(zz5e.zzF1())) {
            return;
        }
        this.zzjJ.zzB(zz5e.zzF1(), zz5e);
    }

    private static void zzZ(zzFY zzfy, String str, zzZYT<zzFW> zzzyt) throws Exception {
        if (zzzyt.getCount() == 0) {
            return;
        }
        zzfy.zzYY(str);
        zzfy.zzFd();
        for (zzFW zzfw : zzzyt.zzl9()) {
            zzfy.zzB(zzfw.zzF1(), zzfw.zzF0());
        }
        zzfy.zzFc();
    }
}

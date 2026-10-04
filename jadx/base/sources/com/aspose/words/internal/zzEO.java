package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzEO {
    private int zzB;
    private int zzu;
    private zzF4 zzv;

    public zzEO(int i, zzF4 zzf4, int i2) {
        this.zzB = i;
        this.zzv = zzf4;
        this.zzu = i2;
    }

    public final byte[] zzW(zzXN zzxn) throws Exception {
        zzZOR zzzor = new zzZOR();
        if (zzWj(zzxn.getImageType())) {
            zzxn.zzZ(zzzor, zzxn.getImageType());
        } else if (zzxn.getImageType() == 9 && zzWj(6)) {
            zzxn.zzZ(zzzor, 6);
            this.zzv.zzZ(2, this.zzu, "GIF images are not supported, image converted to PNG");
        } else {
            zzxn.zzY(zzzor, this.zzB);
            this.zzv.zzZ(2, this.zzu, "{0} images are not supported, image converted to JPEG", zzxn.getImageType() == 0 ? "Unknown" : zzKE.zzWX(zzxn.getImageType()));
        }
        return zzZYQ.zzZX(zzzor);
    }

    public boolean zzWj(int i) {
        return false;
    }

    public boolean zzZV(byte[] bArr) throws Exception {
        return zzWj(zzEF.zzZU(bArr));
    }

    public final byte[] zzZW(byte[] bArr) throws Exception {
        while (!zzZV(bArr)) {
            try {
                zzXN zzxn = new zzXN(bArr);
                try {
                    continue;
                    return zzW(zzxn);
                } finally {
                    zzxn.dispose();
                }
            } catch (Exception unused) {
                bArr = zzEF.zzDL();
            }
        }
        return bArr;
    }

    public final byte[] zzW(byte[] bArr, zzEP zzep) throws Exception {
        if (zzep != null) {
            try {
                if (zzep.zzDX()) {
                    zzXN zzxnZzZX = zzep.zzZX(bArr);
                    try {
                        bArr = zzW(zzxnZzZX);
                    } finally {
                        if (zzxnZzZX != null) {
                            zzxnZzZX.dispose();
                        }
                    }
                }
            } catch (Exception e) {
                this.zzv.zzZ(2, this.zzu, zzZKN.format("Image cannot be cropped because: {0}", e.getMessage()));
            }
        }
        return bArr;
    }
}

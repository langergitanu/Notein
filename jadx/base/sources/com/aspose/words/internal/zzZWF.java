package com.aspose.words.internal;

import android.graphics.Bitmap;
import androidx.appcompat.widget.C21532OooOOo;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZWF {
    private int zz8s;
    private zzZJD zz8t;
    private int zz8u;
    private Bitmap zz8v;
    private int zz8w;
    private byte zzCr;
    private zzZOP zzN5;
    private int zzVz;

    private static int zzSc(int i) {
        switch (i) {
            case 1:
                return zzZJD.zzZKK[9];
            case 2:
                return zzZJD.zzZKK[0];
            case 3:
                return zzZJD.zzZKK[1];
            case 4:
                return zzZJD.zzZKK[2];
            case 5:
                return zzZJD.zzZKK[3];
            case 6:
                return zzZJD.zzZKK[4];
            default:
                throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "compression: "));
        }
    }

    private zzZJU zzT(zzXN zzxn) {
        zzZJU zzzju = new zzZJU();
        zzzju.zzZM(zzxn.getHorizontalResolution());
        zzzju.zzZL(zzxn.getVerticalResolution());
        zzzju.zzZW(zzSc(this.zzVz));
        return zzzju;
    }

    public final void zzU(zzXN zzxn) throws Exception {
        Bitmap bitmapZzZ = zzZ(zzxn, this.zzVz, this.zz8w, this.zzCr);
        zzZJD zzzjd = this.zz8t;
        int i = this.zz8s;
        this.zz8s = i + 1;
        zzzjd.zzZ(i, bitmapZzZ);
    }

    public final void zzZ(zzZOP zzzop, int i, int i2, byte b, zzXN zzxn) throws Exception {
        zzZ(zzxn, zzzop, i, i2, b);
    }

    public final void zzZ(zzXN zzxn, zzZOP zzzop, int i, int i2, byte b) throws Exception {
        this.zzCr = b;
        this.zzN5 = zzzop;
        this.zzVz = i;
        this.zz8w = i2;
        this.zz8v = zzZ(zzxn, i, i2, b);
        zzZJD zzzjd = new zzZJD();
        this.zz8t = zzzjd;
        zzzjd.zzZD(zzzop);
        this.zz8t.zzZ(zzT(zzxn), this.zz8v, true);
        this.zz8s++;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Bitmap zzZ(zzXN zzxn, int i, int i2, byte b) throws Exception {
        if (i == 1) {
            if (this.zz8u == 196865) {
                zzxn.zzWC();
            }
        } else if (i != 2) {
            if (i == 3 || i == 4) {
                zzxn = zzZ(i2, zzxn, b);
            } else if (i == 5) {
            }
        }
        return zzxn.zzDW();
    }

    private static Bitmap zzZ(Bitmap bitmap, byte b) {
        Bitmap bitmapZzX = zzIW.zzGD().zzX(bitmap);
        zzK9 zzk9 = new zzK9();
        zzk9.zzS(b);
        return zzk9.zzX(bitmapZzX);
    }

    private static zzXN zzZ(int i, zzXN zzxn, byte b) {
        if (i == 0) {
            zzxn.zzWC();
            return zzxn;
        }
        if (i == 1) {
            return new zzXN(zzZ(zzxn.zzDW(), b));
        }
        throw new IllegalArgumentException("Parameter name: binarizationMethod");
    }
}

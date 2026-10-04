package com.aspose.words.internal;

import android.graphics.Bitmap;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzKR {

    /* JADX INFO: renamed from: X */
    protected int f50784X;
    private byte zzCr = UnsignedBytes.MAX_POWER_OF_TWO;
    protected int zzCs;
    protected int zzCt;
    protected int zzCu;
    protected int zzCv;

    private void zzW(Bitmap bitmap) {
        this.zzCu = bitmap.getWidth();
        this.zzCt = bitmap.getHeight();
        this.zzCs = this.zzCu;
    }

    private static void zzY(Bitmap.Config config) {
        if (Bitmap.Config.ARGB_8888 == config) {
            return;
        }
        throw new UnsupportedOperationException("This Bitmap.Config is not supported. " + config);
    }

    private void zzZ(byte[] bArr, zzXT zzxt, int i) {
        int i2 = bArr[i] & 255;
        if (i2 >= (this.zzCr & 255)) {
            bArr[i] = -1;
            i2 -= 255;
        } else {
            bArr[i] = 0;
        }
        if ((bArr[i] & 255) == 255) {
            zzxt.zzWX();
        }
        zzxt.zzWW();
        zzX(i2, bArr, i);
    }

    public final void zzS(byte b) {
        this.zzCr = b;
    }

    public final Bitmap zzX(Bitmap bitmap) {
        zzY(bitmap.getConfig());
        zzW(bitmap);
        byte[] bArrZzT = zzZRR.zzT(bitmap);
        zzZRS zzzrs = new zzZRS(this.zzCu, this.zzCt);
        zzXT zzxt = new zzXT(zzzrs.getData());
        int iZzlP = zzzrs.zzlP();
        this.zzCv = 0;
        int i = 0;
        while (true) {
            int i2 = this.zzCv;
            if (i2 >= this.zzCt) {
                return zzzrs.zzlO();
            }
            zzxt.zz5(i2 * iZzlP);
            this.f50784X = 0;
            while (this.f50784X < this.zzCu) {
                zzZ(bArrZzT, zzxt, i);
                this.f50784X++;
                i++;
            }
            this.zzCv++;
        }
    }

    public abstract void zzX(int i, byte[] bArr, int i2);
}

package com.aspose.words.internal;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZRL extends zzZRJ {
    private static final Matrix zz52;

    static {
        Matrix matrix = new Matrix();
        zz52 = matrix;
        matrix.setScale(0.75f, 0.75f);
    }

    public zzZRL(byte[] bArr) {
        zzZ(zzYU(bArr));
    }

    private Shader zzYU(byte[] bArr) {
        Shader bitmapShader;
        try {
            this.zzVJ = new zzXN(bArr).zzDW();
            Bitmap bitmap = this.zzVJ;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        } catch (Exception unused) {
            bitmapShader = zzZRJ.zz4U;
        }
        bitmapShader.setLocalMatrix(zz52);
        return bitmapShader;
    }
}

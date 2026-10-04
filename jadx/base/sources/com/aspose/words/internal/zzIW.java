package com.aspose.words.internal;

import android.graphics.Bitmap;
import android.graphics.Color;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class zzIW {
    private double zzyD = 0.5d;
    private double zzyC = 0.419d;
    private double zzyB = 0.081d;

    private zzIW() {
    }

    public static zzIW zzGD() {
        return new zzIW();
    }

    private static void zzY(Bitmap.Config config) {
        if (config != Bitmap.Config.ARGB_8888) {
            throw new IllegalStateException("Unsupported pixel format");
        }
    }

    private void zzZ(Bitmap bitmap, Bitmap bitmap2) {
        int i = (int) (this.zzyD * 65536.0d);
        int i2 = (int) (this.zzyC * 65536.0d);
        int i3 = (int) (this.zzyB * 65536.0d);
        IntBuffer intBufferAllocate = IntBuffer.allocate(bitmap.getHeight() * bitmap.getWidth());
        bitmap.copyPixelsToBuffer(intBufferAllocate);
        int[] iArrArray = intBufferAllocate.array();
        for (int i4 = 0; i4 < iArrArray.length; i4++) {
            int i5 = iArrArray[i4];
            int iRed = Color.red(i5);
            int iGreen = Color.green(i5) * i2;
            int iBlue = ((Color.blue(i5) * i3) + (iGreen + (iRed * i))) >> 16;
            iArrArray[i4] = Color.rgb(iBlue, iBlue, iBlue);
        }
        bitmap2.copyPixelsFromBuffer(IntBuffer.wrap(iArrArray));
    }

    public final Bitmap zzX(Bitmap bitmap) {
        zzY(bitmap.getConfig());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        zzZ(bitmap, bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }
}

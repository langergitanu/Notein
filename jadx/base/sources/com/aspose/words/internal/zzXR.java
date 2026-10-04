package com.aspose.words.internal;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class zzXR {
    private static Bitmap zzVK;

    static {
        try {
            zzZK7 zzzk7 = new zzZK7(zzEF.zzDM());
            try {
                zzVK = BitmapFactory.decodeStream(zzzk7);
            } finally {
                zzzk7.close();
            }
        } catch (Throwable unused) {
        }
    }

    public static Bitmap zzWR() {
        return zzVK;
    }

    private static zzXS zzY(Bitmap bitmap) {
        Bitmap bitmapCopy = null;
        try {
            Bitmap.Config config = bitmap.getConfig();
            Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
            bitmapCopy = config != config2 ? bitmap.copy(config2, true) : bitmap;
            zzXS zzxs = new zzXS(bitmapCopy);
            if (bitmapCopy != bitmap && bitmapCopy != null) {
                bitmapCopy.recycle();
            }
            return zzxs;
        } catch (Throwable th) {
            if (bitmapCopy != bitmap && bitmapCopy != null) {
                bitmapCopy.recycle();
            }
            throw th;
        }
    }

    public static zzOT zzZ(Bitmap bitmap) {
        zzXS zzxsZzY = zzY(bitmap);
        return new zzOT(zzZ(zzxsZzY, (zzxsZzY.getWidth() / 8) + (zzxsZzY.getWidth() % 8 > 0 ? 1 : 0)), null, false, 2, 1);
    }

    private static byte[] zzZ(zzXS zzxs, int i) {
        byte[] bArr = new byte[zzxs.getHeight() * i];
        zzXT zzxt = new zzXT(bArr);
        for (int i2 = 0; i2 < zzxs.getHeight(); i2++) {
            int iZzWS = zzxs.zzWS() * i2;
            zzxt.zz5(i2 * i);
            zzZ(zzxs, zzxt, iZzWS);
        }
        zzxt.flush();
        return bArr;
    }

    private static void zzZ(zzXS zzxs, zzXT zzxt, int i) {
        for (int i2 = 0; i2 < zzxs.getWidth(); i2++) {
            if ((zzxs.getBytes()[i] & 255) + (zzxs.getBytes()[i + 1] & 255) + (zzxs.getBytes()[i + 2] & 255) < 500) {
                zzxt.zzWX();
            }
            zzxt.zzWW();
            i += 4;
        }
    }

    public static zzOT zzZ(Bitmap bitmap, boolean z) {
        boolean zHasAlpha = bitmap.hasAlpha();
        if (!zHasAlpha && z) {
            byte[] bArr = zzZ1.zzXW;
            return new zzOT(bArr, bArr, false, 0, 8);
        }
        byte[] bArr2 = new byte[z ? 0 : bitmap.getHeight() * bitmap.getWidth() * 3];
        byte[] bArr3 = new byte[zHasAlpha ? bitmap.getHeight() * bitmap.getWidth() : 0];
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i = width * height;
        int[] iArr = new int[i];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int i2 = 0;
        int i3 = 0;
        boolean z2 = false;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = iArr[i4];
            int i6 = (i5 >> 16) & 255;
            int i7 = (i5 >> 8) & 255;
            int i8 = i5 & 255;
            if (zHasAlpha) {
                int i9 = i5 >> 24;
                int i10 = i2 + 1;
                bArr3[i2] = (byte) (i9 & 255);
                if ((i9 & 255) < 255) {
                    z2 = true;
                }
                i2 = i10;
            }
            if (!z) {
                bArr2[i3] = (byte) i6;
                int i11 = i3 + 2;
                bArr2[i3 + 1] = (byte) i7;
                i3 += 3;
                bArr2[i11] = (byte) i8;
            }
        }
        return new zzOT(bArr2, bArr3, z2, 0, 8);
    }

    public static void zzZ(Bitmap bitmap, zzZQ5 zzzq5, Bitmap bitmap2, zzZQ5 zzzq52) {
        zzZ(bitmap, zzzq5, bitmap2, zzzq52, null);
    }

    public static void zzZ(Bitmap bitmap, zzZQ5 zzzq5, Bitmap bitmap2, zzZQ5 zzzq52, zzPV zzpv) {
        Rect rect = new Rect(zzzq52.getLeft(), zzzq52.getTop(), zzzq52.getRight(), zzzq52.getBottom());
        Rect rect2 = new Rect(zzzq5.getLeft(), zzzq5.getTop(), zzzq5.getRight(), zzzq5.getBottom());
        if (bitmap2 == null) {
            bitmap2 = Bitmap.createBitmap(zzzq52.getWidth(), zzzq52.getHeight(), bitmap.getConfig());
        }
        Canvas canvas = new Canvas(bitmap2);
        if (zzpv != null && !zzPV.zzZ(zzpv, zzPV.zzHZ)) {
            canvas.drawColor(zzT4.zzS(zzpv));
        }
        canvas.drawBitmap(bitmap, rect2, rect, zzJ8.zzza);
    }

    public static void zzZ(Bitmap bitmap, byte[] bArr, int i) {
        int i2;
        int i3;
        if (bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
            IntBuffer intBufferAllocate = IntBuffer.allocate(bitmap.getHeight() * bitmap.getWidth());
            bitmap.copyPixelsToBuffer(intBufferAllocate);
            int[] iArrArray = intBufferAllocate.array();
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int iZzRl = zzZQ7.zzRl(i);
            int i4 = iZzRl / 8;
            int i5 = i4 * width;
            int i6 = (((iZzRl * width) + 31) / 32) * 4;
            int[] iArr = new int[4];
            int i7 = 0;
            iArr[0] = 0;
            char c = 1;
            iArr[1] = 0;
            char c2 = 2;
            iArr[2] = 0;
            iArr[3] = 255;
            int i8 = 0;
            int i9 = 0;
            while (i8 < height) {
                int i10 = i8 * i6;
                int i11 = i7;
                while (true) {
                    i2 = i7;
                    if (i11 >= i6 || (i3 = i11 + i4) > i5) {
                        break;
                    }
                    int i12 = i11 + i10;
                    char c3 = c;
                    int i13 = i2;
                    while (i13 < i4) {
                        iArr[i13] = bArr[i12 + i13] & 255;
                        i13++;
                        c2 = c2;
                    }
                    char c4 = c2;
                    iArrArray[i9] = ((iArr[3] & 255) << 24) | ((iArr[i2] & 255) << 16) | ((iArr[c3] & 255) << 8) | (iArr[c4] & 255);
                    i11 = i3;
                    i9++;
                    c = c3;
                    c2 = c4;
                    i7 = i2;
                }
                i8++;
                i7 = i2;
                c = c;
                c2 = c2;
            }
            bitmap.copyPixelsFromBuffer(IntBuffer.wrap(iArrArray));
            return;
        }
        throw new UnsupportedOperationException("setPixels doesn't support dataType=" + bitmap.getConfig());
    }
}

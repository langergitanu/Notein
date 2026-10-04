package com.aspose.words.internal;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZRP {

    public static final class zzY implements zzZ {
        private final int[] mData;
        private final int zzVL;

        public zzY(Bitmap bitmap) {
            IntBuffer intBufferAllocate = IntBuffer.allocate(bitmap.getHeight() * bitmap.getWidth());
            bitmap.copyPixelsToBuffer(intBufferAllocate);
            this.mData = intBufferAllocate.array();
            this.zzVL = bitmap.getWidth();
        }

        @Override // com.aspose.words.internal.zzZRP.zzZ
        public final int getPixel(int i, int i2) {
            return this.mData[(i2 * this.zzVL) + i];
        }
    }

    public interface zzZ {
        int getPixel(int i, int i2);
    }

    private static zzZ zzR(Bitmap bitmap) {
        if (bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
            return new zzY(bitmap);
        }
        throw new UnsupportedOperationException("PixelExtractor for config '" + bitmap.getConfig() + " is not implemented yet.");
    }

    private static Bitmap zzX(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        int width = bitmap.getWidth() * 2;
        int height = bitmap.getHeight();
        while (true) {
            height *= 2;
            if (width >= i || height >= i2) {
                break;
            }
            bitmap = zzY(bitmap, width, height);
            width *= 2;
        }
        return zzY(bitmap, i, i2);
    }

    private static Bitmap zzY(Bitmap bitmap, int i, int i2) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, bitmap.getConfig());
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, (Rect) null, new Rect(0, 0, i, i2), zzJ8.zzza);
        return bitmapCreateBitmap;
    }

    public static Bitmap zzZ(Bitmap bitmap, int i, int i2, boolean z) {
        int iAbs = Math.abs(i);
        int iAbs2 = Math.abs(i2);
        if (iAbs == 0 || iAbs2 == 0) {
            return bitmap;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width == iAbs && height == iAbs2) {
            return bitmap;
        }
        float f = iAbs / width;
        float f2 = iAbs2 / height;
        if (f > 1.0f && f2 > 1.0f) {
            return z ? zzX(bitmap, iAbs, iAbs2) : zzY(bitmap, iAbs, iAbs2);
        }
        try {
            return zzZ(bitmap, iAbs, iAbs2);
        } catch (Exception unused) {
            return zzY(bitmap, iAbs, iAbs2);
        }
    }

    private static int zzZP(float f) {
        return Math.min(Math.round(f), 255);
    }

    public static Bitmap zzZ(Bitmap bitmap, int i, int i2) throws Exception {
        int i3;
        float f;
        float f2;
        if (bitmap == null || (i <= 0 && i2 <= 0)) {
            return bitmap;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        zzZ zzzZzR = zzR(bitmap);
        int[] iArr = new int[i * height];
        float f3 = width;
        float f4 = f3 / i;
        float f5 = height;
        float f6 = f5 / i2;
        float f7 = (width * height) / (i * i2);
        for (int i4 = 0; i4 < i2; i4++) {
            float f8 = i4 * f6;
            float f9 = f8 + f6;
            float f10 = f9 <= f5 ? f9 : f5;
            int i5 = i4 * i;
            int i6 = 0;
            while (i6 < i) {
                float f11 = i6 * f4;
                float f12 = f11 + f4;
                if (f12 <= f3) {
                    i3 = i6;
                    f = f11;
                    f2 = f12;
                } else {
                    i3 = i6;
                    f = f11;
                    f2 = f3;
                }
                iArr[i5 + i3] = zzZ(zzzZzR, f, f8, f2, f10, f7);
                i6 = i3 + 1;
            }
        }
        bitmap.recycle();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.copyPixelsFromBuffer(IntBuffer.wrap(iArr));
        return bitmapCreateBitmap;
    }

    private static int zzZ(zzZ zzz, float f, float f2, float f3, float f4, float f5) {
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        while (f2 < f4) {
            int i = (int) f2;
            float f10 = i + 1;
            if (f10 > f4) {
                f10 = f4;
            }
            float f11 = (f10 - f2) / f5;
            float f12 = f;
            while (f12 < f3) {
                int i2 = (int) f12;
                float f13 = i2 + 1;
                if (f13 > f3) {
                    f13 = f3;
                }
                float f14 = (f13 - f12) * f11;
                int pixel = zzz.getPixel(i2, i);
                f6 += ((pixel >>> 24) & 255) * f14;
                f7 += ((pixel >>> 16) & 255) * f14;
                f8 += ((pixel >>> 8) & 255) * f14;
                f9 += (pixel & 255) * f14;
                f12 = f13;
            }
            f2 = f10;
        }
        return (zzZP(f6) << 24) | (zzZP(f7) << 16) | (zzZP(f8) << 8) | zzZP(f9);
    }
}

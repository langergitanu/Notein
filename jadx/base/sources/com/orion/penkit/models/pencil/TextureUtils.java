package com.orion.penkit.models.pencil;

import android.graphics.Bitmap;
import android.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO0O00oo.OooOO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007J.\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eJ0\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002¨\u0006\u0013"}, m80612d2 = {"Lcom/orion/penkit/models/pencil/TextureUtils;", "", "<init>", "()V", "generateSeamlessTexture", "Landroid/graphics/Bitmap;", "width", "", "height", "seed", "", "baseColor", "generateRoundRectTexture", "cornerRadius", "", "isInRoundRect", "", "x", "y", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class TextureUtils {
    public static final TextureUtils INSTANCE = new TextureUtils();

    private TextureUtils() {
    }

    private final boolean isInRoundRect(int x, int y, int width, int height, float cornerRadius) {
        float f = x;
        if (f < cornerRadius || f >= width - cornerRadius) {
            float f2 = y;
            if (f2 < cornerRadius || f2 >= height - cornerRadius) {
                if (f < cornerRadius && f2 < cornerRadius) {
                    float f3 = f - cornerRadius;
                    float f4 = f2 - cornerRadius;
                    return (f4 * f4) + (f3 * f3) <= cornerRadius * cornerRadius;
                }
                float f5 = width - cornerRadius;
                if (f >= f5 && f2 < cornerRadius) {
                    float f6 = f - f5;
                    float f7 = f2 - cornerRadius;
                    return (f7 * f7) + (f6 * f6) <= cornerRadius * cornerRadius;
                }
                if (f < cornerRadius) {
                    float f8 = height - cornerRadius;
                    if (f2 >= f8) {
                        float f9 = f - cornerRadius;
                        float f10 = f2 - f8;
                        return (f10 * f10) + (f9 * f9) <= cornerRadius * cornerRadius;
                    }
                }
                if (f >= f5) {
                    float f11 = height - cornerRadius;
                    if (f2 >= f11) {
                        float f12 = f - f5;
                        float f13 = f2 - f11;
                        if ((f13 * f13) + (f12 * f12) <= cornerRadius * cornerRadius) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final Bitmap generateRoundRectTexture(int width, int height, long seed, int baseColor, float cornerRadius) {
        int i = width;
        int i2 = height;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        OooOOO0.OooO0o(bitmapCreateBitmap, "createBitmap(...)");
        int iRed = Color.red(baseColor);
        int iGreen = Color.green(baseColor);
        int iBlue = Color.blue(baseColor);
        int i3 = 0;
        while (i3 < i) {
            int i4 = 0;
            while (i4 < i2) {
                if (isInRoundRect(i3, i4, i, i2, cornerRadius)) {
                    bitmapCreateBitmap.setPixel(i3, i4, Color.argb(OooOO0.OooO0o((int) (((double) (OpenSimplex2.noise2(seed, i3, i4) + 1)) * 0.3d * ((double) 255)), 0, 255), iRed, iGreen, iBlue));
                } else {
                    bitmapCreateBitmap.setPixel(i3, i4, 0);
                }
                i4++;
                i = width;
                i2 = height;
            }
            i3++;
            i = width;
            i2 = height;
        }
        return bitmapCreateBitmap;
    }

    public final Bitmap generateSeamlessTexture(int width, int height, long seed, int baseColor) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        OooOOO0.OooO0o(bitmapCreateBitmap, "createBitmap(...)");
        for (int i = 0; i < width; i++) {
            int i2 = 0;
            while (i2 < height) {
                long j = seed;
                bitmapCreateBitmap.setPixel(i, i2, Color.argb(OooOO0.OooO0o((int) (((double) (OpenSimplex2.noise2(j, i, i2) + 1)) * 0.3d * ((double) 255)), 0, 255), Color.red(baseColor), Color.green(baseColor), Color.blue(baseColor)));
                i2++;
                seed = j;
            }
        }
        return bitmapCreateBitmap;
    }
}

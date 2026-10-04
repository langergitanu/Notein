package com.aspose.words.internal;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZQ7 {
    public static int zzRl(int i) {
        switch (i) {
            case 135173:
            case 135174:
            case 397319:
            case 1052676:
                return 16;
            case 137224:
                return 24;
            case 196865:
            case 262144:
                return 1;
            case 197634:
                return 4;
            case 198659:
                return 8;
            case 1060876:
                return 48;
            case 1851406:
            case 3424269:
                return 65;
            default:
                return 32;
        }
    }

    public static Bitmap.Config zzRm(int i) {
        if (i != 137224 && i != 925707 && i == 2498570) {
            return Bitmap.Config.ARGB_8888;
        }
        return Bitmap.Config.ARGB_8888;
    }
}

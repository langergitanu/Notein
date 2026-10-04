package com.aspose.words.internal;

import android.graphics.Bitmap;
import android.graphics.Color;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class zzXQ {
    private final boolean zzVH;
    private final int[] zzVI;
    private final Bitmap zzVJ;

    public zzXQ(Bitmap bitmap) {
        this.zzVJ = bitmap;
        if (bitmap.getConfig() == Bitmap.Config.ARGB_8888 && !bitmap.hasAlpha()) {
            zzZRR.zzY(bitmap, true);
        }
        this.zzVH = zzZRR.zzU(bitmap);
        IntBuffer intBufferAllocate = IntBuffer.allocate(bitmap.getHeight() * bitmap.getWidth());
        bitmap.copyPixelsToBuffer(intBufferAllocate);
        this.zzVI = intBufferAllocate.array();
    }

    private int zz0(int i) {
        return this.zzVH ? i & 255 : Color.red(i);
    }

    private int zzZX(int i) {
        return this.zzVH ? zzZRR.zzRD(i) : Color.alpha(i);
    }

    private int zzZY(int i) {
        return this.zzVH ? zzZRR.zzRE(i) : Color.blue(i);
    }

    private int zzZZ(int i) {
        return this.zzVH ? zzZRR.zzRF(i) : Color.green(i);
    }

    public final byte zz1(int i) {
        return (byte) zzZY(this.zzVI[i]);
    }

    public final byte zz2(int i) {
        return (byte) zzZZ(this.zzVI[i]);
    }

    public final byte zz3(int i) {
        return (byte) zz0(this.zzVI[i]);
    }

    public final byte zz4(int i) {
        return (byte) zzZX(this.zzVI[i]);
    }

    public final void zzL(int i, int i2) {
        zzY(i, i2, zz3(i), zz2(i), zz1(i));
    }

    public final int zzWO() {
        return this.zzVI.length;
    }

    public final int zzWP() {
        return this.zzVI.length;
    }

    public final void zzWQ() {
        this.zzVJ.copyPixelsFromBuffer(IntBuffer.wrap(this.zzVI));
    }

    public final void zzY(int i, int i2, int i3, int i4, int i5) {
        int iZzRC = (i2 << 24) | ((i3 & 255) << 16) | ((i4 & 255) << 8) | (i5 & 255);
        int[] iArr = this.zzVI;
        if (this.zzVH) {
            iZzRC = zzZRR.zzRC(iZzRC);
        }
        iArr[i] = iZzRC;
    }
}

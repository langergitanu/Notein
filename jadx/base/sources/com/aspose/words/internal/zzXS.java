package com.aspose.words.internal;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class zzXS {
    private final int zzVL;
    private final int zzVM;
    private final int zzVN;
    private final byte[] zzVO;

    public zzXS(Bitmap bitmap) {
        this.zzVL = bitmap.getWidth();
        this.zzVN = bitmap.getHeight();
        int width = bitmap.getWidth() * 4;
        this.zzVM = width;
        this.zzVO = zzZ(bitmap, width);
    }

    private static byte[] zzZ(Bitmap bitmap, int i) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bitmap.getHeight() * i);
        bitmap.copyPixelsToBuffer(byteBufferAllocate);
        return byteBufferAllocate.array();
    }

    public final byte[] getBytes() {
        return this.zzVO;
    }

    public final int getHeight() {
        return this.zzVN;
    }

    public final int getWidth() {
        return this.zzVL;
    }

    public final int zzWS() {
        return this.zzVM;
    }
}

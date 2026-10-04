package com.aspose.words.internal;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZJ6 extends zzZJ9 {
    private final zzZOR zzZJE = new zzZOR();

    @Override // com.aspose.words.internal.zzZJ9
    public final int zzK(Bitmap bitmap) throws Exception {
        this.zzZJE.setLength(0L);
        this.zzZJE.zzH(0L);
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, new zzZK6(this.zzZJE));
        bitmap.recycle();
        long length = this.zzZJE.getLength();
        this.zzZJE.zzZH(this.zzZJV.zzq());
        return (int) length;
    }

    @Override // com.aspose.words.internal.zzZJ9
    public final void zzZ(zzZJU zzzju) {
        super.zzZ(zzzju);
        zzzju.zzR(null);
        zzzju.zzW(new char[]{'\b', '\b', '\b'});
        zzzju.zzQc(3);
        int iZzdT = zzzju.zzdT();
        if (iZzdT == 1) {
            zzzju.zzV(null);
            zzzju.zzU(null);
            zzzju.zzY(null);
        }
        if (iZzdT == 3 || iZzdT == 4) {
            zzzju.zzV(new char[]{2, 2});
            zzzju.zzU(new char[]{1});
            zzzju.zzY(new long[][]{new long[]{0, 1}, new long[]{255, 1}, new long[]{128, 1}, new long[]{255, 1}, new long[]{128, 1}, new long[]{255, 1}});
        }
    }

    @Override // com.aspose.words.internal.zzZJ9
    public final int zzZ(byte[] bArr, int i, int i2, int i3, int[] iArr, int i4) throws Exception {
        throw new UnsupportedOperationException("Use int encode(Bitmap raster, int off, int width, int height, int[] bitsPerSample, int scanlineStride) method");
    }
}

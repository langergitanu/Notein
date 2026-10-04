package com.aspose.words.internal;

import android.graphics.Bitmap;
import androidx.core.view.ViewCompat;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZRS {
    private int zz5b;
    private final int zz5c;
    private final int zz5d;
    private final int zz5e;
    private final int zz5f;
    private final int zz5g;
    private final int zz5h;
    private final int zz5i;
    private final Bitmap zz5j;
    private final byte[] zz5k;
    private final int zzVL;
    private final int zzVN;

    public zzZRS(int i, int i2) {
        this(Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888));
    }

    private byte[] zzZ(int i, int i2, byte[] bArr, int i3) {
        byte[] bArr2 = new byte[i * i2];
        int i4 = this.zz5b;
        int i5 = this.zz5g;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < i2; i8++) {
            int i9 = i5;
            int i10 = 0;
            while (i10 < i) {
                int i11 = i9 & 7;
                if (i11 == 0) {
                    break;
                }
                bArr2[i7] = (byte) ((bArr[(i9 >> 3) + i6] >> (this.zz5e - i11)) & this.zz5d);
                i9 += i4;
                i10++;
                i7++;
            }
            int i12 = (i9 >> 3) + i6;
            boolean z = true;
            if (i4 == 1) {
                while (i10 < i - 7) {
                    int i13 = i12 + 1;
                    byte b = bArr[i12];
                    bArr2[i7] = (byte) ((b >> 7) & 1);
                    boolean z2 = z;
                    bArr2[i7 + 1] = (byte) ((b >> 6) & 1);
                    bArr2[i7 + 2] = (byte) ((b >> 5) & 1);
                    bArr2[i7 + 3] = (byte) ((b >> 4) & 1);
                    bArr2[i7 + 4] = (byte) ((b >> 3) & 1);
                    bArr2[i7 + 5] = (byte) ((b >> 2) & 1);
                    int i14 = i7 + 7;
                    bArr2[i7 + 6] = (byte) ((b >> 1) & 1);
                    i7 += 8;
                    bArr2[i14] = (byte) (b & 1);
                    i9 += 8;
                    i10 += 8;
                    i12 = i13;
                    z = z2;
                }
            }
            while (i10 < i) {
                bArr2[i7] = (byte) ((bArr[(i9 >> 3) + i6] >> (this.zz5e - (i9 & 7))) & this.zz5d);
                i9 += i4;
                i10++;
                i7++;
            }
            i6 += i3;
        }
        return bArr2;
    }

    public final byte[] getData() {
        return this.zz5k;
    }

    public final Bitmap zzlO() {
        byte[] bArrZzZ = zzZ(this.zzVL, this.zzVN, this.zz5k, this.zz5i);
        int length = bArrZzZ.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = bArrZzZ[i] == 1 ? -1 : ViewCompat.MEASURED_STATE_MASK;
        }
        this.zz5j.copyPixelsFromBuffer(IntBuffer.wrap(iArr));
        return this.zz5j;
    }

    public final int zzlP() {
        return this.zz5i;
    }

    private zzZRS(Bitmap bitmap) {
        if (bitmap == null) {
            throw new IllegalArgumentException("Bitmap cannot be null");
        }
        Bitmap.Config config = bitmap.getConfig();
        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        bitmap = config != config2 ? bitmap.copy(config2, true) : bitmap;
        int width = bitmap.getWidth();
        this.zzVL = width;
        int height = bitmap.getHeight();
        this.zzVN = height;
        this.zz5j = bitmap;
        this.zz5h = 1;
        this.zz5g = 0;
        this.zz5c = 8;
        int i = (width + 7) / 8;
        this.zz5i = i;
        int i2 = (7 / 8) + (i * height);
        this.zz5f = i2;
        this.zz5e = 7;
        this.zz5d = 1;
        this.zz5b = 1;
        this.zz5k = new byte[i2];
    }
}

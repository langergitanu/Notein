package com.aspose.words.internal;

import android.graphics.Bitmap;
import android.graphics.Color;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZRD {

    /* JADX INFO: renamed from: w */
    private int f51319w;
    private byte[] zz4m;
    private boolean zz4n;
    private int zz4o;
    private int zz4p;
    private zzZRO zz4q;
    private Bitmap zz4r;

    private void zzRy(int i) throws Exception {
        this.zz4q.writeByte(66);
        this.zz4q.writeByte(77);
        this.zz4q.writeInt(i);
        this.zz4q.writeInt(0);
        this.zz4q.writeInt(54);
    }

    private void zzZ(int i, int i2, int i3, int i4, int[] iArr) {
        int i5 = i3 * i4;
        int[] iArr2 = new int[i5];
        this.zz4r.getPixels(iArr2, 0, i3, i, i2, i3, i4);
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            int i8 = iArr2[i7];
            iArr[i6] = Color.red(i8);
            int i9 = i6 + 2;
            iArr[i6 + 1] = Color.green(i8);
            i6 += 3;
            iArr[i9] = Color.blue(i8);
        }
    }

    private void zzlJ() throws Exception {
        this.zz4q.writeInt(40);
        this.zz4q.writeInt(this.f51319w);
        if (this.zz4n) {
            this.zz4q.writeInt(-this.zz4p);
        } else {
            this.zz4q.writeInt(this.zz4p);
        }
        this.zz4q.writeShort(1);
        this.zz4q.writeShort(24);
    }

    public final void flush() {
        this.zz4q.flush();
    }

    public final void zzP(Bitmap bitmap) throws Exception {
        if (bitmap == null) {
            throw new IllegalArgumentException("Image cannot be null");
        }
        this.zz4r = bitmap;
        if (bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
            throw new IllegalArgumentException("ARGB_8888 is supported only.");
        }
        this.zz4o = 0;
        zzZQ5 zzzq5 = new zzZQ5(0, 0, this.zz4r.getWidth(), this.zz4r.getHeight());
        zzZRC zzzrc = new zzZRC(this.zz4r);
        this.f51319w = zzzq5.getWidth();
        this.zz4p = zzzq5.getHeight();
        int x = zzzq5.getX() % 1;
        int y = zzzq5.getY() % 1;
        int i = this.f51319w * 3;
        int i2 = zzzrc.zz4i;
        int i3 = zzzrc.zz4h;
        int i4 = zzzrc.zz4g;
        if (i4 <= 0) {
            i4 = 0;
        }
        int i5 = i % 4;
        if (i5 != 0) {
            i5 = 4 - i5;
        }
        int i6 = (i + i5) * this.zz4p;
        this.zz4n = false;
        zzRy(i6 + 54);
        zzlJ();
        this.zz4q.writeInt(this.zz4o);
        this.zz4q.writeInt(i6);
        this.zz4q.writeInt(i2);
        this.zz4q.writeInt(i3);
        this.zz4q.writeInt(i4);
        this.zz4q.writeInt(0);
        int i7 = this.f51319w * 3;
        int[] iArr = new int[i7];
        this.zz4m = new byte[i];
        int i8 = 0;
        while (true) {
            int i9 = this.zz4p;
            if (i8 >= i9) {
                this.zz4q.flush();
                return;
            }
            zzZQ5 zzzq52 = new zzZQ5(x, (!this.zz4n ? (i9 - i8) - 1 : i8) + y, this.f51319w, 1);
            zzZ(zzzq52.getX(), zzzq52.getY(), zzzq52.getWidth(), zzzq52.getHeight(), iArr);
            zzZ(0, i7, iArr, i5);
            i8++;
        }
    }

    public final void zzZK(zzZOP zzzop) throws Exception {
        if (zzzop == null) {
            throw new IllegalStateException("output == null!");
        }
        this.zz4q = new zzZRO(ByteOrder.LITTLE_ENDIAN, zzzop);
    }

    private void zzZ(int i, int i2, int[] iArr, int i3) throws Exception {
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5 += 3) {
            byte[] bArr = this.zz4m;
            bArr[i4] = (byte) iArr[i + 2];
            int i6 = i4 + 2;
            bArr[i4 + 1] = (byte) iArr[i + 1];
            i4 += 3;
            bArr[i6] = (byte) iArr[i];
            i += 3;
        }
        this.zz4q.zzC(this.zz4m, i2);
        int i7 = this.zz4o;
        if (i7 == 0 || i7 == 3) {
            for (int i8 = 0; i8 < i3; i8++) {
                this.zz4q.writeByte(0);
            }
        }
    }
}

package com.aspose.words.internal;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.aspose.words.StyleIdentifier;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZK3 {
    protected int height;
    protected int width;
    protected byte[] zzZNR;
    protected int zzZNS;
    protected byte[] zzZNT;
    protected byte[] zzZNU;
    protected Bitmap zzZNV;
    protected OutputStream zzZNW;
    protected int zzZNY;

    /* JADX INFO: renamed from: x */
    protected int f51313x = 0;

    /* JADX INFO: renamed from: y */
    protected int f51314y = 0;
    protected int transparent = -1;
    protected int zzZNX = -1;
    protected int delay = 0;
    protected boolean started = false;
    protected boolean[] zzZNQ = new boolean[256];
    protected int zzZNP = 7;
    protected int zzZNO = -1;
    protected boolean zzZNN = false;
    protected boolean zzZNM = true;
    protected boolean zzZNL = false;
    protected int zzZNK = 10;

    private void setSize(int i, int i2) {
        this.width = i;
        this.height = i2;
        if (i <= 0) {
            this.width = StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_6;
        }
        if (i2 <= 0) {
            this.height = 240;
        }
        this.zzZNL = true;
    }

    private void writeShort(int i) throws IOException {
        this.zzZNW.write(i & 255);
        this.zzZNW.write((i >> 8) & 255);
    }

    private void writeString(String str) throws IOException {
        for (int i = 0; i < str.length(); i++) {
            this.zzZNW.write((byte) str.charAt(i));
        }
    }

    private static int[] zzL(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        return iArr;
    }

    private int zzQj(int i) {
        byte[] bArr = this.zzZNR;
        if (bArr == null) {
            return -1;
        }
        int i2 = (i >> 16) & 255;
        int i3 = (i >> 8) & 255;
        int i4 = i & 255;
        int length = bArr.length;
        int i5 = 16777216;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7 += 3) {
            byte[] bArr2 = this.zzZNR;
            int i8 = i2 - (bArr2[i7] & 255);
            int i9 = i7 + 2;
            int i10 = i3 - (bArr2[i7 + 1] & 255);
            int i11 = i4 - (bArr2[i9] & 255);
            int i12 = (i11 * i11) + (i10 * i10) + (i8 * i8);
            int i13 = i9 / 3;
            if (this.zzZNQ[i13] && i12 < i5) {
                i5 = i12;
                i6 = i13;
            }
        }
        return i6;
    }

    private void zzen() throws IOException {
        new zzZK1(this.width, this.height, this.zzZNT, this.zzZNS).encode(this.zzZNW);
    }

    private void zzeo() throws IOException {
        OutputStream outputStream = this.zzZNW;
        byte[] bArr = this.zzZNR;
        outputStream.write(bArr, 0, bArr.length);
        int length = 768 - this.zzZNR.length;
        for (int i = 0; i < length; i++) {
            this.zzZNW.write(0);
        }
    }

    private void zzep() throws IOException {
        this.zzZNW.write(33);
        this.zzZNW.write(255);
        this.zzZNW.write(11);
        writeString("NETSCAPE2.0");
        this.zzZNW.write(3);
        this.zzZNW.write(1);
        writeShort(this.zzZNX);
        this.zzZNW.write(0);
    }

    private void zzeq() throws IOException {
        writeShort(this.width);
        writeShort(this.height);
        this.zzZNW.write(this.zzZNP | 240);
        this.zzZNW.write(0);
        this.zzZNW.write(0);
    }

    private void zzer() throws IOException {
        this.zzZNW.write(44);
        writeShort(this.f51313x);
        writeShort(this.f51314y);
        writeShort(this.width);
        writeShort(this.height);
        if (this.zzZNM) {
            this.zzZNW.write(0);
        } else {
            this.zzZNW.write(this.zzZNP | 128);
        }
    }

    private void zzes() throws IOException {
        int i;
        int i2;
        this.zzZNW.write(33);
        this.zzZNW.write(StyleIdentifier.MEDIUM_SHADING_1_ACCENT_6);
        this.zzZNW.write(4);
        if (this.transparent == -1) {
            i = 0;
            i2 = 0;
        } else {
            i = 1;
            i2 = 2;
        }
        int i3 = this.zzZNO;
        if (i3 >= 0) {
            i2 = i3 & 7;
        }
        this.zzZNW.write(i | (i2 << 2));
        writeShort(this.delay);
        this.zzZNW.write(this.zzZNY);
        this.zzZNW.write(0);
    }

    private void zzet() {
        int width = this.zzZNV.getWidth();
        int height = this.zzZNV.getHeight();
        int i = this.width;
        if (width != i || height != this.height) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, this.height, Bitmap.Config.RGB_565);
            new Canvas(bitmapCreateBitmap).drawBitmap(this.zzZNV, 0.0f, 0.0f, new Paint());
            this.zzZNV = bitmapCreateBitmap;
        }
        int[] iArrZzL = zzL(this.zzZNV);
        this.zzZNU = new byte[iArrZzL.length * 3];
        for (int i2 = 0; i2 < iArrZzL.length; i2++) {
            int i3 = iArrZzL[i2];
            int i4 = i2 * 3;
            byte[] bArr = this.zzZNU;
            bArr[i4] = (byte) (i3 & 255);
            bArr[i4 + 1] = (byte) ((i3 >> 8) & 255);
            bArr[i4 + 2] = (byte) ((i3 >> 16) & 255);
        }
    }

    private void zzeu() {
        byte[] bArr = this.zzZNU;
        int length = bArr.length;
        int i = length / 3;
        this.zzZNT = new byte[i];
        zzZK0 zzzk0 = new zzZK0(bArr, length, this.zzZNK);
        this.zzZNR = zzzk0.zze7();
        int i2 = 0;
        while (true) {
            byte[] bArr2 = this.zzZNR;
            if (i2 >= bArr2.length) {
                break;
            }
            byte b = bArr2[i2];
            int i3 = i2 + 2;
            bArr2[i2] = bArr2[i3];
            bArr2[i3] = b;
            this.zzZNQ[i2 / 3] = false;
            i2 += 3;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            byte[] bArr3 = this.zzZNU;
            int i6 = bArr3[i4] & 255;
            int i7 = i4 + 2;
            int i8 = bArr3[i4 + 1] & 255;
            i4 += 3;
            int iZzt = zzzk0.zzt(i6, i8, bArr3[i7] & 255);
            this.zzZNQ[iZzt] = true;
            this.zzZNT[i5] = (byte) iZzt;
        }
        this.zzZNU = null;
        this.zzZNS = 8;
        this.zzZNP = 7;
        int i9 = this.transparent;
        if (i9 != -1) {
            this.zzZNY = zzQj(i9);
        }
    }

    public final boolean zzM(Bitmap bitmap) {
        if (bitmap != null && this.started) {
            try {
                if (!this.zzZNL) {
                    setSize(bitmap.getWidth(), bitmap.getHeight());
                }
                this.zzZNV = bitmap;
                zzet();
                zzeu();
                if (this.zzZNM) {
                    zzeq();
                    zzeo();
                    if (this.zzZNX >= 0) {
                        zzep();
                    }
                }
                zzes();
                zzer();
                if (!this.zzZNM) {
                    zzeo();
                }
                zzen();
                this.zzZNM = false;
                return true;
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public final boolean zzX(OutputStream outputStream) {
        boolean z = false;
        this.zzZNN = false;
        this.zzZNW = outputStream;
        try {
            writeString("GIF89a");
            z = true;
        } catch (IOException unused) {
        }
        this.started = z;
        return z;
    }

    public final boolean zzev() {
        boolean z;
        if (!this.started) {
            return false;
        }
        this.started = false;
        try {
            this.zzZNW.write(59);
            this.zzZNW.flush();
            if (this.zzZNN) {
                this.zzZNW.close();
            }
            z = true;
        } catch (IOException unused) {
            z = false;
        }
        this.zzZNY = 0;
        this.zzZNW = null;
        this.zzZNV = null;
        this.zzZNU = null;
        this.zzZNT = null;
        this.zzZNR = null;
        this.zzZNN = false;
        this.zzZNM = true;
        return z;
    }
}

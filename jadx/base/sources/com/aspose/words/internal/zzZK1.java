package com.aspose.words.internal;

import androidx.core.app.FrameMetricsAggregator;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes5.dex */
final class zzZK1 {
    int zzZMT;
    int zzZMX;
    int zzZMY;
    int zzZMZ;
    int zzZN6;
    int zzZN8;
    private int zzZN9;
    private int zzZNa;
    private int zzZNb;
    private byte[] zzZNc;
    private int zzZNd;
    private int zzZNe;
    int zzZN7 = 12;
    int zzZN5 = 4096;
    int[] zzZN4 = new int[5003];
    int[] zzZN3 = new int[5003];
    int zzZN2 = 5003;
    int zzZN1 = 0;
    boolean zzZN0 = false;
    int zzZMW = 0;
    int zzZMV = 0;
    int[] zzZMU = {0, 1, 3, 7, 15, 31, 63, 127, 255, FrameMetricsAggregator.EVERY_DURATION, 1023, 2047, 4095, 8191, 16383, 32767, 65535};
    byte[] zzZMS = new byte[256];

    public zzZK1(int i, int i2, byte[] bArr, int i3) {
        this.zzZNe = i;
        this.zzZNd = i2;
        this.zzZNc = bArr;
        this.zzZNb = Math.max(2, i3);
    }

    private void zzQg(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            this.zzZN4[i2] = -1;
        }
    }

    private void zzV(OutputStream outputStream) throws IOException {
        int i = this.zzZMT;
        if (i > 0) {
            outputStream.write(i);
            outputStream.write(this.zzZMS, 0, this.zzZMT);
            this.zzZMT = 0;
        }
    }

    private void zzW(OutputStream outputStream) throws IOException {
        zzQg(this.zzZN2);
        int i = this.zzZMY;
        this.zzZN1 = i + 2;
        this.zzZN0 = true;
        zzY(i, outputStream);
    }

    private void zzY(int i, OutputStream outputStream) throws IOException {
        int i2 = this.zzZMW;
        int[] iArr = this.zzZMU;
        int i3 = this.zzZMV;
        int i4 = i2 & iArr[i3];
        this.zzZMW = i4;
        if (i3 > 0) {
            this.zzZMW = i4 | (i << i3);
        } else {
            this.zzZMW = i;
        }
        this.zzZMV = i3 + this.zzZN8;
        while (this.zzZMV >= 8) {
            zzZ((byte) (this.zzZMW & 255), outputStream);
            this.zzZMW >>= 8;
            this.zzZMV -= 8;
        }
        if (this.zzZN1 > this.zzZN6 || this.zzZN0) {
            if (this.zzZN0) {
                int i5 = this.zzZMZ;
                this.zzZN8 = i5;
                this.zzZN6 = (1 << i5) - 1;
                this.zzZN0 = false;
            } else {
                int i6 = this.zzZN8 + 1;
                this.zzZN8 = i6;
                if (i6 == this.zzZN7) {
                    this.zzZN6 = this.zzZN5;
                } else {
                    this.zzZN6 = (1 << i6) - 1;
                }
            }
        }
        if (i == this.zzZMX) {
            while (this.zzZMV > 0) {
                zzZ((byte) (this.zzZMW & 255), outputStream);
                this.zzZMW >>= 8;
                this.zzZMV -= 8;
            }
            zzV(outputStream);
        }
    }

    private void zzZ(byte b, OutputStream outputStream) throws IOException {
        byte[] bArr = this.zzZMS;
        int i = this.zzZMT;
        int i2 = i + 1;
        this.zzZMT = i2;
        bArr[i] = b;
        if (i2 >= 254) {
            zzV(outputStream);
        }
    }

    private int zzeb() {
        int i = this.zzZNa;
        if (i == 0) {
            return -1;
        }
        this.zzZNa = i - 1;
        byte[] bArr = this.zzZNc;
        int i2 = this.zzZN9;
        this.zzZN9 = i2 + 1;
        return bArr[i2] & 255;
    }

    public final void encode(OutputStream outputStream) throws IOException {
        outputStream.write(this.zzZNb);
        this.zzZNa = this.zzZNe * this.zzZNd;
        this.zzZN9 = 0;
        zzZ(this.zzZNb + 1, outputStream);
        outputStream.write(0);
    }

    private void zzZ(int i, OutputStream outputStream) throws IOException {
        int i2;
        this.zzZMZ = i;
        int i3 = 0;
        this.zzZN0 = false;
        this.zzZN8 = i;
        this.zzZN6 = (1 << i) - 1;
        int i4 = 1 << (i - 1);
        this.zzZMY = i4;
        this.zzZMX = i4 + 1;
        this.zzZN1 = i4 + 2;
        this.zzZMT = 0;
        int iZzeb = zzeb();
        for (int i5 = this.zzZN2; i5 < 65536; i5 *= 2) {
            i3++;
        }
        int i6 = 8 - i3;
        int i7 = this.zzZN2;
        zzQg(i7);
        zzY(this.zzZMY, outputStream);
        while (true) {
            int iZzeb2 = zzeb();
            if (iZzeb2 != -1) {
                int i8 = (iZzeb2 << this.zzZN7) + iZzeb;
                int i9 = (iZzeb2 << i6) ^ iZzeb;
                int i10 = this.zzZN4[i9];
                if (i10 == i8) {
                    iZzeb = this.zzZN3[i9];
                } else {
                    if (i10 >= 0) {
                        int i11 = i7 - i9;
                        if (i9 == 0) {
                            i11 = 1;
                        }
                        do {
                            i9 -= i11;
                            if (i9 < 0) {
                                i9 += i7;
                            }
                            i2 = this.zzZN4[i9];
                            if (i2 == i8) {
                                iZzeb = this.zzZN3[i9];
                                break;
                            }
                        } while (i2 >= 0);
                    }
                    zzY(iZzeb, outputStream);
                    int i12 = this.zzZN1;
                    if (i12 < this.zzZN5) {
                        int[] iArr = this.zzZN3;
                        this.zzZN1 = i12 + 1;
                        iArr[i9] = i12;
                        this.zzZN4[i9] = i8;
                    } else {
                        zzW(outputStream);
                    }
                    iZzeb = iZzeb2;
                }
            } else {
                zzY(iZzeb, outputStream);
                zzY(this.zzZMX, outputStream);
                return;
            }
        }
    }
}

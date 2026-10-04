package com.aspose.words.internal;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZF4 extends Writer implements zzZFI {
    int zzWM0 = 0;
    int zzWM1;
    final int zzWM2;
    byte[] zzWM3;
    final OutputStream zzWM4;
    final boolean zzWM5;
    final zzZHB zzWM6;

    public zzZF4(zzZHB zzzhb, OutputStream outputStream, boolean z) {
        this.zzWM6 = zzzhb;
        this.zzWM5 = z;
        this.zzWM4 = outputStream;
        this.zzWM3 = zzzhb == null ? new byte[4000] : zzzhb.zzXP3();
        this.zzWM2 = r2.length - 4;
        this.zzWM1 = 0;
    }

    private final void zzP3(boolean z) throws IOException {
        byte[] bArr = this.zzWM3;
        if (bArr != null) {
            this.zzWM3 = null;
            int i = this.zzWM1;
            if (i > 0) {
                this.zzWM4.write(bArr, 0, i);
                this.zzWM1 = 0;
            }
            zzZHB zzzhb = this.zzWM6;
            if (zzzhb != null) {
                zzzhb.zzXt(bArr);
            }
        }
        if (z) {
            this.zzWM4.close();
        }
        int i2 = this.zzWM0;
        if (i2 > 0) {
            this.zzWM0 = 0;
            zzgG(i2);
        }
    }

    private static void zzgG(int i) throws IOException {
        if (i > 1114111) {
            throw new IOException("Illegal character point (0x" + Integer.toHexString(i) + ") to output; max is 0x10FFFF as per RFC 3629");
        }
        if (i < 55296) {
            throw new IOException("Illegal character point (0x" + Integer.toHexString(i) + ") to output");
        }
        if (i <= 56319) {
            throw new IOException("Unmatched first part of surrogate pair (0x" + Integer.toHexString(i) + ")");
        }
        throw new IOException("Unmatched second part of surrogate pair (0x" + Integer.toHexString(i) + ")");
    }

    private final int zzgH(int i) throws IOException {
        int i2 = this.zzWM0;
        this.zzWM0 = 0;
        if (i >= 56320 && i <= 57343) {
            return (i - 56320) + ((i2 - 55296) << 10) + 65536;
        }
        throw new IOException("Broken surrogate pair: first char 0x" + Integer.toHexString(i2) + ", second 0x" + Integer.toHexString(i) + "; illegal combination");
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        zzP3(this.zzWM5);
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() throws IOException {
        byte[] bArr;
        int i = this.zzWM1;
        if (i > 0 && (bArr = this.zzWM3) != null) {
            this.zzWM4.write(bArr, 0, i);
            this.zzWM1 = 0;
        }
        this.zzWM4.flush();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr) throws IOException {
        write(cArr, 0, cArr.length);
    }

    @Override // com.aspose.words.internal.zzZFI
    public final void zzXNA() throws IOException {
        zzP3(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x005f A[SYNTHETIC] */
    @Override // java.io.Writer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void write(char[] cArr, int i, int i2) throws IOException {
        if (i2 < 2) {
            if (i2 == 1) {
                write(cArr[i]);
                return;
            }
            return;
        }
        if (this.zzWM0 > 0) {
            i2--;
            write(zzgH(cArr[i]));
            i++;
        }
        int i3 = this.zzWM1;
        byte[] bArr = this.zzWM3;
        int i4 = this.zzWM2;
        int i5 = i2 + i;
        while (i < i5) {
            if (i3 >= i4) {
                this.zzWM4.write(bArr, 0, i3);
                i3 = 0;
            }
            int i6 = i + 1;
            char c = cArr[i];
            if (c < 128) {
                int i7 = i3 + 1;
                bArr[i3] = (byte) c;
                int i8 = i5 - i6;
                int i9 = i4 - i7;
                if (i8 > i9) {
                    i8 = i9;
                }
                int i10 = i8 + i6;
                i3 = i7;
                while (i6 < i10) {
                    int i11 = i6 + 1;
                    char c2 = cArr[i6];
                    if (c2 < 128) {
                        bArr[i3] = (byte) c2;
                        i6 = i11;
                        i3++;
                    } else {
                        c = c2;
                        i6 = i11;
                        if (c < 2048) {
                            if (c >= 55296 && c <= 57343) {
                                if (c > 56319) {
                                    this.zzWM1 = i3;
                                    zzgG(c);
                                }
                                this.zzWM0 = c;
                                if (i6 >= i5) {
                                    break;
                                }
                                i = i6 + 1;
                                int iZzgH = zzgH(cArr[i6]);
                                if (iZzgH > 1114111) {
                                    this.zzWM1 = i3;
                                    zzgG(iZzgH);
                                }
                                bArr[i3] = (byte) ((iZzgH >> 18) | 240);
                                bArr[i3 + 1] = (byte) (((iZzgH >> 12) & 63) | 128);
                                int i12 = i3 + 3;
                                bArr[i3 + 2] = (byte) (((iZzgH >> 6) & 63) | 128);
                                i3 += 4;
                                bArr[i12] = (byte) ((iZzgH & 63) | 128);
                            } else {
                                bArr[i3] = (byte) ((c >> '\f') | 224);
                                int i13 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((c >> 6) & 63) | 128);
                                i3 += 3;
                                bArr[i13] = (byte) ((c & '?') | 128);
                            }
                        } else {
                            int i14 = i3 + 1;
                            bArr[i3] = (byte) ((c >> 6) | 192);
                            i3 += 2;
                            bArr[i14] = (byte) ((c & '?') | 128);
                        }
                        i = i6;
                    }
                }
                i = i6;
            } else {
                if (c < 2048) {
                }
                i = i6;
            }
        }
        this.zzWM1 = i3;
    }

    @Override // java.io.Writer
    public final void write(int i) throws IOException {
        int i2;
        if (this.zzWM0 > 0) {
            i = zzgH(i);
        } else if (i >= 55296 && i <= 57343) {
            if (i > 56319) {
                zzgG(i);
            }
            this.zzWM0 = i;
            return;
        }
        int i3 = this.zzWM1;
        if (i3 >= this.zzWM2) {
            this.zzWM4.write(this.zzWM3, 0, i3);
            this.zzWM1 = 0;
        }
        if (i < 128) {
            byte[] bArr = this.zzWM3;
            int i4 = this.zzWM1;
            this.zzWM1 = i4 + 1;
            bArr[i4] = (byte) i;
            return;
        }
        int i5 = this.zzWM1;
        if (i < 2048) {
            byte[] bArr2 = this.zzWM3;
            int i6 = i5 + 1;
            bArr2[i5] = (byte) ((i >> 6) | 192);
            i2 = i5 + 2;
            bArr2[i6] = (byte) ((i & 63) | 128);
        } else if (i <= 65535) {
            byte[] bArr3 = this.zzWM3;
            bArr3[i5] = (byte) ((i >> 12) | 224);
            int i7 = i5 + 2;
            bArr3[i5 + 1] = (byte) (((i >> 6) & 63) | 128);
            i2 = i5 + 3;
            bArr3[i7] = (byte) ((i & 63) | 128);
        } else {
            if (i > 1114111) {
                zzgG(i);
            }
            byte[] bArr4 = this.zzWM3;
            bArr4[i5] = (byte) ((i >> 18) | 240);
            bArr4[i5 + 1] = (byte) (((i >> 12) & 63) | 128);
            int i8 = i5 + 3;
            bArr4[i5 + 2] = (byte) (((i >> 6) & 63) | 128);
            i2 = i5 + 4;
            bArr4[i8] = (byte) ((i & 63) | 128);
        }
        this.zzWM1 = i2;
    }

    @Override // java.io.Writer
    public final void write(String str) throws IOException {
        write(str, 0, str.length());
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0067 A[SYNTHETIC] */
    @Override // java.io.Writer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void write(String str, int i, int i2) throws IOException {
        if (i2 < 2) {
            if (i2 == 1) {
                write(str.charAt(i));
                return;
            }
            return;
        }
        if (this.zzWM0 > 0) {
            i2--;
            write(zzgH(str.charAt(i)));
            i++;
        }
        int i3 = this.zzWM1;
        byte[] bArr = this.zzWM3;
        int i4 = this.zzWM2;
        int i5 = i2 + i;
        while (i < i5) {
            if (i3 >= i4) {
                this.zzWM4.write(bArr, 0, i3);
                i3 = 0;
            }
            int i6 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt < 128) {
                int i7 = i3 + 1;
                bArr[i3] = (byte) cCharAt;
                int i8 = i5 - i6;
                int i9 = i4 - i7;
                if (i8 > i9) {
                    i8 = i9;
                }
                int i10 = i8 + i6;
                i3 = i7;
                while (i6 < i10) {
                    int i11 = i6 + 1;
                    char cCharAt2 = str.charAt(i6);
                    if (cCharAt2 < 128) {
                        bArr[i3] = (byte) cCharAt2;
                        i6 = i11;
                        i3++;
                    } else {
                        cCharAt = cCharAt2;
                        i6 = i11;
                        if (cCharAt < 2048) {
                            if (cCharAt >= 55296 && cCharAt <= 57343) {
                                if (cCharAt > 56319) {
                                    this.zzWM1 = i3;
                                    zzgG(cCharAt);
                                }
                                this.zzWM0 = cCharAt;
                                if (i6 >= i5) {
                                    break;
                                }
                                i = i6 + 1;
                                int iZzgH = zzgH(str.charAt(i6));
                                if (iZzgH > 1114111) {
                                    this.zzWM1 = i3;
                                    zzgG(iZzgH);
                                }
                                bArr[i3] = (byte) ((iZzgH >> 18) | 240);
                                bArr[i3 + 1] = (byte) (((iZzgH >> 12) & 63) | 128);
                                int i12 = i3 + 3;
                                bArr[i3 + 2] = (byte) (((iZzgH >> 6) & 63) | 128);
                                i3 += 4;
                                bArr[i12] = (byte) ((iZzgH & 63) | 128);
                            } else {
                                bArr[i3] = (byte) ((cCharAt >> '\f') | 224);
                                int i13 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >> 6) & 63) | 128);
                                i3 += 3;
                                bArr[i13] = (byte) ((cCharAt & '?') | 128);
                            }
                        } else {
                            int i14 = i3 + 1;
                            bArr[i3] = (byte) ((cCharAt >> 6) | 192);
                            i3 += 2;
                            bArr[i14] = (byte) ((cCharAt & '?') | 128);
                        }
                        i = i6;
                    }
                }
                i = i6;
            } else {
                if (cCharAt < 2048) {
                }
                i = i6;
            }
        }
        this.zzWM1 = i3;
    }
}

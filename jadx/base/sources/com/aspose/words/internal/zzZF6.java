package com.aspose.words.internal;

import Oooo0oO.C21023OooO0Oo;
import java.io.ByteArrayOutputStream;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZF6 extends zzZFN {
    int zz8r;
    char zzWM7;
    final boolean zzWMe;
    boolean zzWQ6;
    int zzWU6;

    public zzZF6(zzZHC zzzhc, InputStream inputStream, byte[] bArr, int i, int i2, boolean z, boolean z2) {
        super(zzzhc, inputStream, bArr, i, i2, z);
        this.zzWM7 = (char) 0;
        this.zzWU6 = 0;
        this.zz8r = 0;
        this.zzWMe = z2;
    }

    private void zzR(int i, int i2, String str) throws IOException {
        int i3 = (this.zz8r + this.zzWMI) - 1;
        throw new CharConversionException("Invalid UTF-32 character 0x" + Integer.toHexString(i) + str + " at char #" + (this.zzWU6 + i2) + ", byte #" + i3 + ")");
    }

    private boolean zzgI(int i) throws IOException {
        this.zz8r = (this.zzWMH - i) + this.zz8r;
        if (i <= 0) {
            int iZzXNE = zzXNE();
            if (iZzXNE <= 0) {
                if (iZzXNE < 0) {
                    zzXND();
                    return false;
                }
                zzZFN.zzXNC();
            }
        } else if (this.zzWMI > 0 && zzXNF()) {
            for (int i2 = 0; i2 < i; i2++) {
                byte[] bArr = this.zzWMJ;
                bArr[i2] = bArr[this.zzWMI + i2];
            }
            this.zzWMI = 0;
            this.zzWMH = i;
        }
        while (true) {
            int i3 = this.zzWMH;
            if (i3 >= 4) {
                return true;
            }
            int iZzgS = zzgS(i3);
            if (iZzgS <= 0) {
                if (iZzgS < 0) {
                    zzXND();
                    zzgJ(this.zzWMH);
                }
                zzZFN.zzXNC();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [byte[], java.lang.StringBuilder] */
    private void zzgJ(int i) throws IOException {
        int i2 = this.zz8r + i;
        int i3 = this.zzWU6;
        throw new CharConversionException(C21023OooO0Oo.OooO0OO(")", i2, ByteArrayOutputStream.toByteArray()));
    }

    @Override // com.aspose.words.internal.zzZFN, java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final /* bridge */ /* synthetic */ void close() throws IOException {
        super.close();
    }

    @Override // com.aspose.words.internal.zzZFN, java.io.Reader
    public final /* bridge */ /* synthetic */ int read() throws IOException {
        return super.read();
    }

    @Override // com.aspose.words.internal.zzZFN
    public final void zzXNI() {
        this.zzWQ6 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x010b A[LOOP:0: B:22:0x0032->B:63:0x010b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0109 A[SYNTHETIC] */
    @Override // java.io.Reader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int read(char[] cArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        int i5;
        if (i < 0 || i + i2 > cArr.length) {
            zzZFN.zzT(cArr, i, i2);
        }
        if (this.zzWMJ == null) {
            return -1;
        }
        if (i2 <= 0) {
            return 0;
        }
        int i6 = i2 + i;
        char c = this.zzWM7;
        if (c != 0) {
            i3 = i + 1;
            cArr[i] = c;
            this.zzWM7 = (char) 0;
        } else {
            int i7 = this.zzWMH - this.zzWMI;
            if (i7 < 4 && !zzgI(i7)) {
                return -1;
            }
            i3 = i;
        }
        byte[] bArr = this.zzWMJ;
        while (true) {
            if (i3 >= i6) {
                break;
            }
            int i8 = this.zzWMI;
            if (this.zzWMe) {
                i4 = (bArr[i8] << 24) | ((bArr[i8 + 1] & 255) << 16) | ((bArr[i8 + 2] & 255) << 8);
                i5 = bArr[i8 + 3] & 255;
            } else {
                i4 = (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16);
                i5 = bArr[i8 + 3] << 24;
            }
            int i9 = i4 | i5;
            this.zzWMI = i8 + 4;
            if (i9 < 127) {
                int i10 = i3 + 1;
                cArr[i3] = (char) i9;
                if (this.zzWMI >= this.zzWMH) {
                    i3 = i10;
                    break;
                }
                i3 = i10;
            } else if (i9 <= 159) {
                if (this.zzWQ6) {
                    if (i9 != 133) {
                        zzR(i9, i3 - i, "(can only be included via entity in xml 1.1)");
                    }
                    i9 = 10;
                }
                int i102 = i3 + 1;
                cArr[i3] = (char) i9;
                if (this.zzWMI >= this.zzWMH) {
                }
            } else {
                if (i9 >= 55296) {
                    if (i9 > 1114111) {
                        zzR(i9, i3 - i, "(above " + Integer.toHexString(1114111) + ") ");
                    }
                    if (i9 > 65535) {
                        int i11 = i9 - 65536;
                        int i12 = i3 + 1;
                        cArr[i3] = (char) ((i11 >> 10) + 55296);
                        i9 = (i11 & 1023) | 56320;
                        if (i12 >= i6) {
                            this.zzWM7 = (char) i9;
                            i3 = i12;
                            break;
                        }
                        i3 = i12;
                    } else if (i9 < 57344) {
                        zzR(i9, i3 - i, "(a surrogate char) ");
                    } else if (i9 >= 65534) {
                        zzR(i9, i3 - i, "");
                    }
                } else if (i9 == 8232 && this.zzWQ6) {
                    i9 = 10;
                }
                int i1022 = i3 + 1;
                cArr[i3] = (char) i9;
                if (this.zzWMI >= this.zzWMH) {
                }
            }
        }
        int i13 = i3 - i;
        this.zzWU6 += i13;
        return i13;
    }
}

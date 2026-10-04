package com.aspose.words.internal;

import Oooo0oO.C21023OooO0Oo;
import java.io.ByteArrayOutputStream;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZF5 extends zzZFN {
    int zz8r;
    char zzWM7;
    boolean zzWQ6;
    int zzWU6;

    public zzZF5(zzZHC zzzhc, InputStream inputStream, byte[] bArr, int i, int i2, boolean z) {
        super(zzzhc, inputStream, bArr, i, i2, z);
        this.zzWQ6 = false;
        this.zzWM7 = (char) 0;
        this.zzWU6 = 0;
        this.zz8r = 0;
    }

    private void zzR(int i, int i2, String str) throws IOException {
        int i3 = (this.zz8r + this.zzWMI) - 1;
        throw new CharConversionException("Invalid UTF-8 character 0x" + Integer.toHexString(i) + str + " at char #" + (this.zzWU6 + i2) + ", byte #" + i3 + ")");
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [byte[], java.lang.StringBuilder] */
    private void zzUO(int i, int i2) throws IOException {
        int i3 = this.zz8r + i;
        int i4 = this.zzWU6;
        ?? byteArray = ByteArrayOutputStream.toByteArray();
        byteArray.append(i4);
        byteArray.append(", byte #");
        byteArray.append(i3);
        byteArray.append(")");
        throw new CharConversionException(byteArray.toString());
    }

    private void zzUP(int i, int i2) throws IOException {
        int i3 = (this.zz8r + this.zzWMI) - 1;
        int i4 = this.zzWU6 + i2;
        StringBuilder sb = new StringBuilder("Invalid UTF-8 middle byte 0x");
        sb.append(Integer.toHexString(i));
        sb.append(" (at char #");
        sb.append(i4);
        sb.append(", byte #");
        throw new CharConversionException(C21023OooO0Oo.OooO0OO(")", i3, sb));
    }

    private void zzUQ(int i, int i2) throws IOException {
        int i3 = (this.zz8r + this.zzWMI) - 1;
        int i4 = this.zzWU6 + i2 + 1;
        StringBuilder sb = new StringBuilder("Invalid UTF-8 start byte 0x");
        sb.append(Integer.toHexString(i));
        sb.append(" (at char #");
        sb.append(i4);
        sb.append(", byte #");
        throw new CharConversionException(C21023OooO0Oo.OooO0OO(")", i3, sb));
    }

    private boolean zzgI(int i) throws IOException {
        int i2;
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
            for (int i3 = 0; i3 < i; i3++) {
                byte[] bArr = this.zzWMJ;
                bArr[i3] = bArr[this.zzWMI + i3];
            }
            this.zzWMI = 0;
            this.zzWMH = i;
        }
        byte b = this.zzWMJ[this.zzWMI];
        if (b >= 0) {
            return true;
        }
        if ((b & 224) == 192) {
            i2 = 2;
        } else if ((b & 240) == 224) {
            i2 = 3;
        } else if ((b & 248) == 240) {
            i2 = 4;
        } else {
            zzUQ(b & 255, 0);
            i2 = 1;
        }
        while (true) {
            int i4 = this.zzWMI + i2;
            int i5 = this.zzWMH;
            if (i4 <= i5) {
                return true;
            }
            int iZzgS = zzgS(i5);
            if (iZzgS <= 0) {
                if (iZzgS < 0) {
                    zzXND();
                    zzUO(this.zzWMH, i2);
                }
                zzZFN.zzXNC();
            }
        }
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d1  */
    @Override // java.io.Reader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int read(char[] cArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        if (i < 0 || i + i2 > cArr.length) {
            zzZFN.zzT(cArr, i, i2);
        }
        byte[] bArr = this.zzWMJ;
        if (bArr == null) {
            return -1;
        }
        if (i2 <= 0) {
            return 0;
        }
        int i5 = i2 + i;
        char c = this.zzWM7;
        if (c != 0) {
            i3 = i + 1;
            cArr[i] = c;
            this.zzWM7 = (char) 0;
        } else {
            int i6 = this.zzWMH;
            int i7 = this.zzWMI;
            int i8 = i6 - i7;
            if (i8 < 4 && ((i8 <= 0 || bArr[i7] < 0) && !zzgI(i8))) {
                return -1;
            }
            i3 = i;
        }
        byte[] bArr2 = this.zzWMJ;
        int i9 = this.zzWMI;
        int i10 = this.zzWMH;
        loop0: while (true) {
            if (i3 >= i5) {
                break;
            }
            int i11 = i9 + 1;
            int i12 = bArr2[i9];
            if (i12 >= 0) {
                if (i12 == 127 && this.zzWQ6) {
                    zzZFN.zzZT(i12, (this.zz8r + i11) - 1, (i3 - i) + this.zzWU6);
                }
                int i13 = i3 + 1;
                cArr[i3] = (char) i12;
                int i14 = i5 - i13;
                int i15 = i10 - i11;
                if (i15 < i14) {
                    i14 = i15;
                }
                int i16 = i14 + i11;
                while (true) {
                    i9 = i11;
                    if (i9 >= i16) {
                        i3 = i13;
                        break loop0;
                    }
                    i11 = i9 + 1;
                    i12 = bArr2[i9] & 255;
                    if (i12 < 127) {
                        cArr[i13] = (char) i12;
                        i13++;
                    } else if (i12 == 127) {
                        if (this.zzWQ6) {
                            zzZFN.zzZT(i12, (this.zz8r + i11) - 1, (i13 - i) + this.zzWU6);
                        }
                        int i17 = i13 + 1;
                        cArr[i13] = (char) i12;
                        i9 = i11;
                        if (i11 >= i16) {
                            i3 = i17;
                            break;
                        }
                        i3 = i17;
                    } else {
                        i3 = i13;
                    }
                }
            }
            if (((i12 == true ? 1 : 0) & 224) == 192) {
                i12 = (i12 == true ? 1 : 0) & 31;
            } else {
                if (((i12 == true ? 1 : 0) & 240) == 224) {
                    i12 = (i12 == true ? 1 : 0) & 15;
                    i4 = 2;
                } else if (((i12 == true ? 1 : 0) & 248) == 240) {
                    i12 = (i12 == true ? 1 : 0) & 15;
                    i4 = 3;
                } else {
                    zzUQ((i12 == true ? 1 : 0) & 255, i3 - i);
                }
                if (i10 - i11 >= i4) {
                    i9 = i11 - 1;
                    break;
                }
                int i18 = i11 + 1;
                byte b = bArr2[i11];
                if ((b & 192) != 128) {
                    zzUP(b & 255, i3 - i);
                }
                int i19 = (i12 << 6) | (b & 63);
                if (i4 > 1) {
                    int i20 = i11 + 2;
                    byte b2 = bArr2[i18];
                    if ((b2 & 192) != 128) {
                        zzUP(b2 & 255, i3 - i);
                    }
                    i19 = (i19 << 6) | (b2 & 63);
                    if (i4 > 2) {
                        i9 = i11 + 3;
                        byte b3 = bArr2[i20];
                        if ((b3 & 192) != 128) {
                            zzUP(b3 & 255, i3 - i);
                        }
                        int i21 = (i19 << 6) | (b3 & 63);
                        if (i21 > 1114111) {
                            zzR(i21, i3 - i, "(above " + Integer.toHexString(1114111) + ") ");
                        }
                        int i22 = i21 - 65536;
                        int i23 = i3 + 1;
                        cArr[i3] = (char) ((i22 >> 10) + 55296);
                        i19 = 56320 | (i22 & 1023);
                        if (i23 >= i5) {
                            this.zzWM7 = (char) i19;
                            i3 = i23;
                            break;
                        }
                        i3 = i23;
                    } else {
                        if (i19 >= 55296) {
                            if (i19 < 57344) {
                                zzR(i19, i3 - i, "(a surrogate character) ");
                            } else if (i19 >= 65534) {
                                zzR(i19, i3 - i, "");
                            }
                        } else if (this.zzWQ6 && i19 == 8232) {
                            if (i3 > i) {
                                int i24 = i3 - 1;
                                if (cArr[i24] == '\r') {
                                    cArr[i24] = '\n';
                                }
                            }
                            i19 = 10;
                        }
                        i9 = i20;
                    }
                } else {
                    if (this.zzWQ6 && i19 <= 159) {
                        if (i19 == 133) {
                            i19 = 10;
                        } else if (i19 >= 127) {
                            zzZFN.zzZT(i19, (this.zz8r + i18) - 1, (i3 - i) + this.zzWU6);
                        }
                    }
                    i9 = i18;
                }
                cArr[i3] = (char) i19;
                i3++;
                if (i9 >= i10) {
                    break;
                }
            }
            i4 = 1;
            if (i10 - i11 >= i4) {
            }
        }
        this.zzWMI = i9;
        int i25 = i3 - i;
        this.zzWU6 += i25;
        return i25;
    }
}

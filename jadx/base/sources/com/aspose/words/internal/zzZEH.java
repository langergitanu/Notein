package com.aspose.words.internal;

import com.aspose.slides.PatternStyle;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZEH extends zzZEI {
    public zzZEH(OutputStream outputStream, zzZHB zzzhb, boolean z) throws IOException {
        super(outputStream, zzzhb, "ISO-8859-1", z);
    }

    private void zzgj(int i) throws IOException {
        flush();
        throw new IOException("Invalid XML character (0x" + Integer.toHexString(i) + "); can only be output using character entity when using ISO-8859-1 encoding");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.words.internal.zzZEI
    public final void zzQ(char[] cArr, int i, int i2) throws IOException {
        while (i2 > 0) {
            int length = this.zzWJU.length - this.zzWK0;
            if (length <= 0) {
                zzXLZ();
                length = this.zzWJU.length;
            }
            if (this.zzWM0 != 0) {
                zzgm(zzgl(cArr[i]));
                i2--;
                i++;
            } else {
                if (length > i2) {
                    length = i2;
                }
                int i3 = i + length;
                while (i < i3) {
                    int i4 = i + 1;
                    char cZzgl = cArr[i];
                    if (cZzgl < 32) {
                        if (cZzgl == 10 || cZzgl == 9) {
                            byte[] bArr = this.zzWJU;
                            int i5 = this.zzWK0;
                            this.zzWK0 = i5 + 1;
                            bArr[i5] = (byte) cZzgl;
                        } else if (cZzgl == 13) {
                            if (this.zzWJE) {
                                zzgm(cZzgl);
                                length -= i3 - i4;
                            } else {
                                byte[] bArr2 = this.zzWJU;
                                int i6 = this.zzWK0;
                                this.zzWK0 = i6 + 1;
                                bArr2[i6] = (byte) cZzgl;
                            }
                        } else if ((!this.zzWQ6 || cZzgl == 0) && this.zzWJH) {
                            char cZzgi = zzgi(cZzgl);
                            byte[] bArr3 = this.zzWJU;
                            int i7 = this.zzWK0;
                            this.zzWK0 = i7 + 1;
                            bArr3[i7] = (byte) cZzgi;
                        } else {
                            zzgm(cZzgl);
                            length -= i3 - i4;
                        }
                        i = i4;
                    } else if (cZzgl < 127) {
                        if (cZzgl == 60 || cZzgl == 38 || (cZzgl == 62 && (i4 <= 1 || cArr[i - 1] == ']'))) {
                            zzgm(cZzgl);
                            length -= i3 - i4;
                        } else {
                            byte[] bArr4 = this.zzWJU;
                            int i8 = this.zzWK0;
                            this.zzWK0 = i8 + 1;
                            bArr4[i8] = (byte) cZzgl;
                            i = i4;
                        }
                    } else if (cZzgl > 159 && cZzgl <= 255) {
                        byte[] bArr5 = this.zzWJU;
                        int i9 = this.zzWK0;
                        this.zzWK0 = i9 + 1;
                        bArr5[i9] = (byte) cZzgl;
                        i = i4;
                    } else if (cZzgl < 55296 || cZzgl > 57343) {
                        zzgm(cZzgl);
                        length -= i3 - i4;
                    } else {
                        this.zzWM0 = cZzgl;
                        if (i4 != i3) {
                            cZzgl = zzgl(cArr[i4]);
                            i4 = i + 2;
                            zzgm(cZzgl);
                            length -= i3 - i4;
                        }
                    }
                    i = i4;
                    break;
                }
                i2 -= length;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.words.internal.zzZEI
    public final void zzR(char[] cArr, int i, int i2) throws IOException {
        int i3;
        int iZzgm = this.zzWK0;
        while (i2 > 0) {
            int length = this.zzWJU.length - iZzgm;
            if (length <= 0) {
                this.zzWK0 = iZzgm;
                zzXLZ();
                length = this.zzWJU.length;
                iZzgm = 0;
            }
            if (this.zzWM0 != 0) {
                int i4 = i + 1;
                int iZzgl = zzgl(cArr[i]);
                this.zzWK0 = iZzgm;
                iZzgm = zzgm(iZzgl);
                i2--;
                i = i4;
            } else {
                if (length > i2) {
                    length = i2;
                }
                int i5 = i + length;
                while (i < i5) {
                    int i6 = i + 1;
                    char cZzgl = cArr[i];
                    if (cZzgl < 32) {
                        if (cZzgl == 13) {
                            if (this.zzWJE) {
                                this.zzWK0 = iZzgm;
                                length -= i5 - i6;
                                iZzgm = zzgm(cZzgl);
                            } else {
                                i3 = iZzgm + 1;
                                this.zzWJU[iZzgm] = (byte) cZzgl;
                                i = i6;
                                iZzgm = i3;
                            }
                        } else if (cZzgl == 10 || cZzgl == 9 || !this.zzWJH || (this.zzWQ6 && cZzgl != 0)) {
                            this.zzWK0 = iZzgm;
                            length -= i5 - i6;
                            iZzgm = zzgm(cZzgl);
                        } else {
                            i3 = iZzgm + 1;
                            this.zzWJU[iZzgm] = (byte) zzgi(cZzgl);
                            i = i6;
                            iZzgm = i3;
                        }
                    } else if (cZzgl < 127) {
                        if (cZzgl == 60 || cZzgl == 38 || cZzgl == 34) {
                            this.zzWK0 = iZzgm;
                            length -= i5 - i6;
                            iZzgm = zzgm(cZzgl);
                        } else {
                            i3 = iZzgm + 1;
                            this.zzWJU[iZzgm] = (byte) cZzgl;
                            i = i6;
                            iZzgm = i3;
                        }
                    } else if (cZzgl > 159 && cZzgl <= 255) {
                        i3 = iZzgm + 1;
                        this.zzWJU[iZzgm] = (byte) cZzgl;
                        i = i6;
                        iZzgm = i3;
                    } else if (cZzgl < 55296 || cZzgl > 57343) {
                        this.zzWK0 = iZzgm;
                        length -= i5 - i6;
                        iZzgm = zzgm(cZzgl);
                    } else {
                        this.zzWM0 = cZzgl;
                        if (i6 != i5) {
                            cZzgl = zzgl(cArr[i6]);
                            i6 = i + 2;
                            this.zzWK0 = iZzgm;
                            length -= i5 - i6;
                            iZzgm = zzgm(cZzgl);
                        }
                    }
                    i = i6;
                    break;
                }
                i2 -= length;
            }
        }
        this.zzWK0 = iZzgm;
    }

    @Override // com.aspose.words.internal.zzZEA
    public final void zzS(char[] cArr, int i, int i2) throws IOException {
        if (this.zzWM0 != 0) {
            zzXLW();
        }
        int i3 = this.zzWK0;
        while (i2 > 0) {
            int length = this.zzWJU.length - i3;
            if (length <= 0) {
                this.zzWK0 = i3;
                zzXLZ();
                length = this.zzWJU.length;
                i3 = 0;
            }
            if (length > i2) {
                length = i2;
            }
            if (this.zzWJH) {
                int i4 = i + length;
                while (i < i4) {
                    char cZzgi = cArr[i];
                    if (cZzgi < ' ') {
                        if (cZzgi != '\n' && cZzgi != '\r' && cZzgi != '\t') {
                            this.zzWK0 = i3;
                            cZzgi = zzgi(cZzgi);
                        }
                    } else if (cZzgi > '~') {
                        if (cZzgi > 255) {
                            this.zzWK0 = i3;
                            zzgj(cZzgi);
                        } else if (this.zzWQ6 && cZzgi < 159 && cZzgi != 133) {
                            this.zzWK0 = i3;
                            cZzgi = zzgi(cZzgi);
                        }
                    }
                    this.zzWJU[i3] = (byte) cZzgi;
                    i++;
                    i3++;
                }
            } else {
                int i5 = i + length;
                while (i < i5) {
                    this.zzWJU[i3] = (byte) cArr[i];
                    i++;
                    i3++;
                }
            }
            i2 -= length;
        }
        this.zzWK0 = i3;
    }

    @Override // com.aspose.words.internal.zzZEI, com.aspose.words.internal.zzZEA
    public final void zzr(String str, int i, int i2) throws IOException {
        if (this.zzWM0 != 0) {
            zzXLW();
        }
        int i3 = this.zzWK0;
        while (i2 > 0) {
            int length = this.zzWJU.length - i3;
            if (length <= 0) {
                this.zzWK0 = i3;
                zzXLZ();
                length = this.zzWJU.length;
                i3 = 0;
            }
            if (length > i2) {
                length = i2;
            }
            if (this.zzWJH) {
                int i4 = i + length;
                while (i < i4) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt < ' ') {
                        if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                            this.zzWK0 = i3;
                            cCharAt = zzgi(cCharAt);
                        }
                    } else if (cCharAt > '~') {
                        if (cCharAt > 255) {
                            this.zzWK0 = i3;
                            zzgj(cCharAt);
                        } else if (this.zzWQ6 && cCharAt < 159 && cCharAt != 133) {
                            this.zzWK0 = i3;
                            cCharAt = zzgi(cCharAt);
                        }
                    }
                    this.zzWJU[i3] = (byte) cCharAt;
                    i++;
                    i3++;
                }
            } else {
                int i5 = i + length;
                while (i < i5) {
                    this.zzWJU[i3] = (byte) str.charAt(i);
                    i++;
                    i3++;
                }
            }
            i2 -= length;
        }
        this.zzWK0 = i3;
    }

    @Override // com.aspose.words.internal.zzZEI
    public final void zzxr(String str) throws IOException {
        int length = str.length();
        int i = 0;
        while (length > 0) {
            int length2 = this.zzWJU.length - this.zzWK0;
            if (length2 <= 0) {
                zzXLZ();
                length2 = this.zzWJU.length;
            }
            if (this.zzWM0 != 0) {
                zzgm(zzgl(str.charAt(i)));
                length--;
                i++;
            } else {
                if (length2 > length) {
                    length2 = length;
                }
                int i2 = i + length2;
                while (i < i2) {
                    int i3 = i + 1;
                    int iCharAt = str.charAt(i);
                    if (iCharAt < 32) {
                        if (iCharAt == 10 || iCharAt == 9) {
                            byte[] bArr = this.zzWJU;
                            int i4 = this.zzWK0;
                            this.zzWK0 = i4 + 1;
                            bArr[i4] = (byte) iCharAt;
                        } else if (iCharAt == 13) {
                            if (this.zzWJE) {
                                i = i3;
                            } else {
                                byte[] bArr2 = this.zzWJU;
                                int i5 = this.zzWK0;
                                this.zzWK0 = i5 + 1;
                                bArr2[i5] = (byte) iCharAt;
                            }
                        } else if ((!this.zzWQ6 || iCharAt == 0) && this.zzWJH) {
                            char cZzgi = zzgi(iCharAt);
                            byte[] bArr3 = this.zzWJU;
                            int i6 = this.zzWK0;
                            this.zzWK0 = i6 + 1;
                            bArr3[i6] = (byte) cZzgi;
                        } else {
                            i = i3;
                        }
                        i = i3;
                    } else if (iCharAt < 127) {
                        if (iCharAt == 60 || iCharAt == 38 || (iCharAt == 62 && (i3 <= 1 || str.charAt(i - 1) == ']'))) {
                            i = i3;
                        } else {
                            byte[] bArr4 = this.zzWJU;
                            int i7 = this.zzWK0;
                            this.zzWK0 = i7 + 1;
                            bArr4[i7] = (byte) iCharAt;
                            i = i3;
                        }
                    } else if (iCharAt > 159 && iCharAt <= 255) {
                        byte[] bArr5 = this.zzWJU;
                        int i8 = this.zzWK0;
                        this.zzWK0 = i8 + 1;
                        bArr5[i8] = (byte) iCharAt;
                        i = i3;
                    } else if (iCharAt < 55296 || iCharAt > 57343) {
                        i = i3;
                    } else {
                        this.zzWM0 = iCharAt;
                        if (i3 != i2) {
                            i += 2;
                            iCharAt = zzgl(str.charAt(i3));
                        } else {
                            i = i3;
                            length -= length2;
                        }
                    }
                    zzgm(iCharAt);
                    length = str.length() - i;
                    break;
                }
                length -= length2;
            }
        }
    }

    @Override // com.aspose.words.internal.zzZEI
    public final int zzxs(String str) throws IOException, zzZQS {
        int length = str.length();
        if (!this.zzWJH) {
            zzr(str, 0, length);
            return -1;
        }
        int i = this.zzWK0;
        int i2 = 0;
        while (length > 0) {
            int length2 = this.zzWJU.length - i;
            if (length2 <= 0) {
                this.zzWK0 = i;
                zzXLZ();
                length2 = this.zzWJU.length;
                i = 0;
            }
            if (length2 > length) {
                length2 = length;
            }
            int i3 = i2 + length2;
            while (i2 < i3) {
                char cCharAt = str.charAt(i2);
                if (cCharAt < ' ') {
                    if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                        this.zzWK0 = i;
                        cCharAt = zzgi(cCharAt);
                    }
                } else if (cCharAt > '~') {
                    if (cCharAt > 255) {
                        this.zzWK0 = i;
                        zzgj(cCharAt);
                    } else if (this.zzWQ6 && cCharAt < 159 && cCharAt != 133) {
                        this.zzWK0 = i;
                        cCharAt = zzgi(cCharAt);
                    }
                } else if (cCharAt == '>' && i2 > 0 && str.charAt(i2 - 1) == '?') {
                    return i2 - 2;
                }
                this.zzWJU[i] = (byte) cCharAt;
                i2++;
                i++;
            }
            length -= length2;
        }
        this.zzWK0 = i;
        return -1;
    }

    @Override // com.aspose.words.internal.zzZEI
    public final int zzxt(String str) throws IOException {
        int length = str.length();
        if (!this.zzWJH) {
            zzr(str, 0, length);
            return -1;
        }
        int i = this.zzWK0;
        int i2 = 0;
        while (length > 0) {
            int length2 = this.zzWJU.length - i;
            if (length2 <= 0) {
                this.zzWK0 = i;
                zzXLZ();
                length2 = this.zzWJU.length;
                i = 0;
            }
            if (length2 > length) {
                length2 = length;
            }
            int i3 = i2 + length2;
            while (true) {
                if (i2 < i3) {
                    int i4 = i2 + 1;
                    char cCharAt = str.charAt(i2);
                    if (cCharAt < ' ') {
                        if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                            this.zzWK0 = i;
                            cCharAt = zzgi(cCharAt);
                        }
                    } else if (cCharAt > '~') {
                        if (cCharAt > 255) {
                            this.zzWK0 = i;
                            zzgj(cCharAt);
                        } else if (this.zzWQ6 && cCharAt < 159 && cCharAt != 133) {
                            this.zzWK0 = i;
                            cCharAt = zzgi(cCharAt);
                        }
                    } else if (cCharAt == '-' && i4 > 1) {
                        int i5 = i2 - 1;
                        if (str.charAt(i5) == '-') {
                            if (!this.zzWJF) {
                                return i5;
                            }
                            byte[] bArr = this.zzWJU;
                            int i6 = i + 1;
                            bArr[i] = 32;
                            if (i6 >= bArr.length) {
                                this.zzWK0 = i6;
                                zzXLZ();
                                i6 = 0;
                            }
                            this.zzWJU[i6] = PatternStyle.DottedGrid;
                            length2 -= i3 - i4;
                            i = i6 + 1;
                            i2 = i4;
                        }
                    }
                    this.zzWJU[i] = (byte) cCharAt;
                    i2 = i4;
                    i++;
                }
            }
            length -= length2;
        }
        this.zzWK0 = i;
        return -1;
    }

    @Override // com.aspose.words.internal.zzZEI
    public final int zzxu(String str) throws IOException {
        int length = str.length();
        if (!this.zzWJH) {
            zzr(str, 0, length);
            return -1;
        }
        int i = this.zzWK0;
        int i2 = 0;
        while (length > 0) {
            int length2 = this.zzWJU.length - i;
            if (length2 <= 0) {
                this.zzWK0 = i;
                zzXLZ();
                length2 = this.zzWJU.length;
                i = 0;
            }
            if (length2 > length) {
                length2 = length;
            }
            int i3 = i2 + length2;
            while (true) {
                if (i2 >= i3) {
                    length -= length2;
                    break;
                }
                int i4 = i2 + 1;
                char cCharAt = str.charAt(i2);
                if (cCharAt < ' ') {
                    if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                        this.zzWK0 = i;
                        cCharAt = zzgi(cCharAt);
                    }
                } else if (cCharAt > '~') {
                    if (cCharAt > 255) {
                        this.zzWK0 = i;
                        zzgj(cCharAt);
                    } else if (this.zzWQ6 && cCharAt < 159 && cCharAt != 133) {
                        this.zzWK0 = i;
                        cCharAt = zzgi(cCharAt);
                    }
                } else if (cCharAt == '>' && i4 > 2 && str.charAt(i2 - 1) == ']') {
                    int i5 = i2 - 2;
                    if (str.charAt(i5) == ']') {
                        if (!this.zzWJF) {
                            return i5;
                        }
                        this.zzWK0 = i;
                        zzXLX();
                        zzXLY();
                        zzf((byte) 62);
                        i = this.zzWK0;
                        length = str.length() - i4;
                        i2 = i4;
                    }
                }
                this.zzWJU[i] = (byte) cCharAt;
                i2 = i4;
                i++;
            }
        }
        this.zzWK0 = i;
        return -1;
    }

    @Override // com.aspose.words.internal.zzZEI
    public final void zzxv(String str) throws IOException {
        int i;
        int length = str.length();
        int iZzgm = this.zzWK0;
        int i2 = 0;
        while (length > 0) {
            int length2 = this.zzWJU.length - iZzgm;
            if (length2 <= 0) {
                this.zzWK0 = iZzgm;
                zzXLZ();
                length2 = this.zzWJU.length;
                iZzgm = 0;
            }
            if (this.zzWM0 != 0) {
                int i3 = i2 + 1;
                int iZzgl = zzgl(str.charAt(i2));
                this.zzWK0 = iZzgm;
                iZzgm = zzgm(iZzgl);
                length--;
                i2 = i3;
            } else {
                if (length2 > length) {
                    length2 = length;
                }
                int i4 = i2 + length2;
                while (i2 < i4) {
                    int i5 = i2 + 1;
                    int iCharAt = str.charAt(i2);
                    if (iCharAt < 32) {
                        if (iCharAt == 13) {
                            if (this.zzWJE) {
                                i2 = i5;
                            } else {
                                i = iZzgm + 1;
                                this.zzWJU[iZzgm] = (byte) iCharAt;
                                i2 = i5;
                                iZzgm = i;
                            }
                        } else if (iCharAt == 10 || iCharAt == 9 || !this.zzWJH || (this.zzWQ6 && iCharAt != 0)) {
                            i2 = i5;
                        } else {
                            i = iZzgm + 1;
                            this.zzWJU[iZzgm] = (byte) zzgi(iCharAt);
                            i2 = i5;
                            iZzgm = i;
                        }
                    } else if (iCharAt < 127) {
                        if (iCharAt == 60 || iCharAt == 38 || iCharAt == 34) {
                            i2 = i5;
                        } else {
                            i = iZzgm + 1;
                            this.zzWJU[iZzgm] = (byte) iCharAt;
                            i2 = i5;
                            iZzgm = i;
                        }
                    } else if (iCharAt > 159 && iCharAt <= 255) {
                        i = iZzgm + 1;
                        this.zzWJU[iZzgm] = (byte) iCharAt;
                        i2 = i5;
                        iZzgm = i;
                    } else if (iCharAt < 55296 || iCharAt > 57343) {
                        i2 = i5;
                    } else {
                        this.zzWM0 = iCharAt;
                        if (i5 != i4) {
                            i2 += 2;
                            iCharAt = zzgl(str.charAt(i5));
                        } else {
                            i2 = i5;
                            length -= length2;
                        }
                    }
                    this.zzWK0 = iZzgm;
                    iZzgm = zzgm(iCharAt);
                    length = str.length() - i2;
                    break;
                }
                length -= length2;
            }
        }
        this.zzWK0 = iZzgm;
    }
}

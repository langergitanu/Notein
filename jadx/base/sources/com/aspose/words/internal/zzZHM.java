package com.aspose.words.internal;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZHM extends Writer {
    private boolean zzZGT;
    private Writer zzZGU;

    public zzZHM(Writer writer, boolean z) {
        this.zzZGU = writer;
        this.zzZGT = z;
    }

    private void zzPs(int i) throws IOException {
        int i2 = i;
        char[] cArr = new char[10];
        cArr[0] = '&';
        int i3 = 3;
        if (i2 >= 256) {
            cArr[1] = '#';
            cArr[2] = 'x';
            int i4 = 20;
            int i5 = 3;
            do {
                int i6 = (i2 >> i4) & 15;
                if (i6 > 0 || i5 != 3) {
                    int i7 = i5 + 1;
                    cArr[i5] = (char) (i6 < 10 ? i6 + 48 : i6 + 55);
                    i5 = i7;
                }
                i4 -= 4;
            } while (i4 > 0);
            int i8 = i2 & 15;
            i3 = i5 + 1;
            cArr[i5] = (char) (i8 < 10 ? i8 + 48 : i8 + 55);
        } else if (i2 == 38) {
            cArr[1] = 'a';
            cArr[2] = 'm';
            cArr[3] = 'p';
            i3 = 4;
        } else if (i2 == 60) {
            cArr[1] = 'l';
            cArr[2] = 't';
        } else if (i2 == 62) {
            cArr[1] = 'g';
            cArr[2] = 't';
        } else {
            if (i2 == 39) {
                cArr[1] = 'a';
                cArr[2] = 'p';
                cArr[3] = 'o';
                cArr[4] = 's';
            } else if (i2 == 34) {
                cArr[1] = 'q';
                cArr[2] = 'u';
                cArr[3] = 'o';
                cArr[4] = 't';
            } else {
                cArr[1] = '#';
                cArr[2] = 'x';
                if (i2 >= 16) {
                    int i9 = i2 >> 4;
                    cArr[3] = (char) (i9 < 10 ? i9 + 48 : i9 + 55);
                    i2 &= 15;
                    i3 = 4;
                }
                int i10 = i3 + 1;
                cArr[i3] = (char) (i2 < 10 ? i2 + 48 : i2 + 55);
                i3 = i10;
            }
            i3 = 5;
        }
        cArr[i3] = ';';
        this.zzZGU.write(cArr, 0, i3 + 1);
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        flush();
        this.zzZGU.close();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() throws IOException {
        this.zzZGU.flush();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) throws IOException {
        String str;
        int i3 = i2 + i;
        while (i < i3) {
            char c = 0;
            int i4 = i;
            while (true) {
                str = null;
                if (i4 >= i3) {
                    break;
                }
                c = cArr[i4];
                if (c <= '>') {
                    if (c >= ' ') {
                        if (c != '<') {
                            if (c != '&') {
                                if (c != '>') {
                                    if (this.zzZGT && c == '\"') {
                                        str = "&quot;";
                                        break;
                                    }
                                } else {
                                    str = "&gt;";
                                    break;
                                }
                            } else {
                                str = "&amp;";
                                break;
                            }
                        } else {
                            str = "&lt;";
                            break;
                        }
                    } else if (this.zzZGT || (c != '\n' && c != '\t' && c != '\r')) {
                        break;
                    }
                }
                i4++;
            }
            int i5 = i4 - i;
            if (i5 > 0) {
                this.zzZGU.write(cArr, i, i5);
            }
            if (str != null) {
                this.zzZGU.write(str);
            } else if (i4 < i3) {
                zzPs(c);
            }
            i = i4 + 1;
        }
    }

    @Override // java.io.Writer
    public final void write(String str) throws IOException {
        write(str, 0, str.length());
    }

    @Override // java.io.Writer
    public final void write(String str, int i, int i2) throws IOException {
        String str2;
        int i3 = i2 + i;
        while (i < i3) {
            char cCharAt = 0;
            int i4 = i;
            while (true) {
                str2 = null;
                if (i4 >= i3) {
                    break;
                }
                cCharAt = str.charAt(i4);
                if (cCharAt <= '>') {
                    if (cCharAt >= ' ') {
                        if (cCharAt != '<') {
                            if (cCharAt != '&') {
                                if (cCharAt == '>') {
                                    str2 = "&gt;";
                                    break;
                                } else if (this.zzZGT && cCharAt == '\"') {
                                    str2 = "&quot;";
                                    break;
                                }
                            } else {
                                str2 = "&amp;";
                                break;
                            }
                        } else {
                            str2 = "&lt;";
                            break;
                        }
                    } else if (this.zzZGT || (cCharAt != '\n' && cCharAt != '\t' && cCharAt != '\r')) {
                        break;
                    }
                }
                i4++;
            }
            int i5 = i4 - i;
            if (i5 > 0) {
                this.zzZGU.write(str, i, i5);
            }
            if (str2 != null) {
                this.zzZGU.write(str2);
            } else if (i4 < i3) {
                zzPs(cCharAt);
            }
            i = i4 + 1;
        }
    }
}

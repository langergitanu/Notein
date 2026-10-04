package com.aspose.words.internal;

import com.aspose.words.ControlChar;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZEJ extends zzZEA {
    protected static final int[] zzWK4;
    final String zzWJV;
    final char zzWJW;
    private final int zzWJX;
    protected final OutputStream zzWJY;
    protected int zzWJZ;
    protected int zzWK0;
    protected final int zzWK1;
    protected char[] zzWK2;
    protected final Writer zzWK3;

    static {
        int[] iArr = new int[4096];
        Arrays.fill(iArr, 0, 32, 1);
        Arrays.fill(iArr, 127, 160, 1);
        iArr[9] = 0;
        iArr[10] = 0;
        iArr[60] = 1;
        iArr[62] = 1;
        iArr[38] = 1;
        zzWK4 = iArr;
    }

    public zzZEJ(Writer writer, zzZHB zzzhb, String str, boolean z, OutputStream outputStream, int i) throws IOException {
        super(zzzhb, str, z);
        this.zzWK3 = writer;
        char[] cArrZzXP4 = zzzhb.zzXP4();
        this.zzWK2 = cArrZzXP4;
        this.zzWJZ = cArrZzXP4.length;
        this.zzWK1 = 256;
        this.zzWK0 = 0;
        this.zzWJY = outputStream;
        this.zzWJW = '\"';
        this.zzWJV = "&quot;";
        i = i <= 0 ? zzxb(str) : i;
        this.zzWJX = i < 16 ? 1 << i : 65534;
    }

    private final void zzL(char c, char c2) throws IOException {
        if (this.zzWK0 + 1 >= this.zzWJZ) {
            if (this.zzWK3 == null) {
                return;
            } else {
                zzXLZ();
            }
        }
        char[] cArr = this.zzWK2;
        int i = this.zzWK0;
        int i2 = i + 1;
        this.zzWK0 = i2;
        cArr[i] = c;
        this.zzWK0 = i + 2;
        cArr[i2] = c2;
    }

    private void zzPs(int i) throws IOException {
        int i2;
        char[] cArr = this.zzWK2;
        int i3 = this.zzWK0;
        if (i3 + 10 >= cArr.length) {
            zzXLZ();
            i3 = this.zzWK0;
        }
        int i4 = i3 + 1;
        cArr[i3] = '&';
        if (i >= 256) {
            int i5 = i3 + 2;
            cArr[i4] = '#';
            int i6 = i3 + 3;
            cArr[i5] = 'x';
            int i7 = 20;
            int i8 = i6;
            do {
                int i9 = (i >> i7) & 15;
                if (i9 > 0 || i8 != i6) {
                    int i10 = i8 + 1;
                    cArr[i8] = (char) (i9 < 10 ? i9 + 48 : i9 + 87);
                    i8 = i10;
                }
                i7 -= 4;
            } while (i7 > 0);
            int i11 = i & 15;
            i2 = i8 + 1;
            cArr[i8] = (char) (i11 < 10 ? i11 + 48 : i11 + 87);
        } else if (i == 38) {
            cArr[i4] = 'a';
            int i12 = i3 + 3;
            cArr[i3 + 2] = 'm';
            i2 = i3 + 4;
            cArr[i12] = 'p';
        } else if (i == 60) {
            int i13 = i3 + 2;
            cArr[i4] = 'l';
            i2 = i3 + 3;
            cArr[i13] = 't';
        } else if (i == 62) {
            int i14 = i3 + 2;
            cArr[i4] = 'g';
            i2 = i3 + 3;
            cArr[i14] = 't';
        } else if (i == 39) {
            cArr[i4] = 'a';
            cArr[i3 + 2] = 'p';
            int i15 = i3 + 4;
            cArr[i3 + 3] = 'o';
            i2 = i3 + 5;
            cArr[i15] = 's';
        } else if (i == 34) {
            cArr[i4] = 'q';
            cArr[i3 + 2] = 'u';
            int i16 = i3 + 4;
            cArr[i3 + 3] = 'o';
            i2 = i3 + 5;
            cArr[i16] = 't';
        } else {
            cArr[i4] = '#';
            int i17 = i3 + 3;
            cArr[i3 + 2] = 'x';
            if (i >= 16) {
                int i18 = i >> 4;
                int i19 = i3 + 4;
                cArr[i17] = (char) (i18 < 10 ? i18 + 48 : i18 + 87);
                i &= 15;
                i17 = i19;
            }
            i2 = i17 + 1;
            cArr[i17] = (char) (i < 10 ? i + 48 : i + 87);
        }
        cArr[i2] = ';';
        this.zzWK0 = i2 + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r6.zzWJE != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003f, code lost:
    
        if (r3 < r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzR(char[] cArr, int i, int i2) throws IOException {
        String str;
        char c = this.zzWJW;
        int i3 = this.zzWJX;
        while (i < i2) {
            int i4 = i + 1;
            char cZzgi = cArr[i];
            if (cZzgi <= '<') {
                if (cZzgi >= ' ') {
                    if (cZzgi == c) {
                        str = this.zzWJV;
                    } else if (cZzgi == '<') {
                        str = "&lt;";
                    } else if (cZzgi == '&') {
                        str = "&amp;";
                    }
                    if (str == null) {
                    }
                } else if (cZzgi != '\r') {
                    if (cZzgi != '\n' && cZzgi != '\t' && (!this.zzWQ6 || cZzgi == 0)) {
                        cZzgi = zzgi(cZzgi);
                    }
                    str = null;
                    if (str == null) {
                        zzX(str);
                    } else {
                        zzPs(cArr[i]);
                    }
                }
                if (this.zzWK0 >= this.zzWJZ) {
                    zzXLZ();
                }
                char[] cArr2 = this.zzWK2;
                int i5 = this.zzWK0;
                this.zzWK0 = i5 + 1;
                cArr2[i5] = cZzgi;
            }
            i = i4;
        }
    }

    private final void zzX7(char c) throws IOException {
        if (this.zzWK0 >= this.zzWJZ) {
            if (this.zzWK3 == null) {
                return;
            } else {
                zzXLZ();
            }
        }
        char[] cArr = this.zzWK2;
        int i = this.zzWK0;
        this.zzWK0 = i + 1;
        cArr[i] = c;
    }

    private final void zzXLZ() throws IOException {
        char[] cArr;
        int i = this.zzWK0;
        if (i <= 0 || (cArr = this.zzWK2) == null) {
            return;
        }
        this.zzWJx += i;
        this.zzWJv -= i;
        this.zzWK0 = 0;
        this.zzWK3.write(cArr, 0, i);
    }

    private void zzYO(String str, int i) throws IOException {
        int length = str.length();
        int i2 = length - 1;
        if (i == i2) {
            zzxe("<!--");
            zzX(str);
            zzxe(" -->");
            return;
        }
        zzxe("<!--");
        int i3 = 0;
        while (i >= 0) {
            int i4 = i + 1;
            zzr(str, i3, i4 - i3);
            zzX7(ControlChar.SPACE_CHAR);
            i3 = i4;
            i = str.indexOf("--", i4);
        }
        zzr(str, i3, length - i3);
        if (str.charAt(i2) == '-') {
            zzX7(ControlChar.SPACE_CHAR);
        }
        zzxe("-->");
    }

    private void zzYP(String str, int i) throws IOException {
        int i2 = 0;
        while (i >= 0) {
            zzxe("<![CDATA[");
            int i3 = i + 2;
            zzr(str, i2, i3 - i2);
            zzxe("]]>");
            i2 = i3;
            i = str.indexOf("]]>", i3);
        }
        zzxe("<![CDATA[");
        zzr(str, i2, str.length() - i2);
        zzxe("]]>");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (r7.zzWJE != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0042, code lost:
    
        if (r4 < r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzYQ(String str, int i) throws IOException {
        String str2;
        char c = this.zzWJW;
        int i2 = this.zzWJX;
        int i3 = 0;
        while (i3 < i) {
            int i4 = i3 + 1;
            char cCharAt = str.charAt(i3);
            if (cCharAt <= '<') {
                if (cCharAt >= ' ') {
                    if (cCharAt == c) {
                        str2 = this.zzWJV;
                    } else if (cCharAt == '<') {
                        str2 = "&lt;";
                    } else if (cCharAt == '&') {
                        str2 = "&amp;";
                    }
                    if (str2 == null) {
                    }
                } else if (cCharAt != '\r') {
                    if (cCharAt != '\n' && cCharAt != '\t' && (!this.zzWQ6 || cCharAt == 0)) {
                        cCharAt = zzgi(cCharAt);
                    }
                    str2 = null;
                    if (str2 == null) {
                        zzX(str2);
                    } else {
                        zzPs(str.charAt(i3));
                    }
                }
                if (this.zzWK0 >= this.zzWJZ) {
                    zzXLZ();
                }
                char[] cArr = this.zzWK2;
                int i5 = this.zzWK0;
                this.zzWK0 = i5 + 1;
                cArr[i5] = cCharAt;
            }
            i3 = i4;
        }
    }

    private static int zzxb(String str) {
        String strZzUv;
        if (str == null || str.length() == 0 || (strZzUv = zzZFJ.zzUv(str)) == "UTF-8") {
            return 16;
        }
        if (strZzUv == "ISO-8859-1") {
            return 8;
        }
        if (strZzUv == "US-ASCII") {
            return 7;
        }
        return (strZzUv == "UTF-16" || strZzUv == "UTF-16BE" || strZzUv == "UTF-16LE" || strZzUv == "UTF-32BE" || strZzUv == "UTF-32LE") ? 16 : 8;
    }

    private static int zzxc(String str) {
        int iIndexOf = str.indexOf(45);
        return (iIndexOf < 0 || iIndexOf >= str.length() + (-1)) ? iIndexOf : str.indexOf("--", iIndexOf);
    }

    private static int zzxd(String str) {
        int iIndexOf;
        if (str == null || str.length() < 3 || (iIndexOf = str.indexOf(93)) < 0) {
            return -1;
        }
        return str.indexOf("]]>", iIndexOf);
    }

    private final void zzxe(String str) throws IOException {
        int length = str.length();
        int i = this.zzWK0;
        int i2 = i + length;
        int i3 = this.zzWJZ;
        if (i2 >= i3) {
            if (this.zzWK3 == null) {
                return;
            }
            if (length > i3) {
                zzX(str);
                return;
            } else {
                zzXLZ();
                i = this.zzWK0;
            }
        }
        str.getChars(0, length, this.zzWK2, i);
        this.zzWK0 = i + length;
    }

    @Override // com.aspose.words.internal.zzZEA
    public final void flush() throws IOException {
        zzXLZ();
        this.zzWK3.flush();
    }

    @Override // com.aspose.words.internal.zzZEA
    public final OutputStream getOutputStream() {
        return this.zzWJY;
    }

    @Override // com.aspose.words.internal.zzZEA
    public final Writer getWriter() {
        return this.zzWK3;
    }

    @Override // com.aspose.words.internal.zzZEA
    public final void zz0(String str, String str2) throws IOException, zzZQS {
        if (this.zzWK3 == null) {
            return;
        }
        if (this.zzWJG) {
            zzZU(str, this.zzWOV);
        }
        int length = str.length();
        int i = this.zzWJZ;
        int i2 = this.zzWK0;
        if ((i - i2) - (length + 3) < 0) {
            zzX7(ControlChar.SPACE_CHAR);
            zzxe(str);
            zzL('=', '\"');
        } else {
            char[] cArr = this.zzWK2;
            int i3 = i2 + 1;
            cArr[i2] = ControlChar.SPACE_CHAR;
            str.getChars(0, length, cArr, i3);
            int i4 = i3 + length;
            cArr[i4] = '=';
            cArr[i4 + 1] = '\"';
            this.zzWK0 = i4 + 2;
        }
        int length2 = str2 == null ? 0 : str2.length();
        if (length2 > 0) {
            Writer writer = this.zzWJA;
            if (writer != null) {
                writer.write(str2, 0, length2);
            } else {
                zzYQ(str2, length2);
            }
        }
        zzX7('\"');
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.words.internal.zzZEA
    public final void zzOT(boolean z) throws IOException {
        flush();
        this.zzWJB = null;
        this.zzWJA = null;
        char[] cArr = this.zzWK2;
        if (cArr != null) {
            this.zzWK2 = null;
            this.zzWM6.zzN(cArr);
        }
        if (this.zzWM5) {
            Writer writer = this.zzWK3;
            if (writer instanceof zzZFI) {
                ((zzZFI) writer).zzXNA();
            } else {
                writer.close();
            }
        }
    }

    @Override // com.aspose.words.internal.zzZEA
    public final void zzS(char[] cArr, int i, int i2) throws IOException {
        if (this.zzWK3 == null) {
            return;
        }
        int i3 = this.zzWK1;
        if (i2 < i3) {
            if (this.zzWK0 + i2 > this.zzWJZ) {
                zzXLZ();
            }
            System.arraycopy(cArr, i, this.zzWK2, this.zzWK0, i2);
            this.zzWK0 += i2;
            return;
        }
        int i4 = this.zzWK0;
        if (i4 > 0) {
            if (i4 < i3) {
                int i5 = i3 - i4;
                System.arraycopy(cArr, i, this.zzWK2, i4, i5);
                this.zzWK0 = i4 + i5;
                i2 -= i5;
                i += i5;
            }
            zzXLZ();
        }
        this.zzWK3.write(cArr, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0084 A[SYNTHETIC] */
    @Override // com.aspose.words.internal.zzZEA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzVV(String str) throws IOException {
        if (this.zzWK3 == null) {
            return;
        }
        Writer writer = this.zzWJB;
        if (writer != null) {
            writer.write(str);
            return;
        }
        int length = str.length();
        int[] iArr = zzWK4;
        int i = this.zzWJX;
        int iMin = Math.min(iArr.length, i);
        int i2 = 0;
        while (true) {
            String strValueOf = null;
            while (i2 < length) {
                int i3 = i2 + 1;
                char cCharAt = str.charAt(i2);
                if (cCharAt < iMin) {
                    if (iArr[cCharAt] != 0) {
                        if (cCharAt >= ' ') {
                            if (cCharAt == '<') {
                                strValueOf = "&lt;";
                            } else if (cCharAt == '&') {
                                strValueOf = "&amp;";
                            } else if (cCharAt == '>') {
                                if (i3 < 2 || str.charAt(i2 - 1) == ']') {
                                    strValueOf = "&gt;";
                                }
                            } else if (cCharAt >= 127) {
                            }
                            if (strValueOf == null) {
                            }
                            i2 = i3;
                        } else if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\t') {
                            if (cCharAt == '\r') {
                                if (this.zzWJE) {
                                    if (strValueOf == null) {
                                        zzX(strValueOf);
                                    } else {
                                        zzPs(str.charAt(i2));
                                    }
                                    i2 = i3;
                                }
                            } else if (!this.zzWQ6 || cCharAt == 0) {
                                cCharAt = zzgi(cCharAt);
                                strValueOf = String.valueOf(cCharAt);
                            } else {
                                if (strValueOf == null) {
                                }
                                i2 = i3;
                            }
                        }
                    }
                    if (this.zzWK0 < this.zzWJZ) {
                        zzXLZ();
                    }
                    char[] cArr = this.zzWK2;
                    int i4 = this.zzWK0;
                    this.zzWK0 = i4 + 1;
                    cArr[i4] = cCharAt;
                    i2 = i3;
                } else {
                    if (cCharAt >= i) {
                        if (strValueOf == null) {
                        }
                        i2 = i3;
                    }
                    if (this.zzWK0 < this.zzWJZ) {
                    }
                    char[] cArr2 = this.zzWK2;
                    int i42 = this.zzWK0;
                    this.zzWK0 = i42 + 1;
                    cArr2[i42] = cCharAt;
                    i2 = i3;
                }
            }
            return;
        }
    }

    @Override // com.aspose.words.internal.zzZEA
    public final void zzVX(String str) throws IOException {
        zzX(str);
    }

    @Override // com.aspose.words.internal.zzZEA
    public final void zzW(String str, String str2, String str3, String str4) throws IOException, zzZQS {
        zzxe("<!DOCTYPE ");
        if (this.zzWJG) {
            zzZU(str, false);
        }
        zzxe(str);
        if (str2 != null) {
            if (str3 != null) {
                zzxe(" PUBLIC \"");
                zzxe(str3);
                zzxe("\" \"");
            } else {
                zzxe(" SYSTEM \"");
            }
            zzxe(str2);
            zzX7('\"');
        }
        if (str4 != null && str4.length() > 0) {
            zzL(ControlChar.SPACE_CHAR, '[');
            zzxe(str4);
            zzX7(']');
        }
        zzX7('>');
    }

    @Override // com.aspose.words.internal.zzZEA
    public final void zzX(String str) throws IOException {
        if (this.zzWK3 == null) {
            return;
        }
        int length = str.length();
        if (length >= this.zzWK1) {
            zzr(str, 0, length);
            return;
        }
        if (this.zzWK0 + length >= this.zzWJZ) {
            zzXLZ();
        }
        str.getChars(0, length, this.zzWK2, this.zzWK0);
        this.zzWK0 += length;
    }

    @Override // com.aspose.words.internal.zzZEA
    public final void zzXA(String str, String str2) throws IOException {
        if (str == null || str.length() == 0) {
            zzxf(str2);
            return;
        }
        int i = this.zzWK0;
        int length = str.length();
        if ((this.zzWJZ - i) - ((str2.length() + 4) + length) < 0) {
            zzL('<', IOUtils.DIR_SEPARATOR_UNIX);
            zzxe(str);
            zzX7(':');
            zzxe(str2);
            zzX7('>');
            return;
        }
        char[] cArr = this.zzWK2;
        int i2 = i + 1;
        cArr[i] = '<';
        int i3 = i + 2;
        cArr[i2] = IOUtils.DIR_SEPARATOR_UNIX;
        str.getChars(0, length, cArr, i3);
        int i4 = i3 + length;
        int i5 = i4 + 1;
        cArr[i4] = ':';
        int length2 = str2.length();
        str2.getChars(0, length2, cArr, i5);
        int i6 = length2 + i5;
        cArr[i6] = '>';
        this.zzWK0 = i6 + 1;
    }

    @Override // com.aspose.words.internal.zzZEA
    public final void zzXB(String str, String str2) throws IOException, zzZQS {
        if (str == null || str.length() == 0) {
            zzxg(str2);
            return;
        }
        if (this.zzWJG) {
            zzZU(str, this.zzWOV);
            zzZU(str2, this.zzWOV);
        }
        int i = this.zzWK0;
        int length = str.length();
        if ((this.zzWJZ - i) - ((str2.length() + 2) + length) < 0) {
            zzX7('<');
            zzxe(str);
            zzX7(':');
            zzxe(str2);
            return;
        }
        char[] cArr = this.zzWK2;
        int i2 = i + 1;
        cArr[i] = '<';
        str.getChars(0, length, cArr, i2);
        int i3 = i2 + length;
        int i4 = i3 + 1;
        cArr[i3] = ':';
        int length2 = str2.length();
        str2.getChars(0, length2, cArr, i4);
        this.zzWK0 = length2 + i4;
    }

    @Override // com.aspose.words.internal.zzZEA
    public final int zzXC(String str, String str2) throws IOException, zzZQS {
        int iIndexOf;
        int iIndexOf2;
        if (this.zzWJG) {
            zzZU(str, this.zzWOV);
        }
        zzL('<', '?');
        zzxe(str);
        if (str2 != null && str2.length() > 0) {
            if (this.zzWJH && (iIndexOf = str2.indexOf(63)) >= 0 && (iIndexOf2 = str2.indexOf("?>", iIndexOf)) >= 0) {
                return iIndexOf2;
            }
            zzX7(ControlChar.SPACE_CHAR);
            zzX(str2);
        }
        zzL('?', '>');
        return -1;
    }

    @Override // com.aspose.words.internal.zzZEA
    public final void zzXM0() throws IOException {
        int i = this.zzWK0;
        if (i + 3 >= this.zzWJZ) {
            if (this.zzWK3 == null) {
                return;
            }
            zzXLZ();
            i = this.zzWK0;
        }
        char[] cArr = this.zzWK2;
        if (this.zzWJD) {
            cArr[i] = ControlChar.SPACE_CHAR;
            i++;
        }
        cArr[i] = IOUtils.DIR_SEPARATOR_UNIX;
        cArr[i + 1] = '>';
        this.zzWK0 = i + 2;
    }

    @Override // com.aspose.words.internal.zzZEA
    public final void zzXM1() throws IOException {
        zzX7('>');
    }

    @Override // com.aspose.words.internal.zzZEA
    public final int zzXM2() {
        return this.zzWK0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0041, code lost:
    
        r5 = "&gt;";
     */
    @Override // com.aspose.words.internal.zzZEA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzY(char[] cArr, int i, int i2) throws IOException {
        String strValueOf;
        if (this.zzWK3 == null) {
            return;
        }
        Writer writer = this.zzWJB;
        if (writer != null) {
            writer.write(cArr, i, i2);
            return;
        }
        int[] iArr = zzWK4;
        int i3 = this.zzWJX;
        int iMin = Math.min(iArr.length, i3);
        int i4 = i2 + i;
        do {
            char cZzgi = 0;
            int i5 = i;
            while (true) {
                strValueOf = null;
                if (i5 < i4) {
                    cZzgi = cArr[i5];
                    if (cZzgi >= iMin) {
                        if (cZzgi >= i3) {
                            break;
                        } else {
                            i5++;
                        }
                    } else {
                        if (iArr[cZzgi] == 0) {
                            continue;
                        } else {
                            if (cZzgi == '<') {
                                strValueOf = "&lt;";
                                break;
                            }
                            if (cZzgi == '&') {
                                strValueOf = "&amp;";
                                break;
                            }
                            if (cZzgi == '>') {
                                if (i5 == i || cArr[i5 - 1] == ']') {
                                    break;
                                }
                            } else if (cZzgi < ' ') {
                                if (cZzgi != '\n' && cZzgi != '\t') {
                                    if (cZzgi == '\r') {
                                        if (this.zzWJE) {
                                            break;
                                        }
                                    } else if (!this.zzWQ6 || cZzgi == 0) {
                                        cZzgi = zzgi(cZzgi);
                                        strValueOf = String.valueOf(cZzgi);
                                    }
                                }
                            } else if (cZzgi >= 127) {
                                break;
                            }
                        }
                        i5++;
                    }
                } else {
                    break;
                }
            }
            int i6 = i5 - i;
            if (i6 > 0) {
                zzS(cArr, i, i6);
            }
            if (strValueOf != null) {
                zzX(strValueOf);
            } else if (i5 < i4) {
                zzPs(cZzgi);
            }
            i = i5 + 1;
        } while (i < i4);
    }

    @Override // com.aspose.words.internal.zzZEA
    public final void zzZ(String str, String str2, char[] cArr, int i) throws IOException, zzZQS {
        if (this.zzWK3 == null) {
            return;
        }
        if (this.zzWJG) {
            zzZU(str, this.zzWOV);
            zzZU(str2, this.zzWOV);
        }
        int length = str.length();
        if ((this.zzWJZ - this.zzWK0) - ((str2.length() + 4) + length) < 0) {
            zzX7(ControlChar.SPACE_CHAR);
            if (length > 0) {
                zzxe(str);
                zzX7(':');
            }
            zzxe(str2);
            zzL('=', '\"');
        } else {
            int i2 = this.zzWK0;
            char[] cArr2 = this.zzWK2;
            int i3 = i2 + 1;
            cArr2[i2] = ControlChar.SPACE_CHAR;
            str.getChars(0, length, cArr2, i3);
            int i4 = i3 + length;
            int i5 = i4 + 1;
            cArr2[i4] = ':';
            int length2 = str2.length();
            str2.getChars(0, length2, cArr2, i5);
            int i6 = length2 + i5;
            cArr2[i6] = '=';
            cArr2[i6 + 1] = '\"';
            this.zzWK0 = i6 + 2;
        }
        if (i > 0) {
            Writer writer = this.zzWJA;
            if (writer != null) {
                writer.write(cArr, 0, i);
            } else {
                zzR(cArr, 0, i);
            }
        }
        zzX7('\"');
    }

    @Override // com.aspose.words.internal.zzZEA
    public final void zzh(String str, String str2, String str3) throws IOException, zzZQS {
        if (this.zzWK3 == null) {
            return;
        }
        if (this.zzWJG) {
            zzZU(str, this.zzWOV);
            zzZU(str2, this.zzWOV);
        }
        int length = str.length();
        if ((this.zzWJZ - this.zzWK0) - ((str2.length() + 4) + length) < 0) {
            zzX7(ControlChar.SPACE_CHAR);
            if (length > 0) {
                zzxe(str);
                zzX7(':');
            }
            zzxe(str2);
            zzL('=', '\"');
        } else {
            int i = this.zzWK0;
            char[] cArr = this.zzWK2;
            int i2 = i + 1;
            cArr[i] = ControlChar.SPACE_CHAR;
            str.getChars(0, length, cArr, i2);
            int i3 = i2 + length;
            int i4 = i3 + 1;
            cArr[i3] = ':';
            int length2 = str2.length();
            str2.getChars(0, length2, cArr, i4);
            int i5 = length2 + i4;
            cArr[i5] = '=';
            cArr[i5 + 1] = '\"';
            this.zzWK0 = i5 + 2;
        }
        int length3 = str3 == null ? 0 : str3.length();
        if (length3 > 0) {
            Writer writer = this.zzWJA;
            if (writer != null) {
                writer.write(str3, 0, length3);
            } else {
                zzYQ(str3, length3);
            }
        }
        zzX7('\"');
    }

    @Override // com.aspose.words.internal.zzZEA
    public final void zzr(String str, int i, int i2) throws IOException {
        if (this.zzWK3 == null) {
            return;
        }
        int i3 = this.zzWK1;
        if (i2 < i3) {
            if (this.zzWK0 + i2 >= this.zzWJZ) {
                zzXLZ();
            }
            str.getChars(i, i + i2, this.zzWK2, this.zzWK0);
            this.zzWK0 += i2;
            return;
        }
        int i4 = this.zzWK0;
        if (i4 > 0) {
            if (i4 < i3) {
                int i5 = i3 - i4;
                int i6 = i + i5;
                str.getChars(i, i6, this.zzWK2, i4);
                this.zzWK0 = i4 + i5;
                i2 -= i5;
                i = i6;
            }
            zzXLZ();
        }
        this.zzWK3.write(str, i, i2);
    }

    @Override // com.aspose.words.internal.zzZEA
    public final void zzxf(String str) throws IOException {
        int i = this.zzWK0;
        if ((this.zzWJZ - i) - (str.length() + 3) < 0) {
            zzL('<', IOUtils.DIR_SEPARATOR_UNIX);
            zzxe(str);
            zzX7('>');
            return;
        }
        char[] cArr = this.zzWK2;
        int i2 = i + 1;
        cArr[i] = '<';
        int i3 = i + 2;
        cArr[i2] = IOUtils.DIR_SEPARATOR_UNIX;
        int length = str.length();
        str.getChars(0, length, cArr, i3);
        int i4 = length + i3;
        cArr[i4] = '>';
        this.zzWK0 = i4 + 1;
    }

    @Override // com.aspose.words.internal.zzZEA
    public final void zzxg(String str) throws IOException, zzZQS {
        if (this.zzWJG) {
            zzZU(str, this.zzWOV);
        }
        int i = this.zzWK0;
        if ((this.zzWJZ - i) - (str.length() + 1) < 0) {
            zzX7('<');
            zzxe(str);
            return;
        }
        char[] cArr = this.zzWK2;
        int i2 = i + 1;
        cArr[i] = '<';
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        this.zzWK0 = length + i2;
    }

    @Override // com.aspose.words.internal.zzZEA
    public final void zzxh(String str) throws IOException, zzZQS {
        if (this.zzWJG) {
            zzZU(str, this.zzWOV);
        }
        zzX7('&');
        zzxe(str);
        zzX7(';');
    }

    @Override // com.aspose.words.internal.zzZEA
    public final int zzxi(String str) throws IOException {
        int iZzxc;
        if (!this.zzWJH || (iZzxc = zzxc(str)) < 0) {
            zzxe("<!--");
            zzX(str);
            zzxe("-->");
            return -1;
        }
        if (!this.zzWJF) {
            return iZzxc;
        }
        zzYO(str, iZzxc);
        return -1;
    }

    @Override // com.aspose.words.internal.zzZEA
    public final int zzxj(String str) throws IOException {
        int iZzxd;
        if (!this.zzWJH || (iZzxd = zzxd(str)) < 0) {
            zzxe("<![CDATA[");
            zzr(str, 0, str.length());
            zzxe("]]>");
            return -1;
        }
        if (!this.zzWJF) {
            return iZzxd;
        }
        zzYP(str, iZzxd);
        return -1;
    }

    @Override // com.aspose.words.internal.zzZEA
    public final void zzX(String str, char[] cArr, int i) throws IOException, zzZQS {
        if (this.zzWK3 == null) {
            return;
        }
        if (this.zzWJG) {
            zzZU(str, this.zzWOV);
        }
        int length = str.length();
        int i2 = this.zzWJZ;
        int i3 = this.zzWK0;
        if ((i2 - i3) - (length + 3) < 0) {
            zzX7(ControlChar.SPACE_CHAR);
            zzxe(str);
            zzL('=', '\"');
        } else {
            char[] cArr2 = this.zzWK2;
            int i4 = i3 + 1;
            cArr2[i3] = ControlChar.SPACE_CHAR;
            str.getChars(0, length, cArr2, i4);
            int i5 = i4 + length;
            cArr2[i5] = '=';
            cArr2[i5 + 1] = '\"';
            this.zzWK0 = i5 + 2;
        }
        if (i > 0) {
            Writer writer = this.zzWJA;
            if (writer != null) {
                writer.write(cArr, 0, i);
            } else {
                zzR(cArr, 0, i);
            }
        }
        zzX7('\"');
    }
}

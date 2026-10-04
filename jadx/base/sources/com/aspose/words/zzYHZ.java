package com.aspose.words;

import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzYHZ {
    private static HashMap<Character, zzYF9> zzXwx = new HashMap<>();
    private static char[] zzbO = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private com.aspose.words.internal.zzZO0 zzMW;
    private boolean zzXwA;
    private boolean zzXwB;
    private zzYEX zzXwC;
    private com.aspose.words.internal.zzZQC<Boolean> zzXwy;
    private long zzXwz;

    static {
        zzYF9[] zzyf9Arr = {new zzYF9(IOUtils.DIR_SEPARATOR_WINDOWS, "\\\\", false), new zzYF9('{', "\\{", false), new zzYF9('}', "\\}", false), new zzYF9(ControlChar.LINE_BREAK_CHAR, "\\line", true), new zzYF9(ControlChar.COLUMN_BREAK_CHAR, "\\column", true), new zzYF9('\f', "\\page", true), new zzYF9('\t', "\\tab", true), new zzYF9((char) 8197, "\\qmspace", true), new zzYF9(ControlChar.NON_BREAKING_SPACE_CHAR, "\\~", false), new zzYF9(ControlChar.OPTIONAL_HYPHEN_CHAR, "\\-", false), new zzYF9(ControlChar.NON_BREAKING_HYPHEN_CHAR, "\\_", false), new zzYF9((char) 5, "\\chatn", true), new zzYF9((char) 2, "\\chftn", true), new zzYF9((char) 3, "\\chftnsep", true), new zzYF9((char) 4, "\\chftnsepc", true), new zzYF9((char) 0, "\\chpgn", true)};
        for (int i = 0; i < 16; i++) {
            zzYF9 zzyf9 = zzyf9Arr[i];
            com.aspose.words.internal.zzZQF.zzY(zzXwx, Character.valueOf(zzyf9.getChar()), zzyf9);
        }
    }

    public zzYHZ(zzYEX zzyex, boolean z) {
        com.aspose.words.internal.zzZQC<Boolean> zzzqc = new com.aspose.words.internal.zzZQC<>();
        this.zzXwy = zzzqc;
        this.zzXwC = zzyex;
        this.zzXwB = z;
        zzzqc.push(Boolean.FALSE);
        this.zzMW = com.aspose.words.internal.zzZO0.zzQz(1252);
    }

    private void zzCA(String str) throws Exception {
        this.zzXwz += (long) str.length();
        if (!zzYj0()) {
            zzYj6();
        }
        this.zzXwC.write(str);
    }

    private void zzRq(boolean z) throws Exception {
        if (z) {
            this.zzXwz = 0L;
            zzCA(IOUtils.LINE_SEPARATOR_WINDOWS);
        }
    }

    private static zzYF9 zzXY(char c) {
        return (zzYF9) com.aspose.words.internal.zzQW.zzZ(zzXwx, Character.valueOf(c));
    }

    private void zzXZ(char c) throws Exception {
        this.zzXwC.zzZR(c);
        this.zzXwz++;
    }

    private void zzY1(char c) throws Exception {
        zzYj2();
        if (c < ' ') {
            zzY0(c);
            return;
        }
        if (c < 128) {
            zzXZ(c);
        } else if (c < 256 && this.zzMW.zzi0()) {
            zzY0(c);
        } else {
            zzZ5("\\u", (short) c);
            zzFh();
        }
    }

    private void zzY2(char c) throws Exception {
        if (c <= 256) {
            zzY1(c);
            return;
        }
        byte[] bytes = this.zzMW.getBytes(Character.toString(c));
        zzYj2();
        for (byte b : bytes) {
            zzCA("\\'");
            zzJ(b);
        }
    }

    private boolean zzYj0() {
        return this.zzXwy.peek().booleanValue();
    }

    private void zzYj2() throws Exception {
        if (this.zzXwA) {
            zzFh();
            this.zzXwA = false;
        }
    }

    private void zzYj6() throws Exception {
        if (this.zzXwz >= 256) {
            zzRq(true);
        }
    }

    private void zzl(int i) throws Exception {
        if (i != 0) {
            zzl(i / 10);
            zzXZ((char) ((i % 10) + 48));
        }
    }

    public final void flush() throws Exception {
        this.zzXwC.flush();
    }

    public final void write(int i) throws Exception {
        if (i == 0) {
            zzXZ('0');
            return;
        }
        if (i == Integer.MIN_VALUE) {
            zzCA("-2147483648");
            return;
        }
        if (i < 0) {
            zzXZ('-');
            i = -i;
        }
        zzl(i);
    }

    public final void zz5(String str, boolean z) throws Exception {
        zzY7(str, z ? "1" : "0");
    }

    public final void zz6(String str, boolean z) throws Exception {
        this.zzXwy.push(Boolean.TRUE);
        zzCA(str);
        if (!z) {
            zzXZ('0');
        }
        this.zzXwy.pop();
        this.zzXwA = true;
    }

    public final void zz7(String str, boolean z) throws Exception {
        if (z) {
            zzCD(str);
        }
    }

    public final void zzCB(String str) throws Exception {
        zzYj5();
        zzCD(com.aspose.words.internal.zzZKN.format("\\*{0}", str));
    }

    public final void zzCC(String str) throws Exception {
        zzYj5();
        zzCD(str);
    }

    public final void zzCD(String str) throws Exception {
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            zzCA(str);
            this.zzXwA = true;
        }
    }

    public final void zzE(byte[] bArr, int i, int i2) throws Exception {
        zzRq(true);
        int iMin = Math.min(bArr.length, i2 + i);
        while (i < iMin) {
            zzJ(bArr[i]);
            zzYj6();
            i++;
        }
    }

    public final void zzFg() throws Exception {
        zzRq(this.zzXwB);
    }

    public final void zzFh() throws Exception {
        zzXZ(ControlChar.SPACE_CHAR);
        this.zzXwA = false;
    }

    public final void zzG(short s) throws Exception {
        zzYj2();
        zzJ((byte) (s & 255));
        zzJ((byte) ((s >> 8) & 255));
    }

    public final void zzJ(byte b) throws Exception {
        zzXZ(zzbO[((b & 255) >>> 4) & 15]);
        zzXZ(zzbO[b & 15]);
    }

    public final void zzL(String str, String str2, int i) throws Exception {
        if (com.aspose.words.internal.zzZYD.zzXk(str2)) {
            this.zzXwy.push(Boolean.TRUE);
            zzCC(str);
            zzZ3(str2, i);
            zzYj4();
            this.zzXwy.pop();
        }
    }

    public final void zzV(String str, int i, int i2, boolean z) throws Exception {
        if (i == i2) {
            return;
        }
        if (z && i == 0) {
            return;
        }
        zzZ5(str, i);
    }

    public final void zzXQ(byte[] bArr) throws Exception {
        zzYj2();
        for (byte b : bArr) {
            zzJ(b);
        }
    }

    public final void zzY0(char c) throws Exception {
        zzYj2();
        zzCA("\\'");
        zzJ((byte) c);
    }

    public final void zzY4(String str, String str2) throws Exception {
        if (com.aspose.words.internal.zzZYD.zzXk(str2)) {
            this.zzXwy.push(Boolean.TRUE);
            zzCC(str);
            zzZ3(str2, 0);
            zzYj8();
            zzYj4();
            this.zzXwy.pop();
        }
    }

    public final void zzY5(String str, String str2) throws Exception {
        if (com.aspose.words.internal.zzZYD.zzXk(str2)) {
            for (int i = 0; i < str2.length(); i++) {
                if (str2.charAt(i) > 256) {
                    this.zzXwy.push(Boolean.TRUE);
                    zzCC("\\upr");
                    zzL(str, str2, 2);
                    zzCB("\\ud");
                    zzL(str, str2, 0);
                    zzYj4();
                    zzYj4();
                    this.zzXwy.pop();
                    return;
                }
            }
            zzL(str, str2, 0);
        }
    }

    public final void zzY6(String str, String str2) throws Exception {
        zzL(str, str2, 0);
    }

    public final void zzY7(String str, String str2) throws Exception {
        this.zzXwy.push(Boolean.TRUE);
        zzCA(str);
        zzCA(str2);
        this.zzXwy.pop();
        this.zzXwA = true;
    }

    public final void zzYV(String str) throws Exception {
        zzZ3(str, 0);
    }

    public final zzYEX zzYj1() {
        return this.zzXwC;
    }

    public final void zzYj3() throws Exception {
        zzYj4();
    }

    public final void zzYj4() throws Exception {
        zzXZ('}');
        this.zzXwA = false;
    }

    public final void zzYj5() throws Exception {
        zzYj6();
        zzXZ('{');
        this.zzXwA = false;
    }

    public final void zzYj7() throws Exception {
        if (this.zzXwz + 1 >= 256) {
            zzRq(true);
        }
    }

    public final void zzYj8() throws Exception {
        zzXZ(';');
        zzYj6();
        this.zzXwA = false;
    }

    public final void zzYj9() throws Exception {
        zzFg();
        zzFg();
    }

    public final void zzZ(com.aspose.words.internal.zzZO0 zzzo0) {
        this.zzMW = zzzo0;
    }

    public final void zzZ3(String str, int i) throws Exception {
        zzYj2();
        boolean z = (i & 4) == 4;
        boolean z2 = (i & 2) == 2;
        if (z) {
            str = zzYGX.zzCk(str).replace("\\:", Character.toString((char) 57345));
        }
        this.zzXwy.push(Boolean.TRUE);
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            zzYF9 zzyf9ZzXY = !Character.isLetterOrDigit(cCharAt) ? zzXY(cCharAt) : null;
            if (z && cCharAt == 57345) {
                zzY1(IOUtils.DIR_SEPARATOR_WINDOWS);
                zzY1(':');
            } else if (zzyf9ZzXY != null) {
                zzZ(zzyf9ZzXY, i);
            } else if (z2) {
                zzY2(cCharAt);
            } else {
                zzY1(cCharAt);
            }
        }
        this.zzXwy.pop();
    }

    public final void zzZ4(String str, int i) throws Exception {
        this.zzXwy.push(Boolean.TRUE);
        zzCC(str);
        zzFh();
        write(i);
        zzYj4();
        this.zzXwy.pop();
    }

    public final void zzZ5(String str, int i) throws Exception {
        this.zzXwy.push(Boolean.TRUE);
        zzCA(str);
        write(i);
        this.zzXwy.pop();
        this.zzXwA = true;
    }

    public final void zzp5(int i) throws Exception {
        zzYj2();
        zzJ((byte) (i & 255));
        zzJ((byte) ((i >> 8) & 255));
        zzJ((byte) ((i >> 16) & 255));
        zzJ((byte) ((i >> 24) & 255));
    }

    public final void zzt(String str, int i, int i2) throws Exception {
        zzV(str, i, i2, false);
    }

    public final void zzZ(String str, String str2, PreferredWidth preferredWidth) throws Exception {
        if (!preferredWidth.isAuto()) {
            zzZ5(str, preferredWidth.zzYmE());
        }
        zzZ5(str2, preferredWidth.getType());
    }

    private void zzZ(zzYF9 zzyf9, int i) throws Exception {
        if ((i & 1) == 1) {
            zzY0(zzyf9.getChar());
            return;
        }
        write(zzyf9.zzYfx());
        if (zzyf9.zzYfw()) {
            zzFh();
        }
    }

    public final void write(String str) throws Exception {
        zzYj2();
        zzCA(str);
    }

    public final void zzZ(zzYEX zzyex) {
        this.zzXwC = zzyex;
        this.zzXwz = 0L;
    }
}

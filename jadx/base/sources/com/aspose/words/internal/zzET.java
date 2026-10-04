package com.aspose.words.internal;

import com.aspose.slides.PatternStyle;
import com.aspose.words.EditingLanguage;
import com.aspose.words.StyleIdentifier;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.logging.type.LogSeverity;

/* JADX INFO: loaded from: classes5.dex */
final class zzET {
    private zzZOW zzW5;
    private static byte[] zzwI = {0, 0, 0, 0, -1, -1, -1, 0};
    private static byte[] zzwH = {0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, 0};
    private long zzEr = 0;
    private int zzCX = 0;
    private long zzCW = 0;
    private long zzCV = 0;

    public zzET(zzZOW zzzow) {
        this.zzW5 = zzzow;
    }

    private void zz8(int i, int i2) throws Exception {
        zzX4(i);
        this.zzW5.zzl(i2);
        zzKD();
    }

    private void zzKD() throws Exception {
        long position = this.zzW5.zzq().getPosition();
        int i = (int) (position - this.zzEr);
        this.zzW5.zzq().zzH(this.zzEr + 4);
        this.zzW5.zzl(i);
        this.zzW5.zzq().zzH(position);
    }

    private void zzP(zzEX zzex) throws Exception {
        for (int i = 0; i < 1024; i++) {
            byte b = zzex.zzEj().zzEe()[(i * 4) + 3];
            float f = (b & 255) / 255.0f;
            this.zzW5.writeByte((byte) ((zzex.zzEj().zzEe()[r1] & 255) * f));
            this.zzW5.writeByte((byte) ((zzex.zzEj().zzEe()[r1 + 1] & 255) * f));
            this.zzW5.writeByte((byte) ((zzex.zzEj().zzEe()[r1 + 2] & 255) * f));
            this.zzW5.writeByte(b);
        }
    }

    private void zzQ(zzEX zzex) throws Exception {
        for (int i = 0; i < 256; i++) {
            this.zzW5.zzl(0);
        }
        for (int i2 = 0; i2 < 256; i2++) {
            int i3 = i2 % 16;
            if (i3 == 0) {
                for (int i4 = 0; i4 < 8; i4++) {
                    this.zzW5.zzl(0);
                }
            }
            int i5 = (zzex.zzEj().zzEe()[i2] & 255) * 4;
            this.zzW5.writeByte(zzex.zzEj().zzEg()[i5]);
            this.zzW5.writeByte(zzex.zzEj().zzEg()[i5 + 1]);
            this.zzW5.writeByte(zzex.zzEj().zzEg()[i5 + 2]);
            this.zzW5.writeByte(zzex.zzEj().zzEg()[i5 + 3]);
            if (i3 == 15) {
                for (int i6 = 0; i6 < 8; i6++) {
                    this.zzW5.zzl(0);
                }
            }
        }
        for (int i7 = 0; i7 < 256; i7++) {
            this.zzW5.zzl(0);
        }
    }

    private void zzR(zzEX zzex) throws Exception {
        for (int i = 0; i < zzex.zzEj().zzEe().length; i++) {
            int i2 = (zzex.zzEj().zzEe()[i] & 255) >>> 4;
            int i3 = zzex.zzEj().zzEe()[i] & 15;
            int i4 = i2 * 4;
            this.zzW5.writeByte(zzex.zzEj().zzEg()[i4]);
            this.zzW5.writeByte(zzex.zzEj().zzEg()[i4 + 1]);
            this.zzW5.writeByte(zzex.zzEj().zzEg()[i4 + 2]);
            this.zzW5.writeByte(zzex.zzEj().zzEg()[i4 + 3]);
            int i5 = i3 * 4;
            this.zzW5.writeByte(zzex.zzEj().zzEg()[i5]);
            this.zzW5.writeByte(zzex.zzEj().zzEg()[i5 + 1]);
            this.zzW5.writeByte(zzex.zzEj().zzEg()[i5 + 2]);
            this.zzW5.writeByte(zzex.zzEj().zzEg()[i5 + 3]);
        }
    }

    private void zzS(zzEX zzex) throws Exception {
        for (int i = 0; i < zzex.zzEj().zzEe().length; i++) {
            int i2 = (zzex.zzEj().zzEe()[i] & 255) * 4;
            this.zzW5.writeByte(zzex.zzEj().zzEg()[i2]);
            this.zzW5.writeByte(zzex.zzEj().zzEg()[i2 + 1]);
            this.zzW5.writeByte(zzex.zzEj().zzEg()[i2 + 2]);
            this.zzW5.writeByte(zzex.zzEj().zzEg()[i2 + 3]);
        }
    }

    private void zzT(zzEX zzex) throws Exception {
        this.zzW5.zzl(0);
        this.zzW5.zzl(0);
        for (int i = 0; i < 8; i++) {
            this.zzW5.zzl(-1);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            int i4 = i3 % 16;
            if (i4 == 0) {
                this.zzW5.writeByte((byte) -1);
            }
            i2 <<= 1;
            int i5 = (zzex.zzEj().zzEe()[i3] & 255) * 4;
            if (zzex.zzEj().zzEg()[i5] == 0 && zzex.zzEj().zzEg()[i5 + 1] == 0 && zzex.zzEj().zzEg()[i5 + 2] == 0) {
                i2 |= 1;
            }
            if (i4 == 15) {
                this.zzW5.writeByte((byte) (i2 >> 8));
                this.zzW5.writeByte((byte) (i2 & 255));
                this.zzW5.writeByte((byte) -1);
                i2 = 0;
            }
        }
        for (int i6 = 0; i6 < 8; i6++) {
            this.zzW5.zzl(-1);
        }
    }

    private void zzU(zzEX zzex) throws Exception {
        this.zzW5.zzl(0);
        this.zzW5.zzl(0);
        this.zzW5.writeBytes(zzex.zzEj().zzEf());
    }

    private void zzV(zzEX zzex) throws Exception {
        if (zzex.zzEj().zzEe().length != 256 || zzex.zzEj().zzEg().length != 1024) {
            throw new UnsupportedOperationException("Not implemented format is met.");
        }
        zzQ(zzex);
    }

    private void zzW(zzEX zzex) throws Exception {
        if (zzex.zzEj().zzEe().length == 4096) {
            this.zzW5.writeBytes(zzex.zzEj().zzEe());
            return;
        }
        if (zzex.zzEj().zzEe().length == 1024 && zzex.zzEj().zzEg().length == 1024) {
            zzS(zzex);
        } else {
            if (zzex.zzEj().zzEe().length != 512 || zzex.zzEj().zzEg().length != 64) {
                throw new UnsupportedOperationException("Not implemented format is met.");
            }
            zzR(zzex);
        }
    }

    private static byte[] zzW0(int i) {
        byte[] bArr = {0, 0, -86, 119, 88, -1, 14, 18, 0, 0, Ascii.DEL, 0, 32, 0, 0, 0, 0, 0, 0, 0, -80, -78, 79, 0, -18, -83, -91, 119, 3, 0, 0, 0, -18, -83, -91, 119, 100, 0, 0, 0, 0, 0, 0, 0, 80, 110, -54, 15, 96, 0, 0, 0, 0, 0, 0, 0, 63, 0, 27, 0, 32, -16, 14, 18};
        byte[] bArr2 = {0, 0, 122, 3, -112, 121, -39, 22, 0, 0, 0, 0, 0, 0, 0, 0, PatternStyle.Vertical, -73, 79, 0, 16, -44, -98, 15, 120, -71, 79, 0, 0, 0, 0, 0, -122, 84, 20, PatternStyle.Vertical, 1, PatternStyle.Divot, 81, 81, 0, 0, 0, 0, 17, 0, 0, 0, -48, -72, 79, 0, 20, -73, 79, 0, 32, -73, 79, 0, -31, 103, 14, 81};
        byte[] bArr3 = {-18, 119, -44, 79, -8, -39, 83, 0, 72, 94, 100, 17, 124, -39, 83, 0, -24, -55, -22, 26, 0, 0, 0, 0, -8, -41, 83, 0, -12, -55, -22, 26, 0, 0, 0, 0, -76, 19, -71, 5, 40, 69, 10, 21, 100, -39, 83, 0, 118, 75, 74, 120, 72, PatternStyle.Cross, 22, 26, 0, 0, 0, 0, -68, PatternStyle.Cross, 107, 117};
        if (i == 0) {
            return bArr2;
        }
        if (i == 1) {
            return bArr;
        }
        if (i == 2) {
            return bArr3;
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: fontName");
    }

    private static byte[] zzW1(int i) {
        byte[] bArr = {0, 0, 0, 0, 93, 94, -110, 122, 40, 0, 0, 0, 67, -8, -110, 122, 0, 110, -54, 15, 0, 0, 0, 0, 0, 0, 0, 0, 32, -16, 14, 18, 0, 0, 16, 0, 0, 0, Ascii.DEL, 0, 5, 0, 0, 0, 3, 0, 0, 0, 2, 0, 0, 0, 0, 0, 16, 0, -52, 1, 16, 0, 32, 0, 0, 0};
        byte[] bArr2 = {0, 0, 0, 0, 0, 0, 0, 0, -112, -14, -100, 15, 36, 3, 0, 0, -90, -117, 14, 81, 86, 18, 92, 0, -12, 65, -94, 22, -24, 65, -94, 22, 0, 0, 0, 0, 0, 0, 0, 0, SignedBytes.MAX_POWER_OF_TWO, 38, 116, 3, 20, -73, 79, 0, -48, -72, 79, 0, 104, 70, 82, 22, -36, -2, -107, 83, -4, PatternStyle.Horizontal, 122, 3};
        byte[] bArr3 = {86, 18, 92, 0, 36, 3, 0, 0, SignedBytes.MAX_POWER_OF_TWO, 121, 41, 26, 86, 18, 92, 0, -68, PatternStyle.Wave, 107, 117, -92, -66, -28, 116, 56, 21, 5, -112, 24, 0, 0, 0, 0, 0, 83, 0, 32, 0, 0, 0, 115, 13, 1, 83, -33, -65, -28, 116, -32, -55, -22, 26, -112, -56, -22, 26, -40, -55, -22, 26, -22, 104, 72, 120};
        if (i == 0) {
            return bArr2;
        }
        if (i == 1) {
            return bArr;
        }
        if (i == 2) {
            return bArr3;
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: fontName");
    }

    private static byte[] zzW2(int i) {
        byte[] bArr = {0, 0, -74, 122, -116, -64, -80, 15, -4, -79, 79, 0, -4, -79, 79, 0, 32, -77, 79, 0, -103, 27, -107, 122, 14, PatternStyle.DiagonalCross, -72, -10, 0, 0, 0, 0, -24, -76, 79, 0, -77, 27, -107, 122, 62, 0, 15, 0, 32, -16, 14, 18, -80, -14, 14, 18, SignedBytes.MAX_POWER_OF_TWO, 110, -54, 15, 32, 0, 0, 0, SignedBytes.MAX_POWER_OF_TWO, 0, 96, 0, 0, 0, 79, 0, PatternStyle.DownwardDiagonal, -16, 14, 18, -112, -78, 79, 0, -107, -80, -91, 119, 0, 0, 0, 0, 7, 0, 0, 0, -28, -77, 79, 0, 0, 0, Ascii.DEL, 0, -117, -27, -97, 117, 0, 0, Ascii.DEL, 0, 0, 0, 0, 0, -80, -14, 14, 18, 60, -78, 79, 0, 112, -78, 79, 0, 40, 0, 0, 0, 24, 8, 16, 0};
        byte[] bArr2 = {0, 0, -91, 119, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -24, -14, PatternStyle.Plaid, 22, 12, -112, 110, 3, 67, 0, 70, 0, 40, -74, 79, 0, -117, -27, -97, 117, 0, 0, Ascii.DEL, 0, 0, 0, 0, 0, 32, 69, 82, 22, 56, -74, 79, 0, 88, -27, -97, 117, 32, 69, 82, 22, 0, 0, 0, 0, 120, -73, 79, 0, -85, -127, 21, 81, 32, 69, 82, 22, 73, 84, -110, -36, 36, 3, 0, 0, -59, -127, 21, 81, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 36, 3, 0, 0, 15, -116, 14, 81, 80, 102, 102, 3, 0, 0, 0, 0, -1, 93, 38, 81, -1, -1, -1, -1, -116, -73, 79, 0};
        byte[] bArr3 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 85, 17, 56, -23, 85, 17, -52, -87, 106, 0, 0, 0, 0, 0, 0, 0, 0, 0, 36, 3, 0, 0, 104, -53, -23, 26, 36, 3, 0, 0, -112, -53, -23, 26, PatternStyle.Vertical, -39, 83, 0, -104, -41, 83, 0, 75, -53, 71, 120, -112, -41, 83, 0, -96, -41, 83, 0, -112, -56, -22, 26, -40, -55, -22, 26, 124, -39, 83, 0, 36, 3, 0, 0, PatternStyle.Vertical, -122, 83, 17, 86, 18, 92, 0, 36, 3, 0, 0, 86, 18, 92, 0, 36, 3, 0, 0, 96, 107, 71, 26};
        if (i == 0) {
            return bArr2;
        }
        if (i == 1) {
            return bArr;
        }
        if (i == 2) {
            return bArr3;
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: fontName");
    }

    private void zzW3(int i) throws Exception {
        int i2 = i % 4;
        int i3 = i2 == 0 ? 0 : 4 - i2;
        for (int i4 = 0; i4 < i3; i4++) {
            this.zzW5.writeByte((byte) 0);
        }
    }

    private void zzX(zzEX zzex, boolean z) throws Exception {
        if (zzex.zzEj().zzEi()) {
            zzY(zzex);
            return;
        }
        if (z) {
            zzX(zzex);
        } else if (zzex.zzEk() == 32) {
            zzW(zzex);
        } else {
            if (zzex.zzEk() != 16) {
                throw new UnsupportedOperationException("Not implemented format is met.");
            }
            zzV(zzex);
        }
    }

    private void zzX4(int i) throws Exception {
        this.zzEr = this.zzW5.zzq().getPosition();
        this.zzCX++;
        this.zzW5.zzl(i);
        this.zzW5.zzl(0);
    }

    private void zzY(zzEX zzex, boolean z) throws Exception {
        if (zzex == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: iconImage");
        }
        if (zzex.zzEj() == null) {
            throw new IllegalArgumentException("iconImage.Bmp is null.");
        }
        if (zzex.zzEj().zzJn() != 40) {
            throw new IllegalArgumentException("iconImage.Bmp.HeaderSize is not equal to 40.");
        }
        this.zzW5.zzl(35);
        this.zzW5.zzl(1);
        this.zzW5.zzl(66);
        this.zzW5.zzl(32);
        this.zzW5.zzl(35);
        this.zzW5.zzl(1);
        this.zzW5.zzl(32);
        this.zzW5.zzl(32);
        if (zzex.zzEj().zzEi()) {
            this.zzW5.zzl(33521664);
        } else {
            this.zzW5.zzl(z ? 8913094 : 6684742);
        }
        this.zzW5.zzl(0);
        this.zzW5.zzl(0);
        this.zzW5.zzl(1065353216);
        this.zzW5.zzl(0);
        this.zzW5.zzl(0);
        this.zzW5.zzl(1065353216);
        this.zzW5.zzl(0);
        this.zzW5.zzl(0);
        this.zzW5.zzl(16777215);
        this.zzW5.zzl(0);
        this.zzW5.zzl(108);
        this.zzW5.zzl(zzex.zzEj().zzJn() + (z ? zzwI.length : zzwH.length));
        this.zzW5.zzl(zzex.zzEj().zzJn() + 108 + (z ? zzwI.length : zzwH.length));
        this.zzW5.zzl(z ? 136 : 4096);
        this.zzW5.zzl(32);
        this.zzW5.zzl(32);
        this.zzW5.zzl(zzex.zzEj().zzJn());
        this.zzW5.zzl(32);
        this.zzW5.zzl(z ? 34 : 32);
        this.zzW5.zzK((short) 1);
        this.zzW5.zzK((short) (z ? 1 : 32));
        this.zzW5.zzl(z ? 0 : 3);
        this.zzW5.zzl(z ? 136 : 4096);
        this.zzW5.zzl(0);
        this.zzW5.zzl(0);
        this.zzW5.zzl(0);
        this.zzW5.zzl(0);
        this.zzW5.writeBytes(z ? zzwI : zzwH);
        zzX(zzex, z);
    }

    public final void zzE4() throws Exception {
        zzX4(14);
        this.zzW5.zzl(0);
        this.zzW5.zzl(16);
        this.zzW5.zzl(20);
        zzKD();
        long position = this.zzW5.zzq().getPosition();
        this.zzW5.zzq().zzH(this.zzCV);
        this.zzW5.zzl((int) (position - this.zzCW));
        this.zzW5.zzl(this.zzCX);
        this.zzW5.zzq().zzH(position);
    }

    public final void zzE5() throws Exception {
        zzX4(70);
        this.zzW5.zzl(4);
        this.zzW5.zzl(0);
        zzKD();
    }

    public final void zzE6() throws Exception {
        zz8(40, 1);
    }

    public final void zzE7() throws Exception {
        zz8(18, 1);
    }

    public final void zzE8() throws Exception {
        zz8(25, 16777215);
    }

    public final void zzE9() throws Exception {
        this.zzCW = this.zzW5.zzq().getPosition();
        zzX4(1);
        this.zzW5.zzl(22);
        this.zzW5.zzl(1);
        this.zzW5.zzl(79);
        this.zzW5.zzl(46);
        this.zzW5.zzl(0);
        this.zzW5.zzl(0);
        this.zzW5.zzl(2727);
        this.zzW5.zzl(1765);
        this.zzW5.zzl(1179469088);
        this.zzW5.zzl(65536);
        this.zzCV = this.zzW5.zzq().getPosition();
        this.zzW5.zzl(0);
        this.zzW5.zzl(0);
        this.zzW5.zzl(2);
        this.zzW5.zzl(0);
        this.zzW5.zzl(0);
        this.zzW5.zzl(0);
        this.zzW5.zzl(1920);
        this.zzW5.zzl(EditingLanguage.FAEROESE);
        this.zzW5.zzl(510);
        this.zzW5.zzl(StyleIdentifier.GRID_TABLE_1_LIGHT_ACCENT_2);
        this.zzW5.zzl(0);
        this.zzW5.zzl(0);
        this.zzW5.zzl(0);
        this.zzW5.zzl(510000);
        this.zzW5.zzl(287000);
        zzKD();
    }

    public final void zzW4(int i) throws Exception {
        zzX4(82);
        this.zzW5.zzl(1);
        this.zzW5.zzl(i == 0 ? 16 : -11);
        this.zzW5.zzl(0);
        this.zzW5.zzl(0);
        this.zzW5.zzl(0);
        this.zzW5.zzl(i == 0 ? LogSeverity.ALERT_VALUE : 400);
        this.zzW5.writeByte((byte) 0);
        this.zzW5.writeByte((byte) 0);
        this.zzW5.writeByte((byte) 0);
        this.zzW5.writeByte((byte) (i == 0 ? 204 : 0));
        this.zzW5.writeByte((byte) (i == 0 ? 1 : 0));
        this.zzW5.writeByte((byte) (i == 0 ? 2 : 64));
        this.zzW5.writeByte((byte) (i != 0 ? 0 : 2));
        this.zzW5.writeByte((byte) 34);
        byte[] bytes = zzZO0.zzhU().getBytes(zzJY.zzWU(i));
        this.zzW5.writeBytes(bytes);
        int length = 64 - bytes.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.zzW5.writeByte((byte) 0);
        }
        this.zzW5.writeBytes(zzW2(i));
        this.zzW5.writeBytes(zzW1(i));
        this.zzW5.writeBytes(zzW0(i));
        this.zzW5.writeBytes(new byte[]{100, 118, 0, 8, 0, 0, 0, 0});
        zzKD();
    }

    public final void zzW5(int i) throws Exception {
        zz8(37, i);
    }

    public final void zzW6(int i) throws Exception {
        zz8(24, i);
    }

    public final void zzYJ(String str) throws Exception {
        if (str == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: comment");
        }
        zzX4(70);
        byte[] bytes = zzZO0.zzhU().getBytes(str);
        this.zzW5.zzl(bytes.length + 2);
        this.zzW5.writeBytes(bytes);
        this.zzW5.zzK((short) 0);
        zzW3(bytes.length + 2);
        zzKD();
    }

    public final void zzZ(zzEX zzex) throws Exception {
        zzX4(114);
        zzY(zzex, false);
        zzKD();
    }

    public final void zzZ(zzEX zzex, boolean z) throws Exception {
        zzX4(77);
        zzY(zzex, z);
        zzKD();
    }

    public final void zzZ(String str, int i, boolean z, zzPM zzpm) throws Exception {
        if (str != null) {
            zzX4(84);
            this.zzW5.zzl(i);
            this.zzW5.zzl(z ? 34 : 47);
            this.zzW5.zzl(101 - i);
            this.zzW5.zzl(z ? 46 : 59);
            this.zzW5.zzl(1);
            this.zzW5.zzl(1104445440);
            this.zzW5.zzl(1104451508);
            this.zzW5.zzl(i);
            this.zzW5.zzl(z ? 34 : 47);
            this.zzW5.zzl(str.length());
            this.zzW5.zzl(76);
            this.zzW5.zzl(4);
            this.zzW5.zzl(0);
            this.zzW5.zzl(0);
            this.zzW5.zzl(102);
            this.zzW5.zzl(66);
            int length = str.length() * 2;
            int i2 = length % 4;
            this.zzW5.zzl(length + 76 + (i2 == 0 ? 0 : 4 - i2));
            byte[] bytes = zzZO0.zzhU().getBytes(str);
            this.zzW5.writeBytes(bytes);
            zzW3(bytes.length);
            for (int i3 = 0; i3 < str.length(); i3++) {
                this.zzW5.zzl(zzZ(str.charAt(i3), zzpm));
            }
            zzKD();
            return;
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: text");
    }

    private void zzX(zzEX zzex) throws Exception {
        if (zzex.zzEj().zzEf().length == 128) {
            zzU(zzex);
        } else {
            if (zzex.zzEj().zzEf().length == 32) {
                zzT(zzex);
                return;
            }
            throw new UnsupportedOperationException("Not implemented format is met.");
        }
    }

    private void zzZ(zzEX zzex, int i) throws Exception {
        int i2 = i * 32;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 % i < 32) {
                byte b = zzex.zzEj().zzEe()[(i3 * 4) + 3];
                float f = (b & 255) / 255.0f;
                this.zzW5.writeByte((byte) ((zzex.zzEj().zzEe()[r2] & 255) * f));
                this.zzW5.writeByte((byte) ((zzex.zzEj().zzEe()[r2 + 1] & 255) * f));
                this.zzW5.writeByte((byte) ((zzex.zzEj().zzEe()[r2 + 2] & 255) * f));
                this.zzW5.writeByte(b);
            }
        }
    }

    private static int zzZ(char c, zzPM zzpm) {
        return (int) Math.ceil(zzSA.pointToPixel(zzpm.zzY7(c)));
    }

    private void zzY(zzEX zzex) throws Exception {
        int iSqrt = (int) Math.sqrt(((double) zzex.zzEj().zzEe().length) / 4.0d);
        if (iSqrt == 48 || iSqrt == 64 || iSqrt == 72 || iSqrt == 96 || iSqrt == 128 || iSqrt == 256) {
            zzZ(zzex, iSqrt);
            return;
        }
        if (iSqrt == 32) {
            zzP(zzex);
        } else {
            if (iSqrt != 24 && iSqrt != 16) {
                throw new UnsupportedOperationException("Not implemented format is met.");
            }
            zzY(zzex, iSqrt);
        }
    }

    private void zzY(zzEX zzex, int i) throws Exception {
        int i2 = (32 - i) / 2;
        int i3 = i2 * 32;
        for (int i4 = 0; i4 < i3; i4++) {
            this.zzW5.zzl(0);
        }
        int i5 = i * i;
        for (int i6 = 0; i6 < i5; i6++) {
            int i7 = i6 % i;
            if (i7 == 0) {
                for (int i8 = 0; i8 < i2; i8++) {
                    this.zzW5.zzl(0);
                }
            }
            byte b = zzex.zzEj().zzEe()[(i6 * 4) + 3];
            float f = (b & 255) / 255.0f;
            this.zzW5.writeByte((byte) ((zzex.zzEj().zzEe()[r6] & 255) * f));
            this.zzW5.writeByte((byte) ((zzex.zzEj().zzEe()[r6 + 1] & 255) * f));
            this.zzW5.writeByte((byte) ((zzex.zzEj().zzEe()[r6 + 2] & 255) * f));
            this.zzW5.writeByte(b);
            if (i7 == i - 1) {
                for (int i9 = 0; i9 < i2; i9++) {
                    this.zzW5.zzl(0);
                }
            }
        }
        for (int i10 = 0; i10 < i3; i10++) {
            this.zzW5.zzl(0);
        }
    }
}

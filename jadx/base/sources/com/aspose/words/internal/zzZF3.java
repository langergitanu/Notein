package com.aspose.words.internal;

import Oooo0oO.o0Oo0oo;

/* JADX INFO: loaded from: classes5.dex */
public class zzZF3 {
    private static final byte[] zzWLY;
    private static final byte[] zzWLZ;
    protected char[] zzWLX;
    protected boolean zzWQ6 = false;
    protected int zzWMi = 0;
    protected int zzWMh = 0;
    protected long zzWLW = 0;
    protected int zzWLV = 1;
    protected int zzWLU = 0;

    static {
        byte[] bArr = new byte[256];
        zzWLZ = bArr;
        bArr[95] = 1;
        for (int i = 0; i <= 25; i++) {
            byte[] bArr2 = zzWLZ;
            bArr2[i + 65] = 1;
            bArr2[i + 97] = 1;
        }
        for (int i2 = 192; i2 < 256; i2++) {
            zzWLZ[i2] = 1;
        }
        byte[] bArr3 = zzWLZ;
        bArr3[215] = 0;
        bArr3[247] = 0;
        bArr3[45] = -1;
        bArr3[46] = -1;
        bArr3[183] = -1;
        for (int i3 = 48; i3 <= 57; i3++) {
            zzWLZ[i3] = -1;
        }
        zzWLY = new byte[128];
        for (int i4 = 0; i4 <= 25; i4++) {
            byte[] bArr4 = zzWLY;
            bArr4[i4 + 65] = 1;
            bArr4[i4 + 97] = 1;
        }
        for (int i5 = 48; i5 <= 57; i5++) {
            zzWLY[i5] = 1;
        }
        byte[] bArr5 = zzWLY;
        bArr5[10] = 1;
        bArr5[13] = 1;
        bArr5[32] = 1;
        bArr5[45] = 1;
        bArr5[39] = 1;
        bArr5[40] = 1;
        bArr5[41] = 1;
        bArr5[43] = 1;
        bArr5[44] = 1;
        bArr5[46] = 1;
        bArr5[47] = 1;
        bArr5[58] = 1;
        bArr5[61] = 1;
        bArr5[63] = 1;
        bArr5[59] = 1;
        bArr5[33] = 1;
        bArr5[42] = 1;
        bArr5[35] = 1;
        bArr5[64] = 1;
        bArr5[36] = 1;
        bArr5[95] = 1;
        bArr5[37] = 1;
    }

    public static final boolean isSpaceChar(char c) {
        return c <= ' ';
    }

    public static final int zzI(String str, boolean z, boolean z2) {
        int length = str.length();
        for (int i = 1; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= 'z') {
                if (cCharAt >= 'a') {
                    continue;
                } else if (cCharAt <= 'Z') {
                    if (cCharAt < 'A' && ((cCharAt < '0' || cCharAt > '9') && cCharAt != '.' && cCharAt != '-' && (cCharAt != ':' || z))) {
                        return i;
                    }
                } else if (cCharAt != '_') {
                    return i;
                }
            } else if (z2) {
                if (!zzZDQ.zzX3(cCharAt)) {
                    return i;
                }
            } else {
                if (!zzZDQ.zzX5(cCharAt)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static final int zzJ(String str, boolean z, boolean z2) {
        int length = str.length();
        if (length <= 0) {
            return -1;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt <= 'z') {
            if (cCharAt < 'a') {
                if (cCharAt < 'A') {
                    if (cCharAt != ':' || z) {
                        return 0;
                    }
                } else if (cCharAt > 'Z' && cCharAt != '_') {
                    return 0;
                }
            }
        } else if (z2) {
            if (!zzZDQ.zzX4(cCharAt)) {
                return 0;
            }
        } else if (!zzZDQ.zzX6(cCharAt)) {
            return 0;
        }
        for (int i = 1; i < length; i++) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 <= 'z') {
                if (cCharAt2 >= 'a') {
                    continue;
                } else if (cCharAt2 <= 'Z') {
                    if (cCharAt2 < 'A' && ((cCharAt2 < '0' || cCharAt2 > '9') && cCharAt2 != '.' && cCharAt2 != '-' && (cCharAt2 != ':' || z))) {
                        return i;
                    }
                } else if (cCharAt2 != '_') {
                    return i;
                }
            } else if (z2) {
                if (!zzZDQ.zzX3(cCharAt2)) {
                    return i;
                }
            } else {
                if (!zzZDQ.zzX5(cCharAt2)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static final boolean zzX(char c, boolean z, boolean z2) {
        if (c > 'z') {
            return z2 ? zzZDQ.zzX3(c) : zzZDQ.zzX5(c);
        }
        if (c >= 'a') {
            return true;
        }
        if (c > 'Z') {
            return c == '_';
        }
        if (c >= 'A') {
            return true;
        }
        return (c >= '0' && c <= '9') || c == '.' || c == '-' || (c == ':' && !z);
    }

    public static String zzXl(char c) {
        if (Character.isISOControl(c)) {
            return o0Oo0oo.OooO0O0(c, "(CTRL-CHAR, code ", ")");
        }
        if (c <= 255) {
            return "'" + c + "' (code " + ((int) c) + ")";
        }
        return "'" + c + "' (code " + ((int) c) + " / 0x" + Integer.toHexString(c) + ")";
    }

    public static final boolean zzY(char c, boolean z, boolean z2) {
        if (c > 'z') {
            return z2 ? zzZDQ.zzX4(c) : zzZDQ.zzX6(c);
        }
        if (c >= 'a') {
            return true;
        }
        return c < 'A' ? c == ':' && !z : c <= 'Z' || c == '_';
    }

    public final void zzV(zzZF3 zzzf3) {
        this.zzWLX = zzzf3.zzWLX;
        this.zzWMi = zzzf3.zzWMi;
        this.zzWMh = zzzf3.zzWMh;
        this.zzWLW = zzzf3.zzWLW;
        this.zzWLV = zzzf3.zzWLV;
        this.zzWLU = zzzf3.zzWLU;
    }

    public final boolean zzXm(char c) {
        if (c > 'z') {
            return this.zzWQ6 ? zzZDQ.zzX3(c) : zzZDQ.zzX5(c);
        }
        if (c >= 'a') {
            return true;
        }
        if (c > 'Z') {
            return c == '_';
        }
        if (c >= 'A') {
            return true;
        }
        return (c >= '0' && c <= '9') || c == '.' || c == '-';
    }

    public final boolean zzXn(char c) {
        if (c > 'z') {
            return this.zzWQ6 ? zzZDQ.zzX4(c) : zzZDQ.zzX6(c);
        }
        if (c >= 'a') {
            return true;
        }
        if (c < 'A') {
            return false;
        }
        return c <= 'Z' || c == '_';
    }
}

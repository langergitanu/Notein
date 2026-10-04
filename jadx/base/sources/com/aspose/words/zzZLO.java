package com.aspose.words;

import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: loaded from: classes6.dex */
final class zzZLO {
    private static char[] zzYuR = {'+', '-', '*', IOUtils.DIR_SEPARATOR_UNIX, '%', '^', '=', '>', '<'};
    private int zzYuS;
    private String zzYuT;
    private int zzYuU;
    private int zzYuV;

    public zzZLO(String str) {
        zzLe(str);
    }

    private void zzLe(String str) {
        int length;
        this.zzYuS = 0;
        this.zzYuV = 0;
        this.zzYuU = 0;
        if (!com.aspose.words.internal.zzZYD.zzXk(str)) {
            this.zzYuT = "";
            return;
        }
        if (com.aspose.words.internal.zzZYD.zzZ1(str.charAt(0))) {
            this.zzYuS |= 32;
        }
        if (com.aspose.words.internal.zzZYD.zzZ1(str.charAt(str.length() - 1))) {
            this.zzYuS |= 64;
        }
        String strZzTX = com.aspose.words.internal.zzZKN.zzTX(str);
        this.zzYuT = strZzTX;
        if (strZzTX.length() <= 0) {
            this.zzYuS = 0;
            return;
        }
        if (this.zzYuT.charAt(0) != '-') {
            length = 0;
        } else if (this.zzYuT.length() < 2) {
            this.zzYuS = 0;
            return;
        } else {
            this.zzYuS |= 4;
            length = 1;
        }
        String strZzH1 = com.aspose.words.internal.zzJB.zzH1();
        if (strZzH1.length() + length <= this.zzYuT.length() && com.aspose.words.internal.zzZKN.zzX(this.zzYuT.substring(length, strZzH1.length() + length), strZzH1, com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
            length += strZzH1.length();
            if (length == this.zzYuT.length()) {
                this.zzYuS = 0;
                return;
            }
            this.zzYuS |= 8;
        }
        char cZzH5 = com.aspose.words.internal.zzJB.zzH5();
        for (int i = 0; i < this.zzYuT.length() && Character.isDigit(this.zzYuT.charAt(i)); i++) {
            this.zzYuU++;
        }
        String str2 = this.zzYuT;
        if (com.aspose.words.internal.zzZKN.zzZ(str2, zzYuR, length, str2.length() - length) != -1) {
            this.zzYuS |= 128;
            return;
        }
        int i2 = length;
        while (i2 < this.zzYuT.length()) {
            if (!Character.isDigit(this.zzYuT.charAt(i2))) {
                if (zzZ5p() || this.zzYuT.charAt(i2) != cZzH5) {
                    break;
                }
                this.zzYuS |= 2;
                int i3 = i2 - length;
                this.zzYuV = i3;
                if (i3 == 0 && (i2 == this.zzYuT.length() - 1 || !Character.isDigit(this.zzYuT.charAt(i2 + 1)))) {
                    this.zzYuS = 0;
                    return;
                }
            }
            i2++;
        }
        if (!zzZ5p()) {
            this.zzYuV = i2 - length;
        }
        if (i2 < this.zzYuT.length()) {
            if (zzZ5o() || this.zzYuT.length() - i2 != strZzH1.length() || !com.aspose.words.internal.zzZKN.zzX(this.zzYuT.substring(i2), strZzH1, com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
                this.zzYuS = 0;
                this.zzYuV = 0;
                return;
            }
            this.zzYuS |= 16;
        }
        this.zzYuS |= 1;
    }

    public final boolean isNegative() {
        return (this.zzYuS & 4) == 4;
    }

    public final boolean zzXl() {
        return (this.zzYuS & 1) == 1;
    }

    public final String zzZ5j() {
        return this.zzYuT;
    }

    public final int zzZ5k() {
        return this.zzYuU;
    }

    public final int zzZ5l() {
        return this.zzYuV;
    }

    public final boolean zzZ5m() {
        return (this.zzYuS & 128) == 128;
    }

    public final boolean zzZ5n() {
        return (this.zzYuS & 16) == 16;
    }

    public final boolean zzZ5o() {
        return (this.zzYuS & 8) == 8;
    }

    public final boolean zzZ5p() {
        return (this.zzYuS & 2) == 2;
    }

    public final boolean zzZ5q() {
        return (this.zzYuS & 64) == 64;
    }

    public final boolean zzZ5r() {
        return (this.zzYuS & 32) == 32;
    }
}

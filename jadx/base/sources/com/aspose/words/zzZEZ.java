package com.aspose.words;

import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: loaded from: classes6.dex */
final class zzZEZ {
    private char zzYlB;
    private char zzYlC;
    private String zzZE2;
    private int zzp8;

    public zzZEZ(String str) {
        StringBuilder sb = new StringBuilder(str);
        com.aspose.words.internal.zzZNH.zzZ(sb, IOUtils.LINE_SEPARATOR_WINDOWS, IOUtils.LINE_SEPARATOR_UNIX);
        com.aspose.words.internal.zzZNH.zzZ(sb, ControlChar.PARAGRAPH_BREAK_CHAR, '\n');
        com.aspose.words.internal.zzZNH.zzZ(sb, (char) 65535, (char) 0);
        this.zzZE2 = sb.toString();
        zzz1(-1);
    }

    private boolean zzz0(int i) {
        return i >= 0 && i < this.zzZE2.length();
    }

    private void zzz1(int i) {
        this.zzp8 = i;
        this.zzYlC = zzz0(i) ? this.zzZE2.charAt(i) : (char) 65535;
        int i2 = i + 1;
        this.zzYlB = zzz0(i2) ? this.zzZE2.charAt(i2) : (char) 65535;
    }

    public final char zzFP() {
        return this.zzYlB;
    }

    public final char zzIw() {
        return this.zzYlC;
    }

    public final zzZEY zzYYR() {
        return new zzZEY(this, this.zzp8);
    }

    public final void zzYYS() {
        zzz1(this.zzp8 - 1);
    }

    public final void zzYYT() {
        zzz3(1);
    }

    public final void zzZ(zzZEY zzzey) {
        zzz1(zzzey.getPosition());
    }

    public final String zzz2(int i) {
        if (i <= 0) {
            return "";
        }
        int i2 = this.zzp8 + 1;
        int i3 = i + i2;
        return (zzz0(i2) && zzz0(i3 + (-1))) ? this.zzZE2.substring(i2, i3) : "";
    }

    public final void zzz3(int i) {
        zzz1(this.zzp8 + i);
    }
}

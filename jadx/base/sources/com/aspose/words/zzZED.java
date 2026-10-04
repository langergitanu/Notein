package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZED {
    private StringBuilder zzYuF;

    public zzZED() {
        this.zzYuF = new StringBuilder();
    }

    private int zzYYf() {
        int i = 0;
        while (i < this.zzYuF.length() && zzZDY.isWhitespace(this.zzYuF.charAt(i))) {
            i++;
        }
        return i;
    }

    public final void clear() {
        this.zzYuF.setLength(0);
    }

    public final boolean isEmpty() {
        return this.zzYuF.length() == 0;
    }

    public final String zz0T() {
        return this.zzYuF.toString();
    }

    public final String zzYYg() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.zzYuF.length(); i++) {
            char cCharAt = this.zzYuF.charAt(i);
            if (zzZDY.isWhitespace(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    public final String zzYYh() {
        int iZzYYf = zzYYf();
        if (iZzYYf <= 0) {
            return "";
        }
        char[] cArr = new char[iZzYYf];
        this.zzYuF.getChars(0, iZzYYf, cArr, 0);
        return new String(cArr);
    }

    public final void zzYYi() {
        com.aspose.words.internal.zzZNH.zzZ(this.zzYuF, "\u0000", "�");
    }

    public final void zzYYj() {
        com.aspose.words.internal.zzZNH.zzZ(this.zzYuF, "\u0000", (String) null);
    }

    public final void zzYYk() {
        int iZzYYf = zzYYf();
        if (iZzYYf > 0) {
            this.zzYuF.delete(0, iZzYYf);
        }
    }

    public final boolean zzYYl() {
        for (int i = 0; i < this.zzYuF.length(); i++) {
            char cCharAt = this.zzYuF.charAt(i);
            if (cCharAt != 0 && !zzZDY.isWhitespace(cCharAt)) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzYYm() {
        for (int i = 0; i < this.zzYuF.length(); i++) {
            if (!zzZDY.isWhitespace(this.zzYuF.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public final void zzYYn() {
        if (this.zzYuF.length() <= 0 || this.zzYuF.charAt(0) != '\n') {
            return;
        }
        this.zzYuF.delete(0, 1);
    }

    public final void zzZ(zzZED zzzed) {
        com.aspose.words.internal.zzZNH.zzZ(this.zzYuF, zzzed.zzYuF);
    }

    public zzZED(String str) {
        this.zzYuF = new StringBuilder(str);
    }
}

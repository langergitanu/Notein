package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzZEC extends zzZG4 {
    private boolean zzYkR;
    private String zzZi;

    public zzZEC(String str) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        this.zzZi = str;
    }

    public final String getText() {
        return this.zzZi;
    }

    @Override // com.aspose.words.zzZG4
    public final boolean zzM(boolean z, boolean z2) {
        if (!z) {
            return true;
        }
        if (z2) {
            com.aspose.words.internal.zzZYD.zzXk(this.zzZi);
            this.zzYkR = true;
        } else {
            this.zzYkR = zzZDY.zzn(this.zzZi, true);
        }
        return true;
    }

    @Override // com.aspose.words.zzZG4
    public final void zzZ(StringBuilder sb, zzXYQ zzxyq) {
        for (int i = 0; i < this.zzZi.length(); i++) {
            char cCharAt = this.zzZi.charAt(i);
            if (cCharAt == '&') {
                com.aspose.words.internal.zzZNH.zzU(sb, "&amp;");
            } else if (cCharAt == '<') {
                com.aspose.words.internal.zzZNH.zzU(sb, "&lt;");
            } else if (cCharAt == '>') {
                com.aspose.words.internal.zzZNH.zzU(sb, "&gt;");
            } else if (cCharAt != 160) {
                sb.append(cCharAt);
            } else {
                com.aspose.words.internal.zzZNH.zzU(sb, "&#xa0;");
            }
        }
    }

    @Override // com.aspose.words.zzZG4
    public final boolean zzZ2D() {
        return this.zzYkR;
    }

    @Override // com.aspose.words.zzZG4
    public final boolean zzZ2E() {
        return false;
    }
}

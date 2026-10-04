package com.aspose.words;

import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: loaded from: classes6.dex */
final class zzU3 extends zzTN {
    private zzY3E zzZtv;
    private String zzZtw;
    private int zzZtx;

    public zzU3(int i, String str, zzY3E zzy3e) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        this.zzZtx = i;
        this.zzZtw = str;
        this.zzZtv = zzy3e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.zzZtx;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "" : "lte" : TranslateLanguage.LITHUANIAN : "gte" : "gt";
        com.aspose.words.internal.zzZNH.zzU(sb, str);
        if (str.length() > 0) {
            sb.append(ControlChar.SPACE_CHAR);
        }
        com.aspose.words.internal.zzZNH.zzU(sb, this.zzZtw);
        if (this.zzZtv != null) {
            sb.append(ControlChar.SPACE_CHAR);
            com.aspose.words.internal.zzZNH.zzZ(sb, this.zzZtv);
        }
        return sb.toString();
    }

    @Override // com.aspose.words.zzTN
    public final boolean zz8Z() {
        return false;
    }

    @Override // com.aspose.words.zzTN
    public final boolean zzZ(zzZRE zzzre) {
        zzZRF zzzrfZzMo = zzzre.zzMo(this.zzZtw);
        if (zzzrfZzMo == null) {
            return false;
        }
        if (this.zzZtv == null) {
            return true;
        }
        if (zzzrfZzMo.zzZh0() == null) {
            return false;
        }
        return zzzrfZzMo.zzZh0().zzZ(this.zzZtv, this.zzZtx);
    }
}

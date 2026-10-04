package com.aspose.words;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
final class zzOK extends zzMN {
    private String zzYH;

    public zzOK(String str) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        this.zzYH = str;
    }

    @Override // com.aspose.words.zzQB
    public final boolean zzZ(zzZBM zzzbm, int i) {
        String language = zzzbm.getLanguage();
        if (com.aspose.words.internal.zzZYD.zzi(language, this.zzYH)) {
            return true;
        }
        new StringBuilder();
        String string = Bundle.getString(this.zzYH);
        if (language.length() < string.length()) {
            return false;
        }
        return com.aspose.words.internal.zzZYD.zzi(language.substring(0, string.length()), string);
    }

    @Override // com.aspose.words.zzMD
    public final String zzZXr() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("lang("), this.zzYH, ")");
    }

    @Override // com.aspose.words.zzMD
    public final String zzZXu() {
        return ":lang(" + com.aspose.words.internal.zzS0.zzl(this.zzYH) + ")";
    }
}

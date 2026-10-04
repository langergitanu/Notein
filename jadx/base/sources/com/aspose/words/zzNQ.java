package com.aspose.words;

import com.aspose.slides.OooOOO;

/* JADX INFO: loaded from: classes6.dex */
final class zzNQ {
    private String mName;
    private String zzZpC;
    static zzNQ zzZpB = new zzNQ(null, null);
    static zzNQ zzZpA = new zzNQ(null, "");

    public zzNQ(String str, String str2) {
        this.zzZpC = str;
        this.mName = str2;
    }

    public final String getName() {
        return this.mName;
    }

    public final String getPrefix() {
        return this.zzZpC;
    }

    public final boolean isEmpty() {
        return "".equals(this.mName);
    }

    public final boolean matches(String str) {
        String str2 = this.mName;
        if (str2 == null) {
            return true;
        }
        return com.aspose.words.internal.zzZKN.equals(str2, str);
    }

    public final boolean zzZVP() {
        return this.mName != null;
    }

    public final String zzZx(String str, String str2) {
        if (com.aspose.words.internal.zzZKN.equals(this.mName, str2)) {
            return str;
        }
        String str3 = this.mName;
        return str3 == null ? com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("*|", str) : str3.length() == 0 ? com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("|", str) : OooOOO.OooO0O0(new StringBuilder(), this.zzZpC, "|", str);
    }
}

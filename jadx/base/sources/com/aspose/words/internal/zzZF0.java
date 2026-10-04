package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZF0 {
    protected String zzWLI;
    protected int zzWLJ;
    protected String zzWLK;
    protected String zzZnu;
    protected String zzZpC;

    public zzZF0(String str, String str2, int i) {
        this.zzZnu = str2;
        this.zzZpC = str;
        this.zzWLJ = i;
    }

    public final String getValue(String str) {
        if (this.zzWLI == null) {
            int i = this.zzWLJ;
            if (i != 0) {
                str = str.substring(i);
            }
            this.zzWLI = str;
        }
        return this.zzWLI;
    }

    public final void setValue(String str) {
        this.zzWLI = str;
    }

    public final void zzK(String str, String str2, int i) {
        this.zzZnu = str2;
        this.zzZpC = str;
        this.zzWLJ = i;
        this.zzWLK = null;
        this.zzWLI = null;
    }

    public final zzZR1 zzXN4() {
        String str = this.zzZpC;
        if (str == null) {
            String str2 = this.zzWLK;
            return str2 == null ? new zzZR1(this.zzZnu) : new zzZR1(str2, this.zzZnu);
        }
        String str3 = this.zzWLK;
        if (str3 == null) {
            str3 = "";
        }
        return zzZH8.zzl(str3, this.zzZnu, str);
    }

    public final boolean zzXO(String str, String str2) {
        String str3 = this.zzZnu;
        if (str2 != str3 && !str2.equals(str3)) {
            return false;
        }
        String str4 = this.zzWLK;
        if (str4 == str) {
            return true;
        }
        return str == null ? str4 == null || str4.length() == 0 : str4 != null && str.equals(str4);
    }

    public final String zzYT(String str, int i) {
        if (this.zzWLI == null) {
            this.zzWLI = str.substring(this.zzWLJ, i);
        }
        return this.zzWLI;
    }
}

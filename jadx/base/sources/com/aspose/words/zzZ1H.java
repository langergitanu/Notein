package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZ1H {
    private boolean zzY2I;
    private String zzY2J;
    private String zzY2K;
    private String zzY2L;

    private String zzIq(String str) {
        return com.aspose.words.internal.zzZVR.zzWv(zzKR(str));
    }

    private boolean zzYHr() {
        return this.zzY2L != null;
    }

    public abstract String zzKR(String str);

    public final boolean zzP(String str, boolean z, boolean z2) throws Exception {
        return zzZ(str, "", "", z, z2);
    }

    public abstract void zzY(String str, String str2, String str3, boolean z) throws Exception;

    public final void zzYHs() throws Exception {
        if (zzYHr()) {
            zzZ1E();
        }
    }

    public final void zzYHt() throws Exception {
        if (zzYHr()) {
            zzY(this.zzY2L, this.zzY2K, this.zzY2J, this.zzY2I);
        }
    }

    public final boolean zzZ(String str, String str2, String str3, boolean z, boolean z2) throws Exception {
        if (zzYHr() || !com.aspose.words.internal.zzZYD.zzXk(str) || !zzr(str, z)) {
            return false;
        }
        String strZzIq = zzIq(str);
        this.zzY2L = strZzIq;
        this.zzY2K = str2;
        this.zzY2J = str3;
        this.zzY2I = z2;
        zzY(strZzIq, str2, str3, z2);
        return true;
    }

    public abstract void zzZ1E() throws Exception;

    public final void zzZlN() throws Exception {
        if (zzYHr()) {
            zzZ1E();
            this.zzY2L = null;
            this.zzY2K = null;
            this.zzY2J = null;
        }
    }

    public abstract boolean zzr(String str, boolean z) throws Exception;
}

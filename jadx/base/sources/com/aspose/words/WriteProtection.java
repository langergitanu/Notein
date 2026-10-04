package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class WriteProtection implements Cloneable {
    private boolean zzWTO;
    private String zzjf = "";
    private zzYMB zzYQR = new zzYMB();

    public final String getPassword() {
        return this.zzjf;
    }

    public boolean getReadOnlyRecommended() {
        return this.zzWTO;
    }

    public boolean isWriteProtected() {
        return com.aspose.words.internal.zzZYD.zzXk(this.zzjf) || !this.zzYQR.isEmpty();
    }

    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public void setPassword(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "password");
        this.zzjf = str;
        this.zzYQR.zzXFz = null;
    }

    public void setReadOnlyRecommended(boolean z) {
        this.zzWTO = z;
    }

    public boolean validatePassword(String str) {
        if (!com.aspose.words.internal.zzZYD.zzXk(str)) {
            return false;
        }
        if (this.zzYQR.zzXFz == null) {
            return com.aspose.words.internal.zzZKN.equals(this.zzjf, str);
        }
        zzYMB zzymb = new zzYMB();
        zzymb.zzZ(str, this.zzYQR);
        return com.aspose.words.internal.zzZ1.zzZ(this.zzYQR.zzXFz, zzymb.zzXFz);
    }

    public final WriteProtection zzXRT() {
        WriteProtection writeProtection = (WriteProtection) memberwiseClone();
        writeProtection.zzYQR = this.zzYQR.zzYnT();
        return writeProtection;
    }

    public final zzYMB zzZo8() {
        return this.zzYQR;
    }

    public final void zzZof() {
        if (com.aspose.words.internal.zzZYD.zzXk(this.zzjf) && this.zzYQR.isEmpty()) {
            zzYMB zzymb = this.zzYQR;
            zzymb.zzZ(this.zzjf, zzymb);
        }
    }
}

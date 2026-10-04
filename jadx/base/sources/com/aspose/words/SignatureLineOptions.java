package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class SignatureLineOptions {
    private boolean zzXee;
    private String zzXej = "";
    private String zzXei = "";
    private String zzXeh = "";
    private boolean zzXeg = true;
    private String zzXef = "";
    private boolean zzXed = true;

    public boolean getAllowComments() {
        return this.zzXee;
    }

    public boolean getDefaultInstructions() {
        return this.zzXeg;
    }

    public String getEmail() {
        return this.zzXeh;
    }

    public String getInstructions() {
        return this.zzXef;
    }

    public boolean getShowDate() {
        return this.zzXed;
    }

    public String getSigner() {
        return this.zzXej;
    }

    public String getSignerTitle() {
        return this.zzXei;
    }

    public void setAllowComments(boolean z) {
        this.zzXee = z;
    }

    public void setDefaultInstructions(boolean z) {
        this.zzXeg = z;
        if (z) {
            this.zzXef = "";
        }
    }

    public void setEmail(String str) {
        this.zzXeh = str;
    }

    public void setInstructions(String str) {
        this.zzXef = str;
    }

    public void setShowDate(boolean z) {
        this.zzXed = z;
    }

    public void setSigner(String str) {
        this.zzXej = str;
    }

    public void setSignerTitle(String str) {
        this.zzXei = str;
    }
}

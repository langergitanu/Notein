package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY72 {
    private String zzX6Z;
    private boolean zzZiA = true;
    private boolean zzYwL = true;
    private String zzX6Y = "";
    private String mName = "";
    private String zzXCk = "";
    private char zzX6X = 0;

    public zzY72(String str) {
        this.zzX6Z = str;
    }

    public final String getCaption() {
        return this.zzX6Z;
    }

    public final String getName() {
        return this.mName;
    }

    public final String getTag() {
        return this.zzXCk;
    }

    public final void setCaption(String str) {
        this.zzX6Z = str;
    }

    public final void setName(String str) {
        this.mName = str;
    }

    public final void setTag(String str) {
        this.zzXCk = str;
    }

    public final void zzAi(String str) {
        this.zzX6Y = str;
    }

    public final void zzXL(char c) {
        this.zzX6X = c;
    }

    public final int zzY0g() {
        boolean z = this.zzZiA;
        return this.zzYwL ? (z ? 1 : 0) | 2 : z ? 1 : 0;
    }

    public final char zzY0h() {
        return this.zzX6X;
    }

    public final String zzY0i() {
        return this.zzX6Y;
    }

    public final void zzkn(int i) {
        this.zzZiA = (i & 1) != 0;
        this.zzYwL = (i & 2) != 0;
    }
}

package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZQ1 {
    private String mErrorMessage;
    private Bookmark zzYDu;
    private zzZQV zzYDv;

    public zzZQ1() {
    }

    public final Bookmark getBookmark() {
        return this.zzYDu;
    }

    public final String getErrorMessage() {
        return this.mErrorMessage;
    }

    public final boolean isError() {
        return this.mErrorMessage != null;
    }

    public final zzZQV zzZdj() {
        return this.zzYDv;
    }

    public zzZQ1(String str, zzZQV zzzqv, Bookmark bookmark) {
        this.mErrorMessage = str;
        this.zzYDv = zzzqv;
        this.zzYDu = bookmark;
    }
}

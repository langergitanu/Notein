package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class ComparisonEvaluationResult {
    private String mErrorMessage;
    private boolean zzZtu;

    public ComparisonEvaluationResult(boolean z) {
        this.zzZtu = z;
    }

    public final String getErrorMessage() {
        return this.mErrorMessage;
    }

    public final boolean getResult() {
        return this.zzZtu;
    }

    public ComparisonEvaluationResult(String str) {
        this.mErrorMessage = str;
    }
}

package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class ComparisonExpression {
    private String zzZto;
    private String zzZtp;
    private String zzZtr;

    public ComparisonExpression(String str, String str2, String str3) {
        this.zzZtr = str;
        this.zzZtp = str2;
        this.zzZto = str3;
    }

    public final String getComparisonOperator() {
        return this.zzZtp;
    }

    public final String getLeftExpression() {
        return this.zzZtr;
    }

    public final String getRightExpression() {
        return this.zzZto;
    }
}

package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZU3 extends zzTL {
    private String zzYKF;

    public zzZU3(String str) {
        this.zzYKF = str;
    }

    public static zzZU3 zzMy(String str) {
        return new zzZU3(com.aspose.words.internal.zzZKN.format("!Undefined Bookmark, {0}", str.toUpperCase()));
    }

    public static zzZU3 zzZiV() {
        return new zzZU3("!Syntax Error");
    }

    @Override // com.aspose.words.zzTL
    public final String zz8W() {
        return this.zzYKF;
    }

    @Override // com.aspose.words.zzTL
    public final int zzbY() {
        return 7;
    }
}

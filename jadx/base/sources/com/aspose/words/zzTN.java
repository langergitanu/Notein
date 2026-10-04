package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzTN {
    public static zzTN zzSO(String str) throws Exception {
        return new zzZBO().zzSO(str);
    }

    public boolean zz8Z() {
        return true;
    }

    public abstract boolean zzZ(zzZRE zzzre);

    public final String zzZYm() {
        if (!zz8Z()) {
            return toString();
        }
        return "(" + toString() + ")";
    }
}

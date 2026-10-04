package com.aspose.words;

import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzZTN {
    HashMap<Integer, Integer> zzYK8 = new HashMap<>();
    com.aspose.words.internal.zzXB zzYK9;
    zzZ9I zzYKa;
    zzZD8 zzYKb;
    DocumentBase zzYKc;
    private IWarningCallback zzZG0;

    public zzZTN(DocumentBase documentBase, zzZD8 zzzd8, zzZ9I zzz9i, IWarningCallback iWarningCallback) {
        this.zzYKc = documentBase;
        this.zzYKb = zzzd8;
        this.zzYKa = zzz9i;
        this.zzZG0 = iWarningCallback;
    }

    public final void zzMx(String str) {
        zzY1Z.zzY(this.zzZG0, 10, str, new Object[0]);
    }

    public final void zzTG(String str) {
        zzY1Z.zzZ(this.zzZG0, 10, str, new Object[0]);
    }

    public zzZTN(DocumentBase documentBase, zzZD8 zzzd8, zzZ9I zzz9i, com.aspose.words.internal.zzXB zzxb, IWarningCallback iWarningCallback) {
        this.zzYKc = documentBase;
        this.zzYKb = zzzd8;
        this.zzYKa = zzz9i;
        this.zzYK9 = zzxb;
        this.zzZG0 = iWarningCallback;
    }
}

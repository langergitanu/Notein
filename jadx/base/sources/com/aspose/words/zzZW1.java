package com.aspose.words;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
class zzZW1 extends zzYU4 {
    private com.aspose.words.internal.zz77 zzYPj;
    private zzYO3 zzZ88;

    public zzZW1(com.aspose.words.internal.zz77 zz77Var, zzYO3 zzyo3) throws Exception {
        this(zz77Var, (IWarningCallback) null, 9, zzyo3);
    }

    private void zzZ(com.aspose.words.internal.zz77 zz77Var, zzYO3 zzyo3) {
        this.zzYPj = zz77Var;
        this.zzZ88 = zzyo3;
    }

    @Override // com.aspose.words.zzYU4
    public final int zzZk6() {
        return zzZXP.zzNk(getValue());
    }

    public final com.aspose.words.internal.zz77 zzZmN() {
        return this.zzYPj;
    }

    public final zzYO3 zzZqn() {
        return this.zzZ88;
    }

    public zzZW1(com.aspose.words.internal.zz77 zz77Var, IWarningCallback iWarningCallback, int i, zzYO3 zzyo3) throws Exception {
        super(zz77Var.zzR1(), iWarningCallback, i);
        zzZ(zz77Var, zzyo3);
    }

    public zzZW1(com.aspose.words.internal.zzZOP zzzop, zzYO3 zzyo3) throws Exception {
        this(zzzop, zzyo3, (byte) 0);
    }

    private zzZW1(com.aspose.words.internal.zzZOP zzzop, zzYO3 zzyo3, byte b) throws Exception {
        super(zzzop, (IWarningCallback) null, 9);
        zzZ((com.aspose.words.internal.zz77) null, zzyo3);
    }

    public zzZW1(com.aspose.words.internal.zz77 zz77Var, zzYO3 zzyo3, String str, Map<String, String> map) {
        super(str, map);
        zzZ(zz77Var, zzyo3);
    }
}

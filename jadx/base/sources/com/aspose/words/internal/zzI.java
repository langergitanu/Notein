package com.aspose.words.internal;

import com.huawei.hms.network.embedded.C18115b5;

/* JADX INFO: loaded from: classes5.dex */
public final class zzI extends zzZL {
    private String mName;
    private String zzZM;
    private long zzZN;

    public zzI(long j, String str) {
        this.zzZN = j;
        this.zzZM = str;
        this.mName = zzL(str);
    }

    public static String zzL(String str) {
        return new zzZNR("\\s").zzZS(str, C18115b5.CONNECTOR);
    }

    public final String getDisplayName() {
        return this.zzZM;
    }

    public final String getName() {
        return this.mName;
    }

    public final void zzY(long j) {
        this.zzZN = j;
    }

    @Override // com.aspose.words.internal.zzZL
    public final void zzZ(zz6 zz6Var) throws Exception {
        zz6Var.zzZ(this);
    }

    public final boolean zzZS() {
        return zzZKN.zzS(this.mName, C18115b5.CONNECTOR, zzZOF.ORDINAL$4894b8c8);
    }

    public final long zzZT() {
        return this.zzZN;
    }
}

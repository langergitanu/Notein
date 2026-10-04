package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class zzSG implements zzHH {
    private int zzWv;
    private static zzHH zzOq = new zzSG(0);
    private static zzHH zzOp = new zzSG(1);

    private zzSG(int i) {
        this.zzWv = i;
    }

    public static zzHH zzk(boolean z) {
        return z ? zzOp : zzOq;
    }

    @Override // com.aspose.words.internal.zzHH
    public final int zzZ(ArrayList<zzY4> arrayList, String str) {
        return this.zzWv;
    }
}

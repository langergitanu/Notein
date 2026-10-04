package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzV5 extends zzVC {
    public static zzV5 zzSw = new zzV5();

    @Override // com.aspose.words.internal.zzV6
    public final void zzZ(zzWH zzwh, ArrayList<zzWF> arrayList) {
        zzwh.zzZo((arrayList.size() / 2) + zzwh.zzUN());
    }

    @Override // com.aspose.words.internal.zzVC
    public final boolean zzZg(int i) {
        return i % 2 == 1;
    }
}

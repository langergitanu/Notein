package com.aspose.words.internal;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzW3 extends zzVC {
    public static zzW3 zzTa = new zzW3();

    @Override // com.aspose.words.internal.zzV6
    public final void zzZ(zzWH zzwh, ArrayList<zzWF> arrayList) {
        if (arrayList.size() < 4) {
            zzwh.zzUE();
            return;
        }
        zzUZ zzuz = new zzUZ();
        zzuz.zzF(((zzWF) C21505OooO0Oo.OooO00o(4, arrayList)).getDoubleValue());
        zzuz.zzE(arrayList.get(arrayList.size() - 3).getDoubleValue());
        zzuz.zzZc(arrayList.get(arrayList.size() - 2).getIntValue());
        zzuz.zzZd(arrayList.get(arrayList.size() - 1).getIntValue());
        zzuz.zzD(0.0d);
        zzwh.zzZ(zzuz);
    }

    @Override // com.aspose.words.internal.zzVC
    public final boolean zzZg(int i) {
        return i == 1 || i == 5;
    }
}

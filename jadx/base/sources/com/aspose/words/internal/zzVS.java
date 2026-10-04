package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzVS extends zzVC {
    public static zzVS zzSU = new zzVS();

    @Override // com.aspose.words.internal.zzV6
    public final void zzZ(zzWH zzwh, ArrayList<zzWF> arrayList) {
        if (arrayList.size() >= 2) {
            zzV5.zzSw.zzZ(zzwh, arrayList);
        }
        for (int i = 0; i < zzAN.zzO(zzwh.zzUN(), 8); i++) {
            zzwh.readByte();
        }
    }
}

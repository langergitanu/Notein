package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzV8 extends zzWE {
    public static zzV8 zzSy = new zzV8();

    @Override // com.aspose.words.internal.zzWE, com.aspose.words.internal.zzWG
    public final void zzZ(zzWH zzwh) {
        zzUZ zzuz = new zzUZ();
        zzuz.zzZd(zzwh.zzUH().getIntValue());
        zzuz.zzZc(zzwh.zzUH().getIntValue());
        zzuz.zzE(zzwh.zzUH().getDoubleValue());
        zzuz.zzF(zzwh.zzUH().getDoubleValue());
        zzuz.zzD(zzwh.zzUH().getDoubleValue());
        if (zzwh.hasErrors()) {
            return;
        }
        zzwh.zzZ(zzuz);
    }
}

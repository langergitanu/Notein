package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZK extends zzH {
    @Override // com.aspose.words.internal.zzH, com.aspose.words.internal.zz6
    public final void zzZ(zzZU zzzu) throws Exception {
        if (zzzu.isHidden() || zzzu.zzZr().zzPg() == 0.0f) {
            return;
        }
        if (zzzu.zzZy().zzPD() == 0 && zzzu.zzZq().zzPD() == 0) {
            return;
        }
        super.zzZ(zzzu);
    }

    @Override // com.aspose.words.internal.zzH
    public final zzZQ4 zzZ(zzP8 zzp8, float f) throws Exception {
        return zzP6.zzX(zzp8, f);
    }

    @Override // com.aspose.words.internal.zzH, com.aspose.words.internal.zz6
    public final void zzZ(zzZG zzzg) throws Exception {
        if (zzzg.isEmpty()) {
            return;
        }
        super.zzZ(zzzg);
    }
}

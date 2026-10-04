package com.aspose.words;

import com.huawei.hms.network.embedded.C18358t1;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ7H extends zzTI {
    @Override // com.aspose.words.zzTI, com.aspose.words.zzYI
    public final String getText() {
        return com.aspose.words.internal.zzZKN.format("{0}{1}{2}", C18358t1.g.f56183c, super.getText(), C18358t1.g.f56183c);
    }

    @Override // com.aspose.words.zzTI, com.aspose.words.zzYI
    public final boolean zzZ(zzYI zzyi) {
        zzY(zzyi);
        return true;
    }

    @Override // com.aspose.words.zzYI
    public final int zzb4() {
        return 1;
    }

    @Override // com.aspose.words.zzYI
    public final boolean zzf(String str, int i) {
        return false;
    }

    @Override // com.aspose.words.zzYI
    public final byte zzkz() {
        return (byte) 3;
    }
}

package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYZ5 implements zzZBR {
    private zzZBR zzXZ6;

    public zzYZ5(zzZBR zzzbr) {
        this.zzXZ6 = zzzbr;
    }

    @Override // com.aspose.words.zzZBR
    public final SaveOutputParameters zzZ(zzYDZ zzydz) throws Exception {
        com.aspose.words.internal.zzZOP zzzop = zzydz.zzXpb;
        zzYYZ zzyyz = zzzop != null ? new zzYYZ(zzzop.getPosition()) : null;
        SaveOutputParameters saveOutputParametersZzZ = this.zzXZ6.zzZ(zzydz);
        if (zzyyz != null) {
            zzyyz.zzXy(zzydz.zzXpb.getPosition());
        }
        return saveOutputParametersZzZ;
    }
}

package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz56 extends zz57 {
    @Override // com.aspose.words.internal.zz57
    public final float[] zzv(zzPV zzpv) {
        byte[] bArrZzZ = zzPS.zzZ((byte) zzpv.zzPC(), (byte) zzpv.zzPB(), (byte) zzpv.zzPA());
        return new float[]{(bArrZzZ[0] & 255) / 255.0f, (bArrZzZ[1] & 255) / 255.0f, (bArrZzZ[2] & 255) / 255.0f, (bArrZzZ[3] & 255) / 255.0f};
    }

    @Override // com.aspose.words.internal.zz57
    public final String zzvM() {
        return "k";
    }

    @Override // com.aspose.words.internal.zz57
    public final String zzvN() {
        return "K";
    }

    @Override // com.aspose.words.internal.zz57
    public final int zzvO() {
        return 4;
    }

    @Override // com.aspose.words.internal.zz57
    public final String zzwE() {
        return "/DeviceCMYK";
    }
}

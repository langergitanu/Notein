package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzUQ extends zzUT {
    private byte[][] zzS1 = {new byte[]{27, 36, 41, 67}};

    @Override // com.aspose.words.internal.zzU1
    public final String getName() {
        return "ISO-2022-KR";
    }

    @Override // com.aspose.words.internal.zzU1
    public final zzUP zzZ(zzUU zzuu) {
        int iZzZ = zzUT.zzZ(zzuu.zzUg(), zzuu.zzUe(), this.zzS1);
        if (iZzZ == 0) {
            return null;
        }
        return new zzUP(this, iZzZ);
    }
}

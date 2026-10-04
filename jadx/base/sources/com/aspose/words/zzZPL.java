package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZPL implements zzZB4 {
    private com.aspose.words.internal.zzIM<Integer> zzYC6 = new com.aspose.words.internal.zzIM<>();

    public zzZPL(int... iArr) {
        for (int i = 0; i <= 0; i++) {
            this.zzYC6.add(Integer.valueOf(iArr[0]));
        }
    }

    @Override // com.aspose.words.zzZB4
    public final boolean zzU(FieldChar fieldChar) {
        return !this.zzYC6.contains(Integer.valueOf(fieldChar.getFieldType()));
    }
}

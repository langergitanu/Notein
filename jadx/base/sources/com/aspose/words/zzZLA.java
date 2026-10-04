package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZLA extends zzX5 {
    public zzZLA() {
        super(new com.aspose.words.internal.zzZPI());
    }

    @Override // com.aspose.words.zzX5
    public final boolean zzP(char c, int i) {
        return false;
    }

    @Override // com.aspose.words.zzX5
    public final void zzZ(com.aspose.words.internal.zzZQ9 zzzq9, StringBuilder sb, char c, int i, com.aspose.words.internal.zzZP1 zzzp1, String str, int i2) {
        if (com.aspose.words.internal.zzBZ.zzZY(zzzp1.zzj9().intValue(), 12) && c == 'd' && i == 1 && zzzq9.getDay() == 1 && com.aspose.words.internal.zzZYD.zzg(str.substring(i2), "d MMMM")) {
            com.aspose.words.internal.zzZNH.zzU(sb, "er");
        }
    }

    @Override // com.aspose.words.zzX5
    public final com.aspose.words.internal.zzZP1 zzj8() {
        throw new IllegalStateException();
    }

    @Override // com.aspose.words.zzX5
    public final String zzZ(com.aspose.words.internal.zzZQ9 zzzq9, char c, int i) {
        throw new IllegalStateException();
    }
}

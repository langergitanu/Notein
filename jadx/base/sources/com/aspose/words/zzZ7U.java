package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ7U extends zzTI {
    private String zzYhW;

    public zzZ7U(int i) {
        this.zzYhW = com.aspose.words.internal.zzZKN.zzS('`', i);
    }

    @Override // com.aspose.words.zzTI, com.aspose.words.zzYI
    public final String getText() {
        String text = com.aspose.words.internal.zzZYD.zzXh(super.getText()) ? super.getText() : com.aspose.words.internal.zzZKN.format(" {0} ", super.getText());
        String str = this.zzYhW;
        return com.aspose.words.internal.zzZKN.format("{0}{1}{2}", str, text, str);
    }

    public final int zzYUS() {
        return this.zzYhW.length();
    }

    @Override // com.aspose.words.zzTI, com.aspose.words.zzYI
    public final boolean zzZ(zzYI zzyi) {
        zzY(new zzZ7V(zzZ1N.zzUv(zzyi.getText())));
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
        return (byte) 4;
    }
}

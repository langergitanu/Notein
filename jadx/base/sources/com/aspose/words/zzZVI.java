package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZVI extends zzJR {
    @Override // com.aspose.words.zzJR
    public final void zzP(zzYAU zzyau) {
    }

    @Override // com.aspose.words.zzJR
    public final int zzQ(zzYAU zzyau) throws Exception {
        return zzyau.zzY6N().zzZr().zz5(zzyau.getText());
    }

    @Override // com.aspose.words.zzJR
    public final char zzW(zzYAU zzyau, int i) throws Exception {
        return zzyau.getText().charAt(i);
    }

    @Override // com.aspose.words.zzJR
    public final int zzX(zzYAU zzyau, int i) throws Exception {
        return zzyau.zzY6N().zzZr().zzY5(zzyau.getText().charAt(i));
    }

    @Override // com.aspose.words.zzJR
    public final int zzY(zzY9S zzy9s) throws Exception {
        return zzy9s.getText().length();
    }

    @Override // com.aspose.words.zzJR
    public final int zzZ(zzY9S zzy9s, int i, int i2) throws Exception {
        return zzy9s.zzY6N().zzZr().zz5(zzy9s.getText().substring(i, (i2 - i) + 1 + i));
    }

    @Override // com.aspose.words.zzJR
    public final void zzZ(zzY9W zzy9w, zzY9W zzy9w2, int i) throws Exception {
        zzy9w.setLength(zzy9w.getLength() - i);
        zzy9w2.setLength(i);
    }

    @Override // com.aspose.words.zzJR
    public final void zzZ(zzY9S zzy9s, zzY9S zzy9s2, int i) throws Exception {
        String text = zzy9s.getText();
        String strSubstring = text.substring(0, i);
        zzy9s.setText(text.substring(i, (text.length() - i) + i));
        zzy9s2.setText(strSubstring);
    }

    @Override // com.aspose.words.zzJR
    public final void zzZ(zzY9S zzy9s, zzY9S zzy9s2) throws Exception {
        zzy9s.setText(zzy9s.getText() + zzy9s2.getText());
    }

    @Override // com.aspose.words.zzJR
    public final void zzZ(zzY9W zzy9w, zzY9W zzy9w2) throws Exception {
        zzy9w.setLength(zzy9w.getLength() + zzy9w2.getLength());
    }
}

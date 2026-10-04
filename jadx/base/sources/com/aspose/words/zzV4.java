package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzV4 extends zzZ7S {
    @Override // com.aspose.words.zzZ7S
    public String zz0O() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < zzYUR().size(); i++) {
            com.aspose.words.internal.zzZNH.zzU(sb, zzYUR().get(i));
            if (i < zzYUR().size() - 1) {
                sb.append(ControlChar.LINE_BREAK_CHAR);
            }
        }
        return sb.toString();
    }

    @Override // com.aspose.words.zzZ7S
    public final void zz0P() {
        zzj(zz0O(), false);
        zzYUR().clear();
        zz9L();
    }

    @Override // com.aspose.words.zzYI
    public final int zzb4() {
        return 2;
    }
}

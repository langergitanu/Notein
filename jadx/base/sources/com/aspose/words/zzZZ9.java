package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZZ9 implements zzZ9K {
    private com.aspose.words.internal.zzKD zzZjS;

    public zzZZ9(com.aspose.words.internal.zzKD zzkd) {
        this.zzZjS = zzkd;
    }

    @Override // com.aspose.words.zzZ9K
    public final com.aspose.words.internal.zzZOR zzZ(zzYJW zzyjw) throws Exception {
        String strSubstring = zzyjw.getName().substring(1);
        com.aspose.words.internal.zzAA zzaaZzIf = this.zzZjS.zzIf();
        int iIndexOf = strSubstring.indexOf(47);
        while (iIndexOf > 0) {
            zzaaZzIf = zzaaZzIf.zzYr(strSubstring.substring(0, iIndexOf));
            strSubstring = strSubstring.substring(iIndexOf + 1);
            iIndexOf = strSubstring.indexOf(47);
        }
        return zzaaZzIf.zzYs(strSubstring);
    }
}

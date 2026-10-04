package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FontInfoSubstitutionRule extends FontSubstitutionRule {
    public FontInfoSubstitutionRule(Object obj) {
        super(obj);
    }

    @Override // com.aspose.words.FontSubstitutionRule
    public final com.aspose.words.internal.zzZXH zzZ(String str, int i, FontInfo fontInfo, com.aspose.words.internal.zzKJ zzkj) {
        if (fontInfo == null) {
            return null;
        }
        return zzkj.zzZ(fontInfo.zzZ72(), i);
    }
}

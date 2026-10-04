package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FontNameSubstitutionRule extends FontSubstitutionRule {
    public FontNameSubstitutionRule(Object obj) {
        super(obj);
    }

    @Override // com.aspose.words.FontSubstitutionRule
    public final com.aspose.words.internal.zzZXH zzZ(String str, int i, FontInfo fontInfo, com.aspose.words.internal.zzKJ zzkj) {
        if (!com.aspose.words.internal.zzZYD.zzXk(str)) {
            return null;
        }
        if ("CourierNew".equals(str)) {
            return zzkj.zzV("Courier New", i);
        }
        int iZzZ = com.aspose.words.internal.zzZKN.zzZ(str, new char[]{'-', ',', '('});
        if (iZzZ > 0) {
            return zzkj.zzV(str.substring(0, iZzZ), i);
        }
        return null;
    }
}

package com.aspose.words;

import com.google.mlkit.p567nl.translate.TranslateLanguage;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzY0O extends zzYU4 {
    private static HashMap<String, String> zzWUu;

    static {
        HashMap<String, String> map = new HashMap<>();
        zzWUu = map;
        com.aspose.words.internal.zzZQF.zzY(map, "aml", "http://schemas.microsoft.com/aml/2001/core");
        com.aspose.words.internal.zzZQF.zzY(zzWUu, "wx", "http://schemas.microsoft.com/office/word/2003/auxHint");
        com.aspose.words.internal.zzZQF.zzY(zzWUu, "dt", "uuid:C2F41010-65B3-11d1-A29F-00AA00C14882");
        com.aspose.words.internal.zzZQF.zzY(zzWUu, TranslateLanguage.SLOVENIAN, "http://schemas.microsoft.com/schemaLibrary/2003/core");
        com.aspose.words.internal.zzZQF.zzY(zzWUu, "w", "http://schemas.microsoft.com/office/word/2003/wordml");
        com.aspose.words.internal.zzZQF.zzY(zzWUu, "wsp", "http://schemas.microsoft.com/office/word/2003/wordml/sp2");
        com.aspose.words.internal.zzZQF.zzY(zzWUu, "o", "urn:schemas-microsoft-com:office:office");
        com.aspose.words.internal.zzZQF.zzY(zzWUu, "v", "urn:schemas-microsoft-com:vml");
        com.aspose.words.internal.zzZQF.zzY(zzWUu, "w10", "urn:schemas-microsoft-com:office:word");
    }

    public zzY0O(com.aspose.words.internal.zzZOP zzzop, IWarningCallback iWarningCallback) throws Exception {
        super(zzzop, iWarningCallback, 13);
    }

    @Override // com.aspose.words.zzYU4
    public final boolean zzYyF() {
        String str = (String) com.aspose.words.internal.zzQW.zzZ(zzWUu, getPrefix());
        return str != null && com.aspose.words.internal.zzZKN.equals(str, getNamespaceURI());
    }

    @Override // com.aspose.words.zzYU4
    public final int zzZk6() {
        return zzY1K.zzyJ(getValue());
    }
}

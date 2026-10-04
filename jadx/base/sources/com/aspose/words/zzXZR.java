package com.aspose.words;

import javax.xml.transform.stream.StreamSource;

/* JADX INFO: loaded from: classes6.dex */
final class zzXZR implements com.aspose.words.internal.zzZQT {
    private boolean zzWTs;

    @Override // com.aspose.words.internal.zzZQT
    public final Object zzP(String str, String str2, String str3) throws com.aspose.words.internal.zzZQS {
        if (this.zzWTs) {
            return null;
        }
        if (!"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd".equals(str2) && !"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd".equals(str2) && !"http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd".equals(str2) && !"http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd".equals(str2) && !"http://www.w3.org/TR/xhtml-basic/xhtml-basic11.dtd".equals(str2)) {
            com.aspose.words.internal.zzZYD.zzj(str2, "-/W3C/DTD XHTML");
            return null;
        }
        StreamSource streamSource = new StreamSource(com.aspose.words.internal.zzZXR.zzV("Aspose.Words.Resources.XhtmlEntities.dtd", Document.class), str2);
        streamSource.setPublicId(str);
        return streamSource;
    }

    public final void zzht(int i) {
        this.zzWTs = i == 1;
    }
}

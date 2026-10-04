package com.aspose.words.internal;

import org.w3c.dom.Document;

/* JADX INFO: loaded from: classes5.dex */
final class zzZSS extends zzZSP implements zzF2 {
    private Document zz6g;

    public zzZSS(Document document) {
        super(document);
        this.zz6g = document;
    }

    @Override // com.aspose.words.internal.zzF2
    public final zzF0 zzEo() {
        if (this.zz6g.getDocumentElement() == null) {
            return null;
        }
        return new zzZSR(this.zz6g.getDocumentElement());
    }

    @Override // com.aspose.words.internal.zzF2
    public final zzEZ zzEp() {
        return new zzZST(this.zz6g.getDoctype());
    }

    @Override // com.aspose.words.internal.zzF2
    public final zzEZ zzU(String str, String str2, String str3) {
        zzZSP zzzsp = new zzZSP(this.zz6g.createAttributeNS(str2, str));
        zzzsp.setValue(str3);
        return zzzsp;
    }

    @Override // com.aspose.words.internal.zzF2
    public final zzEZ zzV(String str, String str2, String str3) {
        zzZL5 zzzl5 = new zzZL5(str, str2, str3);
        Document documentZzZ = zzZSN.zzZ(zzzl5, this.zz6g);
        this.zz6g = documentZzZ;
        this.zz6b = documentZzZ;
        return new zzZSU(zzzl5);
    }

    @Override // com.aspose.words.internal.zzF2
    public final zzF0 zzYN(String str) {
        return new zzZSR(this.zz6g.createElement(str));
    }

    @Override // com.aspose.words.internal.zzF2
    public final zzEZ zzYO(String str) {
        return new zzZSP(this.zz6g.createTextNode(str));
    }

    @Override // com.aspose.words.internal.zzF2
    public final zzEZ zzYP(String str) {
        return new zzZSP(this.zz6g.createTextNode(str));
    }

    @Override // com.aspose.words.internal.zzF2
    public final zzEZ zzYQ(String str) {
        return new zzZSP(this.zz6g.createCDATASection(str));
    }

    @Override // com.aspose.words.internal.zzF2
    public final zzEZ zzYR(String str) {
        return new zzZSP(this.zz6g.createTextNode(str));
    }

    @Override // com.aspose.words.internal.zzF2
    public final zzEZ zzYS(String str) {
        return new zzZSP(this.zz6g.createComment(str));
    }

    @Override // com.aspose.words.internal.zzF2
    public final zzEZ zzZ(String str, String str2, String str3, String str4) {
        return zzZKN.zzU3(str) ? zzU(str2, str3, str4) : zzU(zzZKN.format("{0}:{1}", str, str2), str3, str4);
    }

    @Override // com.aspose.words.internal.zzF2
    public final zzEZ zzw(String str, String str2) {
        zzZSP zzzsp = new zzZSP(this.zz6g.createAttribute(str));
        zzzsp.setValue(str2);
        return zzzsp;
    }

    @Override // com.aspose.words.internal.zzF2
    public final zzF0 zzx(String str, String str2) {
        return new zzZSR(this.zz6g.createElementNS(str2, str));
    }

    @Override // com.aspose.words.internal.zzF2
    public final zzEZ zzy(String str, String str2) {
        return new zzZSP(this.zz6g.createProcessingInstruction(str, str2));
    }
}

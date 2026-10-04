package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYDJ extends zzYL4 {
    private zzU8 zzZGE;

    public zzYDJ(zzU8 zzu8) {
        this.zzZGE = zzu8;
    }

    private static boolean zzX(StructuredDocumentTag structuredDocumentTag, StructuredDocumentTag structuredDocumentTag2) {
        return structuredDocumentTag.getSdtType() == structuredDocumentTag2.getSdtType() && structuredDocumentTag.getLevel() == structuredDocumentTag2.getLevel();
    }

    @Override // com.aspose.words.zzYL4
    public final void zzZ(Node node, Node node2) throws Exception {
        zzU6.zzSU(com.aspose.words.internal.zzZKN.format("{{Sdt}} '{0}' -> '{1}'", node, node2));
        StructuredDocumentTag structuredDocumentTag = (StructuredDocumentTag) node;
        StructuredDocumentTag structuredDocumentTag2 = (StructuredDocumentTag) node2;
        if (zzX(structuredDocumentTag, structuredDocumentTag2)) {
            if (!com.aspose.words.internal.zzZKN.equals(new zzU5(structuredDocumentTag, this.zzZGE).zzYAc().zz0T(), new zzU5(structuredDocumentTag2, this.zzZGE).zzYAc().zz0T()) || !com.aspose.words.internal.zzZKN.equals(structuredDocumentTag.getText(), structuredDocumentTag2.getText()) || !com.aspose.words.internal.zzZKN.equals(structuredDocumentTag.getXmlMapping().getStoreItemId(), structuredDocumentTag2.getXmlMapping().getStoreItemId())) {
                zzU4.zzZ(structuredDocumentTag);
                zzU4.zzZ(structuredDocumentTag2);
                StructuredDocumentTag structuredDocumentTag3 = (StructuredDocumentTag) zzU4.zzY(structuredDocumentTag, structuredDocumentTag2, this.zzZGE);
                if (structuredDocumentTag3.getXmlMapping().isMapped()) {
                    zzU4.zzZ(structuredDocumentTag3, structuredDocumentTag2, this.zzZGE);
                    return;
                }
                return;
            }
            if (structuredDocumentTag.getSdtType() == 12) {
                for (Run run : structuredDocumentTag.getChildNodes(21, true)) {
                    run.zzZYh().clear();
                    (this.zzZGE.zzZup.getTarget() == 1 ? structuredDocumentTag2 : structuredDocumentTag).zzY3J().zzY(run.zzZYh());
                }
            }
        }
    }
}

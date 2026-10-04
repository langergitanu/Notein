package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzK3 implements zzZB1 {
    private int[] zzZjo;
    private Inline zzZjp;

    public zzK3(Inline inline, int[] iArr) {
        this.zzZjp = inline;
        this.zzZjo = iArr;
    }

    private zzYEF zzY(zzYEF zzyef) {
        zzYEF zzyef2 = (zzYEF) this.zzZjp.zzZYh().zzbn();
        zzyef.zzZ(zzyef2, this.zzZjo);
        return zzyef2;
    }

    @Override // com.aspose.words.zzZB1
    public final void zzZ(zzYWB zzywb) {
        if (this.zzZjp == null) {
            return;
        }
        for (Node node : zzywb) {
            int nodeType = node.getNodeType();
            if (nodeType == 21) {
                Run run = (Run) node;
                run.zzZ(zzY(run.zzZYh()));
            } else if (nodeType == 28) {
                StructuredDocumentTag structuredDocumentTag = (StructuredDocumentTag) node;
                structuredDocumentTag.zzr(zzY(structuredDocumentTag.zzY3J()));
            }
        }
    }
}

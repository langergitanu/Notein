package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FieldRevNum extends Field {
    static zzZB5 zzYGm = new zzZ(0);

    public static class zzZ implements zzZB5 {
        private zzZ() {
        }

        @Override // com.aspose.words.zzZB5
        public final zzTL zzW(Document document, zzZBB zzzbb) {
            return FieldRevNum.zzw(document);
        }

        public /* synthetic */ zzZ(byte b) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzZ7P zzw(Document document) {
        return new zzZ7P(document.getBuiltInDocumentProperties().getRevisionNumber());
    }

    @Override // com.aspose.words.Field
    public final zzZP6 zzZgM() {
        return new zzZP5(this, zzw(getStart().zzYBb()));
    }
}

package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FieldLastSavedBy extends Field {
    static zzZB5 zzYGm = new zzZ(0);

    public static class zzZ implements zzZB5 {
        private zzZ() {
        }

        @Override // com.aspose.words.zzZB5
        public final zzTL zzW(Document document, zzZBB zzzbb) {
            return new zzY94(FieldLastSavedBy.zzt(document));
        }

        public /* synthetic */ zzZ(byte b) {
            this();
        }
    }

    public static /* synthetic */ String zzt(Document document) {
        return document.getBuiltInDocumentProperties().getLastSavedBy();
    }

    @Override // com.aspose.words.Field
    public final zzZP6 zzZgM() {
        return new zzZP5(this, getStart().zzYBb().getBuiltInDocumentProperties().getLastSavedBy());
    }
}

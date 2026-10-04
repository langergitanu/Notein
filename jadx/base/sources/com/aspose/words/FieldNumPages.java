package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FieldNumPages extends Field {
    static zzZB5 zzYGm = new zzZ(0);

    public static class zzZ implements zzZB5 {
        private zzZ() {
        }

        @Override // com.aspose.words.zzZB5
        public final zzTL zzW(Document document, zzZBB zzzbb) throws Exception {
            return new zzZ7P(document.getPageCount());
        }

        public /* synthetic */ zzZ(byte b) {
            this();
        }
    }
}

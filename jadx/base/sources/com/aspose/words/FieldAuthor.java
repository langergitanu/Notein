package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FieldAuthor extends Field {
    static zzZB5 zzYGm = new zzZ(0);

    public static class zzZ implements zzZB5 {
        private zzZ() {
        }

        @Override // com.aspose.words.zzZB5
        public final zzTL zzW(Document document, zzZBB zzzbb) throws Exception {
            return new zzY94(FieldAuthor.zzZ(document, zzzbb));
        }

        public /* synthetic */ zzZ(byte b) {
            this();
        }
    }

    private static String zzY(Document document, zzZBB zzzbb) throws Exception {
        String strZzDG = zzzbb.zzDG(0);
        if (strZzDG != null) {
            return strZzDG;
        }
        BuiltInDocumentProperties builtInDocumentProperties = document.getBuiltInDocumentProperties();
        return com.aspose.words.internal.zzZYD.zzXk(builtInDocumentProperties.getAuthor()) ? builtInDocumentProperties.getAuthor() : document.getFieldOptions().getDefaultDocumentAuthor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzZ(Document document, zzZBB zzzbb) throws Exception {
        String strZzY = zzY(document, zzzbb);
        if (strZzY != null) {
            zzX(document, strZzY);
        }
        return strZzY;
    }

    public String getAuthorName() {
        return zzZgq().zzDG(0);
    }

    public void setAuthorName(String str) throws Exception {
        zzZgq().zzB(0, str);
    }

    @Override // com.aspose.words.Field
    public final zzZP6 zzZgM() throws Exception {
        return new zzZP5(this, zzZ(getStart().zzYBb(), zzZgq()));
    }

    private static void zzX(Document document, String str) {
        document.getBuiltInDocumentProperties().setAuthor(str);
    }
}

package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FieldComments extends Field {
    static zzZB5 zzYGm = new zzZ(0);

    public static class zzZ implements zzZB5 {
        private zzZ() {
        }

        @Override // com.aspose.words.zzZB5
        public final zzTL zzW(Document document, zzZBB zzzbb) throws Exception {
            return new zzY94(FieldComments.zzZ(document, zzzbb));
        }

        public /* synthetic */ zzZ(byte b) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzZ(Document document, zzZBB zzzbb) throws Exception {
        BuiltInDocumentProperties builtInDocumentProperties = document.getBuiltInDocumentProperties();
        String strZzDG = zzzbb.zzDG(0);
        if (strZzDG != null) {
            builtInDocumentProperties.setComments(strZzDG);
        }
        return builtInDocumentProperties.getComments();
    }

    public String getText() {
        return zzZgq().zzDG(0);
    }

    public void setText(String str) throws Exception {
        zzZgq().zzB(0, str);
    }

    @Override // com.aspose.words.Field
    public final zzZP6 zzZgM() throws Exception {
        return new zzZP5(this, zzZ(getStart().zzYBb(), zzZgq()));
    }
}

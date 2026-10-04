package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FieldTemplate extends Field implements zzZBA {
    static zzZB5 zzYGm = new zzZ(0);
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\p");

    public static class zzZ implements zzZB5 {
        private zzZ() {
        }

        @Override // com.aspose.words.zzZB5
        public final zzTL zzW(Document document, zzZBB zzzbb) throws Exception {
            return new zzY94(FieldTemplate.zzZ(document, zzzbb));
        }

        public /* synthetic */ zzZ(byte b) {
            this();
        }
    }

    public static int zzMk(String str) {
        return zzUR.zzTP(str) != 0 ? 0 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzZ(Document document, zzZBB zzzbb) throws Exception {
        String attachedTemplate = document.getAttachedTemplate();
        if (com.aspose.words.internal.zzZKN.zzU3(attachedTemplate)) {
            attachedTemplate = document.getFieldOptions().getTemplateName();
        }
        if (com.aspose.words.internal.zzZKN.zzU3(attachedTemplate)) {
            attachedTemplate = "Normal.dotm";
        }
        return !zzzbb.zzMj("\\p") ? com.aspose.words.internal.zzZOQ.zzVh(attachedTemplate) : attachedTemplate;
    }

    public boolean getIncludeFullPath() {
        return zzZgq().zzMj("\\p");
    }

    @Override // com.aspose.words.zzZBA
    @ReservedForInternalUse
    @Deprecated
    public int getSwitchType(String str) {
        return zzMk(str);
    }

    public void setIncludeFullPath(boolean z) throws Exception {
        zzZgq().zzs("\\p", z);
    }

    @Override // com.aspose.words.Field
    public final zzZP6 zzZgM() throws Exception {
        return new zzZP5(this, zzZ(getStart().zzYBb(), zzZgq()));
    }
}

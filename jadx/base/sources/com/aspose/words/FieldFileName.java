package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FieldFileName extends Field implements zzZBA {
    static zzZB5 zzYGm = new zzZ(0);
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\p");

    public static class zzZ implements zzZB5 {
        private zzZ() {
        }

        @Override // com.aspose.words.zzZB5
        public final zzTL zzW(Document document, zzZBB zzzbb) throws Exception {
            return new zzY94(FieldFileName.zzZ(document, zzzbb));
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
        String fileName = document.getFieldOptions().getFileName();
        if (!com.aspose.words.internal.zzZYD.zzXk(fileName)) {
            fileName = document.getOriginalFileName();
        }
        if (!com.aspose.words.internal.zzZYD.zzXk(fileName)) {
            fileName = document.zzZqA();
        }
        return (!com.aspose.words.internal.zzZYD.zzXk(fileName) || zzzbb.zzMj("\\p")) ? fileName : com.aspose.words.internal.zzZOQ.zzVh(fileName);
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

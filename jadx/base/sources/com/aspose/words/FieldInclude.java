package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FieldInclude extends Field implements zzZB6, zzZBA {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\!", "\\c");

    @Override // com.aspose.words.zzZB6
    public String getBookmarkName() {
        return zzZgq().zzDG(1);
    }

    @Override // com.aspose.words.zzZB6
    public boolean getLockFields() {
        return zzZgq().zzMj("\\!");
    }

    @Override // com.aspose.words.zzZB6
    @ReservedForInternalUse
    @Deprecated
    public String getNamespaceMappings() {
        return null;
    }

    @Override // com.aspose.words.zzZB6
    public String getSourceFullName() {
        return zzZgq().zzDG(0);
    }

    @Override // com.aspose.words.zzZB6
    @ReservedForInternalUse
    @Deprecated
    public int getSourceFullNameArgumentIndex() {
        return 0;
    }

    @Override // com.aspose.words.zzZBA
    @ReservedForInternalUse
    @Deprecated
    public int getSwitchType(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP != 0) {
            return iZzTP != 1 ? 0 : 2;
        }
        return 1;
    }

    @Override // com.aspose.words.zzZB6
    public String getTextConverter() {
        return zzZgq().zzt("\\c", false);
    }

    @Override // com.aspose.words.zzZB6
    @ReservedForInternalUse
    @Deprecated
    public String getXPath() {
        return null;
    }

    @Override // com.aspose.words.zzZB6
    @ReservedForInternalUse
    @Deprecated
    public String getXslTransformation() {
        return null;
    }

    public void setBookmarkName(String str) throws Exception {
        zzZgq().zzB(1, str);
    }

    public void setLockFields(boolean z) throws Exception {
        zzZgq().zzs("\\!", z);
    }

    public void setSourceFullName(String str) throws Exception {
        zzZgq().zzB(0, str);
    }

    public void setTextConverter(String str) throws Exception {
        zzZgq().zzZf("\\c", str);
    }

    @Override // com.aspose.words.Field
    public final zzZP6 zzZgM() throws Exception {
        return zzZQ4.zzU(this);
    }
}

package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FieldIncludeText extends Field implements zzZB6, zzZBA {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\!", "\\c", "\\e", "\\m", "\\n", "\\t", "\\x");

    @Override // com.aspose.words.zzZB6
    public String getBookmarkName() {
        return zzZgq().zzDG(1);
    }

    public String getEncoding() {
        return zzZgq().zzt("\\e", false);
    }

    @Override // com.aspose.words.zzZB6
    public boolean getLockFields() {
        return zzZgq().zzMj("\\!");
    }

    public String getMimeType() {
        return zzZgq().zzt("\\m", false);
    }

    @Override // com.aspose.words.zzZB6
    public String getNamespaceMappings() {
        return zzZgq().zzt("\\n", false);
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
        switch (zzUR.zzTP(str)) {
            case 0:
                return 1;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return 2;
            default:
                return 0;
        }
    }

    @Override // com.aspose.words.zzZB6
    public String getTextConverter() {
        return zzZgq().zzt("\\c", false);
    }

    @Override // com.aspose.words.zzZB6
    public String getXPath() {
        return zzZgq().zzt("\\x", false);
    }

    @Override // com.aspose.words.zzZB6
    public String getXslTransformation() {
        return zzZgq().zzt("\\t", false);
    }

    public void setBookmarkName(String str) throws Exception {
        zzZgq().zzB(1, str);
    }

    public void setEncoding(String str) throws Exception {
        zzZgq().zzZf("\\e", str);
    }

    public void setLockFields(boolean z) throws Exception {
        zzZgq().zzs("\\!", z);
    }

    public void setMimeType(String str) throws Exception {
        zzZgq().zzZf("\\m", str);
    }

    public void setNamespaceMappings(String str) throws Exception {
        zzZgq().zzZf("\\n", str);
    }

    public void setSourceFullName(String str) throws Exception {
        zzZgq().zzB(0, str);
    }

    public void setTextConverter(String str) throws Exception {
        zzZgq().zzZf("\\c", str);
    }

    public void setXPath(String str) throws Exception {
        zzZgq().zzZf("\\x", str);
    }

    public void setXslTransformation(String str) throws Exception {
        zzZgq().zzZf("\\t", str);
    }

    @Override // com.aspose.words.Field
    public final zzZP6 zzZgM() throws Exception {
        return zzZQ4.zzU(this);
    }
}

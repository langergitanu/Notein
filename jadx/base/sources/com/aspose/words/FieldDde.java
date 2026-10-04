package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FieldDde extends Field implements zzZBA {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\a", "\\b", "\\d", "\\h", "\\p", "\\r", "\\t", "\\u");

    public boolean getAutoUpdate() {
        return zzZgq().zzMj("\\a");
    }

    public boolean getInsertAsBitmap() {
        return zzZgq().zzMj("\\b");
    }

    public boolean getInsertAsHtml() {
        return zzZgq().zzMj("\\h");
    }

    public boolean getInsertAsPicture() {
        return zzZgq().zzMj("\\p");
    }

    public boolean getInsertAsRtf() {
        return zzZgq().zzMj("\\r");
    }

    public boolean getInsertAsText() {
        return zzZgq().zzMj("\\t");
    }

    public boolean getInsertAsUnicode() {
        return zzZgq().zzMj("\\u");
    }

    public String getProgId() {
        return zzZgq().zzDG(0);
    }

    public String getSourceFullName() {
        return zzZgq().zzDG(1);
    }

    public String getSourceItem() {
        return zzZgq().zzDG(2);
    }

    @Override // com.aspose.words.zzZBA
    @ReservedForInternalUse
    @Deprecated
    public int getSwitchType(String str) {
        switch (zzUR.zzTP(str)) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return 2;
            default:
                return 0;
        }
    }

    public boolean isLinked() {
        return zzZgq().zzMj("\\d");
    }

    public void setAutoUpdate(boolean z) throws Exception {
        zzZgq().zzs("\\a", z);
    }

    public void setInsertAsBitmap(boolean z) throws Exception {
        zzZgq().zzs("\\b", z);
    }

    public void setInsertAsHtml(boolean z) throws Exception {
        zzZgq().zzs("\\h", z);
    }

    public void setInsertAsPicture(boolean z) throws Exception {
        zzZgq().zzs("\\p", z);
    }

    public void setInsertAsRtf(boolean z) throws Exception {
        zzZgq().zzs("\\r", z);
    }

    public void setInsertAsText(boolean z) throws Exception {
        zzZgq().zzs("\\t", z);
    }

    public void setInsertAsUnicode(boolean z) throws Exception {
        zzZgq().zzs("\\u", z);
    }

    public void setProgId(String str) throws Exception {
        zzZgq().zzB(0, str);
    }

    public void setSourceFullName(String str) throws Exception {
        zzZgq().zzB(1, str);
    }

    public void setSourceItem(String str) throws Exception {
        zzZgq().zzB(2, str);
    }

    public void isLinked(boolean z) throws Exception {
        zzZgq().zzs("\\d", z);
    }
}

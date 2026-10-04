package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FieldTA extends Field implements zzZBA {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\b", "\\i", "\\c", "\\l", "\\r", "\\s");

    public String getEntryCategory() {
        return zzZgq().zzt("\\c", false);
    }

    public String getLongCitation() {
        return zzZgq().zzt("\\l", false);
    }

    public String getPageRangeBookmarkName() {
        return zzZgq().zzt("\\r", false);
    }

    public String getShortCitation() {
        return zzZgq().zzt("\\s", false);
    }

    @Override // com.aspose.words.zzZBA
    @ReservedForInternalUse
    @Deprecated
    public int getSwitchType(String str) {
        int iZzTP = zzUR.zzTP(str);
        int i = 1;
        if (iZzTP != 0 && iZzTP != 1) {
            i = 2;
            if (iZzTP != 2 && iZzTP != 3 && iZzTP != 4 && iZzTP != 5) {
                return 0;
            }
        }
        return i;
    }

    public boolean isBold() {
        return zzZgq().zzMj("\\b");
    }

    public boolean isItalic() {
        return zzZgq().zzMj("\\i");
    }

    public void setEntryCategory(String str) throws Exception {
        zzZgq().zzZe("\\c", str);
    }

    public void setLongCitation(String str) throws Exception {
        zzZgq().zzZf("\\l", str);
    }

    public void setPageRangeBookmarkName(String str) throws Exception {
        zzZgq().zzZf("\\r", str);
    }

    public void setShortCitation(String str) throws Exception {
        zzZgq().zzZf("\\s", str);
    }

    public final zzYWB zzZc3() {
        return zzZgq().zzMg("\\l");
    }

    public final boolean zzZc4() {
        return zzZgq().zzMj("\\r");
    }

    public void isBold(boolean z) throws Exception {
        zzZgq().zzs("\\b", z);
    }

    public void isItalic(boolean z) throws Exception {
        zzZgq().zzs("\\i", z);
    }
}

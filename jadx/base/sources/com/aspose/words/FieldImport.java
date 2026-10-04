package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FieldImport extends Field implements zzZB7, zzZBA {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\c", "\\d");

    public String getGraphicFilter() {
        return zzZgq().zzt("\\c", false);
    }

    @Override // com.aspose.words.zzZB7
    public String getSourceFullName() {
        return zzZgq().zzDG(0);
    }

    @Override // com.aspose.words.zzZBA
    @ReservedForInternalUse
    @Deprecated
    public int getSwitchType(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP != 0) {
            return iZzTP != 1 ? 0 : 1;
        }
        return 2;
    }

    @Override // com.aspose.words.zzZB7
    public boolean isLinked() {
        return zzZgq().zzMj("\\d");
    }

    public void setGraphicFilter(String str) throws Exception {
        zzZgq().zzZf("\\c", str);
    }

    public void setSourceFullName(String str) throws Exception {
        zzZgq().zzB(0, str);
    }

    @Override // com.aspose.words.Field
    public final zzZP6 zzZgM() throws Exception {
        return zzZQ5.zzU(this);
    }

    public void isLinked(boolean z) throws Exception {
        zzZgq().zzs("\\d", z);
    }
}

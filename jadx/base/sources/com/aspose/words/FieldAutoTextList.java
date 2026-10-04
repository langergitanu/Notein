package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FieldAutoTextList extends Field implements zzZBA {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\s", "\\t");

    public String getEntryName() {
        return zzZgq().zzDG(0);
    }

    public String getListStyle() {
        return zzZgq().zzt("\\s", false);
    }

    public String getScreenTip() {
        return zzZgq().zzt("\\t", false);
    }

    @Override // com.aspose.words.zzZBA
    @ReservedForInternalUse
    @Deprecated
    public int getSwitchType(String str) {
        int iZzTP = zzUR.zzTP(str);
        return (iZzTP == 0 || iZzTP == 1) ? 2 : 0;
    }

    public void setEntryName(String str) throws Exception {
        zzZgq().zzB(0, str);
    }

    public void setListStyle(String str) throws Exception {
        zzZgq().zzZf("\\s", str);
    }

    public void setScreenTip(String str) throws Exception {
        zzZgq().zzZf("\\t", str);
    }
}

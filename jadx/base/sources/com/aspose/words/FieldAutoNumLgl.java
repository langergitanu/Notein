package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FieldAutoNumLgl extends Field implements zzZBA {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\e", "\\s");

    public boolean getRemoveTrailingPeriod() {
        return zzZgq().zzMj("\\e");
    }

    public String getSeparatorCharacter() {
        return zzZgq().zzt("\\s", false);
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

    public void setRemoveTrailingPeriod(boolean z) throws Exception {
        zzZgq().zzs("\\e", z);
    }

    public void setSeparatorCharacter(String str) throws Exception {
        zzZgq().zzZf("\\s", str);
    }

    @Override // com.aspose.words.Field
    public final zzYWB zzZgI() throws Exception {
        return zzZPU.zzJ(this);
    }
}

package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FieldPrint extends Field implements zzZBA {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\p");

    public String getPostScriptGroup() {
        return zzZgq().zzt("\\p", false);
    }

    public String getPrinterInstructions() {
        return zzZgq().zzDG(0);
    }

    @Override // com.aspose.words.zzZBA
    @ReservedForInternalUse
    @Deprecated
    public int getSwitchType(String str) {
        return zzUR.zzTP(str) != 0 ? 0 : 2;
    }

    public void setPostScriptGroup(String str) throws Exception {
        zzZgq().zzZf("\\p", str);
    }

    public void setPrinterInstructions(String str) throws Exception {
        zzZgq().zzB(0, str);
    }
}

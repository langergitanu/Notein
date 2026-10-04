package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FieldRD extends Field implements zzZBA {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\f");

    public String getFileName() {
        return zzZgq().zzDG(0);
    }

    @Override // com.aspose.words.zzZBA
    @ReservedForInternalUse
    @Deprecated
    public int getSwitchType(String str) {
        return zzUR.zzTP(str) != 0 ? 0 : 1;
    }

    public boolean isPathRelative() {
        return zzZgq().zzMj("\\f");
    }

    public void setFileName(String str) throws Exception {
        zzZgq().zzB(0, str);
    }

    public void isPathRelative(boolean z) throws Exception {
        zzZgq().zzs("\\f", z);
    }
}

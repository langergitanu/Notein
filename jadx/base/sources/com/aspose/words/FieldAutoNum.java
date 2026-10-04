package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FieldAutoNum extends Field implements zzZBA {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\s");

    public String getSeparatorCharacter() {
        return zzZgq().zzt("\\s", false);
    }

    @Override // com.aspose.words.zzZBA
    @ReservedForInternalUse
    @Deprecated
    public int getSwitchType(String str) {
        return zzUR.zzTP(str) != 0 ? 0 : 2;
    }

    public void setSeparatorCharacter(String str) throws Exception {
        zzZgq().zzZf("\\s", str);
    }

    @Override // com.aspose.words.Field
    public final zzYWB zzZgI() throws Exception {
        return zzZPU.zzJ(this);
    }
}

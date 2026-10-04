package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FieldMacroButton extends Field implements zzZAA {
    @Override // com.aspose.words.zzZAA
    @ReservedForInternalUse
    @Deprecated
    public boolean canWorkAsMergeField() {
        return getStart().zzYBb().getMailMerge().getUseNonMergeFields();
    }

    public String getDisplayText() {
        return zzZgq().zzDG(1);
    }

    public String getMacroName() {
        return zzZgq().zzDG(0);
    }

    @Override // com.aspose.words.zzZAA
    @ReservedForInternalUse
    @Deprecated
    public String getMergeFieldName() {
        return getDisplayText();
    }

    @Override // com.aspose.words.zzZAA
    @ReservedForInternalUse
    @Deprecated
    public boolean isMergeValueRequired() {
        return false;
    }

    public void setDisplayText(String str) throws Exception {
        zzZgq().zzB(1, str);
    }

    public void setMacroName(String str) throws Exception {
        zzZgq().zzB(0, str);
    }

    @Override // com.aspose.words.Field
    public final zzYWB zzZgI() throws Exception {
        return zzZR3.zzZ(zzZgq().zzDH(1));
    }
}

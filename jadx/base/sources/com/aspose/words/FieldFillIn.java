package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FieldFillIn extends Field implements zzZBA {
    public String getDefaultResponse() {
        return zzZOP.zzk(this);
    }

    public boolean getPromptOnceOnMailMerge() {
        return zzZOP.zzl(this);
    }

    public String getPromptText() {
        return zzZOP.zzn(this);
    }

    @Override // com.aspose.words.zzZBA
    @ReservedForInternalUse
    @Deprecated
    public int getSwitchType(String str) {
        return zzZOP.getSwitchType(str);
    }

    public void setDefaultResponse(String str) throws Exception {
        zzZOP.zzU(this, str);
    }

    public void setPromptOnceOnMailMerge(boolean z) throws Exception {
        zzZOP.zzT(this, z);
    }

    public void setPromptText(String str) throws Exception {
        zzZOP.zzV(this, str);
    }

    @Override // com.aspose.words.Field
    public final zzZP6 zzZgM() {
        return zzZOP.zzo(this);
    }
}

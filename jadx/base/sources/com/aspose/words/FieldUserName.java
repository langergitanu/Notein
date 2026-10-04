package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FieldUserName extends Field {
    public String getUserName() {
        return zzZgq().zzDG(0);
    }

    public void setUserName(String str) throws Exception {
        zzZgq().zzB(0, str);
    }

    @Override // com.aspose.words.Field
    public final zzZP6 zzZgM() {
        return new zzZP5(this, com.aspose.words.internal.zzZYD.zzF(zzZgq().zzDI(0) ? getUserName() : getStart().zzYBb().getFieldOptions().zzZcJ().getName(), 55));
    }
}

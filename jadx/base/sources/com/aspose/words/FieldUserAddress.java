package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FieldUserAddress extends Field {
    public String getUserAddress() {
        return zzZgq().zzDG(0);
    }

    public void setUserAddress(String str) throws Exception {
        zzZgq().zzB(0, str);
    }

    @Override // com.aspose.words.Field
    public final zzZP6 zzZgM() {
        return new zzZP5(this, com.aspose.words.internal.zzZYD.zzF(zzZgq().zzDI(0) ? getUserAddress() : getStart().zzYBb().getFieldOptions().zzZcJ().getAddress(), 255));
    }
}

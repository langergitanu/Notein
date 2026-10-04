package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FieldUserInitials extends Field {
    public String getUserInitials() {
        return zzZgq().zzDG(0);
    }

    public void setUserInitials(String str) throws Exception {
        zzZgq().zzB(0, str);
    }

    @Override // com.aspose.words.Field
    public final zzZP6 zzZgM() {
        return new zzZP5(this, com.aspose.words.internal.zzZYD.zzF(zzZgq().zzDI(0) ? getUserInitials() : getStart().zzYBb().getFieldOptions().zzZcJ().getInitials(), 10));
    }
}

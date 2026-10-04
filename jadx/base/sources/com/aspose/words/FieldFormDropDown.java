package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FieldFormDropDown extends Field {
    @Override // com.aspose.words.Field
    public final zzYWB zzZgI() throws Exception {
        FormField formFieldZzZcg = getStart().zzZcg();
        if (formFieldZzZcg == null) {
            return null;
        }
        return zzZPB.zzY(formFieldZzZcg.getResult(), getStart().zzYBb(), (zzZAZ) new zzZQ9(this), false);
    }
}

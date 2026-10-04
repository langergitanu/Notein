package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FieldFormula extends Field {
    private zzTL zzLY(String str) throws Exception {
        zzTL zztlZzZ = zzZSH.zzZ(this, str);
        return zztlZzZ instanceof zzY94 ? com.aspose.words.internal.zzZKN.zzU3(zztlZzZ.zz8W()) ? new zzZVZ(0.0d) : zzZU3.zzZiV() : zztlZzZ instanceof zzYU0 ? new zzY94("") : zztlZzZ;
    }

    public final zzTL zzZdV() throws Exception {
        return zzLY(com.aspose.words.internal.zzZKN.zzTZ(zzYW8.zz3(this)).substring(1));
    }

    @Override // com.aspose.words.Field
    public final zzZP6 zzZgM() throws Exception {
        zzTL zztlZzZdV = zzZdV();
        return !zztlZzZdV.isError() ? new zzZP5(this, zztlZzZdV) : new zzZP2(this, zztlZzZdV.zz8W());
    }
}

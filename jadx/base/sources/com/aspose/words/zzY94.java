package com.aspose.words;

import com.aspose.words.ref.RefDouble;

/* JADX INFO: loaded from: classes6.dex */
class zzY94 extends zzTL {
    private String mValue;

    public zzY94(String str) {
        this.mValue = str;
    }

    @Override // com.aspose.words.zzTL
    public final String zz8W() {
        return this.mValue;
    }

    @Override // com.aspose.words.zzTL
    public final zzZQ8 zzZ(zzYIU zzyiu, int i, IFieldResultFormatter iFieldResultFormatter) {
        zzZVZ zzzvzZzMJ = zzZVZ.zzMJ(this.mValue);
        if (zzzvzZzMJ != null) {
            return zzzvzZzMJ.zzZ(zzyiu, i, iFieldResultFormatter);
        }
        return null;
    }

    @Override // com.aspose.words.zzTL
    public final int zzbY() {
        return 5;
    }

    @Override // com.aspose.words.zzTL
    public final String zzZ(String str, int i, IFieldResultFormatter iFieldResultFormatter) {
        zzKF zzkfZzRS = zzKF.zzRS(this.mValue);
        if (zzkfZzRS != null) {
            return zzkfZzRS.zzZ(str, i, iFieldResultFormatter);
        }
        return null;
    }

    @Override // com.aspose.words.zzTL
    public final boolean zzZ(RefDouble refDouble) {
        zzZVZ zzzvzZzMJ = zzZVZ.zzMJ(this.mValue);
        if (zzzvzZzMJ != null) {
            refDouble.set(zzzvzZzMJ.zz8Y());
            return true;
        }
        refDouble.set(0.0d);
        return false;
    }
}

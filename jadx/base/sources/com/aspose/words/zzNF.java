package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzNF extends zzMN {
    @Override // com.aspose.words.zzQB
    public final boolean zzZ(zzZBM zzzbm, int i) {
        if (zzzbm.zzZ2Q() == null) {
            return false;
        }
        for (zzZBM zzzbmZzZ2O = zzzbm.zzZ2O(); zzzbmZzZ2O != null; zzzbmZzZ2O = zzzbmZzZ2O.zzZ2O()) {
            if (com.aspose.words.internal.zzZKN.equals(zzzbmZzZ2O.zzZTQ(), zzzbm.zzZTQ()) && com.aspose.words.internal.zzZKN.equals(zzzbmZzZ2O.zzZ2G(), zzzbm.zzZ2G())) {
                return false;
            }
        }
        for (zzZBM zzzbmZzZ2N = zzzbm.zzZ2N(); zzzbmZzZ2N != null; zzzbmZzZ2N = zzzbmZzZ2N.zzZ2N()) {
            if (com.aspose.words.internal.zzZKN.equals(zzzbmZzZ2N.zzZTQ(), zzzbm.zzZTQ()) && com.aspose.words.internal.zzZKN.equals(zzzbmZzZ2N.zzZ2G(), zzzbm.zzZ2G())) {
                return false;
            }
        }
        return true;
    }

    @Override // com.aspose.words.zzMD
    public final String zzZXr() {
        return "only-of-type";
    }

    @Override // com.aspose.words.zzMD
    public final String zzZXu() {
        return ":only-of-type";
    }
}

package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public class zzZME extends zzZLW {
    private zzZLY zzZSR = new zzZLY();

    public final void zzZ(zzZME zzzme) throws Exception {
        for (int i = 0; i < zzgc().getCount(); i++) {
            zzZLW zzzlwZzZ3 = ((zzZLW) zzgc().zzQt(i)).zzZ3(false);
            if (zzzlwZzZ3 != zzZLW.zzZSj) {
                zzzme.zzgc().zzW(zzzlwZzZ3);
                zzzme.zzZSR.zzW(zzzlwZzZ3);
            }
        }
    }

    public final zzZLY zzgi() {
        return this.zzZSR;
    }

    @Override // com.aspose.words.internal.zzZLW
    public final boolean zzZ(zzZLW zzzlw) {
        zzZME zzzme = zzzlw instanceof zzZME ? (zzZME) zzzlw : null;
        if (zzzme == null || getClass() != zzzme.getClass() || !this.zzZSh.equals(zzzme.zzZSh) || !this.zzZSi.equals(zzzme.zzZSi) || this.zzZSR.getCount() != zzzme.zzZSR.getCount()) {
            return false;
        }
        for (int i = 0; i < this.zzZSR.getCount(); i++) {
            zzZLW zzzlw2 = this.zzZSR.zzQt(i) instanceof zzZLW ? (zzZLW) this.zzZSR.zzQt(i) : null;
            zzZLW zzzlw3 = zzzme.zzZSR.zzQt(i) instanceof zzZLW ? (zzZLW) zzzme.zzZSR.zzQt(i) : null;
            if (zzzlw2 == null && zzzlw3 == null) {
                return true;
            }
            if (zzzlw2 == null || zzzlw3 == null || !zzzlw2.zzZ(zzzlw3)) {
                return false;
            }
        }
        return true;
    }
}

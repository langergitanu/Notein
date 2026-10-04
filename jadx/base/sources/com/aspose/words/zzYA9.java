package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYA9 {
    private boolean zzXbY;

    public final void zzZT(zzZ55 zzz55) throws Exception {
        if (this.zzXbY) {
            zzz55.zzYj(true);
            zzz55.zzab().zzZoS().commit();
            zzz55.zzYj(false);
            this.zzXbY = false;
        }
    }

    public final void zzZU(zzZ55 zzz55) throws Exception {
        zzYAA zzyaa = (zzYAA) com.aspose.words.internal.zzZKW.zzZ((zzYAU) zzz55.zz6w(), zzYAA.class);
        if (zzyaa != null) {
            zzz55.zzYj(true);
            zzz55.zzab().zzZoS().zzL(zzyaa);
            zzz55.zzYj(false);
            this.zzXbY = true;
        }
    }

    public final void zzZV(zzZ55 zzz55) throws Exception {
        ((zzYAU) zzz55.zz6w()).zzZo6();
        zzYAA zzyaa = new zzYAA();
        zzyaa.zzU(((zzYAU) zzz55.zz6w()).zzY6N());
        zzyaa.zzlT(((zzYAU) zzz55.zz6w()).zzYTl());
        zzyaa.zzZ(zzz55.zzaa());
        if (((zzYAU) zzz55.zz6w()).zzY6G()) {
            ((zzYAU) zzz55.zz6w()).zzQC(false);
            zzyaa.zzQC(true);
        }
        zzz55.zzab().zzZoS().zzZ(zzz55.zzaa(), (zzYAU) zzz55.zz6w(), zzyaa);
        this.zzXbY = true;
    }
}

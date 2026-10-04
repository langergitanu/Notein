package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzNQ implements zzHJ {
    private boolean zzF8;
    private zzYP zzF9;
    private zzZQ4 zzFa;
    private long zzFb;
    private zzN3 zzFe;

    public zzNQ(long j, zzZQ4 zzzq4, zzN3 zzn3) {
        this.zzFb = j;
        this.zzFa = zzzq4;
        this.zzFe = zzn3;
        zzYP zzyp = new zzYP();
        this.zzF9 = zzyp;
        zzyp.setWidth(Float.intBitsToFloat((int) j));
        this.zzF9.setHeight(zzZPW.zzYz(j));
        this.zzF9.zzW(zzzq4.getX());
        this.zzF9.zzV(zzzq4.getY());
    }

    private boolean zzM6() {
        return !this.zzFe.zzK3() && this.zzFe.zzK7() == 0;
    }

    @Override // com.aspose.words.internal.zzHJ
    public final double zzM7() {
        return Float.intBitsToFloat((int) this.zzFb);
    }

    @Override // com.aspose.words.internal.zzHJ
    public final void zzXv(int i) {
        double height = 0.0d;
        if (i != 0) {
            if (i == 1) {
                height = (((double) this.zzFa.getHeight()) - this.zzF9.zzYr()) / 2.0d;
            } else if (i == 2) {
                height = ((double) this.zzFa.getHeight()) - this.zzF9.zzYr();
            }
        }
        this.zzF9.zzX(((double) this.zzFa.getY()) + height);
    }

    @Override // com.aspose.words.internal.zzHJ
    public final void zzY(double d) {
        if (this.zzF8) {
            this.zzF9.zzY(d);
        }
    }

    @Override // com.aspose.words.internal.zzHJ
    public final void zzZ(zzHQ zzhq, zzGJ zzgj, double d, double d2, int i) {
        if (this.zzF8) {
            zzhq.isVisible(false);
            return;
        }
        if (!zzM6() && !this.zzF9.zzY(zzhq, zzgj)) {
            this.zzF8 = true;
            zzhq.isVisible(false);
        } else {
            this.zzF9.zzZ(zzhq, zzgj);
            zzhq.isVisible(true);
            zzZ(zzhq, i, d, d2);
        }
    }

    private void zzZ(zzHQ zzhq, int i, double d, double d2) {
        zzhq.zzZ(i, d + ((double) this.zzFa.getX()), ((double) (this.zzFa.getWidth() + this.zzFa.getX())) - d2);
    }

    @Override // com.aspose.words.internal.zzHJ
    public final void zzZ(double d) {
        if (this.zzF8) {
            this.zzF9.zzZ(d);
        }
    }
}

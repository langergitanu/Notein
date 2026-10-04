package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzGZ implements zzZCS {
    private zz3Z zzZgq;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (com.aspose.words.internal.zzZ4.zzW(this, obj)) {
            return com.aspose.words.internal.zzZKO.equals(((zzGZ) obj).zzZPV(), zzZPV());
        }
        return false;
    }

    @Override // com.aspose.words.zzZCS
    public final int getFillType() {
        return 3;
    }

    public int hashCode() {
        return zzZPV().hashCode();
    }

    public final void zzY(zz3Z zz3z) {
        this.zzZgq = zz3z;
    }

    @Override // com.aspose.words.zzZCS
    public final void zzZ(com.aspose.words.internal.zzOH zzoh, zzGR zzgr, com.aspose.words.internal.zzEG zzeg) {
        zzoh.zzXR(4);
        com.aspose.words.internal.zzZQ4 zzzq4ZzZu = zzZPV().zzZu(com.aspose.words.internal.zzSA.zzS(zzgr.zzZPK()));
        if (!zzZPV().isEmpty()) {
            zzzq4ZzZu = new com.aspose.words.internal.zzZQ4(com.aspose.words.internal.zzSA.zzp(zzzq4ZzZu.getX()), com.aspose.words.internal.zzSA.zzp(zzzq4ZzZu.getY()), zzzq4ZzZu.getWidth(), zzzq4ZzZu.getHeight());
        }
        if (com.aspose.words.internal.zzAN.zzf(zzzq4ZzZu.getWidth()) || com.aspose.words.internal.zzAN.zzf(zzzq4ZzZu.getHeight())) {
            return;
        }
        zzoh.zzNb().zzZ(com.aspose.words.internal.zzP9.zzZ(zzoh.zzNd(), zzzq4ZzZu), 1);
    }

    @Override // com.aspose.words.zzZCS
    public final boolean zzZPU() {
        return !this.zzZgq.isEmpty();
    }

    public final zz3Z zzZPV() {
        if (this.zzZgq == null) {
            this.zzZgq = new zz3Z();
        }
        return this.zzZgq;
    }

    @Override // com.aspose.words.zzZCS
    public final zzZCS zzZPW() {
        zzGZ zzgz = new zzGZ();
        zz3Z zz3z = this.zzZgq;
        if (zz3z != null) {
            zzgz.zzZgq = zz3z.zzZwI();
        }
        return zzgz;
    }

    @Override // com.aspose.words.zzZCS
    public final void zzZ(zzZYD zzzyd) {
        zzzyd.zzY("a:stretch");
        zzzyd.zzZ(zzZPV(), "a", "fillRect", true);
        zzzyd.zzo();
    }
}

package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYH2 {
    private zzYH3 zzXve;
    private zzYFT zzXwE;
    private com.aspose.words.internal.zzZQC<zzYH3> zzqC = new com.aspose.words.internal.zzZQC<>();

    public zzYH2(zzYFT zzyft) {
        this.zzXwE = zzyft;
        zzYH3 zzyh3 = new zzYH3(zzyft);
        this.zzXve = zzyh3;
        this.zzqC.push(zzyh3);
    }

    public final int getCount() {
        return this.zzqC.size();
    }

    public final void zzX(zzYHP zzyhp) throws Exception {
        zzYH3 zzyh3 = new zzYH3(this.zzXwE, zzYiL(), zzyhp);
        this.zzXve = zzyh3;
        this.zzqC.push(zzyh3);
    }

    public final zzYH3 zzYiL() {
        return this.zzqC.size() > 0 ? this.zzqC.peek() : this.zzXve;
    }

    public final zzYH3 zzYih() {
        return zzYiL().zzYih();
    }

    public final void zzZP() {
        this.zzXve = this.zzqC.pop();
    }
}

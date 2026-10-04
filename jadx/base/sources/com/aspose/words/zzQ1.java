package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzQ1 {
    private com.aspose.words.internal.zzZQC<zzPW> zzZqx = new com.aspose.words.internal.zzZQC<>();

    public zzQ1(int i) {
        for (int i2 = 0; i2 < i + 1; i2++) {
            this.zzZqx.push(null);
        }
        this.zzZqx.size();
    }

    private zzPW zzZWk() {
        this.zzZqx.size();
        zzPW zzpwPeek = this.zzZqx.peek();
        if (zzpwPeek != null) {
            return zzpwPeek;
        }
        reset(0);
        return this.zzZqx.peek();
    }

    public final int getValue() {
        return zzZWk().getValue();
    }

    public final void reset(int i) {
        this.zzZqx.size();
        this.zzZqx.pop();
        zzPW zzpw = new zzPW(i);
        if (this.zzZqx.size() > 0) {
            this.zzZqx.pop();
            this.zzZqx.push(zzpw);
        }
        this.zzZqx.push(zzpw);
        this.zzZqx.size();
    }

    public final void zzMu(int i) {
        zzZWk().zzMu(i);
    }

    public final int[] zzZWl() {
        this.zzZqx.size();
        com.aspose.words.internal.zzDB zzdb = new com.aspose.words.internal.zzDB();
        zzPW zzpw = null;
        for (zzPW zzpw2 : this.zzZqx) {
            if (zzpw2 != zzpw) {
                if (zzpw2 != null) {
                    zzdb.add(zzpw2.getValue());
                }
                zzpw = zzpw2;
            }
        }
        if (zzdb.getCount() <= 0) {
            return new int[]{zzZWk().getValue()};
        }
        zzdb.reverse();
        return zzdb.toArray();
    }

    public final void zzZWm() {
        this.zzZqx.pop();
        this.zzZqx.size();
    }

    public final void zzZWn() {
        this.zzZqx.size();
        com.aspose.words.internal.zzZQC<zzPW> zzzqc = this.zzZqx;
        zzzqc.push(zzzqc.peek());
    }
}

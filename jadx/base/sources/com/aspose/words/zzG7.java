package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzG7 {
    private com.aspose.words.internal.zzD3<zzG8> zzZfh = new com.aspose.words.internal.zzD3<>();

    public final int getCount() {
        return this.zzZfh.getCount();
    }

    public final zzD9 zzLt(int i) {
        zzG8 zzg8 = this.zzZfh.get(i);
        return zzg8 != null ? zzg8.zzaQ() : new zzD9();
    }

    public final void zzZ(int i, zzD9 zzd9) {
        this.zzZfh.set(i, new zzG8(i, zzd9));
    }

    public final Iterable<zzG8> zzZOi() {
        return this.zzZfh.zzCJ();
    }

    public final zzG7 zzZOj() {
        zzG7 zzg7 = new zzG7();
        com.aspose.words.internal.zzD3<zzG8>.zzZ zzzZzCK = this.zzZfh.zzCK();
        while (zzzZzCK.moveNext()) {
            zzg7.zzZfh.set(zzzZzCK.zzCM(), zzzZzCK.zzCI().zzZOk());
        }
        return zzg7;
    }
}

package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzLF {
    private com.aspose.words.internal.zzDB zzZo3 = new com.aspose.words.internal.zzDB();
    private com.aspose.words.internal.zzDB zzZo2 = new com.aspose.words.internal.zzDB();

    public final boolean isEmpty() {
        return this.zzZo3.getCount() == 0;
    }

    public final int zzCR() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        return this.zzZo3.get(r0.getCount() - 1);
    }

    public final void zzVF(int i) {
        if (isEmpty() || i != zzCR()) {
            this.zzZo3.add(i);
            this.zzZo2.add(1);
        } else {
            int count = this.zzZo2.getCount() - 1;
            com.aspose.words.internal.zzDB zzdb = this.zzZo2;
            zzdb.set(count, zzdb.get(count) + 1);
        }
    }

    public final void zzZP() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        int count = this.zzZo2.getCount() - 1;
        this.zzZo2.set(count, r1.get(count) - 1);
        if (this.zzZo2.get(count) <= 0) {
            this.zzZo3.removeAt(count);
            this.zzZo2.removeAt(count);
        }
    }
}

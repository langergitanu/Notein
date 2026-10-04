package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYI4 {
    private com.aspose.words.internal.zzZYV<Object> zzXwF = new com.aspose.words.internal.zzZYV<>();

    public final void add(Object obj) {
        if (obj == null) {
            return;
        }
        Integer num = (Integer) obj;
        if (num.intValue() == Integer.MIN_VALUE || num.intValue() == 0 || this.zzXwF.zzVE(num.intValue())) {
            return;
        }
        this.zzXwF.add(num.intValue(), 0);
    }

    public final void clear() {
        this.zzXwF.clear();
    }

    public final int get(int i) {
        return this.zzXwF.zzT3(i);
    }

    public final int getCount() {
        return this.zzXwF.getCount();
    }

    public final zzYI4 zzYjc() {
        zzYI4 zzyi4 = new zzYI4();
        for (int i = 0; i < this.zzXwF.getCount(); i++) {
            zzyi4.zzXwF.add(this.zzXwF.zzT3(i), 0);
        }
        return zzyi4;
    }
}

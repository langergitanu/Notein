package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZGB {
    private zzZGA[] zzYo5 = new zzZGA[9];
    private int zzYo6;
    private List zzYo7;

    public zzZGB(List list, int i) {
        this.zzYo7 = list;
        this.zzYo6 = i;
        for (int i2 = 0; i2 < 9; i2++) {
            this.zzYo5[i2] = new zzZGA(this.zzYo7.getListLevels().get(i2));
        }
    }

    public final List getList() {
        return this.zzYo7;
    }

    public final int zzZ0z() {
        return this.zzYo6;
    }

    public final zzZGA zzzf(int i) {
        return this.zzYo5[i];
    }

    public final void zzzg(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            zzZGA zzzga = this.zzYo5[i2];
            if (!zzzga.zzZ0w()) {
                zzzga.zzZ0y();
            }
        }
        this.zzYo5[i].zzZ0y();
        while (true) {
            i++;
            if (i >= 9) {
                return;
            } else {
                this.zzYo5[i].zzZ0x();
            }
        }
    }
}

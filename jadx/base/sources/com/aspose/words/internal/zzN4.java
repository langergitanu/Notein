package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzN4 {
    private zzZQC<zzN5> zzE8 = new zzZQC<>();
    private zzNV zzE9;
    private zzNZ zzFn;

    public zzN4(zzNZ zznz, zzNV zznv) {
        this.zzFn = zznz;
        this.zzE9 = zznv;
    }

    private zzON zzKd() {
        zzON zzonZzNg = zzOK.zzNg();
        for (zzN5 zzn5 : this.zzE8) {
            if (zzn5.getType() == 1) {
                zzonZzNg = zzonZzNg.zzZ(zzn5.zzKf().zzMz());
            }
        }
        return zzonZzNg;
    }

    private zzP9 zzKe() {
        zzP9 zzp9 = new zzP9();
        for (zzN5 zzn5 : this.zzE8) {
            if (zzn5.getType() == 1) {
                zzp9.zzZ(zzn5.zzKg().zzMn(), 0);
            }
        }
        return zzp9;
    }

    private zzN5 zzi(int i, int i2) {
        zzN5 zzn5 = null;
        for (zzN5 zzn52 : this.zzE8) {
            if (zzn52.zzKh() == i && zzn52.getType() == i2) {
                zzn5 = zzn52;
            }
        }
        if (zzn5 == null) {
            return null;
        }
        while (this.zzE8.size() > 0) {
            zzN5 zzn5Pop = this.zzE8.pop();
            if (zzn5Pop == zzn5) {
                return zzn5Pop;
            }
        }
        return null;
    }

    private void zzj(int i, int i2) {
        zzN5 zzn5Zzi = zzi(i, i2);
        if (zzn5Zzi == null) {
            return;
        }
        this.zzE9.zzZ(zzn5Zzi.zzKg(), zzKe());
        this.zzFn.zzZ(zzn5Zzi.zzKf(), zzKd());
    }

    public final void zzX8(int i) {
        zzj(i, 0);
    }

    public final void zzX9(int i) {
        this.zzE8.push(new zzN5(i, 0, this.zzE9.zzMs(), this.zzFn.zzMC()));
    }

    public final void zzXy(int i) {
        zzj(i, 1);
    }

    public final void zzZ(int i, zzP9 zzp9) {
        this.zzE8.push(new zzN5(i, 1, this.zzE9.zzJ(zzp9), this.zzFn.zzMB()));
    }
}

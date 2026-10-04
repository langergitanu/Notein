package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public class zzOS extends zzOW {
    private zz0Q zzGf;

    private zzOS(int i) {
        this.zzGf = new zz0Q(i);
    }

    public final zz0Q zzNu() {
        return this.zzGf;
    }

    public final void zzNv() {
        int i = 0;
        while (i < this.zzGf.getCount() - 1 && this.zzGf.getCount() > 2) {
            if (zzJ6.zzN(this.zzGf.get(i), this.zzGf.get(i < this.zzGf.getCount() + (-1) ? i + 1 : 0))) {
                this.zzGf.removeAt(i);
            } else {
                i++;
            }
        }
    }

    public final void zzNw() {
        if (true != zzJ6.zzT(this.zzGf)) {
            this.zzGf.reverse();
        }
    }

    @Override // com.aspose.words.internal.zzOW
    public final zzOW zzPM() {
        zzOS zzos = new zzOS(this.zzGf.getCount());
        for (int i = 0; i < this.zzGf.getCount(); i++) {
            zzos.zzGf.add(this.zzGf.get(i));
        }
        return zzos;
    }

    @Override // com.aspose.words.internal.zzOW
    public final void zzPN() {
        this.zzGf.reverse();
    }

    @Override // com.aspose.words.internal.zzOW
    public final long zzPQ() {
        if (this.zzGf.getCount() == 0) {
            return 0L;
        }
        return this.zzGf.get(r0.getCount() - 1);
    }

    @Override // com.aspose.words.internal.zzOW
    public final long zzPR() {
        if (this.zzGf.getCount() == 0) {
            return 0L;
        }
        return this.zzGf.get(0);
    }

    @Override // com.aspose.words.internal.zzOW
    public final void zzY(zzP9 zzp9) {
        zzp9.zzX(this.zzGf);
    }

    @Override // com.aspose.words.internal.zzOW
    public final boolean zzZ(zzH2 zzh2) throws Exception {
        return zzh2.zzZ(this);
    }

    public final boolean zzk(long j) {
        return zzJ6.zzZ(j, this.zzGf, (long[]) null);
    }

    @Override // com.aspose.words.internal.zzOW
    public final boolean zzZ(zzOW zzow) {
        zzOS zzos;
        if (zzZKO.zzA(this, zzow)) {
            return true;
        }
        if (zzZKO.zzA(null, zzow) || (zzos = (zzOS) zzZKW.zzZ(zzow, zzOS.class)) == null || zzos.zzGf.getCount() != this.zzGf.getCount()) {
            return false;
        }
        for (int i = 0; i < zzos.zzGf.getCount(); i++) {
            if (!zzJ6.zzN(zzos.zzGf.get(i), this.zzGf.get(i))) {
                return false;
            }
        }
        return true;
    }

    public zzOS() {
        this(0);
    }

    public zzOS(long j, long j2) {
        zz0Q zz0q = new zz0Q(2);
        this.zzGf = zz0q;
        zz0q.add(j);
        this.zzGf.add(j2);
    }

    public zzOS(float[] fArr) {
        int length = fArr.length / 2;
        this.zzGf = new zz0Q(length);
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            this.zzGf.add(zzZPY.zzG(fArr[i2], fArr[i2 + 1]));
        }
    }

    public zzOS(zz0Q zz0q, boolean z) {
        this.zzGf = z ? new zz0Q(zz0q) : zz0q;
    }

    public zzOS(long[] jArr, boolean z) {
        this.zzGf = new zz0Q(jArr, z);
    }
}

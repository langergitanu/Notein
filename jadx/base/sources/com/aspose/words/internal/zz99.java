package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
abstract class zz99 extends zz80 {
    protected int zzqp;
    protected long zzqn = 0;
    protected long zzql = 0;
    protected long zzqo = 0;
    protected long zzqm = 0;
    protected zzP9 zzqk = new zzP9();

    private void zzzp() {
        if (zzAN.zzf(Float.intBitsToFloat((int) this.zzql))) {
            throw new IllegalStateException("Viewport width is invalid.");
        }
        if (zzAN.zzf(zzZPW.zzYz(this.zzql))) {
            throw new IllegalStateException("Viewport height is invalid.");
        }
    }

    private zzP9 zzzq() {
        zzzp();
        float fIntBitsToFloat = zzAN.zzf(Float.intBitsToFloat((int) this.zzqn)) ? 0.0f : Float.intBitsToFloat((int) this.zzql) / Float.intBitsToFloat((int) this.zzqn);
        float fZzYz = zzAN.zzf(zzZPW.zzYz(this.zzqn)) ? 0.0f : zzZPW.zzYz(this.zzql) / zzZPW.zzYz(this.zzqn);
        zzP9 zzp9 = new zzP9();
        zzp9.zzY(-Float.intBitsToFloat((int) this.zzqo), -zzZPY.zzYC(this.zzqo), 1);
        zzp9.zzZ(fIntBitsToFloat, fZzYz, 1);
        zzp9.zzY(Float.intBitsToFloat((int) this.zzqm), zzZPY.zzYC(this.zzqm), 1);
        return zzp9;
    }

    @Override // com.aspose.words.internal.zz80, com.aspose.words.internal.zzG4
    public final zzP9 zzMq() {
        zzP9 zzp9Zzzq = zzzq();
        zzp9Zzzq.zzZ(this.zzqk, 0);
        return zzp9Zzzq;
    }

    public final void zzUO(int i) {
        if (this.zzqp != i && i > 0 && i <= 8) {
            this.zzqp = i;
            switch (i) {
                case 1:
                    zzzs();
                    break;
                case 2:
                    zzzt();
                    break;
                case 3:
                    zzzu();
                    break;
                case 4:
                    zzzv();
                    break;
                case 5:
                    zzzw();
                    break;
                case 6:
                    zzzx();
                    break;
                case 7:
                    zzzr();
                    break;
                case 8:
                    break;
                default:
                    throw new IllegalStateException("Unexpected map mode.");
            }
            onChanged();
        }
    }

    public final void zzY(zz97 zz97Var) {
        this.zzqp = zz97Var.zzJe();
        this.zzqo = zz97Var.zzzo();
        this.zzqn = zz97Var.zzzn();
        this.zzqm = zz97Var.zzzm();
        this.zzql = zz97Var.zzzl();
        this.zzqk = zz97Var.zzzk();
        onChanged();
    }

    public final void zzZ(zz82 zz82Var) {
        zzZG(zz82Var.zzZw(this.zzqn));
    }

    public final void zzZB(long j) {
        zzZD(zzJ6.zzM(this.zzqm, j));
    }

    public final void zzZC(long j) {
        zzZE(zzJ6.zzM(this.zzqo, j));
    }

    public abstract void zzZD(long j);

    public abstract void zzZE(long j);

    public abstract void zzZF(long j);

    public abstract void zzZG(long j);

    public abstract void zzzr();

    public abstract void zzzs();

    public abstract void zzzt();

    public abstract void zzzu();

    public abstract void zzzv();

    public abstract void zzzw();

    public abstract void zzzx();

    public final zz97 zzzy() {
        return new zz97(this.zzqp, this.zzqo, this.zzqn, this.zzqm, this.zzql, this.zzqk.zzOh());
    }

    public void zzY(zz82 zz82Var) {
        zzZF(zz82Var.zzZw(this.zzql));
    }

    public final void zzY(zzP9 zzp9, int i) {
        if (i == 1) {
            this.zzqk = new zzP9();
        } else if (i == 2) {
            this.zzqk.zzZ(zzp9, 0);
        } else if (i == 3) {
            this.zzqk.zzZ(zzp9, 1);
        } else if (i == 4) {
            this.zzqk = zzp9;
        } else {
            throw new IllegalStateException("Unexpected transform mode.");
        }
        onChanged();
    }
}

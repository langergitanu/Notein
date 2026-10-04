package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzX1 {
    private int mColumnIndex;
    private String zzU5;
    private int zzU6;
    private int zzU7;
    private int zzU8;
    private Object zzU9;
    private zzFS zzUa;
    private Object zzUb;
    private int zzUf;

    public zzX1(Object obj, int i, Object obj2, zzFS zzfs) {
        this.zzUb = obj;
        this.zzUf = i;
        this.zzU9 = obj2;
        this.zzUa = zzfs;
        this.zzU8 = zzfs.zzB(obj);
        this.mColumnIndex = this.zzUa.zzA(this.zzUb);
        this.zzU7 = this.zzUa.zzx(this.zzUb);
        this.zzU6 = this.zzUa.zzw(this.zzUb);
    }

    public final int getColumnIndex() {
        return this.mColumnIndex;
    }

    public final int getColumnSpan() {
        return this.zzU6;
    }

    public final int getRowIndex() {
        return this.zzU8;
    }

    public final int getRowSpan() {
        return this.zzU7;
    }

    public final String zzVm() {
        if (this.zzU5 == null) {
            this.zzU5 = this.zzUa.zzC(this.zzUb);
        }
        return this.zzU5;
    }

    public final Object zzVn() {
        return this.zzU9;
    }

    public final int zzVo() {
        return this.zzUf;
    }

    public final int zzVp() {
        return this.mColumnIndex + this.zzU6;
    }

    public final int zzVq() {
        return this.zzU8 + this.zzU7;
    }

    public final Object zzVr() {
        return this.zzUb;
    }

    public final Object zzVv() {
        return this.zzUa.zzv(this.zzUb);
    }

    public final void zzY(zzX1 zzx1, boolean z) {
        if (z) {
            this.zzU6 += zzx1.zzU6;
        } else {
            this.zzU7 += zzx1.zzU7;
        }
        this.zzUa.zzZ(this.zzUb, zzx1.zzUb, z);
    }

    public final boolean zzv(boolean z) {
        return z ? this.zzU6 > 1 : this.zzU7 > 1;
    }
}

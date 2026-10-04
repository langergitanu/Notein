package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
class zz8P {
    private zzG8 zzpi;
    private zzG7 zzpj;
    private zz8T zzr4;

    public zz8P(zz8T zz8t, zzG7 zzg7, zzG8 zzg8) {
        this.zzpj = zzg7;
        this.zzpi = zzg8;
        this.zzr4 = zz8t;
    }

    public final void play() throws Exception {
        zzZOP zzzopZzR1 = this.zzr4.zzR1();
        zzzopZzR1.zzH(this.zzr4.zzyY());
        while (zzzopZzR1.getPosition() < zzzopZzR1.getLength() && zzzopZzR1.getPosition() + ((long) this.zzpj.zzJn()) <= zzzopZzR1.getLength()) {
            this.zzpj.zzJs();
            if (this.zzpj.zzJq() < this.zzpj.zzJn() || (zzzopZzR1.getPosition() + this.zzpj.zzJq()) - ((long) this.zzpj.zzJn()) > zzzopZzR1.getLength() || this.zzpj.zzJo() || !this.zzpi.zzMO()) {
                return;
            } else {
                this.zzpj.zzLn();
            }
        }
    }
}

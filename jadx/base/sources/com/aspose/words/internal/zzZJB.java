package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZJB {
    zzZJA zzZK2;
    zzZJC zzZK3;
    int zzZK5;
    int zzZK6;
    int zzZK7;
    int zzZK8;
    int zzZK9 = 8;
    boolean zzZK1 = true;
    short zzZK4 = -1;

    public zzZJB(zzZOP zzzop) throws Exception {
        this.zzZK3 = new zzZJC(zzzop, false);
        int i = 1 << 8;
        this.zzZK8 = i;
        this.zzZK7 = i + 1;
        int i2 = 8 + 1;
        this.zzZK6 = i2;
        int i3 = 1 << i2;
        this.zzZK5 = i3 - 1;
        this.zzZK5 = i3 - 2;
        zzZJA zzzja = new zzZJA();
        this.zzZK2 = zzzja;
        zzzja.zzPH(this.zzZK9);
        this.zzZK3.zzYS(this.zzZK8, this.zzZK6);
    }

    public final void flush() throws Exception {
        short s = this.zzZK4;
        if (s != -1) {
            this.zzZK3.zzYS(s, this.zzZK6);
        }
        this.zzZK3.zzYS(this.zzZK7, this.zzZK6);
        this.zzZK3.flush();
    }

    public final void zzJ(byte[] bArr, int i, int i2) throws Exception {
        int i3 = i2 + i;
        while (i < i3) {
            byte b = bArr[i];
            short sZzY = this.zzZK2.zzY(this.zzZK4, b);
            if (sZzY != -1) {
                this.zzZK4 = sZzY;
            } else {
                this.zzZK3.zzYS(this.zzZK4, this.zzZK6);
                if (this.zzZK2.zzZ(this.zzZK4, b) > this.zzZK5) {
                    int i4 = this.zzZK6;
                    if (i4 == 12) {
                        this.zzZK3.zzYS(this.zzZK8, i4);
                        this.zzZK2.zzPH(this.zzZK9);
                        this.zzZK6 = this.zzZK9 + 1;
                    } else {
                        this.zzZK6 = i4 + 1;
                    }
                    int i5 = 1 << this.zzZK6;
                    this.zzZK5 = i5 - 1;
                    if (this.zzZK1) {
                        this.zzZK5 = i5 - 2;
                    }
                }
                this.zzZK4 = (short) (b & 255);
            }
            i++;
        }
    }
}

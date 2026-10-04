package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzTA {
    private int zzZsg;
    private com.aspose.words.internal.zzZON zzZsj;
    private byte[] zzZsi = new byte[4152];
    private char[] zzZsh = new char[78];

    public zzTA(com.aspose.words.internal.zzZON zzzon) {
        this.zzZsj = zzzon;
    }

    private void flush() throws Exception {
        this.zzZsj.write(this.zzZsh, 0, this.zzZsg);
        this.zzZsg = 0;
    }

    private void zzZXx() throws Exception {
        char[] cArr = this.zzZsh;
        int i = this.zzZsg;
        this.zzZsg = i + 1;
        cArr[i] = '=';
        zzZXy();
    }

    private void zzZXy() throws Exception {
        this.zzZsj.zzZ(this.zzZsh, this.zzZsg);
        this.zzZsg = 0;
    }

    private void zzv(byte b) {
        char[] cArr = this.zzZsh;
        int i = this.zzZsg;
        this.zzZsg = i + 1;
        cArr[i] = '=';
        char[] cArrZzD = com.aspose.words.internal.zzZYD.zzD(b);
        char[] cArr2 = this.zzZsh;
        int i2 = this.zzZsg;
        int i3 = i2 + 1;
        this.zzZsg = i3;
        cArr2[i2] = cArrZzD[0];
        this.zzZsg = i2 + 2;
        cArr2[i3] = cArrZzD[1];
    }

    private void zzw(byte b) {
        char[] cArr = this.zzZsh;
        int i = this.zzZsg;
        this.zzZsg = i + 1;
        cArr[i] = (char) (b & 255);
    }

    public final void zzX(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        int i = 0;
        while (true) {
            int i2 = zzzop.read(this.zzZsi, i, 4096);
            if (i2 == 0) {
                break;
            }
            i += i2;
            int i3 = i / 57;
            if (i3 != 0) {
                int i4 = 0;
                while (true) {
                    i3--;
                    if (i3 < 0) {
                        break;
                    }
                    this.zzZsj.zzXB(com.aspose.words.internal.zzZQB.zzS(this.zzZsi, i4, 57));
                    i4 += 57;
                }
                i -= i4;
                byte[] bArr = this.zzZsi;
                com.aspose.words.internal.zzZKV.zzZ(bArr, i4, bArr, 0, i);
            }
        }
        if (i > 0) {
            this.zzZsj.zzXB(com.aspose.words.internal.zzZQB.zzS(this.zzZsi, 0, i));
        }
    }

    public final void zzZA(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        int i = zzzop.read(this.zzZsi, 0, 4096);
        if (i != 0) {
            this.zzZsg = 0;
            byte b = this.zzZsi[0];
            int i2 = 1;
            boolean z = true;
            while (true) {
                if (i2 >= i) {
                    if (!z) {
                        break;
                    }
                    i = zzzop.read(this.zzZsi, 0, 4096);
                    if (i == 0) {
                        this.zzZsi[0] = 13;
                        i2 = 0;
                        z = false;
                        i = 1;
                    } else {
                        i2 = 0;
                    }
                } else {
                    byte b2 = this.zzZsi[i2];
                    int i3 = 76 - this.zzZsg;
                    int i4 = b & 255;
                    if (i4 > 32 && b != 61 && i4 < 127) {
                        if (i3 <= 1 && (b2 & 255) != 13) {
                            zzZXx();
                        }
                        zzw(b);
                    } else if (i4 == 13) {
                        zzw(b);
                    } else if (i4 == 10) {
                        zzw(b);
                        flush();
                    } else if (i4 != 32 && i4 != 9) {
                        if (i3 < 3 || (i3 == 3 && (b2 & 255) != 13)) {
                            zzZXx();
                        }
                        zzv(b);
                    } else if ((b2 & 255) == 13) {
                        if (i3 < 3) {
                            zzZXx();
                        }
                        zzv(b);
                    } else if (i3 == 1) {
                        zzZXx();
                        zzw(b);
                    } else if (i3 != 2) {
                        zzw(b);
                    } else {
                        zzw(b);
                        zzZXx();
                    }
                    i2++;
                    b = b2;
                }
            }
            if (this.zzZsg != 0) {
                zzZXy();
            }
        }
    }
}

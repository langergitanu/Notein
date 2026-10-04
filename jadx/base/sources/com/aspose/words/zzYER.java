package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzYER {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\uc", "\\u");
    private com.aspose.words.internal.zzZOP zzN5;
    private int zzXqT;
    private boolean zzXqU;
    private boolean zzXqV;
    private boolean zzXqW;
    private int zzXqX;
    private zzYET zzXr2 = new zzYET();
    private zzYET zzXr0 = new zzYET();
    private com.aspose.words.internal.zzD7 zzXqZ = new com.aspose.words.internal.zzD7();
    private int zzXqY = 1;

    public zzYER(com.aspose.words.internal.zzZOP zzzop) {
        this.zzN5 = zzzop;
    }

    private static int zzO(char c, char c2) {
        if (com.aspose.words.internal.zzZYD.isHexDigit(c) && com.aspose.words.internal.zzZYD.isHexDigit(c2)) {
            return (com.aspose.words.internal.zzZYD.zzm(c) << 4) | com.aspose.words.internal.zzZYD.zzm(c2);
        }
        int iZzXS = (zzXS(c) << 4) | zzXS(c2);
        if (iZzXS >= 32 || iZzXS == 10 || iZzXS == 13) {
            return iZzXS;
        }
        return 95;
    }

    private static int zzXS(char c) {
        if (com.aspose.words.internal.zzZYD.isHexDigit(c)) {
            return com.aspose.words.internal.zzZYD.zzm(c);
        }
        return 0;
    }

    private void zzYeA() throws Exception {
        com.aspose.words.internal.zzZOP zzzop = this.zzN5;
        zzzop.zzH(zzzop.getPosition() - 1);
    }

    private void zzYeB() {
        this.zzXqX--;
    }

    private void zzYeC() {
        this.zzXqX = 0;
        this.zzXqW = false;
    }

    private void zzYeD() {
        this.zzXqX = this.zzXqY;
        this.zzXqW = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
    
        zzYeA();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzYeE() throws Exception {
        this.zzXr2.reset(4);
        while (true) {
            if (this.zzXqW && this.zzXqX <= 0) {
                return;
            }
            int iZzRI = this.zzN5.zzRI();
            if (iZzRI == -1) {
                zzYeC();
                return;
            }
            if (iZzRI != 10 && iZzRI != 13) {
                if (iZzRI == 92) {
                    int iZzRI2 = this.zzN5.zzRI();
                    if (iZzRI2 == -1) {
                        zzYeC();
                        return;
                    }
                    if (iZzRI2 != 39) {
                        if (iZzRI2 == 92 || iZzRI2 == 123 || iZzRI2 == 125) {
                            this.zzXr2.writeByte(iZzRI2);
                            return;
                        } else {
                            zzYeA();
                            zzYeA();
                            return;
                        }
                    }
                    this.zzXr2.writeByte(zzO((char) this.zzN5.zzRI(), (char) this.zzN5.zzRI()));
                    zzYeB();
                } else {
                    if (iZzRI == 123 || iZzRI == 125) {
                        break;
                    }
                    this.zzXr2.writeByte(iZzRI);
                    zzYeB();
                }
            }
        }
    }

    private void zzYeF() throws Exception {
        int iZzYeT = this.zzXr2.zzYeT();
        this.zzXr2.zzXM(new byte[iZzYeT]);
        this.zzN5.read(this.zzXr2.zzYf1(), 0, iZzYeT);
    }

    private void zzYeG() throws Exception {
        if (this.zzXqW) {
            zzYeC();
            zzYeA();
        } else {
            this.zzXr2.reset(3);
            if (this.zzXqZ.getCount() > 0) {
                this.zzXqY = this.zzXqZ.zzCQ();
            }
        }
    }

    private void zzYeH() throws Exception {
        if (this.zzXqW) {
            zzYeC();
            zzYeA();
        } else {
            this.zzXr2.reset(2);
            this.zzXqZ.zzVF(this.zzXqY);
        }
    }

    private void zzYeI() throws Exception {
        int iZzRI = this.zzN5.zzRI();
        if (iZzRI == -1) {
            this.zzXr2.reset(5);
            zzYeC();
            return;
        }
        if (iZzRI == 10 || iZzRI == 13) {
            this.zzXr2.zzBH("\\par");
            zzYeB();
            return;
        }
        if (iZzRI == 39) {
            zzYeA();
            zzYeA();
            zzYeE();
            return;
        }
        if (iZzRI != 42 && iZzRI != 45 && iZzRI != 58 && iZzRI != 92 && iZzRI != 95) {
            switch (iZzRI) {
                case 123:
                case 124:
                case 125:
                case 126:
                    break;
                default:
                    zznF(iZzRI);
                    break;
            }
            return;
        }
        zznG(iZzRI);
    }

    private void zzYeJ() throws Exception {
        this.zzXr2.zzYf0();
        this.zzXqT = this.zzXr2.getLength();
        zznE(this.zzN5.zzRI());
        this.zzXqV = true;
    }

    private void zzYeK() throws Exception {
        if (this.zzXqV && this.zzXr2.zzYeS()) {
            com.aspose.words.internal.zzZOP zzzop = this.zzN5;
            zzzop.zzH((zzzop.getPosition() - ((long) (this.zzXr2.getLength() - this.zzXqT))) - 1);
            this.zzXr2.zzRg(false);
        }
        this.zzXqV = false;
    }

    private void zzYeL() throws Exception {
        zzYeK();
        while (true) {
            int iZzRI = this.zzN5.zzRI();
            if (iZzRI == -1) {
                this.zzXr2.reset(5);
                zzYeC();
                return;
            }
            if (iZzRI != 10 && iZzRI != 13) {
                if (iZzRI == 92) {
                    zzYeI();
                    return;
                }
                if (iZzRI == 123) {
                    zzYeH();
                    return;
                }
                if (iZzRI == 125) {
                    zzYeG();
                    return;
                }
                zzYeA();
                if (this.zzXqU && this.zzXr2.zzYeS()) {
                    zzYeJ();
                    return;
                } else {
                    zzYeE();
                    return;
                }
            }
        }
    }

    private void zzYeM() throws Exception {
        if (this.zzXqY <= 0) {
            return;
        }
        zzYET zzyet = this.zzXr2;
        this.zzXr2 = this.zzXr0;
        zzYeD();
        while (this.zzXqX > 0) {
            zzYeL();
        }
        zzYeC();
        this.zzXr2 = zzyet;
    }

    private void zznE(int i) throws Exception {
        while (com.aspose.words.internal.zzZYD.isLetter(i)) {
            this.zzXr2.writeByte(i);
            i = this.zzN5.zzRI();
        }
        int length = this.zzXr2.getLength();
        if (i == 45) {
            this.zzXr2.writeByte(i);
            i = this.zzN5.zzRI();
        }
        this.zzXqU = false;
        if (i == 13) {
            if (this.zzN5.zzRI() == 10) {
                this.zzXqU = true;
            }
            zzYeA();
        }
        int i2 = i;
        while (true) {
            if (!com.aspose.words.internal.zzZYD.isDigit(i) && ((char) i) != '.') {
                break;
            }
            if (((char) i) != '.') {
                if (((char) i2) == '.') {
                    this.zzXr2.writeByte(46);
                }
                this.zzXr2.writeByte(i);
            }
            i2 = i;
            i = this.zzN5.zzRI();
        }
        if (((char) i2) == '.') {
            zzYeA();
            i = 46;
        }
        if (i != 32 && i != -1) {
            zzYeA();
        }
        zzYET zzyet = this.zzXr2;
        zzyet.zznI(zzyet.getLength() - length);
        if ("\\bin".equals(this.zzXr2.getName())) {
            zzYeF();
        }
        zzYeB();
    }

    private void zznF(int i) throws Exception {
        this.zzXr2.reset(1);
        this.zzXr2.writeByte(92);
        zznE(i);
    }

    private void zznG(int i) throws Exception {
        this.zzXr2.reset(1);
        this.zzXr2.writeByte(92);
        this.zzXr2.writeByte(i);
        zzYeB();
    }

    public final com.aspose.words.internal.zzZOP zz5() {
        return this.zzN5;
    }

    public zzYET zzYeN() {
        return this.zzXr2;
    }

    public void zzYeR() throws Exception {
        zzYeL();
        if (this.zzXr2.zzYeV()) {
            int iZzTP = zzUR.zzTP(this.zzXr2.getName());
            if (iZzTP == 0) {
                this.zzXqY = this.zzXr2.zzYeT();
            } else {
                if (iZzTP != 1) {
                    return;
                }
                zzYeM();
            }
        }
    }

    public final void zzon(int i) throws Exception {
        boolean z = true;
        int i2 = 0;
        boolean z2 = false;
        while (z) {
            int iZzRI = this.zzN5.zzRI();
            i2++;
            if (iZzRI == -1) {
                this.zzXr2.reset(5);
                z = false;
                if (i2 > 0) {
                    z2 = false;
                }
            } else if (iZzRI == 92) {
                z2 = true;
            } else if (iZzRI != 123) {
                if (iZzRI != 125) {
                    z2 = false;
                } else {
                    if (!z2) {
                        i--;
                    }
                    if (i == 0) {
                        zzYeG();
                        z = false;
                    }
                }
            } else if (!z2) {
                i++;
            }
        }
    }
}

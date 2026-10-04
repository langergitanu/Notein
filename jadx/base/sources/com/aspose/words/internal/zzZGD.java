package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public class zzZGD extends zzZER {
    final boolean zzmO;

    private zzZGD(zzZF1 zzzf1, zzZHC zzzhc) {
        this(zzzf1, zzzhc, false);
    }

    private static void zzXNP() throws Error {
        throw new IllegalStateException("Internal error: this method should never be called");
    }

    private void zzXNR() throws zzZQS {
        zzX8(zzxF(zzXNQ()));
    }

    private void zzXNS() throws zzZQS {
        char cZzXNY;
        while (true) {
            int i = this.zzWMi;
            if (i < this.zzWMh) {
                char[] cArr = this.zzWLX;
                this.zzWMi = i + 1;
                cZzXNY = cArr[i];
            } else {
                cZzXNY = zzXNY();
            }
            if (cZzXNY == '?') {
                do {
                    int i2 = this.zzWMi;
                    if (i2 < this.zzWMh) {
                        char[] cArr2 = this.zzWLX;
                        this.zzWMi = i2 + 1;
                        cZzXNY = cArr2[i2];
                    } else {
                        cZzXNY = zzXNY();
                    }
                } while (cZzXNY == '?');
                if (cZzXNY == '>') {
                    return;
                }
            }
            if (cZzXNY == '\n' || cZzXNY == '\r') {
                zzXc(cZzXNY);
            }
        }
    }

    private void zzXNT() throws zzZQS {
        char cZzXNY;
        char cZzXNY2;
        while (true) {
            int i = this.zzWMi;
            if (i < this.zzWMh) {
                char[] cArr = this.zzWLX;
                this.zzWMi = i + 1;
                cZzXNY = cArr[i];
            } else {
                cZzXNY = zzXNY();
            }
            if (cZzXNY == '-') {
                int i2 = this.zzWMi;
                if (i2 < this.zzWMh) {
                    char[] cArr2 = this.zzWLX;
                    this.zzWMi = i2 + 1;
                    cZzXNY2 = cArr2[i2];
                } else {
                    cZzXNY2 = zzXNY();
                }
                if (cZzXNY2 == '-') {
                    return;
                }
            } else if (cZzXNY == '\n' || cZzXNY == '\r') {
                zzXc(cZzXNY);
            }
        }
    }

    private void zzXNV() throws zzZQS {
        char cZzXNY;
        zzXNR();
        int i = this.zzWMi;
        if (i < this.zzWMh) {
            char[] cArr = this.zzWLX;
            this.zzWMi = i + 1;
            cZzXNY = cArr[i];
        } else {
            cZzXNY = zzXNY();
        }
        if (cZzXNY != ';') {
            this.zzWMi--;
        }
    }

    private char zzXNW() throws zzZQS {
        char cZzxF;
        while (true) {
            int i = this.zzWMi;
            if (i < this.zzWMh) {
                char[] cArr = this.zzWLX;
                this.zzWMi = i + 1;
                cZzxF = cArr[i];
            } else {
                cZzxF = zzxF(zzXNQ());
            }
            if (cZzxF != '%') {
                return cZzxF;
            }
            zzXNV();
        }
    }

    private void zzXNZ() throws zzZQS {
        while (true) {
            int iZzXMk = zzXMk();
            if (iZzXMk < 0) {
                zzxH(" in internal DTD subset");
            }
            if (iZzXMk == 37) {
                zzXNV();
            } else if (iZzXMk == 60) {
                char cZzXNW = zzXNW();
                if (cZzXNW == '?') {
                    zzXNS();
                } else if (cZzXNW == '!') {
                    char cZzXNW2 = zzXNW();
                    if (cZzXNW2 != '[') {
                        if (cZzXNW2 == '-') {
                            zzXNU();
                        } else if (cZzXNW2 < 'A' || cZzXNW2 > 'Z') {
                            zzXr(cZzXNW2);
                        } else {
                            zzXr(cZzXNW2);
                        }
                    }
                } else {
                    this.zzWMi--;
                }
            } else if (iZzXMk == 93) {
                break;
            } else {
                zzd(iZzXMk, " in internal DTD subset; expected a '<' to start a directive, or \"]>\" to end internal subset.");
            }
        }
        if (this.zzWKK != this.zzWKJ) {
            zzV("Encountered int. subset end marker ']]>' in an expanded entity; has to be at main level.", null, null);
        }
    }

    private void zzXq(char c) throws zzZQS {
        char cZzXNY;
        while (true) {
            int i = this.zzWMi;
            if (i < this.zzWMh) {
                char[] cArr = this.zzWLX;
                this.zzWMi = i + 1;
                cZzXNY = cArr[i];
            } else {
                cZzXNY = zzXNY();
            }
            if (cZzXNY == '\n' || cZzXNY == '\r') {
                zzXc(cZzXNY);
            } else if (cZzXNY == c) {
                return;
            }
        }
    }

    private void zzXr(char c) throws zzZQS {
        while (c != '>') {
            int i = this.zzWMi;
            if (i < this.zzWMh) {
                char[] cArr = this.zzWLX;
                this.zzWMi = i + 1;
                c = cArr[i];
            } else {
                c = zzXNY();
            }
            if (c == '\n' || c == '\r') {
                zzXc(c);
            } else if (c == '\'' || c == '\"') {
                zzXq(c);
            }
        }
    }

    public static void zzZ(zzZF3 zzzf3, zzZF1 zzzf1, zzZHC zzzhc) throws zzZQS {
        zzZGD zzzgd = new zzZGD(zzzf1, zzzhc);
        zzzgd.zzV(zzzf3);
        try {
            zzzgd.zzXNZ();
        } finally {
            zzzf3.zzV(zzzgd);
        }
    }

    @Override // com.aspose.words.internal.zzZER
    public zzZG3 zzI(String str, Object obj) {
        zzXNP();
        return null;
    }

    public final String zzXNQ() {
        return this.zzmO ? " in external DTD subset" : " in internal DTD subset";
    }

    public final void zzXNU() throws zzZQS {
        char cZzXNY;
        zzXNT();
        int i = this.zzWMi;
        if (i < this.zzWMh) {
            char[] cArr = this.zzWLX;
            this.zzWMi = i + 1;
            cZzXNY = cArr[i];
        } else {
            cZzXNY = zzXNY();
        }
        if (cZzXNY != '>') {
            zzV("String '--' not allowed in comment (missing '>'?)", null, null);
        }
    }

    public final char zzXNX() throws zzZQS {
        int i = this.zzWMi;
        if (i >= this.zzWMh) {
            return zzxF(zzXNQ());
        }
        char[] cArr = this.zzWLX;
        this.zzWMi = i + 1;
        return cArr[i];
    }

    public final char zzXNY() throws zzZQS {
        int i = this.zzWMi;
        if (i >= this.zzWMh) {
            return zzxE(zzXNQ());
        }
        char[] cArr = this.zzWLX;
        this.zzWMi = i + 1;
        return cArr[i];
    }

    @Override // com.aspose.words.internal.zzZER
    public void zzY(zzZF1 zzzf1) throws zzZQS {
    }

    @Override // com.aspose.words.internal.zzZEV
    public final zzZQY zzlj() {
        return zzXMp();
    }

    @Override // com.aspose.words.internal.zzZER
    public void zzxW(String str) throws zzZQS {
    }

    public zzZG3 zzy2(String str) {
        return null;
    }

    public zzZGD(zzZF1 zzzf1, zzZHC zzzhc, boolean z) {
        super(zzzf1, zzzhc, zzzhc.zzXPu());
        this.zzmO = z;
        this.zzWKM = true;
    }
}

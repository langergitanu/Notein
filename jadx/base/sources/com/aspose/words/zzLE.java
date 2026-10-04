package com.aspose.words;

import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: loaded from: classes6.dex */
final class zzLE {
    private zzLD zzZo1;
    private zzLH zzZpQ;
    private static zzLH zzZnY = new zzLH(12);
    private static zzLH zzZnX = new zzLH(17);
    private static zzLH zzZnW = new zzLH(15);
    private static zzLH zzZnV = new zzLH(16);
    private static zzLH zzZnU = new zzLH(13);
    private static zzLH zzZnT = new zzLH(14);
    private static zzLH zzZnS = new zzLH(18);
    private static zzLH zzZnR = new zzLH(19);
    private static zzLH zzZnQ = new zzLH(22);
    private static zzLH zzZnP = new zzLH(23);
    private static zzLH zzZnO = new zzLH(20);
    private static zzLH zzZnN = new zzLH(21);
    private static zzLH zzZnM = new zzLH(7);
    private static zzLH zzZnL = new zzLH(5);
    private static zzLH zzZnK = new zzPO('!');
    private static zzLH zzZnJ = new zzPO('~');
    private static zzLH zzZnI = new zzPO('=');
    private static zzLH zzZnH = new zzPO('>');
    private static zzLH zzZnG = new zzPO('|');
    private static zzLH zzZnF = new zzPO('+');
    private static zzLH zzZnE = new zzPO('-');
    private static zzLH zzZnD = new zzPO('*');
    private static zzLH zzZnC = new zzPO(IOUtils.DIR_SEPARATOR_UNIX);
    private StringBuilder zzZo0 = new StringBuilder();
    private StringBuilder zzZnZ = new StringBuilder(6);

    public zzLE(String str) {
        this.zzZo1 = new zzLD(str);
    }

    private static boolean isWhitespace(char c) {
        return c == ' ' || c == '\n' || c == '\t';
    }

    private void zzE(StringBuilder sb) {
        if (this.zzZo1.zzZTV()) {
            sb.append((char) 65533);
            return;
        }
        this.zzZo1.zzZTX();
        if (!com.aspose.words.internal.zzZYD.isHexDigit(this.zzZo1.zzFI())) {
            sb.append(this.zzZo1.zzFI());
            return;
        }
        this.zzZnZ.setLength(0);
        this.zzZnZ.append(this.zzZo1.zzFI());
        while (this.zzZnZ.length() < 6 && com.aspose.words.internal.zzZYD.isHexDigit(this.zzZo1.zzZTU())) {
            this.zzZo1.zzZTX();
            this.zzZnZ.append(this.zzZo1.zzFI());
        }
        if (isWhitespace(this.zzZo1.zzZTU())) {
            this.zzZo1.zzZTX();
        }
        com.aspose.words.internal.zzZNH.zzU(sb, zzSa(this.zzZnZ.toString()));
    }

    private static String zzSa(String str) {
        int iZzZe = com.aspose.words.internal.zzJB.zzZe(str);
        return (iZzZe == 0 || !com.aspose.words.internal.zzZVS.zzS5(iZzZe) || (!com.aspose.words.internal.zzZVS.zzS4(iZzZe) && com.aspose.words.internal.zzZVS.isSurrogate((char) iZzZe))) ? "�" : com.aspose.words.internal.zzZVS.zzS7(iZzZe);
    }

    private static boolean zzT(char c, char c2) {
        return (c != '\\' || c2 == 0 || c2 == '\n') ? false : true;
    }

    private static boolean zzY(char c, char c2, char c3) {
        if (zzZd(c)) {
            return true;
        }
        if (c == '-') {
            return zzZd(c2) || zzT(c2, c3);
        }
        if (c == '\\') {
            return zzT(c, c2);
        }
        return false;
    }

    private static boolean zzZ(char c, char c2, char c3) {
        if (com.aspose.words.internal.zzZYD.isDigit(c)) {
            return true;
        }
        if (c == '+' || c == '-') {
            return com.aspose.words.internal.zzZYD.isDigit(c2) || (c2 == '.' && com.aspose.words.internal.zzZYD.isDigit(c3));
        }
        if (c != '.') {
            return false;
        }
        return com.aspose.words.internal.zzZYD.isDigit(c2);
    }

    private void zzZTY() {
        while (this.zzZo1.zzZTU() == '/' && this.zzZo1.zzZTT() == '*') {
            this.zzZo1.zzZTX();
            this.zzZo1.zzZTX();
            while (true) {
                if (!this.zzZo1.zzZTV()) {
                    this.zzZo1.zzZTX();
                    if (this.zzZo1.zzFI() == '*' && this.zzZo1.zzZTU() == '/') {
                        this.zzZo1.zzZTX();
                        break;
                    }
                }
            }
        }
    }

    private boolean zzZTZ() {
        boolean z = false;
        boolean zZzZU0 = true;
        while (zZzZU0) {
            zzZTY();
            zZzZU0 = zzZU0();
            if (zZzZU0) {
                z = true;
            }
        }
        return z;
    }

    private boolean zzZU0() {
        boolean z = false;
        while (isWhitespace(this.zzZo1.zzZTU())) {
            this.zzZo1.zzZTX();
            z = true;
        }
        return z;
    }

    private zzLH zzZU1() {
        this.zzZo0.setLength(0);
        char cZzFI = this.zzZo1.zzFI();
        while (this.zzZo1.zzZTX() && this.zzZo1.zzFI() != cZzFI) {
            char cZzFI2 = this.zzZo1.zzFI();
            if (cZzFI2 == '\n') {
                this.zzZo1.zzZTW();
                return zzZnL;
            }
            if (cZzFI2 != '\\') {
                this.zzZo0.append(this.zzZo1.zzFI());
            } else if (!this.zzZo1.zzZTV()) {
                if (this.zzZo1.zzZTU() == '\n') {
                    this.zzZo1.zzZTX();
                } else {
                    zzE(this.zzZo0);
                }
            }
        }
        return new zzLJ(4, this.zzZo0.toString());
    }

    private String zzZU2() {
        this.zzZo0.setLength(0);
        while (true) {
            if (!this.zzZo1.zzZTX()) {
                break;
            }
            if (!zzZc(this.zzZo1.zzFI())) {
                if (!zzT(this.zzZo1.zzFI(), this.zzZo1.zzZTU())) {
                    this.zzZo1.zzZTW();
                    break;
                }
                zzE(this.zzZo0);
            } else {
                this.zzZo0.append(this.zzZo1.zzFI());
            }
        }
        return this.zzZo0.toString();
    }

    private zzLH zzZU3() {
        boolean z;
        boolean z2;
        boolean z3;
        double d;
        int i;
        boolean z4 = false;
        this.zzZo0.setLength(0);
        boolean z5 = this.zzZo1.zzZTU() == '-';
        if (this.zzZo1.zzZTU() == '+' || this.zzZo1.zzZTU() == '-') {
            this.zzZo1.zzZTX();
            this.zzZo0.append(this.zzZo1.zzFI());
            z = true;
        } else {
            z = false;
        }
        while (com.aspose.words.internal.zzZYD.isDigit(this.zzZo1.zzZTU())) {
            this.zzZo1.zzZTX();
            this.zzZo0.append(this.zzZo1.zzFI());
        }
        if (this.zzZo1.zzZTU() == '.' && com.aspose.words.internal.zzZYD.isDigit(this.zzZo1.zzZTT())) {
            this.zzZo1.zzZTX();
            this.zzZo0.append(this.zzZo1.zzFI());
            this.zzZo1.zzZTX();
            this.zzZo0.append(this.zzZo1.zzFI());
            while (com.aspose.words.internal.zzZYD.isDigit(this.zzZo1.zzZTU())) {
                this.zzZo1.zzZTX();
                this.zzZo0.append(this.zzZo1.zzFI());
            }
            z2 = false;
        } else {
            z2 = true;
        }
        char cZzZTU = this.zzZo1.zzZTU();
        char cZzZTT = this.zzZo1.zzZTT();
        char cZzZTS = this.zzZo1.zzZTS();
        if (cZzZTU == 'e' || cZzZTU == 'E') {
            boolean z6 = cZzZTT == '-';
            int i2 = com.aspose.words.internal.zzZYD.isDigit(cZzZTT) ? 2 : ((cZzZTT == '+' || cZzZTT == '-') && com.aspose.words.internal.zzZYD.isDigit(cZzZTS)) ? 3 : 0;
            if (i2 > 0) {
                for (int i3 = 0; i3 < i2; i3++) {
                    this.zzZo1.zzZTX();
                    this.zzZo0.append(this.zzZo1.zzFI());
                }
                while (com.aspose.words.internal.zzZYD.isDigit(this.zzZo1.zzZTU())) {
                    this.zzZo1.zzZTX();
                    this.zzZo0.append(this.zzZo1.zzFI());
                }
                z3 = false;
                z4 = z6;
            } else {
                z4 = z6;
                z3 = z2;
            }
        } else {
            z3 = z2;
        }
        double dZzZs = com.aspose.words.internal.zzJB.zzZs(this.zzZo0.toString());
        double d2 = Double.MAX_VALUE;
        if (Double.isInfinite(dZzZs)) {
            dZzZs = z5 ? -1.7976931348623157E308d : Double.MAX_VALUE;
        }
        if (Double.isNaN(dZzZs)) {
            if (z4) {
                d2 = 0.0d;
            } else if (z5) {
                d2 = -1.7976931348623157E308d;
            }
            d = d2;
        } else {
            d = dZzZs;
        }
        if (zzY(this.zzZo1.zzZTU(), this.zzZo1.zzZTT(), this.zzZo1.zzZTS())) {
            return new zzPM(d, zzZU2(), z3, z);
        }
        if (this.zzZo1.zzZTU() == '%') {
            this.zzZo1.zzZTX();
            i = 10;
        } else {
            i = 9;
        }
        return new zzNI(i, d, z3, z);
    }

    private zzLH zzZU4() {
        if (!zzZc(this.zzZo1.zzZTU()) && !zzT(this.zzZo1.zzZTU(), this.zzZo1.zzZTT())) {
            return zzZa(this.zzZo1.zzFI());
        }
        return new zzOW(zzZU2(), zzY(this.zzZo1.zzZTU(), this.zzZo1.zzZTT(), this.zzZo1.zzZTS()));
    }

    private zzLH zzZU5() {
        this.zzZo0.setLength(0);
        while (true) {
            this.zzZo1.zzZTX();
            if (this.zzZo1.zzFI() == ')' || this.zzZo1.zzFI() == 0) {
                break;
            }
            if (zzT(this.zzZo1.zzFI(), this.zzZo1.zzZTU())) {
                zzE(this.zzZo0);
            }
        }
        return zzZnM;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c4, code lost:
    
        return zzZU5();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d0, code lost:
    
        return new com.aspose.words.zzLJ(6, r7.zzZo0.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzLH zzZU6() {
        boolean z;
        zzZU0();
        if (this.zzZo1.zzZTV()) {
            return new zzLJ(6, "");
        }
        if (this.zzZo1.zzZTU() == '\"' || this.zzZo1.zzZTU() == '\'') {
            this.zzZo1.zzZTX();
            zzLH zzlhZzZU1 = zzZU1();
            if (zzlhZzZU1.getType() == 5) {
                return zzZU5();
            }
            zzZU0();
            z = this.zzZo1.zzZTU() == ')';
            if (!z && !this.zzZo1.zzZTV()) {
                return zzZU5();
            }
            if (z) {
                this.zzZo1.zzZTX();
            }
            return new zzLJ(6, ((zzLJ) zzlhZzZU1).getText());
        }
        this.zzZo0.setLength(0);
        while (true) {
            this.zzZo1.zzZTX();
            if (isWhitespace(this.zzZo1.zzFI())) {
                zzZU0();
                z = this.zzZo1.zzZTU() == ')';
                if (!z && !this.zzZo1.zzZTV()) {
                    return zzZU5();
                }
                if (z) {
                    this.zzZo1.zzZTX();
                }
                return new zzLJ(6, this.zzZo0.toString());
            }
            if (zzZb(this.zzZo1.zzFI())) {
                return zzZU5();
            }
            char cZzFI = this.zzZo1.zzFI();
            if (cZzFI != 0) {
                if (cZzFI != '\"') {
                    if (cZzFI != '\\') {
                        switch (cZzFI) {
                            case '\'':
                            case '(':
                                break;
                            case ')':
                                break;
                            default:
                                this.zzZo0.append(this.zzZo1.zzFI());
                                break;
                        }
                    } else {
                        if (!zzT(this.zzZo1.zzFI(), this.zzZo1.zzZTU())) {
                            return zzZU5();
                        }
                        zzE(this.zzZo0);
                    }
                }
            }
        }
    }

    private zzLH zzZU7() {
        String strZzZU2 = zzZU2();
        if (this.zzZo1.zzZTU() != '(') {
            return new zzLJ(0, strZzZU2);
        }
        if ("url".equals(com.aspose.words.internal.zzZYD.zzXl(strZzZU2))) {
            this.zzZo1.zzZTX();
            return zzZU6();
        }
        this.zzZo1.zzZTX();
        return new zzLJ(1, strZzZU2);
    }

    private static zzLH zzZa(char c) {
        return c != '!' ? c != '-' ? c != '/' ? c != '|' ? c != '~' ? c != '*' ? c != '+' ? c != '=' ? c != '>' ? new zzPO(c) : zzZnH : zzZnI : zzZnF : zzZnD : zzZnJ : zzZnG : zzZnC : zzZnE : zzZnK;
    }

    private static boolean zzZb(char c) {
        if ((c <= 0 || c > '\b') && c != 11) {
            return (c >= 14 && c <= 31) || c == 127;
        }
        return true;
    }

    private static boolean zzZc(char c) {
        return zzZd(c) || com.aspose.words.internal.zzZYD.isDigit(c) || c == '-';
    }

    private static boolean zzZd(char c) {
        return com.aspose.words.internal.zzZYD.isLetter(c) || c == '_' || c >= 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0238  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean moveNext() {
        this.zzZpQ = zzLH.zzZo4;
        if (zzZTZ()) {
            this.zzZpQ = zzZnY;
            return true;
        }
        if (this.zzZo1.zzZTV()) {
            return false;
        }
        this.zzZo1.zzZTX();
        if (zzZd(this.zzZo1.zzFI())) {
            this.zzZo1.zzZTW();
            this.zzZpQ = zzZU7();
            return true;
        }
        if (com.aspose.words.internal.zzZYD.isDigit(this.zzZo1.zzFI())) {
            this.zzZo1.zzZTW();
            this.zzZpQ = zzZU3();
            return true;
        }
        char cZzFI = this.zzZo1.zzFI();
        if (cZzFI == '\"') {
            this.zzZpQ = zzZU1();
        } else if (cZzFI == '#') {
            this.zzZpQ = zzZU4();
        } else if (cZzFI != '@') {
            if (cZzFI == '{') {
                this.zzZpQ = zzZnO;
            } else if (cZzFI != '}') {
                switch (cZzFI) {
                    case '\'':
                        break;
                    case '(':
                        this.zzZpQ = zzZnS;
                        break;
                    case ')':
                        this.zzZpQ = zzZnR;
                        break;
                    default:
                        switch (cZzFI) {
                            case '+':
                                if (!zzZ(this.zzZo1.zzFI(), this.zzZo1.zzZTU(), this.zzZo1.zzZTT())) {
                                    this.zzZpQ = zzZa(this.zzZo1.zzFI());
                                } else {
                                    this.zzZo1.zzZTW();
                                    this.zzZpQ = zzZU3();
                                }
                                break;
                            case ',':
                                this.zzZpQ = zzZnX;
                                break;
                            case '-':
                                if (zzZ(this.zzZo1.zzFI(), this.zzZo1.zzZTU(), this.zzZo1.zzZTT())) {
                                    this.zzZo1.zzZTW();
                                    this.zzZpQ = zzZU3();
                                } else if (zzY(this.zzZo1.zzFI(), this.zzZo1.zzZTU(), this.zzZo1.zzZTT())) {
                                    this.zzZo1.zzZTW();
                                    this.zzZpQ = zzZU7();
                                } else if (this.zzZo1.zzZTU() == '-' && this.zzZo1.zzZTT() == '>') {
                                    this.zzZo1.zzZTX();
                                    this.zzZo1.zzZTX();
                                    this.zzZpQ = zzZnT;
                                } else {
                                    this.zzZpQ = zzZa(this.zzZo1.zzFI());
                                }
                                break;
                            case '.':
                                if (!zzZ(this.zzZo1.zzFI(), this.zzZo1.zzZTU(), this.zzZo1.zzZTT())) {
                                    this.zzZpQ = zzZa(this.zzZo1.zzFI());
                                } else {
                                    this.zzZo1.zzZTW();
                                    this.zzZpQ = zzZU3();
                                }
                                break;
                            default:
                                switch (cZzFI) {
                                    case ':':
                                        this.zzZpQ = zzZnW;
                                        break;
                                    case ';':
                                        this.zzZpQ = zzZnV;
                                        break;
                                    case '<':
                                        if (this.zzZo1.zzZTU() == '!' && this.zzZo1.zzZTT() == '-' && this.zzZo1.zzZTS() == '-') {
                                            this.zzZo1.zzZTX();
                                            this.zzZo1.zzZTX();
                                            this.zzZo1.zzZTX();
                                            this.zzZpQ = zzZnU;
                                        } else {
                                            this.zzZpQ = zzZa(this.zzZo1.zzFI());
                                        }
                                        break;
                                    default:
                                        switch (cZzFI) {
                                            case '[':
                                                this.zzZpQ = zzZnQ;
                                                break;
                                            case '\\':
                                                if (!zzT(this.zzZo1.zzFI(), this.zzZo1.zzZTU())) {
                                                    this.zzZpQ = zzZa(this.zzZo1.zzFI());
                                                } else {
                                                    this.zzZo1.zzZTW();
                                                    this.zzZpQ = zzZU7();
                                                }
                                                break;
                                            case ']':
                                                this.zzZpQ = zzZnP;
                                                break;
                                            default:
                                                this.zzZpQ = zzZa(this.zzZo1.zzFI());
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                this.zzZpQ = zzZnN;
            }
        } else if (zzY(this.zzZo1.zzZTU(), this.zzZo1.zzZTT(), this.zzZo1.zzZTS())) {
            this.zzZpQ = new zzLJ(2, zzZU2());
        } else {
            this.zzZpQ = zzZa(this.zzZo1.zzFI());
        }
        return true;
    }

    public final zzLH zzZU8() {
        return this.zzZpQ;
    }
}

package com.aspose.words;

import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: loaded from: classes6.dex */
final class zzZE8 {
    private boolean zzYkN;
    private boolean zzYkO;
    private zzZE9 zzYkQ;
    private zzZEZ zzYlA;
    private zzZRE zzYnh;
    private zzZK8 zzYqY;
    private StringBuilder zzYuF = new StringBuilder();
    private StringBuilder zzYkP = new StringBuilder();
    private StringBuilder zzYkM = new StringBuilder();
    private StringBuilder zzYkL = new StringBuilder();
    private String zzYkK = "";
    private int zzKF = 12;

    public zzZE8(String str, zzZRE zzzre) {
        this.zzYlA = new zzZEZ(str);
        this.zzYnh = zzzre;
    }

    private static boolean isWhitespace(char c) {
        return c == ' ' || c == '\t' || c == '\n' || c == '\f';
    }

    private boolean zzK8(String str) {
        return com.aspose.words.internal.zzZKN.equals(str, this.zzYkK);
    }

    private boolean zzK9(String str) {
        if (!com.aspose.words.internal.zzZYD.zzi(this.zzYlA.zzz2(str.length()), str)) {
            return false;
        }
        this.zzYlA.zzz3(str.length());
        return true;
    }

    private boolean zzKa(String str) {
        if (!com.aspose.words.internal.zzZKN.equals(this.zzYlA.zzz2(str.length()), str)) {
            return false;
        }
        this.zzYlA.zzz3(str.length());
        return true;
    }

    private void zzVd(boolean z) {
        this.zzYkP.setLength(0);
        this.zzYkO = z;
        this.zzYkN = false;
        this.zzYqY = new zzZK8();
    }

    private String zzVe(boolean z) {
        StringBuilder sb = new StringBuilder();
        zzZEY zzzeyZzYYR = this.zzYlA.zzYYR();
        zzZEY zzzeyZzYYR2 = this.zzYlA.zzYYR();
        String str = "";
        boolean z2 = false;
        while (zzZJN.zzKX(sb.toString())) {
            this.zzYlA.zzYYT();
            if (this.zzYlA.zzIw() == 65535) {
                break;
            }
            sb.append(this.zzYlA.zzIw());
            String strZzKY = zzZJN.zzKY(sb.toString());
            if (strZzKY.length() > 0) {
                z2 = this.zzYlA.zzIw() == ';';
                zzzeyZzYYR2 = this.zzYlA.zzYYR();
                str = strZzKY;
            }
        }
        this.zzYlA.zzZ(zzzeyZzYYR2);
        if (!z || z2 || (!com.aspose.words.internal.zzZYD.isLetterOrDigit(this.zzYlA.zzFP()) && this.zzYlA.zzFP() != '=')) {
            return str;
        }
        this.zzYlA.zzZ(zzzeyZzYYR);
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String zzVf(boolean z) {
        String strZzYY2;
        char cZzFP = this.zzYlA.zzFP();
        if (cZzFP == '\t' || cZzFP == '\n' || cZzFP == '\f' || cZzFP == ' ') {
            strZzYY2 = "";
        } else if (cZzFP == '#') {
            strZzYY2 = zzYY2();
        } else if (cZzFP != '&' && cZzFP != '<' && cZzFP != 65535) {
            strZzYY2 = zzVe(z);
        }
        return strZzYY2.length() > 0 ? strZzYY2 : "&";
    }

    private void zzVg(boolean z) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        zzZEY zzzeyZzYYR = null;
        char c = 0;
        while (true) {
            if (this.zzYlA.zzIw() == 65535 && c == 0) {
                this.zzYlA.zzYYS();
                return;
            }
            if (this.zzYlA.zzIw() == '<') {
                this.zzYlA.zzYYS();
                zzzeyZzYYR = this.zzYlA.zzYYR();
                this.zzYlA.zzYYT();
            }
            if (c == 0) {
                char cZzIw = this.zzYlA.zzIw();
                if (cZzIw != '&') {
                    if (cZzIw != '<') {
                        this.zzYuF.append(zzYQ(this.zzYlA.zzIw()));
                    } else {
                        c = 1;
                    }
                } else if (z) {
                    com.aspose.words.internal.zzZNH.zzU(this.zzYuF, zzVf(false));
                } else {
                    this.zzYuF.append('&');
                }
            } else if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        continue;
                    } else if (com.aspose.words.internal.zzZYD.isLetter(this.zzYlA.zzIw())) {
                        sb.append(com.aspose.words.internal.zzZYD.zzo(this.zzYlA.zzIw()));
                        sb2.append(this.zzYlA.zzIw());
                    } else {
                        if (zzYP(this.zzYlA.zzIw()) && zzK8(sb.toString())) {
                            this.zzYlA.zzZ(zzzeyZzYYR);
                            return;
                        }
                        com.aspose.words.internal.zzZNH.zzU(com.aspose.words.internal.zzZNH.zzU(this.zzYuF, "</"), sb2.toString());
                        sb2.setLength(0);
                        sb.setLength(0);
                        this.zzYlA.zzYYS();
                        c = 0;
                    }
                } else if (com.aspose.words.internal.zzZYD.isLetter(this.zzYlA.zzIw())) {
                    sb.setLength(0);
                    sb.append(com.aspose.words.internal.zzZYD.zzo(this.zzYlA.zzIw()));
                    sb2.append(this.zzYlA.zzIw());
                    c = 3;
                } else {
                    com.aspose.words.internal.zzZNH.zzU(this.zzYuF, "</");
                    this.zzYlA.zzYYS();
                    c = 0;
                }
            } else if (this.zzYlA.zzIw() == '/') {
                sb2.setLength(0);
                c = 2;
            } else {
                this.zzYuF.append('<');
                this.zzYlA.zzYYS();
                c = 0;
            }
            this.zzYlA.zzYYT();
        }
    }

    private static boolean zzYP(char c) {
        return isWhitespace(c) || c == '/' || c == '>';
    }

    private static char zzYQ(char c) {
        if (c == 0) {
            return (char) 65533;
        }
        return c;
    }

    private void zzYX(boolean z) throws Exception {
        do {
            this.zzYlA.zzYYT();
            switch (this.zzKF) {
                case 0:
                    char cZzIw = this.zzYlA.zzIw();
                    if (cZzIw == '\t' || cZzIw == '\n' || cZzIw == '\f' || cZzIw == ' ') {
                        this.zzKF = 6;
                    } else if (cZzIw == '/') {
                        this.zzKF = 22;
                    } else if (cZzIw == '>') {
                        this.zzKF = 12;
                        zzYXZ();
                        return;
                    } else if (cZzIw == 65535) {
                        this.zzKF = 12;
                        this.zzYlA.zzYYS();
                    } else {
                        this.zzKF = 6;
                        this.zzYlA.zzYYS();
                    }
                    break;
                case 1:
                    char cZzo = com.aspose.words.internal.zzZYD.zzo(this.zzYlA.zzIw());
                    if (cZzo != '\t' && cZzo != '\n' && cZzo != '\f' && cZzo != ' ') {
                        if (cZzo == '/') {
                            this.zzKF = 22;
                        } else if (cZzo == 65535) {
                            this.zzKF = 12;
                            this.zzYlA.zzYYS();
                        } else if (cZzo == '=') {
                            this.zzKF = 7;
                        } else if (cZzo == '>') {
                            this.zzKF = 12;
                            zzYXZ();
                            return;
                        } else {
                            zzYY1();
                            this.zzYkM.append(zzYQ(cZzo));
                            this.zzKF = 2;
                        }
                    }
                    break;
                case 2:
                    char cZzo2 = com.aspose.words.internal.zzZYD.zzo(this.zzYlA.zzIw());
                    if (cZzo2 == '\t' || cZzo2 == '\n' || cZzo2 == '\f' || cZzo2 == ' ') {
                        this.zzKF = 1;
                    } else if (cZzo2 == '/') {
                        this.zzKF = 22;
                    } else if (cZzo2 == 65535) {
                        this.zzKF = 12;
                        this.zzYlA.zzYYS();
                    } else if (cZzo2 == '=') {
                        this.zzKF = 7;
                    } else if (cZzo2 == '>') {
                        this.zzKF = 12;
                        zzYXZ();
                        return;
                    } else {
                        this.zzYkM.append(zzYQ(cZzo2));
                        this.zzKF = 2;
                    }
                    break;
                case 3:
                    char cZzIw2 = this.zzYlA.zzIw();
                    if (cZzIw2 == '\"') {
                        this.zzKF = 0;
                    } else if (cZzIw2 == '&') {
                        com.aspose.words.internal.zzZNH.zzU(this.zzYkL, zzVf(true));
                    } else if (cZzIw2 == 65535) {
                        this.zzKF = 12;
                        this.zzYlA.zzYYS();
                    } else {
                        this.zzYkL.append(zzYQ(this.zzYlA.zzIw()));
                    }
                    break;
                case 4:
                    char cZzIw3 = this.zzYlA.zzIw();
                    if (cZzIw3 == '\t' || cZzIw3 == '\n' || cZzIw3 == '\f' || cZzIw3 == ' ') {
                        this.zzKF = 6;
                    } else if (cZzIw3 == '&') {
                        com.aspose.words.internal.zzZNH.zzU(this.zzYkL, zzVf(true));
                    } else if (cZzIw3 == '>') {
                        this.zzKF = 12;
                        zzYXZ();
                        return;
                    } else if (cZzIw3 == 65535) {
                        this.zzKF = 12;
                        this.zzYlA.zzYYS();
                    } else {
                        this.zzYkL.append(zzYQ(this.zzYlA.zzIw()));
                    }
                    break;
                case 5:
                    char cZzIw4 = this.zzYlA.zzIw();
                    if (cZzIw4 == '&') {
                        com.aspose.words.internal.zzZNH.zzU(this.zzYkL, zzVf(true));
                    } else if (cZzIw4 == '\'') {
                        this.zzKF = 0;
                    } else if (cZzIw4 == 65535) {
                        this.zzKF = 12;
                        this.zzYlA.zzYYS();
                    } else {
                        this.zzYkL.append(zzYQ(this.zzYlA.zzIw()));
                    }
                    break;
                case 6:
                    char cZzo3 = com.aspose.words.internal.zzZYD.zzo(this.zzYlA.zzIw());
                    if (cZzo3 != '\t' && cZzo3 != '\n' && cZzo3 != '\f' && cZzo3 != ' ') {
                        if (cZzo3 == '/') {
                            this.zzKF = 22;
                        } else if (cZzo3 == '>') {
                            this.zzKF = 12;
                            zzYXZ();
                            return;
                        } else if (cZzo3 == 65535) {
                            this.zzKF = 12;
                            this.zzYlA.zzYYS();
                        } else {
                            zzYY1();
                            this.zzYkM.append(zzYQ(cZzo3));
                            this.zzKF = 2;
                        }
                    }
                    break;
                case 7:
                    char cZzIw5 = this.zzYlA.zzIw();
                    if (cZzIw5 != '\t' && cZzIw5 != '\n' && cZzIw5 != '\f' && cZzIw5 != ' ') {
                        if (cZzIw5 == '\"') {
                            this.zzKF = 3;
                        } else {
                            if (cZzIw5 == '>') {
                                this.zzKF = 12;
                                zzYXZ();
                                return;
                            }
                            if (cZzIw5 == 65535) {
                                this.zzKF = 12;
                                this.zzYlA.zzYYS();
                            } else if (cZzIw5 == '&') {
                                this.zzKF = 4;
                                this.zzYlA.zzYYS();
                            } else if (cZzIw5 == '\'') {
                                this.zzKF = 5;
                            } else {
                                this.zzYkL.append(zzYQ(this.zzYlA.zzIw()));
                                this.zzKF = 4;
                            }
                        }
                    }
                    break;
                case 8:
                    this.zzYkQ = zzYY6();
                    this.zzKF = 12;
                    return;
                case 9:
                    this.zzYkQ = zzYY5();
                    this.zzKF = 12;
                    return;
                case 10:
                    this.zzYkQ = zzYY4();
                    this.zzKF = 12;
                    return;
                case 11:
                    zzYY7();
                    this.zzKF = 12;
                    break;
                case 12:
                    char cZzIw6 = this.zzYlA.zzIw();
                    if (cZzIw6 == '&') {
                        com.aspose.words.internal.zzZNH.zzU(this.zzYuF, zzVf(false));
                    } else if (cZzIw6 == '<') {
                        this.zzKF = 17;
                    } else {
                        if (cZzIw6 == 65535) {
                            zzYXY();
                            return;
                        }
                        this.zzYuF.append(this.zzYlA.zzIw());
                    }
                    break;
                case 13:
                    this.zzYkQ = zzYYa();
                    this.zzKF = 12;
                    return;
                case 14:
                    if (!com.aspose.words.internal.zzZYD.isLetter(this.zzYlA.zzIw())) {
                        char cZzIw7 = this.zzYlA.zzIw();
                        if (cZzIw7 == '>') {
                            this.zzKF = 12;
                        } else if (cZzIw7 == 65535) {
                            this.zzKF = 12;
                            com.aspose.words.internal.zzZNH.zzU(this.zzYuF, "</");
                            this.zzYlA.zzYYS();
                        } else {
                            this.zzKF = 9;
                            this.zzYlA.zzYYS();
                        }
                    } else {
                        zzVd(false);
                        this.zzYkP.append(com.aspose.words.internal.zzZYD.zzo(this.zzYlA.zzIw()));
                        this.zzKF = 16;
                    }
                    break;
                case 15:
                    this.zzYlA.zzYYS();
                    if (zzKa("--")) {
                        this.zzKF = zzYY3() != 3 ? 8 : 12;
                    } else if (zzK9("DOCTYPE")) {
                        this.zzKF = 13;
                    } else if (!z && zzKa("[CDATA[")) {
                        this.zzKF = 11;
                    } else {
                        int iZzYY3 = zzYY3();
                        if (iZzYY3 == 0) {
                            this.zzKF = 9;
                        } else if (iZzYY3 == 1 || iZzYY3 == 2) {
                            this.zzKF = 10;
                        } else {
                            if (iZzYY3 != 3) {
                                throw new IllegalStateException();
                            }
                            this.zzKF = 12;
                        }
                    }
                    break;
                case 16:
                    char cZzo4 = com.aspose.words.internal.zzZYD.zzo(this.zzYlA.zzIw());
                    if (cZzo4 == '\t' || cZzo4 == '\n' || cZzo4 == '\f' || cZzo4 == ' ') {
                        this.zzKF = 6;
                    } else if (cZzo4 == '/') {
                        this.zzKF = 22;
                    } else if (cZzo4 == '>') {
                        this.zzKF = 12;
                        zzYXZ();
                        return;
                    } else if (cZzo4 == 65535) {
                        this.zzKF = 12;
                        this.zzYlA.zzYYS();
                    } else {
                        this.zzYkP.append(zzYQ(cZzo4));
                    }
                    break;
                case 17:
                    if (!com.aspose.words.internal.zzZYD.isLetter(this.zzYlA.zzIw())) {
                        char cZzIw8 = this.zzYlA.zzIw();
                        if (cZzIw8 == '!') {
                            this.zzKF = 15;
                        } else if (cZzIw8 == '/') {
                            this.zzKF = 14;
                        } else if (cZzIw8 == '?') {
                            this.zzKF = 9;
                            this.zzYlA.zzYYS();
                        } else {
                            this.zzKF = 12;
                            this.zzYuF.append('<');
                            this.zzYlA.zzYYS();
                        }
                    } else {
                        zzVd(true);
                        this.zzYkP.append(com.aspose.words.internal.zzZYD.zzo(this.zzYlA.zzIw()));
                        this.zzKF = 16;
                    }
                    break;
                case 18:
                    zzVg(true);
                    this.zzKF = 12;
                    break;
                case 19:
                    zzVg(false);
                    this.zzKF = 12;
                    break;
                case 20:
                    while (this.zzYlA.zzIw() != 65535) {
                        this.zzYuF.append(zzYQ(this.zzYlA.zzIw()));
                        this.zzYlA.zzYYT();
                    }
                    zzYXY();
                    return;
                case 21:
                    zzYY8();
                    this.zzKF = 12;
                    break;
                case 22:
                    char cZzIw9 = this.zzYlA.zzIw();
                    if (cZzIw9 == '>') {
                        this.zzKF = 12;
                        this.zzYkN = true;
                        zzYXZ();
                        return;
                    } else if (cZzIw9 == 65535) {
                        this.zzKF = 12;
                        this.zzYlA.zzYYS();
                    } else {
                        this.zzKF = 6;
                        this.zzYlA.zzYYS();
                    }
                    break;
            }
        } while (this.zzYlA.zzIw() != 65535);
    }

    private void zzYXY() {
        this.zzYkQ = new zzZIB();
    }

    private void zzYXZ() {
        zzYY0();
        this.zzYkQ = new zzZEE(this.zzYkP.toString(), this.zzYkO, this.zzYkN, this.zzYqY);
    }

    private void zzYY0() {
        if (this.zzYkM.length() > 0) {
            this.zzYqY.zzY(new zzZK9(this.zzYkM.toString(), this.zzYkL.toString()));
            this.zzYkM.setLength(0);
            this.zzYkL.setLength(0);
        }
    }

    private void zzYY1() {
        zzYY0();
        this.zzYkM.setLength(0);
        this.zzYkL.setLength(0);
    }

    private String zzYY2() {
        int iZzm;
        zzZEY zzzeyZzYYR = this.zzYlA.zzYYR();
        this.zzYlA.zzYYT();
        int i = 0;
        if (this.zzYlA.zzFP() == 'x' || this.zzYlA.zzFP() == 'X') {
            this.zzYlA.zzYYT();
            iZzm = 0;
            while (com.aspose.words.internal.zzZYD.isHexDigit(this.zzYlA.zzFP())) {
                i++;
                this.zzYlA.zzYYT();
                if (iZzm <= 1114111) {
                    iZzm = (iZzm << 4) + com.aspose.words.internal.zzZYD.zzm(this.zzYlA.zzIw());
                }
            }
        } else {
            iZzm = 0;
            while (com.aspose.words.internal.zzZYD.isDigit(this.zzYlA.zzFP())) {
                i++;
                this.zzYlA.zzYYT();
                if (iZzm <= 1114111) {
                    iZzm = (iZzm * 10) + (this.zzYlA.zzIw() - '0');
                }
            }
        }
        if (this.zzYlA.zzFP() == ';') {
            this.zzYlA.zzYYT();
        }
        if (i != 0) {
            return zzZJN.zzzW(iZzm);
        }
        this.zzYlA.zzZ(zzzeyZzYYR);
        return "";
    }

    private int zzYY3() throws Exception {
        zzTN zztnZzSO;
        zzZEY zzzeyZzYYR = this.zzYlA.zzYYR();
        int i = 0;
        if (zzK9("[if")) {
            StringBuilder sb = new StringBuilder();
            this.zzYlA.zzYYT();
            while (true) {
                if (this.zzYlA.zzIw() == 65535) {
                    break;
                }
                if (this.zzYlA.zzIw() == ']') {
                    this.zzYlA.zzYYT();
                    if (this.zzYlA.zzIw() == '>') {
                        i = 1;
                        break;
                    }
                    this.zzYlA.zzYYS();
                }
                sb.append(zzYQ(this.zzYlA.zzIw()));
                this.zzYlA.zzYYT();
            }
            if (this.zzYlA.zzIw() == 65535) {
                this.zzYlA.zzYYS();
            }
            if (i != 0 && (zztnZzSO = zzTN.zzSO(sb.toString())) != null) {
                i = zztnZzSO.zzZ(this.zzYnh) ? 3 : 2;
            }
        }
        if (i != 3) {
            this.zzYlA.zzZ(zzzeyZzYYR);
        }
        return i;
    }

    private zzZJD zzYY4() {
        StringBuilder sb = new StringBuilder();
        while (this.zzYlA.zzIw() != 65535 && (this.zzYlA.zzIw() != '<' || !zzK9("![endif]>"))) {
            sb.append(zzYQ(this.zzYlA.zzIw()));
            this.zzYlA.zzYYT();
        }
        if (this.zzYlA.zzIw() == 65535) {
            this.zzYlA.zzYYS();
        }
        return new zzZJD(sb.toString());
    }

    private zzZJD zzYY5() {
        StringBuilder sb = new StringBuilder();
        while (this.zzYlA.zzIw() != '>' && this.zzYlA.zzIw() != 65535) {
            sb.append(zzYQ(this.zzYlA.zzIw()));
            this.zzYlA.zzYYT();
        }
        if (this.zzYlA.zzIw() == 65535) {
            this.zzYlA.zzYYS();
        }
        return new zzZJD(sb.toString());
    }

    private zzZJD zzYY6() {
        StringBuilder sb = new StringBuilder();
        char c = 0;
        while (this.zzYlA.zzIw() != 65535) {
            char c2 = 1;
            if (c == 0) {
                char cZzIw = this.zzYlA.zzIw();
                if (cZzIw != '-') {
                    if (cZzIw == '>') {
                        return new zzZJD(sb.toString());
                    }
                    sb.append(zzYQ(this.zzYlA.zzIw()));
                    c = 2;
                }
                c = c2;
            } else if (c != 1) {
                c2 = 4;
                if (c != 2) {
                    if (c != 3) {
                        if (c == 4) {
                            if (this.zzYlA.zzIw() != '-') {
                                sb.append('-');
                                sb.append(zzYQ(this.zzYlA.zzIw()));
                            }
                            c = 3;
                        } else if (c == 5) {
                            char cZzIw2 = this.zzYlA.zzIw();
                            if (cZzIw2 == '-') {
                                com.aspose.words.internal.zzZNH.zzU(sb, "--!");
                                c = c2;
                            } else {
                                if (cZzIw2 == '>') {
                                    return new zzZJD(sb.toString());
                                }
                                com.aspose.words.internal.zzZNH.zzU(sb, "--!").append(zzYQ(this.zzYlA.zzIw()));
                            }
                        } else {
                            continue;
                        }
                        c = 2;
                    } else {
                        char cZzIw3 = this.zzYlA.zzIw();
                        if (cZzIw3 == '!') {
                            c = 5;
                        } else if (cZzIw3 == '-') {
                            sb.append('-');
                        } else {
                            if (cZzIw3 == '>') {
                                return new zzZJD(sb.toString());
                            }
                            com.aspose.words.internal.zzZNH.zzU(sb, "--").append(zzYQ(this.zzYlA.zzIw()));
                            c = 2;
                        }
                    }
                } else if (this.zzYlA.zzIw() == '-') {
                    c = c2;
                } else {
                    sb.append(zzYQ(this.zzYlA.zzIw()));
                }
            } else {
                char cZzIw4 = this.zzYlA.zzIw();
                if (cZzIw4 != '-') {
                    if (cZzIw4 == '>') {
                        return new zzZJD(sb.toString());
                    }
                    sb.append('-');
                    sb.append(zzYQ(this.zzYlA.zzIw()));
                    c = 2;
                }
                c = 3;
            }
            this.zzYlA.zzYYT();
        }
        this.zzYlA.zzYYS();
        return new zzZJD(sb.toString());
    }

    private void zzYY7() {
        while (this.zzYlA.zzIw() != 65535) {
            if (this.zzYlA.zzIw() != ']') {
                this.zzYuF.append(this.zzYlA.zzIw());
            } else if (zzKa("]>")) {
                break;
            } else {
                this.zzYuF.append(']');
            }
            this.zzYlA.zzYYT();
        }
        if (this.zzYlA.zzIw() == 65535) {
            this.zzYlA.zzYYS();
        }
    }

    private void zzYY8() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        zzZEY zzzeyZzYYR = null;
        char c = 0;
        while (true) {
            if (this.zzYlA.zzIw() == 65535 && c == 0) {
                this.zzYlA.zzYYS();
                return;
            }
            if (this.zzYlA.zzIw() == '<') {
                this.zzYlA.zzYYS();
                zzzeyZzYYR = this.zzYlA.zzYYR();
                this.zzYlA.zzYYT();
            }
            switch (c) {
                case 0:
                    if (this.zzYlA.zzIw() == '<') {
                        c = 17;
                    } else {
                        this.zzYuF.append(zzYQ(this.zzYlA.zzIw()));
                    }
                    this.zzYlA.zzYYT();
                    break;
                case 1:
                    char cZzIw = this.zzYlA.zzIw();
                    if (cZzIw == '-') {
                        this.zzYuF.append('-');
                        c = 2;
                    } else if (cZzIw == '<') {
                        this.zzYuF.append('<');
                        c = 4;
                    } else if (cZzIw != 65535) {
                        this.zzYuF.append(zzYQ(this.zzYlA.zzIw()));
                    } else {
                        this.zzYlA.zzYYS();
                        c = 0;
                    }
                    this.zzYlA.zzYYT();
                    break;
                case 2:
                    char cZzIw2 = this.zzYlA.zzIw();
                    if (cZzIw2 == '-') {
                        this.zzYuF.append('-');
                        c = 3;
                        this.zzYlA.zzYYT();
                    } else if (cZzIw2 == '<') {
                        this.zzYuF.append('<');
                        c = 4;
                        this.zzYlA.zzYYT();
                    } else if (cZzIw2 == 65535) {
                        this.zzYlA.zzYYS();
                        c = 0;
                        this.zzYlA.zzYYT();
                    } else {
                        this.zzYuF.append(zzYQ(this.zzYlA.zzIw()));
                        c = 1;
                        this.zzYlA.zzYYT();
                    }
                    break;
                case 3:
                    char cZzIw3 = this.zzYlA.zzIw();
                    if (cZzIw3 == '-') {
                        this.zzYuF.append('-');
                        this.zzYlA.zzYYT();
                    } else if (cZzIw3 == '<') {
                        this.zzYuF.append('<');
                        c = 4;
                        this.zzYlA.zzYYT();
                    } else {
                        if (cZzIw3 == '>') {
                            this.zzYuF.append('>');
                        } else if (cZzIw3 != 65535) {
                            this.zzYuF.append(zzYQ(this.zzYlA.zzIw()));
                            c = 1;
                            this.zzYlA.zzYYT();
                        } else {
                            this.zzYlA.zzYYS();
                        }
                        c = 0;
                        this.zzYlA.zzYYT();
                    }
                    break;
                case 4:
                    if (this.zzYlA.zzIw() != '/') {
                        this.zzYlA.zzYYS();
                        c = 1;
                        this.zzYlA.zzYYT();
                    } else {
                        sb2.setLength(0);
                        this.zzYuF.append(IOUtils.DIR_SEPARATOR_UNIX);
                        c = 5;
                        this.zzYlA.zzYYT();
                    }
                    break;
                case 5:
                    if (!com.aspose.words.internal.zzZYD.isLetter(this.zzYlA.zzIw())) {
                        if (zzYP(this.zzYlA.zzIw())) {
                            this.zzYuF.append(this.zzYlA.zzIw());
                            if ("script".equals(sb2.toString())) {
                                c = '\t';
                            }
                            this.zzYlA.zzYYT();
                        } else {
                            this.zzYlA.zzYYS();
                        }
                        c = 1;
                        this.zzYlA.zzYYT();
                    } else {
                        sb2.append(com.aspose.words.internal.zzZYD.zzo(this.zzYlA.zzIw()));
                        this.zzYuF.append(this.zzYlA.zzIw());
                        this.zzYlA.zzYYT();
                    }
                    break;
                case 6:
                    if (!com.aspose.words.internal.zzZYD.isLetter(this.zzYlA.zzIw())) {
                        if (zzYP(this.zzYlA.zzIw())) {
                            this.zzYuF.append(this.zzYlA.zzIw());
                            if ("script".equals(sb2.toString())) {
                                c = 1;
                            }
                            this.zzYlA.zzYYT();
                        } else {
                            this.zzYlA.zzYYS();
                        }
                        c = '\t';
                        this.zzYlA.zzYYT();
                    } else {
                        sb2.append(com.aspose.words.internal.zzZYD.zzo(this.zzYlA.zzIw()));
                        this.zzYuF.append(this.zzYlA.zzIw());
                        this.zzYlA.zzYYT();
                    }
                    break;
                case 7:
                    if (com.aspose.words.internal.zzZYD.isLetter(this.zzYlA.zzIw())) {
                        sb.append(com.aspose.words.internal.zzZYD.zzo(this.zzYlA.zzIw()));
                        sb2.append(this.zzYlA.zzIw());
                        this.zzYlA.zzYYT();
                    } else if (zzYP(this.zzYlA.zzIw()) && zzK8(sb.toString())) {
                        this.zzYlA.zzZ(zzzeyZzYYR);
                    } else {
                        com.aspose.words.internal.zzZNH.zzU(com.aspose.words.internal.zzZNH.zzU(this.zzYuF, "</"), sb2.toString());
                        sb2.setLength(0);
                        sb.setLength(0);
                        this.zzYlA.zzYYS();
                        c = 0;
                        this.zzYlA.zzYYT();
                    }
                    break;
                case '\b':
                    if (!com.aspose.words.internal.zzZYD.isLetter(this.zzYlA.zzIw())) {
                        com.aspose.words.internal.zzZNH.zzU(this.zzYuF, "</");
                        this.zzYlA.zzYYS();
                        c = 0;
                        this.zzYlA.zzYYT();
                    } else {
                        sb.setLength(0);
                        sb.append(com.aspose.words.internal.zzZYD.zzo(this.zzYlA.zzIw()));
                        sb2.setLength(0);
                        sb2.append(this.zzYlA.zzIw());
                        c = 7;
                        this.zzYlA.zzYYT();
                    }
                    break;
                case '\t':
                    char cZzIw4 = this.zzYlA.zzIw();
                    if (cZzIw4 == '-') {
                        this.zzYuF.append('-');
                        c = '\n';
                    } else if (cZzIw4 == '<') {
                        c = '\f';
                    } else if (cZzIw4 != 65535) {
                        this.zzYuF.append(zzYQ(this.zzYlA.zzIw()));
                    } else {
                        this.zzYlA.zzYYS();
                        c = 0;
                    }
                    this.zzYlA.zzYYT();
                    break;
                case '\n':
                    char cZzIw5 = this.zzYlA.zzIw();
                    if (cZzIw5 == '-') {
                        this.zzYuF.append('-');
                        c = ControlChar.LINE_BREAK_CHAR;
                        this.zzYlA.zzYYT();
                    } else {
                        if (cZzIw5 != '<') {
                            if (cZzIw5 == 65535) {
                                this.zzYlA.zzYYS();
                                c = 0;
                                this.zzYlA.zzYYT();
                            } else {
                                this.zzYuF.append(zzYQ(this.zzYlA.zzIw()));
                                c = '\t';
                                this.zzYlA.zzYYT();
                            }
                        }
                        c = '\f';
                        this.zzYlA.zzYYT();
                    }
                    break;
                case 11:
                    char cZzIw6 = this.zzYlA.zzIw();
                    if (cZzIw6 == '-') {
                        this.zzYuF.append('-');
                        this.zzYlA.zzYYT();
                    } else {
                        if (cZzIw6 != '<') {
                            if (cZzIw6 == '>') {
                                this.zzYuF.append('>');
                            } else if (cZzIw6 != 65535) {
                                this.zzYuF.append(zzYQ(this.zzYlA.zzIw()));
                                c = '\t';
                                this.zzYlA.zzYYT();
                            } else {
                                this.zzYlA.zzYYS();
                            }
                            c = 0;
                            this.zzYlA.zzYYT();
                        }
                        c = '\f';
                        this.zzYlA.zzYYT();
                    }
                    break;
                case '\f':
                    if (com.aspose.words.internal.zzZYD.isLetter(this.zzYlA.zzIw())) {
                        sb2.setLength(0);
                        sb2.append(com.aspose.words.internal.zzZYD.zzo(this.zzYlA.zzIw()));
                        StringBuilder sb3 = this.zzYuF;
                        sb3.append('<');
                        sb3.append(this.zzYlA.zzIw());
                        c = 6;
                    } else if (this.zzYlA.zzIw() == '/') {
                        sb2.setLength(0);
                        c = ControlChar.PARAGRAPH_BREAK_CHAR;
                    } else {
                        this.zzYuF.append('<');
                        this.zzYlA.zzYYS();
                        c = '\t';
                    }
                    this.zzYlA.zzYYT();
                    break;
                case '\r':
                    if (!com.aspose.words.internal.zzZYD.isLetter(this.zzYlA.zzIw())) {
                        com.aspose.words.internal.zzZNH.zzU(this.zzYuF, "</");
                        this.zzYlA.zzYYS();
                        c = '\t';
                        this.zzYlA.zzYYT();
                    } else {
                        zzVd(false);
                        sb.append(com.aspose.words.internal.zzZYD.zzo(this.zzYlA.zzIw()));
                        sb2.append(this.zzYlA.zzIw());
                        c = ControlChar.COLUMN_BREAK_CHAR;
                        this.zzYlA.zzYYT();
                    }
                    break;
                case 14:
                    if (com.aspose.words.internal.zzZYD.isLetter(this.zzYlA.zzIw())) {
                        sb.append(com.aspose.words.internal.zzZYD.zzo(this.zzYlA.zzIw()));
                        sb2.append(this.zzYlA.zzIw());
                        this.zzYlA.zzYYT();
                    } else if (zzYP(this.zzYlA.zzIw()) && zzK8(sb.toString())) {
                        this.zzYlA.zzZ(zzzeyZzYYR);
                    } else {
                        com.aspose.words.internal.zzZNH.zzU(com.aspose.words.internal.zzZNH.zzU(this.zzYuF, "</"), sb2.toString());
                        sb2.setLength(0);
                        sb.setLength(0);
                        this.zzYlA.zzYYS();
                        c = '\t';
                        this.zzYlA.zzYYT();
                    }
                    break;
                case 15:
                    if (this.zzYlA.zzIw() != '-') {
                        this.zzYlA.zzYYS();
                        c = 0;
                        this.zzYlA.zzYYT();
                    } else {
                        this.zzYuF.append('-');
                        c = 16;
                        this.zzYlA.zzYYT();
                    }
                    break;
                case 16:
                    if (this.zzYlA.zzIw() != '-') {
                        this.zzYlA.zzYYS();
                        c = 0;
                        this.zzYlA.zzYYT();
                    } else {
                        this.zzYuF.append('-');
                        c = ControlChar.LINE_BREAK_CHAR;
                        this.zzYlA.zzYYT();
                    }
                    break;
                case 17:
                    char cZzIw7 = this.zzYlA.zzIw();
                    if (cZzIw7 == '!') {
                        com.aspose.words.internal.zzZNH.zzU(this.zzYuF, "<!");
                        c = 15;
                    } else if (cZzIw7 != '/') {
                        this.zzYuF.append('<');
                        this.zzYlA.zzYYS();
                        c = 0;
                    } else {
                        sb2.setLength(0);
                        c = '\b';
                    }
                    this.zzYlA.zzYYT();
                    break;
                default:
                    this.zzYlA.zzYYT();
                    break;
            }
            return;
        }
    }

    private zzZFQ zzYY9() {
        StringBuilder sb = null;
        char c = 0;
        while (this.zzYlA.zzIw() != 65535 && this.zzYlA.zzIw() != '>') {
            if (c != 0) {
                if (c != 2) {
                    if (this.zzYlA.zzIw() == '\"') {
                        return new zzZFQ(sb.toString(), true);
                    }
                    sb.append(zzYQ(this.zzYlA.zzIw()));
                } else {
                    if (this.zzYlA.zzIw() == '\'') {
                        return new zzZFQ(sb.toString(), true);
                    }
                    sb.append(zzYQ(this.zzYlA.zzIw()));
                }
            } else if (isWhitespace(this.zzYlA.zzIw())) {
                continue;
            } else {
                char cZzIw = this.zzYlA.zzIw();
                if (cZzIw == '\"') {
                    sb = new StringBuilder();
                    c = 1;
                } else {
                    if (cZzIw != '\'') {
                        this.zzYlA.zzYYS();
                        return new zzZFQ(null, false);
                    }
                    sb = new StringBuilder();
                    c = 2;
                }
            }
            this.zzYlA.zzYYT();
        }
        this.zzYlA.zzYYS();
        return new zzZFQ(sb != null ? sb.toString() : null, c == 0);
    }

    private zzZIS zzYYa() {
        String value;
        StringBuilder sb = new StringBuilder();
        String str = null;
        boolean z = false;
        String str2 = null;
        char c = 0;
        while (true) {
            char c2 = 5;
            char c3 = 1;
            if (this.zzYlA.zzIw() == 65535 || this.zzYlA.zzIw() == '>') {
                break;
            }
            if (c != 0) {
                if (c != 1) {
                    c3 = 7;
                    if (c != 2) {
                        if (c == 3) {
                            zzZFQ zzzfqZzYY9 = zzYY9();
                            value = zzzfqZzYY9.getValue();
                            if (!zzzfqZzYY9.zzYZP()) {
                                c2 = 7;
                            }
                        } else if (c == 4) {
                            zzZFQ zzzfqZzYY92 = zzYY9();
                            String value2 = zzzfqZzYY92.getValue();
                            char c4 = (zzzfqZzYY92.getValue() == null || !zzzfqZzYY92.zzYZP()) ? (char) 7 : (char) 3;
                            str = value2;
                            c = c4;
                        } else if (c == 6) {
                            zzZFQ zzzfqZzYY93 = zzYY9();
                            value = zzzfqZzYY93.getValue();
                            if (zzzfqZzYY93.getValue() == null || !zzzfqZzYY93.zzYZP()) {
                                str2 = value;
                            }
                        }
                        str2 = value;
                        c = c2;
                    } else if (!isWhitespace(this.zzYlA.zzIw())) {
                        this.zzYlA.zzYYS();
                        c = zzK9("PUBLIC") ? (char) 4 : zzK9("SYSTEM") ? (char) 6 : c3;
                    }
                } else if (isWhitespace(this.zzYlA.zzIw())) {
                    c = 2;
                } else {
                    sb.append(zzYQ(com.aspose.words.internal.zzZYD.zzo(this.zzYlA.zzIw())));
                }
            } else if (!isWhitespace(this.zzYlA.zzIw())) {
                sb.append(zzYQ(com.aspose.words.internal.zzZYD.zzo(this.zzYlA.zzIw())));
            }
            this.zzYlA.zzYYT();
        }
        if (this.zzYlA.zzIw() == 65535) {
            this.zzYlA.zzYYS();
            return new zzZIS(sb.toString(), str, str2, true);
        }
        if (c != 1 && c != 2 && c != 3 && c != 5) {
            z = true;
        }
        return new zzZIS(sb.toString(), str, str2, z);
    }

    public final zzZE9 zzVh(boolean z) throws Exception {
        if (this.zzYkQ == null) {
            zzYX(z);
        }
        if (this.zzYuF.length() > 0) {
            String string = this.zzYuF.toString();
            this.zzYuF.setLength(0);
            return new zzZEB(string);
        }
        zzZEE zzzee = (zzZEE) com.aspose.words.internal.zzZKW.zzZ(this.zzYkQ, zzZEE.class);
        this.zzYkK = (zzzee == null || !zzzee.zzZou()) ? "" : zzzee.getName();
        zzZE9 zzze9 = this.zzYkQ;
        if (zzze9.getType() != 4) {
            this.zzYkQ = null;
        }
        return zzze9;
    }

    public final void zzYYb() {
        this.zzKF = 21;
    }

    public final void zzYYc() {
        this.zzKF = 19;
    }

    public final void zzYYd() {
        this.zzKF = 20;
    }

    public final void zzYYe() {
        this.zzKF = 18;
    }
}

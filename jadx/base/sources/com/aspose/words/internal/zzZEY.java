package com.aspose.words.internal;

import OooOoo.C20593OooO0Oo;
import Oooo0oO.o0Oo0oo;
import com.aspose.words.StyleIdentifier;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.network.embedded.C18241k5;
import com.orion.notein.richeditor.converter.tagsoup.HTMLWriter;
import java.io.IOException;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZEY extends zzZER implements zzZES {
    protected int zzWL4;
    protected zzZQS zzWL5;
    protected int zzWL6;
    protected boolean zzWL7;
    protected int zzWL8;
    protected int zzWL9;
    protected int zzWLa;
    protected int zzWLb;
    protected boolean zzWLc;
    protected int zzWLd;
    protected final int zzWLe;
    protected int zzWLf;
    protected boolean zzWLg;
    protected final zzZEZ zzWLh;
    protected final zzZEW zzWLi;
    protected String zzWLj;
    protected String zzWLk;
    protected String zzWLl;
    protected String zzWLm;
    protected int zzWLn;
    protected final zzZET zzWLo;
    protected final int zzWLp;
    protected final boolean zzWLq;
    protected final boolean zzWLr;
    protected final boolean zzWLs;
    protected Map<String, zzZG3> zzWNX;
    protected final zzZDU zzWNc;
    protected final int zzWQl;
    protected boolean zzWQq;
    protected static final String zzWLu = zzZE4.zzXLJ();
    protected static final String zzWLt = zzZE4.zzXLI();

    public zzZEY(zzZFE zzzfe, zzZFM zzzfm, zzZET zzzet, zzZHC zzzhc, zzZEW zzzew, boolean z) throws zzZQS {
        super(zzzfm, zzzhc, zzzhc.zzXPt());
        this.zzWLn = 0;
        this.zzWLg = false;
        this.zzWLf = 4;
        this.zzWLc = false;
        this.zzWLa = 7;
        this.zzWL9 = 7;
        this.zzWL7 = false;
        this.zzWL5 = null;
        this.zzWNX = null;
        this.zzWL4 = 4;
        this.zzWLo = zzzet;
        this.zzWNc = zzZDU.zzX(zzzhc);
        int iZzXPQ = zzzhc.zzXPQ();
        this.zzWQl = iZzXPQ;
        boolean z2 = (iZzXPQ & 2) != 0;
        this.zzWLs = z2;
        this.zzWLr = (iZzXPQ & 512) == 0;
        this.zzWQ6 = zzzhc.zzXPo();
        this.zzWL6 = this.zzWKF ? 16 : 0;
        this.zzWLq = (z || (iZzXPQ & 262144) == 0) ? false : true;
        if (z2) {
            this.zzWLe = 4;
            this.zzWLp = Integer.MAX_VALUE;
        } else {
            this.zzWLe = 2;
            if (z) {
                this.zzWLp = Integer.MAX_VALUE;
            } else {
                this.zzWLp = zzzhc.zzXPG();
            }
        }
        this.zzWKx = zzzfe.zzXNy();
        this.zzWKz = zzzfe.getInputEncoding();
        this.zzWKy = zzzfe.zzXNw();
        String strZzfs = zzzfe.zzfs();
        if (strZzfs == null) {
            this.zzWLn = 0;
        } else if ("yes".equals(strZzfs)) {
            this.zzWLn = 1;
        } else {
            this.zzWLn = 2;
        }
        this.zzWLb = this.zzWML.zzXPp() ? 1 : 0;
        this.zzWLi = zzzew;
        this.zzWLh = zzzew.zzXMy();
        zzzfm.zzZ(this, this.zzWKI, 0);
        zzzew.zzY(this);
        this.zzWQq = this.zzWML.zzXPW();
    }

    private void zzI(String str, String str2, int i) throws zzZQS {
        this.zzWMi--;
        if (str != null && str.length() > 0) {
            str2 = o0Oo0oo.OooO0Oo(str, C18241k5.f55433h, str2);
            i += str.length() + 1;
        }
        zzV(androidx.core.database.OooO00o.OooO00o("Unexpected close tag </", C22246OooO0oo.OooO00o(new StringBuilder(), str2, zzXMd(), 0, i), ">; expected </", str2, ">."), null, null);
    }

    private void zzJ(String str, String str2, int i) throws zzZQS {
        this.zzWMi--;
        String strOooO0Oo = o0Oo0oo.OooO0Oo(str, C18241k5.f55433h, str2);
        zzV(androidx.core.database.OooO00o.OooO00o("Unexpected close tag </", C22246OooO0oo.OooO00o(new StringBuilder(), strOooO0Oo, zzXMd(), 0, i), ">; expected </", strOooO0Oo, ">."), null, null);
    }

    private void zzOY(boolean z) throws zzZQS {
        int i = this.zzWLa;
        switch (i) {
            case 1:
            case 2:
            case 7:
            case 8:
            case 9:
            case 14:
            case 15:
                throw new IllegalStateException("finishToken() called when current token is " + zzZH9.zzgZ(this.zzWLa));
            case 3:
                zzXOb();
                return;
            case 4:
                if (!this.zzWLs) {
                    if (zzYT(this.zzWLp, z)) {
                        this.zzWLf = 3;
                        return;
                    } else {
                        this.zzWLf = 2;
                        return;
                    }
                }
                if (this.zzWLf == 3) {
                    int i2 = this.zzWMi;
                    if (i2 + 1 < this.zzWMh && this.zzWLX[i2 + 1] != '!') {
                        return;
                    }
                }
                zzYU(i, z);
                return;
            case 5:
                zzXMC();
                return;
            case 6:
                zzXMA();
                return;
            case 10:
            case 13:
            default:
                throw new IllegalStateException("Internal error: unexpected token " + zzZH9.zzgZ(this.zzWLa));
            case 11:
                try {
                    zzOZ(true);
                    return;
                } finally {
                    this.zzWLf = 4;
                }
            case 12:
                if (this.zzWLs) {
                    zzYU(i, z);
                    return;
                } else if (zzgx(this.zzWLp)) {
                    this.zzWLf = 3;
                    return;
                } else {
                    this.zzWLf = 2;
                    return;
                }
        }
    }

    private void zzP0(boolean z) throws zzZQS {
        int iZzXNn = zzXNn();
        if (iZzXNn < 0) {
            zzxH(" in prolog");
        }
        if (iZzXNn != 68) {
            if (iZzXNn == 45) {
                if (zzxF(z ? " in prolog" : " in epilog") != '-') {
                    zzd(iZzXNn, " (malformed comment?)");
                }
                this.zzWLf = 1;
                this.zzWLa = 5;
                return;
            }
            if (iZzXNn == 91 && (iZzXNn = zzXMl()) == 67) {
                zzd(iZzXNn, zzZH9.zzWPA);
            }
            zzd(iZzXNn, " after '<!' (malformed comment?)");
            return;
        }
        String strZzX = zzX('D', "DOCTYPE");
        if (strZzX != null) {
            zzV(C20593OooO0Oo.OooO0O0("Unrecognized XML directive '<!", strZzX, "' (misspelled DOCTYPE?)."), null, null);
        }
        if (!z) {
            if (!this.zzWML.zzXPq()) {
                zzV(zzZH9.zzWPC, null, null);
            } else if (!this.zzWLg) {
                this.zzWLa = zzgA(11);
                return;
            }
        }
        if (this.zzWLg) {
            zzV(zzZH9.zzWPB, null, null);
        }
        this.zzWLg = true;
        this.zzWLa = 11;
        zzXML();
    }

    private int zzP1(boolean z) throws zzZQS {
        this.zzWL9 = 8;
        this.zzWLa = 8;
        this.zzWNc.zzOR(true);
        if (z) {
            zzxH(" in prolog");
        }
        return this.zzWLa;
    }

    private boolean zzP2(boolean z) throws zzZQS {
        int iZzXNn;
        if (this.zzWLf < this.zzWLe) {
            this.zzWLf = 4;
            iZzXNn = zzXMF();
        } else {
            long j = this.zzWLW;
            int i = this.zzWMi;
            this.zzWKC = j + ((long) i);
            this.zzWKB = this.zzWLV;
            this.zzWKA = i - this.zzWLU;
            iZzXNn = zzXNn();
        }
        if (iZzXNn <= 32 && iZzXNn >= 0) {
            if (zzgB(256)) {
                this.zzWLa = 6;
                if (zzXe((char) iZzXNn)) {
                    this.zzWLf = 4;
                } else if (this.zzWLq) {
                    this.zzWLf = 1;
                } else {
                    zzXMA();
                    this.zzWLf = 4;
                }
                return false;
            }
            this.zzWMi--;
            iZzXNn = zzXMk();
            if (iZzXNn >= 0) {
                long j2 = this.zzWLW;
                int i2 = this.zzWMi;
                this.zzWKC = (j2 + ((long) i2)) - 1;
                this.zzWKB = this.zzWLV;
                this.zzWKA = (i2 - this.zzWLU) - 1;
            }
        }
        if (iZzXNn < 0) {
            zzP1(z);
            this.zzWLb = 4;
            return true;
        }
        if (iZzXNn != 60) {
            zzd(iZzXNn, (z ? " in prolog" : " in epilog").concat("; expected '<'"));
        }
        char cZzxF = zzxF(z ? " in prolog" : " in epilog");
        if (cZzxF == '?') {
            this.zzWLa = zzXMB();
        } else if (cZzxF == '!') {
            zzP0(z);
        } else if (cZzxF == '/') {
            if (z) {
                zzV("Unexpected character combination '</' in prolog.", null, null);
            }
            zzV("Unexpected character combination '</' in epilog (extra close tag?).", null, null);
        } else if (cZzxF != ':' && !zzXn(cZzxF)) {
            zzd(cZzxF, (z ? " in prolog" : " in epilog").concat(", after '<'."));
        } else {
            if (!z) {
                this.zzWLa = zzXMO();
                return false;
            }
            zzXk(cZzxF);
            this.zzWLa = 1;
        }
        if (!this.zzWLq && this.zzWLf < this.zzWLe) {
            zzOY(false);
        }
        return false;
    }

    private boolean zzS(char[] cArr, int i) throws zzZQS {
        int i2;
        char cZzxE;
        int i3 = 0;
        while (true) {
            i2 = i3 + 1;
            int i4 = this.zzWMi;
            if (i4 < this.zzWMh) {
                char[] cArr2 = this.zzWLX;
                this.zzWMi = i4 + 1;
                cZzxE = cArr2[i4];
            } else {
                cZzxE = zzxE(" in CDATA section");
            }
            if (cZzxE != ']') {
                break;
            }
            i3 = i2;
        }
        boolean z = i2 >= 2 && cZzxE == '>';
        if (z) {
            i2 = i3 - 1;
        }
        while (i2 > 0) {
            i2--;
            int i5 = i + 1;
            cArr[i] = ']';
            if (i5 >= cArr.length) {
                cArr = this.zzWNc.zzXLi();
                i = 0;
            } else {
                i = i5;
            }
        }
        this.zzWNc.zzge(i);
        if (z) {
            return true;
        }
        this.zzWMi--;
        return false;
    }

    private String zzX(char c, String str) throws zzZQS {
        char c2;
        int length = str.length();
        int i = 0;
        while (str.charAt(i) == c && (i = i + 1) < length) {
            int i2 = this.zzWMi;
            if (i2 >= this.zzWMh) {
                int iZzXNn = zzXNn();
                if (iZzXNn < 0) {
                    break;
                }
                c = (char) iZzXNn;
            } else {
                char[] cArr = this.zzWLX;
                this.zzWMi = i2 + 1;
                c = cArr[i2];
            }
        }
        if (i == length) {
            int iZzXMl = zzXMl();
            if (iZzXMl < 0) {
                return null;
            }
            if (!zzXm((char) iZzXMl) && iZzXMl != 58) {
                return null;
            }
        }
        StringBuilder sb = new StringBuilder(str.length() + 16);
        sb.append(str.substring(0, i));
        if (i < length) {
            sb.append(c);
        }
        while (true) {
            int i3 = this.zzWMi;
            if (i3 >= this.zzWMh) {
                int iZzXNn2 = zzXNn();
                if (iZzXNn2 < 0) {
                    break;
                }
                c2 = (char) iZzXNn2;
            } else {
                char[] cArr2 = this.zzWLX;
                this.zzWMi = i3 + 1;
                c2 = cArr2[i3];
            }
            if (!zzXm(c2)) {
                this.zzWMi--;
                break;
            }
            sb.append(c2);
        }
        return sb.toString();
    }

    private char zzXM(String str, String str2) throws zzZQS {
        char cZzxC = zzxC(str2);
        if (cZzxC != '=') {
            zzd(cZzxC, " in xml declaration; expected '=' to follow pseudo-attribute '" + str + "'");
        }
        return zzxC(str2);
    }

    private void zzXMA() throws zzZQS {
        char[] cArrZzXLk = this.zzWNc.zzXLk();
        int iZzXLj = this.zzWNc.zzXLj();
        while (true) {
            if (this.zzWMi >= this.zzWMh && !zzXOi()) {
                break;
            }
            char[] cArr = this.zzWLX;
            int i = this.zzWMi;
            char c = cArr[i];
            if (c > ' ') {
                break;
            }
            this.zzWMi = i + 1;
            if (c == '\n') {
                zzXMj();
            } else if (c == '\r') {
                if (zzXc(c)) {
                    if (!this.zzWKF) {
                        int i2 = iZzXLj + 1;
                        cArrZzXLk[iZzXLj] = c;
                        if (i2 >= cArrZzXLk.length) {
                            cArrZzXLk = this.zzWNc.zzXLi();
                            iZzXLj = 0;
                        } else {
                            iZzXLj = i2;
                        }
                    }
                } else if (this.zzWKF) {
                }
                c = '\n';
            } else if (c != ' ' && c != '\t') {
                zzgs(c);
            }
            int i3 = iZzXLj + 1;
            cArrZzXLk[iZzXLj] = c;
            if (i3 >= cArrZzXLk.length) {
                cArrZzXLk = this.zzWNc.zzXLi();
                iZzXLj = 0;
            } else {
                iZzXLj = i3;
            }
        }
        this.zzWNc.zzge(iZzXLj);
    }

    private final int zzXMB() throws zzZQS {
        char cZzxE;
        String strZzXMe = zzXMe();
        this.zzWKL = strZzXMe;
        if (strZzXMe.length() == 0) {
            zzV(zzZH9.zzWPw, null, null);
        }
        if (strZzXMe.equalsIgnoreCase("xml")) {
            if (!this.zzWML.zzXPq()) {
                zzV(zzZH9.zzWPv, strZzXMe, null);
            }
            char cZzxE2 = zzxE(" in xml declaration");
            if (!zzZF3.isSpaceChar(cZzxE2)) {
                zzd(cZzxE2, "excepted a space in xml declaration after 'xml'");
            }
            return zzgA(7);
        }
        int i = this.zzWMi;
        if (i < this.zzWMh) {
            char[] cArr = this.zzWLX;
            this.zzWMi = i + 1;
            cZzxE = cArr[i];
        } else {
            cZzxE = zzxE(" in processing instruction");
        }
        if (zzZF3.isSpaceChar(cZzxE)) {
            this.zzWLf = 1;
            zzXd(cZzxE);
            return 3;
        }
        this.zzWLf = 4;
        this.zzWNc.zzXLs();
        if (cZzxE == '?' && zzxE(" in processing instruction") == '>') {
            return 3;
        }
        zzd(cZzxE, zzZH9.zzWPu);
        return 3;
    }

    private void zzXMC() throws zzZQS {
        char[] cArr = this.zzWLX;
        int i = this.zzWMh;
        int i2 = this.zzWMi;
        int i3 = i2;
        while (i3 < i) {
            int i4 = i3 + 1;
            char c = cArr[i3];
            if (c <= '-') {
                if (c < ' ') {
                    if (c == '\n') {
                        zzgr(i4);
                    } else if (c == '\r') {
                        if (this.zzWKF || i4 >= i) {
                            break;
                        }
                        i3 = cArr[i4] == '\n' ? i3 + 2 : i4;
                        zzgr(i3);
                    } else if (c != '\t') {
                        zzgs(c);
                    }
                } else if (c == '-') {
                    int i5 = i3 + 2;
                    if (i5 >= i) {
                        break;
                    }
                    if (cArr[i4] == '-') {
                        if (cArr[i5] != '>') {
                            zzV("String '--' not allowed in comment (missing '>'?)", null, null);
                        }
                        this.zzWNc.zzK(cArr, i2, (i4 - i2) - 1);
                        this.zzWMi = i3 + 3;
                        return;
                    }
                }
            }
            i3 = i4;
        }
        this.zzWMi = i3;
        this.zzWNc.zzJ(cArr, i2, i3 - i2);
        zzZ(this.zzWNc);
    }

    private void zzXMD() {
        try {
            zzOY(this.zzWLa == 4);
        } catch (zzZQS e) {
            zzZER.zzX(e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f3  */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.aspose.words.internal.zzZER, com.aspose.words.internal.zzZEY, com.aspose.words.internal.zzZF3] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [int] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    /* JADX WARN: Type inference failed for: r6v5, types: [char, int] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [int] */
    /* JADX WARN: Type inference failed for: r6v8, types: [int] */
    /* JADX WARN: Type inference failed for: r6v9, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int zzXMF() throws zzZQS {
        char cZzxE;
        char cZzgy = 0;
        cZzgy = 0;
        cZzgy = 0;
        switch (this.zzWLa) {
            case 3:
                while (true) {
                    int i = this.zzWMi;
                    if (i < this.zzWMh) {
                        char[] cArr = this.zzWLX;
                        this.zzWMi = i + 1;
                        cZzxE = cArr[i];
                    } else {
                        cZzxE = zzxE(" in processing instruction");
                    }
                    if (cZzxE == '?') {
                        do {
                            int i2 = this.zzWMi;
                            if (i2 < this.zzWMh) {
                                char[] cArr2 = this.zzWLX;
                                this.zzWMi = i2 + 1;
                                cZzxE = cArr2[i2];
                            } else {
                                cZzxE = zzxE(" in processing instruction");
                            }
                        } while (cZzxE == '?');
                        if (cZzxE == '>') {
                            if (cZzgy > 0) {
                                this.zzWKB = this.zzWLV;
                                long j = this.zzWLW;
                                int i3 = this.zzWMi;
                                this.zzWKC = j + ((long) i3);
                                this.zzWKA = i3 - this.zzWLU;
                                return cZzgy < 0 ? cZzgy : zzXNn();
                            }
                            this.zzWKB = this.zzWLV;
                            long j2 = this.zzWLW;
                            int i4 = this.zzWMi;
                            this.zzWKC = (j2 + ((long) i4)) - 1;
                            this.zzWKA = (i4 - this.zzWLU) - 1;
                            return cZzgy;
                        }
                    }
                    if (cZzxE < ' ') {
                        if (cZzxE == '\n' || cZzxE == '\r') {
                            zzXc(cZzxE);
                        } else if (cZzxE != '\t') {
                            zzgs(cZzxE);
                        }
                    }
                }
                break;
            case 4:
                cZzgy = zzgy(zzXNn());
                if (this.zzWLs) {
                    cZzgy = zzgz(cZzgy);
                }
                if (cZzgy > 0) {
                }
                break;
            case 5:
                zzY(" in comment", '-', true);
                if (cZzgy > 0) {
                }
                break;
            case 6:
                while (true) {
                    int i5 = this.zzWMi;
                    if (i5 < this.zzWMh) {
                        char[] cArr3 = this.zzWLX;
                        this.zzWMi = i5 + 1;
                        cZzgy = cArr3[i5];
                        if (cZzgy <= 32) {
                            if (cZzgy == 10 || cZzgy == 13) {
                                zzXc(cZzgy);
                            } else if (cZzgy != 32 && cZzgy != 9) {
                                zzgs(cZzgy);
                            }
                        }
                    } else if (!zzXOi()) {
                        cZzgy = -1;
                    }
                }
                if (cZzgy > 0) {
                }
                break;
            case 7:
            case 8:
            case 9:
            case 14:
            case 15:
                throw new IllegalStateException("skipToken() called when current token is " + zzZH9.zzgZ(this.zzWLa));
            case 10:
            case 13:
            default:
                throw new IllegalStateException("Internal error: unexpected token " + zzZH9.zzgZ(this.zzWLa));
            case 11:
                zzOZ(false);
                if (cZzgy > 0) {
                }
                break;
            case 12:
                if (this.zzWLf <= 2) {
                    zzY(" in CDATA section", ']', false);
                }
                cZzgy = zzXNn();
                if (this.zzWLs) {
                    cZzgy = zzgz(cZzgy);
                }
                if (cZzgy > 0) {
                }
                break;
        }
    }

    private int zzXMG() throws zzZQS {
        char cZzxE;
        char cZzxE2 = zzxE(" in main document content");
        if (cZzxE2 != '[') {
            if (cZzxE2 == '-' && zzxE(" in main document content") == '-') {
                this.zzWLf = 1;
                return 5;
            }
            zzV("Unrecognized XML directive; expected CDATA or comment ('<![CDATA[' or '<!--').", null, null);
            return 0;
        }
        zzXMQ();
        int i = this.zzWMi;
        if (i < this.zzWMh) {
            char[] cArr = this.zzWLX;
            this.zzWMi = i + 1;
            cZzxE = cArr[i];
        } else {
            cZzxE = zzxE(" in CDATA section");
        }
        zzXg(cZzxE);
        return 12;
    }

    private void zzXMH() throws zzZQS {
        zzV(C20593OooO0Oo.OooO0O0("Unbalanced close tag </", zzXMd(), ">; no open start tag."), null, null);
    }

    private void zzXMI() throws zzZQS {
        char cZzxE;
        char cZzxE2;
        char cZzxE3;
        this.zzWLf = 4;
        if (this.zzWLi.isEmpty()) {
            zzXMH();
            return;
        }
        int i = this.zzWMi;
        if (i < this.zzWMh) {
            char[] cArr = this.zzWLX;
            this.zzWMi = i + 1;
            cZzxE = cArr[i];
        } else {
            cZzxE = zzxE(" in end tag");
        }
        if (!zzXn(cZzxE) && cZzxE != ':') {
            if (cZzxE <= ' ') {
                zzd(cZzxE, "; missing element name?");
            }
            zzd(cZzxE, "; expected an element name.");
        }
        String prefix = this.zzWLi.getPrefix();
        String localName = this.zzWLi.getLocalName();
        if (prefix != null && prefix.length() > 0) {
            int length = prefix.length();
            int i2 = 0;
            while (cZzxE == prefix.charAt(i2)) {
                i2++;
                if (i2 < length) {
                    int i3 = this.zzWMi;
                    if (i3 < this.zzWMh) {
                        char[] cArr2 = this.zzWLX;
                        this.zzWMi = i3 + 1;
                        cZzxE = cArr2[i3];
                    } else {
                        cZzxE = zzxE(" in end tag");
                    }
                } else {
                    int i4 = this.zzWMi;
                    if (i4 < this.zzWMh) {
                        char[] cArr3 = this.zzWLX;
                        this.zzWMi = i4 + 1;
                        cZzxE3 = cArr3[i4];
                    } else {
                        cZzxE3 = zzxE(" in end tag");
                    }
                    if (cZzxE3 != ':') {
                        zzJ(prefix, localName, i2);
                        return;
                    }
                    int i5 = this.zzWMi;
                    if (i5 < this.zzWMh) {
                        char[] cArr4 = this.zzWLX;
                        this.zzWMi = i5 + 1;
                        cZzxE = cArr4[i5];
                    } else {
                        cZzxE = zzxE(" in end tag");
                    }
                }
            }
            zzJ(prefix, localName, i2);
            return;
        }
        int length2 = localName.length();
        int i6 = 0;
        while (cZzxE == localName.charAt(i6)) {
            i6++;
            if (i6 >= length2) {
                int i7 = this.zzWMi;
                if (i7 < this.zzWMh) {
                    char[] cArr5 = this.zzWLX;
                    this.zzWMi = i7 + 1;
                    cZzxE2 = cArr5[i7];
                } else {
                    cZzxE2 = zzxE(" in end tag");
                }
                if (cZzxE2 <= ' ') {
                    cZzxE2 = zzO(" in end tag", cZzxE2);
                } else if (cZzxE2 != '>' && (cZzxE2 == ':' || zzXm(cZzxE2))) {
                    zzI(prefix, localName, length2);
                }
                if (cZzxE2 != '>') {
                    zzd(cZzxE2, " in end tag Expected '>'.");
                }
                int iZzXMv = this.zzWLi.zzXMv();
                this.zzWL4 = iZzXMv;
                this.zzWL7 = iZzXMv == 3;
                if (this.zzWKI == this.zzWKH) {
                    zzX(this.zzWKK);
                }
                this.zzWKI--;
                return;
            }
            int i8 = this.zzWMi;
            if (i8 < this.zzWMh) {
                char[] cArr6 = this.zzWLX;
                this.zzWMi = i8 + 1;
                cZzxE = cArr6[i8];
            } else {
                cZzxE = zzxE(" in end tag");
            }
        }
        zzI(prefix, localName, i6);
    }

    private int zzXMJ() throws zzZQS {
        this.zzWLb = 2;
        if (zzP2(false)) {
            this.zzWL9 = 0;
        }
        if (this.zzWQm.isDirty()) {
            this.zzWLo.zzY(this.zzWQm);
        }
        this.zzWNc.zzOR(false);
        return this.zzWLa;
    }

    private final int zzXMK() throws zzZQS {
        char cZzxF;
        int iZzXNn;
        int i;
        int i2 = this.zzWLf;
        if (i2 < this.zzWLe) {
            if (this.zzWL4 == 3 && ((i = this.zzWLa) == 4 || i == 12)) {
                zzV("Internal error: skipping validatable text", null, null);
            }
            iZzXNn = zzXMF();
        } else {
            int i3 = this.zzWLa;
            if (i3 == 1) {
                if (this.zzWLc) {
                    this.zzWLc = false;
                    int iZzXMv = this.zzWLi.zzXMv();
                    this.zzWL4 = iZzXMv;
                    this.zzWL7 = iZzXMv == 3;
                    return 2;
                }
            } else if (i3 == 2) {
                if (!this.zzWLi.zzXMx() && !this.zzWML.zzXPp()) {
                    return zzXMJ();
                }
            } else if (i3 == 12 && i2 <= 2) {
                long j = this.zzWLW;
                int i4 = this.zzWMi;
                this.zzWKC = j + ((long) i4);
                this.zzWKB = this.zzWLV;
                this.zzWKA = i4 - this.zzWLU;
                if (i4 < this.zzWMh) {
                    char[] cArr = this.zzWLX;
                    this.zzWMi = i4 + 1;
                    cZzxF = cArr[i4];
                } else {
                    cZzxF = zzxF(" in CDATA section");
                }
                if (!zzXg(cZzxF)) {
                    if (this.zzWNc.size() == 0) {
                        if (zzgx(this.zzWLq ? 1 : this.zzWLp)) {
                            if (this.zzWNc.size() > 0) {
                                this.zzWLf = 3;
                                return 12;
                            }
                        }
                    }
                    this.zzWLf = 2;
                    return 12;
                }
                if (this.zzWNc.size() > 0) {
                    return 12;
                }
            }
            long j2 = this.zzWLW;
            int i5 = this.zzWMi;
            this.zzWKC = j2 + ((long) i5);
            this.zzWKB = this.zzWLV;
            this.zzWKA = i5 - this.zzWLU;
            iZzXNn = zzXNn();
        }
        if (iZzXNn < 0) {
            if (!this.zzWLi.isEmpty()) {
                zzXMz();
            }
            return zzP1(false);
        }
        while (iZzXNn == 38) {
            this.zzWL8 = 0;
            if (this.zzWL4 == 0) {
                zzgv(9);
            }
            int iZzOW = this.zzWKM ? zzOW(true) : zzOX(true);
            if (iZzOW != 0) {
                if (this.zzWL4 <= 1 && iZzOW > 32) {
                    zzgv(4);
                }
                zzZDU zzzdu = this.zzWNc;
                zzzdu.zzXLr();
                if (iZzOW <= 65535) {
                    zzzdu.zzq((char) iZzOW);
                } else {
                    int i6 = iZzOW - 65536;
                    zzzdu.zzq((char) ((i6 >> 10) + 55296));
                    zzzdu.zzq((char) ((i6 & 1023) + 56320));
                }
                this.zzWLf = 1;
                return 4;
            }
            if (!this.zzWKM || this.zzWKv) {
                if (!this.zzWKv) {
                    this.zzWKu = zzXMf();
                }
                this.zzWLf = 4;
                return 9;
            }
            iZzXNn = zzxF(" in main document content");
        }
        if (iZzXNn == 60) {
            char cZzxF2 = zzxF(" in start tag");
            if (cZzxF2 == '?') {
                if (this.zzWL4 == 0) {
                    zzgv(3);
                }
                return zzXMB();
            }
            if (cZzxF2 == '!') {
                int iZzXMG = zzXMG();
                if (this.zzWL4 == 0) {
                    zzgv(iZzXMG);
                }
                return iZzXMG;
            }
            if (cZzxF2 == '/') {
                zzXMI();
                return 2;
            }
            if (cZzxF2 == ':' || zzXn(cZzxF2)) {
                zzXj(cZzxF2);
                return 1;
            }
            if (cZzxF2 == '[') {
                zzd(cZzxF2, " in content after '<' (malformed <![CDATA[]] directive?)");
            }
            zzd(cZzxF2, " in content after '<' (malformed start element?).");
        }
        int i7 = this.zzWL4;
        if (i7 <= 2) {
            if (i7 == 0 && this.zzWLi.zzXOz()) {
                zzgv(4);
            }
            if (iZzXNn <= 32) {
                this.zzWLf = zzXe((char) iZzXNn) ? 4 : 1;
                return 6;
            }
            if (this.zzWLi.zzXOz()) {
                zzgv(4);
            }
        }
        if (zzXf((char) iZzXNn)) {
            this.zzWLf = 3;
        } else if (this.zzWLs || this.zzWNc.size() < this.zzWLp) {
            this.zzWLf = 1;
        } else {
            this.zzWLf = 2;
        }
        return 4;
    }

    private void zzXML() throws zzZQS {
        String strZzX;
        this.zzWNc.zzXLr();
        char cZzxC = zzxC(" in DOCTYPE declaration");
        if (this.zzWKN) {
            String strZzXb = zzXb(cZzxC);
            char cZzxF = zzxF(" in DOCTYPE declaration");
            if (cZzxF == ':') {
                this.zzWLm = strZzXb;
                this.zzWLl = zzXb(zzxF("; expected an identifier"));
            } else if (cZzxF <= ' ' || cZzxF == '[' || cZzxF == '>') {
                this.zzWMi--;
                this.zzWLm = null;
                this.zzWLl = strZzXb;
            } else {
                zzd(cZzxF, " in DOCTYPE declaration; expected '[' or white space.");
            }
        } else {
            this.zzWLl = zzXa(cZzxC);
            this.zzWLm = null;
        }
        char cZzxC2 = zzxC(" in DOCTYPE declaration");
        if (cZzxC2 != '[' && cZzxC2 != '>') {
            if (cZzxC2 == 'P') {
                strZzX = zzX(zzxF(" in DOCTYPE declaration"), "UBLIC");
                if (strZzX != null) {
                    strZzX = "P".concat(strZzX);
                } else {
                    if (!zzXd(zzxF(" in DOCTYPE declaration"))) {
                        zzd(cZzxC2, " in DOCTYPE declaration; expected a space between PUBLIC keyword and public id");
                    }
                    char cZzxE = zzxE(" in DOCTYPE declaration");
                    if (cZzxE != '\"' && cZzxE != '\'') {
                        zzd(cZzxE, " in DOCTYPE declaration; expected a public identifier.");
                    }
                    this.zzWLk = zzW(cZzxE, " in DOCTYPE declaration");
                    if (!zzXd(zzxF(" in DOCTYPE declaration"))) {
                        zzd(cZzxE, " in DOCTYPE declaration; expected a space between public and system identifiers");
                    }
                    char cZzxE2 = zzxE(" in DOCTYPE declaration");
                    if (cZzxE2 != '\"' && cZzxE2 != '\'') {
                        zzV(" in DOCTYPE declaration; expected a system identifier.", null, null);
                    }
                    String strZzZ = zzZ(cZzxE2, this.zzWKF, " in DOCTYPE declaration");
                    this.zzWLj = strZzZ;
                    strZzZ.length();
                }
            } else if (cZzxC2 == 'S') {
                this.zzWLk = null;
                strZzX = zzX(zzxF(" in DOCTYPE declaration"), "YSTEM");
                if (strZzX != null) {
                    strZzX = "S".concat(strZzX);
                } else {
                    char cZzxC3 = zzxC(" in DOCTYPE declaration");
                    if (cZzxC3 != '\"' && cZzxC3 != '\'') {
                        zzd(cZzxC3, " in DOCTYPE declaration; expected a system identifier.");
                    }
                    String strZzZ2 = zzZ(cZzxC3, this.zzWKF, " in DOCTYPE declaration");
                    this.zzWLj = strZzZ2;
                    if (strZzZ2.length() == 0) {
                        this.zzWLj = null;
                    }
                }
            } else if (zzXn(cZzxC2)) {
                this.zzWMi--;
                strZzX = zzX(cZzxC2, "SYSTEM");
            } else {
                zzd(cZzxC2, " in DOCTYPE declaration; expected keywords 'PUBLIC' or 'SYSTEM'.");
                strZzX = null;
            }
            if (strZzX != null) {
                zzV(C20593OooO0Oo.OooO0O0("Unexpected keyword '", strZzX, "'; expected 'PUBLIC' or 'SYSTEM'"), null, null);
            }
            cZzxC2 = zzxC(" in DOCTYPE declaration");
        }
        if (cZzxC2 != '[' && cZzxC2 != '>') {
            zzd(cZzxC2, " in DOCTYPE declaration; expected closing '>'.");
        }
        this.zzWMi--;
        this.zzWLf = 1;
    }

    private void zzXMM() throws zzZQS {
        this.zzWLn = 0;
        this.zzWKy = null;
        String strZzX = zzX(zzxC(" in xml declaration"), "version");
        if (strZzX != null) {
            zzV(zzZH9.zzWPx, strZzX, "version");
        }
        char cZzXM = zzXM("version", " in xml declaration");
        zzZDU zzzdu = this.zzWNc;
        zzzdu.zzXLr();
        zzZ("version", cZzXM, zzzdu);
        if (zzzdu.zzwT("1.0")) {
            this.zzWKx = 256;
            this.zzWQ6 = false;
        } else if (zzzdu.zzwT("1.1")) {
            this.zzWKx = StyleIdentifier.TABLE_GRID_LIGHT;
            this.zzWQ6 = true;
        } else {
            this.zzWKx = 0;
            this.zzWQ6 = false;
            zzV("Unexpected xml version '" + zzzdu.toString() + "'; expected '1.0' or '1.1'", null, null);
        }
        char cZzxC = zzxC(" in xml declaration");
        if (cZzxC != '?') {
            if (cZzxC == 'e') {
                String strZzX2 = zzX(cZzxC, "encoding");
                if (strZzX2 != null) {
                    zzV(zzZH9.zzWPx, strZzX2, "encoding");
                }
                char cZzXM2 = zzXM("encoding", " in xml declaration");
                zzzdu.zzXLs();
                zzZ("encoding", cZzXM2, zzzdu);
                this.zzWKy = zzzdu.toString();
                cZzxC = zzxC(" in xml declaration");
            } else if (cZzxC != 's') {
                zzd(cZzxC, " in xml declaration; expected either 'encoding' or 'standalone' pseudo-attribute");
            }
            if (cZzxC == 's') {
                String strZzX3 = zzX(cZzxC, HTMLWriter.STANDALONE);
                if (strZzX3 != null) {
                    zzV(zzZH9.zzWPx, strZzX3, HTMLWriter.STANDALONE);
                }
                char cZzXM3 = zzXM(HTMLWriter.STANDALONE, " in xml declaration");
                zzzdu.zzXLs();
                zzZ(HTMLWriter.STANDALONE, cZzXM3, zzzdu);
                if (zzzdu.zzwT("yes")) {
                    this.zzWLn = 1;
                } else if (zzzdu.zzwT(TranslateLanguage.NORWEGIAN)) {
                    this.zzWLn = 2;
                } else {
                    zzV("Unexpected xml 'standalone' pseudo-attribute value '" + zzzdu.toString() + "'; expected 'yes' or 'no'", null, null);
                }
                cZzxC = zzxC(" in xml declaration");
            }
        }
        if (cZzxC != '?') {
            zzd(cZzxC, " in xml declaration; expected '?>' as the end marker");
        }
        char cZzxE = zzxE(" in xml declaration");
        if (cZzxE != '>') {
            zzd(cZzxE, " in xml declaration; expected '>' to close the declaration");
        }
    }

    private int zzXMN() throws zzZQS {
        int i = this.zzWLa;
        if (i == 8) {
            if (this.zzWL9 == 7) {
                zzXMM();
            } else {
                this.zzWKy = null;
                this.zzWKx = 0;
                this.zzWLn = 0;
            }
            return 7;
        }
        if (i == 7) {
            this.zzWLb = 0;
            int i2 = this.zzWL9;
            if (i2 == 7) {
                zzP2(true);
                return this.zzWLa;
            }
            if (i2 == 1) {
                zzXk(zzxF(" in start tag"));
                return 1;
            }
            if (i2 == 11) {
                this.zzWLg = true;
                zzXML();
                return 11;
            }
        }
        throw new IllegalStateException("Internal error: unexpected state; current event " + zzZH9.zzgZ(this.zzWLa) + ", sec. state: " + zzZH9.zzgZ(this.zzWL9));
    }

    private int zzXMO() throws zzZQS {
        if (!this.zzWML.zzXPq()) {
            zzV("Illegal to have multiple roots (start tag in epilog?).", null, null);
        }
        this.zzWMi--;
        return zzgA(1);
    }

    private void zzXMQ() throws zzZQS {
        String strZzX = zzX(zzxE(" in CDATA section"), "CDATA");
        if (strZzX != null) {
            zzV(C20593OooO0Oo.OooO0O0("Unrecognized XML directive '", strZzX, "'; expected 'CDATA'."), null, null);
        }
        char cZzxE = zzxE(" in CDATA section");
        if (cZzxE != '[') {
            zzd(cZzxE, "excepted '[' after '<![CDATA'");
        }
    }

    private String zzXMW() {
        if (this.zzWLa != 11) {
            return null;
        }
        return this.zzWNc.zzXLp();
    }

    private String zzXMX() {
        if (this.zzWLm == null) {
            return this.zzWLl;
        }
        return this.zzWLm + C18241k5.f55433h + this.zzWLl;
    }

    private void zzXMz() throws zzZFV {
        zzxH("; was expecting a close tag for element <" + this.zzWLi.zzXMs() + ">");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0059, code lost:
    
        r8.zzWMi = r3;
        r8.zzWNc.zzJ(r1, r0, r3 - r0);
        zzY(r8.zzWNc);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0066, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzXOb() throws zzZQS {
        int i = this.zzWMi;
        char[] cArr = this.zzWLX;
        int i2 = this.zzWMh;
        int i3 = i;
        loop0: while (true) {
            if (i3 >= i2) {
                break;
            }
            int i4 = i3 + 1;
            char c = cArr[i3];
            if (c < ' ') {
                if (c == '\n') {
                    zzgr(i4);
                } else if (c == '\r') {
                    if (i4 >= i2 || this.zzWKF) {
                        break;
                    }
                    i3 = cArr[i4] == '\n' ? i3 + 2 : i4;
                    zzgr(i3);
                } else if (c != '\t') {
                    zzgs(c);
                }
                i3 = i4;
            } else {
                if (c == '?') {
                    while (i4 < i2) {
                        int i5 = i4 + 1;
                        char c2 = cArr[i4];
                        if (c2 == '>') {
                            this.zzWMi = i5;
                            this.zzWNc.zzK(cArr, i, (i5 - i) - 2);
                            return;
                        } else if (c2 == '?') {
                            i4 = i5;
                        }
                    }
                    i3 = i4 - 1;
                    break loop0;
                }
                i3 = i4;
            }
        }
    }

    private boolean zzXd(char c) throws zzZQS {
        if (c > ' ') {
            return false;
        }
        while (true) {
            if (c == '\n' || c == '\r') {
                zzXc(c);
            } else if (c != ' ' && c != '\t') {
                zzgs(c);
            }
            if (this.zzWMi >= this.zzWMh && !zzXOh()) {
                return true;
            }
            char[] cArr = this.zzWLX;
            int i = this.zzWMi;
            c = cArr[i];
            if (c > ' ') {
                return true;
            }
            this.zzWMi = i + 1;
        }
    }

    private final boolean zzXe(char c) throws zzZQS {
        int i = this.zzWMi;
        char[] cArr = this.zzWLX;
        int i2 = this.zzWMh;
        int i3 = i - 1;
        while (c <= ' ') {
            if (c == '\n') {
                zzgr(i);
            } else {
                if (c == '\r') {
                    if (i < this.zzWMh) {
                        if (this.zzWKF) {
                            if (cArr[i] != '\n') {
                                cArr[i - 1] = '\n';
                            }
                        } else if (cArr[i] == '\n') {
                            i++;
                        }
                        zzgr(i);
                    }
                    i--;
                    this.zzWMi = i;
                    this.zzWNc.zzK(cArr, i3, i - i3);
                    return false;
                }
                if (c != ' ' && c != '\t') {
                    zzgs(c);
                }
            }
            if (i >= i2) {
                this.zzWMi = i;
                this.zzWNc.zzK(cArr, i3, i - i3);
                return false;
            }
            int i4 = i + 1;
            char c2 = cArr[i];
            i = i4;
            c = c2;
        }
        int i5 = i - 1;
        this.zzWMi = i5;
        this.zzWNc.zzK(this.zzWLX, i3, i5 - i3);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x00ce A[LOOP:0: B:26:0x004c->B:69:0x00ce, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d7 A[EDGE_INSN: B:73:0x00d7->B:70:0x00d7 BREAK  A[LOOP:0: B:26:0x004c->B:69:0x00ce], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zzXf(char c) throws zzZQS {
        int i;
        int iZzJ = this.zzWMi;
        int i2 = iZzJ - 1;
        if (c <= ' ') {
            int i3 = this.zzWMh;
            if (iZzJ < i3 && this.zzWKF) {
                if (c == '\r') {
                    char[] cArr = this.zzWLX;
                    if (cArr[iZzJ] == '\n') {
                        int i4 = iZzJ + 1;
                        i2 = iZzJ;
                        iZzJ = i4;
                        if (i4 >= i3) {
                            c = '\n';
                        }
                    } else {
                        cArr[i2] = '\n';
                    }
                    c = '\n';
                    zzgr(iZzJ);
                    if (this.zzWL6 <= 0 && (iZzJ = zzJ(c, iZzJ)) < 0) {
                        return true;
                    }
                    c = this.zzWLX[iZzJ];
                    iZzJ++;
                } else if (c == '\n') {
                    zzgr(iZzJ);
                    if (this.zzWL6 <= 0) {
                    }
                    c = this.zzWLX[iZzJ];
                    iZzJ++;
                }
            }
            this.zzWL8 = 0;
        } else {
            this.zzWL8 = 2;
        }
        char[] cArr2 = this.zzWLX;
        int i5 = this.zzWMh;
        while (true) {
            if (c >= '?') {
                if (iZzJ >= i5) {
                    break;
                }
                int i6 = iZzJ + 1;
                char c2 = cArr2[iZzJ];
                iZzJ = i6;
                c = c2;
            } else {
                if (c == '<') {
                    int i7 = iZzJ - 1;
                    this.zzWMi = i7;
                    this.zzWNc.zzK(cArr2, i2, i7 - i2);
                    return true;
                }
                if (c < ' ') {
                    if (c == '\n') {
                        zzgr(iZzJ);
                    } else if (c == '\r') {
                        if (iZzJ >= i5) {
                            break;
                        }
                        if (this.zzWKF) {
                            if (cArr2[iZzJ] == '\n') {
                                break;
                            }
                            cArr2[iZzJ - 1] = '\n';
                        } else if (cArr2[iZzJ] == '\n') {
                            iZzJ++;
                        }
                        zzgr(iZzJ);
                    } else if (c != '\t') {
                        this.zzWMi = iZzJ;
                        int i8 = iZzJ - i2;
                        this.zzWNc.zzK(cArr2, i2, i8 - 1);
                        this.zzWL5 = zzYS(c, i8 > 1);
                        return true;
                    }
                    if (iZzJ >= i5) {
                    }
                } else {
                    if (c == '&') {
                        break;
                    }
                    if (c == '>' && (i = iZzJ - i2) >= 3 && cArr2[iZzJ - 3] == ']' && cArr2[iZzJ - 2] == ']') {
                        this.zzWMi = iZzJ;
                        this.zzWNc.zzK(cArr2, i2, i - 1);
                        this.zzWL5 = zzZV(zzZH9.zzWPy, true);
                        return true;
                    }
                    if (iZzJ >= i5) {
                    }
                }
            }
        }
        iZzJ--;
        this.zzWMi = iZzJ;
        this.zzWNc.zzK(cArr2, i2, iZzJ - i2);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
    
        r7 = r7 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075 A[LOOP:0: B:7:0x0014->B:45:0x0075, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x007d A[EDGE_INSN: B:58:0x007d->B:46:0x007d BREAK  A[LOOP:0: B:7:0x0014->B:45:0x0075], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zzXg(char c) throws zzZQS {
        this.zzWL8 = c <= ' ' ? 0 : 2;
        int i = this.zzWMi;
        int i2 = this.zzWMh;
        char[] cArr = this.zzWLX;
        int i3 = i - 1;
        int i4 = i;
        while (true) {
            if (c < ' ') {
                if (c == '\n') {
                    zzgr(i4);
                } else if (c == '\r') {
                    if (i4 >= i2) {
                        break;
                    }
                    if (this.zzWKF) {
                        if (cArr[i4] == '\n') {
                            break;
                        }
                        cArr[i4 - 1] = '\n';
                    } else if (cArr[i4] == '\n') {
                        i4++;
                    }
                    zzgr(i4);
                } else if (c != '\t') {
                    zzgs(c);
                }
                if (i4 < i2) {
                    break;
                }
                int i5 = i4 + 1;
                char c2 = cArr[i4];
                i4 = i5;
                c = c2;
            } else {
                if (c == ']') {
                    int i6 = i4 + 1;
                    if (i6 >= i2) {
                        break;
                    }
                    if (cArr[i4] == ']') {
                        while (true) {
                            i4 = i6;
                            if (i4 >= i2) {
                                i4 -= 2;
                                break;
                            }
                            i6 = i4 + 1;
                            char c3 = cArr[i4];
                            if (c3 == '>') {
                                this.zzWMi = i6;
                                this.zzWNc.zzK(cArr, i3, i6 - (i + 2));
                                this.zzWLf = 3;
                                return true;
                            }
                            if (c3 != ']') {
                                break;
                            }
                        }
                    }
                }
                if (i4 < i2) {
                }
            }
        }
        this.zzWMi = i4;
        this.zzWNc.zzK(cArr, i3, i4 - i3);
        if (this.zzWLs || this.zzWNc.size() < this.zzWLp) {
            this.zzWLf = 1;
        } else {
            this.zzWLf = 2;
        }
        return false;
    }

    private final boolean zzXh(char c) throws zzZQS {
        char cZzxE;
        char cZzxE2;
        zzZEZ zzzez = this.zzWLh;
        while (true) {
            if (c <= ' ') {
                c = zzO(" in start tag", c);
            } else if (c != '/' && c != '>') {
                zzd(c, " excepted space, or '>' or \"/>\"");
            }
            if (c == '/') {
                char cZzxE3 = zzxE(" in start tag");
                if (cZzxE3 == '>') {
                    return true;
                }
                zzd(cZzxE3, " expected '>'");
                return true;
            }
            if (c == '>') {
                return false;
            }
            if (c == '<') {
                zzV("Unexpected '<' character in element (missing closing '>'?)", null, null);
            }
            zzZDT zzzdtZzXN = zzzez.zzXN(null, zzXa(c));
            int i = this.zzWMi;
            if (i < this.zzWMh) {
                char[] cArr = this.zzWLX;
                this.zzWMi = i + 1;
                cZzxE = cArr[i];
            } else {
                cZzxE = zzxE(" in start tag");
            }
            if (cZzxE <= ' ') {
                cZzxE = zzO(" in start tag", cZzxE);
            }
            if (cZzxE != '=') {
                zzd(cZzxE, " expected '='");
            }
            int i2 = this.zzWMi;
            if (i2 < this.zzWMh) {
                char[] cArr2 = this.zzWLX;
                this.zzWMi = i2 + 1;
                cZzxE2 = cArr2[i2];
            } else {
                cZzxE2 = zzxE(" in start tag");
            }
            if (cZzxE2 <= ' ') {
                cZzxE2 = zzO(" in start tag", cZzxE2);
            }
            if (cZzxE2 != '\"' && cZzxE2 != '\'') {
                zzd(cZzxE2, " in start tag Expected a quote");
            }
            zzZ(cZzxE2, zzzdtZzXN);
            int i3 = this.zzWMi;
            if (i3 < this.zzWMh) {
                char[] cArr3 = this.zzWLX;
                this.zzWMi = i3 + 1;
                c = cArr3[i3];
            } else {
                c = zzxE(" in start tag");
            }
        }
    }

    private final boolean zzXi(char c) throws zzZQS {
        char cZzxE;
        String strZzXb;
        char cZzxE2;
        char cZzxE3;
        zzZDT zzzdtZzXN;
        int iZzXLe;
        char cZzxE4;
        zzZEZ zzzez = this.zzWLh;
        while (true) {
            if (c <= ' ') {
                c = zzO(" in start tag", c);
            } else if (c != '/' && c != '>') {
                zzd(c, " excepted space, or '>' or \"/>\"");
            }
            if (c == '/') {
                char cZzxE5 = zzxE(" in start tag");
                if (cZzxE5 != '>') {
                    zzd(cZzxE5, " expected '>'");
                }
                return true;
            }
            if (c == '>') {
                return false;
            }
            if (c == '<') {
                zzV("Unexpected '<' character in element (missing closing '>'?)", null, null);
            }
            String strZzXb2 = zzXb(c);
            int i = this.zzWMi;
            if (i < this.zzWMh) {
                char[] cArr = this.zzWLX;
                this.zzWMi = i + 1;
                cZzxE = cArr[i];
            } else {
                cZzxE = zzxE("; expected an identifier");
            }
            if (cZzxE == ':') {
                int i2 = this.zzWMi;
                if (i2 < this.zzWMh) {
                    char[] cArr2 = this.zzWLX;
                    this.zzWMi = i2 + 1;
                    cZzxE4 = cArr2[i2];
                } else {
                    cZzxE4 = zzxE("; expected an identifier");
                }
                strZzXb = zzXb(cZzxE4);
            } else {
                this.zzWMi--;
                strZzXb = strZzXb2;
                strZzXb2 = null;
            }
            int i3 = this.zzWMi;
            if (i3 < this.zzWMh) {
                char[] cArr3 = this.zzWLX;
                this.zzWMi = i3 + 1;
                cZzxE2 = cArr3[i3];
            } else {
                cZzxE2 = zzxE(" in start tag");
            }
            if (cZzxE2 <= ' ') {
                cZzxE2 = zzO(" in start tag", cZzxE2);
            }
            if (cZzxE2 != '=') {
                zzd(cZzxE2, " expected '='");
            }
            int i4 = this.zzWMi;
            if (i4 < this.zzWMh) {
                char[] cArr4 = this.zzWLX;
                this.zzWMi = i4 + 1;
                cZzxE3 = cArr4[i4];
            } else {
                cZzxE3 = zzxE(" in start tag");
            }
            if (cZzxE3 <= ' ') {
                cZzxE3 = zzO(" in start tag", cZzxE3);
            }
            if (cZzxE3 != '\"' && cZzxE3 != '\'') {
                zzd(cZzxE3, " in start tag Expected a quote");
            }
            String str = zzWLt;
            if (strZzXb2 == str) {
                zzzdtZzXN = zzzez.zzxL(strZzXb);
                if (zzzdtZzXN == null) {
                    zzV(C20593OooO0Oo.OooO0O0("Duplicate declaration for namespace prefix '", strZzXb, "'."), null, null);
                }
                iZzXLe = zzzdtZzXN.zzXLe();
            } else {
                if (strZzXb == str && strZzXb2 == null) {
                    zzzdtZzXN = zzzez.zzXN2();
                    if (zzzdtZzXN == null) {
                        zzV("Duplicate default namespace declaration.", null, null);
                    }
                } else {
                    zzzdtZzXN = zzzez.zzXN(strZzXb2, strZzXb);
                }
                iZzXLe = -1;
            }
            zzZ(cZzxE3, zzzdtZzXN);
            if (!this.zzWQ6 && iZzXLe >= 0 && zzzdtZzXN.zzXLe() == iZzXLe) {
                zzV(zzZH9.zzWPk, null, null);
            }
            int i5 = this.zzWMi;
            if (i5 < this.zzWMh) {
                char[] cArr5 = this.zzWLX;
                this.zzWMi = i5 + 1;
                c = cArr5[i5];
            } else {
                c = zzxE(" in start tag");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzXj(char c) throws zzZQS {
        char cZzxE;
        boolean zZzXh;
        char cZzxE2;
        char cZzxE3;
        char cZzxE4;
        this.zzWLf = 4;
        if (this.zzWKN) {
            String strZzXb = zzXb(c);
            int i = this.zzWMi;
            if (i < this.zzWMh) {
                char[] cArr = this.zzWLX;
                this.zzWMi = i + 1;
                cZzxE2 = cArr[i];
            } else {
                cZzxE2 = zzxE("; expected an identifier");
            }
            if (cZzxE2 == ':') {
                int i2 = this.zzWMi;
                if (i2 < this.zzWMh) {
                    char[] cArr2 = this.zzWLX;
                    this.zzWMi = i2 + 1;
                    cZzxE3 = cArr2[i2];
                } else {
                    cZzxE3 = zzxE("; expected an identifier");
                }
                this.zzWLi.zzXL(strZzXb, zzXb(cZzxE3));
                int i3 = this.zzWMi;
                if (i3 < this.zzWMh) {
                    char[] cArr3 = this.zzWLX;
                    this.zzWMi = i3 + 1;
                    cZzxE4 = cArr3[i3];
                } else {
                    cZzxE4 = zzxE(" in start tag");
                }
                cZzxE2 = cZzxE4;
            } else {
                this.zzWLi.zzXL(null, strZzXb);
            }
            zZzXh = cZzxE2 == '>' ? false : zzXi(cZzxE2);
        } else {
            this.zzWLi.zzXL(null, zzXa(c));
            int i4 = this.zzWMi;
            if (i4 < this.zzWMh) {
                char[] cArr4 = this.zzWLX;
                this.zzWMi = i4 + 1;
                cZzxE = cArr4[i4];
            } else {
                cZzxE = zzxE(" in start tag");
            }
            if (cZzxE != '>') {
                zZzXh = zzXh(cZzxE);
            }
        }
        if (!zZzXh) {
            this.zzWKI++;
        }
        this.zzWLc = zZzXh;
        int iZzXMw = this.zzWLi.zzXMw();
        this.zzWL4 = iZzXMw;
        this.zzWL7 = iZzXMw == 3;
    }

    private void zzXk(char c) throws zzZQS {
        String str;
        this.zzWLb = 1;
        zzXMP();
        zzXj(c);
        if (this.zzWLl == null || !zzgB(32) || this.zzWLi.zzXJ(this.zzWLm, this.zzWLl)) {
            return;
        }
        if (this.zzWLm == null) {
            str = this.zzWLl;
        } else {
            str = this.zzWLm + C18241k5.f55433h + this.zzWLl;
        }
        zzW(zzZH9.zzWP6, str, this.zzWLl);
    }

    public static zzZEW zzY(zzZHC zzzhc) {
        return new zzZEW(zzzhc, zzzhc.zzXPP());
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0112, code lost:
    
        r12.zzWNc.zzge(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0117, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x013c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0118 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean zzYT(int i, boolean z) throws zzZQS {
        char c;
        int i2;
        int iZzOX;
        char[] cArrZzXLk = this.zzWNc.zzXLk();
        int iZzXLj = this.zzWNc.zzXLj();
        int i3 = this.zzWMi;
        char[] cArr = this.zzWLX;
        int i4 = this.zzWMh;
        while (true) {
            if (i3 >= i4) {
                this.zzWMi = i3;
                if (!zzXOi()) {
                    break;
                }
                i3 = this.zzWMi;
                cArr = this.zzWLX;
                i4 = this.zzWMh;
                int i5 = i3 + 1;
                c = cArr[i3];
                if (c < '?') {
                    if (c >= ' ') {
                        if (c != '<') {
                            if (c != '&') {
                                if (c == '>' && i5 > 2 && cArr[i3 - 2] == ']' && cArr[i3 - 1] == ']') {
                                    this.zzWMi = i5;
                                    this.zzWNc.zzge(iZzXLj);
                                    this.zzWL5 = zzZV(zzZH9.zzWPy, z);
                                    break;
                                }
                            } else {
                                this.zzWMi = i5;
                                if (!this.zzWKM) {
                                    iZzOX = zzOX(true);
                                    if (iZzOX == 0) {
                                        this.zzWMi--;
                                        break;
                                    }
                                } else if ((i4 - i5 < 3 || (iZzOX = zzXMg()) == 0) && (iZzOX = zzOW(true)) == 0) {
                                    cArr = this.zzWLX;
                                    i4 = this.zzWMh;
                                    i3 = this.zzWMi;
                                }
                                if (iZzOX > 65535) {
                                    int i6 = iZzOX - 65536;
                                    if (iZzXLj >= cArrZzXLk.length) {
                                        cArrZzXLk = this.zzWNc.zzXLi();
                                        iZzXLj = 0;
                                    }
                                    int i7 = iZzXLj + 1;
                                    cArrZzXLk[iZzXLj] = (char) ((i6 >> 10) + 55296);
                                    if (i7 >= cArrZzXLk.length) {
                                        cArrZzXLk = zzZ(i5, cArrZzXLk, Integer.MAX_VALUE);
                                        if (cArrZzXLk == null) {
                                            return false;
                                        }
                                        iZzXLj = 0;
                                    } else {
                                        iZzXLj = i7;
                                    }
                                    iZzOX = (i6 & 1023) + 56320;
                                }
                                c = (char) iZzOX;
                                i3 = this.zzWMi;
                                i4 = this.zzWMh;
                                i2 = iZzXLj + 1;
                                cArrZzXLk[iZzXLj] = c;
                                if (i2 >= cArrZzXLk.length) {
                                }
                            }
                        } else {
                            this.zzWMi = i3;
                            break;
                        }
                    } else if (c != '\n') {
                        if (c != '\r') {
                            if (c != '\t') {
                                this.zzWNc.zzge(iZzXLj);
                                this.zzWMi = i5;
                                this.zzWL5 = zzYS(c, z);
                                break;
                            }
                        } else {
                            this.zzWMi = i5;
                            if (!zzXc(c)) {
                                if (this.zzWKF) {
                                }
                                i4 = this.zzWMh;
                                i3 = this.zzWMi;
                                i2 = iZzXLj + 1;
                                cArrZzXLk[iZzXLj] = c;
                                if (i2 >= cArrZzXLk.length) {
                                    cArrZzXLk = zzZ(i3, cArrZzXLk, i);
                                    if (cArrZzXLk == null) {
                                        return false;
                                    }
                                    zzZER.zzY("Text size", this.zzWML.zzXPx(), this.zzWNc.size());
                                    iZzXLj = 0;
                                } else {
                                    iZzXLj = i2;
                                }
                            } else if (!this.zzWKF) {
                                int i8 = iZzXLj + 1;
                                cArrZzXLk[iZzXLj] = c;
                                if (i8 >= cArrZzXLk.length) {
                                    cArrZzXLk = this.zzWNc.zzXLi();
                                    iZzXLj = 0;
                                } else {
                                    iZzXLj = i8;
                                }
                            }
                            c = '\n';
                            i4 = this.zzWMh;
                            i3 = this.zzWMi;
                            i2 = iZzXLj + 1;
                            cArrZzXLk[iZzXLj] = c;
                            if (i2 >= cArrZzXLk.length) {
                            }
                        }
                    } else {
                        zzgr(i5);
                    }
                }
                i3 = i5;
                i2 = iZzXLj + 1;
                cArrZzXLk[iZzXLj] = c;
                if (i2 >= cArrZzXLk.length) {
                }
            } else {
                int i52 = i3 + 1;
                c = cArr[i3];
                if (c < '?') {
                }
                i3 = i52;
                i2 = iZzXLj + 1;
                cArrZzXLk[iZzXLj] = c;
                if (i2 >= cArrZzXLk.length) {
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0085 -> B:12:0x0018). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzYU(int r8, boolean r9) throws com.aspose.words.internal.zzZQS {
        /*
            r7 = this;
            r0 = 0
            r1 = 1
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = 4
            if (r8 == r3) goto L39
            r4 = 6
            if (r8 != r4) goto Lc
            goto L39
        Lc:
            r4 = 12
            if (r8 != r4) goto L1a
            int r8 = r7.zzWLf
            r4 = 2
            if (r8 > r4) goto L18
            r7.zzgx(r2)
        L18:
            r8 = r1
            goto L3d
        L1a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Internal error: unexpected token "
            r9.<init>(r0)
            int r0 = r7.zzWLa
            java.lang.String r0 = com.aspose.words.internal.zzZH9.zzgZ(r0)
            r9.append(r0)
            java.lang.String r0 = "; expected CHARACTERS, CDATA or SPACE."
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L39:
            r7.zzYT(r2, r9)
        L3c:
            r8 = r0
        L3d:
            if (r9 == 0) goto L43
            com.aspose.words.internal.zzZQS r4 = r7.zzWL5
            if (r4 != 0) goto L97
        L43:
            int r4 = r7.zzWMi
            int r5 = r7.zzWMh
            if (r4 < r5) goto L54
            com.aspose.words.internal.zzZDU r4 = r7.zzWNc
            r4.zzXLl()
            boolean r4 = r7.zzXOi()
            if (r4 == 0) goto L97
        L54:
            char[] r4 = r7.zzWLX
            int r5 = r7.zzWMi
            char r4 = r4[r5]
            r6 = 60
            if (r4 != r6) goto L90
            int r8 = r7.zzWMh
            int r8 = r8 - r5
            r4 = 9
            if (r8 >= r4) goto L71
            com.aspose.words.internal.zzZDU r8 = r7.zzWNc
            r8.zzXLl()
            r8 = 3
            boolean r8 = r7.zzgV(r8)
            if (r8 == 0) goto L97
        L71:
            char[] r8 = r7.zzWLX
            int r4 = r7.zzWMi
            int r5 = r4 + 1
            char r5 = r8[r5]
            r6 = 33
            if (r5 != r6) goto L97
            int r5 = r4 + 2
            char r8 = r8[r5]
            r5 = 91
            if (r8 != r5) goto L97
            int r4 = r4 + 3
            r7.zzWMi = r4
            r7.zzXMQ()
            r7.zzgx(r2)
            goto L18
        L90:
            r5 = 38
            if (r4 != r5) goto L9a
            if (r8 == 0) goto L97
            goto L9a
        L97:
            r7.zzWLf = r3
            return
        L9a:
            r7.zzYT(r2, r9)
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aspose.words.internal.zzZEY.zzYU(int, boolean):void");
    }

    private final void zzZ(char c, zzZDT zzzdt) throws zzZQS {
        char cZzxF;
        int iZzOW;
        char[] cArrZzXLf = zzzdt.zzXLf();
        int iZzXLe = zzzdt.zzXLe();
        int length = cArrZzXLf.length;
        zzZF1 zzzf1 = this.zzWKK;
        while (true) {
            int i = this.zzWMi;
            if (i < this.zzWMh) {
                char[] cArr = this.zzWLX;
                this.zzWMi = i + 1;
                cZzxF = cArr[i];
            } else {
                cZzxF = zzxF(" in attribute value");
            }
            if (cZzxF <= '\'') {
                if (cZzxF < ' ') {
                    if (this.zzWKE) {
                        if (cZzxF == '\n') {
                            zzXMj();
                        } else if (cZzxF == '\r') {
                            if (this.zzWKF && zzxF(" in attribute value") != '\n') {
                                this.zzWMi--;
                            }
                            zzXMj();
                        } else if (cZzxF != '\t') {
                            zzgs(cZzxF);
                        }
                        cZzxF = ' ';
                    }
                } else if (cZzxF == c) {
                    if (this.zzWKK == zzzf1) {
                        zzzdt.zzga(iZzXLe);
                        return;
                    }
                } else if (cZzxF == '&') {
                    if ((zzXMm() >= 3 && (iZzOW = zzXMg()) != 0) || (iZzOW = zzOW(false)) != 0) {
                        if (iZzOW <= 65535) {
                            cZzxF = (char) iZzOW;
                        } else {
                            int i2 = iZzOW - 65536;
                            if (iZzXLe >= length) {
                                cArrZzXLf = zzzdt.zzXLd();
                                length = cArrZzXLf.length;
                            }
                            cArrZzXLf[iZzXLe] = (char) ((i2 >> 10) + 55296);
                            cZzxF = (char) ((i2 & 1023) + 56320);
                            iZzXLe++;
                        }
                    }
                }
            } else if (cZzxF == '<') {
                zzV("Unexpected '<'  in attribute value", null, null);
            }
            if (iZzXLe >= length) {
                zzZER.zzY("Maximum attribute size", this.zzWML.zzXPE(), zzzdt.zzXLe());
                cArrZzXLf = zzzdt.zzXLd();
                length = cArrZzXLf.length;
            }
            cArrZzXLf[iZzXLe] = cZzxF;
            iZzXLe++;
        }
    }

    private int zzgA(int i) {
        this.zzWLb = 3;
        this.zzWLf = 4;
        this.zzWL9 = i;
        return 8;
    }

    private static void zzgw(int i) {
        throw new IllegalStateException("Not a textual event (" + zzZH9.zzgZ(i) + ")");
    }

    private boolean zzgx(int i) throws zzZQS {
        char[] cArr = this.zzWLX;
        int i2 = this.zzWMh;
        int i3 = this.zzWMi;
        char[] cArrZzXLk = this.zzWNc.zzXLk();
        int iZzXLj = this.zzWNc.zzXLj();
        while (true) {
            if (i3 >= i2) {
                zzxB(" in CDATA section");
                cArr = this.zzWLX;
                i3 = this.zzWMi;
                i2 = this.zzWMh;
            }
            int i4 = i3 + 1;
            char c = cArr[i3];
            if (c < ' ') {
                if (c == '\n') {
                    zzgr(i4);
                } else if (c == '\r') {
                    this.zzWMi = i4;
                    if (!zzXc(c)) {
                        if (this.zzWKF) {
                        }
                        i4 = this.zzWMi;
                        cArr = this.zzWLX;
                        i2 = this.zzWMh;
                    } else if (!this.zzWKF) {
                        int i5 = iZzXLj + 1;
                        cArrZzXLk[iZzXLj] = c;
                        if (i5 >= cArrZzXLk.length) {
                            cArrZzXLk = this.zzWNc.zzXLi();
                            iZzXLj = 0;
                        } else {
                            iZzXLj = i5;
                        }
                    }
                    c = '\n';
                    i4 = this.zzWMi;
                    cArr = this.zzWLX;
                    i2 = this.zzWMh;
                } else if (c != '\t') {
                    zzgs(c);
                }
            } else if (c == ']') {
                this.zzWMi = i4;
                if (zzS(cArrZzXLk, iZzXLj)) {
                    return true;
                }
                i3 = this.zzWMi;
                cArr = this.zzWLX;
                i2 = this.zzWMh;
                cArrZzXLk = this.zzWNc.zzXLk();
                iZzXLj = this.zzWNc.zzXLj();
            }
            int i6 = iZzXLj + 1;
            cArrZzXLk[iZzXLj] = c;
            if (i6 >= cArrZzXLk.length) {
                zzZDU zzzdu = this.zzWNc;
                if (!this.zzWLs) {
                    zzzdu.zzge(cArrZzXLk.length);
                    if (zzzdu.size() >= i) {
                        this.zzWMi = i4;
                        return false;
                    }
                }
                cArrZzXLk = zzzdu.zzXLi();
                iZzXLj = 0;
            } else {
                iZzXLj = i6;
            }
            i3 = i4;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r6v0 ??, r6v1 ??, r6v7 ??, r6v6 ??, r6v8 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    private int zzgy(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r6v0 ??, r6v1 ??, r6v7 ??, r6v6 ??, r6v8 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r6v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int zzgz(int i) throws zzZQS {
        while (true) {
            if (i == 60) {
                if (!zzgV(3)) {
                    break;
                }
                char[] cArr = this.zzWLX;
                int i2 = this.zzWMi;
                if (cArr[i2] != '!' || cArr[i2 + 1] != '[') {
                    break;
                }
                this.zzWMi = i2 + 2;
                zzXMQ();
                zzY(" in CDATA section", ']', false);
                i = zzXNn();
            } else {
                if (i < 0) {
                    break;
                }
                i = zzgy(i);
                if (i == 38 || i < 0) {
                    break;
                }
            }
        }
        return i;
    }

    @Override // com.aspose.words.internal.zzZQR
    public final void close() throws zzZQS {
        if (this.zzWLb != 4) {
            this.zzWLb = 4;
            if (this.zzWLa != 8) {
                this.zzWL9 = 8;
                this.zzWLa = 8;
                if (this.zzWQm.isDirty()) {
                    this.zzWLo.zzY(this.zzWQm);
                }
            }
            zzXMi();
            this.zzWNc.zzOR(true);
        }
    }

    @Override // com.aspose.words.internal.zzZQR
    public final int getAttributeCount() {
        if (this.zzWLa == 1) {
            return this.zzWLh.getCount();
        }
        throw new IllegalStateException(zzZH9.zzWPH);
    }

    @Override // com.aspose.words.internal.zzZQR
    public final String getAttributeNamespace(int i) {
        if (this.zzWLa != 1) {
            throw new IllegalStateException(zzZH9.zzWPH);
        }
        String uri = this.zzWLh.getURI(i);
        return uri == null ? "" : uri;
    }

    @Override // com.aspose.words.internal.zzZQR
    public final String getAttributePrefix(int i) {
        if (this.zzWLa != 1) {
            throw new IllegalStateException(zzZH9.zzWPH);
        }
        String strZzRR = this.zzWLh.zzRR(i);
        return strZzRR == null ? "" : strZzRR;
    }

    @Override // com.aspose.words.internal.zzZQR
    public final String getAttributeValue(int i) {
        if (this.zzWLa == 1) {
            return this.zzWLh.getValue(i);
        }
        throw new IllegalStateException(zzZH9.zzWPH);
    }

    public final int getDepth() {
        return this.zzWLi.getDepth();
    }

    public final String getEncoding() {
        return this.zzWKz;
    }

    @Override // com.aspose.words.internal.zzZQR
    public final int getEventType() {
        int i = this.zzWLa;
        if (i != 12) {
            return i;
        }
        if (this.zzWLs || this.zzWLr) {
            return 4;
        }
        return i;
    }

    @Override // com.aspose.words.internal.zzZQR
    public final String getLocalName() {
        int i = this.zzWLa;
        if (i == 1 || i == 2) {
            return this.zzWLi.getLocalName();
        }
        if (i != 9) {
            throw new IllegalStateException("Current state not START_ELEMENT, END_ELEMENT or ENTITY_REFERENCE");
        }
        zzZG3 zzzg3 = this.zzWKu;
        return zzzg3 == null ? this.zzWKL : zzzg3.getName();
    }

    @Override // com.aspose.words.internal.zzZQR
    public final String getNamespacePrefix(int i) {
        int i2 = this.zzWLa;
        if (i2 != 1 && i2 != 2) {
            throw new IllegalStateException(zzZH9.zzWPG);
        }
        String strZzgu = this.zzWLi.zzgu(i);
        if (strZzgu != null) {
            return strZzgu;
        }
        if (this.zzWQq) {
            return null;
        }
        return "";
    }

    @Override // com.aspose.words.internal.zzZQR
    public final String getNamespaceURI() {
        int i = this.zzWLa;
        if (i != 1 && i != 2) {
            throw new IllegalStateException(zzZH9.zzWPG);
        }
        String strZzXMt = this.zzWLi.zzXMt();
        return strZzXMt == null ? "" : strZzXMt;
    }

    @Override // com.aspose.words.internal.zzZQR
    public final String getPrefix() {
        int i = this.zzWLa;
        if (i != 1 && i != 2) {
            throw new IllegalStateException(zzZH9.zzWPG);
        }
        String prefix = this.zzWLi.getPrefix();
        return prefix == null ? "" : prefix;
    }

    public Object getProperty(String str) {
        if (!"com.ctc.wstx.baseURL".equals(str)) {
            return this.zzWML.zzy8(str);
        }
        try {
            return this.zzWKK.zzXNH();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.aspose.words.internal.zzZQR
    public final String getText() {
        int i = this.zzWLa;
        if (((1 << i) & 6768) == 0) {
            zzgw(i);
        }
        if (this.zzWLf < this.zzWLe) {
            zzXMD();
        }
        int i2 = this.zzWLa;
        if (i2 != 9) {
            return i2 == 11 ? zzXMW() : this.zzWNc.zzXLp();
        }
        zzZG3 zzzg3 = this.zzWKu;
        if (zzzg3 == null) {
            return null;
        }
        return zzzg3.zzlc();
    }

    @Override // com.aspose.words.internal.zzZQR
    public final boolean hasNext() {
        return this.zzWLa != 8 || this.zzWLb == 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007b A[ADDED_TO_REGION, REMOVE] */
    @Override // com.aspose.words.internal.zzZQR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int next() throws zzZQS {
        zzZQS zzzqs = this.zzWL5;
        if (zzzqs != null) {
            this.zzWL5 = null;
            throw zzzqs;
        }
        int i = this.zzWLb;
        if (i != 1) {
            if (i == 0) {
                zzP2(true);
            } else if (i == 2) {
                if (zzP2(false)) {
                    this.zzWL9 = 0;
                }
            } else {
                if (i != 3) {
                    if (this.zzWL9 != 8) {
                        throw new NoSuchElementException();
                    }
                    this.zzWL9 = 0;
                    return 8;
                }
                this.zzWLa = zzXMN();
            }
            return this.zzWLa;
        }
        int iZzXMK = zzXMK();
        this.zzWLa = iZzXMK;
        if (this.zzWLf < this.zzWLe && (!this.zzWLq || (this.zzWL7 && (iZzXMK == 4 || iZzXMK == 12)))) {
            zzOY(false);
        }
        if (iZzXMK == 12) {
            if (this.zzWL7) {
                this.zzWNc.zzXLm();
            }
            if (this.zzWLs || this.zzWLr) {
                return 4;
            }
            this.zzWLd = this.zzWNc.size() + this.zzWLd;
            zzZER.zzY("Text size", this.zzWML.zzXPx(), this.zzWLd);
            return iZzXMK;
        }
        if (iZzXMK != 4) {
            if (iZzXMK != 1 && iZzXMK != 2) {
                return iZzXMK;
            }
            this.zzWLd = 0;
            return iZzXMK;
        }
        if (this.zzWL7) {
            int i2 = this.zzWMi;
            if (i2 + 1 < this.zzWMh) {
                char[] cArr = this.zzWLX;
                if (cArr[i2] != '<' || cArr[i2 + 1] == '/') {
                    this.zzWNc.zzXLm();
                } else {
                    this.zzWNc.zzXLm();
                }
            }
        }
        this.zzWLd = this.zzWNc.size() + this.zzWLd;
        zzZER.zzY("Text size", this.zzWML.zzXPx(), this.zzWLd);
        return iZzXMK;
    }

    public void zzOZ(boolean z) throws zzZQS {
        char cZzxF = zzxF(" in DOCTYPE declaration");
        if (cZzxF == '[') {
            if (z) {
                ((zzZFM) this.zzWKK).zzZ(this.zzWNc, this.zzWMi, this.zzWKF);
            }
            try {
                zzZGD.zzZ(this, this.zzWKK, this.zzWML);
                cZzxF = zzxD(" in internal DTD subset");
            } finally {
                if (z) {
                    ((zzZFM) this.zzWKK).zzgR(this.zzWMi - 1);
                }
            }
        }
        if (cZzxF != '>') {
            zzd(cZzxF, "; expected '>' to finish DOCTYPE declaration.");
        }
    }

    @Override // com.aspose.words.internal.zzZQR
    public final String zzRu(int i) {
        if (this.zzWLa == 1) {
            return this.zzWLh.getLocalName(i);
        }
        throw new IllegalStateException(zzZH9.zzWPH);
    }

    @Override // com.aspose.words.internal.zzZQR
    public final zzZR1 zzRv(int i) {
        if (this.zzWLa == 1) {
            return this.zzWLh.zzgE(i);
        }
        throw new IllegalStateException(zzZH9.zzWPH);
    }

    public final void zzXME() {
        if (this.zzWLf < this.zzWLe) {
            zzXMD();
        }
    }

    public void zzXMP() throws zzZQS {
    }

    public final zzZEZ zzXMR() {
        return this.zzWLh;
    }

    public final zzZEW zzXMS() {
        return this.zzWLi;
    }

    public final long zzXMT() throws zzZQS {
        if (this.zzWLf < this.zzWLe) {
            zzOY(false);
        }
        return this.zzWLW + ((long) this.zzWMi);
    }

    public final long zzXMU() {
        return this.zzWKC;
    }

    public zzYFD zzXMV() {
        return null;
    }

    @Override // com.aspose.words.internal.zzYFW
    public final String zzXMY() {
        int i = this.zzWLa;
        if (i != 1 && i != 2) {
            if (i == 3) {
                return zzlg();
            }
            if (i == 9) {
                return getLocalName();
            }
            if (i == 11) {
                return zzXMX();
            }
            throw new IllegalStateException("Current state not START_ELEMENT, END_ELEMENT, ENTITY_REFERENCE, PROCESSING_INSTRUCTION or DTD");
        }
        String prefix = this.zzWLi.getPrefix();
        String localName = this.zzWLi.getLocalName();
        if (prefix == null) {
            return localName;
        }
        StringBuilder sb = new StringBuilder(prefix.length() + localName.length() + 1);
        sb.append(prefix);
        sb.append(':');
        sb.append(localName);
        return sb.toString();
    }

    public final void zzXMZ() throws zzZQS {
        if (this.zzWLa != 1) {
            throw new IllegalStateException(zzZH9.zzWPH);
        }
        int i = 1;
        while (true) {
            int next = next();
            if (next == 1) {
                i++;
            } else if (next == 2 && i - 1 == 0) {
                return;
            }
        }
    }

    public final boolean zzc() throws zzZQS {
        if (this.zzWLa == 1) {
            return this.zzWLc;
        }
        return false;
    }

    public final boolean zzgB(int i) {
        return (this.zzWQl & i) == i;
    }

    public void zzgv(int i) throws zzZQS {
        zzV("Internal error: sub-class should override method", null, null);
    }

    @Override // com.aspose.words.internal.zzZQR
    public final String zzlf() {
        if (this.zzWLa != 3) {
            throw new IllegalStateException(zzZH9.zzWPF);
        }
        if (this.zzWLf <= 1) {
            zzXMD();
        }
        return this.zzWNc.zzXLp();
    }

    @Override // com.aspose.words.internal.zzZQR
    public final String zzlg() {
        if (this.zzWLa == 3) {
            return this.zzWKL;
        }
        throw new IllegalStateException(zzZH9.zzWPF);
    }

    @Override // com.aspose.words.internal.zzZQR
    public final int zzlh() {
        int i = this.zzWLa;
        if (i == 1 || i == 2) {
            return this.zzWLi.zzXMr();
        }
        throw new IllegalStateException(zzZH9.zzWPG);
    }

    @Override // com.aspose.words.internal.zzZQR
    public final boolean zzli() {
        return this.zzWLa == 1;
    }

    @Override // com.aspose.words.internal.zzZEV
    public final zzZQY zzlj() {
        return zzXMp();
    }

    @Override // com.aspose.words.internal.zzZQR
    public final boolean zzsa() {
        int i = this.zzWLa;
        return i == 1 || i == 2;
    }

    @Override // com.aspose.words.internal.zzZER
    public final void zzxW(String str) throws zzZQS {
        zzV(this.zzWLn == 1 ? zzZH9.zzWPr : zzZH9.zzWPs, str, null);
    }

    private void zzY(String str, char c, boolean z) throws zzZQS {
        char cZzxE;
        int i = 0;
        while (true) {
            int i2 = this.zzWMi;
            if (i2 >= this.zzWMh) {
                zzZER.zzY("Text size", this.zzWML.zzXPx(), i);
                cZzxE = zzxE(str);
            } else {
                char[] cArr = this.zzWLX;
                this.zzWMi = i2 + 1;
                cZzxE = cArr[i2];
            }
            if (cZzxE < ' ') {
                if (cZzxE == '\n' || cZzxE == '\r') {
                    zzXc(cZzxE);
                } else if (cZzxE != '\t') {
                    zzgs(cZzxE);
                }
            } else if (cZzxE == c) {
                char cZzxF = zzxF(str);
                if (cZzxF == c) {
                    cZzxF = zzxF(str);
                    if (cZzxF == '>') {
                        return;
                    }
                    if (z) {
                        zzV("String '--' not allowed in comment (missing '>'?)", null, null);
                    }
                    while (cZzxF == c) {
                        int i3 = this.zzWMi;
                        if (i3 < this.zzWMh) {
                            char[] cArr2 = this.zzWLX;
                            this.zzWMi = i3 + 1;
                            cZzxF = cArr2[i3];
                        } else {
                            cZzxF = zzxE(str);
                        }
                    }
                    if (cZzxF == '>') {
                        return;
                    }
                }
                if (cZzxF < ' ') {
                    if (cZzxF == '\n' || cZzxF == '\r') {
                        zzXc(cZzxF);
                    } else if (cZzxF != '\t') {
                        zzgs(cZzxF);
                    }
                }
            }
            i++;
        }
    }

    @Override // com.aspose.words.internal.zzZQR
    public final String getAttributeValue(String str, String str2) {
        if (this.zzWLa == 1) {
            return this.zzWLh.getValue(str, str2);
        }
        throw new IllegalStateException(zzZH9.zzWPH);
    }

    @Override // com.aspose.words.internal.zzZQR
    public final String getNamespaceURI(int i) {
        int i2 = this.zzWLa;
        if (i2 != 1 && i2 != 2) {
            throw new IllegalStateException(zzZH9.zzWPG);
        }
        String strZzgt = this.zzWLi.zzgt(i);
        return strZzgt == null ? "" : strZzgt;
    }

    @Override // com.aspose.words.internal.zzZQR
    public final String getNamespaceURI(String str) {
        int i = this.zzWLa;
        if (i != 1 && i != 2) {
            throw new IllegalStateException(zzZH9.zzWPG);
        }
        return this.zzWLi.getNamespaceURI(str);
    }

    private void zzY(zzZDU zzzdu) throws zzZQS {
        char c;
        char cZzxE;
        char[] cArr = this.zzWLX;
        int i = this.zzWMh;
        int i2 = this.zzWMi;
        char[] cArrZzXLk = zzzdu.zzXLk();
        int iZzXLj = zzzdu.zzXLj();
        while (true) {
            if (i2 >= i) {
                zzxA(" in processing instruction");
                cArr = this.zzWLX;
                i2 = this.zzWMi;
                i = this.zzWMh;
            }
            int i3 = i2 + 1;
            char c2 = cArr[i2];
            int i4 = 0;
            if (c2 < ' ') {
                if (c2 == '\n') {
                    zzgr(i3);
                } else if (c2 == '\r') {
                    this.zzWMi = i3;
                    if (zzXc(c2)) {
                        if (!this.zzWKF) {
                            if (iZzXLj >= cArrZzXLk.length) {
                                cArrZzXLk = this.zzWNc.zzXLi();
                                iZzXLj = 0;
                            }
                            cArrZzXLk[iZzXLj] = c2;
                            iZzXLj++;
                        }
                    } else {
                        if (this.zzWKF) {
                        }
                        c = c2;
                        i2 = this.zzWMi;
                        cArr = this.zzWLX;
                        i = this.zzWMh;
                    }
                    c2 = '\n';
                    c = c2;
                    i2 = this.zzWMi;
                    cArr = this.zzWLX;
                    i = this.zzWMh;
                } else if (c2 != '\t') {
                    zzgs(c2);
                }
                c = c2;
                i2 = i3;
            } else {
                c = '?';
                if (c2 == '?') {
                    this.zzWMi = i3;
                    while (true) {
                        int i5 = this.zzWMi;
                        if (i5 < this.zzWMh) {
                            char[] cArr2 = this.zzWLX;
                            this.zzWMi = i5 + 1;
                            cZzxE = cArr2[i5];
                        } else {
                            cZzxE = zzxE(" in processing instruction");
                        }
                        if (cZzxE == '>') {
                            zzzdu.zzge(iZzXLj);
                            return;
                        }
                        if (cZzxE == '?') {
                            if (iZzXLj >= cArrZzXLk.length) {
                                cArrZzXLk = zzzdu.zzXLi();
                                iZzXLj = 0;
                            }
                            cArrZzXLk[iZzXLj] = cZzxE;
                            iZzXLj++;
                        } else {
                            int i6 = this.zzWMi - 1;
                            this.zzWMi = i6;
                            i2 = i6;
                            cArr = this.zzWLX;
                            i = this.zzWMh;
                            break;
                        }
                    }
                } else {
                    c = c2;
                    i2 = i3;
                }
            }
            if (iZzXLj >= cArrZzXLk.length) {
                cArrZzXLk = zzzdu.zzXLi();
            } else {
                i4 = iZzXLj;
            }
            iZzXLj = i4 + 1;
            cArrZzXLk[i4] = c;
        }
    }

    private void zzX(zzZF1 zzzf1) throws zzZQS {
        zzV("Improper GE/element nesting: entity &" + zzzf1.zzXN6() + " contains closing tag for <" + (this.zzWLi.isEmpty() ? "[ROOT]" : this.zzWLi.zzXMs()) + ">", null, null);
    }

    private final int zzJ(char c, int i) throws zzZQS {
        int i2 = this.zzWMh;
        char[] cArr = this.zzWLX;
        int i3 = i - 1;
        int i4 = i + 1;
        char c2 = cArr[i];
        if (c2 == ' ' || c2 == '\t') {
            int i5 = (c2 != ' ' ? 8 : 32) + i4;
            if (i5 > i2) {
                i5 = i2;
            }
            while (true) {
                if (i4 >= i5) {
                    break;
                }
                int i6 = i4 + 1;
                char c3 = cArr[i4];
                if (c3 == c2) {
                    i4 = i6;
                } else if (c3 != '<') {
                    i4 = i6;
                } else {
                    i4 = i6;
                }
            }
        } else if (c2 == '<') {
            if (i4 < i2 && cArr[i4] != '!') {
                int i7 = i4 - 1;
                this.zzWMi = i7;
                this.zzWNc.zzR((i7 - i3) - 1, c2);
                int i8 = this.zzWL6;
                if (i8 < 40) {
                    this.zzWL6 = i8 + 16;
                }
                this.zzWL8 = 1;
                return -1;
            }
        }
        int i9 = i4 - 1;
        this.zzWL6--;
        if (c == '\r') {
            cArr[i3] = '\n';
        }
        return i9;
    }

    private void zzZ(String str, char c, zzZDU zzzdu) throws zzZQS {
        char cZzxF;
        if (c != '\"' && c != '\'') {
            zzd(c, " in xml declaration; waited ' or \" to start a value for pseudo-attribute '" + str + "'");
        }
        char[] cArrZzXLk = zzzdu.zzXLk();
        int i = 0;
        while (true) {
            int i2 = this.zzWMi;
            if (i2 < this.zzWMh) {
                char[] cArr = this.zzWLX;
                this.zzWMi = i2 + 1;
                cZzxF = cArr[i2];
            } else {
                cZzxF = zzxF(" in xml declaration");
            }
            if (cZzxF != c) {
                if (cZzxF < ' ' || cZzxF == '<') {
                    zzd(cZzxF, " in xml declaration");
                } else if (cZzxF == 0) {
                    zzXMn();
                }
                if (i >= cArrZzXLk.length) {
                    cArrZzXLk = zzzdu.zzXLi();
                    i = 0;
                }
                cArrZzXLk[i] = cZzxF;
                i++;
            } else {
                zzzdu.zzge(i);
                return;
            }
        }
    }

    @Override // com.aspose.words.internal.zzZER
    public final zzZG3 zzI(String str, Object obj) throws zzZQS {
        Map<String, zzZG3> map;
        zzZG3 zzzg3Zzy5 = this.zzWML.zzy5(str);
        if (zzzg3Zzy5 == null && (map = this.zzWNX) != null) {
            zzzg3Zzy5 = map.get(str);
        }
        if (this.zzWLn == 1 && zzzg3Zzy5 != null && zzzg3Zzy5.zzXNL()) {
            zzV(zzZH9.zzWPt, zzzg3Zzy5.getName(), null);
        }
        return zzzg3Zzy5;
    }

    private void zzZ(zzZDU zzzdu) throws zzZQS {
        char cZzxE;
        char c;
        char[] cArrZzXLk = zzzdu.zzXLk();
        int iZzXLj = zzzdu.zzXLj();
        int length = cArrZzXLk.length;
        while (true) {
            int i = this.zzWMi;
            if (i < this.zzWMh) {
                char[] cArr = this.zzWLX;
                this.zzWMi = i + 1;
                cZzxE = cArr[i];
            } else {
                cZzxE = zzxE(" in comment");
            }
            int i2 = 0;
            if (cZzxE < ' ') {
                c = '\n';
                if (cZzxE == '\n') {
                    zzXMj();
                } else if (cZzxE == '\r') {
                    if (zzXc(cZzxE)) {
                        if (!this.zzWKF) {
                            if (iZzXLj >= length) {
                                cArrZzXLk = this.zzWNc.zzXLi();
                                length = cArrZzXLk.length;
                                iZzXLj = 0;
                            }
                            cArrZzXLk[iZzXLj] = cZzxE;
                            iZzXLj++;
                        }
                    } else if (this.zzWKF) {
                    }
                    cZzxE = c;
                } else if (cZzxE != '\t') {
                    zzgs(cZzxE);
                }
            } else {
                c = '-';
                if (cZzxE == '-') {
                    if (zzxE(" in comment") == '-') {
                        break;
                    }
                    this.zzWMi--;
                    cZzxE = c;
                }
            }
            if (iZzXLj >= length) {
                char[] cArrZzXLi = this.zzWNc.zzXLi();
                int length2 = cArrZzXLi.length;
                zzZER.zzY("Text size", this.zzWML.zzXPx(), this.zzWNc.size());
                length = length2;
                cArrZzXLk = cArrZzXLi;
            } else {
                i2 = iZzXLj;
            }
            iZzXLj = i2 + 1;
            cArrZzXLk[i2] = cZzxE;
        }
        if (zzxE(" in comment") != '>') {
            zzV(zzZH9.zzWPz, null, null);
        }
        this.zzWNc.zzge(iZzXLj);
    }

    @Override // com.aspose.words.internal.zzZER
    public final void zzY(zzZF1 zzzf1) throws zzZQS {
        zzV("Unexpected end of entity expansion for entity &{0}; was expecting a close tag for element <{1}>", zzzf1.zzXN6(), this.zzWLi.isEmpty() ? "[ROOT]" : this.zzWLi.zzXMs());
    }

    private final char[] zzZ(int i, char[] cArr, int i2) {
        zzZDU zzzdu = this.zzWNc;
        zzzdu.zzge(cArr.length);
        if (zzzdu.size() >= i2) {
            this.zzWMi = i;
            return null;
        }
        return zzzdu.zzXLi();
    }
}

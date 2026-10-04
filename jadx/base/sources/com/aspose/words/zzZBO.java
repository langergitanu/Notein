package com.aspose.words;

import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes6.dex */
final class zzZBO {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("gt", "gte", TranslateLanguage.LITHUANIAN, "lte");
    private zzY4Z zzYjK;
    private com.aspose.words.internal.zzZOM zzYjL;

    private void advance() throws Exception {
        this.zzYjK = zzYWu();
    }

    private String zzYL(char c) throws Exception {
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        while (true) {
            int iZzCR = this.zzYjL.zzCR();
            if (!com.aspose.words.internal.zzZYD.isLetterOrDigit(iZzCR) && iZzCR != 46) {
                return sb.toString();
            }
            sb.append((char) iZzCR);
            this.zzYjL.read();
        }
    }

    private String zzYM(char c) throws Exception {
        StringBuilder sb = new StringBuilder();
        sb.append(zzo(c));
        while (true) {
            int iZzCR = this.zzYjL.zzCR();
            if (!com.aspose.words.internal.zzZYD.isLetterOrDigit(iZzCR)) {
                return sb.toString();
            }
            sb.append(zzo((char) iZzCR));
            this.zzYjL.read();
        }
    }

    private String zzYN(char c) throws Exception {
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        while (true) {
            int iZzCR = this.zzYjL.zzCR();
            if (!com.aspose.words.internal.zzZYD.zzZ1(iZzCR)) {
                return sb.toString();
            }
            sb.append((char) iZzCR);
            this.zzYjL.read();
        }
    }

    private zzTN zzYWA() throws Exception {
        zzTN zztnZzYWz = zzYWz();
        if (zztnZzYWz == null) {
            return null;
        }
        while (this.zzYjK.zzYb() == 7) {
            advance();
            zzTN zztnZzYWz2 = zzYWz();
            if (zztnZzYWz2 == null) {
                return null;
            }
            zztnZzYWz = new zzYNM(zztnZzYWz, zztnZzYWz2);
        }
        if (this.zzYjK.zzYb() == 0 || this.zzYjK.zzYb() == 4) {
            return zztnZzYWz;
        }
        return null;
    }

    private zzY4Z zzYWu() throws Exception {
        int i = this.zzYjL.read();
        return i != -1 ? i != 33 ? i != 38 ? i != 124 ? i != 40 ? i != 41 ? com.aspose.words.internal.zzZYD.zzZ1(i) ? new zzY4Z(2, zzYN((char) i)) : com.aspose.words.internal.zzZYD.isLetter(i) ? new zzY4Z(8, zzYM((char) i)) : com.aspose.words.internal.zzZYD.isDigit(i) ? new zzY4Z(9, zzYL((char) i)) : new zzY4Z(1, "") : new zzY4Z(4, ")") : new zzY4Z(3, "(") : new zzY4Z(7, "|") : new zzY4Z(6, "&") : new zzY4Z(5, "!") : new zzY4Z(0, "");
    }

    private zzTN zzYWv() throws Exception {
        if (TelemetryEventStrings.Value.TRUE.equals(this.zzYjK.getText()) || TelemetryEventStrings.Value.FALSE.equals(this.zzYjK.getText())) {
            boolean zEquals = TelemetryEventStrings.Value.TRUE.equals(this.zzYjK.getText());
            advance();
            zzZUY();
            return new zzY1(zEquals);
        }
        int iZzTP = zzUR.zzTP(this.zzYjK.getText());
        int i = 1;
        if (iZzTP != 0) {
            if (iZzTP != 1) {
                i = 3;
                if (iZzTP != 2) {
                    i = iZzTP != 3 ? 0 : 4;
                }
            } else {
                i = 2;
            }
        }
        if (i != 0) {
            advance();
            zzZUY();
        }
        zzY3E zzy3eZzzZ = null;
        if (this.zzYjK.zzYb() != 8) {
            return null;
        }
        String text = this.zzYjK.getText();
        advance();
        zzZUY();
        if (this.zzYjK.zzYb() == 9) {
            zzy3eZzzZ = zzY3E.zzzZ(this.zzYjK.getText());
            advance();
        } else if (i != 0) {
            return null;
        }
        zzZUY();
        return new zzU3(i, text, zzy3eZzzZ);
    }

    private zzTN zzYWw() throws Exception {
        advance();
        zzZUY();
        int iZzYb = this.zzYjK.zzYb();
        zzTN zztnZzYWv = iZzYb != 3 ? iZzYb != 8 ? null : zzYWv() : zzYWx();
        if (zztnZzYWv == null) {
            return null;
        }
        return new zzYVT(zztnZzYWv);
    }

    private zzTN zzYWx() throws Exception {
        advance();
        zzTN zztnZzYWA = zzYWA();
        if (zztnZzYWA == null || this.zzYjK.zzYb() != 4) {
            return null;
        }
        advance();
        zzZUY();
        return zztnZzYWA;
    }

    private zzTN zzYWy() throws Exception {
        zzZUY();
        int iZzYb = this.zzYjK.zzYb();
        if (iZzYb == 3) {
            return zzYWx();
        }
        if (iZzYb == 5) {
            return zzYWw();
        }
        if (iZzYb != 8) {
            return null;
        }
        return zzYWv();
    }

    private zzTN zzYWz() throws Exception {
        zzTN zztnZzYWy = zzYWy();
        if (zztnZzYWy == null) {
            return null;
        }
        while (this.zzYjK.zzYb() == 6) {
            advance();
            zzTN zztnZzYWy2 = zzYWy();
            if (zztnZzYWy2 == null) {
                return null;
            }
            zztnZzYWy = new zzN(zztnZzYWy, zztnZzYWy2);
        }
        if (this.zzYjK.zzYb() == 0 || this.zzYjK.zzYb() == 4 || this.zzYjK.zzYb() == 7) {
            return zztnZzYWy;
        }
        return null;
    }

    private void zzZUY() throws Exception {
        if (this.zzYjK.zzYb() == 2) {
            advance();
        }
    }

    private static char zzo(char c) {
        return (c < 'A' || c > 'Z') ? c : (char) (c + ControlChar.SPACE_CHAR);
    }

    public final zzTN zzSO(String str) throws Exception {
        com.aspose.words.internal.zzZOM zzzom = new com.aspose.words.internal.zzZOM(str);
        this.zzYjL = zzzom;
        try {
            advance();
            zzTN zztnZzYWA = zzYWA();
            if (this.zzYjK.zzYb() != 0) {
                zztnZzYWA = null;
            }
            zzzom.close();
            this.zzYjL = null;
            return zztnZzYWA;
        } catch (Throwable th) {
            zzzom.close();
            throw th;
        }
    }
}

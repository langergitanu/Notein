package com.aspose.words.internal;

import com.aspose.words.ref.Ref;
import com.aspose.words.ref.RefInt;
import com.aspose.words.ref.RefLong;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: loaded from: classes5.dex */
final class zzC6 extends zzCF implements zzGK {
    private zzZOK zzNP;
    private zzHF zztp;
    private zzZYM zztq;
    private boolean zzts;
    private int zztu;
    private int zztv;
    private int zztw;
    private char[] zztx;
    private zzC7 zztr = new zzC7();
    private int zztt = 1;

    public zzC6(zzZOK zzzok) {
        this.zzNP = zzzok;
    }

    private Object zzBT() {
        return zzF(0, zzYz("NaN"));
    }

    private Object zzBU() {
        return zzG(0, zzYz("Infinity"));
    }

    private Object zzBV() {
        return zzH(0, zzYz("-Infinity"));
    }

    private void zzBW() {
        if (!zzYz(TelemetryEventStrings.Value.FALSE)) {
            throw zzCE.zzZ(this, "Error parsing boolean value.");
        }
        zzY(10, Boolean.FALSE);
    }

    private void zzBX() {
        if (!zzYz("undefined")) {
            throw zzCE.zzZ(this, "Error parsing undefined value.");
        }
        zzVu(12);
    }

    private void zzBY() {
        if (!zzYz(CloudMetaExtra.DEFINE_NON_PARENT_ID)) {
            throw zzCE.zzZ(this, "Error parsing null value.");
        }
        zzVu(11);
    }

    private void zzBZ() {
        if (!zzYz(TelemetryEventStrings.Value.TRUE)) {
            throw zzCE.zzZ(this, "Error parsing boolean value.");
        }
        zzY(10, Boolean.TRUE);
    }

    private void zzC0() {
        zzCd();
        char[] cArr = this.zztx;
        int i = this.zztv;
        char c = cArr[i];
        zzCa();
        zzY(0, c, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0063, code lost:
    
        r1 = new com.aspose.words.internal.zzZYM(r7.zztx, r0, r2 - r0);
        r7.zztq = r1;
        r0 = r1.toString();
        zzC2();
        r1 = r7.zztx;
        r2 = r7.zztv;
        r1 = r1[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
    
        if (r1 != '(') goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007c, code lost:
    
        r7.zztv = r2 + 1;
        zzC9();
        zzY(3, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0097, code lost:
    
        throw com.aspose.words.internal.zzCE.zzZ(r7, com.aspose.words.internal.zzZKN.format("Unexpected character while parsing constructor: {0}.", java.lang.Character.valueOf(r1)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzC1() {
        if (!zzYz("new")) {
            throw zzCE.zzZ(this, "Unexpected content while parsing JSON.");
        }
        zzC2();
        int i = this.zztv;
        while (true) {
            char[] cArr = this.zztx;
            int i2 = this.zztv;
            char c = cArr[i2];
            if (c == 0) {
                if (this.zztw != i2) {
                    this.zztv = i2 + 1;
                    break;
                } else if (zzX(true, 0) == 0) {
                    throw zzCE.zzZ(this, "Unexpected end while parsing constructor.");
                }
            } else if (Character.isLetterOrDigit(c)) {
                this.zztv++;
            } else if (c == '\r') {
                i2 = this.zztv;
                zzZV(true);
            } else if (c == '\n') {
                i2 = this.zztv;
                zzC3();
            } else if (zzZKU.zzG(c)) {
                i2 = this.zztv;
                this.zztv = i2 + 1;
            } else {
                if (c != '(') {
                    throw zzCE.zzZ(this, zzZKN.format("Unexpected character while parsing constructor: {0}.", Character.valueOf(c)));
                }
                i2 = this.zztv;
            }
        }
    }

    private void zzC2() {
        while (true) {
            char[] cArr = this.zztx;
            int i = this.zztv;
            char c = cArr[i];
            if (c != 0) {
                if (c == '\n') {
                    zzC3();
                } else if (c == '\r') {
                    zzZV(false);
                } else if (c != ' ' && !zzZKU.zzG(c)) {
                    return;
                } else {
                    this.zztv++;
                }
            } else if (this.zztw != i) {
                this.zztv = i + 1;
            } else if (zzX(false, 0) == 0) {
                return;
            }
        }
    }

    private void zzC3() {
        int i = this.zztv + 1;
        this.zztv = i;
        zzVq(i);
    }

    private boolean zzC4() {
        while (true) {
            char[] cArr = this.zztx;
            int i = this.zztv;
            char c = cArr[i];
            switch (c) {
                case 0:
                    if (this.zztw != i) {
                        this.zztv = i + 1;
                    } else {
                        if (zzX(false, 0) == 0) {
                            return false;
                        }
                    }
                    break;
                case '\t':
                case ' ':
                    this.zztv = i + 1;
                    break;
                case '\n':
                    zzC3();
                    break;
                case '\r':
                    zzZV(false);
                    break;
                case '\"':
                case '\'':
                    zzv(c);
                    return true;
                case ')':
                    this.zztv = i + 1;
                    zzVu(15);
                    return true;
                case ',':
                    zzVu(12);
                    return true;
                case '-':
                    if (zzJ(1, true) && this.zztx[this.zztv + 1] == 'I') {
                        zzBV();
                    } else {
                        zzC0();
                    }
                    return true;
                case '/':
                    zzZU(true);
                    return true;
                case 'I':
                    zzBU();
                    return true;
                case 'N':
                    zzBT();
                    return true;
                case '[':
                    this.zztv = i + 1;
                    zzVu(2);
                    return true;
                case ']':
                    this.zztv = i + 1;
                    zzVu(14);
                    return true;
                case 'f':
                    zzBW();
                    return true;
                case 'n':
                    if (!zzJ(1, true)) {
                        this.zztv++;
                        throw zzCE.zzZ(this, "Unexpected end when reading JSON.");
                    }
                    char[] cArr2 = this.zztx;
                    int i2 = this.zztv;
                    char c2 = cArr2[i2 + 1];
                    if (c2 == 'u') {
                        zzBY();
                    } else {
                        if (c2 != 'e') {
                            throw zzu(cArr2[i2]);
                        }
                        zzC1();
                    }
                    return true;
                case 't':
                    zzBZ();
                    return true;
                case 'u':
                    zzBX();
                    return true;
                case '{':
                    this.zztv = i + 1;
                    zzVu(1);
                    return true;
                default:
                    if (!zzZKU.zzG(c)) {
                        if (!Character.isDigit(c) && c != '-' && c != '.') {
                            throw zzu(c);
                        }
                        zzC0();
                        return true;
                    }
                    this.zztv++;
                    break;
                    break;
            }
        }
    }

    private void zzC5() {
        int i = this.zztv;
        while (true) {
            char[] cArr = this.zztx;
            int i2 = this.zztv;
            char c = cArr[i2];
            if (c == 0) {
                if (this.zztw != i2) {
                    this.zztq = new zzZYM(cArr, i, i2 - i);
                    return;
                } else if (zzX(true, 0) == 0) {
                    throw zzCE.zzZ(this, "Unexpected end while parsing unquoted property name.");
                }
            } else if (zzW(c, i)) {
                return;
            }
        }
    }

    private boolean zzC6() {
        char[] cArr = this.zztx;
        int i = this.zztv;
        char c = cArr[i];
        if (c == '\"' || c == '\'') {
            this.zztv = i + 1;
            zzCd();
            zzt(c);
        } else {
            if (!zzs(c)) {
                throw zzCE.zzZ(this, zzZKN.format("Invalid property identifier character: {0}.", Character.valueOf(this.zztx[this.zztv])));
            }
            zzCd();
            zzC5();
            c = 0;
        }
        String string = this.zztq.toString();
        zzC2();
        char[] cArr2 = this.zztx;
        int i2 = this.zztv;
        char c2 = cArr2[i2];
        if (c2 != ':') {
            throw zzCE.zzZ(this, zzZKN.format("Invalid character after parsing property name. Expected ':' but got: {0}.", Character.valueOf(c2)));
        }
        this.zztv = i2 + 1;
        zzY(4, string);
        this.zztS = c;
        zzC9();
        return true;
    }

    private boolean zzC7() {
        while (true) {
            char[] cArr = this.zztx;
            int i = this.zztv;
            char c = cArr[i];
            if (c != 0) {
                if (c != '\r') {
                    if (c != ' ') {
                        if (c == '/') {
                            zzZU(true);
                            return true;
                        }
                        if (c == '}') {
                            zzVu(13);
                            this.zztv++;
                            return true;
                        }
                        if (c != '\t') {
                            if (c == '\n') {
                                zzC3();
                            } else {
                                if (!zzZKU.zzG(c)) {
                                    return zzC6();
                                }
                                this.zztv++;
                            }
                        }
                    }
                    this.zztv = i + 1;
                } else {
                    zzZV(false);
                }
            } else if (this.zztw != i) {
                this.zztv = i + 1;
            } else if (zzX(false, 0) == 0) {
                return false;
            }
        }
    }

    private boolean zzC8() {
        while (true) {
            char[] cArr = this.zztx;
            int i = this.zztv;
            char c = cArr[i];
            if (c != 0) {
                if (c != '\r') {
                    if (c != ' ') {
                        if (c == ')') {
                            this.zztv = i + 1;
                            zzVu(15);
                            return true;
                        }
                        if (c == ',') {
                            this.zztv = i + 1;
                            zzCp();
                            return false;
                        }
                        if (c == '/') {
                            zzZU(true);
                            return true;
                        }
                        if (c == ']') {
                            this.zztv = i + 1;
                            zzVu(14);
                            return true;
                        }
                        if (c == '}') {
                            this.zztv = i + 1;
                            zzVu(13);
                            return true;
                        }
                        if (c != '\t') {
                            if (c == '\n') {
                                zzC3();
                            } else {
                                if (!zzZKU.zzG(c)) {
                                    if (!zzCv() || getDepth() != 0) {
                                        throw zzCE.zzZ(this, zzZKN.format("After parsing a value an unexpected character was encountered: {0}.", Character.valueOf(c)));
                                    }
                                    zzCp();
                                    return false;
                                }
                                this.zztv++;
                            }
                        }
                    }
                    this.zztv = i + 1;
                } else {
                    zzZV(false);
                }
            } else if (this.zztw != i) {
                this.zztv = i + 1;
            } else if (zzX(false, 0) == 0) {
                this.zztR = 12;
                return false;
            }
        }
    }

    private void zzC9() {
        this.zztr.zzCh();
        this.zztq = new zzZYM();
    }

    private void zzCa() {
        int i = this.zztv;
        while (true) {
            char c = this.zztx[i];
            if (c == 0) {
                this.zztv = i;
                if (this.zztw != i || zzX(true, 0) == 0) {
                    return;
                }
            } else if (zzX(c, i)) {
                return;
            } else {
                i++;
            }
        }
    }

    private char zzCb() {
        return zzZW(zzJ(4, true));
    }

    private void zzCc() {
        if (this.zztx == null) {
            char[] cArrZzZ = zzXG.zzZ(this.zztp, 1024);
            this.zztx = cArrZzZ;
            cArrZzZ[0] = 0;
        }
    }

    private void zzCd() {
        char[] cArr = this.zztx;
        int length = cArr.length;
        int i = this.zztv;
        if (length - i <= ((double) length) * 0.1d || length >= 1073741823) {
            int i2 = this.zztw - i;
            if (i2 > 0) {
                zzZ(cArr, i, cArr, i2);
            }
            this.zztu -= this.zztv;
            this.zztv = 0;
            this.zztw = i2;
            this.zztx[i2] = 0;
        }
    }

    private void zzCe() {
        if (this.zztr.isEmpty()) {
            this.zztr = new zzC7(this.zztp);
        }
    }

    private Object zzF(int i, boolean z) {
        if (!z) {
            throw zzCE.zzZ(this, "Error parsing NaN value.");
        }
        zzY(8, Double.valueOf(Double.NaN));
        return Double.valueOf(Double.NaN);
    }

    private Object zzG(int i, boolean z) {
        if (!z) {
            throw zzCE.zzZ(this, "Error parsing Infinity value.");
        }
        zzY(8, Double.valueOf(Double.POSITIVE_INFINITY));
        return Double.valueOf(Double.POSITIVE_INFINITY);
    }

    private Object zzH(int i, boolean z) {
        if (!z) {
            throw zzCE.zzZ(this, "Error parsing -Infinity value.");
        }
        zzY(8, Double.valueOf(Double.NEGATIVE_INFINITY));
        return Double.valueOf(Double.NEGATIVE_INFINITY);
    }

    private boolean zzI(int i, boolean z) {
        if (this.zzts) {
            return false;
        }
        int i2 = ((this.zztv + i) - this.zztw) + 1;
        int i3 = 0;
        do {
            int iZzX = zzX(z, i2 - i3);
            if (iZzX == 0) {
                break;
            }
            i3 += iZzX;
        } while (i3 < i2);
        return i3 >= i2;
    }

    private boolean zzJ(int i, boolean z) {
        if (this.zztv + i >= this.zztw) {
            return zzI(i, z);
        }
        return true;
    }

    private void zzN(int i, int i2, int i3) {
        if (i2 == i3) {
            this.zztq = new zzZYM(this.zztx, i2, i - i2);
        } else {
            zzCe();
            if (i > i3) {
                this.zztr.zzZ(this.zztp, this.zztx, i3, i - i3);
            }
            this.zztq = new zzZYM(this.zztr.zzCf(), 0, this.zztr.getPosition());
        }
        this.zztv = i + 1;
    }

    private void zzVq(int i) {
        this.zztt++;
        this.zztu = i;
    }

    private boolean zzW(char c, int i) {
        if (zzs(c)) {
            this.zztv++;
            return false;
        }
        if (!zzZKU.zzG(c) && c != ':') {
            throw zzCE.zzZ(this, zzZKN.format("Invalid JavaScript property identifier character: {0}.", Character.valueOf(c)));
        }
        this.zztq = new zzZYM(this.zztx, i, this.zztv - i);
        return true;
    }

    private int zzX(boolean z, int i) {
        try {
            if (this.zzts) {
                return 0;
            }
            zzY(z, i);
            char[] cArr = this.zztx;
            int length = cArr.length;
            int i2 = this.zztw;
            int i3 = this.zzNP.read(cArr, i2, (length - i2) - 1);
            int i4 = this.zztw + i3;
            this.zztw = i4;
            if (i3 == 0) {
                this.zzts = true;
            }
            this.zztx[i4] = 0;
            return i3;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void zzY(char c, int i) {
        zzZZ(true);
        int i2 = this.zztL;
        if (i2 != 0 && i2 == 1) {
            Ref ref = new Ref(null);
            boolean zZzZ = zzR0.zzZ(this.zztq, zzCu(), zzCt(), zzCr(), (Ref<zzZQ9>) ref);
            zzZQ9 zzzq9 = (zzZQ9) ref.get();
            if (zZzZ) {
                zzY(16, (Object) zzzq9, false);
                return;
            }
        }
        zzY(9, (Object) this.zztq.toString(), false);
        this.zztS = c;
    }

    private boolean zzYA(String str) {
        return zzZ(zzJ(str.length() - 1, true), str);
    }

    private boolean zzYz(String str) {
        if (zzYA(str)) {
            return !zzJ(0, false) || zzr(this.zztx[this.zztv]) || this.zztx[this.zztv] == 0;
        }
        return false;
    }

    private static void zzZ(char[] cArr, int i, char[] cArr2, int i2) {
        zzZKV.zzY(cArr, i, cArr2, 0, i2);
    }

    private void zzZU(boolean z) {
        boolean z2;
        this.zztv++;
        if (!zzJ(1, false)) {
            throw zzCE.zzZ(this, "Unexpected end while parsing comment.");
        }
        char[] cArr = this.zztx;
        int i = this.zztv;
        char c = cArr[i];
        if (c == '*') {
            z2 = false;
        } else {
            if (c != '/') {
                throw zzCE.zzZ(this, zzZKN.format("Error parsing comment. Expected: *, got {0}.", Character.valueOf(c)));
            }
            z2 = true;
        }
        int i2 = i + 1;
        this.zztv = i2;
        while (true) {
            char[] cArr2 = this.zztx;
            int i3 = this.zztv;
            char c2 = cArr2[i3];
            if (c2 != 0) {
                if (c2 != '\n') {
                    if (c2 != '\r') {
                        if (c2 != '*') {
                            this.zztv = i3 + 1;
                        } else {
                            this.zztv = i3 + 1;
                            if (!z2 && zzJ(0, true)) {
                                char[] cArr3 = this.zztx;
                                int i4 = this.zztv;
                                if (cArr3[i4] == '/') {
                                    zzZ(true, i2, i4 - 1);
                                    this.zztv++;
                                    return;
                                }
                            }
                        }
                    } else {
                        if (z2) {
                            zzZ(true, i2, i3);
                            return;
                        }
                        zzZV(true);
                    }
                } else {
                    if (z2) {
                        zzZ(true, i2, i3);
                        return;
                    }
                    zzC3();
                }
            } else if (this.zztw != i3) {
                this.zztv = i3 + 1;
            } else if (zzX(true, 0) == 0) {
                if (!z2) {
                    throw zzCE.zzZ(this, "Unexpected end while parsing comment.");
                }
                zzZ(true, i2, this.zztv);
                return;
            }
        }
    }

    private void zzZV(boolean z) {
        this.zztv++;
        zzZX(zzJ(1, z));
    }

    private char zzZW(boolean z) {
        if (!z) {
            throw zzCE.zzZ(this, "Unexpected end while parsing Unicode escape sequence.");
        }
        RefInt refInt = new RefInt(0);
        char[] cArr = this.zztx;
        int i = this.zztv;
        boolean zZzY = zzS9.zzY(cArr, i, i + 4, refInt);
        int i2 = refInt.get();
        if (!zZzY) {
            throw zzCE.zzZ(this, zzZKN.format("Invalid Unicode escape sequence: \\u{0}.", new String(this.zztx, this.zztv, 4)));
        }
        char cZzRq = zzZQB.zzRq(i2);
        this.zztv += 4;
        return cZzRq;
    }

    private void zzZX(boolean z) {
        if (z) {
            char[] cArr = this.zztx;
            int i = this.zztv;
            if (cArr[i] == '\n') {
                this.zztv = i + 1;
            }
        }
        zzVq(this.zztv);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzZZ(int i, int i2) {
        boolean z;
        char cZzCb = zzCb();
        if (Character.isLowSurrogate(cZzCb)) {
            cZzCb = 65533;
        } else if (Character.isHighSurrogate(cZzCb)) {
            do {
                boolean z2 = true;
                z = false;
                if (zzJ(2, true)) {
                    char[] cArr = this.zztx;
                    int i3 = this.zztv;
                    if (cArr[i3] == '\\' && cArr[i3 + 1] == 'u') {
                        this.zztv = i3 + 2;
                        char cZzCb2 = zzCb();
                        if (Character.isLowSurrogate(cZzCb2)) {
                            z2 = false;
                            zzCe();
                            zzZ(cZzCb, i2, i);
                            i2 = this.zztv;
                            cZzCb = cZzCb2;
                            z = z2;
                        } else if (Character.isHighSurrogate(cZzCb2)) {
                            cZzCb = 65533;
                            zzCe();
                            zzZ(cZzCb, i2, i);
                            i2 = this.zztv;
                            cZzCb = cZzCb2;
                            z = z2;
                        } else {
                            cZzCb = 65533;
                            z2 = false;
                            zzCe();
                            zzZ(cZzCb, i2, i);
                            i2 = this.zztv;
                            cZzCb = cZzCb2;
                            z = z2;
                        }
                    } else {
                        cZzCb = 65533;
                    }
                }
            } while (z);
        }
        zzCe();
        zzZ(cZzCb, i2, i);
    }

    private boolean zzr(char c) {
        if (c != '\t' && c != '\n' && c != '\r' && c != ' ') {
            if (c != ')') {
                if (c != ',') {
                    if (c != '/') {
                        if (c == ']' || c == '}' || zzZKU.zzG(c)) {
                            return true;
                        }
                    } else {
                        if (!zzJ(1, false)) {
                            return false;
                        }
                        char c2 = this.zztx[this.zztv + 1];
                        if (c2 != '*' && c2 != '/') {
                            return false;
                        }
                    }
                }
                return true;
            }
            int i = this.zztR;
            if (i == 10 || i == 9) {
            }
            return false;
        }
        return true;
    }

    private static boolean zzs(char c) {
        return Character.isLetterOrDigit(c) || c == '_' || c == '$';
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002b, code lost:
    
        r13.zztv = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        if (zzJ(0, true) == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
    
        r4 = r13.zztx[r4];
        r5 = r1 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        if (r4 == '\"') goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        if (r4 == '\'') goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
    
        if (r4 == '/') goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0041, code lost:
    
        if (r4 == '\\') goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0045, code lost:
    
        if (r4 == 'b') goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0049, code lost:
    
        if (r4 == 'f') goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004d, code lost:
    
        if (r4 == 'n') goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0051, code lost:
    
        if (r4 == 'r') goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0055, code lost:
    
        if (r4 == 't') goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0059, code lost:
    
        if (r4 != 'u') goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005b, code lost:
    
        r13.zztv = r5;
        zzZZ(r1, r2);
        r4 = r13.zztv;
        r3 = 0;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0066, code lost:
    
        r13.zztv = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007c, code lost:
    
        throw com.aspose.words.internal.zzCE.zzZ(r13, com.aspose.words.internal.zzZKN.format("Bad JSON escape sequence: {0}.", OoooooO.C21421OooO0oO.OooO00o("\\", r4)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007d, code lost:
    
        r3 = '\t';
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007f, code lost:
    
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0081, code lost:
    
        r4 = r5;
        r3 = '\r';
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0084, code lost:
    
        r4 = r5;
        r3 = '\n';
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0087, code lost:
    
        r3 = '\f';
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008a, code lost:
    
        r3 = '\b';
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008d, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008f, code lost:
    
        if (r7 != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0091, code lost:
    
        zzCe();
        zzZ(r3, r2, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00aa, code lost:
    
        throw com.aspose.words.internal.zzCE.zzZ(r13, com.aspose.words.internal.zzZKN.format("Unterminated string. Expected delimiter: {0}.", java.lang.Character.valueOf(r14)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzt(char c) {
        int i;
        int i2 = this.zztv;
        this.zztr.zzCh();
        int i3 = i2;
        while (true) {
            int i4 = i3;
            while (true) {
                char[] cArr = this.zztx;
                int i5 = i3 + 1;
                char c2 = cArr[i3];
                boolean z = false;
                if (c2 != 0) {
                    if (c2 == '\n') {
                        this.zztv = i3;
                        zzC3();
                        i3 = this.zztv;
                    } else if (c2 != '\r') {
                        if (c2 != '\"' && c2 != '\'') {
                            char c3 = IOUtils.DIR_SEPARATOR_WINDOWS;
                            if (c2 == '\\') {
                                break;
                            }
                        } else if (cArr[i3] == c) {
                            zzN(i3, i2, i4);
                            return;
                        }
                        i3 = i5;
                    } else {
                        this.zztv = i3;
                        zzZV(true);
                        i3 = this.zztv;
                    }
                } else if (this.zztw != i3) {
                    i3 = i5;
                } else if (zzX(true, 0) == 0) {
                    this.zztv = i3;
                    throw zzCE.zzZ(this, zzZKN.format("Unterminated string. Expected delimiter: {0}.", Character.valueOf(c)));
                }
            }
            i3 = i;
        }
    }

    private zzCE zzu(char c) {
        return zzCE.zzZ(this, zzZKN.format("Unexpected character encountered while parsing value: {0}.", Character.valueOf(c)));
    }

    private void zzv(char c) {
        this.zztv++;
        zzCd();
        zzt(c);
        zzY(c, 0);
    }

    @Override // com.aspose.words.internal.zzCF
    public final void close() {
        zzZOK zzzok;
        try {
            super.close();
            if (this.zztx != null) {
                this.zztx = null;
            }
            if (zzCw() && (zzzok = this.zzNP) != null) {
                zzzok.close();
            }
            this.zztr.zzCg();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.aspose.words.internal.zzGK
    public final int getLineNumber() {
        if (this.zztR == 0 && zzFz() == 0 && zzYb() != 5) {
            return 0;
        }
        return this.zztt;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:217)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:68)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:104)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.aspose.words.internal.zzCF
    public final boolean read() {
        /*
            r3 = this;
            r3.zzCc()
        L3:
            int r0 = r3.zztR
            r1 = 1
            switch(r0) {
                case 0: goto L5f;
                case 1: goto L9;
                case 2: goto L5f;
                case 3: goto L5a;
                case 4: goto L5a;
                case 5: goto L5f;
                case 6: goto L5f;
                case 7: goto L9;
                case 8: goto L53;
                case 9: goto L5f;
                case 10: goto L5f;
                case 11: goto L9;
                case 12: goto L1c;
                default: goto L9;
            }
        L9:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "Unexpected state: {0}."
            java.lang.String r0 = com.aspose.words.internal.zzZKN.format(r1, r0)
            com.aspose.words.internal.zzCE r0 = com.aspose.words.internal.zzCE.zzZ(r3, r0)
            throw r0
        L1c:
            r0 = 0
            boolean r2 = r3.zzJ(r0, r0)
            if (r2 == 0) goto L4f
            r3.zzC2()
            boolean r2 = r3.zzts
            if (r2 == 0) goto L2e
            r3.zzVu(r0)
            return r0
        L2e:
            char[] r0 = r3.zztx
            int r2 = r3.zztv
            char r0 = r0[r2]
            r2 = 47
            if (r0 != r2) goto L3c
            r3.zzZU(r1)
            return r1
        L3c:
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "Additional text encountered after finished reading JSON content: {0}."
            java.lang.String r0 = com.aspose.words.internal.zzZKN.format(r1, r0)
            com.aspose.words.internal.zzCE r0 = com.aspose.words.internal.zzCE.zzZ(r3, r0)
            throw r0
        L4f:
            r3.zzVu(r0)
            return r0
        L53:
            boolean r0 = r3.zzC8()
            if (r0 == 0) goto L3
            return r1
        L5a:
            boolean r0 = r3.zzC7()
            return r0
        L5f:
            boolean r0 = r3.zzC4()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aspose.words.internal.zzC6.read():boolean");
    }

    @Override // com.aspose.words.internal.zzGK
    public final int zzFz() {
        return this.zztv - this.zztu;
    }

    private void zzZ(char c, int i, int i2) {
        if (i2 > i) {
            this.zztr.zzZ(this.zztp, this.zztx, i, i2 - i);
        }
        this.zztr.zzZ(this.zztp, c);
    }

    private void zzZ(boolean z, int i, int i2) {
        if (z) {
            zzY(5, new String(this.zztx, i, i2 - i));
        }
    }

    private boolean zzZ(boolean z, String str) {
        if (z) {
            for (int i = 0; i < str.length(); i++) {
                if (this.zztx[this.zztv + i] != str.charAt(i)) {
                    this.zztv += i;
                    return false;
                }
            }
            this.zztv = str.length() + this.zztv;
            return true;
        }
        this.zztv = this.zztw;
        throw zzCE.zzZ(this, "Unexpected end when reading JSON.");
    }

    private boolean zzX(char c, int i) {
        if (c == '+' || c == 'X' || c == 'x' || c == '-' || c == '.') {
            return false;
        }
        switch (c) {
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                return false;
            default:
                switch (c) {
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                        return false;
                    default:
                        switch (c) {
                            case 'a':
                            case 'b':
                            case 'c':
                            case 'd':
                            case 'e':
                            case 'f':
                                return false;
                            default:
                                this.zztv = i;
                                if (zzZKU.zzG(c) || c == ',' || c == '}' || c == ']' || c == ')' || c == '/') {
                                    return true;
                                }
                                throw zzCE.zzZ(this, zzZKN.format("Unexpected character encountered while parsing number: {0}.", Character.valueOf(c)));
                        }
                }
        }
    }

    private void zzY(boolean z, int i) {
        int i2 = this.zztw;
        int i3 = i2 + i;
        char[] cArr = this.zztx;
        if (i3 >= cArr.length - 1) {
            if (z) {
                int length = cArr.length * 2;
                if (length < 0) {
                    length = Integer.MAX_VALUE;
                }
                char[] cArrZzZ = zzXG.zzZ(this.zztp, Math.max(length, i2 + i + 1));
                char[] cArr2 = this.zztx;
                zzZ(cArr2, 0, cArrZzZ, cArr2.length);
                this.zztx = cArrZzZ;
                return;
            }
            int i4 = this.zztv;
            int i5 = i2 - i4;
            int i6 = i + i5 + 1;
            if (i6 >= cArr.length) {
                char[] cArrZzZ2 = zzXG.zzZ(this.zztp, i6);
                if (i5 > 0) {
                    zzZ(this.zztx, this.zztv, cArrZzZ2, i5);
                }
                this.zztx = cArrZzZ2;
            } else if (i5 > 0) {
                zzZ(cArr, i4, cArr, i5);
            }
            this.zztu -= this.zztv;
            this.zztv = 0;
            this.zztw = i5;
        }
    }

    private zzCE zzX(String str, Exception exc) {
        zzY(12, (Object) null, false);
        return zzCE.zzZ(this, str, exc);
    }

    private void zzY(int i, char c, int i2) {
        Object objValueOf;
        Long lZzZ;
        zzZZ(true);
        this.zztq = new zzZYM(this.zztx, i2, this.zztv - i2);
        boolean z = Character.isDigit(c) && this.zztq.getLength() == 1;
        boolean z2 = (c != '0' || this.zztq.getLength() <= 1 || this.zztq.zzr5()[this.zztq.getStartIndex() + 1] == '.' || this.zztq.zzr5()[this.zztq.getStartIndex() + 1] == 'e' || this.zztq.zzr5()[this.zztq.getStartIndex() + 1] == 'E') ? false : true;
        int i3 = 7;
        if (z) {
            objValueOf = Long.valueOf(((long) c) - 48);
        } else if (z2) {
            String string = this.zztq.toString();
            try {
                if (zzZYD.zzg(string, "0x")) {
                    lZzZ = zzZQB.zzZ(string.substring(2), 16);
                } else {
                    lZzZ = zzZQB.zzZ(string, 8);
                }
                long jLongValue = lZzZ.longValue();
                if (jLongValue > 2147483647L || jLongValue < -2147483648L) {
                    i3 = 17;
                    objValueOf = lZzZ;
                } else {
                    objValueOf = Integer.valueOf((int) jLongValue);
                }
            } catch (Exception e) {
                throw zzX(zzZKN.format("Input string '{0}' is not a valid number.", string), e);
            }
        } else {
            RefLong refLong = new RefLong(0L);
            int iZzZ = zzS9.zzZ(this.zztq.zzr5(), this.zztq.getStartIndex(), this.zztq.getLength(), refLong);
            long j = refLong.get();
            if (iZzZ == 1) {
                if (j <= 2147483647L && j >= -2147483648L) {
                    objValueOf = Integer.valueOf((int) j);
                } else {
                    objValueOf = Long.valueOf(j);
                    i3 = 17;
                }
            } else if (iZzZ != 2) {
                double dZzZs = zzJB.zzZs(this.zztq.toString());
                if (!Double.isNaN(dZzZs) && !Double.isInfinite(dZzZs)) {
                    objValueOf = Double.valueOf(dZzZs);
                    i3 = 8;
                } else {
                    throw zzX(zzZKN.format("Input string '{0}' is not a valid number.", this.zztq.toString()), (Exception) null);
                }
            } else {
                throw zzX(zzZKN.format("JSON integer {0} is too large or small for an Int64.", this.zztq.toString()), (Exception) null);
            }
        }
        zzC9();
        zzY(i3, objValueOf, false);
    }
}

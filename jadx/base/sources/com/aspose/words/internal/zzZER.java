package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import com.aspose.words.ControlChar;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.text.MessageFormat;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZER extends zzZF3 implements zzZEV {
    private static final byte[] zzWLY;
    private static final byte[] zzWLZ;
    protected boolean zzWKE;
    protected boolean zzWKF;
    protected int zzWKG;
    protected int zzWKH;
    protected int zzWKI;
    protected final zzZF1 zzWKJ;
    protected zzZF1 zzWKK;
    protected String zzWKL;
    protected boolean zzWKM;
    protected final boolean zzWKN;
    protected zzZG3 zzWKu;
    protected boolean zzWKv;
    protected Map<String, zzZG1> zzWKw;
    protected final zzZHC zzWML;
    zzZQT zzWQ3;
    final zzZDV zzWQm;
    protected char[] zzWKD = null;
    protected long zzWKC = 0;
    protected int zzWKB = 1;
    protected int zzWKA = 0;
    String zzWKz = null;
    String zzWKy = null;
    protected int zzWKx = 0;

    static {
        byte[] bArr = new byte[256];
        zzWLZ = bArr;
        bArr[95] = 1;
        for (int i = 0; i <= 25; i++) {
            byte[] bArr2 = zzWLZ;
            bArr2[i + 65] = 1;
            bArr2[i + 97] = 1;
        }
        for (int i2 = 192; i2 < 246; i2++) {
            zzWLZ[i2] = 1;
        }
        byte[] bArr3 = zzWLZ;
        bArr3[215] = 0;
        bArr3[247] = 0;
        bArr3[45] = -1;
        bArr3[46] = -1;
        bArr3[183] = -1;
        for (int i3 = 48; i3 <= 57; i3++) {
            zzWLZ[i3] = -1;
        }
        zzWLY = new byte[128];
        for (int i4 = 0; i4 <= 25; i4++) {
            byte[] bArr4 = zzWLY;
            bArr4[i4 + 65] = 1;
            bArr4[i4 + 97] = 1;
        }
        for (int i5 = 48; i5 <= 57; i5++) {
            zzWLY[i5] = 1;
        }
        byte[] bArr5 = zzWLY;
        bArr5[10] = 1;
        bArr5[13] = 1;
        bArr5[32] = 1;
        bArr5[45] = 1;
        bArr5[39] = 1;
        bArr5[40] = 1;
        bArr5[41] = 1;
        bArr5[43] = 1;
        bArr5[44] = 1;
        bArr5[46] = 1;
        bArr5[47] = 1;
        bArr5[58] = 1;
        bArr5[61] = 1;
        bArr5[63] = 1;
        bArr5[59] = 1;
        bArr5[33] = 1;
        bArr5[42] = 1;
        bArr5[35] = 1;
        bArr5[64] = 1;
        bArr5[36] = 1;
        bArr5[95] = 1;
        bArr5[37] = 1;
    }

    public zzZER(zzZF1 zzzf1, zzZHC zzzhc, zzZQT zzzqt) {
        this.zzWQ3 = null;
        this.zzWKK = zzzf1;
        this.zzWKJ = zzzf1;
        this.zzWML = zzzhc;
        this.zzWQm = zzzhc.zzXPS();
        int iZzXPQ = zzzhc.zzXPQ();
        this.zzWKN = (iZzXPQ & 1) != 0;
        this.zzWKM = (iZzXPQ & 4) != 0;
        this.zzWKF = zzzhc.zzXPK();
        this.zzWKE = zzzhc.zzXPJ();
        this.zzWLX = null;
        this.zzWMh = 0;
        this.zzWMi = 0;
        this.zzWQ3 = zzzqt;
        boolean zZzXPI = zzzhc.zzXPI();
        this.zzWKv = zZzXPI;
        if (zZzXPI) {
            this.zzWKw = new HashMap();
        } else {
            this.zzWKw = Collections.EMPTY_MAP;
        }
    }

    public static char[] zzJ(char[] cArr) {
        int length = cArr.length;
        char[] cArr2 = new char[(length >> 1) + length];
        System.arraycopy(cArr, 0, cArr2, 0, length);
        return cArr2;
    }

    private static zzZQS zzS(String str, long j) throws zzZQS {
        return new zzZQS(str + " limit (" + j + ") exceeded");
    }

    private String zzUL(int i, int i2) throws zzZQS {
        int i3 = this.zzWMh - i;
        char[] cArrZzgp = zzgp(i3 + 8);
        if (i3 > 0) {
            System.arraycopy(this.zzWLX, i, cArrZzgp, 0, i3);
        }
        int length = cArrZzgp.length;
        while (true) {
            if (this.zzWMi >= this.zzWMh && !zzXOh()) {
                break;
            }
            char c = this.zzWLX[this.zzWMi];
            if (c != ':') {
                if (c < '-' || !zzXm(c)) {
                    break;
                }
            } else if (this.zzWKN) {
                zzxy(new String(cArrZzgp, 0, i3) + c + zzXMd());
            }
            this.zzWMi++;
            if (i3 >= length) {
                char[] cArrZzJ = zzJ(cArrZzgp);
                this.zzWKD = cArrZzJ;
                cArrZzgp = cArrZzJ;
                length = cArrZzJ.length;
            }
            cArrZzgp[i3] = c;
            i2 = (i2 * 31) + c;
            i3++;
        }
        return this.zzWQm.zzX(cArrZzgp, 0, i3, i2);
    }

    private String zzUM(int i, int i2) throws zzZQS {
        char c;
        int i3 = this.zzWMh - i;
        char[] cArrZzgp = zzgp(i3 + 8);
        if (i3 > 0) {
            System.arraycopy(this.zzWLX, i, cArrZzgp, 0, i3);
        }
        int length = cArrZzgp.length;
        while (true) {
            if ((this.zzWMi >= this.zzWMh && !zzXOh()) || (c = this.zzWLX[this.zzWMi]) < '-' || !zzXm(c)) {
                break;
            }
            this.zzWMi++;
            if (i3 >= length) {
                char[] cArrZzJ = zzJ(cArrZzgp);
                this.zzWKD = cArrZzJ;
                cArrZzgp = cArrZzJ;
                length = cArrZzJ.length;
            }
            cArrZzgp[i3] = c;
            i2 = (i2 * 31) + c;
            i3++;
        }
        return this.zzWQm.zzX(cArrZzgp, 0, i3, i2);
    }

    private void zzXMc() throws zzZQS {
        zzV("Illegal character entity: value higher than max allowed (0x{0})", Integer.toHexString(1114111), null);
    }

    public static void zzXMh() {
        throw new IllegalStateException(zzZH9.zzWPK);
    }

    private zzZFV zzXMo() {
        return new zzZFR("Illegal character (NULL, unicode 0) encountered: not valid in any content", zzXMq(), (char) 0);
    }

    private void zzgo(int i) throws zzZQS {
        zzV("Illegal character entity: expansion character (code 0x{0}", Integer.toHexString(i), null);
    }

    private final void zzgq(int i) throws zzZQS {
        if (i >= 55296) {
            if (i < 57344) {
                zzgo(i);
            }
            if (i > 65535) {
                if (i > 1114111) {
                    zzXMc();
                    return;
                }
                return;
            } else {
                if (i >= 65534) {
                    zzgo(i);
                    return;
                }
                return;
            }
        }
        if (i < 32) {
            if (i == 0) {
                zzV("Invalid character reference: null character not allowed in XML content.", null, null);
            }
            if (this.zzWQ6 || i == 9 || i == 10 || i == 13) {
                return;
            }
            zzgo(i);
        }
    }

    private void zzxG(String str) throws zzZFV {
        if (str == null) {
            str = "";
        }
        throw new zzZFW("Unexpected end of input block".concat(str), zzXMq());
    }

    private zzZFV zzxI(String str) {
        return new zzZFS(str, zzXMq());
    }

    private void zzxx(String str) throws zzZQS {
        zzV("Illegal entity expansion: entity \"{0}\" expands itself recursively.", str, null);
    }

    private void zzxy(String str) throws zzZQS {
        zzV("Illegal name \"{0}\" (PI target, entity/notation name): can not contain a colon (XML Namespaces 1.0#6)", str, null);
    }

    private zzZG3 zzxz(String str) throws zzZQS {
        zzZQT zzzqtZzXPs = this.zzWML.zzXPs();
        if (zzzqtZzXPs != null) {
            if (this.zzWKK.zzxM(str)) {
                zzxx(str);
            }
            zzZF1 zzzf1 = this.zzWKK;
            zzzf1.zzY(this);
            int i = this.zzWKx;
            if (i == 0) {
                i = 256;
            }
            try {
                zzZF1 zzzf1ZzZ = zzZFH.zzZ(zzzf1, str, zzzqtZzXPs, this.zzWML, i);
                if (this.zzWKv) {
                    return new zzZG1(zzZF2.zzXN8(), zzzf1ZzZ.zzXN6(), zzzf1ZzZ.zzXNH(), new char[0], zzZF2.zzXN8());
                }
                if (zzzf1ZzZ != null) {
                    zzZ(zzzf1ZzZ, true, str);
                    return null;
                }
            } catch (IOException e) {
                throw zzY(e);
            }
        }
        zzxW(str);
        return null;
    }

    public abstract zzZG3 zzI(String str, Object obj) throws zzZQS;

    public final char zzO(String str, char c) throws zzZQS {
        while (c <= ' ') {
            if (c == '\n' || c == '\r') {
                zzXc(c);
            } else if (c != ' ' && c != '\t') {
                zzYS((int) c, false);
            }
            if (this.zzWMi >= this.zzWMh) {
                zzxA(str);
            }
            char[] cArr = this.zzWLX;
            int i = this.zzWMi;
            this.zzWMi = i + 1;
            c = cArr[i];
        }
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzOW(boolean z) throws zzZQS {
        int i;
        char cZzxE = zzxE(" in entity reference");
        if (cZzxE == '#') {
            StringBuffer stringBuffer = new StringBuffer("#");
            int iZzZ = zzZ(stringBuffer);
            if (!this.zzWKv) {
                return iZzZ;
            }
            char[] cArr = new char[stringBuffer.length()];
            stringBuffer.getChars(0, stringBuffer.length(), cArr, 0);
            this.zzWKu = zzZ(iZzZ, cArr);
            return 0;
        }
        String strZzX9 = zzX9(cZzxE);
        char cCharAt = strZzX9.charAt(0);
        if (cCharAt == 'a') {
            i = strZzX9.equals("amp") ? 38 : strZzX9.equals("apos") ? 39 : 0;
        } else if (cCharAt == 'g') {
            if (strZzX9.length() == 2 && strZzX9.charAt(1) == 't') {
                i = 62;
            }
        } else if (cCharAt == 'l') {
            if (strZzX9.length() == 2 && strZzX9.charAt(1) == 't') {
                i = 60;
            }
        } else if (cCharAt == 'q' && strZzX9.equals("quot")) {
            i = 34;
        }
        if (i == 0) {
            zzZG3 zzzg3ZzZ = zzZ(strZzX9, z, (Object) null);
            if (this.zzWKv) {
                this.zzWKu = zzzg3ZzZ;
            }
            return 0;
        }
        if (!this.zzWKv) {
            return i;
        }
        char[] cArr2 = new char[strZzX9.length()];
        strZzX9.getChars(0, strZzX9.length(), cArr2, 0);
        this.zzWKu = zzZ(i, cArr2);
        return 0;
    }

    public final int zzOX(boolean z) throws zzZQS {
        int i = this.zzWMh;
        int i2 = this.zzWMi;
        int iZzXMm = i - i2;
        if (iZzXMm < 6) {
            this.zzWMi = i2 - 1;
            if (zzgV(6)) {
                iZzXMm = 6;
            } else {
                iZzXMm = zzXMm();
                if (iZzXMm < 3) {
                    zzxH(" in entity reference");
                }
            }
            this.zzWMi++;
        }
        char[] cArr = this.zzWLX;
        int i3 = this.zzWMi;
        char c = cArr[i3];
        if (c == '#') {
            this.zzWMi = i3 + 1;
            return zzZ(null);
        }
        if (!z) {
            return 0;
        }
        if (c == 'a') {
            char c2 = cArr[i3 + 1];
            if (c2 == 'm') {
                if (iZzXMm < 4 || cArr[i3 + 2] != 'p' || cArr[i3 + 3] != ';') {
                    return 0;
                }
                this.zzWMi = i3 + 4;
                return 38;
            }
            if (c2 != 'p' || iZzXMm < 5 || cArr[i3 + 2] != 'o' || cArr[i3 + 3] != 's' || cArr[i3 + 4] != ';') {
                return 0;
            }
            this.zzWMi = i3 + 5;
            return 39;
        }
        if (c == 'l') {
            if (iZzXMm < 3 || cArr[i3 + 1] != 't' || cArr[i3 + 2] != ';') {
                return 0;
            }
            this.zzWMi = i3 + 3;
            return 60;
        }
        if (c == 'g') {
            if (iZzXMm < 3 || cArr[i3 + 1] != 't' || cArr[i3 + 2] != ';') {
                return 0;
            }
            this.zzWMi = i3 + 3;
            return 62;
        }
        if (c != 'q' || iZzXMm < 5 || cArr[i3 + 1] != 'u' || cArr[i3 + 2] != 'o' || cArr[i3 + 3] != 't' || cArr[i3 + 4] != ';') {
            return 0;
        }
        this.zzWMi = i3 + 5;
        return 34;
    }

    @Override // com.aspose.words.internal.zzZEV
    public final void zzV(String str, Object obj, Object obj2) throws zzZQS {
        if (obj != null || obj2 != null) {
            str = MessageFormat.format(str, obj, obj2);
        }
        throw zzxI(str);
    }

    public final void zzW(String str, Object obj, Object obj2) throws zzZQS {
        zzy4(MessageFormat.format(str, obj, obj2));
    }

    public void zzX(zzYF8 zzyf8) throws zzZQS {
        if (zzyf8.zzXye() > 2) {
            throw zzZFQ.zzZ(zzyf8);
        }
        zzZQU zzzquZzXPv = this.zzWML.zzXPv();
        if (zzzquZzXPv != null) {
            zzZ(zzzquZzXPv, zzyf8);
        } else if (zzyf8.zzXye() >= 2) {
            throw zzZFQ.zzZ(zzyf8);
        }
    }

    public final int zzX8(char c) throws zzZQS {
        char cZzxF;
        int i = 1;
        if (!zzXn(c)) {
            this.zzWMi--;
            return 0;
        }
        while (true) {
            int i2 = this.zzWMi;
            if (i2 < this.zzWMh) {
                char[] cArr = this.zzWLX;
                this.zzWMi = i2 + 1;
                cZzxF = cArr[i2];
            } else {
                cZzxF = zzxF("; expected an identifier");
            }
            if (cZzxF != ':' && !zzXm(cZzxF)) {
                return i;
            }
            i++;
        }
    }

    public final String zzX9(char c) throws zzZQS {
        String strZzXa = zzXa(c);
        if (this.zzWMi >= this.zzWMh && !zzXOh()) {
            zzV("Missing semicolon after reference for entity \"{0}\"", strZzXa, null);
        }
        char[] cArr = this.zzWLX;
        int i = this.zzWMi;
        this.zzWMi = i + 1;
        char c2 = cArr[i];
        if (c2 != ';') {
            zzd(c2, "; expected a semi-colon after the reference for entity '" + strZzXa + "'");
        }
        return strZzXa;
    }

    public final String zzXMd() throws zzZQS {
        char c;
        StringBuilder sb = new StringBuilder(100);
        while (true) {
            int i = this.zzWMi;
            if (i >= this.zzWMh) {
                int iZzXNn = zzXNn();
                if (iZzXNn < 0) {
                    break;
                }
                c = (char) iZzXNn;
            } else {
                char[] cArr = this.zzWLX;
                this.zzWMi = i + 1;
                c = cArr[i];
            }
            if (c != ':' && !zzXm(c)) {
                this.zzWMi--;
                break;
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public final String zzXMe() throws zzZQS {
        if (this.zzWMi >= this.zzWMh) {
            zzXOh();
        }
        char[] cArr = this.zzWLX;
        int i = this.zzWMi;
        this.zzWMi = i + 1;
        return zzXa(cArr[i]);
    }

    public final zzZG3 zzXMf() throws zzZQS {
        int i = this.zzWMh;
        int i2 = this.zzWMi;
        int iZzXMm = i - i2;
        if (iZzXMm < 6) {
            this.zzWMi = i2 - 1;
            if (zzgV(6)) {
                iZzXMm = 6;
            } else {
                iZzXMm = zzXMm();
                if (iZzXMm < 3) {
                    zzxH(" in entity reference");
                }
            }
            this.zzWMi++;
        }
        char[] cArr = this.zzWLX;
        int i3 = this.zzWMi;
        char c = cArr[i3];
        if (c == '#') {
            return null;
        }
        if (c == 'a') {
            char c2 = cArr[i3 + 1];
            if (c2 == 'm') {
                if (iZzXMm >= 4 && cArr[i3 + 2] == 'p' && cArr[i3 + 3] == ';') {
                    return null;
                }
            } else if (c2 == 'p' && iZzXMm >= 5 && cArr[i3 + 2] == 'o' && cArr[i3 + 3] == 's' && cArr[i3 + 4] == ';') {
                return null;
            }
        } else if (c == 'l') {
            if (iZzXMm >= 3 && cArr[i3 + 1] == 't' && cArr[i3 + 2] == ';') {
                return null;
            }
        } else if (c == 'g') {
            if (iZzXMm >= 3 && cArr[i3 + 1] == 't' && cArr[i3 + 2] == ';') {
                return null;
            }
        } else if (c == 'q' && iZzXMm >= 5 && cArr[i3 + 1] == 'u' && cArr[i3 + 2] == 'o' && cArr[i3 + 3] == 't' && cArr[i3 + 4] == ';') {
            return null;
        }
        this.zzWMi = i3 + 1;
        String strZzX9 = zzX9(c);
        this.zzWKL = strZzX9;
        return zzI(strZzX9, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzXMg() throws zzZQS {
        int i;
        int i2;
        int i3;
        int i4;
        char[] cArr = this.zzWLX;
        int i5 = this.zzWMi;
        int i6 = i5 + 1;
        char c = cArr[i5];
        if (c == '#') {
            int i7 = i5 + 2;
            char c2 = cArr[i6];
            int i8 = this.zzWMh;
            if (c2 != 'x') {
                i3 = 0;
                while (c2 != ';') {
                    if (c2 > '9' || c2 < '0') {
                        this.zzWMi = i7;
                        zzd(c2, "; expected a decimal number.");
                    } else {
                        int i9 = (c2 - '0') + (i3 * 10);
                        if (i9 > 1114111) {
                            zzXMc();
                        }
                        i3 = i9;
                    }
                    if (i7 >= i8) {
                        break;
                    }
                    c2 = cArr[i7];
                    i7++;
                }
            } else {
                i3 = 0;
                while (true) {
                    if (i7 >= i8) {
                        break;
                    }
                    int i10 = i7 + 1;
                    char c3 = cArr[i7];
                    if (c3 == ';') {
                        c2 = c3;
                        i7 = i10;
                        break;
                    }
                    i3 <<= 4;
                    if (c3 <= '9' && c3 >= '0') {
                        i4 = c3 - '0';
                    } else if (c3 >= 'a' && c3 <= 'f') {
                        i4 = c3 - 'W';
                    } else if (c3 < 'A' || c3 > 'F') {
                        this.zzWMi = i10;
                        zzd(c3, "; expected a hex digit (0-9a-fA-F).");
                        if (i3 <= 1114111) {
                            zzXMc();
                        }
                        c2 = c3;
                        i7 = i10;
                    } else {
                        i4 = c3 - '7';
                    }
                    i3 = i4 + i3;
                    if (i3 <= 1114111) {
                    }
                    c2 = c3;
                    i7 = i10;
                }
            }
            if (c2 == ';') {
                this.zzWMi = i7;
                zzgq(i3);
                return i3;
            }
        } else if (c == 'a') {
            int i11 = i5 + 2;
            char c4 = cArr[i6];
            if (c4 == 'm') {
                int i12 = i5 + 3;
                if (cArr[i11] == 'p' && i12 < this.zzWMh) {
                    int i13 = i5 + 4;
                    if (cArr[i12] == ';') {
                        this.zzWMi = i13;
                        return 38;
                    }
                }
            } else if (c4 == 'p') {
                int i14 = i5 + 3;
                if (cArr[i11] == 'o' && i14 < (i2 = this.zzWMh)) {
                    int i15 = i5 + 4;
                    if (cArr[i14] == 's' && i15 < i2) {
                        int i16 = i5 + 5;
                        if (cArr[i15] == ';') {
                            this.zzWMi = i16;
                            return 39;
                        }
                    }
                }
            }
        } else if (c == 'g') {
            int i17 = i5 + 2;
            if (cArr[i6] == 't') {
                int i18 = i5 + 3;
                if (cArr[i17] == ';') {
                    this.zzWMi = i18;
                    return 62;
                }
            }
        } else if (c == 'l') {
            int i19 = i5 + 2;
            if (cArr[i6] == 't') {
                int i20 = i5 + 3;
                if (cArr[i19] == ';') {
                    this.zzWMi = i20;
                    return 60;
                }
            }
        } else if (c == 'q') {
            int i21 = i5 + 2;
            if (cArr[i6] == 'u') {
                int i22 = i5 + 3;
                if (cArr[i21] == 'o' && i22 < (i = this.zzWMh)) {
                    int i23 = i5 + 4;
                    if (cArr[i22] == 't' && i23 < i) {
                        int i24 = i5 + 5;
                        if (cArr[i23] == ';') {
                            this.zzWMi = i24;
                            return 34;
                        }
                    }
                }
            }
        }
        return 0;
    }

    public final void zzXMi() throws zzZQS {
        zzZF1 zzzf1ZzXN7 = this.zzWKK;
        while (true) {
            try {
                zzzf1ZzXN7.close();
                if (zzzf1ZzXN7 == this.zzWKJ) {
                    return;
                }
                zzzf1ZzXN7 = zzzf1ZzXN7.zzXN7();
                if (zzzf1ZzXN7 == null) {
                    zzXMh();
                }
                this.zzWKK = zzzf1ZzXN7;
            } catch (IOException e) {
                throw zzY(e);
            }
        }
    }

    public final void zzXMj() {
        this.zzWLV++;
        this.zzWLU = this.zzWMi;
    }

    public final int zzXMk() throws zzZQS {
        if (this.zzWMi >= this.zzWMh && !zzXOi()) {
            return -1;
        }
        char[] cArr = this.zzWLX;
        int i = this.zzWMi;
        this.zzWMi = i + 1;
        char c = cArr[i];
        while (c <= ' ') {
            if (c == '\n' || c == '\r') {
                zzXc(c);
            } else if (c != ' ' && c != '\t') {
                zzYS((int) c, false);
            }
            if (this.zzWMi >= this.zzWMh && !zzXOi()) {
                return -1;
            }
            char[] cArr2 = this.zzWLX;
            int i2 = this.zzWMi;
            this.zzWMi = i2 + 1;
            c = cArr2[i2];
        }
        return c;
    }

    public final int zzXMl() throws zzZQS {
        if (this.zzWMi < this.zzWMh || zzXOh()) {
            return this.zzWLX[this.zzWMi];
        }
        return -1;
    }

    public final int zzXMm() {
        return this.zzWMh - this.zzWMi;
    }

    public final void zzXMn() throws zzZFV {
        throw zzXMo();
    }

    public final zzYFX zzXMp() {
        return this.zzWKK.zzV(this.zzWKC, this.zzWKB, this.zzWKA + 1);
    }

    public final zzZF2 zzXMq() {
        zzZF1 zzzf1 = this.zzWKK;
        long j = this.zzWLW;
        int i = this.zzWMi;
        return zzzf1.zzV((j + ((long) i)) - 1, this.zzWLV, i - this.zzWLU);
    }

    public final URL zzXNH() throws IOException {
        return this.zzWKK.zzXNH();
    }

    public final int zzXNn() throws zzZQS {
        if (this.zzWMi >= this.zzWMh && !zzXOi()) {
            return -1;
        }
        char[] cArr = this.zzWLX;
        int i = this.zzWMi;
        this.zzWMi = i + 1;
        return cArr[i];
    }

    public boolean zzXOh() throws zzZQS {
        long j = this.zzWLW;
        int i = this.zzWMh;
        this.zzWLW = j + ((long) i);
        this.zzWLU -= i;
        zzY("Maximum document characters", this.zzWML.zzXPy(), this.zzWLW);
        try {
            return this.zzWKK.zzW(this) > 0;
        } catch (IOException e) {
            throw zzY(e);
        }
    }

    public boolean zzXOi() throws zzZQS {
        zzZF1 zzzf1 = this.zzWKK;
        while (true) {
            this.zzWLW += (long) this.zzWMh;
            zzY("Maximum document characters", this.zzWML.zzXPy(), this.zzWLW);
            this.zzWLU -= this.zzWMh;
            try {
                if (zzzf1.zzW(this) > 0) {
                    return true;
                }
                zzzf1.close();
                if (zzzf1 == this.zzWKJ) {
                    return false;
                }
                zzZF1 zzzf1ZzXN7 = zzzf1.zzXN7();
                if (zzzf1ZzXN7 == null) {
                    zzXMh();
                }
                if (this.zzWKI != zzzf1.getScopeId()) {
                    zzY(zzzf1);
                }
                this.zzWKK = zzzf1ZzXN7;
                zzzf1ZzXN7.zzX(this);
                this.zzWKH = zzzf1ZzXN7.getScopeId();
                if (!this.zzWKF) {
                    this.zzWKF = !zzzf1ZzXN7.zzXNB();
                }
                if (this.zzWMi < this.zzWMh) {
                    return true;
                }
                zzzf1 = zzzf1ZzXN7;
            } catch (IOException e) {
                throw zzY(e);
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final String zzXa(char c) throws zzZQS {
        if (!zzXn(c)) {
            if (c != ':') {
                if (c <= ' ') {
                    zzd(c, " (missing name?)");
                }
                zzd(c, " (expected a name start character)");
            } else if (this.zzWKN) {
                zzxy(zzXMd());
            }
        }
        int i = this.zzWMi;
        int i2 = this.zzWMh;
        int i3 = i - 1;
        int i4 = c;
        while (i < i2) {
            char c2 = this.zzWLX[i];
            if (c2 == ':') {
                if (this.zzWKN) {
                    this.zzWMi = i;
                    zzxy(new String(this.zzWLX, i3, i - i3) + zzXMd());
                }
            } else if (c2 < '-' || !zzXm(c2)) {
                this.zzWMi = i;
                return this.zzWQm.zzX(this.zzWLX, i3, i - i3, i4);
            }
            i++;
            i4 = (i4 * 31) + c2;
        }
        this.zzWMi = i;
        return zzUL(i3, i4);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final String zzXb(char c) throws zzZQS {
        if (!zzXn(c)) {
            if (c == ':') {
                zzd(c, " (missing namespace prefix?)");
            }
            zzd(c, " (expected a name start character)");
        }
        int i = this.zzWMi;
        int i2 = this.zzWMh;
        int i3 = i - 1;
        char[] cArr = this.zzWLX;
        int i4 = c;
        while (i < i2) {
            char c2 = cArr[i];
            if (c2 < '-' || !zzXm(c2)) {
                this.zzWMi = i;
                return this.zzWQm.zzX(this.zzWLX, i3, i - i3, i4);
            }
            i++;
            i4 = (i4 * 31) + c2;
        }
        this.zzWMi = i;
        return zzUM(i3, i4);
    }

    public final boolean zzXc(char c) throws zzZQS {
        boolean z;
        if (c == '\r' && zzXMl() == 10) {
            this.zzWMi++;
            z = true;
        } else {
            z = false;
        }
        this.zzWLV++;
        this.zzWLU = this.zzWMi;
        return z;
    }

    public abstract void zzY(zzZF1 zzzf1) throws zzZQS;

    public final void zzY(zzZQU zzzqu, String str, String str2, zzZQY zzzqy) throws zzZQS {
        if (zzzqy == null) {
            zzzqy = zzXMq();
        }
        zzZ(zzzqu, new zzYF8(zzzqy, str2, 2, str));
    }

    public final void zzYS(String str, int i) throws zzZQS {
        zzX(new zzYF8(zzXMq(), str, i));
    }

    @Override // com.aspose.words.internal.zzZEV
    public final void zzZ(zzZQY zzzqy, String str, String str2, Object obj, Object obj2) throws zzZQS {
        zzZQU zzzquZzXPv = this.zzWML.zzXPv();
        if (zzzquZzXPv != null) {
            if (obj != null || obj2 != null) {
                str2 = MessageFormat.format(str2, obj, obj2);
            }
            zzY(zzzquZzXPv, str, str2, zzzqy);
        }
    }

    public final zzZFV zzZV(String str, boolean z) throws zzZFV {
        zzZFV zzzfvZzxI = zzxI(str);
        if (z) {
            return zzzfvZzxI;
        }
        throw zzzfvZzxI;
    }

    public final void zzd(int i, String str) throws zzZFV {
        char c = (char) i;
        throw new zzZFR("Unexpected character " + zzZF3.zzXl(c) + str, zzXMq(), c);
    }

    public boolean zzgV(int i) throws zzZQS {
        if (this.zzWMh - this.zzWMi >= i) {
            return true;
        }
        try {
            return this.zzWKK.zzZ(this, i);
        } catch (IOException e) {
            throw zzY(e);
        }
    }

    public final char[] zzgp(int i) {
        char[] cArr = this.zzWKD;
        if (cArr == null) {
            char[] cArr2 = new char[i > 48 ? i + 16 : 64];
            this.zzWKD = cArr2;
            return cArr2;
        }
        if (i < cArr.length) {
            return cArr;
        }
        int length = cArr.length;
        int i2 = length + (length >> 1);
        if (i >= i2) {
            i2 = i + 16;
        }
        char[] cArr3 = new char[i2];
        this.zzWKD = cArr3;
        return cArr3;
    }

    public final void zzgr(int i) {
        this.zzWLV++;
        this.zzWLU = i;
    }

    public final void zzgs(int i) throws zzZFV {
        zzYS(i, false);
    }

    public final boolean zzxA(String str) throws zzZQS {
        if (zzXOh()) {
            return true;
        }
        zzxG(str);
        return true;
    }

    public final boolean zzxB(String str) throws zzZQS {
        if (zzXOi()) {
            return true;
        }
        zzxH(str);
        return true;
    }

    public final char zzxC(String str) throws zzZQS {
        return zzO(str, zzxE(str));
    }

    public final char zzxD(String str) throws zzZQS {
        if (this.zzWMi >= this.zzWMh) {
            zzxB(str);
        }
        char[] cArr = this.zzWLX;
        int i = this.zzWMi;
        this.zzWMi = i + 1;
        char c = cArr[i];
        while (c <= ' ') {
            if (c == '\n' || c == '\r') {
                zzXc(c);
            } else if (c != ' ' && c != '\t') {
                zzYS((int) c, false);
            }
            if (this.zzWMi >= this.zzWMh) {
                zzxB(str);
            }
            char[] cArr2 = this.zzWLX;
            int i2 = this.zzWMi;
            this.zzWMi = i2 + 1;
            c = cArr2[i2];
        }
        return c;
    }

    public final char zzxE(String str) throws zzZQS {
        if (this.zzWMi >= this.zzWMh) {
            zzxA(str);
        }
        char[] cArr = this.zzWLX;
        int i = this.zzWMi;
        this.zzWMi = i + 1;
        return cArr[i];
    }

    public final char zzxF(String str) throws zzZQS {
        if (this.zzWMi >= this.zzWMh) {
            zzxB(str);
        }
        char[] cArr = this.zzWLX;
        int i = this.zzWMi;
        this.zzWMi = i + 1;
        return cArr[i];
    }

    public final void zzxH(String str) throws zzZFV {
        if (str == null) {
            str = "";
        }
        throw new zzZFW("Unexpected EOF".concat(str), zzXMq());
    }

    @Override // com.aspose.words.internal.zzZEV
    public final void zzxJ(String str) throws zzZQS {
        zzV(str, null, null);
    }

    public abstract void zzxW(String str) throws zzZQS;

    @Override // com.aspose.words.internal.zzZEV
    public final void zzy4(String str) throws zzZQS {
        zzX(new zzYF8(zzXMq(), str, 2));
    }

    public final String zzW(char c, String str) throws zzZQS {
        char cZzxF;
        char[] cArrZzgp = zzgp(-1);
        int i = 0;
        boolean z = false;
        while (true) {
            int i2 = this.zzWMi;
            if (i2 < this.zzWMh) {
                char[] cArr = this.zzWLX;
                this.zzWMi = i2 + 1;
                cZzxF = cArr[i2];
            } else {
                cZzxF = zzxF(str);
            }
            if (cZzxF == c) {
                break;
            }
            if (cZzxF == '\n') {
                zzXMj();
            } else if (cZzxF == '\r') {
                if (zzXMl() == 10) {
                    this.zzWMi++;
                }
            } else if (cZzxF != ' ') {
                if (cZzxF >= 128 || zzWLY[cZzxF] != 1) {
                    zzd(cZzxF, " in public identifier");
                }
                if (i >= cArrZzgp.length) {
                    cArrZzgp = zzJ(cArrZzgp);
                }
                if (z) {
                    if (cZzxF != ' ') {
                        if (i > 0) {
                            int i3 = i + 1;
                            cArrZzgp[i] = ControlChar.SPACE_CHAR;
                            if (i3 >= cArrZzgp.length) {
                                cArrZzgp = zzJ(cArrZzgp);
                            }
                            i = i3;
                        }
                        z = false;
                    }
                }
                cArrZzgp[i] = cZzxF;
                i++;
            }
            z = true;
        }
        return i == 0 ? "" : new String(cArrZzgp, 0, i);
    }

    public final zzZFV zzYS(int i, boolean z) throws zzZFV {
        zzZFV zzzfr;
        char c = (char) i;
        if (c == 0) {
            zzzfr = zzXMo();
        } else {
            String strOooO0Oo = "Illegal character (" + zzZF3.zzXl(c) + ")";
            if (this.zzWQ6) {
                strOooO0Oo = C21111o0ooOoO.OooO0Oo(strOooO0Oo, " [note: in XML 1.1, it could be included via entity expansion]");
            }
            zzzfr = new zzZFR(strOooO0Oo, zzXMq(), c);
        }
        if (z) {
            return zzzfr;
        }
        throw zzzfr;
    }

    public static zzZFV zzY(IOException iOException) {
        return new zzZFU(iOException);
    }

    public static void zzY(String str, long j, long j2) throws zzZQS {
        if (j2 > j) {
            throw zzS(str, j);
        }
    }

    private void zzZ(zzZQU zzzqu, zzYF8 zzyf8) throws zzZQS {
        if (zzzqu != null) {
            if (zzyf8.zzlj() == null) {
                zzyf8.zzY(zzXMq());
            }
            if (zzyf8.getType() == null) {
                zzyf8.zzPy(zzZH9.zzWPQ);
            }
        }
    }

    public static void zzX(IOException iOException) throws zzZFV {
        throw new zzZFU(iOException);
    }

    public static void zzX(Exception exc) {
        zzZFT.zzY((zzZQS) exc);
        zzZE1.zzX(exc);
    }

    public void zzZ(zzZF1 zzzf1, boolean z, String str) throws zzZQS {
        this.zzWMi = 0;
        this.zzWMh = 0;
        this.zzWKH = this.zzWKI;
        int iZzXN5 = this.zzWKK.zzXN5() + 1;
        zzY("Maximum entity expansion depth", this.zzWML.zzXPA(), iZzXN5);
        this.zzWKK = zzzf1;
        zzzf1.zzZ(this, this.zzWKI, iZzXN5);
        if (z) {
            this.zzWKF = true;
        } else {
            this.zzWKF = false;
        }
    }

    private zzZG3 zzZ(int i, char[] cArr) {
        String string;
        String str = new String(cArr);
        zzZG1 zzzg1 = this.zzWKw.get(str);
        if (zzzg1 != null) {
            return zzzg1;
        }
        if (i <= 65535) {
            string = Character.toString((char) i);
        } else {
            StringBuffer stringBuffer = new StringBuffer(2);
            int i2 = i - 65536;
            stringBuffer.append((char) ((i2 >> 10) + 55296));
            stringBuffer.append((char) ((i2 & 1023) + 56320));
            string = stringBuffer.toString();
        }
        zzZG1 zzzg1ZzXP = zzZG1.zzXP(new String(cArr), string);
        this.zzWKw.put(str, zzzg1ZzXP);
        return zzzg1ZzXP;
    }

    public final zzZG3 zzZ(String str, boolean z, Object obj) throws zzZQS {
        this.zzWKL = str;
        zzZG3 zzzg3ZzI = zzI(str, obj);
        if (zzzg3ZzI == null) {
            if (!this.zzWKM) {
                return null;
            }
            this.zzWKu = zzxz(str);
            return null;
        }
        if (this.zzWKv && !(this instanceof zzZGD)) {
            return zzzg3ZzI;
        }
        zzZ(zzzg3ZzI, z);
        return zzzg3ZzI;
    }

    private void zzZ(zzZG3 zzzg3, boolean z) throws zzZQS {
        String name = zzzg3.getName();
        if (this.zzWKK.zzxM(name)) {
            zzxx(name);
        }
        zzZF1 zzzf1ZzZ = null;
        if (!zzzg3.zzXNK()) {
            zzV("Illegal reference to unparsed external entity \"{0}\"", name, null);
        }
        boolean zIsExternal = zzzg3.isExternal();
        if (zIsExternal) {
            if (!z) {
                zzV("Encountered a reference to external parsed entity \"{0}\" when expanding attribute value: not legal as per XML 1.0/1.1 #3.1", name, null);
            }
            if (!this.zzWML.zzXPO()) {
                zzV("Encountered a reference to external entity \"{0}\", but stream reader has feature \"{1}\" disabled", name, "com.aspose.javax.xml.stream.isSupportingExternalEntities");
            }
        }
        long jZzXPz = this.zzWML.zzXPz();
        int i = this.zzWKG + 1;
        this.zzWKG = i;
        zzY("Maximum entity expansion count", jZzXPz, i);
        zzZF1 zzzf1 = this.zzWKK;
        zzzf1.zzY(this);
        try {
            zzzf1ZzZ = zzzg3.zzZ(zzzf1, this.zzWQ3, this.zzWML, this.zzWKx);
        } catch (FileNotFoundException e) {
            zzV("(was {0}) {1}", e.getClass().getName(), e.getMessage());
        } catch (IOException e2) {
            throw zzY(e2);
        }
        zzZ(zzzf1ZzZ, zIsExternal, name);
    }

    public final String zzZ(char c, boolean z, String str) throws zzZQS {
        char cZzxF;
        char[] cArrZzgp = zzgp(-1);
        int i = 0;
        while (true) {
            int i2 = this.zzWMi;
            if (i2 < this.zzWMh) {
                char[] cArr = this.zzWLX;
                this.zzWMi = i2 + 1;
                cZzxF = cArr[i2];
            } else {
                cZzxF = zzxF(str);
            }
            if (cZzxF == c) {
                break;
            }
            if (cZzxF == '\n') {
                zzXMj();
            } else if (cZzxF == '\r') {
                if (zzXMl() == 10) {
                    this.zzWMi++;
                    if (!z) {
                        if (i >= cArrZzgp.length) {
                            cArrZzgp = zzJ(cArrZzgp);
                        }
                        cArrZzgp[i] = ControlChar.PARAGRAPH_BREAK_CHAR;
                        i++;
                    }
                } else if (z) {
                }
                cZzxF = '\n';
            }
            if (i >= cArrZzgp.length) {
                cArrZzgp = zzJ(cArrZzgp);
            }
            cArrZzgp[i] = cZzxF;
            i++;
        }
        return i == 0 ? "" : new String(cArrZzgp, 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x005c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0019 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int zzZ(StringBuffer stringBuffer) throws zzZQS {
        char cZzxE;
        int i;
        char cZzxF = zzxF(" in entity reference");
        if (stringBuffer != null) {
            stringBuffer.append(cZzxF);
        }
        int i2 = 0;
        if (cZzxF == 'x') {
            while (true) {
                int i3 = this.zzWMi;
                if (i3 < this.zzWMh) {
                    char[] cArr = this.zzWLX;
                    this.zzWMi = i3 + 1;
                    cZzxE = cArr[i3];
                } else {
                    cZzxE = zzxE(" in entity reference");
                }
                if (cZzxE == ';') {
                    break;
                }
                if (stringBuffer != null) {
                    stringBuffer.append(cZzxE);
                }
                int i4 = i2 << 4;
                if (cZzxE <= '9' && cZzxE >= '0') {
                    i = cZzxE - '0';
                } else if (cZzxE >= 'a' && cZzxE <= 'f') {
                    i = cZzxE - 'W';
                } else if (cZzxE < 'A' || cZzxE > 'F') {
                    zzd(cZzxE, "; expected a hex digit (0-9a-fA-F).");
                    i2 = i4;
                    if (i2 <= 1114111) {
                        zzXMc();
                    }
                } else {
                    i = cZzxE - '7';
                }
                i2 = i + i4;
                if (i2 <= 1114111) {
                }
            }
        } else {
            while (cZzxF != ';') {
                if (cZzxF > '9' || cZzxF < '0') {
                    zzd(cZzxF, "; expected a decimal number.");
                } else {
                    int i5 = (cZzxF - '0') + (i2 * 10);
                    if (i5 > 1114111) {
                        zzXMc();
                    }
                    i2 = i5;
                }
                int i6 = this.zzWMi;
                if (i6 < this.zzWMh) {
                    char[] cArr2 = this.zzWLX;
                    this.zzWMi = i6 + 1;
                    cZzxF = cArr2[i6];
                } else {
                    cZzxF = zzxE(" in entity reference");
                }
                if (stringBuffer != null && cZzxF != ';') {
                    stringBuffer.append(cZzxF);
                }
            }
        }
        zzgq(i2);
        return i2;
    }
}

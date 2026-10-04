package com.aspose.words.internal;

import OooO0o.C20424OooO0Oo;
import OooOo.C20485OooOoO;
import com.aspose.words.ControlChar;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZH1 {
    static final String[] zzWOG = {"CDATA", "ENUMERATED", "ID", "IDREF", "IDREFS", "ENTITY", "ENTITIES", "NOTATION", "NMTOKEN", "NMTOKENS"};
    protected final boolean zzWOB;
    protected final boolean zzWOC;
    protected final zzZGH zzWOD;
    protected final int zzWOE;
    protected final zzZDZ zzWOF;

    public zzZH1(zzZDZ zzzdz, zzZGH zzzgh, int i, boolean z, boolean z2) {
        this.zzWOF = zzzdz;
        this.zzWOD = zzzgh;
        this.zzWOE = i;
        this.zzWOC = z;
        this.zzWOB = z2;
    }

    public int getValueType() {
        return 0;
    }

    public final boolean isFixed() {
        return this.zzWOD.isFixed();
    }

    public final String toString() {
        return this.zzWOF.toString();
    }

    public String zzU(char[] cArr, int i, int i2) {
        return zzZDX.zzO(cArr, i, i2);
    }

    public final String zzX(zzZEV zzzev, boolean z) throws zzZQS {
        String strTrim = this.zzWOD.getValue().trim();
        if (strTrim.length() == 0) {
            zzZ(zzzev, "Invalid default value '" + strTrim + "'; empty String is not a valid NMTOKEN");
        }
        int iZzI = zzZF3.zzI(strTrim, this.zzWOC, this.zzWOB);
        if (iZzI >= 0) {
            StringBuilder sbOooO0OO = C20485OooOoO.OooO0OO(iZzI, "Invalid default value '", strTrim, "'; character #", " (");
            sbOooO0OO.append(zzZF3.zzXl(strTrim.charAt(iZzI)));
            sbOooO0OO.append(") not valid NMTOKEN character");
            zzZ(zzzev, sbOooO0OO.toString());
        }
        return strTrim;
    }

    public void zzXOO() {
        String value = this.zzWOD.getValue();
        if (value.length() > 0) {
            char[] charArray = value.toCharArray();
            String strZzO = zzZDX.zzO(charArray, 0, charArray.length);
            if (strZzO != null) {
                this.zzWOD.setValue(strZzO);
            }
        }
    }

    public final boolean zzXOP() {
        return this.zzWOD.zzXOP();
    }

    public final boolean zzXOQ() {
        return this.zzWOD.zzXOQ();
    }

    public final boolean zzXOR() {
        return this.zzWOD.zzXOR();
    }

    public final boolean zzXOS() {
        return getValueType() != 0;
    }

    public final int zzXOT() {
        return this.zzWOE;
    }

    public final zzZDZ zzXOU() {
        return this.zzWOF;
    }

    public final String zzY(zzZEV zzzev, boolean z) throws zzZQS {
        String strTrim = this.zzWOD.getValue().trim();
        int length = strTrim.length();
        StringBuilder sb = null;
        int i = 0;
        int i2 = 0;
        loop0: while (i < length) {
            char cCharAt = strTrim.charAt(i);
            while (zzZF3.isSpaceChar(cCharAt)) {
                i++;
                if (i >= length) {
                    break loop0;
                }
                cCharAt = strTrim.charAt(i);
            }
            int i3 = i + 1;
            while (i3 < length && !zzZF3.isSpaceChar(strTrim.charAt(i3))) {
                i3++;
            }
            String strSubstring = strTrim.substring(i, i3);
            int iZzJ = zzZF3.zzJ(strSubstring, this.zzWOC, this.zzWOB);
            if (iZzJ >= 0) {
                if (iZzJ == 0) {
                    StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("Invalid default value '", strTrim, "'; character ");
                    sbOooO0o0.append(zzZF3.zzXl(strTrim.charAt(i)));
                    sbOooO0o0.append(") not valid first character of a name token");
                    zzZ(zzzev, sbOooO0o0.toString());
                } else {
                    StringBuilder sbOooO0o02 = C20424OooO0Oo.OooO0o0("Invalid default value '", strTrim, "'; character ");
                    sbOooO0o02.append(zzZF3.zzXl(cCharAt));
                    sbOooO0o02.append(") not a valid name character");
                    zzZ(zzzev, sbOooO0o02.toString());
                }
            }
            i2++;
            if (sb == null) {
                sb = new StringBuilder((i3 - i) + 32);
            } else {
                sb.append(ControlChar.SPACE_CHAR);
            }
            sb.append(strSubstring);
            i = i3 + 1;
        }
        if (i2 == 0) {
            zzZ(zzzev, "Invalid default value '" + strTrim + "'; empty String is not a valid name value");
        }
        return sb.toString();
    }

    public final String zzZ(zzYFC zzyfc, zzYF6 zzyf6) throws zzZQS {
        String strZzXOo = this.zzWOD.zzXOo();
        if (strZzXOo != null) {
            return strZzXOo;
        }
        this.zzWOD.zzY(zzyfc, zzyf6);
        return this.zzWOD.getValue();
    }

    public abstract String zzZ(zzZGJ zzzgj, char[] cArr, int i, int i2, boolean z) throws zzZQS;

    public abstract void zzZ(zzZEV zzzev) throws zzZQS;

    public abstract zzZH1 zzgY(int i);

    public final String zzZ(zzZGJ zzzgj, String str, boolean z) throws zzZQS {
        int length = str.length();
        char[] cArrZzgX = zzzgj.zzgX(str.length());
        if (length > 0) {
            str.getChars(0, length, cArrZzgX, 0);
        }
        return zzZ(zzzgj, cArrZzgX, 0, length, z);
    }

    public final String zzZ(zzZEV zzzev, boolean z) throws zzZQS {
        String strTrim = this.zzWOD.getValue().trim();
        if (strTrim.length() == 0) {
            zzZ(zzzev, "Invalid default value '" + strTrim + "'; empty String is not a valid name");
        }
        int iZzJ = zzZF3.zzJ(strTrim, this.zzWOC, this.zzWOB);
        if (iZzJ >= 0) {
            if (iZzJ == 0) {
                StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("Invalid default value '", strTrim, "'; character ");
                sbOooO0o0.append(zzZF3.zzXl(strTrim.charAt(0)));
                sbOooO0o0.append(") not valid first character of a name");
                zzZ(zzzev, sbOooO0o0.toString());
                return strTrim;
            }
            StringBuilder sbOooO0OO = C20485OooOoO.OooO0OO(iZzJ, "Invalid default value '", strTrim, "'; character #", " (");
            sbOooO0OO.append(zzZF3.zzXl(strTrim.charAt(iZzJ)));
            sbOooO0OO.append(") not valid name character");
            zzZ(zzzev, sbOooO0OO.toString());
        }
        return strTrim;
    }

    public static String zzZ(char[] cArr, int i, int i2, boolean z, zzZDR zzzdr) {
        if (z) {
            while (i < i2 && cArr[i] <= ' ') {
                i++;
            }
            while (true) {
                int i3 = i2 - 1;
                if (i3 <= i || cArr[i3] > ' ') {
                    break;
                }
                i2 = i3;
            }
        }
        if (i >= i2) {
            return null;
        }
        return zzzdr.zzL(cArr, i, i2);
    }

    public static void zzZ(zzZEV zzzev, String str, zzZG3 zzzg3) throws zzZQS {
        if (zzzg3 == null) {
            zzzev.zzy4("Referenced entity '" + str + "' not defined");
            return;
        }
        if (zzzg3.zzXNK()) {
            zzzev.zzy4("Referenced entity '" + str + "' is not an unparsed entity");
        }
    }

    public final String zzZ(zzZGJ zzzgj, char c, String str) throws zzZQS {
        zzZ(zzzgj, "Invalid character " + zzZF3.zzXl(c) + ": " + str);
        return null;
    }

    public final String zzZ(zzZGJ zzzgj, String str) throws zzZQS {
        zzzgj.zzy4("Attribute '" + this.zzWOF + "': " + str);
        return null;
    }

    public final String zzZ(zzZEV zzzev, String str) throws zzZQS {
        zzzev.zzy4("Attribute definition '" + this.zzWOF + "': " + str);
        return null;
    }

    public final zzZG3 zzZ(zzZGJ zzzgj, char[] cArr, int i, int i2) throws zzZQS {
        Map<String, zzZG3> map = zzzgj.zzWNX;
        String str = new String(cArr, i, i2);
        zzZG3 zzzg3 = map.get(str);
        if (zzzg3 == null) {
            zzZ(zzzgj, "Referenced entity '" + str + "' not defined");
            return zzzg3;
        }
        if (zzzg3.zzXNK()) {
            zzZ(zzzgj, "Referenced entity '" + str + "' is not an unparsed entity");
        }
        return zzzg3;
    }
}

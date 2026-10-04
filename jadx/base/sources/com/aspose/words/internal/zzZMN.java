package com.aspose.words.internal;

import com.aspose.words.ControlChar;
import com.aspose.words.internal.zzZNE;
import com.microsoft.identity.common.internal.providers.oauth2.ResponseType;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZMN {
    static final zzZNE.zzV zzZTZ = zzZNE.zzV.zzhs();
    static final zzZNE.zzZT zzZTY = new zzZNE.zzZT();
    static final zzZNE.zzZY zzZTX = new zzZNE.zzZY();
    static final zzZNE.zzZR zzZTW = new zzZNE.zzZR();
    static final zzZNE.zz7 zzZTV = new zzZNE.zz7();
    static final zzZNE.zz4 zzZTU = new zzZNE.zz4();
    static final zzZNE.zz3 zzZTT = new zzZNE.zz3();
    static final zzZNE.zz2 zzZTS = new zzZNE.zz2();
    static final zzZNE.zz5 zzZTR = new zzZNE.zz5();
    static final zzZNE.zzC zzZTQ = new zzZNE.zzC();
    static final zzZNE.zzB zzZTP = new zzZNE.zzB();
    static final zzZNE.zzA zzZTO = new zzZNE.zzA();
    static final zzZNE.zzK zzZTN = new zzZNE.zzK();
    static final zzZNE.zzL zzZTM = new zzZNE.zzL();
    static final zzZNE.zzZX zzZTL = new zzZNE.zzZX();
    static final zzZNE.zzO zzZTK = new zzZNE.zzO();
    static final zzZNE.zz8 zzZTJ = new zzZNE.zz8();
    static final zzZNE.zz6 zzZTI = new zzZNE.zz6();
    static final zzZNE.zz9 zzZTH = new zzZNE.zz9();
    static final zzZNE.zzZU zzZTG = new zzZNE.zzZU();
    static final zzZNE.zzR zzZTF = new zzZNE.zzR();
    static final zzZNE.zz0 zzZTE = new zzZNE.zz0();
    static final zzZNE.zzZW zzZTD = new zzZNE.zzZW();
    static final zzZNE.zzZO zzZTC = new zzZNE.zzZO();
    static final zzZNE.zzZP zzZTB = new zzZNE.zzZP();
    static final zzZNE.zzZN zzZTA = new zzZNE.zzZN();
    static final zzZNE.zzZQ zzZTz = new zzZNE.zzZQ();
    static final zzZNE.zzZZ zzZTy = new zzZNE.zzZZ();
    static final zzZNE.zz1 zzZTx = new zzZNE.zz1();
    static final zzZNE.zzJ zzZTw = new zzZNE.zzJ();
    static final zzZNE.zzN zzZTv = new zzZNE.zzN();
    static final zzZNE.zzT zzZTu = new zzZNE.zzT();
    static final zzZNE.zzS zzZTt = new zzZNE.zzS();
    static final zzZNE.zzU zzZTs = new zzZNE.zzU();
    static final zzZNE.zzM zzZTr = new zzZNE.zzM();
    static final zzZNE.zzP zzZTq = new zzZNE.zzP();
    static final zzZNE.zzQ zzZTp = new zzZNE.zzQ();
    static final zzZNE.zzZS zzZTo = new zzZNE.zzZS();
    static final zzZNE.zzD zzZTn = new zzZNE.zzD();
    static final zzZNE.zzZV zzZTm = new zzZNE.zzZV();
    static final zzZNE.zzE zzZTl = new zzZNE.zzE();
    static final zzZNE.zzG zzZTk = new zzZNE.zzG();
    static final zzZNE.zzF zzZTj = new zzZNE.zzF();
    static final zzZNE.zzH zzZTi = new zzZNE.zzH();
    static final zzZNE.zzI zzZTh = new zzZNE.zzI();
    static final zzZNE.zzZ zzZTg = new zzZNE.zzZ();
    static final zzZNE.zzX zzZTf = new zzZNE.zzX();
    static final zzZNE.zzY zzZTe = new zzZNE.zzY();
    static final zzZNE.zzW zzZTd = new zzZNE.zzW();
    static char[] zzZTc = {ControlChar.SPACE_CHAR, '\t', '\n', ControlChar.PARAGRAPH_BREAK_CHAR};
    StringBuilder zzZTb = new StringBuilder();
    int zzZTa = zzZNE.zzZM.Preserve$4588ffa0;

    /* JADX INFO: renamed from: com.aspose.words.internal.zzZMN$1 */
    public static /* synthetic */ class C158881 {
        static final /* synthetic */ int[] zzZT9;

        static {
            int[] iArr = new int[zzZNE.zzZM.zzhq().length];
            zzZT9 = iArr;
            try {
                iArr[zzZNE.zzZM.Collapse$4588ffa0 - 1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zzZT9[zzZNE.zzZM.Replace$4588ffa0 - 1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static zzZMN zzU(zzZN4 zzzn4) {
        return zzZM(zzzn4.getName(), zzzn4.getNamespace());
    }

    public static Object zzUu(String str) {
        return str;
    }

    private static zzZMN zzZM(String str, String str2) {
        if ("http://www.w3.org/2003/11/xpath-datatypes".equals(str2)) {
            if ("anyAtomicType".equals(str)) {
                return zzZTg;
            }
            if ("untypedAtomic".equals(str)) {
                return zzZTf;
            }
            if ("dayTimeDuration".equals(str)) {
                return zzZTe;
            }
            if ("yearMonthDuration".equals(str)) {
                return zzZTd;
            }
            return null;
        }
        if ("anySimpleType".equals(str)) {
            return zzZTZ;
        }
        if ("string".equals(str)) {
            return zzZTY;
        }
        if ("normalizedString".equals(str)) {
            return zzZTX;
        }
        if (ResponseType.TOKEN.equals(str)) {
            return zzZTW;
        }
        if ("language".equals(str)) {
            return zzZTV;
        }
        if ("NMTOKEN".equals(str)) {
            return zzZTU;
        }
        if ("NMTOKENS".equals(str)) {
            return zzZTT;
        }
        if ("Name".equals(str)) {
            return zzZTS;
        }
        if ("NCName".equals(str)) {
            return zzZTR;
        }
        if ("ID".equals(str)) {
            return zzZTQ;
        }
        if ("IDREF".equals(str)) {
            return zzZTP;
        }
        if ("IDREFS".equals(str)) {
            return zzZTO;
        }
        if ("ENTITY".equals(str)) {
            return zzZTN;
        }
        if ("ENTITIES".equals(str)) {
            return zzZTM;
        }
        if ("NOTATION".equals(str)) {
            return zzZTL;
        }
        if ("decimal".equals(str)) {
            return zzZTK;
        }
        if ("integer".equals(str)) {
            return zzZTJ;
        }
        if ("long".equals(str)) {
            return zzZTI;
        }
        if ("int".equals(str)) {
            return zzZTH;
        }
        if ("short".equals(str)) {
            return zzZTG;
        }
        if ("byte".equals(str)) {
            return zzZTF;
        }
        if ("nonPositiveInteger".equals(str)) {
            return zzZTy;
        }
        if ("negativeInteger".equals(str)) {
            return zzZTx;
        }
        if ("nonNegativeInteger".equals(str)) {
            return zzZTE;
        }
        if ("unsignedLong".equals(str)) {
            return zzZTC;
        }
        if ("unsignedInt".equals(str)) {
            return zzZTB;
        }
        if ("unsignedShort".equals(str)) {
            return zzZTA;
        }
        if ("unsignedByte".equals(str)) {
            return zzZTz;
        }
        if ("positiveInteger".equals(str)) {
            return zzZTD;
        }
        if ("float".equals(str)) {
            return zzZTw;
        }
        if ("double".equals(str)) {
            return zzZTv;
        }
        if ("base64Binary".equals(str)) {
            return zzZTu;
        }
        if ("boolean".equals(str)) {
            return zzZTt;
        }
        if ("anyURI".equals(str)) {
            return zzZTs;
        }
        if ("duration".equals(str)) {
            return zzZTr;
        }
        if ("dateTime".equals(str)) {
            return zzZTq;
        }
        if ("date".equals(str)) {
            return zzZTp;
        }
        if ("time".equals(str)) {
            return zzZTo;
        }
        if ("hexBinary".equals(str)) {
            return zzZTn;
        }
        if ("QName".equals(str)) {
            return zzZTm;
        }
        if ("gYearMonth".equals(str)) {
            return zzZTl;
        }
        if ("gMonthDay".equals(str)) {
            return zzZTk;
        }
        if ("gYear".equals(str)) {
            return zzZTj;
        }
        if ("gMonth".equals(str)) {
            return zzZTi;
        }
        if ("gDay".equals(str)) {
            return zzZTh;
        }
        return null;
    }

    private String zzq(String str, int i) {
        if (zzZKN.zzZ(str, zzZTc) >= 0) {
            int i2 = C158881.zzZT9[i - 1];
            if (i2 == 1) {
                for (String str2 : zzZKN.zzU(str.trim(), zzZTc)) {
                    if (!"".equals(str2)) {
                        this.zzZTb.append(str2);
                        this.zzZTb.append(" ");
                    }
                }
                String string = this.zzZTb.toString();
                this.zzZTb.setLength(0);
                return string.trim();
            }
            if (i2 == 2) {
                this.zzZTb.setLength(0);
                this.zzZTb.append(str);
                for (int i3 = 0; i3 < this.zzZTb.length(); i3++) {
                    char cCharAt = this.zzZTb.charAt(i3);
                    if (cCharAt == '\t' || cCharAt == '\n' || cCharAt == '\r') {
                        this.zzZTb.setCharAt(i3, ControlChar.SPACE_CHAR);
                    }
                }
                String string2 = this.zzZTb.toString();
                this.zzZTb.setLength(0);
                return string2;
            }
        }
        return str;
    }

    public final String zzUv(String str) {
        return zzq(str, this.zzZTa);
    }

    public abstract int zzht();

    public abstract Class zzhu();

    public abstract int zzhv();
}

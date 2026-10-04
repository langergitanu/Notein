package com.aspose.words.internal;

import com.microsoft.identity.common.internal.providers.oauth2.ResponseType;

/* JADX INFO: loaded from: classes5.dex */
public class zzZLH extends zzZLZ {
    zzZN4 zzZQK = zzZN4.zzZV6;
    protected int zzZQL;
    zzZMN zzZQM;
    zzZLH zzZQN;
    zzZN4 zzZQO;
    boolean zzZQP;
    private int zzZT2;

    /* JADX INFO: renamed from: com.aspose.words.internal.zzZLH$1 */
    public static /* synthetic */ class C158871 {
        static final /* synthetic */ int[] zzZQJ;

        static {
            int[] iArr = new int[zzZLC.zzfD().length];
            zzZQJ = iArr;
            try {
                iArr[zzZLC.None$3fee07aa - 1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zzZQJ[zzZLC.Item$3fee07aa - 1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                zzZQJ[zzZLC.Node$3fee07aa - 1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                zzZQJ[zzZLC.Document$3fee07aa - 1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                zzZQJ[zzZLC.Element$3fee07aa - 1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                zzZQJ[zzZLC.Attribute$3fee07aa - 1] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                zzZQJ[zzZLC.Namespace$3fee07aa - 1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                zzZQJ[zzZLC.ProcessingInstruction$3fee07aa - 1] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                zzZQJ[zzZLC.Comment$3fee07aa - 1] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                zzZQJ[zzZLC.Text$3fee07aa - 1] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                zzZQJ[zzZLC.AnyAtomicType$3fee07aa - 1] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                zzZQJ[zzZLC.UntypedAtomic$3fee07aa - 1] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                zzZQJ[zzZLC.String$3fee07aa - 1] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                zzZQJ[zzZLC.Boolean$3fee07aa - 1] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                zzZQJ[zzZLC.Decimal$3fee07aa - 1] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                zzZQJ[zzZLC.Float$3fee07aa - 1] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                zzZQJ[zzZLC.Double$3fee07aa - 1] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                zzZQJ[zzZLC.Duration$3fee07aa - 1] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                zzZQJ[zzZLC.DateTime$3fee07aa - 1] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                zzZQJ[zzZLC.Time$3fee07aa - 1] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                zzZQJ[zzZLC.Date$3fee07aa - 1] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                zzZQJ[zzZLC.GYearMonth$3fee07aa - 1] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                zzZQJ[zzZLC.GYear$3fee07aa - 1] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                zzZQJ[zzZLC.GMonthDay$3fee07aa - 1] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                zzZQJ[zzZLC.GDay$3fee07aa - 1] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                zzZQJ[zzZLC.GMonth$3fee07aa - 1] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                zzZQJ[zzZLC.HexBinary$3fee07aa - 1] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                zzZQJ[zzZLC.Base64Binary$3fee07aa - 1] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                zzZQJ[zzZLC.AnyUri$3fee07aa - 1] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                zzZQJ[zzZLC.QName$3fee07aa - 1] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                zzZQJ[zzZLC.Notation$3fee07aa - 1] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                zzZQJ[zzZLC.NormalizedString$3fee07aa - 1] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                zzZQJ[zzZLC.Token$3fee07aa - 1] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                zzZQJ[zzZLC.Language$3fee07aa - 1] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                zzZQJ[zzZLC.NmToken$3fee07aa - 1] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                zzZQJ[zzZLC.Name$3fee07aa - 1] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                zzZQJ[zzZLC.NCName$3fee07aa - 1] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                zzZQJ[zzZLC.Id$3fee07aa - 1] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                zzZQJ[zzZLC.Idref$3fee07aa - 1] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                zzZQJ[zzZLC.Entity$3fee07aa - 1] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                zzZQJ[zzZLC.Integer$3fee07aa - 1] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                zzZQJ[zzZLC.NonPositiveInteger$3fee07aa - 1] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                zzZQJ[zzZLC.NegativeInteger$3fee07aa - 1] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                zzZQJ[zzZLC.Long$3fee07aa - 1] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                zzZQJ[zzZLC.Int$3fee07aa - 1] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                zzZQJ[zzZLC.Short$3fee07aa - 1] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                zzZQJ[zzZLC.Byte$3fee07aa - 1] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                zzZQJ[zzZLC.NonNegativeInteger$3fee07aa - 1] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                zzZQJ[zzZLC.UnsignedLong$3fee07aa - 1] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                zzZQJ[zzZLC.UnsignedInt$3fee07aa - 1] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                zzZQJ[zzZLC.UnsignedShort$3fee07aa - 1] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                zzZQJ[zzZLC.UnsignedByte$3fee07aa - 1] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                zzZQJ[zzZLC.PositiveInteger$3fee07aa - 1] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                zzZQJ[zzZLC.YearMonthDuration$3fee07aa - 1] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                zzZQJ[zzZLC.DayTimeDuration$3fee07aa - 1] = 55;
            } catch (NoSuchFieldError unused55) {
            }
        }
    }

    public static zzZLN zzQ(zzZN4 zzzn4) {
        if ("http://www.w3.org/2003/11/xpath-datatypes".equals(zzzn4.getNamespace())) {
            if ("untypedAtomic".equals(zzzn4.getName())) {
                return zzZLN.zzZRg;
            }
            if ("anyAtomicType".equals(zzzn4.getName())) {
                return zzZLN.zzZRf;
            }
            if ("yearMonthDuration".equals(zzzn4.getName())) {
                return zzZLN.zzZRe;
            }
            if ("dayTimeDuration".equals(zzzn4.getName())) {
                return zzZLN.zzZRd;
            }
            return null;
        }
        if (!zzzn4.getNamespace().equals("http://www.w3.org/2001/XMLSchema")) {
            return null;
        }
        if ("anySimpleType".equals(zzzn4.getName())) {
            return zzZLN.zzZRZ;
        }
        if ("string".equals(zzzn4.getName())) {
            return zzZLN.zzZRY;
        }
        if ("boolean".equals(zzzn4.getName())) {
            return zzZLN.zzZRX;
        }
        if ("decimal".equals(zzzn4.getName())) {
            return zzZLN.zzZRW;
        }
        if ("float".equals(zzzn4.getName())) {
            return zzZLN.zzZRV;
        }
        if ("double".equals(zzzn4.getName())) {
            return zzZLN.zzZRU;
        }
        if ("duration".equals(zzzn4.getName())) {
            return zzZLN.zzZRT;
        }
        if ("dateTime".equals(zzzn4.getName())) {
            return zzZLN.zzZRS;
        }
        if ("time".equals(zzzn4.getName())) {
            return zzZLN.zzZRR;
        }
        if ("date".equals(zzzn4.getName())) {
            return zzZLN.zzZRQ;
        }
        if ("gYearMonth".equals(zzzn4.getName())) {
            return zzZLN.zzZRP;
        }
        if ("gYear".equals(zzzn4.getName())) {
            return zzZLN.zzZRO;
        }
        if ("gMonthDay".equals(zzzn4.getName())) {
            return zzZLN.zzZRN;
        }
        if ("gDay".equals(zzzn4.getName())) {
            return zzZLN.zzZRM;
        }
        if ("gMonth".equals(zzzn4.getName())) {
            return zzZLN.zzZRL;
        }
        if ("hexBinary".equals(zzzn4.getName())) {
            return zzZLN.zzZRK;
        }
        if ("base64Binary".equals(zzzn4.getName())) {
            return zzZLN.zzZRJ;
        }
        if ("anyURI".equals(zzzn4.getName())) {
            return zzZLN.zzZRI;
        }
        if ("QName".equals(zzzn4.getName())) {
            return zzZLN.zzZRH;
        }
        if ("NOTATION".equals(zzzn4.getName())) {
            return zzZLN.zzZRG;
        }
        if ("normalizedString".equals(zzzn4.getName())) {
            return zzZLN.zzZRF;
        }
        if (ResponseType.TOKEN.equals(zzzn4.getName())) {
            return zzZLN.zzZRE;
        }
        if ("language".equals(zzzn4.getName())) {
            return zzZLN.zzZRD;
        }
        if ("NMTOKEN".equals(zzzn4.getName())) {
            return zzZLN.zzZRC;
        }
        if ("NMTOKENS".equals(zzzn4.getName())) {
            return zzZLN.zzZRB;
        }
        if ("Name".equals(zzzn4.getName())) {
            return zzZLN.zzZRA;
        }
        if ("NCName".equals(zzzn4.getName())) {
            return zzZLN.zzZRz;
        }
        if ("ID".equals(zzzn4.getName())) {
            return zzZLN.zzZRy;
        }
        if ("IDREF".equals(zzzn4.getName())) {
            return zzZLN.zzZRx;
        }
        if ("IDREFS".equals(zzzn4.getName())) {
            return zzZLN.zzZRw;
        }
        if ("ENTITY".equals(zzzn4.getName())) {
            return zzZLN.zzZRv;
        }
        if ("ENTITIES".equals(zzzn4.getName())) {
            return zzZLN.zzZRu;
        }
        if ("integer".equals(zzzn4.getName())) {
            return zzZLN.zzZRt;
        }
        if ("nonPositiveInteger".equals(zzzn4.getName())) {
            return zzZLN.zzZRs;
        }
        if ("negativeInteger".equals(zzzn4.getName())) {
            return zzZLN.zzZRr;
        }
        if ("long".equals(zzzn4.getName())) {
            return zzZLN.zzZRq;
        }
        if ("int".equals(zzzn4.getName())) {
            return zzZLN.zzZRp;
        }
        if ("short".equals(zzzn4.getName())) {
            return zzZLN.zzZRo;
        }
        if ("byte".equals(zzzn4.getName())) {
            return zzZLN.zzZRn;
        }
        if ("nonNegativeInteger".equals(zzzn4.getName())) {
            return zzZLN.zzZRm;
        }
        if ("positiveInteger".equals(zzzn4.getName())) {
            return zzZLN.zzZRh;
        }
        if ("unsignedLong".equals(zzzn4.getName())) {
            return zzZLN.zzZRl;
        }
        if ("unsignedInt".equals(zzzn4.getName())) {
            return zzZLN.zzZRk;
        }
        if ("unsignedShort".equals(zzzn4.getName())) {
            return zzZLN.zzZRj;
        }
        if ("unsignedByte".equals(zzzn4.getName())) {
            return zzZLN.zzZRi;
        }
        return null;
    }

    public static zzZLN zzQr(int i) {
        switch (C158871.zzZQJ[i - 1]) {
            case 11:
                return zzZLN.zzZRf;
            case 12:
                return zzZLN.zzZRg;
            case 13:
                return zzZLN.zzZRY;
            case 14:
                return zzZLN.zzZRX;
            case 15:
                return zzZLN.zzZRW;
            case 16:
                return zzZLN.zzZRV;
            case 17:
                return zzZLN.zzZRU;
            case 18:
                return zzZLN.zzZRT;
            case 19:
                return zzZLN.zzZRS;
            case 20:
                return zzZLN.zzZRR;
            case 21:
                return zzZLN.zzZRQ;
            case 22:
                return zzZLN.zzZRP;
            case 23:
                return zzZLN.zzZRO;
            case 24:
                return zzZLN.zzZRN;
            case 25:
                return zzZLN.zzZRM;
            case 26:
                return zzZLN.zzZRL;
            case 27:
                return zzZLN.zzZRK;
            case 28:
                return zzZLN.zzZRJ;
            case 29:
                return zzZLN.zzZRI;
            case 30:
                return zzZLN.zzZRH;
            case 31:
                return zzZLN.zzZRG;
            case 32:
                return zzZLN.zzZRF;
            case 33:
                return zzZLN.zzZRE;
            case 34:
                return zzZLN.zzZRD;
            case 35:
                return zzZLN.zzZRC;
            case 36:
                return zzZLN.zzZRA;
            case 37:
                return zzZLN.zzZRz;
            case 38:
                return zzZLN.zzZRy;
            case 39:
                return zzZLN.zzZRx;
            case 40:
                return zzZLN.zzZRv;
            case 41:
                return zzZLN.zzZRt;
            case 42:
                return zzZLN.zzZRs;
            case 43:
                return zzZLN.zzZRr;
            case 44:
                return zzZLN.zzZRq;
            case 45:
                return zzZLN.zzZRp;
            case 46:
                return zzZLN.zzZRo;
            case 47:
                return zzZLN.zzZRn;
            case 48:
                return zzZLN.zzZRm;
            case 49:
                return zzZLN.zzZRl;
            case 50:
                return zzZLN.zzZRk;
            case 51:
                return zzZLN.zzZRj;
            case 52:
                return zzZLN.zzZRi;
            case 53:
                return zzZLN.zzZRh;
            case 54:
                return zzZLN.zzZRe;
            case 55:
                return zzZLN.zzZRd;
            default:
                return null;
        }
    }

    public final void zzQs(int i) {
        this.zzZT2 = i;
    }

    public final boolean zzfF() throws zzZMJ {
        if (this.zzZQP) {
            return this != zzZMQ.zzgz();
        }
        this.zzZQP = true;
        zzZLH zzzlh = this.zzZQN != null ? this.zzZQN : null;
        boolean zZzfF = zzzlh != null ? zzzlh.zzfF() : false;
        this.zzZQP = false;
        return zZzfF;
    }

    public final Object zzfG() {
        zzZLH zzzlh = this.zzZQN;
        if (zzzlh != null) {
            return zzzlh;
        }
        try {
            if (this == zzZMQ.zzgz()) {
                return null;
            }
            return this.zzZQM;
        } catch (zzZMJ e) {
            zzZHV.zzZ(e);
            return null;
        }
    }

    public final int zzfH() {
        return this.zzZQL;
    }

    public final int zzfI() {
        return this.zzZT2;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final zzZN4 zzgQ() {
        return this.zzZQK;
    }
}

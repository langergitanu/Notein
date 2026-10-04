package com.aspose.words.internal;

import com.aspose.words.internal.zzZNE;
import com.microsoft.identity.common.internal.providers.oauth2.ResponseType;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZLN extends zzZLH {
    public static final zzZLN zzZRA;
    public static final zzZLN zzZRB;
    public static final zzZLN zzZRC;
    public static final zzZLN zzZRD;
    public static final zzZLN zzZRE;
    public static final zzZLN zzZRF;
    public static final zzZLN zzZRG;
    public static final zzZLN zzZRH;
    public static final zzZLN zzZRI;
    public static final zzZLN zzZRJ;
    public static final zzZLN zzZRK;
    public static final zzZLN zzZRL;
    public static final zzZLN zzZRM;
    public static final zzZLN zzZRN;
    public static final zzZLN zzZRO;
    public static final zzZLN zzZRP;
    public static final zzZLN zzZRQ;
    public static final zzZLN zzZRR;
    public static final zzZLN zzZRS;
    public static final zzZLN zzZRT;
    public static final zzZLN zzZRU;
    public static final zzZLN zzZRV;
    public static final zzZLN zzZRW;
    public static final zzZLN zzZRX;
    public static final zzZLN zzZRY;
    public static final zzZLN zzZRZ;
    public static final zzZLN zzZRd;
    public static final zzZLN zzZRe;
    public static final zzZLN zzZRf;
    public static final zzZLN zzZRg;
    public static final zzZLN zzZRh;
    public static final zzZLN zzZRi;
    public static final zzZLN zzZRj;
    public static final zzZLN zzZRk;
    public static final zzZLN zzZRl;
    public static final zzZLN zzZRm;
    public static final zzZLN zzZRn;
    public static final zzZLN zzZRo;
    public static final zzZLN zzZRp;
    public static final zzZLN zzZRq;
    public static final zzZLN zzZRr;
    public static final zzZLN zzZRs;
    public static final zzZLN zzZRt;
    public static final zzZLN zzZRu;
    public static final zzZLN zzZRv;
    public static final zzZLN zzZRw;
    public static final zzZLN zzZRx;
    public static final zzZLN zzZRy;
    public static final zzZLN zzZRz;
    private static zzZLN zzZS3;
    private int zzZS0;
    private boolean zzZS1 = true;
    private zzZLM zzZS2;

    static {
        zzZLN zzzln = new zzZLN();
        zzZLL zzzll = new zzZLL();
        zzzll.zzR(new zzZN4("anyURI", "http://www.w3.org/2001/XMLSchema"));
        zzzln.zzZS2 = zzzll;
        zzzln.zzZQN = null;
        zzzln.zzZS0 = 8;
        zzZS3 = zzzln;
        zzZRZ = zzZ("anySimpleType", null, false, false);
        zzZRY = zzZ("string", "anySimpleType", false, false);
        zzZRX = zzZ("boolean", "anySimpleType", false, false);
        zzZRW = zzZ("decimal", "anySimpleType", false, false);
        zzZRV = zzZ("float", "anySimpleType", false, false);
        zzZRU = zzZ("double", "anySimpleType", false, false);
        zzZRT = zzZ("duration", "anySimpleType", false, false);
        zzZRS = zzZ("dateTime", "anySimpleType", false, false);
        zzZRR = zzZ("time", "anySimpleType", false, false);
        zzZRQ = zzZ("date", "anySimpleType", false, false);
        zzZRP = zzZ("gYearMonth", "anySimpleType", false, false);
        zzZRO = zzZ("gYear", "anySimpleType", false, false);
        zzZRN = zzZ("gMonthDay", "anySimpleType", false, false);
        zzZRM = zzZ("gDay", "anySimpleType", false, false);
        zzZRL = zzZ("gMonth", "anySimpleType", false, false);
        zzZRK = zzZ("hexBinary", "anySimpleType", false, false);
        zzZRJ = zzZ("base64Binary", "anySimpleType", false, false);
        zzZRI = zzZ("anyURI", "anySimpleType", false, false);
        zzZRH = zzZ("QName", "anySimpleType", false, false);
        zzZRG = zzZ("NOTATION", "anySimpleType", false, false);
        zzZRF = zzZ("normalizedString", "string", false, false);
        zzZRE = zzZ(ResponseType.TOKEN, "normalizedString", false, false);
        zzZRD = zzZ("language", ResponseType.TOKEN, false, false);
        zzZLN zzzlnZzZ = zzZ("NMTOKEN", ResponseType.TOKEN, false, false);
        zzZRC = zzzlnZzZ;
        zzZRA = zzZ("Name", ResponseType.TOKEN, false, false);
        zzZRz = zzZ("NCName", "Name", false, false);
        zzZRy = zzZ("ID", "NCName", false, false);
        zzZLN zzzlnZzZ2 = zzZ("IDREF", "NCName", false, false);
        zzZRx = zzzlnZzZ2;
        zzZLN zzzlnZzZ3 = zzZ("ENTITY", "NCName", false, false);
        zzZRv = zzzlnZzZ3;
        zzZRt = zzZ("integer", "decimal", false, false);
        zzZRs = zzZ("nonPositiveInteger", "integer", false, false);
        zzZRr = zzZ("negativeInteger", "nonPositiveInteger", false, false);
        zzZRq = zzZ("long", "integer", false, false);
        zzZRp = zzZ("int", "long", false, false);
        zzZRo = zzZ("short", "int", false, false);
        zzZRn = zzZ("byte", "short", false, false);
        zzZRm = zzZ("nonNegativeInteger", "integer", false, false);
        zzZRl = zzZ("unsignedLong", "nonNegativeInteger", false, false);
        zzZRk = zzZ("unsignedInt", "unsignedLong", false, false);
        zzZRj = zzZ("unsignedShort", "unsignedInt", false, false);
        zzZRi = zzZ("unsignedByte", "unsignedShort", false, false);
        zzZRh = zzZ("positiveInteger", "nonNegativeInteger", false, false);
        zzZRf = zzZ("anyAtomicType", "anySimpleType", true, false);
        zzZRg = zzZ("untypedAtomic", "anyAtomicType", true, true);
        zzZRd = zzZ("dayTimeDuration", "duration", true, false);
        zzZRe = zzZ("yearMonthDuration", "duration", true, false);
        zzZLN zzzln2 = new zzZLN();
        zzZRw = zzzln2;
        zzZLL zzzll2 = new zzZLL();
        zzzll2.zzZ(zzzlnZzZ2);
        zzzln2.zzZS2 = zzzll2;
        zzZLN zzzln3 = new zzZLN();
        zzZRu = zzzln3;
        zzZLL zzzll3 = new zzZLL();
        zzzll3.zzZ(zzzlnZzZ3);
        zzzln3.zzZS2 = zzzll3;
        zzZLN zzzln4 = new zzZLN();
        zzZRB = zzzln4;
        zzZLL zzzll4 = new zzZLL();
        zzzll4.zzZ(zzzlnZzZ);
        zzzln4.zzZS2 = zzzll4;
    }

    private void zzL(zzZN3 zzzn3) throws Exception {
        zzZLM zzzlm = this.zzZS2;
        if (!(zzzlm instanceof zzZLK)) {
            this.zzZQM = zzZNE.zzV.zzhs();
            return;
        }
        Object objZzY = ((zzZLK) zzzlm).zzY(zzzn3, false);
        zzZLN zzzln = objZzY instanceof zzZLN ? (zzZLN) objZzY : null;
        this.zzZQN = zzzln;
        if (zzzln != null) {
            this.zzZQM = zzzln.zzZQM;
        } else {
            this.zzZQM = (zzZMN) objZzY;
        }
    }

    private static zzZLN zzZ(String str, String str2, boolean z, boolean z2) {
        String str3 = z ? "http://www.w3.org/2003/11/xpath-datatypes" : "http://www.w3.org/2001/XMLSchema";
        String str4 = z2 ? "http://www.w3.org/2003/11/xpath-datatypes" : "http://www.w3.org/2001/XMLSchema";
        zzZLN zzzln = new zzZLN();
        zzzln.zzZQK = new zzZN4(str, str3);
        if (str2 != null) {
            zzzln.zzZQN = zzZLH.zzQ(new zzZN4(str2, str4));
        }
        zzzln.zzZQM = zzZMN.zzU(zzzln.zzgQ());
        return zzzln;
    }

    public static zzZNE.zzV zzfN() {
        return zzZNE.zzV.zzhs();
    }

    public static zzZLN zzm(zzZQR zzzqr) {
        zzZLN zzzln = new zzZLN();
        for (int i = 0; i < zzzqr.getAttributeCount(); i++) {
            try {
                String strZzRu = zzzqr.zzRu(i);
                String attributeValue = zzzqr.getAttributeValue(i);
                if ("final".equals(strZzRu)) {
                    zzzln.zzQv(zzZLF.zzUo(strZzRu));
                } else if ("id".equals(strZzRu)) {
                    zzzln.setId(attributeValue);
                } else if ("name".equals(strZzRu)) {
                    zzzln.setName(attributeValue);
                } else {
                    zzzln.zzZL(strZzRu, attributeValue);
                }
            } catch (Exception e) {
                zzZHV.zzY(e);
            }
        }
        char c = 1;
        while (zzzqr.hasNext()) {
            zzzqr.next();
            int eventType = zzzqr.getEventType();
            if (eventType != 1) {
                if (eventType == 2) {
                    break;
                }
            } else if (c <= 1 && "annotation".equals(zzzqr.getLocalName())) {
                zzzln.zzZ(zzZN1.zzW(zzzqr));
                c = 2;
            } else {
                if (c > 2) {
                    break;
                }
                if ("restriction".equals(zzzqr.getLocalName())) {
                    zzzln.zzZS2 = zzZLK.zzk(zzzqr);
                } else if (!"list".equals(zzzqr.getLocalName())) {
                    if (!"union".equals(zzzqr.getLocalName())) {
                        break;
                    }
                    zzzln.zzZS2 = zzZLJ.zzj(zzzqr);
                } else {
                    zzzln.zzZS2 = zzZLL.zzl(zzzqr);
                }
                c = 3;
            }
        }
        return zzzln;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final int zzY(zzZN3 zzzn3) throws Exception {
        if (!zzS(zzzn3.zzZSD) && !this.zzZQP) {
            this.zzZQP = true;
            zzL(zzzn3);
            zzZLM zzzlm = this.zzZS2;
            if (zzzlm != null) {
                this.zzZSG = zzzlm.zzY(zzzn3) + this.zzZSG;
            }
            zzZLH zzzlh = this.zzZQN;
            zzZLN zzzln = zzzlh instanceof zzZLN ? (zzZLN) zzzlh : null;
            if (zzzln != null) {
                this.zzZQM = zzzln.zzZQM;
            }
            zzZLN zzzln2 = zzzlh instanceof zzZLN ? (zzZLN) zzzlh : null;
            if (zzzln2 != null) {
                zzzln2.zzfI();
            }
            int i = this.zzZQL;
            if (i != 4 || zzzln2 == null) {
                this.zzZS0 = i;
            } else {
                this.zzZS0 = zzzln2.zzZS0;
            }
            zzZLM zzzlm2 = this.zzZS2;
            zzZLK zzzlk = zzzlm2 instanceof zzZLK ? (zzZLK) zzzlm2 : null;
            Object obj = this.zzZQN;
            if (obj == null) {
                obj = this.zzZQM;
            }
            if (zzzlk != null) {
                zzZ(obj, zzzlk.zzfM());
            }
            zzZLM zzzlm3 = this.zzZS2;
            zzZLL zzzll = zzzlm3 instanceof zzZLL ? (zzZLL) zzzlm3 : null;
            if (zzzll != null) {
                Object obj2 = zzzll.zzZR9;
                zzZLN zzzln3 = obj2 instanceof zzZLN ? (zzZLN) obj2 : null;
                if (zzzln3 != null) {
                    boolean z = zzzln3.zzZS2 instanceof zzZLL;
                }
            }
            this.zzZQP = false;
            this.zzZSD = zzzn3.zzZSD;
            return this.zzZSG;
        }
        return this.zzZSG;
    }

    public final void zzfO() {
        this.zzZS1 = false;
    }

    public final zzZLM zzfP() {
        return this.zzZS2;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final int zzZ(zzZN3 zzzn3) {
        if (zzg5() == zzzn3.zzg5()) {
            return 0;
        }
        this.zzZSG = 0;
        if (this.zzZS1) {
            if (getName() == null) {
                this.zzZQK = new zzZN4(getName(), "");
            }
            zzga();
        } else {
            if (getName() != null && zzZNA.zzUJ(getName())) {
                this.zzZQK = new zzZN4(getName(), "");
            }
            if (zzga() == 255) {
                zzQs(255);
            } else if (zzga() != 8 && zzga() != 16 && zzga() != 4) {
                int iZzgW = zzzn3.zzgW();
                if (iZzgW == 255) {
                    zzQs(255);
                } else if (iZzgW != 256) {
                    zzQs(zzzn3.zzgW() & 30);
                } else {
                    zzQs(0);
                }
            } else {
                zzQs(zzga());
            }
        }
        zzZLF.zzZ(getId(), this, zzzn3.zzh0());
        zzZLM zzzlm = this.zzZS2;
        if (zzzlm != null) {
            zzzlm.zzZRc = this;
        }
        if (zzzlm != null) {
            if (zzzlm instanceof zzZLK) {
                this.zzZQL = 4;
                this.zzZSG = ((zzZLK) zzzlm).zzZ(zzzn3) + this.zzZSG;
            } else if (zzzlm instanceof zzZLL) {
                this.zzZQL = 8;
                this.zzZSG = ((zzZLL) zzzlm).zzZ(zzzn3) + this.zzZSG;
            } else if (zzzlm instanceof zzZLJ) {
                this.zzZQL = 16;
                this.zzZSG = ((zzZLJ) zzzlm).zzZ(zzzn3) + this.zzZSG;
            }
        }
        zzT(zzzn3.zzg5());
        return this.zzZSG;
    }

    public final void zzZ(Object obj, List<zzZLZ> list) {
        zzZLN zzzln = obj instanceof zzZLN ? (zzZLN) obj : null;
        int i = this.zzZS0;
        if (i == 4) {
            if (zzzln != null) {
                zzzln.zzfI();
                return;
            }
            return;
        }
        if (i != 8) {
            if (i == 16 && list != null) {
                for (zzZLZ zzzlz : list) {
                    if (!(zzzlz instanceof zzZMK)) {
                        boolean z = zzzlz instanceof zzZLV;
                    }
                }
                return;
            }
            return;
        }
        if (list != null) {
            for (zzZLZ zzzlz2 : list) {
                if (!(zzzlz2 instanceof zzZM7) && !(zzzlz2 instanceof zzZM4) && !(zzzlz2 instanceof zzZM1) && !(zzzlz2 instanceof zzZMK)) {
                    boolean z2 = zzzlz2 instanceof zzZLV;
                }
            }
        }
    }

    public final boolean zzZ(Object obj, zzZN3 zzzn3, boolean z) throws zzZMJ {
        if (this != obj && obj != zzZNE.zzV.zzhs() && obj != zzZMQ.zzgz()) {
            zzZLN zzzln = (zzZLN) obj;
            if (zzzln != null && (zzzln.zzfI() & this.zzZQL) != 0) {
                return false;
            }
            zzZLH zzzlh = this.zzZQN;
            if (zzzlh != obj && this.zzZQM != obj) {
                zzZLN zzzln2 = (zzZLN) zzzlh;
                if (zzzln2 != null && zzzln2.zzZ(obj, zzzn3, false)) {
                    return true;
                }
                int i = this.zzZS0;
                if ((i == 8 || i == 16) && obj == zzZNE.zzV.zzhs()) {
                    return true;
                }
                if (zzzln != null && zzzln.zzZS0 == 16) {
                    for (Object obj2 : ((zzZLJ) zzzln.zzZS2).zzfJ()) {
                        if (zzZ(obj2, zzzn3, false)) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }
}

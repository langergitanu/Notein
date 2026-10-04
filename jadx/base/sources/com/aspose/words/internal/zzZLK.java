package com.aspose.words.internal;

import com.aspose.words.internal.zzZNE;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZLK extends zzZLM {
    private zzZNR[] zzZQU;
    private String[] zzZQV;
    private String[] zzZQW;
    private Object zzZQY;
    private Object zzZQZ;
    private Object zzZR0;
    private Object zzZR1;
    private Integer zzZR2;
    private Integer zzZR3;
    private Integer zzZR4;
    private Integer zzZR5;
    private Integer zzZR6;
    private zzZLN zzZS5;
    private zzZN4 zzZUc;
    private List<zzZLZ> zzZR7 = new ArrayList();
    private int zzZQX = 0;

    private Object zzUp(String str) {
        if (zzfK() != null) {
            try {
                Object objZzUu = zzZMN.zzUu(str);
                if (this.zzZRc.zzfG() instanceof zzZLN) {
                    zzZLM zzzlmZzfP = ((zzZLN) this.zzZRc.zzfG()).zzfP() != null ? ((zzZLN) this.zzZRc.zzfG()).zzfP() : null;
                    if (zzzlmZzfP instanceof zzZLK) {
                        ((zzZLK) zzzlmZzfP).zzfL();
                    }
                }
                return objZzUu;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private zzZNE.zzV zzfK() {
        zzZLK zzzlk = this;
        while (true) {
            zzZNE.zzV zzv = zzzlk.zzZRc.zzfG() instanceof zzZNE.zzV ? (zzZNE.zzV) zzzlk.zzZRc.zzfG() : null;
            if (zzv != null) {
                return zzv;
            }
            zzZLM zzzlmZzfP = ((zzZLN) zzzlk.zzZRc.zzfG()).zzfP() != null ? ((zzZLN) zzzlk.zzZRc.zzfG()).zzfP() : null;
            if (!(zzzlmZzfP instanceof zzZLK)) {
                if (!(zzzlmZzfP instanceof zzZLL)) {
                    boolean z = zzzlmZzfP instanceof zzZLJ;
                }
                return null;
            }
            zzzlk = (zzZLK) zzzlmZzfP;
        }
    }

    private boolean zzfL() {
        zzZLN zzzln = this.zzZRc.zzfG() instanceof zzZLN ? (zzZLN) this.zzZRc.zzfG() : null;
        if (zzzln == null) {
            return true;
        }
        return true;
    }

    public static zzZLK zzk(zzZQR zzzqr) {
        zzZLK zzzlk = new zzZLK();
        for (int i = 0; i < zzzqr.getAttributeCount(); i++) {
            try {
                String strZzRu = zzzqr.zzRu(i);
                String attributeValue = zzzqr.getAttributeValue(i);
                if ("id".equals(strZzRu)) {
                    zzzlk.setId(attributeValue);
                } else if ("base".equals(strZzRu)) {
                    zzzlk.zzZUc = zzZLF.zzZ(zzzqr, i);
                } else {
                    zzzlk.zzZL(strZzRu, attributeValue);
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
            } else if (c > 1 || !"annotation".equals(zzzqr.getLocalName())) {
                if (c > 2 || !"simpleType".equals(zzzqr.getLocalName())) {
                    if (c > 3) {
                        break;
                    }
                    if ("minExclusive".equals(zzzqr.getLocalName())) {
                        zzzlk.zzZR7.add(zzZM3.zzw(zzzqr));
                    } else if ("minInclusive".equals(zzzqr.getLocalName())) {
                        zzzlk.zzZR7.add(zzZM2.zzv(zzzqr));
                    } else if ("maxExclusive".equals(zzzqr.getLocalName())) {
                        zzzlk.zzZR7.add(zzZM6.zzz(zzzqr));
                    } else if ("maxInclusive".equals(zzzqr.getLocalName())) {
                        zzzlk.zzZR7.add(zzZM5.zzy(zzzqr));
                    } else if ("totalDigits".equals(zzzqr.getLocalName())) {
                        zzzlk.zzZR7.add(zzZLI.zzi(zzzqr));
                    } else if ("fractionDigits".equals(zzzqr.getLocalName())) {
                        zzzlk.zzZR7.add(zzZMG.zzH(zzzqr));
                    } else if ("length".equals(zzzqr.getLocalName())) {
                        zzzlk.zzZR7.add(zzZM7.zzA(zzzqr));
                    } else if ("minLength".equals(zzzqr.getLocalName())) {
                        zzZM1 zzzm1Zzu = zzZM1.zzu(zzzqr);
                        if (zzzm1Zzu != null) {
                            zzzlk.zzZR7.add(zzzm1Zzu);
                        }
                    } else if ("maxLength".equals(zzzqr.getLocalName())) {
                        zzzlk.zzZR7.add(zzZM4.zzx(zzzqr));
                    } else if ("enumeration".equals(zzzqr.getLocalName())) {
                        zzzlk.zzZR7.add(zzZMK.zzI(zzzqr));
                    } else if (!"whiteSpace".equals(zzzqr.getLocalName())) {
                        if (!"pattern".equals(zzzqr.getLocalName())) {
                            break;
                        }
                        zzzlk.zzZR7.add(zzZLV.zzs(zzzqr));
                    } else {
                        zzzlk.zzZR7.add(zzZLE.zzg(zzzqr));
                    }
                } else {
                    zzzlk.zzZS5 = zzZLN.zzm(zzzqr);
                }
                c = 3;
            } else {
                zzzlk.zzZ(zzZN1.zzW(zzzqr));
                c = 2;
            }
        }
        return zzzlk;
    }

    public final Object zzY(zzZN3 zzzn3, boolean z) throws Exception {
        zzZLN zzzln = this.zzZS5;
        if (zzzln == null) {
            zzZLH zzzlhZzY = zzzn3.zzY(this.zzZUc);
            zzzln = zzzlhZzY instanceof zzZLN ? (zzZLN) zzzlhZzY : null;
        }
        if (zzzln != null) {
            if (z) {
                this.zzZSG = zzzln.zzY(zzzn3) + this.zzZSG;
            }
            return zzzln;
        }
        zzZN4 zzzn4 = this.zzZUc;
        if (zzzn4 == zzZMQ.zzZU2) {
            return zzZLN.zzfN();
        }
        if (zzzn4.getNamespace().equals("http://www.w3.org/2001/XMLSchema") || this.zzZUc.getNamespace().equals("http://www.w3.org/2003/11/xpath-datatypes")) {
            zzZMN zzzmnZzU = zzZMN.zzU(this.zzZUc);
            if (zzzmnZzU == null && z) {
                new StringBuilder("Invalid schema type name was specified: ").append(this.zzZUc);
            }
            return zzzmnZzU;
        }
        if (!zzzn3.zzUy(this.zzZUc.getNamespace()) && z) {
            StringBuilder sb = new StringBuilder("Referenced base schema type ");
            sb.append(this.zzZUc);
            sb.append(" was not found in the corresponding schema.");
        }
        return null;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final int zzZ(zzZN3 zzzn3) {
        if (zzg5() == zzzn3.zzg5()) {
            return 0;
        }
        this.zzZSG = 0;
        if (this.zzZS5 != null) {
            this.zzZUc.isEmpty();
        }
        if (this.zzZS5 == null) {
            this.zzZUc.isEmpty();
        }
        zzZLN zzzln = this.zzZS5;
        if (zzzln != null) {
            this.zzZSG = zzzln.zzZ(zzzn3) + this.zzZSG;
        }
        zzZLF.zzZ(getId(), this, zzzn3.zzh0());
        for (int i = 0; i < this.zzZR7.size(); i++) {
            boolean z = this.zzZR7.get(i) instanceof zzZMH;
        }
        zzT(zzzn3.zzg5());
        return this.zzZSG;
    }

    public final List<zzZLZ> zzfM() {
        return this.zzZR7;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    @Override // com.aspose.words.internal.zzZLZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzY(zzZN3 zzzn3) throws Exception {
        zzZLK zzzlk;
        String str;
        if (zzS(zzzn3.zzZSD)) {
            return this.zzZSG;
        }
        zzY(zzzn3, true);
        this.zzZR2 = -1;
        this.zzZR3 = -1;
        this.zzZR4 = -1;
        this.zzZR5 = -1;
        this.zzZR6 = -1;
        if (this.zzZRc.zzfG() instanceof zzZLN) {
            zzZLM zzzlmZzfP = ((zzZLN) this.zzZRc.zzfG()).zzfP() != null ? ((zzZLN) this.zzZRc.zzfG()).zzfP() : null;
            if (zzzlmZzfP instanceof zzZLK) {
                zzzlk = (zzZLK) zzzlmZzfP;
            }
        } else {
            zzzlk = null;
        }
        if (zzzlk != null) {
            this.zzZQX = zzzlk.zzZQX;
            this.zzZR6 = zzzlk.zzZR6;
            this.zzZR5 = zzzlk.zzZR5;
            this.zzZR4 = zzzlk.zzZR4;
            this.zzZR3 = zzzlk.zzZR3;
            this.zzZR2 = zzzlk.zzZR2;
            this.zzZR1 = zzzlk.zzZR1;
            this.zzZR0 = zzzlk.zzZR0;
            this.zzZQZ = zzzlk.zzZQZ;
            this.zzZQY = zzzlk.zzZQY;
        }
        this.zzZQV = null;
        this.zzZQW = null;
        this.zzZQU = null;
        int iZzgn = 0;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (int i = 0; i < this.zzZR7.size(); i++) {
            zzZMH zzzmh = this.zzZR7.get(i) instanceof zzZMH ? (zzZMH) this.zzZR7.get(i) : null;
            if (zzzmh != null) {
                if (!zzY(zzzmh)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(zzzmh.getClass().getSimpleName());
                    sb.append(". type=");
                    sb.append(zzzmh.zzgn());
                    sb.append(" is not a valid facet for this type");
                } else {
                    zzZMK zzzmk = this.zzZR7.get(i) instanceof zzZMK ? (zzZMK) this.zzZR7.get(i) : null;
                    if (zzzmk != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(zzzmk.getValue());
                    } else {
                        zzZLV zzzlv = this.zzZR7.get(i) instanceof zzZLV ? (zzZLV) this.zzZR7.get(i) : null;
                        if (zzzlv != null) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(zzzlv.getValue());
                        } else if ((zzzmh.zzgn() & iZzgn) != 0) {
                            StringBuilder sb2 = new StringBuilder("This is a duplicate '");
                            sb2.append(zzzmh.zzgn());
                            sb2.append("' facet.");
                        } else {
                            iZzgn |= zzzmh.zzgn();
                            if (zzzmh instanceof zzZM7) {
                                zzZ((zzZM7) zzzmh, iZzgn);
                            } else if (zzzmh instanceof zzZM4) {
                                zzZ((zzZM4) zzzmh, iZzgn);
                            } else if (zzzmh instanceof zzZM1) {
                                zzZ((zzZM1) zzzmh);
                            } else if (zzzmh instanceof zzZM2) {
                                this.zzZQZ = zzZ((zzZM2) zzzmh, this.zzZQZ);
                            } else if (zzzmh instanceof zzZM5) {
                                this.zzZR1 = zzZ((zzZM5) zzzmh, this.zzZR1);
                            } else if (zzzmh instanceof zzZM3) {
                                this.zzZQY = zzZ((zzZM3) zzzmh, this.zzZQY);
                            } else if (zzzmh instanceof zzZM6) {
                                this.zzZR0 = zzZ((zzZM6) zzzmh, this.zzZR0);
                            } else if (zzzmh instanceof zzZMG) {
                                zzZ((zzZMG) zzzmh);
                            } else if (zzzmh instanceof zzZLI) {
                                zzZ((zzZLI) zzzmh);
                            }
                            if (zzzmh.isFixed()) {
                                this.zzZQX = zzzmh.zzgn() | this.zzZQX;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList != null) {
            this.zzZQW = (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        if (arrayList2 != null) {
            this.zzZQV = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
            this.zzZQU = new zzZNR[arrayList2.size()];
            int i2 = 0;
            while (true) {
                String[] strArr = this.zzZQV;
                if (i2 >= strArr.length) {
                    break;
                }
                try {
                    String string = strArr[i2];
                    int i3 = 0;
                    StringBuilder sb3 = null;
                    for (int i4 = 0; i4 < string.length(); i4++) {
                        if (string.charAt(i4) == '\\' && string.length() > i2 + 1) {
                            char cCharAt = string.charAt(i4 + 1);
                            if (cCharAt == 'C') {
                                str = "[^\\p{L}\\p{N}_\\.\\-:]";
                            } else if (cCharAt == 'I') {
                                str = "[^\\p{L}_]";
                            } else if (cCharAt != 'c') {
                                str = cCharAt != 'i' ? null : "[\\p{L}_]";
                            } else {
                                str = "[\\p{L}\\p{N}_\\.\\-:]";
                            }
                            if (str != null) {
                                if (sb3 == null) {
                                    sb3 = new StringBuilder();
                                }
                                sb3.append((CharSequence) string, i3, i4 - i3);
                                sb3.append(str);
                                i3 = i4 + 2;
                            }
                        }
                    }
                    if (sb3 != null) {
                        sb3.append((CharSequence) string, i3, string.length() - i3);
                        string = sb3.toString();
                    }
                    this.zzZQU[i2] = new zzZNR("^" + string + "$");
                } catch (Exception e) {
                    new StringBuilder("Invalid regular expression pattern was specified.").append(e.getMessage());
                }
                i2++;
            }
        }
        this.zzZSD = zzzn3.zzZSD;
        return this.zzZSG;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final void zzZ(zzZLZ zzzlz) {
        super.zzZ(zzzlz);
        zzZLN zzzln = this.zzZS5;
        if (zzzln != null) {
            zzzln.zzZ(this);
        }
        Iterator<zzZLZ> it = this.zzZR7.iterator();
        while (it.hasNext()) {
            it.next().zzZ(this);
        }
    }

    private void zzZ(zzZLI zzzli) {
        if (zzzli != null) {
            try {
                int i = Integer.parseInt(zzzli.getValue().trim());
                Integer numValueOf = Integer.valueOf(i);
                if (i <= 0) {
                    zzZKN.format("The value '{0}' is an invalid totalDigits value", numValueOf);
                }
                if (this.zzZR2.intValue() > 0 && i > this.zzZR2.intValue()) {
                    zzZKN.format("The value '{0}' is not a valid restriction of the base totalDigits facet '{1}'", numValueOf, this.zzZR2);
                }
                this.zzZR2 = numValueOf;
            } catch (NumberFormatException unused) {
                zzZKN.format("The value '{0}' is an invalid totalDigits facet specification", zzzli.getValue().trim());
            }
        }
    }

    private void zzZ(zzZMG zzzmg) {
        if (zzzmg != null) {
            try {
                int i = Integer.parseInt(zzzmg.getValue().trim());
                Integer numValueOf = Integer.valueOf(i);
                if (i < 0) {
                    zzZKN.format("The value '{0}' is an invalid fractionDigits value", numValueOf);
                }
                if (this.zzZR3.intValue() >= 0 && i > this.zzZR3.intValue()) {
                    zzZKN.format("The value '{0}' is not a valid restriction of the base fractionDigits facet '{1}'", numValueOf, this.zzZR3);
                }
                this.zzZR3 = numValueOf;
            } catch (NumberFormatException unused) {
                zzZKN.format("The value '{0}' is an invalid fractionDigits facet specification", zzzmg.getValue().trim());
            }
        }
    }

    private Object zzZ(zzZMH zzzmh, Object obj) {
        Object objZzUp = zzUp(zzzmh.getValue());
        if (objZzUp != null) {
            if ((this.zzZQX & zzzmh.zzgn()) != 0 && obj != null) {
                zzfK();
                zzZNE.zzV.zzhr();
                zzZKN.format("{0} is not the same as fixed parent {1} facet.", zzzmh.getValue(), Integer.valueOf(zzzmh.zzgn()));
            }
            return objZzUp;
        }
        zzZKN.format("The value '{0}' is not valid against the base type.", zzzmh.getValue());
        return null;
    }

    private void zzZ(zzZM1 zzzm1) {
        if (zzzm1 != null) {
            try {
                if (this.zzZR6.intValue() >= 0) {
                    return;
                }
                int i = Integer.parseInt(zzzm1.getValue().trim());
                Integer numValueOf = Integer.valueOf(i);
                if ((this.zzZQX & 2) != 0 && !numValueOf.equals(this.zzZR4)) {
                    zzZKN.format("The value '{0}' is not the same as the fixed value '{1}' on the base type", zzzm1.getValue().trim(), this.zzZR4);
                }
                if (i < this.zzZR4.intValue()) {
                    zzZKN.format("The value '{0}' is not a valid restriction of the value '{1}' on the base minLength facet", zzzm1.getValue().trim(), this.zzZR4);
                } else {
                    this.zzZR4 = numValueOf;
                }
                if (this.zzZR4.intValue() < 0) {
                    StringBuilder sb = new StringBuilder("The value '");
                    sb.append(this.zzZR4);
                    sb.append("' is an invalid minLength");
                }
                if (this.zzZR5.intValue() >= 0) {
                    this.zzZR4.intValue();
                    this.zzZR5.intValue();
                }
            } catch (NumberFormatException e) {
                zzZHV.zzZ(e);
                StringBuilder sb2 = new StringBuilder("The value '");
                sb2.append(zzzm1.getValue());
                sb2.append("' is an invalid minLength facet specification");
            }
        }
    }

    private void zzZ(zzZM4 zzzm4, int i) {
        if (zzzm4 == null || (i & 1) != 0) {
            return;
        }
        try {
            int i2 = Integer.parseInt(zzzm4.getValue().trim());
            Integer numValueOf = Integer.valueOf(i2);
            if ((this.zzZQX & 4) != 0 && !numValueOf.equals(this.zzZR5)) {
                zzZKN.format("The value '{0}' is not the same as the fixed value '{1}' on the base type", zzzm4.getValue().trim(), this.zzZR5);
            }
            if (this.zzZR5.intValue() > 0 && i2 > this.zzZR5.intValue()) {
                zzZKN.format("The value '{0}' is not a valid restriction of the value '{1}' on the base maxLength facet", zzzm4.getValue().trim(), this.zzZR5);
            } else {
                this.zzZR5 = numValueOf;
            }
            if (this.zzZR5.intValue() < 0) {
                StringBuilder sb = new StringBuilder("The value '");
                sb.append(this.zzZR5);
                sb.append("' is an invalid maxLength");
            }
            if (this.zzZR4.intValue() >= 0) {
                this.zzZR4.intValue();
                this.zzZR5.intValue();
            }
        } catch (NumberFormatException e) {
            zzZHV.zzZ(e);
            StringBuilder sb2 = new StringBuilder("The value '");
            sb2.append(zzzm4.getValue());
            sb2.append("' is an invalid maxLength facet specification");
        }
    }

    private void zzZ(zzZM7 zzzm7, int i) {
        if (zzzm7 == null || (i & 6) != 0) {
            return;
        }
        try {
            Integer numValueOf = Integer.valueOf(Integer.parseInt(zzzm7.getValue().trim()));
            this.zzZR6 = numValueOf;
            if (numValueOf.intValue() < 0) {
                StringBuilder sb = new StringBuilder("The value '");
                sb.append(this.zzZR6);
                sb.append("' is an invalid length");
            }
        } catch (NumberFormatException e) {
            zzZHV.zzZ(e);
            StringBuilder sb2 = new StringBuilder("The value '");
            sb2.append(zzzm7.getValue());
            sb2.append("' is an invalid length facet specification, ");
            sb2.append(e.getMessage());
        }
    }

    private boolean zzY(zzZMH zzzmh) {
        zzZLM zzzlmZzfP;
        zzZLK zzzlk = this;
        while (true) {
            if ((zzzlk.zzZRc.zzfG() instanceof zzZNE.zzV ? (zzZNE.zzV) zzzlk.zzZRc.zzfG() : null) != null) {
                return zzZNE.zzV.zzZ(zzzmh);
            }
            if (zzzlk.zzZRc.zzfG() == null) {
                break;
            }
            zzzlmZzfP = ((zzZLN) zzzlk.zzZRc.zzfG()).zzfP() != null ? ((zzZLN) zzzlk.zzZRc.zzfG()).zzfP() : null;
            if (zzzlmZzfP == null) {
                break;
            }
            zzZLK zzzlk2 = zzzlmZzfP instanceof zzZLK ? (zzZLK) zzzlmZzfP : null;
            if (zzzlk2 == null || zzzlk2 == zzzlk) {
                break;
            }
            zzzlk = zzzlk2;
        }
        if ((zzzlmZzfP instanceof zzZLL ? (zzZLL) zzzlmZzfP : null) != null) {
            return (zzzmh.zzgn() & 63) != 0;
        }
        if ((zzzlmZzfP instanceof zzZLJ ? (zzZLJ) zzzlmZzfP : null) != null) {
            return (zzzmh instanceof zzZLV) || (zzzmh instanceof zzZMK);
        }
        return false;
    }
}

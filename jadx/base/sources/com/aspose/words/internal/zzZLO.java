package com.aspose.words.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZLO extends zzZMP {
    private zzZLN zzZS5;
    private zzZMZ zzZUd;
    final String zzZUI = "restriction";
    private zzZN4 zzZUc = zzZN4.zzZV6;
    private zzZLY zzZUk = new zzZLY();
    private zzZLY zzZS4 = new zzZLY();

    public static zzZLO zzn(zzZQR zzzqr) {
        zzZLO zzzlo = new zzZLO();
        for (int i = 0; i < zzzqr.getAttributeCount(); i++) {
            try {
                String strZzRu = zzzqr.zzRu(i);
                String attributeValue = zzzqr.getAttributeValue(i);
                if ("base".equals(strZzRu)) {
                    zzzlo.zzZUc = zzZLF.zzZ(zzzqr, i);
                } else if ("id".equals(strZzRu)) {
                    zzzlo.setId(attributeValue);
                } else {
                    zzzlo.zzZL(strZzRu, attributeValue);
                }
            } catch (Exception e) {
                zzZHV.zzY(e);
            }
        }
        char c = 1;
        while (zzzqr.hasNext()) {
            zzzqr.next();
            int eventType = zzzqr.getEventType();
            char c2 = 2;
            if (eventType != 1) {
                if (eventType == 2) {
                    break;
                }
            } else {
                if (c > 1 || !"annotation".equals(zzzqr.getLocalName())) {
                    if (c > 2 || !"simpleType".equals(zzzqr.getLocalName())) {
                        if (c <= 3) {
                            if ("minExclusive".equals(zzzqr.getLocalName())) {
                                zzzlo.zzZS4.zzW(zzZM3.zzw(zzzqr));
                            } else if ("minInclusive".equals(zzzqr.getLocalName())) {
                                zzzlo.zzZS4.zzW(zzZM2.zzv(zzzqr));
                            } else if ("maxExclusive".equals(zzzqr.getLocalName())) {
                                zzzlo.zzZS4.zzW(zzZM6.zzz(zzzqr));
                            } else if ("maxInclusive".equals(zzzqr.getLocalName())) {
                                zzzlo.zzZS4.zzW(zzZM5.zzy(zzzqr));
                            } else if ("totalDigits".equals(zzzqr.getLocalName())) {
                                zzzlo.zzZS4.zzW(zzZLI.zzi(zzzqr));
                            } else if ("fractionDigits".equals(zzzqr.getLocalName())) {
                                zzzlo.zzZS4.zzW(zzZMG.zzH(zzzqr));
                            } else if ("length".equals(zzzqr.getLocalName())) {
                                zzzlo.zzZS4.zzW(zzZM7.zzA(zzzqr));
                            } else if ("minLength".equals(zzzqr.getLocalName())) {
                                zzZM1 zzzm1Zzu = zzZM1.zzu(zzzqr);
                                if (zzzm1Zzu != null) {
                                    zzzlo.zzZS4.zzW(zzzm1Zzu);
                                }
                            } else if ("maxLength".equals(zzzqr.getLocalName())) {
                                zzzlo.zzZS4.zzW(zzZM4.zzx(zzzqr));
                            } else if ("enumeration".equals(zzzqr.getLocalName())) {
                                zzzlo.zzZS4.zzW(zzZMK.zzI(zzzqr));
                            } else if ("whiteSpace".equals(zzzqr.getLocalName())) {
                                zzzlo.zzZS4.zzW(zzZLE.zzg(zzzqr));
                            } else if ("pattern".equals(zzzqr.getLocalName())) {
                                zzzlo.zzZS4.zzW(zzZLV.zzs(zzzqr));
                            }
                        }
                        c2 = 4;
                        if (c <= 4) {
                            if ("attribute".equals(zzzqr.getLocalName())) {
                                zzzlo.zzZUk.zzW(zzZMX.zzS(zzzqr));
                            } else if ("attributeGroup".equals(zzzqr.getLocalName())) {
                                zzzlo.zzZUk.zzW(zzZMV.zzQ(zzzqr));
                            }
                        }
                        if (c > 5 || !"anyAttribute".equals(zzzqr.getLocalName())) {
                            break;
                        }
                        zzzlo.zzZUd = zzZMZ.zzU(zzzqr);
                        c = 6;
                    } else {
                        zzzlo.zzZS5 = zzZLN.zzm(zzzqr);
                    }
                    c = 3;
                } else {
                    zzzlo.zzZ(zzZN1.zzW(zzzqr));
                }
                c = c2;
            }
        }
        return zzzlo;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final int zzY(zzZN3 zzzn3) throws Exception {
        if (zzS(zzzn3.zzZSD)) {
            return this.zzZSG;
        }
        zzZLN zzzln = this.zzZS5;
        if (zzzln != null) {
            zzzln.zzY(zzzn3);
            this.zzZU0 = this.zzZS5;
        } else {
            zzZN4 zzzn4 = this.zzZUc;
            if (zzzn4 != zzZN4.zzZV6) {
                zzZLH zzzlhZzY = zzzn3.zzY(zzzn4);
                if (zzzlhZzY != null) {
                    zzzlhZzY.zzY(zzzn3);
                    this.zzZU0 = zzzlhZzY;
                } else {
                    zzZN4 zzzn42 = this.zzZUc;
                    if (zzzn42 == zzZMQ.zzZU2) {
                        this.zzZU0 = zzZMQ.zzgz();
                    } else if (zzZLF.zzP(zzzn42)) {
                        this.zzZU0 = zzZMN.zzU(this.zzZUc);
                    } else if (!zzzn3.zzUy(this.zzZUc.getNamespace())) {
                        StringBuilder sb = new StringBuilder("Referenced base schema type ");
                        sb.append(this.zzZUc);
                        sb.append(" was not found in the corresponding schema.");
                    }
                }
            }
        }
        this.zzZSD = zzzn3.zzZSD;
        return this.zzZSG;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final int zzZ(zzZN3 zzzn3) {
        if (zzg5() == zzzn3.zzg5()) {
            return 0;
        }
        if (this.zzZSF) {
            if (zzg8() != null) {
                zzg8().zzZSF = true;
            }
            zzZMZ zzzmz = this.zzZUd;
            if (zzzmz != null) {
                zzzmz.zzZSF = true;
            }
            Iterator<zzZLZ> it = this.zzZUk.iterator();
            while (it.hasNext()) {
                it.next().zzZSF = true;
            }
        }
        zzZN4 zzzn4 = this.zzZUc;
        if (zzzn4 != null) {
            zzzn4.isEmpty();
        }
        zzZLN zzzln = this.zzZS5;
        if (zzzln != null) {
            this.zzZSG = zzzln.zzZ(zzzn3) + this.zzZSG;
        }
        zzZMZ zzzmz2 = this.zzZUd;
        if (zzzmz2 != null) {
            this.zzZSG = zzzmz2.zzZ(zzzn3) + this.zzZSG;
        }
        for (zzZLZ zzzlz : this.zzZUk) {
            if (zzzlz instanceof zzZMX) {
                this.zzZSG = ((zzZMX) zzzlz).zzZ(zzzn3) + this.zzZSG;
            } else if (zzzlz instanceof zzZMV) {
                this.zzZSG = ((zzZMV) zzzlz).zzZ(zzzn3) + this.zzZSG;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(zzzlz.getClass());
                sb.append(" is not valid in this place::SimpleContentRestriction");
            }
        }
        zzZLF.zzZ(getId(), this, zzzn3.zzh0());
        zzT(zzzn3.zzg5());
        return this.zzZSG;
    }

    public final zzZLN zzfQ() {
        return this.zzZS5;
    }

    public final zzZMZ zzgD() {
        return this.zzZUd;
    }

    public final zzZLY zzgE() {
        return this.zzZUk;
    }

    @Override // com.aspose.words.internal.zzZMP
    public final zzZN4 zzgv() {
        return this.zzZUc;
    }
}

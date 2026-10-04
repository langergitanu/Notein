package com.aspose.words.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZMW extends zzZLZ {
    boolean zzZUg;
    private zzZMZ zzZUh;
    private zzZLX zzZUi;
    private zzZMW zzZUj;
    private zzZMZ zzZUl;
    private zzZLY zzZUk = new zzZLY();
    private zzZN4 zzZUq = zzZN4.zzZV6;

    public static zzZMW zzR(zzZQR zzzqr) {
        zzZMW zzzmw = new zzZMW();
        for (int i = 0; i < zzzqr.getAttributeCount(); i++) {
            try {
                String strZzRu = zzzqr.zzRu(i);
                String attributeValue = zzzqr.getAttributeValue(i);
                if ("id".equals(strZzRu)) {
                    zzzmw.setId(attributeValue);
                } else if ("name".equals(strZzRu)) {
                    zzzmw.setName(attributeValue);
                } else {
                    zzzmw.zzZL(strZzRu, attributeValue);
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
            } else {
                if (c > 1 || !"annotation".equals(zzzqr.getLocalName())) {
                    if (c <= 2) {
                        if ("attribute".equals(zzzqr.getLocalName())) {
                            zzzmw.zzZUk.zzW(zzZMX.zzS(zzzqr));
                        } else if ("attributeGroup".equals(zzzqr.getLocalName())) {
                            zzzmw.zzZUk.zzW(zzZMV.zzQ(zzzqr));
                        }
                    }
                    if (c > 3 || !"anyAttribute".equals(zzzqr.getLocalName())) {
                        break;
                    }
                    zzzmw.zzZUl = zzZMZ.zzU(zzzqr);
                    c = 4;
                } else {
                    zzzmw.zzZ(zzZN1.zzW(zzzqr));
                }
                c = 2;
            }
        }
        return zzzmw;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final int zzY(zzZN3 zzzn3) throws Exception {
        zzZLZ zzzlz;
        if (zzS(zzzn3.zzg5())) {
            return this.zzZSG;
        }
        if (this.zzZUj == null && (zzzlz = this.zzZSB) != null) {
            zzzlz.zzZ(zzzn3);
            zzZMW zzzmw = (zzZMW) this.zzZSB;
            this.zzZUj = zzzmw;
            zzzmw.zzY(zzzn3);
        }
        zzZLY zzzly = this.zzZUk;
        zzZLX zzzlx = new zzZLX();
        this.zzZUi = zzzlx;
        zzZMZ[] zzzmzArr = {this.zzZUh};
        int iZzZ = this.zzZSG + zzZLF.zzZ(zzzlx, zzzn3, zzzly, this.zzZUl, zzzmzArr, this.zzZUj, false);
        this.zzZSG = iZzZ;
        this.zzZUh = zzzmzArr[0];
        this.zzZSD = zzzn3.zzZSD;
        return iZzZ;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final void zzZ(zzZLZ zzzlz) {
        super.zzZ(zzzlz);
        zzZMZ zzzmz = this.zzZUl;
        if (zzzmz != null) {
            zzzmz.zzZ(this);
        }
        Iterator<zzZLZ> it = this.zzZUk.iterator();
        while (it.hasNext()) {
            it.next().zzZ(this);
        }
    }

    public final zzZLX zzgG() {
        return this.zzZUi;
    }

    public final zzZMZ zzgH() {
        return this.zzZUh;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final int zzZ(zzZN3 zzzn3) {
        if (zzg5() == zzzn3.zzg5()) {
            return this.zzZSG;
        }
        this.zzZSG = 0;
        if (this.zzZSB != null) {
            int iZzZ = this.zzZUj.zzZ(zzzn3);
            this.zzZSG = iZzZ;
            if (iZzZ == 0) {
                this.zzZUj = (zzZMW) this.zzZSB;
            }
        }
        zzZLF.zzZ(getId(), this, zzzn3.zzh0());
        if (getName() != null && !"".equals(getName()) && zzZNA.zzUJ(getName())) {
            this.zzZUq = new zzZN4(getName(), "");
        }
        zzZMZ zzzmz = this.zzZUl;
        if (zzzmz != null) {
            this.zzZSG = zzzmz.zzZ(zzzn3) + this.zzZSG;
        }
        for (zzZLZ zzzlz : this.zzZUk) {
            if (zzzlz instanceof zzZMX) {
                this.zzZSG = ((zzZMX) zzzlz).zzZ(zzzn3) + this.zzZSG;
            } else if (zzzlz instanceof zzZMV) {
                this.zzZSG = ((zzZMV) zzzlz).zzZ(zzzn3) + this.zzZSG;
            }
        }
        zzT(zzzn3.zzg5());
        return this.zzZSG;
    }
}

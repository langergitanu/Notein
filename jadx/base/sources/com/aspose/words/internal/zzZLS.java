package com.aspose.words.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZLS extends zzZME {
    public static zzZLS zzq(zzZQR zzzqr) {
        zzZLS zzzls = new zzZLS();
        for (int i = 0; i < zzzqr.getAttributeCount(); i++) {
            try {
                String strZzRu = zzzqr.zzRu(i);
                String attributeValue = zzzqr.getAttributeValue(i);
                if ("id".equals(strZzRu)) {
                    zzzls.setId(attributeValue);
                } else if ("maxOccurs".equals(strZzRu)) {
                    zzzls.zzUr(attributeValue);
                } else if ("minOccurs".equals(strZzRu)) {
                    zzzls.zzUs(attributeValue);
                } else {
                    zzzls.zzZL(strZzRu, attributeValue);
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
                    if (c > 2) {
                        break;
                    }
                    if ("element".equals(zzzqr.getLocalName())) {
                        zzzls.zzgc().zzW(zzZML.zzJ(zzzqr));
                    } else if ("group".equals(zzzqr.getLocalName())) {
                        zzzls.zzgc().zzW(zzZMD.zzF(zzzqr));
                    } else if ("choice".equals(zzzqr.getLocalName())) {
                        zzzls.zzgc().zzW(zzZMU.zzP(zzzqr));
                    } else if (!"sequence".equals(zzzqr.getLocalName())) {
                        if (!"any".equals(zzzqr.getLocalName())) {
                            break;
                        }
                        zzzls.zzgc().zzW(zzZN0.zzV(zzzqr));
                    } else {
                        zzzls.zzgc().zzW(zzq(zzzqr));
                    }
                } else {
                    zzzls.zzZ(zzZN1.zzW(zzzqr));
                }
                c = 2;
            }
        }
        return zzzls;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final int zzY(zzZN3 zzzn3) throws Exception {
        if (zzS(zzzn3.zzg5())) {
            return this.zzZSG;
        }
        zzgi().clear();
        for (zzZLZ zzzlz : zzgc()) {
            this.zzZSG = zzzlz.zzY(zzzn3) + this.zzZSG;
            zzgi().zzW(zzzlz);
        }
        this.zzZSD = zzzn3.zzZSD;
        return this.zzZSG;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final void zzZ(zzZLZ zzzlz) {
        super.zzZ(zzzlz);
        Iterator<zzZLZ> it = zzgc().iterator();
        while (it.hasNext()) {
            it.next().zzZ(this);
        }
    }

    @Override // com.aspose.words.internal.zzZLW
    public final zzZLW zzZ3(boolean z) throws Exception {
        zzZLW zzzlw = this.zzZSd;
        if (zzzlw != null) {
            return zzzlw;
        }
        if (zzgc().getCount() == 0 || this.zzZSh.intValue() == 0) {
            zzZLW zzzlw2 = zzZLW.zzZSj;
            this.zzZSd = zzzlw2;
            return zzzlw2;
        }
        if (!z && this.zzZSi.intValue() == 1 && this.zzZSh.intValue() == 1 && zzgc().getCount() == 1) {
            return ((zzZLW) zzgc().zzQt(0)).zzZ3(false);
        }
        zzZLS zzzls = new zzZLS();
        zzY((zzZLW) zzzls);
        for (int i = 0; i < zzgc().getCount(); i++) {
            zzZLW zzzlwZzZ3 = ((zzZLW) zzgc().zzQt(i)).zzZ3(false);
            if (zzzlwZzZ3 != zzZLW.zzZSj) {
                if ((zzzlwZzZ3 instanceof zzZLS) && zzzlwZzZ3.zzZSi.intValue() == 1 && zzzlwZzZ3.zzZSh.intValue() == 1) {
                    zzZLS zzzls2 = (zzZLS) zzzlwZzZ3;
                    for (int i2 = 0; i2 < zzzls2.zzgc().getCount(); i2++) {
                        zzzls.zzgc().zzW(zzzls2.zzgc().zzQt(i2));
                        zzzls.zzgi().zzW(zzzls2.zzgc().zzQt(i2));
                    }
                } else {
                    zzzls.zzgc().zzW(zzzlwZzZ3);
                    zzzls.zzgi().zzW(zzzlwZzZ3);
                }
            }
        }
        if (zzzls.zzgc().getCount() == 0) {
            this.zzZSd = zzZLW.zzZSj;
        } else {
            this.zzZSd = zzzls;
        }
        return this.zzZSd;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final int zzZ(zzZN3 zzzn3) {
        if (zzg5() == zzzn3.zzg5()) {
            return 0;
        }
        zzZLF.zzZ(getId(), this, zzzn3.zzh0());
        zzg1();
        for (zzZLZ zzzlz : zzgc()) {
            if ((zzzlz instanceof zzZML) || (zzzlz instanceof zzZMD) || (zzzlz instanceof zzZMU) || (zzzlz instanceof zzZLS) || (zzzlz instanceof zzZN0)) {
                this.zzZSG = zzzlz.zzZ(zzzn3) + this.zzZSG;
            }
        }
        zzT(zzzn3.zzg5());
        return this.zzZSG;
    }

    @Override // com.aspose.words.internal.zzZLW
    public final void zzZ(zzZLX zzzlx, zzZN3 zzzn3) {
        Iterator<zzZLZ> it = zzgc().iterator();
        while (it.hasNext()) {
            ((zzZLW) it.next()).zzZ(zzzlx, zzzn3);
        }
    }
}

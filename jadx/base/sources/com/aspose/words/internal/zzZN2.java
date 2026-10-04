package com.aspose.words.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZN2 extends zzZME {
    private zzZN3 zzZUG;
    private boolean zzZUH;
    final String zzZUI = "all";

    public static zzZN2 zzX(zzZQR zzzqr) {
        zzZN2 zzzn2 = new zzZN2();
        for (int i = 0; i < zzzqr.getAttributeCount(); i++) {
            try {
                String strZzRu = zzzqr.zzRu(i);
                String attributeValue = zzzqr.getAttributeValue(i);
                if ("id".equals(strZzRu)) {
                    zzzn2.setId(attributeValue);
                } else if ("maxOccurs".equals(strZzRu)) {
                    zzzn2.zzUr(attributeValue);
                } else if ("minOccurs".equals(strZzRu)) {
                    zzzn2.zzUs(attributeValue);
                } else {
                    zzzn2.zzZL(strZzRu, attributeValue);
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
                if (c <= 1 && "annotation".equals(zzzqr.getLocalName())) {
                    zzzn2.zzZ(zzZN1.zzW(zzzqr));
                } else {
                    if (c > 2 || !"element".equals(zzzqr.getLocalName())) {
                        break;
                    }
                    zzzn2.zzgc().zzW(zzZML.zzJ(zzzqr));
                }
                c = 2;
            }
        }
        return zzzn2;
    }

    private void zzgT() {
        this.zzZUH = true;
        for (int i = 0; i < zzgc().getCount(); i++) {
            if (((zzZLW) zzgc().zzQt(i)).zzZSi.intValue() > 0) {
                this.zzZUH = false;
                return;
            }
        }
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final int zzY(zzZN3 zzzn3) throws Exception {
        if (zzS(zzzn3.zzg5())) {
            return this.zzZSG;
        }
        if (!this.zzZSe) {
            this.zzZSh.intValue();
        }
        zzgi().clear();
        for (zzZLZ zzzlz : zzgc()) {
            this.zzZSG = zzzlz.zzY(zzzn3) + this.zzZSG;
            zzZLW zzzlw = (zzZLW) zzzlz;
            if (zzzlw.zzZSh.intValue() != 0) {
                zzzlw.zzZSh.intValue();
            }
            zzgi().zzW(zzzlz);
        }
        zzgT();
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
        if (zzgc().getCount() != 1 || this.zzZSi.intValue() != 1 || this.zzZSh.intValue() != 1) {
            zzZN2 zzzn2 = new zzZN2();
            zzY((zzZLW) zzzn2);
            zzZ((zzZME) zzzn2);
            this.zzZSd = zzzn2;
            zzzn2.zzgT();
            return this.zzZSd;
        }
        zzZLS zzzls = new zzZLS();
        zzY((zzZLW) zzzls);
        zzZLW zzzlwZzZ3 = ((zzZLW) zzgc().zzQt(0)).zzZ3(false);
        if (zzzlwZzZ3 == zzZLW.zzZSj) {
            this.zzZSd = zzzlwZzZ3;
        } else {
            zzzls.zzgc().zzW(zzzlwZzZ3);
            zzzls.zzgi().zzW(zzzlwZzZ3);
            zzzls.zzZ(this.zzZUG);
            this.zzZSd = zzzls;
        }
        return this.zzZSd;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final int zzZ(zzZN3 zzzn3) {
        if (zzg5() == zzzn3.zzg5()) {
            return 0;
        }
        this.zzZUG = zzzn3;
        this.zzZSm.intValue();
        if (this.zzZSn.intValue() != 1) {
            this.zzZSn.intValue();
        }
        zzZLF.zzZ(getId(), this, zzzn3.zzh0());
        zzg1();
        for (zzZLZ zzzlz : zzgc()) {
            zzZML zzzml = zzzlz instanceof zzZML ? (zzZML) zzzlz : null;
            if (zzzml != null) {
                if (zzzml.zzZSh.intValue() != 1) {
                    zzzml.zzZSh.intValue();
                }
                this.zzZSG = zzzml.zzZ(zzzn3) + this.zzZSG;
            }
        }
        zzT(zzzn3.zzg5());
        return this.zzZSG;
    }
}

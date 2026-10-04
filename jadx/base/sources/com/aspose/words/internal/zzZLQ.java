package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZLQ extends zzZMO {
    String zzZUI = "simpleContent";
    private zzZMP zzZUf;

    public static zzZLQ zzp(zzZQR zzzqr) {
        zzZLQ zzzlq = new zzZLQ();
        for (int i = 0; i < zzzqr.getAttributeCount(); i++) {
            try {
                String strZzRu = zzzqr.zzRu(i);
                String attributeValue = zzzqr.getAttributeValue(i);
                if ("id".equals(strZzRu)) {
                    zzzlq.setId(attributeValue);
                } else {
                    zzzlq.zzZL(strZzRu, attributeValue);
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
                zzzlq.zzZ(zzZN1.zzW(zzzqr));
                c = 2;
            } else {
                if (c > 2) {
                    break;
                }
                if (!"restriction".equals(zzzqr.getLocalName())) {
                    if (!"extension".equals(zzzqr.getLocalName())) {
                        break;
                    }
                    zzZLP zzzlpZzo = zzZLP.zzo(zzzqr);
                    if (zzzlpZzo != null) {
                        zzzlq.zzZUf = zzzlpZzo;
                    }
                } else {
                    zzzlq.zzZUf = zzZLO.zzn(zzzqr);
                }
                c = 3;
            }
        }
        return zzzlq;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final int zzY(zzZN3 zzzn3) throws Exception {
        if (zzS(zzzn3.zzZSD)) {
            return this.zzZSG;
        }
        int iZzY = this.zzZUf.zzY(zzzn3) + this.zzZSG;
        this.zzZSG = iZzY;
        this.zzZSD = zzzn3.zzZSD;
        return iZzY;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final void zzZ(zzZLZ zzzlz) {
        super.zzZ(zzzlz);
        zzZMP zzzmp = this.zzZUf;
        if (zzzmp != null) {
            zzzmp.zzZ(zzzlz);
        }
    }

    @Override // com.aspose.words.internal.zzZMO
    public final zzZMP zzgF() {
        return this.zzZUf;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final int zzZ(zzZN3 zzzn3) {
        if (zzg5() == zzzn3.zzg5()) {
            return 0;
        }
        zzZMP zzzmp = this.zzZUf;
        if (zzzmp != null) {
            if (zzzmp instanceof zzZLO) {
                this.zzZSG = ((zzZLO) zzzmp).zzZ(zzzn3) + this.zzZSG;
            } else if (zzzmp instanceof zzZLP) {
                this.zzZSG = ((zzZLP) zzzmp).zzZ(zzzn3) + this.zzZSG;
            }
        }
        zzZLF.zzZ(getId(), this, zzzn3.zzh0());
        zzT(zzzn3.zzg5());
        return this.zzZSG;
    }
}

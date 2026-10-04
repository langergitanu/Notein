package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZMT extends zzZMO {
    final String zzZUI = "complexContent";
    private boolean zzZUe;
    private zzZMP zzZUf;

    public static zzZMT zzO(zzZQR zzzqr) {
        zzZMT zzzmt = new zzZMT();
        for (int i = 0; i < zzzqr.getAttributeCount(); i++) {
            try {
                String strZzRu = zzzqr.zzRu(i);
                String attributeValue = zzzqr.getAttributeValue(i);
                if ("id".equals(strZzRu)) {
                    zzzmt.setId(attributeValue);
                } else if ("mixed".equals(strZzRu)) {
                    zzzmt.setName(attributeValue);
                } else {
                    zzzmt.zzZL(strZzRu, attributeValue);
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
                zzzmt.zzZ(zzZN1.zzW(zzzqr));
                c = 2;
            } else {
                if (c > 2) {
                    break;
                }
                if (!"restriction".equals(zzzqr.getLocalName())) {
                    if (!"extension".equals(zzzqr.getLocalName())) {
                        break;
                    }
                    zzzmt.zzZUf = zzZMS.zzN(zzzqr);
                } else {
                    zzzmt.zzZUf = zzZMR.zzM(zzzqr);
                }
                c = 3;
            }
        }
        return zzzmt;
    }

    public final boolean isMixed() {
        return this.zzZUe;
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
    public final int zzZ(zzZN3 zzzn3) {
        if (zzg5() == zzzn3.zzg5()) {
            return 0;
        }
        if (this.zzZSF) {
            if (zzg8() != null) {
                zzg8().zzZSF = true;
            }
            zzZMP zzzmp = this.zzZUf;
            if (zzzmp != null) {
                zzzmp.zzZSF = true;
            }
        }
        zzZMP zzzmp2 = this.zzZUf;
        if (zzzmp2 != null) {
            if (zzzmp2 instanceof zzZMR) {
                this.zzZSG = ((zzZMR) zzzmp2).zzZ(zzzn3) + this.zzZSG;
            } else if (zzzmp2 instanceof zzZMS) {
                this.zzZSG = ((zzZMS) zzzmp2).zzZ(zzzn3) + this.zzZSG;
            }
        }
        zzZLF.zzZ(getId(), this, zzzn3.zzh0());
        zzT(zzzn3.zzg5());
        return this.zzZSG;
    }

    @Override // com.aspose.words.internal.zzZMO
    public final zzZMP zzgF() {
        return this.zzZUf;
    }
}

package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZMZ extends zzZLZ {
    private String zzZUB;
    private int zzZUC;
    private zzZL7 zzZUE;
    final String zzZUI = "anyAttribute";

    public static zzZMZ zzU(zzZQR zzzqr) {
        zzZMZ zzzmz = new zzZMZ();
        for (int i = 0; i < zzzqr.getAttributeCount(); i++) {
            try {
                String strZzRu = zzzqr.zzRu(i);
                String attributeValue = zzzqr.getAttributeValue(i);
                if ("id".equals(strZzRu)) {
                    zzzmz.setId(attributeValue);
                } else if ("namespace".equals(strZzRu)) {
                    zzzmz.zzZUB = attributeValue;
                } else if ("processContents".equals(strZzRu)) {
                    zzzmz.zzZUC = zzZLF.zzUl(attributeValue);
                } else {
                    zzzmz.zzZL(strZzRu, attributeValue);
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
                    break;
                }
                zzzmz.zzZ(zzZN1.zzW(zzzqr));
                c = 2;
            }
        }
        return zzzmz;
    }

    public final boolean zzUw(String str) {
        return this.zzZUE.zzUe(str);
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final int zzY(zzZN3 zzzn3) throws Exception {
        return this.zzZSG;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final int zzZ(zzZN3 zzzn3) {
        if (zzg5() == zzzn3.zzg5()) {
            return 0;
        }
        this.zzZSG = 0;
        this.zzZUE.zzUg("");
        if (this.zzZUE.zzgY() == null) {
            this.zzZUE.zzUg("");
        }
        zzZLF.zzZ(getId(), this, zzzn3.zzh0());
        this.zzZUE.zzUf(this.zzZUB);
        int i = this.zzZUC;
        if (i == 0) {
            this.zzZUE.zzZPY = 3;
        } else {
            this.zzZUE.zzZPY = i;
        }
        zzT(zzzn3.zzg5());
        return this.zzZSG;
    }

    public final void zzZ(zzZMZ zzzmz, zzZN3 zzzn3) {
        this.zzZUE.zzZ(zzzmz.zzZUE);
    }
}

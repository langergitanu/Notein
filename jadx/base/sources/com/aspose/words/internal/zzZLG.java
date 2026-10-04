package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZLG extends zzZMC {
    public static zzZLG zzh(zzZQR zzzqr) {
        zzZLG zzzlg = new zzZLG();
        for (int i = 0; i < zzzqr.getAttributeCount(); i++) {
            try {
                String strZzRu = zzzqr.zzRu(i);
                String attributeValue = zzzqr.getAttributeValue(i);
                if ("id".equals(strZzRu)) {
                    zzzlg.setId(attributeValue);
                } else if ("name".equals(strZzRu)) {
                    zzzlg.setName(attributeValue);
                } else {
                    zzzlg.zzZL(strZzRu, attributeValue);
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
                if (c <= 2 && "selector".equals(zzzqr.getLocalName())) {
                    zzzlg.zzZ(zzZLD.zzf(zzzqr));
                } else if (c <= 3 && "field".equals(zzzqr.getLocalName())) {
                    zzzlg.zzgg().zzW(zzZLD.zzf(zzzqr));
                }
                c = 3;
            } else {
                zzzlg.zzZ(zzZN1.zzW(zzzqr));
                c = 2;
            }
        }
        return zzzlg;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final int zzY(zzZN3 zzzn3) throws Exception {
        return this.zzZSG;
    }

    @Override // com.aspose.words.internal.zzZMC, com.aspose.words.internal.zzZLZ
    public final int zzZ(zzZN3 zzzn3) {
        return super.zzZ(zzzn3);
    }
}

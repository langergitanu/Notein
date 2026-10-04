package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZN1 extends zzZLZ {
    public static zzZN1 zzW(zzZQR zzzqr) {
        zzZN1 zzzn1 = new zzZN1();
        for (int i = 0; i < zzzqr.getAttributeCount(); i++) {
            try {
                String strZzRu = zzzqr.zzRu(i);
                String attributeValue = zzzqr.getAttributeValue(i);
                if ("id".equals(strZzRu)) {
                    zzzn1.setId(attributeValue);
                } else {
                    zzzn1.zzZL(strZzRu, attributeValue);
                }
            } catch (Exception e) {
                zzZHV.zzY(e);
            }
        }
        while (zzzqr.hasNext()) {
            zzzqr.next();
            int eventType = zzzqr.getEventType();
            if (eventType != 1) {
                if (eventType == 2) {
                    break;
                }
            } else if (!"appinfo".equals(zzzqr.getLocalName())) {
                if (!"documentation".equals(zzzqr.getLocalName())) {
                    break;
                }
                zzzn1.zzgc().zzW(zzZMM.zzK(zzzqr));
            } else {
                zzzn1.zzgc().zzW(zzZMY.zzT(zzzqr));
            }
        }
        return zzzn1;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final int zzY(zzZN3 zzzn3) throws Exception {
        return 0;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final int zzZ(zzZN3 zzzn3) {
        if (zzg5() == zzzn3.zzg5()) {
            return 0;
        }
        zzT(zzzn3.zzg5());
        return 0;
    }
}

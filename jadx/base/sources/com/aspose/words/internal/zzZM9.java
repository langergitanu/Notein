package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZM9 extends zzZMC {
    public static zzZM9 zzC(zzZQR zzzqr) {
        zzZM9 zzzm9 = new zzZM9();
        for (int i = 0; i < zzzqr.getAttributeCount(); i++) {
            try {
                String strZzRu = zzzqr.zzRu(i);
                String attributeValue = zzzqr.getAttributeValue(i);
                if ("id".equals(strZzRu)) {
                    zzzm9.setId(attributeValue);
                } else if ("name".equals(strZzRu)) {
                    zzzm9.setName(attributeValue);
                } else {
                    zzzm9.zzZL(strZzRu, attributeValue);
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
                    zzzm9.zzZ(zzZLD.zzf(zzzqr));
                } else {
                    if (c > 3 || !"field".equals(zzzqr.getLocalName())) {
                        break;
                    }
                    zzzm9.zzgf();
                    zzzm9.zzgg().zzW(zzZLD.zzf(zzzqr));
                }
                c = 3;
            } else {
                zzzm9.zzZ(zzZN1.zzW(zzzqr));
                c = 2;
            }
        }
        return zzzm9;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final int zzY(zzZN3 zzzn3) throws Exception {
        return 0;
    }

    @Override // com.aspose.words.internal.zzZMC, com.aspose.words.internal.zzZLZ
    public final int zzZ(zzZN3 zzzn3) {
        return super.zzZ(zzzn3);
    }
}

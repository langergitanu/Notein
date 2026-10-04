package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZM1 extends zzZMH {
    public static zzZM1 zzu(zzZQR zzzqr) {
        zzZM1 zzzm1 = new zzZM1();
        for (int i = 0; i < zzzqr.getAttributeCount(); i++) {
            try {
                String strZzRu = zzzqr.zzRu(i);
                String attributeValue = zzzqr.getAttributeValue(i);
                if ("id".equals(strZzRu)) {
                    zzzm1.setId(attributeValue);
                } else if ("fixed".equals(strZzRu)) {
                    zzzm1.zzZ2(Boolean.parseBoolean(attributeValue));
                } else if ("value".equals(strZzRu)) {
                    zzzm1.zzZ2(Boolean.parseBoolean(attributeValue));
                } else {
                    zzzm1.zzZL(strZzRu, attributeValue);
                }
            } catch (Exception e) {
                zzZHV.zzY(e);
                return null;
            }
        }
        char c = 1;
        while (zzzqr.hasNext()) {
            zzzqr.next();
            int eventType = zzzqr.getEventType();
            if (eventType != 1) {
                if (eventType == 2) {
                    return zzzm1;
                }
            } else {
                if (c > 1 || !"annotation".equals(zzzqr.getLocalName())) {
                    return zzzm1;
                }
                zzzm1.zzZ(zzZN1.zzW(zzzqr));
                c = 2;
            }
        }
        return null;
    }

    @Override // com.aspose.words.internal.zzZMH
    public final int zzgn() {
        return 2;
    }
}

package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZM3 extends zzZMH {
    public static zzZM3 zzw(zzZQR zzzqr) {
        zzZM3 zzzm3 = new zzZM3();
        for (int i = 0; i < zzzqr.getAttributeCount(); i++) {
            try {
                String strZzRu = zzzqr.zzRu(i);
                String attributeValue = zzzqr.getAttributeValue(i);
                if ("id".equals(strZzRu)) {
                    zzzm3.setId(attributeValue);
                } else if ("fixed".equals(strZzRu)) {
                    zzzm3.zzZ2(Boolean.parseBoolean(attributeValue));
                } else if ("value".equals(strZzRu)) {
                    zzzm3.setValue(attributeValue);
                } else {
                    zzzm3.zzZL(strZzRu, attributeValue);
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
                zzzm3.zzZ(zzZN1.zzW(zzzqr));
                c = 2;
            }
        }
        return zzzm3;
    }

    @Override // com.aspose.words.internal.zzZMH
    public final int zzgn() {
        return 256;
    }
}

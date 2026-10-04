package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZM6 extends zzZMH {
    public static zzZM6 zzz(zzZQR zzzqr) {
        zzZM6 zzzm6 = new zzZM6();
        for (int i = 0; i < zzzqr.getAttributeCount(); i++) {
            try {
                String strZzRu = zzzqr.zzRu(i);
                String attributeValue = zzzqr.getAttributeValue(i);
                if ("id".equals(strZzRu)) {
                    zzzm6.setId(attributeValue);
                } else if ("fixed".equals(strZzRu)) {
                    zzzm6.zzZ2(Boolean.parseBoolean(attributeValue));
                } else if ("value".equals(strZzRu)) {
                    zzzm6.setValue(attributeValue);
                } else {
                    zzzm6.zzZL(strZzRu, attributeValue);
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
                zzzm6.zzZ(zzZN1.zzW(zzzqr));
                c = 2;
            }
        }
        return zzzm6;
    }

    @Override // com.aspose.words.internal.zzZMH
    public final int zzgn() {
        return 128;
    }
}

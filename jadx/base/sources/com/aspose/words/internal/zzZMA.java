package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZMA extends zzZMI {
    public static zzZMA zzD(zzZQR zzzqr) {
        zzZMA zzzma = new zzZMA();
        for (int i = 0; i < zzzqr.getAttributeCount(); i++) {
            try {
                String strZzRu = zzzqr.zzRu(i);
                String attributeValue = zzzqr.getAttributeValue(i);
                if ("id".equals(strZzRu)) {
                    zzzma.setId(attributeValue);
                } else if ("schemaLocation".equals(strZzRu)) {
                    zzzma.zzUt(attributeValue);
                } else {
                    zzzma.zzZL(strZzRu, attributeValue);
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
                zzzma.zzZ(zzZN1.zzW(zzzqr));
                c = 2;
            }
        }
        return zzzma;
    }
}

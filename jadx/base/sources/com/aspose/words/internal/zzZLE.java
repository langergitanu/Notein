package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZLE extends zzZMH {
    public static zzZLE zzg(zzZQR zzzqr) {
        zzZLE zzzle = new zzZLE();
        for (int i = 0; i < zzzqr.getAttributeCount(); i++) {
            try {
                String strZzRu = zzzqr.zzRu(i);
                String attributeValue = zzzqr.getAttributeValue(i);
                if ("id".equals(strZzRu)) {
                    zzzle.setId(attributeValue);
                } else if ("fixed".equals(strZzRu)) {
                    zzzle.zzZ2(Boolean.parseBoolean(attributeValue));
                } else if ("value".equals(strZzRu)) {
                    zzzle.setValue(attributeValue);
                } else {
                    zzzle.zzZL(strZzRu, attributeValue);
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
                zzzle.zzZ(zzZN1.zzW(zzzqr));
                c = 2;
            }
        }
        return zzzle;
    }

    @Override // com.aspose.words.internal.zzZMH
    public final int zzgn() {
        return 32;
    }
}

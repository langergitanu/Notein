package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZMB extends zzZMI {
    private String zzZUB;

    public static zzZMB zzE(zzZQR zzzqr) {
        zzZMB zzzmb = new zzZMB();
        for (int i = 0; i < zzzqr.getAttributeCount(); i++) {
            try {
                String strZzRu = zzzqr.zzRu(i);
                String attributeValue = zzzqr.getAttributeValue(i);
                if ("id".equals(strZzRu)) {
                    zzzmb.setId(attributeValue);
                } else if ("namespace".equals(strZzRu)) {
                    zzzmb.zzZUB = attributeValue;
                } else if ("schemaLocation".equals(strZzRu)) {
                    zzzmb.zzUt(attributeValue);
                } else {
                    zzzmb.zzZL(strZzRu, attributeValue);
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
                zzzmb.zzZ(zzZN1.zzW(zzzqr));
                c = 2;
            }
        }
        return zzzmb;
    }

    public final String getNamespace() {
        return this.zzZUB;
    }
}

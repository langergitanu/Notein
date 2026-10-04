package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZMG extends zzZMH {
    public static zzZMG zzH(zzZQR zzzqr) {
        zzZMG zzzmg = new zzZMG();
        for (int i = 0; i < zzzqr.getAttributeCount(); i++) {
            try {
                String strZzRu = zzzqr.zzRu(i);
                String attributeValue = zzzqr.getAttributeValue(i);
                if ("id".equals(strZzRu)) {
                    zzzmg.setId(attributeValue);
                } else if ("fixed".equals(strZzRu)) {
                    zzzmg.zzZ2(Boolean.parseBoolean(attributeValue));
                } else if ("value".equals(strZzRu)) {
                    zzzmg.setValue(attributeValue);
                } else {
                    zzzmg.zzZL(strZzRu, attributeValue);
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
                zzzmg.zzZ(zzZN1.zzW(zzzqr));
                c = 2;
            }
        }
        return zzzmg;
    }

    @Override // com.aspose.words.internal.zzZMH
    public final int zzgn() {
        return 2048;
    }
}

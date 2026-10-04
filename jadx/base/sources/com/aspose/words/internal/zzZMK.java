package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZMK extends zzZMH {
    public static zzZMK zzI(zzZQR zzzqr) {
        zzZMK zzzmk = new zzZMK();
        for (int i = 0; i < zzzqr.getAttributeCount(); i++) {
            try {
                String strZzRu = zzzqr.zzRu(i);
                String attributeValue = zzzqr.getAttributeValue(i);
                if ("id".equals(strZzRu)) {
                    zzzmk.setId(attributeValue);
                } else if ("value".equals(strZzRu)) {
                    zzzmk.zzZ2(Boolean.parseBoolean(attributeValue));
                } else {
                    zzzmk.zzZL(strZzRu, attributeValue);
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
                zzzmk.zzZ(zzZN1.zzW(zzzqr));
                c = 2;
            }
        }
        return zzzmk;
    }

    @Override // com.aspose.words.internal.zzZMH
    public final int zzgn() {
        return 16;
    }
}

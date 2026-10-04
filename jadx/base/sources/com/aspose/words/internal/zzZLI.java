package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZLI extends zzZMH {
    public static zzZLI zzi(zzZQR zzzqr) {
        zzZLI zzzli = new zzZLI();
        for (int i = 0; i < zzzqr.getAttributeCount(); i++) {
            try {
                String strZzRu = zzzqr.zzRu(i);
                String attributeValue = zzzqr.getAttributeValue(i);
                if ("id".equals(strZzRu)) {
                    zzzli.setId(attributeValue);
                } else if ("fixed".equals(strZzRu)) {
                    zzzli.zzZ2(Boolean.parseBoolean(attributeValue));
                } else if ("value".equals(strZzRu)) {
                    zzzli.setValue(attributeValue);
                } else {
                    zzzli.zzZL(strZzRu, attributeValue);
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
                zzzli.zzZ(zzZN1.zzW(zzzqr));
                c = 2;
            }
        }
        return zzzli;
    }

    @Override // com.aspose.words.internal.zzZMH
    public final int zzgn() {
        return 1024;
    }
}

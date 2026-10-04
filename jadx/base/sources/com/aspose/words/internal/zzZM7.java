package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZM7 extends zzZMH {
    public final String zzZUI = "length";

    public static zzZM7 zzA(zzZQR zzzqr) {
        zzZM7 zzzm7 = new zzZM7();
        for (int i = 0; i < zzzqr.getAttributeCount(); i++) {
            try {
                String strZzRu = zzzqr.zzRu(i);
                String attributeValue = zzzqr.getAttributeValue(i);
                if ("id".equals(strZzRu)) {
                    zzzm7.setId(attributeValue);
                } else if ("fixed".equals(strZzRu)) {
                    zzzm7.zzZ2(Boolean.parseBoolean(attributeValue));
                } else if ("value".equals(strZzRu)) {
                    zzzm7.setValue(attributeValue);
                } else {
                    zzzm7.zzZL(strZzRu, attributeValue);
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
                zzzm7.zzZ(zzZN1.zzW(zzzqr));
                c = 2;
            }
        }
        return zzzm7;
    }

    @Override // com.aspose.words.internal.zzZMH
    public final int zzgn() {
        return 1;
    }
}

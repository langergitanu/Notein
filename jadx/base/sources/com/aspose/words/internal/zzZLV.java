package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZLV extends zzZMH {
    public static zzZLV zzs(zzZQR zzzqr) {
        zzZLV zzzlv = new zzZLV();
        for (int i = 0; i < zzzqr.getAttributeCount(); i++) {
            try {
                String strZzRu = zzzqr.zzRu(i);
                String attributeValue = zzzqr.getAttributeValue(i);
                if ("id".equals(strZzRu)) {
                    zzzlv.setId(attributeValue);
                } else if ("value".equals(strZzRu)) {
                    zzzlv.setValue(attributeValue);
                } else {
                    zzzlv.zzZL(strZzRu, attributeValue);
                }
            } catch (Exception e) {
                zzZHV.zzZ(e);
            }
        }
        char c = 1;
        while (zzzqr.hasNext()) {
            int next = zzzqr.next();
            if (next != 1) {
                if (next == 2) {
                    break;
                }
            } else {
                if (c > 1 || !"annotation".equals(zzzqr.getLocalName())) {
                    break;
                }
                zzzlv.zzZ(zzZN1.zzW(zzzqr));
                c = 2;
            }
        }
        return zzzlv;
    }
}

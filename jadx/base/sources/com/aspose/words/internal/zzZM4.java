package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZM4 extends zzZMH {
    private String value;
    private boolean zzZSJ;

    public static zzZM4 zzx(zzZQR zzzqr) throws zzZQS {
        zzZM4 zzzm4 = new zzZM4();
        for (int i = 0; i < zzzqr.getAttributeCount(); i++) {
            try {
                String strZzRu = zzzqr.zzRu(i);
                String attributeValue = zzzqr.getAttributeValue(i);
                if ("id".equals(strZzRu)) {
                    zzzm4.setId(attributeValue);
                } else if ("fixed".equals(strZzRu)) {
                    zzzm4.zzZSJ = Boolean.parseBoolean(attributeValue);
                } else if ("value".equals(strZzRu)) {
                    zzzm4.value = attributeValue;
                } else {
                    zzzm4.zzZL(strZzRu, attributeValue);
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
            } else if (c <= 1 && "annotation".equals(zzzqr.getLocalName())) {
                zzzm4.zzZ(zzZN1.zzW(zzzqr));
                c = 2;
            }
        }
        return zzzm4;
    }

    @Override // com.aspose.words.internal.zzZMH
    public final void setValue(String str) {
        this.value = str;
    }
}

package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZMM extends zzZLZ {
    private String zz0t;
    private String zzZT8;

    public static zzZMM zzK(zzZQR zzzqr) {
        zzZMM zzzmm = new zzZMM();
        for (int i = 0; i < zzzqr.getAttributeCount(); i++) {
            try {
                String strZzRu = zzzqr.zzRu(i);
                String attributeValue = zzzqr.getAttributeValue(i);
                if ("source".equals(strZzRu)) {
                    zzzmm.zzZT8 = attributeValue;
                } else if ("xml:lang".equals(strZzRu)) {
                    zzzmm.zz0t = attributeValue;
                } else {
                    zzzmm.zzZL(strZzRu, attributeValue);
                }
            } catch (Exception e) {
                zzZHV.zzY(e);
            }
        }
        while (zzzqr.hasNext()) {
            zzzqr.next();
            if (zzzqr.getEventType() == 2) {
                break;
            }
        }
        return zzzmm;
    }
}

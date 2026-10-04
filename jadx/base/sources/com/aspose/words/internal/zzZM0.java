package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZM0 extends zzZLZ {
    private String zzZSH;
    private String zzZSI;
    private zzZN4 zzZUq;

    public static zzZM0 zzt(zzZQR zzzqr) {
        zzZM0 zzzm0 = new zzZM0();
        for (int i = 0; i < zzzqr.getAttributeCount(); i++) {
            try {
                String strZzRu = zzzqr.zzRu(i);
                String attributeValue = zzzqr.getAttributeValue(i);
                if ("id".equals(strZzRu)) {
                    zzzm0.setId(attributeValue);
                } else if ("name".equals(strZzRu)) {
                    zzzm0.setName(attributeValue);
                } else if ("public".equals(strZzRu)) {
                    zzzm0.zzZSI = attributeValue;
                } else if ("system".equals(strZzRu)) {
                    zzzm0.zzZSH = attributeValue;
                } else {
                    zzzm0.zzZL(strZzRu, attributeValue);
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
                zzzm0.zzZ(zzZN1.zzW(zzzqr));
                c = 2;
            }
        }
        return zzzm0;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final int zzY(zzZN3 zzzn3) throws Exception {
        return this.zzZSG;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final int zzZ(zzZN3 zzzn3) {
        if (zzg5() == zzzn3.zzg5()) {
            return 0;
        }
        if (getName() != null && zzZNA.zzUJ(getName())) {
            this.zzZUq = new zzZN4(getName(), "");
        }
        String str = this.zzZSI;
        if (str != null) {
            zzZLF.zzUk(str);
        }
        String str2 = this.zzZSH;
        if (str2 != null) {
            zzZLF.zzUk(str2);
        }
        zzZLF.zzZ(getId(), this, zzzn3.zzh0());
        return this.zzZSG;
    }
}

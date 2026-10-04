package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZMV extends zzZLZ {
    private zzZN4 zzZUt = zzZN4.zzZV6;

    public static zzZMV zzQ(zzZQR zzzqr) {
        zzZMV zzzmv = new zzZMV();
        for (int i = 0; i < zzzqr.getAttributeCount(); i++) {
            try {
                String strZzRu = zzzqr.zzRu(i);
                String attributeValue = zzzqr.getAttributeValue(i);
                if ("id".equals(strZzRu)) {
                    zzzmv.setId(attributeValue);
                } else if ("ref".equals(strZzRu)) {
                    zzzmv.zzZUt = zzZLF.zzZ(zzzqr, i);
                } else {
                    zzzmv.zzZL(strZzRu, attributeValue);
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
                zzzmv.zzZ(zzZN1.zzW(zzzqr));
                c = 2;
            }
        }
        return zzzmv;
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
        this.zzZSG = 0;
        zzZN4 zzzn4 = this.zzZUt;
        if (zzzn4 != null) {
            zzzn4.isEmpty();
        }
        zzZLF.zzZ(getId(), this, zzzn3.zzh0());
        zzT(zzzn3.zzg5());
        return this.zzZSG;
    }

    public final zzZN4 zzgO() {
        return this.zzZUt;
    }
}

package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZN0 extends zzZLW {
    static zzZN0 zzZUF;
    private int zzZUC;
    private String zzZUD;
    final String zzZUI = "any";
    private zzZL7 zzZUE = new zzZL7(this);

    public static zzZN0 zzV(zzZQR zzzqr) {
        zzZN0 zzzn0 = new zzZN0();
        for (int i = 0; i < zzzqr.getAttributeCount(); i++) {
            try {
                String strZzRu = zzzqr.zzRu(i);
                String attributeValue = zzzqr.getAttributeValue(i);
                if ("id".equals(strZzRu)) {
                    zzzn0.setId(attributeValue);
                } else if ("maxOccurs".equals(strZzRu)) {
                    zzzn0.setName(attributeValue);
                } else if ("minOccurs".equals(strZzRu)) {
                    zzzn0.setName(attributeValue);
                } else if ("namespace".equals(strZzRu)) {
                    zzzn0.setName(attributeValue);
                } else if ("processContents".equals(strZzRu)) {
                    zzzn0.zzZUC = zzZLF.zzUl(attributeValue);
                } else {
                    zzzn0.zzZL(strZzRu, attributeValue);
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
                zzzn0.zzZ(zzZN1.zzW(zzzqr));
                c = 2;
            }
        }
        return zzzn0;
    }

    public static zzZN0 zzgS() throws zzZMJ {
        if (zzZUF == null) {
            zzZN0 zzzn0 = new zzZN0();
            zzZUF = zzzn0;
            zzzn0.zzUr("unbounded");
            zzZUF.zzQ(0);
            zzZUF.zzg1();
            zzZN0 zzzn02 = zzZUF;
            zzzn02.zzZUD = "##any";
            zzzn02.zzZUE.zzft();
            zzZN0 zzzn03 = zzZUF;
            zzZL7 zzzl7 = zzzn03.zzZUE;
            zzzn03.zzZUC = 2;
            zzzl7.zzQq(2);
            zzZUF.zzZUE.zzfu();
        }
        return zzZUF;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final int zzY(zzZN3 zzzn3) throws Exception {
        return this.zzZSG;
    }

    @Override // com.aspose.words.internal.zzZLW
    public final void zzZ(zzZLX zzzlx, zzZN3 zzzn3) {
    }

    @Override // com.aspose.words.internal.zzZLW
    public final zzZLW zzZ3(boolean z) throws Exception {
        zzZLW zzzlw = this.zzZSd;
        if (zzzlw != null) {
            return zzzlw;
        }
        zzZN0 zzzn0 = new zzZN0();
        zzY((zzZLW) zzzn0);
        zzzn0.zzg1();
        zzzn0.zzZUE = this.zzZUE;
        this.zzZSd = zzzn0;
        zzzn0.zzZUD = this.zzZUD;
        zzzn0.zzZUC = this.zzZUC;
        zzzn0.zzZ(zzg8());
        zzzn0.zzgb().putAll(zzgb());
        return this.zzZSd;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final int zzZ(zzZN3 zzzn3) {
        if (zzg5() == zzzn3.zzg5()) {
            return 0;
        }
        this.zzZSG = 0;
        zzZLF.zzZ(getId(), this, zzzn3.zzh0());
        this.zzZUE.zzUg("");
        if (this.zzZUE.zzgY() == null) {
            this.zzZUE.zzUg("");
        }
        zzg1();
        this.zzZUE.zzUf(this.zzZUD);
        int i = this.zzZUC;
        if (i == 0) {
            this.zzZUE.zzQq(3);
        } else {
            this.zzZUE.zzQq(i);
        }
        zzT(zzzn3.zzg5());
        return this.zzZSG;
    }
}

package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZLU extends zzZMI {
    private zzZLX zzZUS = new zzZLX();
    private zzZLX zzZUR = new zzZLX();
    private zzZLX zzZUT = new zzZLX();

    public static zzZLU zzr(zzZQR zzzqr) {
        zzZLU zzzlu = new zzZLU();
        for (int i = 0; i < zzzqr.getAttributeCount(); i++) {
            try {
                String strZzRu = zzzqr.zzRu(i);
                String attributeValue = zzzqr.getAttributeValue(i);
                if ("id".equals(strZzRu)) {
                    zzzlu.setId(attributeValue);
                } else if ("schemaLocation".equals(strZzRu)) {
                    zzzlu.zzUt(attributeValue);
                } else {
                    zzzlu.zzZL(strZzRu, attributeValue);
                }
            } catch (Exception e) {
                zzZHV.zzY(e);
            }
        }
        while (zzzqr.hasNext()) {
            zzzqr.next();
            int eventType = zzzqr.getEventType();
            if (eventType != 1) {
                if (eventType == 2) {
                    break;
                }
            } else if ("annotation".equals(zzzqr.getLocalName())) {
                zzzlu.zzgc().zzW(zzZN1.zzW(zzzqr));
            } else if ("simpleType".equals(zzzqr.getLocalName())) {
                zzzlu.zzgc().zzW(zzZLN.zzm(zzzqr));
            } else if ("complexType".equals(zzzqr.getLocalName())) {
                zzzlu.zzgc().zzW(zzZMQ.zzL(zzzqr));
            } else if (!"group".equals(zzzqr.getLocalName())) {
                if (!"attributeGroup".equals(zzzqr.getLocalName())) {
                    break;
                }
                zzzlu.zzgc().zzW(zzZMW.zzR(zzzqr));
            } else {
                zzzlu.zzgc().zzW(zzZMF.zzG(zzzqr));
            }
        }
        return zzzlu;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final void zzZ(zzZLZ zzzlz) {
        super.zzZ(zzzlz);
        for (zzZLZ zzzlz2 : zzgc()) {
            zzzlz2.zzZ(this);
            zzzlz2.zzZSF = true;
            zzzlz2.zzg3();
        }
    }
}

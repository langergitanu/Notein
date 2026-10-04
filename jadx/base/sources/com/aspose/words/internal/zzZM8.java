package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZM8 extends zzZMC {
    private zzZMC zzZSK;
    private zzZN4 zzZSL = zzZN4.zzZV6;

    public static zzZM8 zzB(zzZQR zzzqr) throws zzZQS {
        zzZM8 zzzm8 = new zzZM8();
        for (int i = 0; i < zzzqr.getAttributeCount(); i++) {
            String localPart = zzzqr.zzRv(i).getLocalPart();
            String attributeValue = zzzqr.getAttributeValue(i);
            if ("id".equals(localPart)) {
                zzzm8.setId(attributeValue);
            } else if ("name".equals(localPart)) {
                zzzm8.setName(attributeValue);
            } else if ("refer".equals(localPart)) {
                zzzm8.zzZSL = zzZLF.zzZ(zzzqr, i);
            } else {
                zzZLF.zzZ(zzzqr, zzzm8);
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
            } else if (c > 1 || !"annotation".equals(zzzqr.getLocalName())) {
                if (c <= 2 && "selector".equals(zzzqr.getLocalName())) {
                    zzzm8.zzZ(zzZLD.zzf(zzzqr));
                } else {
                    if (c > 3 || !"field".equals(zzzqr.getLocalName())) {
                        break;
                    }
                    zzzm8.zzgf();
                    zzzm8.zzgg().zzW(zzZLD.zzf(zzzqr));
                }
                c = 3;
            } else {
                zzzm8.zzZ(zzZN1.zzW(zzzqr));
                c = 2;
            }
        }
        return zzzm8;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final int zzY(zzZN3 zzzn3) throws Exception {
        zzZLZ zzzlzZzS = zzzn3.zzgZ().zzS(this.zzZSL);
        zzZMC zzzmc = zzzlzZzS instanceof zzZMC ? (zzZMC) zzzlzZzS : null;
        if (zzzmc != null && !(zzzmc instanceof zzZM8) && zzzmc.zzgg().getCount() == zzgg().getCount()) {
            this.zzZSK = zzzmc;
        }
        return this.zzZSG;
    }

    @Override // com.aspose.words.internal.zzZMC, com.aspose.words.internal.zzZLZ
    public final int zzZ(zzZN3 zzzn3) {
        super.zzZ(zzzn3);
        zzZN4 zzzn4 = this.zzZSL;
        if (zzzn4 != null) {
            zzzn4.isEmpty();
        }
        return this.zzZSG;
    }

    public final zzZN4 zzge() {
        return this.zzZSL;
    }
}

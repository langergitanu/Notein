package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZMF extends zzZLZ {
    private zzZME zzZSS;
    private boolean zzZST;
    private zzZN4 zzZUq;

    public static zzZMF zzG(zzZQR zzzqr) {
        zzZMF zzzmf = new zzZMF();
        for (int i = 0; i < zzzqr.getAttributeCount(); i++) {
            try {
                String strZzRu = zzzqr.zzRu(i);
                String attributeValue = zzzqr.getAttributeValue(i);
                if ("id".equals(strZzRu)) {
                    zzzmf.setId(attributeValue);
                } else if ("name".equals(strZzRu)) {
                    zzzmf.setName(attributeValue);
                } else {
                    zzzmf.zzZL(strZzRu, attributeValue);
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
                zzzmf.zzZ(zzZN1.zzW(zzzqr));
                c = 2;
            } else {
                if (c > 2) {
                    break;
                }
                if ("all".equals(zzzqr.getLocalName())) {
                    zzzmf.zzZSS = zzZN2.zzX(zzzqr);
                } else if (!"choice".equals(zzzqr.getLocalName())) {
                    if (!"sequence".equals(zzzqr.getLocalName())) {
                        break;
                    }
                    zzzmf.zzZSS = zzZLS.zzq(zzzqr);
                } else {
                    zzzmf.zzZSS = zzZMU.zzP(zzzqr);
                }
                c = 3;
            }
        }
        return zzzmf;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final int zzY(zzZN3 zzzn3) throws Exception {
        if (zzS(zzzn3.zzZSD)) {
            return this.zzZSG;
        }
        zzZME zzzme = this.zzZSS;
        if (zzzme != null) {
            zzzme.zzZSe = true;
            this.zzZSG = zzzme.zzY(zzzn3) + this.zzZSG;
            new zzZLX();
            new ArrayList();
            this.zzZSS.zzZ(new zzZLX(), zzzn3);
        }
        this.zzZSD = zzzn3.zzZSD;
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
        zzZME zzzme = this.zzZSS;
        if (zzzme != null) {
            String str = zzzme.zzZSk;
            String str2 = zzzme.zzZSl;
            zzzme.zzZ(zzzn3);
        }
        zzZLF.zzZ(getId(), this, zzzn3.zzh0());
        zzT(zzzn3.zzg5());
        return this.zzZSG;
    }

    public final zzZME zzgj() {
        return this.zzZSS;
    }

    public final boolean zzgk() {
        return this.zzZST;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final void zzZ(zzZLZ zzzlz) {
        super.zzZ(zzzlz);
        zzZME zzzme = this.zzZSS;
        if (zzzme != null) {
            zzzme.zzZ(this);
        }
    }
}

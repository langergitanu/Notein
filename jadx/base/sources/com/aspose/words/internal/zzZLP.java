package com.aspose.words.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZLP extends zzZMP {
    private zzZMZ zzZUd;
    String zzZUI = "extension";
    private zzZN4 zzZUc = zzZN4.zzZV6;
    private zzZLY zzZUk = new zzZLY();

    public static zzZLP zzo(zzZQR zzzqr) {
        zzZLP zzzlp = new zzZLP();
        for (int i = 0; i < zzzqr.getAttributeCount(); i++) {
            try {
                String strZzRu = zzzqr.zzRu(i);
                String attributeValue = zzzqr.getAttributeValue(i);
                if ("base".equals(strZzRu)) {
                    zzzlp.zzZUc = zzZLF.zzZ(zzzqr, i);
                } else {
                    zzzlp.zzZL(strZzRu, attributeValue);
                }
            } catch (Exception e) {
                zzZHV.zzY(e);
                return null;
            }
        }
        char c = 1;
        while (zzzqr.hasNext()) {
            zzzqr.next();
            int eventType = zzzqr.getEventType();
            if (eventType == 1) {
                if (c > 1 || !"annotation".equals(zzzqr.getLocalName())) {
                    if (c <= 2) {
                        if ("attribute".equals(zzzqr.getLocalName())) {
                            zzzlp.zzZUk.zzW(zzZMX.zzS(zzzqr));
                        } else if ("attributeGroup".equals(zzzqr.getLocalName())) {
                            zzzlp.zzZUk.zzW(zzZMV.zzQ(zzzqr));
                        }
                    }
                    if (c > 3 || !"anyAttribute".equals(zzzqr.getLocalName())) {
                        return zzzlp;
                    }
                    zzzlp.zzZUd = zzZMZ.zzU(zzzqr);
                    c = 4;
                } else {
                    zzzlp.zzZ(zzZN1.zzW(zzzqr));
                }
                c = 2;
            } else if (eventType == 2) {
                return zzzlp;
            }
        }
        return null;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final int zzY(zzZN3 zzzn3) throws Exception {
        if (zzS(zzzn3.zzZSD)) {
            return this.zzZSG;
        }
        zzZLH zzzlhZzY = zzzn3.zzY(this.zzZUc);
        if (zzzlhZzY != null) {
            zzZMQ zzzmq = zzzlhZzY instanceof zzZMQ ? (zzZMQ) zzzlhZzY : null;
            if (zzzmq != null) {
                boolean z = zzzmq.zzgw() instanceof zzZMT;
            }
            zzzlhZzY.zzY(zzzn3);
            this.zzZU0 = zzzlhZzY;
        } else {
            zzZN4 zzzn4 = this.zzZUc;
            if (zzzn4 == zzZMQ.zzZU2) {
                this.zzZU0 = zzZMQ.zzgz();
            } else if (zzZLF.zzP(zzzn4)) {
                this.zzZU0 = zzZMN.zzU(this.zzZUc);
            } else if (!zzzn3.zzUy(this.zzZUc.getNamespace())) {
                StringBuilder sb = new StringBuilder("Referenced base schema type ");
                sb.append(this.zzZUc);
                sb.append(" was not found in the corresponding schema.");
            }
        }
        this.zzZSD = zzzn3.zzZSD;
        return this.zzZSG;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final void zzZ(zzZLZ zzzlz) {
        super.zzZ(zzzlz);
        zzZMZ zzzmz = this.zzZUd;
        if (zzzmz != null) {
            zzzmz.zzZ(this);
        }
        Iterator<zzZLZ> it = this.zzZUk.iterator();
        while (it.hasNext()) {
            it.next().zzZ(this);
        }
    }

    public final zzZMZ zzgD() {
        return this.zzZUd;
    }

    public final zzZLY zzgE() {
        return this.zzZUk;
    }

    @Override // com.aspose.words.internal.zzZMP
    public final zzZN4 zzgv() {
        return this.zzZUc;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final int zzZ(zzZN3 zzzn3) {
        if (zzg5() == zzzn3.zzg5()) {
            return 0;
        }
        if (this.zzZSF) {
            if (zzg8() != null) {
                zzg8().zzZSF = true;
            }
            zzZMZ zzzmz = this.zzZUd;
            if (zzzmz != null) {
                zzzmz.zzZSF = true;
            }
            Iterator<zzZLZ> it = this.zzZUk.iterator();
            while (it.hasNext()) {
                it.next().zzZSF = true;
            }
        }
        zzZN4 zzzn4 = this.zzZUc;
        if (zzzn4 != null) {
            zzzn4.isEmpty();
        }
        zzZMZ zzzmz2 = this.zzZUd;
        if (zzzmz2 != null) {
            this.zzZSG = zzzmz2.zzZ(zzzn3) + this.zzZSG;
        }
        for (zzZLZ zzzlz : this.zzZUk) {
            if (zzzlz instanceof zzZMX) {
                this.zzZSG = ((zzZMX) zzzlz).zzZ(zzzn3) + this.zzZSG;
            } else if (zzzlz instanceof zzZMV) {
                this.zzZSG = ((zzZMV) zzzlz).zzZ(zzzn3) + this.zzZSG;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(zzzlz.getClass());
                sb.append(" is not valid in this place::SimpleConentExtension");
            }
        }
        zzZLF.zzZ(getId(), this, zzzn3.zzh0());
        zzT(zzzn3.zzg5());
        return this.zzZSG;
    }
}

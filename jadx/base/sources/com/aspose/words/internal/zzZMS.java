package com.aspose.words.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZMS extends zzZMP {
    private zzZMZ zzZUd;
    final String zzZUI = "extension";
    private zzZLY zzZUk = new zzZLY();

    public zzZMS() {
        this.zzZUc = zzZN4.zzZV6;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzZMS zzN(zzZQR zzzqr) {
        zzZMS zzzms = new zzZMS();
        for (int i = 0; i < zzzqr.getAttributeCount(); i++) {
            try {
                String strZzRu = zzzqr.zzRu(i);
                String attributeValue = zzzqr.getAttributeValue(i);
                if ("base".equals(strZzRu)) {
                    zzzms.zzZUc = zzZLF.zzZ(zzzqr, i);
                } else if ("id".equals(strZzRu)) {
                    zzzms.setId(attributeValue);
                } else {
                    zzzms.zzZL(strZzRu, attributeValue);
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
                zzzms.zzZ(zzZN1.zzW(zzzqr));
                c = 2;
            } else if (c > 2) {
                if (c <= 3) {
                    if ("attribute".equals(zzzqr.getLocalName())) {
                        zzzms.zzZUk.zzW(zzZMX.zzS(zzzqr));
                    } else if ("attributeGroup".equals(zzzqr.getLocalName())) {
                        zzzms.zzZUk.zzW(zzZMV.zzQ(zzzqr));
                    }
                    c = 3;
                }
                if (c > 4 || !"anyAttribute".equals(zzzqr.getLocalName())) {
                    break;
                }
                zzzms.zzZUd = zzZMZ.zzU(zzzqr);
                c = 5;
            } else {
                if ("group".equals(zzzqr.getLocalName())) {
                    zzzms.zzZU6 = zzZMD.zzF(zzzqr);
                } else if ("all".equals(zzzqr.getLocalName())) {
                    zzzms.zzZU6 = zzZN2.zzX(zzzqr);
                } else if ("choice".equals(zzzqr.getLocalName())) {
                    zzzms.zzZU6 = zzZMU.zzP(zzzqr);
                } else if ("sequence".equals(zzzqr.getLocalName())) {
                    zzzms.zzZU6 = zzZLS.zzq(zzzqr);
                }
                c = 3;
            }
        }
        return zzzms;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final int zzY(zzZN3 zzzn3) throws Exception {
        if (zzS(zzzn3.zzZSD)) {
            return this.zzZSG;
        }
        zzZMZ zzzmz = this.zzZUd;
        if (zzzmz != null) {
            this.zzZSG = zzzmz.zzY(zzzn3) + this.zzZSG;
        }
        for (zzZLZ zzzlz : this.zzZUk) {
            this.zzZSG = zzzlz.zzY(zzzn3) + this.zzZSG;
        }
        if (zzgB() != null) {
            this.zzZSG = zzgB().zzY(zzzn3) + this.zzZSG;
        }
        this.zzZSD = zzzn3.zzZSD;
        return this.zzZSG;
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
            if (zzgB() != null) {
                zzgB().zzZSF = true;
            }
        }
        if (zzgv() != null) {
            zzgv().isEmpty();
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
                sb.append(" is not valid in this place::ComplexConetnetExtension");
            }
        }
        if (zzgB() != null) {
            if (zzgB() instanceof zzZMD) {
                this.zzZSG = ((zzZMD) zzgB()).zzZ(zzzn3) + this.zzZSG;
            } else if (zzgB() instanceof zzZN2) {
                this.zzZSG = ((zzZN2) zzgB()).zzZ(zzzn3) + this.zzZSG;
            } else if (zzgB() instanceof zzZMU) {
                this.zzZSG = ((zzZMU) zzgB()).zzZ(zzzn3) + this.zzZSG;
            } else if (zzgB() instanceof zzZLS) {
                this.zzZSG = ((zzZLS) zzgB()).zzZ(zzzn3) + this.zzZSG;
            }
        }
        zzZLF.zzZ(getId(), this, zzzn3.zzh0());
        zzT(zzzn3.zzg5());
        return this.zzZSG;
    }

    @Override // com.aspose.words.internal.zzZMP
    public final boolean zzgC() {
        return true;
    }

    public final zzZMZ zzgD() {
        return this.zzZUd;
    }

    public final zzZLY zzgE() {
        return this.zzZUk;
    }
}

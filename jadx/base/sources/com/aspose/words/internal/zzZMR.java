package com.aspose.words.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZMR extends zzZMP {
    private zzZMZ zzZUd;
    final String zzZUI = "restriction";
    private zzZN4 zzZUc = zzZN4.zzZV6;
    private zzZLY zzZUk = new zzZLY();

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzZMR zzM(zzZQR zzzqr) {
        zzZMR zzzmr = new zzZMR();
        for (int i = 0; i < zzzqr.getAttributeCount(); i++) {
            try {
                String strZzRu = zzzqr.zzRu(i);
                String attributeValue = zzzqr.getAttributeValue(i);
                if ("base".equals(strZzRu)) {
                    zzzmr.zzZUc = zzZLF.zzZ(zzzqr, i);
                } else if ("id".equals(strZzRu)) {
                    zzzmr.setId(attributeValue);
                } else {
                    zzzmr.zzZL(strZzRu, attributeValue);
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
                zzzmr.zzZ(zzZN1.zzW(zzzqr));
                c = 2;
            } else if (c > 2) {
                if (c <= 3) {
                    if ("attribute".equals(zzzqr.getLocalName())) {
                        zzzmr.zzZUk.zzW(zzZMX.zzS(zzzqr));
                    } else if ("attributeGroup".equals(zzzqr.getLocalName())) {
                        zzzmr.zzZUk.zzW(zzZMV.zzQ(zzzqr));
                    }
                    c = 3;
                }
                if (c > 4 || !"anyAttribute".equals(zzzqr.getLocalName())) {
                    break;
                }
                zzzmr.zzZUd = zzZMZ.zzU(zzzqr);
                c = 5;
            } else {
                if ("group".equals(zzzqr.getLocalName())) {
                    zzzmr.zzZU6 = zzZMD.zzF(zzzqr);
                } else if ("all".equals(zzzqr.getLocalName())) {
                    zzzmr.zzZU6 = zzZN2.zzX(zzzqr);
                } else if ("choice".equals(zzzqr.getLocalName())) {
                    zzzmr.zzZU6 = zzZMU.zzP(zzzqr);
                } else if ("sequence".equals(zzzqr.getLocalName())) {
                    zzzmr.zzZU6 = zzZLS.zzq(zzzqr);
                }
                c = 3;
            }
        }
        return zzzmr;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final int zzY(zzZN3 zzzn3) throws Exception {
        if (zzgB() != null) {
            zzgB().zzY(zzzn3);
        }
        return this.zzZSG;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final void zzZ(zzZLZ zzzlz) {
        super.zzZ(zzzlz);
        if (zzgB() != null) {
            zzgB().zzZ(this);
        }
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
                sb.append(" is not valid in this place::ComplexContentRestriction");
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
}

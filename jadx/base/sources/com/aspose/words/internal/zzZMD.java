package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZMD extends zzZLW {
    private zzZMF zzZSP;
    boolean zzZSQ;
    private zzZN3 zzZUG;
    private zzZN4 zzZUt = zzZN4.zzZV6;

    public static zzZMD zzF(zzZQR zzzqr) {
        zzZMD zzzmd = new zzZMD();
        for (int i = 0; i < zzzqr.getAttributeCount(); i++) {
            try {
                String strZzRu = zzzqr.zzRu(i);
                String attributeValue = zzzqr.getAttributeValue(i);
                if ("id".equals(strZzRu)) {
                    zzzmd.setId(attributeValue);
                } else if ("ref".equals(strZzRu)) {
                    zzzmd.zzZUt = zzZLF.zzZ(zzzqr, i);
                } else if ("maxOccurs".equals(strZzRu)) {
                    try {
                        zzzmd.zzUr(attributeValue);
                    } catch (Exception e) {
                        zzZHV.zzZ(e);
                        StringBuilder sb = new StringBuilder();
                        sb.append(attributeValue);
                        sb.append(" is an invalid value for maxOccurs");
                    }
                } else if ("minOccurs".equals(strZzRu)) {
                    try {
                        zzzmd.zzUs(attributeValue);
                    } catch (Exception e2) {
                        zzZHV.zzZ(e2);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(attributeValue);
                        sb2.append(" is an invalid value for minOccurs");
                    }
                } else {
                    zzzmd.zzZL(strZzRu, attributeValue);
                }
            } catch (Exception e3) {
                zzZHV.zzY(e3);
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
                zzzmd.zzZ(zzZN1.zzW(zzzqr));
                c = 2;
            }
        }
        return zzzmd;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final int zzY(zzZN3 zzzn3) throws Exception {
        if (zzS(zzzn3.zzZSD)) {
            return this.zzZSG;
        }
        zzZMF zzzmf = zzzn3.zzh1().zzS(this.zzZUt) instanceof zzZMF ? (zzZMF) zzzn3.zzh1().zzS(this.zzZUt) : null;
        this.zzZSP = zzzmf;
        if (zzzmf == null) {
            if (!zzzn3.zzUy(this.zzZUt.getNamespace())) {
                StringBuilder sb = new StringBuilder("Referenced group ");
                sb.append(this.zzZUt);
                sb.append(" was not found in the corresponding schema.");
            }
        } else if (zzzmf.zzgj() instanceof zzZN2) {
            this.zzZSh.intValue();
        }
        if (zzgh() != null) {
            zzgh().zzY(zzzn3);
        }
        this.zzZSD = zzzn3.zzZSD;
        return this.zzZSG;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final int zzZ(zzZN3 zzzn3) {
        if (zzg5() == zzzn3.zzg5()) {
            return 0;
        }
        this.zzZUG = zzzn3;
        zzZLF.zzZ(getId(), this, zzzn3.zzh0());
        zzg1();
        zzZN4 zzzn4 = this.zzZUt;
        if (zzzn4 != null) {
            zzzn4.isEmpty();
        }
        zzT(zzzn3.zzg5());
        return this.zzZSG;
    }

    @Override // com.aspose.words.internal.zzZLW
    public final zzZLW zzZ3(boolean z) throws Exception {
        if (this.zzZSQ) {
            return zzZLW.zzZSj;
        }
        zzZLW zzzlw = this.zzZSd;
        if (zzzlw != null) {
            return zzzlw;
        }
        this.zzZSQ = true;
        zzZMF zzzmf = this.zzZSP;
        if (zzzmf == null) {
            zzzmf = this.zzZUG.zzh1().zzS(this.zzZUt) instanceof zzZMF ? (zzZMF) this.zzZUG.zzh1().zzS(this.zzZUt) : null;
        }
        if (zzzmf == null || zzzmf.zzgj() == null) {
            this.zzZSd = zzZLW.zzZSj;
        } else {
            zzZME zzzmeZzgj = zzzmf.zzgj();
            this.zzZSd = zzzmeZzgj;
            zzZLW zzzlwZzZ3 = zzzmeZzgj.zzZ3(z);
            this.zzZSd = zzzlwZzZ3;
            if (zzzlwZzZ3 != zzZLW.zzZSj && (this.zzZSi.intValue() != 1 || this.zzZSh.intValue() != 1)) {
                zzZLW zzzlwZzg0 = this.zzZSd.zzg0();
                this.zzZSd = zzzlwZzg0;
                zzzlwZzg0.zzZSd = null;
                this.zzZSd.zzQ(this.zzZSn);
                this.zzZSd.zzP(this.zzZSm);
                this.zzZSd.zzg1();
            }
        }
        this.zzZSQ = false;
        return this.zzZSd;
    }

    public final zzZN4 zzgO() {
        return this.zzZUt;
    }

    public final zzZMF zzgh() {
        zzZMF zzzmf = this.zzZSP;
        if (zzzmf == null || !zzzmf.zzgk()) {
            return this.zzZSP;
        }
        return null;
    }
}

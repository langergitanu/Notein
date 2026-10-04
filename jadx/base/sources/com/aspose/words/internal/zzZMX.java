package com.aspose.words.internal;

import com.huawei.hms.network.embedded.C18437z2;
import com.microsoft.identity.common.java.jwt.AbstractJwtRequest;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZMX extends zzZLZ {
    private int zzZUm;
    private Object zzZUn;
    String zzZUo;
    private String zzZUp;
    private zzZN4 zzZUq;
    private int zzZUr;
    private zzZN4 zzZUs;
    private zzZN4 zzZUt;
    private int zzZUu;
    private String zzZUv;
    private String zzZUw;
    private zzZMX zzZUx;
    private zzZLN zzZUy;
    private Object zzZUz;
    private String zzZV0;

    public static zzZMX zzS(zzZQR zzzqr) {
        zzZMX zzzmx = new zzZMX();
        for (int i = 0; i < zzzqr.getAttributeCount(); i++) {
            try {
                String strZzRu = zzzqr.zzRu(i);
                String attributeValue = zzzqr.getAttributeValue(i);
                if ("default".equals(strZzRu)) {
                    zzzmx.zzZUw = attributeValue;
                } else if ("fixed".equals(strZzRu)) {
                    zzzmx.zzZUv = attributeValue;
                } else if ("form".equals(strZzRu)) {
                    zzzmx.zzZUu = zzZLF.zzUn(attributeValue);
                } else if ("id".equals(strZzRu)) {
                    zzzmx.setId(attributeValue);
                } else if ("name".equals(strZzRu)) {
                    zzzmx.setName(attributeValue);
                } else if ("ref".equals(strZzRu)) {
                    zzzmx.zzZUt = zzZLF.zzZ(zzzqr, i);
                } else if (C18437z2.f56754h.equals(strZzRu)) {
                    zzzmx.zzZUs = zzZLF.zzZ(zzzqr, i);
                } else if (AbstractJwtRequest.ClaimNames.USE.equals(strZzRu)) {
                    zzzmx.zzZUr = zzZLF.zzUm(attributeValue);
                } else {
                    zzzmx.zzZL(strZzRu, attributeValue);
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
                zzzmx.zzZ(zzZN1.zzW(zzzqr));
                c = 2;
            } else {
                if (c > 2 || !"simpleType".equals(zzzqr.getLocalName())) {
                    break;
                }
                zzzmx.zzY(zzZLN.zzm(zzzqr));
                c = 3;
            }
        }
        return zzzmx;
    }

    public final int getForm() {
        return this.zzZUu;
    }

    public final void zzV(zzZN4 zzzn4) {
        this.zzZUs = zzzn4;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final int zzY(zzZN3 zzzn3) throws Exception {
        if (zzS(zzzn3.zzZSD)) {
            return this.zzZSG;
        }
        if (zzgd() != null) {
            zzgd().zzY(zzzn3);
            this.zzZUz = zzgd();
        } else {
            zzZN4 zzzn4 = this.zzZUs;
            if (zzzn4 != null && zzzn4 != zzZN4.zzZV6) {
                zzZLH zzzlhZzY = zzzn3.zzY(zzzn4);
                if (!(zzzlhZzY instanceof zzZMQ)) {
                    if (zzzlhZzY != null) {
                        this.zzZSG = zzzlhZzY.zzY(zzzn3) + this.zzZSG;
                        this.zzZUz = zzzlhZzY;
                    } else {
                        zzZN4 zzzn42 = this.zzZUs;
                        if (zzzn42 == zzZMQ.zzZU2) {
                            this.zzZUz = zzZMQ.zzgz();
                        } else if (zzZLF.zzP(zzzn42)) {
                            this.zzZUz = zzZMN.zzU(this.zzZUs);
                        } else if (!zzzn3.zzUy(this.zzZUs.getNamespace())) {
                            StringBuilder sb = new StringBuilder("Referenced schema type ");
                            sb.append(this.zzZUs);
                            sb.append(" was not found in the corresponding schema.");
                        }
                    }
                }
            }
        }
        zzZN4 zzzn43 = this.zzZUt;
        if (zzzn43 != null && zzzn43 != zzZN4.zzZV6) {
            zzZMX zzzmxZzX = zzzn3.zzX(zzzn43);
            this.zzZUx = zzzmxZzX;
            if (zzzmxZzX != null) {
                this.zzZSG = zzzmxZzX.zzY(zzzn3) + this.zzZSG;
            } else if (!zzzn3.zzUy(this.zzZUt.getNamespace())) {
                StringBuilder sb2 = new StringBuilder("Referenced attribute ");
                sb2.append(this.zzZUt);
                sb2.append(" was not found in the corresponding schema.");
            }
        }
        if (this.zzZUz == null) {
            this.zzZUz = zzZLN.zzfN();
        }
        if (this.zzZUw != null || this.zzZUv != null) {
            Object obj = this.zzZUz;
            zzZMN zzzmn = obj instanceof zzZMN ? (zzZMN) obj : null;
            if (zzzmn == null) {
                zzzmn = ((zzZLN) obj).zzZQM;
            }
            if (zzzmn.zzht() != 10) {
                try {
                    String str = this.zzZUw;
                    if (str != null) {
                        String strZzUv = zzzmn.zzUv(str);
                        this.zzZUp = strZzUv;
                        zzZMN.zzUu(strZzUv);
                    }
                } catch (Exception e) {
                    new StringBuilder("The Attribute's default value is invalid with its type definition. ").append(e.getMessage());
                }
                try {
                    String str2 = this.zzZUv;
                    if (str2 != null) {
                        String strZzUv2 = zzzmn.zzUv(str2);
                        this.zzZUo = strZzUv2;
                        this.zzZUn = zzZMN.zzUu(strZzUv2);
                    }
                } catch (Exception e2) {
                    new StringBuilder("The Attribute's fixed value is invalid with its type definition.").append(e2.getMessage());
                }
            }
        }
        int i = this.zzZUr;
        if (i == 0) {
            this.zzZUm = 1;
        } else {
            this.zzZUm = i;
        }
        Object obj2 = this.zzZUz;
        if (obj2 != null) {
            this.zzZUy = obj2 instanceof zzZLN ? (zzZLN) obj2 : null;
            if (obj2 == zzZLN.zzfN()) {
                this.zzZUy = zzZLN.zzZRZ;
            }
            if (this.zzZUy == null) {
                this.zzZUy = zzZLH.zzQ(this.zzZUs);
            }
        }
        this.zzZSD = zzzn3.zzZSD;
        return this.zzZSG;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final void zzZ(zzZLZ zzzlz) {
        super.zzZ(zzzlz);
        if (zzgd() != null) {
            zzgd().zzZ(this);
        }
    }

    public final String zzgI() {
        return this.zzZUp;
    }

    public final int zzgJ() {
        return this.zzZUm;
    }

    public final zzZLN zzgK() {
        return this.zzZUy;
    }

    public final Object zzgL() {
        zzZMX zzzmx = this;
        while (true) {
            zzZMX zzzmx2 = zzzmx.zzZUx;
            if (zzzmx2 == null) {
                return zzzmx.zzZUz;
            }
            zzzmx = zzzmx2;
        }
    }

    public final String zzgM() {
        return this.zzZUw;
    }

    public final String zzgN() {
        return this.zzZUv;
    }

    public final zzZN4 zzgO() {
        return this.zzZUt;
    }

    public final int zzgP() {
        return this.zzZUr;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final zzZN4 zzgQ() {
        return this.zzZUq;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final int zzZ(zzZN3 zzzn3) {
        if (zzg5() == zzzn3.zzg5()) {
            return 0;
        }
        this.zzZSG = 0;
        if (!(zzg4() instanceof zzZN3) && !zzg7()) {
            zzZN4 zzzn4 = this.zzZUt;
            if (zzzn4 != null && !zzzn4.isEmpty()) {
                getName();
                zzgd();
                zzZN4 zzzn42 = this.zzZUs;
                if (zzzn42 != null) {
                    zzzn42.isEmpty();
                }
                zzZ(zzzn3, false);
            } else {
                int i = this.zzZUu;
                if (i != 1 && i == 0 && zzzn3.zzgV() != 1) {
                    this.zzZV0 = "";
                } else {
                    this.zzZV0 = "";
                }
                zzZ(zzzn3, true);
            }
        } else {
            zzZN4 zzzn43 = this.zzZUt;
            if (zzzn43 != null) {
                zzzn43.isEmpty();
            }
            this.zzZV0 = "";
            zzZ(zzzn3, true);
        }
        zzT(zzzn3.zzg5());
        return this.zzZSG;
    }

    private void zzZ(zzZN3 zzzn3, boolean z) {
        if (z) {
            if (getName() != null && zzZNA.zzUJ(getName()) && !"xmlns".equals(getName())) {
                this.zzZUq = new zzZN4(getName(), this.zzZV0);
            }
            if (zzgd() != null) {
                zzZN4 zzzn4 = this.zzZUs;
                if (zzzn4 != null) {
                    zzzn4.isEmpty();
                }
                this.zzZSG = zzgd().zzZ(zzzn3) + this.zzZSG;
            }
        } else {
            zzZN4 zzzn42 = this.zzZUt;
            if (zzzn42 != null && !zzzn42.isEmpty()) {
                this.zzZUq = this.zzZUt;
            } else {
                throw new IllegalStateException("Error: Should Never Happen. refname must be present");
            }
        }
        zzZLF.zzZ(getId(), this, zzzn3.zzh0());
    }
}

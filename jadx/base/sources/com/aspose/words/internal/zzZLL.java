package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZLL extends zzZLM {
    private zzZLN zzZR8;
    Object zzZR9;
    private zzZLN zzZRb;
    final String zzZUI = "list";
    private zzZN4 zzZRa = zzZN4.zzZV6;

    public static zzZLL zzl(zzZQR zzzqr) {
        zzZLL zzzll = new zzZLL();
        for (int i = 0; i < zzzqr.getAttributeCount(); i++) {
            try {
                String strZzRu = zzzqr.zzRu(i);
                String attributeValue = zzzqr.getAttributeValue(i);
                if ("id".equals(strZzRu)) {
                    zzzll.setId(attributeValue);
                } else if ("itemType".equals(strZzRu)) {
                    zzzll.setName(attributeValue);
                } else {
                    zzzll.zzZL(strZzRu, attributeValue);
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
                zzzll.zzZ(zzZN1.zzW(zzzqr));
                c = 2;
            } else {
                if (c > 2 || !"simpleType".equals(zzzqr.getLocalName())) {
                    break;
                }
                zzzll.zzZRb = zzZLN.zzm(zzzqr);
                c = 3;
            }
        }
        return zzzll;
    }

    public final void zzR(zzZN4 zzzn4) {
        this.zzZRa = zzzn4;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final int zzY(zzZN3 zzzn3) throws Exception {
        if (zzS(zzzn3.zzZSD)) {
            return this.zzZSG;
        }
        zzZLN zzzln = this.zzZRb;
        if (zzzln == null) {
            zzzln = (zzZLN) zzzn3.zzY(this.zzZRa);
        }
        if (zzzln != null) {
            this.zzZSG = zzzln.zzY(zzzn3) + this.zzZSG;
            this.zzZR9 = zzzln;
        } else {
            zzZN4 zzzn4 = this.zzZRa;
            if (zzzn4 == zzZMQ.zzZU2) {
                this.zzZR9 = zzZLN.zzfN();
            } else if (zzZLF.zzP(zzzn4)) {
                zzZMN zzzmnZzU = zzZMN.zzU(this.zzZRa);
                this.zzZR9 = zzzmnZzU;
                if (zzzmnZzU == null) {
                    new StringBuilder("Invalid schema type name was specified: ").append(this.zzZRa);
                }
            } else if (!zzzn3.zzUy(this.zzZRa.getNamespace())) {
                StringBuilder sb = new StringBuilder("Referenced base list item schema type ");
                sb.append(this.zzZRa);
                sb.append(" was not found.");
            }
        }
        Object obj = this.zzZR9;
        zzZLN zzzlnZzQr = obj instanceof zzZLN ? (zzZLN) obj : null;
        if (zzzlnZzQr == null && obj != null) {
            zzzlnZzQr = zzZLH.zzQr(((zzZMN) obj).zzhv());
        }
        this.zzZR8 = zzzlnZzQr;
        this.zzZSD = zzzn3.zzZSD;
        return this.zzZSG;
    }

    public final void zzZ(zzZLN zzzln) {
        this.zzZRb = zzzln;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final void zzZ(zzZLZ zzzlz) {
        super.zzZ(zzzlz);
        zzZLN zzzln = this.zzZRb;
        if (zzzln != null) {
            zzzln.zzZ(this);
        }
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final int zzZ(zzZN3 zzzn3) {
        if (zzg5() == zzzn3.zzg5()) {
            return 0;
        }
        this.zzZSG = 0;
        if (this.zzZRb != null) {
            this.zzZRa.isEmpty();
        }
        if (this.zzZRb == null) {
            this.zzZRa.isEmpty();
        }
        zzZLN zzzln = this.zzZRb;
        if (zzzln != null) {
            this.zzZSG = zzzln.zzZ(zzzn3) + this.zzZSG;
        }
        zzZLF.zzZ(getId(), this, zzzn3.zzh0());
        zzT(zzzn3.zzg5());
        return this.zzZSG;
    }
}

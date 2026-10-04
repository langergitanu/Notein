package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZLJ extends zzZLM {
    private zzZLN[] zzZQQ;
    private Object[] zzZQR;
    private zzZN4[] zzZQS;
    final String zzZUI = "union";
    private zzZLY zzZQT = new zzZLY();

    public static zzZLJ zzj(zzZQR zzzqr) {
        zzZLJ zzzlj = new zzZLJ();
        for (int i = 0; i < zzzqr.getAttributeCount(); i++) {
            try {
                String strZzRu = zzzqr.zzRu(i);
                String attributeValue = zzzqr.getAttributeValue(i);
                if ("id".equals(strZzRu)) {
                    zzzlj.setId(attributeValue);
                } else if ("memberTypes".equals(strZzRu)) {
                    String[] strArrZzUj = zzZLF.zzUj(attributeValue);
                    zzzlj.zzZQS = new zzZN4[strArrZzUj.length];
                    for (int i2 = 0; i2 < strArrZzUj.length; i2++) {
                        zzzlj.zzZQS[i2] = zzZLF.zzZ(zzzqr, strArrZzUj[i2]);
                    }
                } else {
                    zzzlj.zzZL(strZzRu, attributeValue);
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
                if (c <= 1 && "annotation".equals(zzzqr.getLocalName())) {
                    zzzlj.zzZ(zzZN1.zzW(zzzqr));
                } else {
                    if (c > 2 || !"simpleType".equals(zzzqr.getLocalName())) {
                        break;
                    }
                    zzzlj.zzZQT.zzW(zzZLN.zzm(zzzqr));
                }
                c = 2;
            }
        }
        return zzzlj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13, types: [com.aspose.words.internal.zzZNE$zzV] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v2, types: [com.aspose.words.internal.zzZLN] */
    /* JADX WARN: Type inference failed for: r7v6, types: [com.aspose.words.internal.zzZMN] */
    @Override // com.aspose.words.internal.zzZLZ
    public final int zzY(zzZN3 zzzn3) throws Exception {
        if (zzS(zzzn3.zzZSD)) {
            return this.zzZSG;
        }
        ArrayList arrayList = new ArrayList();
        zzZN4[] zzzn4Arr = this.zzZQS;
        int i = 0;
        if (zzzn4Arr != null) {
            for (zzZN4 zzzn4 : zzzn4Arr) {
                ?? ZzU = (zzZLN) zzzn3.zzY(zzzn4);
                if (!(zzzn3.zzY(zzzn4) instanceof zzZLN)) {
                    ZzU = 0;
                }
                if (ZzU != 0) {
                    this.zzZSG = ZzU.zzY(zzzn3) + this.zzZSG;
                } else if (zzzn4 == zzZMQ.zzZU2) {
                    ZzU = zzZLN.zzfN();
                } else if (zzzn4.getNamespace().equals("http://www.w3.org/2001/XMLSchema") || zzzn4.getNamespace().equals("http://www.w3.org/2003/11/xpath-datatypes")) {
                    ZzU = zzZMN.zzU(zzzn4);
                    if (ZzU == 0) {
                        new StringBuilder("Invalid schema type name was specified: ").append(zzzn4);
                    }
                } else {
                    if (!zzzn3.zzUy(zzzn4.getNamespace())) {
                        StringBuilder sb = new StringBuilder("Referenced base schema type ");
                        sb.append(zzzn4);
                        sb.append(" was not found in the corresponding schema.");
                    }
                    ZzU = 0;
                }
                arrayList.add(ZzU);
            }
        }
        zzZLY zzzly = this.zzZQT;
        if (zzzly != null) {
            for (zzZLZ zzzlz : zzzly) {
                zzzlz.zzY(zzzn3);
                arrayList.add(zzzlz);
            }
        }
        Object[] array = arrayList.toArray();
        this.zzZQR = array;
        if (array != null) {
            this.zzZQQ = new zzZLN[array.length];
            while (true) {
                Object[] objArr = this.zzZQR;
                if (i >= objArr.length) {
                    break;
                }
                Object obj = objArr[i];
                zzZLN zzzln = obj instanceof zzZLN ? (zzZLN) obj : null;
                if (zzzln != null) {
                    this.zzZQQ[i] = zzzln;
                }
                i++;
            }
        }
        this.zzZSD = zzzn3.zzZSD;
        return this.zzZSG;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final void zzZ(zzZLZ zzzlz) {
        super.zzZ(zzzlz);
        Iterator<zzZLZ> it = this.zzZQT.iterator();
        while (it.hasNext()) {
            it.next().zzZ(this);
        }
    }

    public final Object[] zzfJ() {
        return this.zzZQR;
    }

    @Override // com.aspose.words.internal.zzZLZ
    public final int zzZ(zzZN3 zzzn3) {
        int i = 0;
        if (zzg5() == zzzn3.zzg5()) {
            return 0;
        }
        this.zzZSG = 0;
        this.zzZQT.getCount();
        for (zzZLZ zzzlz : this.zzZQT) {
            if (zzzlz != null && (zzzlz instanceof zzZLN)) {
                this.zzZSG = ((zzZLN) zzzlz).zzZ(zzzn3) + this.zzZSG;
            }
        }
        if (this.zzZQS != null) {
            while (true) {
                zzZN4[] zzzn4Arr = this.zzZQS;
                if (i >= zzzn4Arr.length) {
                    break;
                }
                if (zzzn4Arr[i] == null) {
                    zzzn4Arr[i] = zzZN4.zzZV6;
                } else {
                    int length = zzzn4Arr.length;
                }
                i++;
            }
        }
        zzZLF.zzZ(getId(), this, zzzn3.zzh0());
        zzT(zzzn3.zzg5());
        return this.zzZSG;
    }
}

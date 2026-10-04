package com.aspose.words;

import com.facebook.common.callercontext.ContextChain;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
class zzZSA extends zzZE3 {
    private zzZDN zzYIV;

    public zzZSA(zzZDN zzzdn) {
        this.zzYIV = zzzdn;
    }

    @Override // com.aspose.words.zzZE3
    public final void run() {
        zzZDK zzzdkZzYXe = this.zzYIV;
        while (zzzdkZzYXe.zzYXe() != null && "div".equals(zzzdkZzYXe.zzYXe().getName())) {
            zzzdkZzYXe = zzzdkZzYXe.zzYXe();
        }
        zzZDN zzzdnZzYXe = zzzdkZzYXe.zzYXe();
        if (zzzdnZzYXe != null) {
            if (ContextChain.TAG_PRODUCT.equals(zzzdnZzYXe.getName()) || "h1".equals(zzzdnZzYXe.getName()) || "h2".equals(zzzdnZzYXe.getName()) || "h3".equals(zzzdnZzYXe.getName()) || "h4".equals(zzzdnZzYXe.getName()) || "h5".equals(zzzdnZzYXe.getName()) || "h6".equals(zzzdnZzYXe.getName())) {
                ArrayList arrayList = new ArrayList();
                int iZzV = zzzdnZzYXe.zzYXk().zzV(zzzdkZzYXe);
                int count = (zzzdnZzYXe.zzYXk().getCount() - iZzV) - 1;
                if (count > 0) {
                    zzZDN zzzdn = (zzZDN) zzzdnZzYXe.zzYXi();
                    for (int i = 0; i < count; i++) {
                        zzZDK zzzdkZzyy = zzzdnZzYXe.zzYXk().zzyy(iZzV + 1);
                        zzzdnZzYXe.zzYXk().zzW(zzzdkZzyy);
                        zzzdn.zzYXk().zzX(zzzdkZzyy);
                    }
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZDN>) arrayList, zzzdn);
                }
                zzzdnZzYXe.zzYXk().zzW(zzzdkZzYXe);
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZDK>) arrayList, zzzdkZzYXe);
                if (iZzV > 0) {
                    zzZDN zzzdn2 = (zzZDN) zzzdnZzYXe.zzYXi();
                    for (int i2 = 0; i2 < iZzV; i2++) {
                        zzZDK zzzdkZzyy2 = zzzdnZzYXe.zzYXk().zzyy(0);
                        zzzdnZzYXe.zzYXk().zzW(zzzdkZzyy2);
                        zzzdn2.zzYXk().zzX(zzzdkZzyy2);
                    }
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZDN>) arrayList, zzzdn2);
                }
                zzZDN zzzdnZzYXe2 = zzzdnZzYXe.zzYXe();
                int iZzV2 = zzzdnZzYXe2.zzYXk().zzV(zzzdnZzYXe);
                zzzdnZzYXe2.zzYXk().zzW(zzzdnZzYXe);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    zzzdnZzYXe2.zzYXk().zzZ(iZzV2, (zzZDN) it.next());
                }
            }
        }
    }

    @Override // com.aspose.words.zzZE3
    public final boolean zzZ(zzZE3 zzze3) {
        zzZSA zzzsa = (zzZSA) com.aspose.words.internal.zzZKW.zzZ(zzze3, zzZSA.class);
        return zzzsa != null && this.zzYIV == zzzsa.zzYIV;
    }
}

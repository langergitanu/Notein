package com.aspose.words;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ6E {
    private zzZ6H zzYfc;

    public zzZ6E(zzZ6H zzz6h) throws Exception {
        com.aspose.words.internal.zzZYD.zzXk(zzz6h.getText());
        this.zzYfc = zzz6h;
    }

    private static float zzZ(String str, zzYAU zzyau) throws Exception {
        return ((zzY9W) com.aspose.words.internal.zzZKW.zzZ(zzyau, zzY9W.class)) != null ? r0.zzY4W() / 1000.0f : zzyau.zzY6N().zzZr().zz7(str);
    }

    public final ArrayList<zzZ6H> zzYRI() throws Exception {
        ArrayList<zzZ6H> arrayList = new ArrayList<>();
        float fZzYRP = (float) ((this.zzYfc.zzYRP() * 100.0d) / ((double) this.zzYfc.getFont().getScaling()));
        float fIntBitsToFloat = Float.intBitsToFloat((int) this.zzYfc.zzZT());
        Iterable<String> zzzwq = new com.aspose.words.internal.zzZWQ(this.zzYfc.getText());
        if (this.zzYfc.zzYS0()) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = zzzwq.iterator();
            while (it.hasNext()) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<String>) arrayList2, (String) it.next());
            }
            Collections.reverse(arrayList2);
            zzzwq = arrayList2;
        }
        zzYAU zzyauZz14 = this.zzYfc.zz14();
        zzyauZz14.zzYRr();
        for (String str : zzzwq) {
            float fZzZ = zzZ(str, zzyauZz14);
            com.aspose.words.internal.zzZQG.zzZ(arrayList, zzZ(str, zzyauZz14, fIntBitsToFloat, com.aspose.words.internal.zzZPY.zzYC(this.zzYfc.zzZT())));
            if (fZzZ + fZzYRP > 0.0f) {
                fIntBitsToFloat = fIntBitsToFloat + fZzZ + fZzYRP;
            }
        }
        return arrayList;
    }

    private static zzZ6H zzZ(String str, zzYAU zzyau, float f, float f2) throws Exception {
        zzyau.zzZo6();
        zzYAU zzyauZzZ = zzYAB.zzZ(EditingLanguage.ARABIC_YEMEN, str, zzyau.zzY7u(), null);
        zzyauZzZ.zzU(zzyau.zzY6N());
        zzyauZzZ.zzZ(zzyau.zzY72());
        zzyauZzZ.zzQI(zzyau.zzZSu());
        zzyauZzZ.zzZA(zzyau.zzY6Y());
        zzyauZzZ.setX(com.aspose.words.internal.zzSA.zzn(f));
        zzyauZzZ.setY(com.aspose.words.internal.zzSA.zzn(f2));
        zzyauZzZ.zzY(zzyau.zzZZJ());
        zzZ64 zzz64 = new zzZ64(zzyauZzZ);
        zzz64.zzY(com.aspose.words.internal.zzZPY.zzG(f, f2));
        return zzz64;
    }
}

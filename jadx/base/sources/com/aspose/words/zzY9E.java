package com.aspose.words;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzY9E {
    private static void zzE(zzYAU zzyau, zzYAU zzyau2) {
        if (zzyau instanceof zzYAT) {
            String name = ((zzYAT) zzyau).getName();
            zzYAU zzyau3 = zzyau.zzab().zzZoO().get(name);
            if (zzyau3 == null || zzyau3 == zzyau || !zzyau3.zzY6X()) {
                zzyau.zzab().zzZoO().set(name, zzyau2);
            }
        }
    }

    public static void zzZ(zzY9C zzy9c, zzY9C zzy9c2) throws Exception {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        zzZ4N zzz4nZzYPe = zzy9c.zzY4s().zzYPe();
        zzz4nZzYPe.reset();
        while (zzz4nZzYPe.moveNext()) {
            zzYAU zzyau = (zzYAU) zzz4nZzYPe.zzYPi();
            zzYAU zzyauZzY71 = zzyau.zzY71();
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzYAU>) arrayList, zzyauZzY71);
            com.aspose.words.internal.zzZQF.zzY(map, zzyau, zzyauZzY71);
        }
        zzY9B zzy9b = new zzY9B(zzy9c2);
        zzz4nZzYPe.reset();
        int i = 0;
        zzYAU zzyau2 = null;
        int i2 = 0;
        while (zzz4nZzYPe.moveNext()) {
            zzYAU zzyau3 = (zzYAU) zzz4nZzYPe.zzYPi();
            int i3 = i + 1;
            zzYAU zzyau4 = (zzYAU) arrayList.get(i);
            zzy9b.zzD(zzyau2, zzyau4);
            zzyau4.zzZ(map, zzyau3);
            zzE(zzyau3, zzyau4);
            zzYAQ zzyaq = (zzYAQ) com.aspose.words.internal.zzZKW.zzZ(zzyau4, zzYAQ.class);
            if (zzyaq != null) {
                i2++;
                zzyaq.zzlO(i2);
            }
            zzyau2 = zzyau4;
            i = i3;
        }
        zzy9b.commit();
    }
}

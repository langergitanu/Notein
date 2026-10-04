package com.aspose.words;

import com.huawei.hms.network.embedded.C18437z2;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYUF {
    public static void zzZ(zzYU6 zzyu6, zzYDZ zzydz, boolean z) {
        ArrayList<ShapeBase> arrayList = z ? zzydz.zzXoT : zzydz.zzXoU;
        String str = z ? "w:hdrShapeDefaults" : "w:shapeDefaults";
        if (arrayList.size() == 0) {
            return;
        }
        zzyu6.zzY(str);
        zzyu6.zzY("o:shapelayout");
        zzyu6.zzY("o:rules");
        int i = 1;
        for (ShapeBase shapeBase : arrayList) {
            zzTM zztm = (zzTM) shapeBase.zzYvW().get(4156);
            zzyu6.zzY("o:r");
            zzyu6.zz0("id", com.aspose.words.internal.zzZKN.format("V:Rule{0}", Integer.valueOf(i)));
            zzyu6.zz0(C18437z2.f56754h, "connector");
            zzyu6.zz0("idref", zzZS(shapeBase));
            zzyu6.zzY("o:proxy");
            zzyu6.zzX("start", "");
            zzyu6.zz0("idref", zzZS(zzydz.zzXoZ.get(zztm.zzZsG)));
            zzyu6.zzZj("connectloc", zztm.zzZsE);
            zzyu6.zzo();
            zzyu6.zzY("o:proxy");
            zzyu6.zzX("end", "");
            zzyu6.zz0("idref", zzZS(zzydz.zzXoZ.get(zztm.zzZsF)));
            zzyu6.zzZj("connectloc", zztm.zzZsD);
            zzyu6.zzo();
            zzyu6.zzo();
            i++;
        }
        zzyu6.zzo();
        zzyu6.zzo();
        zzyu6.zzo();
    }

    private static String zzZS(ShapeBase shapeBase) {
        String strZzZR = (String) shapeBase.zzYvW().get(896);
        if (!com.aspose.words.internal.zzZYD.zzXk(strZzZR)) {
            strZzZR = zzYU3.zzZR(shapeBase);
        }
        return com.aspose.words.internal.zzZKN.format("#{0}", strZzZR);
    }
}

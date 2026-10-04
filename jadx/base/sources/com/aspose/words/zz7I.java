package com.aspose.words;

import com.miui.penengine.p596e.C18773h;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zz7I {
    private static void zzY(ArrayList<zzBG> arrayList, zzZYD zzzyd, String str) {
        if (arrayList.size() == 0) {
            return;
        }
        zzzyd.zzY(str);
        for (zzBG zzbg : arrayList) {
            zzzyd.zzY("a:cxn");
            zzzyd.zz0("ang", zzbg.zzZFc().getString());
            zzZ(zzbg.zzZFb(), zzzyd, "a:pos");
            zzzyd.zzo();
        }
        zzzyd.zzo();
    }

    public static void zzZ(zz7H zz7h, zzZXR zzzxr) {
        if (zz7h == null) {
            return;
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        if (com.aspose.words.internal.zzZYD.zzXk(zz7h.zzZAO())) {
            zzzydZzZlV.zzY("a:prstGeom");
            zzzydZzZlV.zz0("prst", zz7h.zzZAO());
            zzZ(zz7h.zzZAP().zzZA2(), zzzydZzZlV, "a:avLst");
            zzzydZzZlV.zzo();
            return;
        }
        zzzydZzZlV.zzY("a:custGeom");
        zzZ(zz7h.zzZAP().zzZA2(), zzzydZzZlV, "a:avLst");
        zzZ(zz7h.zzZAP().zzZA1(), zzzydZzZlV, "a:gdLst");
        zzY(zz7h.zzZAJ(), zzzydZzZlV, "a:cxnLst");
        if (zz7h.zzZAK() != null) {
            zzZ(zz7h.zzZAK(), zzzydZzZlV);
        }
        zzY(zz7h.zzZAN(), zzzydZzZlV);
        zzzydZzZlV.zzo();
    }

    private static void zzY(ArrayList<zz45> arrayList, zzZYD zzzyd) {
        zzzyd.zzY("a:pathLst");
        Iterator<zz45> it = arrayList.iterator();
        while (it.hasNext()) {
            zzZ(it.next(), zzzyd);
        }
        zzzyd.zzo();
    }

    private static void zzZ(zz0Y zz0y, zzZYD zzzyd) {
        zzzyd.zzY("a:rect");
        zzzyd.zz0("l", zz0y.zzZtp());
        zzzyd.zz0("t", zz0y.zzZto());
        zzzyd.zz0("r", zz0y.zzZtn());
        zzzyd.zz0("b", zz0y.zzZtm());
        zzzyd.zzo();
    }

    public static void zzZ(ArrayList<zz6W> arrayList, zzZYD zzzyd, String str) {
        zzzyd.zzY(str);
        Iterator<zz6W> it = arrayList.iterator();
        while (it.hasNext()) {
            zzZ(it.next(), zzzyd);
        }
        zzzyd.zzo();
    }

    private static void zzZ(zzJH zzjh, zzZYD zzzyd, String str) {
        zzzyd.zzY(str);
        zzzyd.zz0("x", zzjh.zzZSp().getString());
        zzzyd.zz0("y", zzjh.zzZSo().getString());
        zzzyd.zzo();
    }

    private static void zzZ(zz6W zz6w, zzZYD zzzyd) {
        if (zz6w.zzZA5()) {
            return;
        }
        zzzyd.zzX("a:gd", "name", zz6w.getName(), "fmla", zz6w.zzZA6().getSource());
    }

    private static void zzZ(zz45 zz45Var, zzZYD zzzyd) {
        zzzyd.zzY("a:path");
        zzzyd.zz0("fill", zz84.zzIt(zz45Var.zzO6()));
        if (zz45Var.zzZx0()) {
            zzzyd.zzO(C18773h.f57233c, zz45Var.getHeight());
        }
        if (zz45Var.zzZx1()) {
            zzzyd.zzO("w", zz45Var.getWidth());
        }
        zzzyd.zzx("stroke", zz45Var.zzZx2());
        zzzyd.zzw("extrusionOk", zz45Var.zzZwZ());
        Iterator<zzZC4> it = zz45Var.zzZx3().iterator();
        while (it.hasNext()) {
            it.next().zzZ(zzzyd);
        }
        zzzyd.zzo();
    }
}

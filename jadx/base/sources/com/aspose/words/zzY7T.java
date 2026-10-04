package com.aspose.words;

import com.aspose.words.ref.RefBoolean;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzY7T {
    private static com.aspose.words.internal.zzZQ4 zzX8a = new com.aspose.words.internal.zzZQ4(0.0f, 0.0f, 75.0f, 75.0f);
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("stop", "reflect", "repeat", "pad");

    private static int zzAs(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP != 1) {
            return iZzTP != 2 ? 4 : 0;
        }
        return 3;
    }

    private static void zzT(com.aspose.words.internal.zzPI[] zzpiArr) {
        if (zzpiArr.length == 0) {
            return;
        }
        if (zzpiArr[0].zzOG() > 0.0f) {
            zzpiArr[0] = new com.aspose.words.internal.zzPI(zzpiArr[0].zzZy(), 0.0f);
        }
        if (zzpiArr[zzpiArr.length - 1].zzOG() < 1.0f) {
            zzpiArr[zzpiArr.length - 1] = new com.aspose.words.internal.zzPI(zzpiArr[zzpiArr.length - 1].zzZy(), 1.0f);
        }
    }

    private static com.aspose.words.internal.zzPI zzX(zzY7J zzy7j, zzY7X zzy7x) {
        String strZzKM = zzy7x.zzKM("offset");
        float fZzZ = 0.0f;
        if (com.aspose.words.internal.zzZYD.zzXk(strZzKM)) {
            RefBoolean refBoolean = new RefBoolean(false);
            fZzZ = zzY7B.zzZ(strZzKM, zzy7j, 0.0f, refBoolean);
            refBoolean.get();
        }
        com.aspose.words.internal.zzPV zzpvZzSB = zzy7x.zzZWe().zzSB("stop-color");
        if (zzpvZzSB == null) {
            zzpvZzSB = com.aspose.words.internal.zzPV.zzHZ;
        }
        double dZzSD = zzy7x.zzZWe().zzSD("stop-opacity");
        if (!com.aspose.words.internal.zzAN.zzZC(dZzSD)) {
            zzpvZzSB = new com.aspose.words.internal.zzPV((int) (dZzSD * 255.0d), zzpvZzSB);
        }
        return new com.aspose.words.internal.zzPI(zzpvZzSB, fZzZ);
    }

    private static com.aspose.words.internal.zzPY zzY(zzY7J zzy7j, zzY7X zzy7x, com.aspose.words.internal.zzZQ4 zzzq4) {
        com.aspose.words.internal.zzPI[] zzpiArrZzY = zzY(zzy7j, zzy7x);
        if (zzZ(zzpiArrZzY, zzy7x.zzY1r())) {
            return new com.aspose.words.internal.zzOI(zzpiArrZzY[zzpiArrZzY.length - 1].zzZy());
        }
        zzY7U zzy7uZzY1r = zzy7x.zzY1r();
        return zzy7uZzY1r.zzY1i() ? zzZ(zzX8a, zzpiArrZzY, zzy7uZzY1r.zzY1f()) : zzZ(zzy7uZzY1r, zzzq4, zzpiArrZzY);
    }

    public static com.aspose.words.internal.zzPY zzZ(zzY7J zzy7j, zzY7X zzy7x, com.aspose.words.internal.zzZQ4 zzzq4) {
        zzY7X zzy7xZzAp;
        if (zzy7x.hasAttribute("href")) {
            zzy7xZzAp = zzy7j.zzAp(zzy7x.getAttributeValue("href", ""));
            if (zzy7xZzAp == null) {
                return null;
            }
            for (String str : zzy7x.zzY1p()) {
                zzy7xZzAp.setAttribute(str, zzy7x.zzKM(str));
            }
        } else {
            zzy7xZzAp = zzy7x;
        }
        zzy7x.zzZ(zzZ(zzy7j, zzy7xZzAp));
        zzy7xZzAp.zzZ(zzy7x.zzY1r());
        return zzY(zzy7j, zzy7xZzAp, zzzq4);
    }

    private static com.aspose.words.internal.zzPI[] zzY(zzY7J zzy7j, zzY7X zzy7x) {
        ArrayList arrayList = new ArrayList();
        for (zzY7X zzy7x2 : zzy7x.zzQw()) {
            if (zzUR.zzTP(zzy7x2.zzZTQ()) != 0) {
                zzy7j.zzT(16777216, com.aspose.words.internal.zzZKN.format("Element '{0}' is unexpected at this location and will be ignored", zzy7x2.zzZTQ()));
            } else {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzPI>) arrayList, zzX(zzy7j, zzy7x2));
            }
        }
        com.aspose.words.internal.zzPI[] zzpiArr = new com.aspose.words.internal.zzPI[arrayList.size()];
        com.aspose.words.internal.zzZQG.zzY(arrayList, zzpiArr);
        zzT(zzpiArr);
        return zzpiArr;
    }

    private static zzY7U zzZ(zzY7J zzy7j, zzY7X zzy7x) {
        zzY7J zzy7j2;
        zzY7X zzy7x2;
        zzY7U zzy7u = new zzY7U();
        zzy7u.zzPX("linearGradient".equals(zzy7x.zzZTQ()));
        zzy7u.zzPW("userSpaceOnUse".equals(zzY7B.zzZ(zzy7x, "gradientUnits", "")));
        zzy7u.zzPV(true);
        zzy7u.zzPU(true);
        zzy7u.zzPT(true);
        zzy7u.zzPS(true);
        zzy7u.zzPR(true);
        zzy7u.zzPQ(true);
        if (zzy7u.zzY1i()) {
            zzy7u.zzY4(0.0f);
            zzy7u.zzY3(0.0f);
            zzy7u.zzY2(1.0f);
            zzy7u.zzY1(0.0f);
            RefBoolean refBoolean = new RefBoolean(zzy7u.zzY1g());
            zzy7x2 = zzy7x;
            zzy7u.zzY4(zzZ(zzy7j, zzy7x, "x1", zzy7u.zzY1d(), refBoolean, zzy7u.zzY17()));
            zzy7u.zzPV(refBoolean.get());
            refBoolean.set(zzy7u.zzY1g());
            zzy7u.zzY3(zzZ(zzy7j, zzy7x, "y1", zzy7u.zzY1c(), refBoolean, zzy7u.zzY16()));
            zzy7u.zzPU(refBoolean.get());
            refBoolean.set(zzy7u.zzY1g());
            zzy7u.zzY2(zzZ(zzy7j, zzy7x, "x2", zzy7u.zzY1b(), refBoolean, zzy7u.zzY15()));
            zzy7u.zzPT(refBoolean.get());
            refBoolean.set(zzy7u.zzY1g());
            zzy7j2 = zzy7j;
            zzy7u.zzY1(zzZ(zzy7j, zzy7x, "y2", zzy7u.zzY1a(), refBoolean, zzy7u.zzY14()));
            zzy7u.zzPS(refBoolean.get());
        } else {
            zzy7j2 = zzy7j;
            zzy7x2 = zzy7x;
            zzy7u.zzY4(0.5f);
            zzy7u.zzY3(0.5f);
            RefBoolean refBoolean2 = new RefBoolean(zzy7u.zzY1g());
            zzy7u.zzY4(zzZ(zzy7j2, zzy7x2, "cx", zzy7u.zzY1d(), refBoolean2, zzy7u.zzY17()));
            zzy7u.zzPV(refBoolean2.get());
            refBoolean2.set(zzy7u.zzY1g());
            zzy7u.zzY3(zzZ(zzy7j2, zzy7x2, TranslateLanguage.WELSH, zzy7u.zzY1c(), refBoolean2, zzy7u.zzY16()));
            zzy7u.zzPU(refBoolean2.get());
            refBoolean2.set(zzy7u.zzY17());
            zzy7u.zzY2(zzZ(zzy7j2, zzy7x2, "fx", zzy7u.zzY1d(), refBoolean2, zzy7u.zzY17()));
            zzy7u.zzPT(refBoolean2.get());
            refBoolean2.set(zzy7u.zzY16());
            zzy7u.zzY1(zzZ(zzy7j2, zzy7x2, "fy", zzy7u.zzY1c(), refBoolean2, zzy7u.zzY16()));
            zzy7u.zzPS(refBoolean2.get());
            refBoolean2.set(zzy7u.zzY1g());
            zzy7u.zzXZ(zzZ(zzy7j2, zzy7x2, TranslateLanguage.FRENCH, zzy7u.zzY18(), refBoolean2, zzy7u.zzY13()));
            zzy7u.zzPR(refBoolean2.get());
            refBoolean2.set(zzy7u.zzY1g());
            zzy7u.zzY0(zzZ(zzy7j2, zzy7x2, "r", zzy7u.zzY19(), refBoolean2, zzy7u.zzY12()));
            zzy7u.zzPQ(refBoolean2.get());
        }
        zzy7u.zzkv(zzAs(zzY7B.zzZ(zzy7x2, "spreadMethod", "")));
        zzy7u.zzn(zzY7B.zzZ(zzy7j2, zzy7x2, "gradientTransform", zzy7u.zzY1e()));
        zzy7u.zzAt(zzy7x2.getAttributeValue("href", ""));
        zzy7u.setId(zzy7x2.getAttributeValue("id", ""));
        return zzy7u;
    }

    private static float zzZ(zzY7J zzy7j, zzY7X zzy7x, String str, float f, RefBoolean refBoolean, boolean z) {
        if (!zzy7x.hasAttribute(str)) {
            refBoolean.set(z);
            return f;
        }
        String strZzKM = zzy7x.zzKM(str);
        com.aspose.words.internal.zzZYD.zzXk(strZzKM);
        RefBoolean refBoolean2 = new RefBoolean(false);
        float fZzZ = zzY7B.zzZ(strZzKM, zzy7j, f, refBoolean2);
        if (refBoolean2.get()) {
            refBoolean.set(true);
            return fZzZ;
        }
        if (refBoolean.get()) {
            return fZzZ;
        }
        refBoolean.set(false);
        return zzY7B.zzZ(zzy7j, zzy7x, str, f);
    }

    private static com.aspose.words.internal.zzPL zzZ(com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzPI[] zzpiArr, int i) {
        com.aspose.words.internal.zzPA zzpa = new com.aspose.words.internal.zzPA(zzzq4);
        zzpa.zzY(zzpiArr);
        zzpa.zzXR(i);
        return zzpa;
    }

    private static com.aspose.words.internal.zzPL zzZ(zzY7U zzy7u, com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzPI[] zzpiArr) {
        com.aspose.words.internal.zzOP zzop = new com.aspose.words.internal.zzOP(new com.aspose.words.internal.zzPP(zzy7u.zzY1d(), zzy7u.zzY17(), zzy7u.zzY1c(), zzy7u.zzY16()), new com.aspose.words.internal.zzPQ(zzy7u.zzY19(), zzy7u.zzY12()), new com.aspose.words.internal.zzPP(zzy7u.zzY1b(), zzy7u.zzY15(), zzy7u.zzY1a(), zzy7u.zzY14()), new com.aspose.words.internal.zzPQ(zzy7u.zzY18(), zzy7u.zzY13()));
        zzop.zzd(zzy7u.zzY1h());
        zzop.zzL(zzy7u.zzY1e());
        zzop.zzY(zzpiArr);
        zzop.zzXR(zzy7u.zzY1f());
        zzop.zzI(zzzq4);
        return zzop;
    }

    private static boolean zzZ(com.aspose.words.internal.zzPI[] zzpiArr, zzY7U zzy7u) {
        if (zzpiArr.length == 0) {
            return false;
        }
        com.aspose.words.internal.zzPV zzpvZzZy = zzpiArr[0].zzZy();
        boolean zZzZ = true;
        for (com.aspose.words.internal.zzPI zzpi : zzpiArr) {
            zZzZ &= com.aspose.words.internal.zzPV.zzZ(zzpvZzZy, zzpi.zzZy());
        }
        if (zzy7u.zzY1i() && com.aspose.words.internal.zzAN.zzS(zzy7u.zzY1d(), zzy7u.zzY1b()) && com.aspose.words.internal.zzAN.zzS(zzy7u.zzY1c(), zzy7u.zzY1a())) {
            return true;
        }
        return zZzZ;
    }
}

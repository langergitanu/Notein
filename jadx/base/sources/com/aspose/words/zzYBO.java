package com.aspose.words;

import com.aspose.slides.C22207OooOOoo;
import com.aspose.words.ref.RefBoolean;
import com.aspose.words.ref.RefInt;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYBO {
    private static HashMap<Integer, Integer> zzXeC = zzY8n();
    private static zzJR zzXeD = new zzZVI();

    private static boolean zzI(zzYAU zzyau, zzYAU zzyau2) throws Exception {
        if (((zzZ55) zzyau.zzZZJ()) != ((zzZ55) zzyau2.zzZZJ())) {
            return false;
        }
        zzZ32 zzz32ZzY6N = zzyau.zzY6N();
        zzZ32 zzz32ZzY6N2 = zzyau2.zzY6N();
        if (zzyau2.zzZo6() == 9250) {
            return false;
        }
        if (zzyau.zzZo6() == 9753 || zzyau2.zzZo6() == 9753) {
            return zzz32ZzY6N.zzZz() == zzz32ZzY6N2.zzZz();
        }
        String name = zzz32ZzY6N.getName();
        String name2 = zzz32ZzY6N2.getName();
        int i = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8;
        return com.aspose.words.internal.zzZKN.zzX(name, name2, i) && com.aspose.words.internal.zzZKN.zzX(zzz32ZzY6N.getAltName(), zzz32ZzY6N2.getAltName(), i) && com.aspose.words.internal.zzZKN.zzX(zzz32ZzY6N.zzYL7(), zzz32ZzY6N2.zzYL7(), i) && zzz32ZzY6N.zzYL0() == zzz32ZzY6N2.zzYL0() && zzz32ZzY6N.zzYKY() == zzz32ZzY6N2.zzYKY() && zzz32ZzY6N.zzZz() == zzz32ZzY6N2.zzZz() && zzz32ZzY6N.zzYKX() == zzz32ZzY6N2.zzYKX() && zzz32ZzY6N.getPosition() == zzz32ZzY6N2.getPosition() && zzz32ZzY6N.zzZ9q() == zzz32ZzY6N2.zzZ9q() && zzz32ZzY6N.getSpacing() == zzz32ZzY6N2.getSpacing() && zzz32ZzY6N.zzZUF() == zzz32ZzY6N2.zzZUF() && zzz32ZzY6N.zzYKO().equals(zzz32ZzY6N2.zzYKO()) && zzz32ZzY6N.zzYL5() == zzz32ZzY6N2.zzYL5() && zzz32ZzY6N.zzYL4() == zzz32ZzY6N2.zzYL4() && zzz32ZzY6N.zzYL2() == zzz32ZzY6N2.zzYL2() && zzz32ZzY6N.getLocaleIdFarEast() == zzz32ZzY6N2.getLocaleIdFarEast() && zzz32ZzY6N.getLocaleId() == zzz32ZzY6N2.getLocaleId() && com.aspose.words.internal.zzZKO.equals(zzz32ZzY6N.zzYKL(), zzz32ZzY6N2.zzYKL()) && zzz32ZzY6N.zzYKF() == zzz32ZzY6N2.zzYKF() && zzz32ZzY6N.zzYKE() == zzz32ZzY6N2.zzYKE() && zzz32ZzY6N.zzYKD() == zzz32ZzY6N2.zzYKD() && zzZNU.zzZ(zzz32ZzY6N.zzYKK(), zzz32ZzY6N2.zzYKK()) && zzz32ZzY6N.zzZr().zzPl().isEmbedded() == zzz32ZzY6N2.zzZr().zzPl().isEmbedded() && zzz32ZzY6N.zz6c() == zzz32ZzY6N2.zz6c();
    }

    private static int zzQ(int i, boolean z, boolean z2) {
        if (zzY42.zzjm(i) || i == 1517976186) {
            return 0;
        }
        return i == 1517910393 ? (z2 || z) ? 1 : 2 : zzY42.zzjl(i) ? 1 : 2;
    }

    public static int[] zzV(zzZ32 zzz32) {
        ArrayList arrayList = new ArrayList(4);
        if (zzz32.zzYL3()) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<Integer>) arrayList, Integer.valueOf(FontFeature.KERNING));
        }
        int iZzYKF = zzz32.zzYKF();
        if (iZzYKF == 1) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<Integer>) arrayList, Integer.valueOf(FontFeature.PROPORTIONAL_FIGURES));
        } else if (iZzYKF == 2) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<Integer>) arrayList, Integer.valueOf(FontFeature.TABULAR_FIGURES));
        }
        int iZzYKE = zzz32.zzYKE();
        if (iZzYKE == 1) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<Integer>) arrayList, Integer.valueOf(FontFeature.LINING_FIGURES));
        } else if (iZzYKE == 2) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<Integer>) arrayList, Integer.valueOf(FontFeature.OLDSTYLE_FIGURES));
        }
        for (Integer num : zzXeC.keySet()) {
            int iIntValue = num.intValue();
            if ((zzz32.zzYKD() & iIntValue) == iIntValue) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<Integer>) arrayList, zzXeC.get(num));
            }
        }
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Integer) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    private static boolean zzVL(int i, int i2) {
        if (i == i2) {
            return true;
        }
        if (!zzY42.zzjm(i)) {
            return zzY42.zzjo(i) || zzY42.zzjo(i2);
        }
        zzY42.zzjm(i2);
        return false;
    }

    private static boolean zzVM(int i, int i2) {
        return i == 0 || i2 == 0 || i == i2;
    }

    private static HashMap<zzYAU, Cluster[]> zzY(zzYAU zzyau, ITextShaperFactory iTextShaperFactory) throws Exception {
        zzyau.zzZo6();
        Cluster[] clusterArr = zzZ(new String[]{CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR}, zzyau.zzY6N(), iTextShaperFactory, UnicodeScript.COMMON, false)[0];
        clusterArr[0].getCodepoints()[0] = 173;
        HashMap<zzYAU, Cluster[]> map = new HashMap<>();
        com.aspose.words.internal.zzZQF.zzY(map, zzyau, clusterArr);
        return map;
    }

    private static HashMap<Integer, Integer> zzY8n() {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(C22207OooOOoo.OooO00o(FontFeature.STYLISTIC_SET_19, map, C22207OooOOoo.OooO00o(FontFeature.STYLISTIC_SET_18, map, C22207OooOOoo.OooO00o(FontFeature.STYLISTIC_SET_17, map, C22207OooOOoo.OooO00o(FontFeature.STYLISTIC_SET_16, map, C22207OooOOoo.OooO00o(FontFeature.STYLISTIC_SET_15, map, C22207OooOOoo.OooO00o(FontFeature.STYLISTIC_SET_14, map, C22207OooOOoo.OooO00o(FontFeature.STYLISTIC_SET_13, map, C22207OooOOoo.OooO00o(FontFeature.STYLISTIC_SET_12, map, C22207OooOOoo.OooO00o(FontFeature.STYLISTIC_SET_11, map, C22207OooOOoo.OooO00o(FontFeature.STYLISTIC_SET_10, map, C22207OooOOoo.OooO00o(FontFeature.STYLISTIC_SET_09, map, C22207OooOOoo.OooO00o(FontFeature.STYLISTIC_SET_08, map, C22207OooOOoo.OooO00o(FontFeature.STYLISTIC_SET_07, map, C22207OooOOoo.OooO00o(FontFeature.STYLISTIC_SET_06, map, C22207OooOOoo.OooO00o(FontFeature.STYLISTIC_SET_05, map, C22207OooOOoo.OooO00o(FontFeature.STYLISTIC_SET_04, map, C22207OooOOoo.OooO00o(FontFeature.STYLISTIC_SET_03, map, C22207OooOOoo.OooO00o(FontFeature.STYLISTIC_SET_02, map, C22207OooOOoo.OooO00o(FontFeature.STYLISTIC_SET_01, map, 1, 2), 4), 8), 16), 32), 64), 128), 256), 512), 1024), 2048), 4096), 8192), 16384), 32768), 65536), 131072), 262144), 524288), Integer.valueOf(FontFeature.STYLISTIC_SET_20));
        return map;
    }

    public static zzJR zzY8o() {
        return zzXeD;
    }

    public static zzJR zzZ(ITextShaperFactory iTextShaperFactory) {
        return iTextShaperFactory != null ? new zzYBR(iTextShaperFactory) : zzXeD;
    }

    public static HashMap<zzYAU, Cluster[]> zzZ(zzYAU zzyau, ITextShaperFactory iTextShaperFactory) throws Exception {
        if (zzyau.zzZo6() == 9250) {
            return zzY(zzyau, iTextShaperFactory);
        }
        RefInt refInt = new RefInt(0);
        RefBoolean refBoolean = new RefBoolean(false);
        zzYAU zzyauZzZ = zzZ(zzyau, refInt, refBoolean);
        int i = refInt.get();
        boolean z = refBoolean.get();
        ArrayList arrayList = new ArrayList();
        zzYAU zzyauZzT = zzyau;
        while (true) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzYAU>) arrayList, zzyauZzT);
            if (zzyauZzT == zzyauZzZ) {
                break;
            }
            zzyauZzT = zzVE.zzT((zzYAU) zzyauZzT.zzYo1());
        }
        int size = arrayList.size();
        String[] strArr = new String[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = ((zzYAU) arrayList.get(i2)).getText();
        }
        Cluster[][] clusterArrZzZ = zzyau.zzY6N().zzZr().zzPl().zzpz() ? zzZ(strArr, zzyau.zzY6N().zzZr(), zzyau.zzY6N().zzZz()) : zzZ(strArr, zzyau.zzY6N(), iTextShaperFactory, i, z);
        HashMap<zzYAU, Cluster[]> map = new HashMap<>();
        for (int i3 = 0; i3 < size; i3++) {
            if (clusterArrZzZ[i3] != null) {
                com.aspose.words.internal.zzZQF.zzY(map, (zzYAU) arrayList.get(i3), clusterArrZzZ[i3]);
            }
        }
        return map;
    }

    public static Cluster[] zzZ(String str, com.aspose.words.internal.zzPM zzpm, boolean z, boolean z2, ITextShaperFactory iTextShaperFactory) throws Exception {
        Cluster[][] clusterArrZzZ;
        String[] strArr = {str};
        if (zzpm.zzPl().zzpz()) {
            clusterArrZzZ = zzZ(strArr, zzpm, z);
        } else {
            clusterArrZzZ = zzZ(strArr, iTextShaperFactory, zzpm.zzPl(), z, z2);
        }
        return clusterArrZzZ[0];
    }

    private static Cluster[][] zzZ(String[] strArr, zzZ32 zzz32, ITextShaperFactory iTextShaperFactory, int i, boolean z) throws Exception {
        ITextShaper textShaper;
        int i2;
        com.aspose.words.internal.zzZXH zzzxhZzPl = zzz32.zzZr().zzPl();
        String fileName = zzzxhZzPl.getFileName();
        int iZzpx = zzzxhZzPl.zzpx();
        try {
            if (zzzxhZzPl.zzpB() instanceof com.aspose.words.internal.zzGT) {
                textShaper = iTextShaperFactory.getTextShaper(fileName, iZzpx);
            } else {
                textShaper = iTextShaperFactory.getTextShaper(fileName, zzzxhZzPl.zzpB().getFontBytes(), iZzpx);
            }
            if (z) {
                i2 = 1;
            } else {
                i2 = zzz32.zz6c() ? 2 : 0;
            }
            try {
                return textShaper.shapeText(strArr, i2, i, zzV(zzz32));
            } catch (Exception e) {
                throw new Exception("Text shaper failed", e);
            }
        } catch (Exception e2) {
            throw new Exception(com.aspose.words.internal.zzZKN.format("Text shaper factory failed to return text shaper for '{0}', face index '{1}'", fileName, Integer.valueOf(iZzpx)), e2);
        }
    }

    private static Cluster[][] zzZ(String[] strArr, ITextShaperFactory iTextShaperFactory, com.aspose.words.internal.zzZXH zzzxh, boolean z, boolean z2) throws Exception {
        ITextShaper textShaper;
        String fileName = zzzxh.getFileName();
        int iZzpx = zzzxh.zzpx();
        try {
            if (zzzxh.zzpB() instanceof com.aspose.words.internal.zzGT) {
                textShaper = iTextShaperFactory.getTextShaper(fileName, iZzpx);
            } else {
                textShaper = iTextShaperFactory.getTextShaper(fileName, zzzxh.zzpB().getFontBytes(), iZzpx);
            }
            try {
                return textShaper.shapeText(strArr, z ? 1 : z2 ? 2 : 0, UnicodeScript.ARABIC, new int[0]);
            } catch (Exception e) {
                throw new Exception("Text shaper failed", e);
            }
        } catch (Exception e2) {
            throw new Exception(com.aspose.words.internal.zzZKN.format("Text shaper factory failed to return text shaper for '{0}', face index '{1}'", fileName, Integer.valueOf(iZzpx)), e2);
        }
    }

    private static Cluster[][] zzZ(String[] strArr, com.aspose.words.internal.zzPM zzpm, boolean z) {
        Cluster[][] clusterArr = new Cluster[strArr.length][];
        zzYBP zzybp = new zzYBP(strArr, zzpm.zzPl());
        for (int i = 0; i < strArr.length; i++) {
            String strZzY8s = zzybp.zzY8s();
            if (z) {
                strZzY8s = com.aspose.words.internal.zzZVS.zzWJ(strZzY8s);
            }
            clusterArr[i] = zzpm.zzZ(strZzY8s, 0.0f);
            zzybp.moveNext();
        }
        return clusterArr;
    }

    private static zzYAU zzZ(zzYAU zzyau, RefInt refInt, RefBoolean refBoolean) throws Exception {
        boolean zZzY7b = zzyau.zzY7b();
        boolean zZz7 = com.aspose.words.internal.zzZVU.zz7(zzyau.getText().charAt(0));
        refInt.set(zzyau.zzYKY());
        int iZzQ = zzQ(zzyau.zzYKY(), zZz7, zZzY7b);
        zzYAU zzyau2 = zzyau;
        int iZzYKY = refInt.get();
        int i = iZzQ;
        while (true) {
            if (zzY42.zzjo(refInt.get())) {
                refInt.set(iZzYKY);
            }
            if (iZzQ == 0) {
                iZzQ = i;
            }
            zzYAU zzyauZzT = zzVE.zzT((zzYAU) zzyau2.zzYo1());
            if (zzyauZzT == null || !zzyauZzT.zzY6g()) {
                break;
            }
            iZzYKY = zzyauZzT.zzYKY();
            int iZzQ2 = zzQ(iZzYKY, com.aspose.words.internal.zzZVU.zz7(zzyauZzT.getText().charAt(0)), zZzY7b);
            if (!zzVM(iZzQ, iZzQ2) || !zzVL(refInt.get(), iZzYKY) || !zzI(zzyau, zzyauZzT)) {
                break;
            }
            zzyau2 = zzyauZzT;
            i = iZzQ2;
        }
        refBoolean.set(iZzQ == 1);
        return zzyau2;
    }
}

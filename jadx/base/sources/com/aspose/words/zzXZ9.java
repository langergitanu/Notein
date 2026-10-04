package com.aspose.words;

import com.huawei.hms.network.embedded.C18293o1;
import com.orion.notein.richeditor.fonts.FontManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzXZ9 {
    private static void zzX(zzXZL zzxzl, HashMap<zzXZP, Integer> map) {
        zzXZN zzxznZzXRg = zzxzl.zzXRg();
        zzxznZzXRg.zzY("borders");
        ArrayList arrayList = new ArrayList();
        Iterator<zzXZG> it = zzxzl.zzXRf().iterator();
        int i = 0;
        while (it.hasNext()) {
            zzXZP zzxzpZzXR6 = it.next().zzXR6();
            if (!map.containsKey(zzxzpZzXR6)) {
                com.aspose.words.internal.zzZQF.zzY(map, zzxzpZzXR6, Integer.valueOf(i));
                i++;
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzXZP>) arrayList, zzxzpZzXR6);
            }
        }
        zzxznZzXRg.zzZj(C18293o1.f55803f, arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            zzZ(zzxzl, (zzXZP) it2.next());
        }
        zzxznZzXRg.zzo();
    }

    private static void zzY(zzXZL zzxzl, HashMap<zzXZI, Integer> map) {
        zzXZN zzxznZzXRg = zzxzl.zzXRg();
        zzxznZzXRg.zzY("fills");
        ArrayList arrayList = new ArrayList();
        com.aspose.words.internal.zzZQF.zzY(map, zzXZI.zzWSF, 0);
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzXZI>) arrayList, zzXZI.zzWSF);
        com.aspose.words.internal.zzZQF.zzY(map, zzXZE.zzWSt, 1);
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzXZI>) arrayList, zzXZE.zzWSt);
        Iterator<zzXZG> it = zzxzl.zzXRf().iterator();
        int i = 2;
        while (it.hasNext()) {
            zzXZI zzxziZzXR5 = it.next().zzXR5();
            if (!map.containsKey(zzxziZzXR5)) {
                com.aspose.words.internal.zzZQF.zzY(map, zzxziZzXR5, Integer.valueOf(i));
                i++;
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzXZI>) arrayList, zzxziZzXR5);
            }
        }
        zzxznZzXRg.zzZj(C18293o1.f55803f, arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            zzZ(zzxzl, (zzXZI) it2.next());
        }
        zzxznZzXRg.zzo();
    }

    public static void zzZ(zzXZL zzxzl) throws Exception {
        zzxzl.zzo("styles.xml", "application/vnd.openxmlformats-officedocument.spreadsheetml.styles+xml", "http://schemas.openxmlformats.org/officeDocument/2006/relationships/styles");
        zzXZN zzxznZzXRg = zzxzl.zzXRg();
        zzxznZzXRg.zzZmU();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        zzZ(zzxzl, (HashMap<zzXZH, Integer>) map);
        zzY(zzxzl, map2);
        zzX(zzxzl, map3);
        zzY(zzxzl);
        zzZ(zzxzl, map, map2, map3);
        zzxznZzXRg.endDocument();
        zzxzl.zzZlX();
    }

    private static void zzZ(zzXZL zzxzl, HashMap<zzXZH, Integer> map) {
        zzXZN zzxznZzXRg = zzxzl.zzXRg();
        zzxznZzXRg.zzY(FontManager.REMOTE_FONT_DIR);
        ArrayList arrayList = new ArrayList();
        Iterator<zzXZG> it = zzxzl.zzXRf().iterator();
        int i = 0;
        while (it.hasNext()) {
            zzXZH zzxzhZzXR8 = it.next().zzXR8();
            if (!map.containsKey(zzxzhZzXR8)) {
                com.aspose.words.internal.zzZQF.zzY(map, zzxzhZzXR8, Integer.valueOf(i));
                i++;
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzXZH>) arrayList, zzxzhZzXR8);
            }
        }
        zzxznZzXRg.zzZj(C18293o1.f55803f, arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            zzxzl.zzZ((zzXZH) it2.next(), "font", "name");
        }
        zzxznZzXRg.zzo();
    }

    private static void zzY(zzXZL zzxzl) {
        zzXZN zzxznZzXRg = zzxzl.zzXRg();
        zzxznZzXRg.zzY("cellStyleXfs");
        zzxznZzXRg.zzX(C18293o1.f55803f, "1");
        zzxznZzXRg.zzX("xf", "numFmtId", "0", "fontId", "0", "fillId", "0", "borderId", "0");
        zzxznZzXRg.zzo();
    }

    private static void zzZ(zzXZL zzxzl, zzXZI zzxzi) {
        zzXZN zzxznZzXRg = zzxzl.zzXRg();
        zzxznZzXRg.zzY("fill");
        zzZ(zzxzl, (zzXZE) zzxzi);
        zzxznZzXRg.zzo();
    }

    private static void zzZ(zzXZL zzxzl, zzXZE zzxze) {
        zzXZN zzxznZzXRg = zzxzl.zzXRg();
        zzxznZzXRg.zzY("patternFill");
        zzxznZzXRg.zz0("patternType", zzXZK.zzhl(zzxze.getPatternType()));
        com.aspose.words.internal.zzPV zzpvZzXQX = zzxze.zzXQX();
        if (zzpvZzXQX != null && !com.aspose.words.internal.zzPV.zzZ(zzpvZzXQX, com.aspose.words.internal.zzPV.zzHZ)) {
            zzxzl.zzZ(zzpvZzXQX, "fgColor");
        }
        com.aspose.words.internal.zzPV zzpvZzXQW = zzxze.zzXQW();
        if (zzpvZzXQW != null && !com.aspose.words.internal.zzPV.zzZ(zzpvZzXQW, com.aspose.words.internal.zzPV.zzHZ)) {
            zzxzl.zzZ(zzpvZzXQW, "bgColor");
        }
        zzxznZzXRg.zzo();
    }

    private static void zzZ(zzXZL zzxzl, zzXZP zzxzp) {
        zzXZN zzxznZzXRg = zzxzl.zzXRg();
        zzxznZzXRg.zzY("border");
        zzxznZzXRg.zzw("diagonalUp", zzxzp.zzXRx());
        zzxznZzXRg.zzw("diagonalDown", zzxzp.zzXRw());
        if (!zzxzp.getOutline()) {
            zzxznZzXRg.zz0("outline", "0");
        }
        zzZ(zzxzl, "start", zzxzp.zzXRE());
        zzZ(zzxzl, "end", zzxzp.zzXRD());
        zzZ(zzxzl, "top", zzxzp.zzXRC());
        zzZ(zzxzl, "bottom", zzxzp.zzXRB());
        zzZ(zzxzl, "diagonal", zzxzp.zzXRA());
        zzZ(zzxzl, "vertical", zzxzp.zzXRz());
        zzZ(zzxzl, "horizontal", zzxzp.zzXRy());
        zzxznZzXRg.zzo();
    }

    private static void zzZ(zzXZL zzxzl, String str, zzXZO zzxzo) {
        zzXZN zzxznZzXRg = zzxzl.zzXRg();
        zzxznZzXRg.zzY(str);
        if (zzxzo.getStyle() != 0) {
            zzxznZzXRg.zz0("style", zzXZK.zzhm(zzxzo.getStyle()));
        }
        if (zzxzo.zzZy() != null && !zzxzo.zzZy().isEmpty()) {
            zzxzl.zzZ(zzxzo.zzZy(), "color");
        }
        zzxznZzXRg.zzo();
    }

    private static void zzZ(zzXZL zzxzl, HashMap<zzXZH, Integer> map, HashMap<zzXZI, Integer> map2, HashMap<zzXZP, Integer> map3) {
        zzXZN zzxznZzXRg = zzxzl.zzXRg();
        zzxznZzXRg.zzY("cellXfs");
        zzxznZzXRg.zzZj(C18293o1.f55803f, zzxzl.zzXRf().size());
        Iterator<zzXZG> it = zzxzl.zzXRf().iterator();
        while (it.hasNext()) {
            zzZ(zzxzl, it.next(), map, map2, map3);
        }
        zzxznZzXRg.zzo();
    }

    private static void zzZ(zzXZL zzxzl, zzXZG zzxzg, HashMap<zzXZH, Integer> map, HashMap<zzXZI, Integer> map2, HashMap<zzXZP, Integer> map3) {
        zzXZN zzxznZzXRg = zzxzl.zzXRg();
        zzxznZzXRg.zzY("xf");
        zzxznZzXRg.zz0("numFmtId", com.aspose.words.internal.zzZYD.zzXk(zzxzg.zzXRc()) ? zzxzg.zzXRc() : "0");
        zzxznZzXRg.zzP("fontId", map.get(zzxzg.zzXR8()));
        zzxznZzXRg.zzP("fillId", map2.get(zzxzg.zzXR5()));
        zzxznZzXRg.zzP("borderId", map3.get(zzxzg.zzXR6()));
        zzxznZzXRg.zz0("xfId", "0");
        if (zzxzg.zzXR7() != null && !zzxzg.zzXR7().equals(zzxzl.zzXRe().zzXR7())) {
            zzZ(zzxznZzXRg, zzxzg.zzXR7());
        }
        zzxznZzXRg.zzo();
    }

    private static void zzZ(zzXZN zzxzn, zzXZQ zzxzq) {
        zzxzn.zzX("alignment", "horizontal", zzXZK.zzho(zzxzq.zzXRH()), "vertical", zzXZK.zzhn(zzxzq.zzXRG()), "wrapText", zzxzq.getWrapText() ? "1" : "0");
    }
}

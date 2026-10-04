package com.aspose.words;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzY7Y extends zzZUY {
    private static String[] zzX8G = {"height", "width", "font", "font-size", "font-size-adjust", "font-stretch", "font-style", "font-variant", "font-weight", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "letter-spacing", "unicode-bidi", "word-spacing", "clip", "color", "cursor", "display", "overflow", "visibility", "clip-path", "clip-rule", "mask", "opacity", "enable-background", "filter", "flood-color", "flood-opacity", "lighting-color", "stop-color", "stop-opacity", "pointer-events", "color-interpolation", "color-interpolation-filters", "color-profile", "color-rendering", "fill", "fill-opacity", "fill-rule", "image-rendering", RequestParameters.MARKER, "marker-end", "marker-mid", "marker-start", "shape-rendering", "stroke", "stroke-dashoffset", "stroke-linecap", "stroke-linejoin", "stroke-miterlimit", "stroke-opacity", "stroke-width", "text-rendering", "alignment-baseline", "baseline-shift", "dominant-baseline", "glyph-orientation-horizontal", "glyph-orientation-vertical", "kerning", "text-anchor", "writing-mode"};

    private static void zzQ(zzZBM zzzbm, zzPR zzpr) {
        zzL4 zzl4ZzSp;
        for (String str : zzX8G) {
            String strZzKM = zzzbm.zzKM(str);
            if (strZzKM != null && com.aspose.words.internal.zzZYD.zzXk(com.aspose.words.internal.zzZKN.zzTX(strZzKM)) && (zzl4ZzSp = zzMV.zzSp(strZzKM)) != null) {
                if (zzl4ZzSp.getValueType() == 3 && ("width".equals(str) || "height".equals(str) || "font-size".equals(str) || "letter-spacing".equals(str))) {
                    zzl4ZzSp = new zzOI(zzl4ZzSp.getDoubleValue(), 6);
                }
                zzPS zzpsZzQ = zzMR.zzSk(str).zzQ(zzl4ZzSp);
                if (zzpsZzQ != null) {
                    zzpr.zzO(zzpsZzQ);
                }
            }
        }
    }

    private static void zzR(zzZBM zzzbm, zzPR zzpr) {
        String strZzKM = zzzbm.zzKM("font-family");
        if (strZzKM == null || !com.aspose.words.internal.zzZYD.zzXk(com.aspose.words.internal.zzZKN.zzTX(strZzKM))) {
            return;
        }
        zzL2 zzl2 = new zzL2();
        Iterator<String> it = zzS(strZzKM, ',').iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (new com.aspose.words.internal.zzZNR("^([\"'])([^\"'\\s])+?(.)*$").zzUV(next)) {
                next = com.aspose.words.internal.zzZNR.zzN(next, "^[\"']|[\"']$", "");
            }
            if (zzl2.getCount() > 0) {
                zzl2.zzI(zzL4.zzZnr);
            }
            zzl2.zzI(zzL4.zzS4(next));
        }
        zzPS zzpsZzY = zzMR.zzSj("font-family").zzY(zzl2, false, false);
        if (zzpsZzY == null) {
            return;
        }
        zzpr.zzO(zzpsZzY);
    }

    private static void zzS(zzZBM zzzbm, zzPR zzpr) {
        String strZzKM = zzzbm.zzKM("text-decoration");
        if (strZzKM == null || !com.aspose.words.internal.zzZYD.zzXk(com.aspose.words.internal.zzZKN.zzTX(strZzKM))) {
            return;
        }
        zzL2 zzl2 = new zzL2();
        Iterator<String> it = zzS(strZzKM, ControlChar.SPACE_CHAR).iterator();
        while (it.hasNext()) {
            zzl2.zzI(new zzOT(it.next()));
        }
        zzPS zzpsZzY = zzMR.zzSj("text-decoration").zzY(zzl2, false, false);
        if (zzpsZzY == null) {
            return;
        }
        zzpr.zzO(zzpsZzY);
    }

    private static void zzT(zzZBM zzzbm, zzPR zzpr) {
        String strZzKM = zzzbm.zzKM("stroke-dasharray");
        if (strZzKM == null || !com.aspose.words.internal.zzZYD.zzXk(com.aspose.words.internal.zzZKN.zzTX(strZzKM))) {
            return;
        }
        zzL2 zzl2 = new zzL2();
        Iterator<String> it = zzS(strZzKM, ',', ControlChar.SPACE_CHAR).iterator();
        while (it.hasNext()) {
            zzl2.zzI(new zzNH(com.aspose.words.internal.zzJB.parseDouble(it.next())));
        }
        zzPS zzpsZzY = zzMR.zzSj("stroke-dasharray").zzY(zzl2, false, false);
        if (zzpsZzY == null) {
            return;
        }
        zzpr.zzO(zzpsZzY);
    }

    @Override // com.aspose.words.zzZUY
    public final void zzZ(zzZBM zzzbm, zzPR zzpr) {
        zzR(zzzbm, zzpr);
        zzS(zzzbm, zzpr);
        zzT(zzzbm, zzpr);
        zzQ(zzzbm, zzpr);
    }

    private static ArrayList<String> zzS(String str, char... cArr) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str2 : com.aspose.words.internal.zzZKN.zzU(str, cArr)) {
            String strZzTX = com.aspose.words.internal.zzZKN.zzTX(str2);
            if (!com.aspose.words.internal.zzZKN.zzU3(strZzTX)) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList, strZzTX);
            }
        }
        return arrayList;
    }
}

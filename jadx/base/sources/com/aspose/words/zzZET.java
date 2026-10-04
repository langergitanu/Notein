package com.aspose.words;

import com.facebook.common.callercontext.ContextChain;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzZET {
    private zzYUD zzYOH;
    private zzZHR zzYqf;
    private zzZN8 zzYs5;
    private HtmlSaveOptions zzYt2;
    private Document zzZEY;
    private static int[] zzYlu = {EditingLanguage.BRETON, 1160, 1200, 1220};
    private static int[] zzYlt = {1200, 1220};
    private static int[] zzYls = {190, 60};
    private ArrayList<zzLT> zzZp5 = new ArrayList<>();
    private ArrayList<zzN0> zzZp4 = new ArrayList<>();
    private ArrayList<zzPC> zzYlr = new ArrayList<>();

    public zzZET(Document document, HtmlSaveOptions htmlSaveOptions, zzZN8 zzzn8) {
        this.zzZEY = document;
        this.zzYt2 = htmlSaveOptions;
        this.zzYqf = new zzZHR(document, htmlSaveOptions);
        this.zzYs5 = zzzn8;
    }

    private void zzS(zzLU zzlu) {
        zzMP zzmpZzSd;
        if (this.zzYt2.getExportRelativeFontSize() && (zzmpZzSd = zzlu.zzSd("font-size")) != null) {
            zzmpZzSd.getCount();
            zzmpZzSd.zzZVx().getValueType();
            double dZzZVW = ((zzOI) zzmpZzSd.zzZVx()).zzZVW();
            if (com.aspose.words.internal.zzAN.zzL(dZzZVW, 12.0d)) {
                zzlu.remove("font-size");
            } else {
                zzlu.zzZ("font-size", dZzZVW / 12.0d, 7);
            }
        }
    }

    private static zzMD[] zzU(StyleCollection styleCollection) {
        com.aspose.words.internal.zzZYT zzzyt = new com.aspose.words.internal.zzZYT();
        Iterator<Style> it = styleCollection.iterator();
        while (it.hasNext()) {
            String strZzzO = zzZJ2.zzzO(it.next().zzZ7j());
            if (!zzzyt.containsKey(strZzzO)) {
                zzzyt.zzB(strZzzO, 0);
            }
        }
        ArrayList arrayList = new ArrayList(zzzyt.getCount());
        Iterator<Map.Entry<K, V>> it2 = zzzyt.iterator();
        while (it2.hasNext()) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzLA>) arrayList, zzMD.zzSi((String) ((Map.Entry) it2.next()).getKey()));
        }
        return (zzMD[]) arrayList.toArray(new zzMD[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0015 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ArrayList<Style> zzV(StyleCollection styleCollection) {
        int i;
        int count = styleCollection.getCount();
        com.aspose.words.internal.zzIM zzim = new com.aspose.words.internal.zzIM(count);
        ArrayList<Style> arrayList = new ArrayList<>(count);
        int[] iArr = new int[5];
        for (Style style : styleCollection) {
            int iZzZ7j = style.zzZ7j();
            if (!zzim.contains(Integer.valueOf(iZzZ7j))) {
                zzim.add(Integer.valueOf(iZzZ7j));
                int type = style.getType();
                if (type != 1) {
                    i = 2;
                    if (type != 2) {
                        i = 4;
                        if (type != 3) {
                            i = type != 4 ? -1 : 3;
                        }
                    }
                    if (i < 0) {
                        int i2 = iArr[i];
                        if (i == 0) {
                            while (i2 > 0 && iZzZ7j < arrayList.get(i2 - 1).zzZ7j()) {
                                i2--;
                            }
                        }
                        arrayList.add(i2, style);
                        while (i < 5) {
                            iArr[i] = iArr[i] + 1;
                            i++;
                        }
                    }
                } else {
                    if (style.isHeading()) {
                        i = 0;
                    } else if (style.getStyleIdentifier() != 0) {
                        i = 1;
                    }
                    if (i < 0) {
                    }
                }
            }
        }
        return arrayList;
    }

    private void zzYYL() throws Exception {
        zzYMX zzymx;
        zzYMX zzymx2;
        String str;
        StyleCollection styles = this.zzZEY.getStyles();
        zzYMX zzymx3 = new zzYMX();
        zzYEF zzyef = new zzYEF();
        styles.zzY36().zzZ((zzZS) zzymx3, true);
        styles.zzY37().zzZ((zzZS) zzyef, true);
        Style styleZzZ7 = styles.zzZ7(0, true);
        styleZzZ7.zzY(zzymx3, 2);
        styleZzZ7.zzT(zzyef, 0);
        zzYEF zzyef2 = new zzYEF();
        zzY(zzYls, zzyef, zzyef2);
        if (zzymx3.getCount() > 0) {
            zzYMX zzymx4 = new zzYMX();
            zzYMX zzymx5 = new zzYMX();
            zzY(zzYlt, zzymx3, zzymx5);
            zzZ(zzYlu, zzymx3, zzymx4);
            zzymx = zzymx4;
            zzymx2 = zzymx5;
        } else {
            zzymx = null;
            zzymx2 = null;
        }
        boolean zZzZ = zzZ(new zzMD[]{zzMD.zzSi("body")}, zzymx3, zzyef, false, "");
        zzZET zzzet = this;
        zzzet.zzZ(zzU(styles), zzymx, null, zZzZ, "");
        zzMD[] zzmdArrZzn = zzn(zzzet.zzZEY);
        if (zzmdArrZzn.length > 0) {
            zzzet.zzZ(zzmdArrZzn, zzymx2, null, zZzZ, "");
        }
        for (Style style : zzV(styles)) {
            int i = 3;
            if (style.getType() != 3) {
                zzymx3.clear();
                zzyef.clear();
                if (style.isHeading()) {
                    zzyef2.zzY(zzyef);
                }
                if (style.getType() == 1) {
                    zzYEF zzyef3 = new zzYEF();
                    zzYEF zzyef4 = (zzYEF) style.getStyles().zzY37().zzbn();
                    style.getStyles().zzY37().zzZ(zzyef3, zzYEF.zzXq6);
                    zzyef4.zzX(zzyef3);
                    zzyef4.zzY(zzyef);
                } else {
                    i = 2;
                }
                style.zzY(zzymx3, i);
                style.zzT(zzyef, 0);
                if (style.getBuiltIn()) {
                    String strZzM8 = zzL5.zzM8(style.getStyleIdentifier());
                    if (com.aspose.words.internal.zzZYD.zzXk(strZzM8)) {
                        if (style.getStyleIdentifier() > 0 && style.getStyleIdentifier() <= 6) {
                            strZzM8 = null;
                        }
                        Style styleZzZ72 = zzzet.zzZEY.getStyles().zzY32().zzZ7(style.getStyleIdentifier(), true);
                        if (styleZzZ72 != null) {
                            zzYMX zzymxZzqw = style.zzqw(i);
                            zzYEF zzyefZzl1 = style.zzl1(1);
                            zzZ(zzymx3, zzymxZzqw, styleZzZ72.zzZYj(), zzYlu);
                            zzZ(zzyef, zzyefZzl1, styleZzZ72.zzZYh(), null);
                        }
                    }
                    str = strZzM8;
                } else {
                    str = null;
                }
                zzzet.zzZ(zzzet.zzS(style), zzymx3, zzyef, true, str);
                zzzet = this;
            } else if (zzzet.zzYt2.getExportRoundtripInformation() && style.getStyleIdentifier() != 105) {
                com.aspose.words.internal.zzZQG.zzZ(zzzet.zzZp5, new zzLT(zzzet.zzS(style), new zzLU()));
            }
        }
    }

    private static zzMD zzZF(String str, int i) {
        return i == 2 ? zzMD.zzSi("span").zzS9(str) : zzMD.zzSh(str);
    }

    private static zzMD[] zzn(Document document) {
        ArrayList arrayList = new ArrayList();
        ListCollection lists = document.getLists();
        if (lists != null && lists.getCount() != 0) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzLA>) arrayList, zzMD.zzSi("li"));
        }
        if (document.selectSingleNode("//Table") != null) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzLA>) arrayList, zzMD.zzSi("table"));
        }
        return (zzMD[]) arrayList.toArray(new zzMD[0]);
    }

    public final String zzKb(String str) {
        if (!com.aspose.words.internal.zzZYD.zzXk(this.zzYt2.getCssClassNamePrefix())) {
            return str;
        }
        return this.zzYt2.getCssClassNamePrefix() + str;
    }

    public final void zzY(zzLT zzlt) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZp5, zzlt);
    }

    public final boolean zzYYM() {
        return this.zzYOH != null;
    }

    public final String[] zzYYN() {
        String[] strArr = new String[this.zzZp5.size() + this.zzYlr.size() + this.zzZp4.size()];
        Iterator<zzN0> it = this.zzZp4.iterator();
        int i = 0;
        while (it.hasNext()) {
            strArr[i] = it.next().zzZXu();
            i++;
        }
        Iterator<zzPC> it2 = this.zzYlr.iterator();
        while (it2.hasNext()) {
            strArr[i] = it2.next().zzZXu();
            i++;
        }
        Iterator<zzLT> it3 = this.zzZp5.iterator();
        while (it3.hasNext()) {
            strArr[i] = it3.next().zzZXu();
            i++;
        }
        return strArr;
    }

    public final void zzYYO() throws Exception {
        this.zzYOH = new zzYUD(this.zzZEY.getStyles());
        zzYYL();
    }

    public final void zzZ(zzN0 zzn0) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZp4, zzn0);
    }

    public final ArrayList<zzLT> zzZVv() {
        return this.zzZp5;
    }

    public final String zzyZ(int i) {
        return this.zzYOH.zzFs(i);
    }

    private static void zzY(int[] iArr, zzZS zzzs, zzZS zzzs2) {
        for (int i : iArr) {
            int iIndexOfKey = zzzs.indexOfKey(i);
            if (iIndexOfKey >= 0) {
                zzzs2.add(i, zzzs.zzVY(iIndexOfKey));
            }
        }
    }

    public final void zzZ(zzPC[] zzpcArr) {
        com.aspose.words.internal.zzZQG.zzZ((ArrayList) this.zzYlr, (Object[]) zzpcArr);
    }

    private static void zzZ(zzZS zzzs, zzZS zzzs2, zzZS zzzs3, int[] iArr) {
        Object objZzPj;
        for (int i = 0; i < zzzs3.getCount(); i++) {
            int iZzT3 = zzzs3.zzT3(i);
            if ((iArr == null || !com.aspose.words.internal.zzZ1.zzZ(iArr, iZzT3)) && !zzzs.zzVE(iZzT3) && (objZzPj = zzzs2.zzPj(iZzT3)) != null) {
                zzzs.add(iZzT3, objZzPj);
            }
        }
    }

    private zzMD[] zzS(Style style) {
        Object objZzSi;
        ArrayList arrayList = new ArrayList();
        String strZzzO = zzZJ2.zzzO(style.zzZ7j());
        if (style.zzZ7j() != 0 && ContextChain.TAG_PRODUCT.equals(strZzzO)) {
            objZzSi = zzZF(zzKb(this.zzYOH.zzFs(style.zzZ7j())), style.getType());
        } else {
            objZzSi = zzMD.zzSi(strZzzO);
        }
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<Object>) arrayList, objZzSi);
        String[] strArrZzt0 = this.zzYOH.zzt0(style.zzZ7j());
        if (strArrZzt0 != null) {
            for (String str : strArrZzt0) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzMD>) arrayList, zzZF(zzKb(str), style.getType()));
            }
        }
        return (zzMD[]) arrayList.toArray(new zzMD[0]);
    }

    private boolean zzZ(zzMD[] zzmdArr, zzYMX zzymx, zzYEF zzyef, boolean z, String str) throws Exception {
        zzLU zzlu;
        if (zzymx != null) {
            zzlu = zzMO.zzZ(zzymx, z, this.zzYt2.getExportRoundtripInformation());
        } else {
            zzlu = new zzLU();
        }
        zzLU zzlu2 = zzlu;
        if (zzyef != null) {
            zzMO.zzZ(zzyef, zzlu2, z, this.zzYqf, this.zzYs5, this.zzZEY.zzZqI(), this.zzYt2.getExportRoundtripInformation());
        }
        zzS(zzlu2);
        if (this.zzYt2.getExportRoundtripInformation() && com.aspose.words.internal.zzZYD.zzXk(str)) {
            zzlu2.zzZs("-aw-style-name", str);
        }
        if (zzlu2.getCount() == 0) {
            return false;
        }
        com.aspose.words.internal.zzZQG.zzZ(this.zzZp5, new zzLT(zzmdArr, zzlu2));
        return true;
    }

    private static void zzZ(int[] iArr, zzZS zzzs, zzZS zzzs2) {
        for (int i : iArr) {
            int iIndexOfKey = zzzs.indexOfKey(i);
            if (iIndexOfKey >= 0) {
                zzzs2.add(i, zzzs.zzVY(iIndexOfKey));
                zzzs.removeAt(iIndexOfKey);
            }
        }
    }
}

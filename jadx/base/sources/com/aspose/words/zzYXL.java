package com.aspose.words;

import com.facebook.common.callercontext.ContextChain;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYXL extends zzYXK implements zzZBR {
    private static void zzH(zzZDN zzzdn) {
        zzZDN zzzdn2 = (zzZDN) zzzdn.zzYXk().zzyy(0);
        for (zzZDK zzzdk : zzzdn2.zzYXk()) {
            if (zzzdk instanceof zzZDN) {
                zzZDN zzzdn3 = (zzZDN) zzzdk;
                if ("style".equals(zzzdn3.getName())) {
                    zzzdn2.zzYXk().zzW(zzzdn3);
                    return;
                }
            }
        }
    }

    private static void zzI(zzZDN zzzdn) {
        zzPT zzptZzSx;
        zzZDS zzzdsZzJH = zzzdn.zzYXj().zzJH("style");
        if (zzzdsZzJH == null || (zzptZzSx = zzMV.zz6(zzzdsZzJH.getValue(), 0).zzSx("page-break-before")) == null || !zzptZzSx.zzZWj().zzZVx().zzP(zzL4.zzZmZ)) {
            return;
        }
        zzZDN zzzdnZzYXe = zzzdn.zzYXe();
        int index = zzzdn.getIndex();
        zzzdnZzYXe.zzYXk().zzW(zzzdn);
        zzzdnZzYXe.zzYXk().zzZ(index, new zzZDN("mbp:pagebreak", 1));
    }

    private static void zzJ(zzZDN zzzdn) {
        zzZDS zzzdsZzJH = zzzdn.zzYXj().zzJH("style");
        if (zzzdsZzJH == null) {
            return;
        }
        zzPS zzpsZz6 = zzMV.zz6(zzzdsZzJH.getValue(), 0);
        com.aspose.words.internal.zzPV zzpvZzSB = zzpsZz6.zzSB("background-color");
        if (zzpvZzSB != null) {
            zzzdn.zzYXj().zzZ(new zzZDQ("bgcolor", zzZDY.zz2(zzpvZzSB)));
        }
        zzPT zzptZzSx = zzpsZz6.zzSx("font-weight");
        if (zzptZzSx != null && zzptZzSx.zzZWj().zzZVx().zzP(zzL4.zzZn3)) {
            zzzdn = zzY(zzzdn, "b");
        }
        zzPT zzptZzSx2 = zzpsZz6.zzSx("font-style");
        if (zzptZzSx2 != null && zzptZzSx2.zzZWj().zzZVx().zzP(zzL4.zzZn5)) {
            zzzdn = zzY(zzzdn, ContextChain.TAG_INFRA);
        }
        zzPT zzptZzSx3 = zzpsZz6.zzSx("text-decoration");
        if (zzptZzSx3 != null) {
            if (zzptZzSx3.zzZWj().zzZVx().zzP(zzL4.zzZn8)) {
                zzzdn = zzY(zzzdn, "strike");
            }
            if (zzptZzSx3.zzZWj().zzZVx().zzP(zzL4.zzZna)) {
                zzzdn = zzY(zzzdn, "u");
            }
        }
        zzPT zzptZzSx4 = zzpsZz6.zzSx("vertical-align");
        if (zzptZzSx4 != null) {
            if (zzptZzSx4.zzZWj().zzZVx().zzP(zzL4.zzZmS)) {
                zzY(zzzdn, "sub");
            } else if (zzptZzSx4.zzZWj().zzZVx().zzP(zzL4.zzZmR)) {
                zzY(zzzdn, "sup");
            }
        }
    }

    private static void zzK(zzZDN zzzdn) {
        com.aspose.words.internal.zzPV zzpvZzSB;
        zzZDS zzzdsZzJH = zzzdn.zzYXj().zzJH("style");
        if (zzzdsZzJH == null || (zzpvZzSB = zzMV.zz6(zzzdsZzJH.getValue(), 0).zzSB("background-color")) == null) {
            return;
        }
        zzzdn.zzYXj().zzZ(new zzZDQ("bgcolor", zzZDY.zz2(zzpvZzSB)));
    }

    private static void zzL(zzZDN zzzdn) {
        zzzdn.zzYXj().zzZ(new zzZDQ("border", "1"));
    }

    private static void zzM(zzZDN zzzdn) {
        zzZDS zzzdsZzJH = zzzdn.zzYXj().zzJH("start");
        int i = zzzdsZzJH != null ? com.aspose.words.internal.zzJB.parseInt(zzzdsZzJH.getValue()) : 1;
        for (zzZDK zzzdk : zzzdn.zzYXk()) {
            if (zzzdk instanceof zzZDN) {
                zzZDN zzzdn2 = (zzZDN) zzzdk;
                if ("li".equals(zzzdn2.getName())) {
                    zzZDS zzzdsZzJH2 = zzzdn2.zzYXj().zzJH("value");
                    if (zzzdsZzJH2 != null) {
                        i = com.aspose.words.internal.zzJB.parseInt(zzzdsZzJH2.getValue());
                    } else {
                        zzzdn2.zzYXj().zzZ(new zzZDQ("value", com.aspose.words.internal.zzJB.zzWD(i)));
                        i++;
                    }
                }
            }
        }
    }

    private static void zzN(zzZDN zzzdn) {
        zzZDS zzzdsZzJH;
        zzZDY.zzJQ(zzzdn.getName());
        zzZDS zzzdsZzJH2 = zzzdn.zzYXj().zzJH("style");
        if (zzzdsZzJH2 == null) {
            return;
        }
        zzPS zzpsZz6 = zzMV.zz6(zzzdsZzJH2.getValue(), 0);
        com.aspose.words.internal.zzPV zzpvZzSB = zzpsZz6.zzSB("background-color");
        if (zzpvZzSB == null) {
            zzZDN zzzdnZzYXe = zzzdn.zzYXe();
            if ("div".equals(zzzdnZzYXe.getName()) && (zzzdsZzJH = zzzdnZzYXe.zzYXj().zzJH("style")) != null) {
                zzpvZzSB = zzMV.zz6(zzzdsZzJH.getValue(), 0).zzSB("background-color");
            }
        }
        if (zzpvZzSB != null) {
            zzzdn.zzYXj().zzZ(new zzZDQ("bgcolor", zzZDY.zz2(zzpvZzSB)));
        }
        zzPT zzptZzSx = zzpsZz6.zzSx("text-align");
        if (zzptZzSx != null) {
            zzOT[] zzotArr = {zzL4.zzZmF, zzL4.zzZmE, zzL4.zzZmH, zzL4.zzZmG};
            zzZDQ zzzdq = null;
            for (int i = 0; i < 4; i++) {
                zzOT zzot = zzotArr[i];
                if (zzptZzSx.zzZWj().zzZVx().zzP(zzot)) {
                    zzzdq = new zzZDQ("align", zzot.getValue());
                }
            }
            if (zzzdq != null) {
                zzzdn.zzYXj().zzZ(zzzdq);
            }
        }
    }

    private static void zzO(zzZDN zzzdn) {
        zzZDS zzzdsZzJH = zzzdn.zzYXj().zzJH("style");
        if (zzzdsZzJH == null) {
            return;
        }
        zzPS zzpsZz6 = zzMV.zz6(zzzdsZzJH.getValue(), 0);
        com.aspose.words.internal.zzPV zzpvZzSB = zzpsZz6.zzSB("color");
        zzPT zzptZzSx = zzpsZz6.zzSx("font-family");
        zzPT zzptZzSx2 = zzpsZz6.zzSx("font-size");
        if (zzpvZzSB == null && zzptZzSx == null && zzptZzSx2 == null) {
            return;
        }
        zzZDN zzzdnZzY = zzY(zzzdn, "font");
        if (zzpvZzSB != null) {
            zzzdnZzY.zzYXj().zzZ(new zzZDQ("color", zzZDY.zz2(zzpvZzSB)));
        }
        if (zzptZzSx != null) {
            zzzdnZzY.zzYXj().zzZ(new zzZDQ(OptionalModuleUtils.FACE, zzptZzSx.zzZWj().zzZXu()));
        }
        if (zzptZzSx2 != null) {
            double dZzW = zzL5.zzW(zzptZzSx2.zzZWj());
            double[] dArr = {8.5d, 11.5d, 13.5d, 17.5d, 21.0d, 23.0d};
            int i = 1;
            for (int i2 = 0; i2 < 6 && dZzW >= dArr[i2]; i2++) {
                i++;
            }
            zzzdnZzY.zzYXj().zzZ(new zzZDQ("size", com.aspose.words.internal.zzJB.zzWD(i)));
        }
    }

    private static void zzP(zzZDN zzzdn) {
        if (zzZDY.zzJQ(zzzdn.getName())) {
            zzN(zzzdn);
        } else if ("ol".equals(zzzdn.getName())) {
            zzM(zzzdn);
        } else if ("table".equals(zzzdn.getName())) {
            zzL(zzzdn);
        } else if ("td".equals(zzzdn.getName())) {
            zzK(zzzdn);
        } else if ("span".equals(zzzdn.getName())) {
            zzJ(zzzdn);
        } else if ("br".equals(zzzdn.getName())) {
            zzI(zzzdn);
        }
        zzO(zzzdn);
        zzzdn.zzYXj().remove("style");
        for (int i = 0; i < zzzdn.zzYXk().getCount(); i++) {
            zzZDK zzzdkZzyy = zzzdn.zzYXk().zzyy(i);
            if (zzzdkZzyy instanceof zzZDN) {
                zzP((zzZDN) zzzdkZzyy);
            }
        }
    }

    private static zzZDN zzY(zzZDN zzzdn, String str) {
        zzZAP zzzapZzYXk = zzzdn.zzYXk();
        return zzzapZzYXk.getCount() > 0 ? zzzapZzYXk.zzF(str, 0, zzzapZzYXk.getCount()) : zzzdn;
    }

    @Override // com.aspose.words.zzZBR
    public final SaveOutputParameters zzZ(zzYDZ zzydz) throws Exception {
        zzYYF zzyyf;
        ArrayList<zzYYG> arrayListZzZ;
        zzW(zzydz);
        zzZqS().zzYdd();
        zzW(((HtmlSaveOptions) zzZqS().zzXpa).zzYZe());
        zzZ(zzYC5());
        zzY86 zzy86 = new zzY86();
        zzYWQ zzywq = new zzYWQ(zzYC5().getNavigationMapLevel());
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        try {
            zzZJ2 zzzj2 = new zzZJ2(zzZqS().zzYfy, zzzor, null, zzYC5(), zzZqS(), zzy86, zzywq);
            zzywq.zzZ(zzzj2);
            zzzj2.zzZ3I();
            zzzj2.zzYsm.size();
            zzZDN zzzdnZzYXW = zzzj2.zzYsm.get(0).zzYXW();
            if ("frameset".equals(((zzZDN) zzzdnZzYXW.zzYXk().zzyy(1)).getName())) {
                throw new IllegalStateException("Documents with frames aren't supported.");
            }
            zzzor.close();
            zzP(zzzdnZzYXW);
            zzH(zzzdnZzYXW);
            zzYY5 zzyy5 = new zzYY5(zzYC5());
            zzyy5.zzQ(zzzdnZzYXW);
            ArrayList<zzYYA> arrayListZzY = zzY(zzYXM.zzZ(zzzdnZzYXW, zzYC5()), zzYC5().zzZ9Y());
            for (zzYYA zzyya : arrayListZzY) {
                zzyy5.zzw(zzyya.zzau(), zzyya.getId(), zzyya.getOffset());
            }
            for (zzYYA zzyya2 : arrayListZzY) {
                zzyya2.zzTw(zzyy5.zzHL(zzyya2.zzau()));
            }
            StringBuilder sb = new StringBuilder();
            Iterator<zzYYA> it = arrayListZzY.iterator();
            while (it.hasNext()) {
                com.aspose.words.internal.zzZNH.zzU(sb, it.next().zzau());
            }
            String string = sb.toString();
            int iZzV4 = zzYC5().zzZ9Y().zzV4(string);
            ArrayList<zzYM> arrayListZzX = zzYXK.zzX(zzy86);
            ArrayList<zzYM> arrayListZzW = zzYXK.zzW(zzy86);
            ArrayList<zzYXS> arrayListZzX2 = zzYXK.zzX(string, zzYC5().zzZ9Y());
            zzYXR zzyxr = new zzYXR(new zzYXO(arrayListZzY).zzY(zzywq.zzYBq(), zzYC5().zzZ9Y()), iZzV4);
            if (zzyxr.zzYCd()) {
                zzyyf = new zzYYF(zzYC5().zzZ9Y());
                arrayListZzZ = zzZ(zzyxr.zzYCe(), zzyyf, zzYC5().zzZ9Y());
            } else {
                zzyyf = null;
                arrayListZzZ = null;
            }
            zzN(new com.aspose.words.internal.zzXZ(zzZqS().zzXpb));
            int size = arrayListZzX2.size() + 1 + (zzyxr.zzYCd() ? arrayListZzZ.size() : 0) + (zzyxr.zzYCd() ? zzyyf.zzYCT().size() : 0);
            zztN(arrayListZzW.size() + arrayListZzX.size() + size + 3);
            zzF(6, iZzV4, arrayListZzX2.size(), size);
            zzZn(arrayListZzX2);
            if (zzyxr.zzYCd()) {
                zzYC3().zzu1(zzYC4().zzYCr());
                zzZo(arrayListZzZ);
                zzZo(zzyyf.zzYCT());
            }
            zzZm(arrayListZzX);
            zzZl(arrayListZzW);
            zzYC7();
            zztM(iZzV4);
            zzYC6();
            return new SaveOutputParameters("application/x-mobipocket-ebook");
        } catch (Throwable th) {
            zzzor.close();
            throw th;
        }
    }

    private static ArrayList<zzYYA> zzY(String str, com.aspose.words.internal.zzZO0 zzzo0) {
        ArrayList<zzYYA> arrayList = new ArrayList<>();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int iZzV4 = 0;
        while (true) {
            int iZzW = com.aspose.words.internal.zzZKN.zzW(str, "<", i, com.aspose.words.internal.zzZOF.ORDINAL_IGNORE_CASE$4894b8c8);
            int length = (iZzW >= 0 ? iZzW : str.length()) - i2;
            if (iZzW < 0 || length > 8192) {
                String strSubstring = str.substring(i2, length + i2);
                com.aspose.words.internal.zzZQG.zzZ(arrayList, new zzYYA(strSubstring, i3, iZzV4));
                i3++;
                iZzV4 = zzzo0.zzV4(strSubstring) + iZzV4;
                i2 = iZzW;
            }
            int i4 = iZzW + 1;
            if (iZzW < 0) {
                return arrayList;
            }
            i = i4;
        }
    }

    private static void zzZ(HtmlSaveOptions htmlSaveOptions) {
        zzYXK.zzX(htmlSaveOptions);
        htmlSaveOptions.setCssStyleSheetType(0);
        htmlSaveOptions.setCssStyleSheetFileName("");
        htmlSaveOptions.setDocumentSplitCriteria(0);
        htmlSaveOptions.setExportListLabels(2);
        htmlSaveOptions.setExportRelativeFontSize(false);
    }

    private static ArrayList<zzYYG> zzZ(ArrayList<zzYXQ> arrayList, zzYYF zzyyf, com.aspose.words.internal.zzZO0 zzzo0) throws Exception {
        return new zzYY0(new zzYXP(arrayList, zzyyf, zzzo0), zzzo0).zzYCz();
    }
}

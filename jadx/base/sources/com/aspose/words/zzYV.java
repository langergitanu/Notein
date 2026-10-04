package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYV extends zzYXK implements zzZBR {
    private static void zzA(ArrayList<zzZ6> arrayList) {
        int iZzaB = 0;
        int size = 0;
        for (zzZ6 zzz6 : arrayList) {
            zzz6.update(iZzaB, size);
            iZzaB += zzz6.zzaB();
            size += zzz6.zzaD().size();
        }
        Iterator<zzZ6> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().zzaG();
        }
        Iterator<zzZ6> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().zzaF();
        }
    }

    private static ArrayList<zzY5X> zzY(zzY86 zzy86) {
        ArrayList<zzY5X> arrayList = new ArrayList<>();
        for (zzY87 zzy87 : zzy86.zzyD()) {
            if ("image/svg+xml".equals(zzy87.getContentType()) && (zzy87 instanceof zzY5X)) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList, (zzY5X) zzy87);
            }
        }
        return arrayList;
    }

    private static ArrayList<zzZ3> zzy(ArrayList<zzZ6> arrayList) {
        ArrayList<zzZ3> arrayList2 = new ArrayList<>();
        Iterator<zzZ6> it = arrayList.iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZQG.zzZ(arrayList2, it.next().zzaE());
        }
        return arrayList2;
    }

    private static ArrayList<zzZ5> zzz(ArrayList<zzZ6> arrayList) {
        ArrayList<zzZ5> arrayList2 = new ArrayList<>();
        Iterator<zzZ6> it = arrayList.iterator();
        while (it.hasNext()) {
            Iterator<zzZ5> it2 = it.next().zzaD().iterator();
            while (it2.hasNext()) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList2, it2.next());
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Finally extract failed */
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
        ArrayList<zzZ6> arrayList = new ArrayList();
        zzZ7 zzz7 = new zzZ7(zzYC5());
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        try {
            zzZJ2 zzzj2 = new zzZJ2(zzZqS().zzYfy, zzzor, null, zzYC5(), zzZqS(), zzy86, zzywq);
            zzywq.zzZ(zzzj2);
            zzzj2.zzZ3I();
            for (int i = 0; i < zzzj2.zzYsm.size(); i++) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZ6>) arrayList, new zzZ6(zzzj2.zzYsm.get(i), zzYC5(), zzz7, i));
            }
            zzzor.close();
            zzA(arrayList);
            ArrayList<zzY5X> arrayListZzZ2 = zzZ(zzy86);
            ArrayList<zzY5X> arrayListZzY = zzY(zzy86);
            ArrayList<zzYM> arrayListZzX = zzYXK.zzX(zzy86);
            ArrayList<zzYM> arrayListZzW = zzYXK.zzW(zzy86);
            StringBuilder sb = new StringBuilder();
            int size = arrayListZzY.size() + arrayListZzZ2.size() + 1;
            zzZB zzzb = new zzZB(size);
            int iZzaB = 0;
            for (zzZ6 zzz6 : arrayList) {
                com.aspose.words.internal.zzZNH.zzU(sb, zzz6.zzaC());
                iZzaB += zzz6.zzaB();
            }
            zzzb.zzP8(iZzaB);
            zzZ(sb, arrayListZzZ2);
            zzZ(zzzb, arrayListZzZ2);
            zzZ(sb, arrayListZzY);
            zzZ(zzzb, arrayListZzY);
            String string = sb.toString();
            int iZzV4 = zzYC5().zzZ9Y().zzV4(string);
            ArrayList<zzZ5> arrayListZzz = zzz(arrayList);
            ArrayList<zzZ3> arrayListZzy = zzy(arrayList);
            ArrayList<zzYXS> arrayListZzX2 = zzYXK.zzX(string, zzYC5().zzZ9Y());
            zzYXR zzyxr = new zzYXR(new zzYW(arrayListZzy, arrayListZzz).zzY(zzywq.zzYBq(), zzYC5().zzZ9Y()), iZzV4);
            if (zzyxr.zzYCd()) {
                zzyyf = new zzYYF(zzYC5().zzZ9Y());
                arrayListZzZ = zzZ(zzyxr.zzYCe(), zzyyf, zzYC5().zzZ9Y());
            } else {
                zzyyf = null;
                arrayListZzZ = null;
            }
            zzYYF zzyyf2 = new zzYYF(zzYC5().zzZ9Y());
            ArrayList<zzYYG> arrayListZzY2 = zzY(arrayListZzz, zzyyf2, zzYC5().zzZ9Y());
            ArrayList<zzYYG> arrayListZzZ3 = zzZ(arrayListZzy, zzYC5().zzZ9Y());
            zzN(new com.aspose.words.internal.zzXZ(zzZqS().zzXpb));
            int size2 = arrayListZzZ3.size() + zzyyf2.zzYCT().size() + arrayListZzY2.size() + arrayListZzX2.size() + 1 + (zzyxr.zzYCd() ? arrayListZzZ.size() : 0) + (zzyxr.zzYCd() ? zzyyf.zzYCT().size() : 0) + 1;
            zztN(arrayListZzW.size() + arrayListZzX.size() + size2 + 3);
            zzF(8, iZzV4, arrayListZzX2.size(), size2);
            zzZn(arrayListZzX2);
            if (zzyxr.zzYCd()) {
                zzYC3().zzu1(zzYC4().zzYCr());
                zzZo(arrayListZzZ);
                zzZo(zzyyf.zzYCT());
            }
            zzYC3().zzu0(zzYC4().zzYCr());
            zzZo(arrayListZzY2);
            zzZo(zzyyf2.zzYCT());
            zzYC3().zztZ(zzYC4().zzYCr());
            zzZo(arrayListZzZ3);
            zzZ(zzzb, size);
            zzZm(arrayListZzX);
            zzZl(arrayListZzW);
            zzYC7();
            zztM(iZzV4);
            zzYC6();
            return new SaveOutputParameters("application/x-mobi8-ebook");
        } catch (Throwable th) {
            zzzor.close();
            throw th;
        }
    }

    private static ArrayList<zzYYG> zzY(ArrayList<zzZ5> arrayList, zzYYF zzyyf, com.aspose.words.internal.zzZO0 zzzo0) throws Exception {
        return new zzYY0(new zzZ4(arrayList, zzyyf, zzzo0), zzzo0).zzYCz();
    }

    private static void zzZ(HtmlSaveOptions htmlSaveOptions) {
        zzYXK.zzX(htmlSaveOptions);
        htmlSaveOptions.setPrettyFormat(false);
        htmlSaveOptions.setCssStyleSheetType(2);
        htmlSaveOptions.setCssStyleSheetFileName("");
        htmlSaveOptions.setExportRelativeFontSize(true);
    }

    private static ArrayList<zzY5X> zzZ(zzY86 zzy86) {
        ArrayList<zzY5X> arrayList = new ArrayList<>();
        for (zzY87 zzy87 : zzy86.zzyD()) {
            if ("text/css".equals(zzy87.getContentType()) && (zzy87 instanceof zzY5X)) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList, (zzY5X) zzy87);
            }
        }
        return arrayList;
    }

    private static void zzZ(StringBuilder sb, ArrayList<zzY5X> arrayList) {
        Iterator<zzY5X> it = arrayList.iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZNH.zzU(sb, it.next().getText());
        }
    }

    private void zzZ(zzZB zzzb, ArrayList<zzY5X> arrayList) throws Exception {
        Iterator<zzY5X> it = arrayList.iterator();
        while (it.hasNext()) {
            zzzb.zzP8(zzYC5().zzZ9Y().zzV4(it.next().getText()));
        }
    }

    private void zzZ(zzZB zzzb, int i) throws Exception {
        int iZzYCr = zzYC4().zzYCr();
        zzYC4().zzYCs();
        zzYC3().zzu5(iZzYCr);
        zzYC3().zzu4(i);
        zzzb.zzO(zzYCU());
    }

    private static ArrayList<zzYYG> zzZ(ArrayList<zzYXQ> arrayList, zzYYF zzyyf, com.aspose.words.internal.zzZO0 zzzo0) throws Exception {
        return new zzYY0(new zzYX(arrayList, zzyyf, zzzo0), zzzo0).zzYCz();
    }

    private static ArrayList<zzYYG> zzZ(ArrayList<zzZ3> arrayList, com.aspose.words.internal.zzZO0 zzzo0) throws Exception {
        return new zzYY0(new zzZ2(arrayList, zzzo0), zzzo0).zzYCz();
    }
}

package com.aspose.words;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzZHP extends zzYJG {
    private zzZHQ zzYqe;
    private zzYXT zzYrL;
    private HtmlSaveOptions zzYt2;
    private Document zzZEY;

    public zzZHP(String str, zzY86 zzy86, String str2, String str3, String str4, boolean z, boolean z2, zzYXT zzyxt, Document document, HtmlSaveOptions htmlSaveOptions) throws Exception {
        super(str, zzy86, str2, str3, str4, z, z2);
        this.zzYrL = zzyxt;
        this.zzZEY = document;
        this.zzYt2 = htmlSaveOptions;
    }

    public final void zzZ(String str, com.aspose.words.internal.zzZXH zzzxh, boolean z) {
        this.zzYqe.zzY(zzzxh, str, z);
    }

    public final zzPC[] zzZ20() throws Exception {
        FontSavingArgs fontSavingArgs;
        com.aspose.words.internal.zzZYT zzzyt = new com.aspose.words.internal.zzZYT();
        HashMap map = new HashMap();
        IFontSavingCallback fontSavingCallback = this.zzYt2.getFontSavingCallback();
        int fontResourcesSubsettingSizeThreshold = this.zzYt2.getFontResourcesSubsettingSizeThreshold();
        boolean z = fontSavingCallback != null || (fontResourcesSubsettingSizeThreshold > 0 && fontResourcesSubsettingSizeThreshold < Integer.MAX_VALUE);
        Iterator<Map.Entry<K, V>> it = this.zzYqe.zzZ23().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String strZzZX = (String) entry.getKey();
            com.aspose.words.internal.zzZVA zzzva = (com.aspose.words.internal.zzZVA) entry.getValue();
            com.aspose.words.internal.zzZXH zzzxhZzPl = zzzva.zzn8().zzPl();
            int style = zzzxhZzPl.getStyle();
            boolean z2 = (style & 1) != 0;
            boolean z3 = (style & 2) != 0;
            String fileName = zzzxhZzPl.getFileName();
            if (((String) com.aspose.words.internal.zzQW.zzZ(map, fileName)) == null) {
                int size = (z && com.aspose.words.internal.zzZYD.zzXk(fileName)) ? zzzxhZzPl.zzpB().getSize() : 1;
                boolean zIsSubsettingNeeded = size > fontResourcesSubsettingSizeThreshold;
                if (zIsSubsettingNeeded && com.aspose.words.internal.zzZYD.zzi(com.aspose.words.internal.zzZOQ.zzVe(strZzZX), ".ttc")) {
                    strZzZX = com.aspose.words.internal.zzZOQ.zzZX(strZzZX, ".ttf");
                }
                if (zzYlK().length() > 0) {
                    strZzZX = com.aspose.words.internal.zzZKN.format("{0}.{1}", zzYlK(), strZzZX);
                }
                String fontFileName = strZzZX;
                if (fontSavingCallback != null) {
                    fontSavingArgs = new FontSavingArgs(this.zzZEY, zzzxhZzPl.zzPh(), z2, z3, fileName, size, zIsSubsettingNeeded, fontFileName);
                    fontSavingCallback.fontSaving(fontSavingArgs);
                    if (fontSavingArgs.isExportNeeded()) {
                        zIsSubsettingNeeded = fontSavingArgs.isSubsettingNeeded();
                        fontFileName = fontSavingArgs.getFontFileName();
                        if (zzYlL() != null && fontSavingArgs.zzro()) {
                            throw new IllegalStateException("FontStream cannot be specified. When saving to one of the container formats based on HTML (e.g. EPUB or MHTML), all subsidiary parts must be encapsulated into the output package.");
                        }
                    } else {
                        continue;
                    }
                } else {
                    fontSavingArgs = null;
                }
                boolean z4 = zIsSubsettingNeeded;
                String str = fontFileName;
                zzYXT zzyxt = this.zzYrL;
                String strZzYCf = zzyxt != null ? zzyxt.zzYCf() : zzCL(str);
                if (this.zzYt2.getSaveFormat() == 51 && this.zzYt2.getExportCidUrlsForMhtmlResources() && !com.aspose.words.internal.zzZVR.zzWF(strZzYCf)) {
                    strZzYCf = com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("cid:", strZzYCf);
                }
                if (!z4) {
                    com.aspose.words.internal.zzZQF.zzY(map, fileName, strZzYCf);
                }
                zzY3P zzy3pZzZVm = (fontSavingArgs == null || !fontSavingArgs.zzro()) ? null : fontSavingArgs.zzZVm();
                if (zzYlL() != null) {
                    com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
                    zzZ(zzzva.zzn8(), z4, zzzor);
                    zzYlL().zzX(new zzYM("application/octet-stream", str, zzzor));
                } else if (this.zzYt2.getExportFontsAsBase64()) {
                    com.aspose.words.internal.zzZOR zzzor2 = new com.aspose.words.internal.zzZOR();
                    zzZ(zzzva.zzn8(), z4, zzzor2);
                    strZzYCf = "data:application/x-font-ttf;base64," + com.aspose.words.internal.zzZQB.zzS(zzzor2.zziA(), 0, (int) zzzor2.getLength());
                } else if (zzy3pZzZVm != null) {
                    zzZ(zzzva.zzn8(), z4, zzy3pZzZVm.zzXU9());
                } else {
                    zzYlM();
                    com.aspose.words.internal.zzZOS zzzosZzVl = com.aspose.words.internal.zzZOU.zzVl(zzCM(str));
                    try {
                        zzZ(zzzva.zzn8(), z4, zzzosZzVl);
                    } finally {
                        zzzosZzVl.close();
                    }
                }
                String str2 = strZzYCf;
                if (zzy3pZzZVm != null) {
                    zzy3pZzZVm.zzXU8();
                }
                zzZ(zzzyt, this.zzYqe.zzZ22(), zzzxhZzPl.zzPh(), z2, z3, str2);
            }
        }
        zzPC[] zzpcArr = new zzPC[zzzyt.getCount()];
        for (int i = 0; i < zzzyt.getCount(); i++) {
            zzpcArr[i] = new zzPC(((zzLU) zzzyt.zzVY(i)).zzZWe());
        }
        return zzpcArr;
    }

    public final void zzZ21() throws Exception {
        zzZHQ zzzhq = new zzZHQ(new zzZHR(this.zzZEY, this.zzYt2));
        this.zzYqe = zzzhq;
        this.zzZEY.accept(zzzhq);
    }

    private static void zzZ(com.aspose.words.internal.zzZYT<zzLU> zzzyt, Map<String, String> map, String str, boolean z, boolean z2, String str2) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (com.aspose.words.internal.zzZYD.zzi(str, entry.getValue())) {
                String key = entry.getKey();
                zzLU zzlu = new zzLU();
                zzlu.zzJ(key);
                if (z) {
                    zzlu.zzZs("font-weight", "bold");
                }
                if (z2) {
                    zzlu.zzZs("font-style", "italic");
                }
                zzlu.zzZq("src", str2);
                String str3 = com.aspose.words.internal.zzZKN.format("{0}++{1}", key, Integer.valueOf((z2 ? 2 : 0) + (z ? 1 : 0)));
                if (!zzzyt.containsKey(str3)) {
                    zzzyt.zzB(str3, zzlu);
                }
            }
        }
    }

    private static void zzZ(com.aspose.words.internal.zzJO zzjo, boolean z, com.aspose.words.internal.zzZOP zzzop) throws Exception {
        if (z) {
            zzjo.zzY(zzzop);
            return;
        }
        com.aspose.words.internal.zzZOP zzzopOpenStream = zzjo.zzPl().zzpB().openStream();
        try {
            com.aspose.words.internal.zzZYQ.zzX(zzzopOpenStream, zzzop);
        } finally {
            if (zzzopOpenStream != null) {
                zzzopOpenStream.close();
            }
        }
    }
}

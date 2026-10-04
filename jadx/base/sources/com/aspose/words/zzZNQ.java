package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZNQ implements zzZBR {
    private static boolean zzX(SaveOptions saveOptions) {
        FixedPageSaveOptions fixedPageSaveOptions = (FixedPageSaveOptions) com.aspose.words.internal.zzZKW.zzZ(saveOptions, FixedPageSaveOptions.class);
        return fixedPageSaveOptions != null && fixedPageSaveOptions.getOptimizeOutput();
    }

    private static boolean zzY(SaveOptions saveOptions) {
        if (saveOptions instanceof PdfSaveOptions) {
            return ((PdfSaveOptions) saveOptions).getUseBookFoldPrintingSettings();
        }
        if (saveOptions instanceof XpsSaveOptions) {
            return ((XpsSaveOptions) saveOptions).getUseBookFoldPrintingSettings();
        }
        return false;
    }

    public abstract void zzT(com.aspose.words.internal.zzZH zzzh) throws Exception;

    public zzZ72 zzV(zzYDZ zzydz) {
        return new zzZ72();
    }

    public boolean zzW(SaveOptions saveOptions) throws Exception {
        return false;
    }

    @Override // com.aspose.words.zzZBR
    public final SaveOutputParameters zzZ(zzYDZ zzydz) throws Exception {
        Document document = zzydz.zzYfy;
        zzZ72 zzz72ZzV = zzV(zzydz);
        zzZ(zzydz, zzZ(document.getBuiltInDocumentProperties(), document.getCustomDocumentProperties(), zzydz.zzXpa.getExportGeneratorName(), zzW(zzydz.zzXpa)));
        if (zzydz.zzYfy.zzZpV().zzZrO() && zzY(zzydz.zzXpa)) {
            zzZ(zzydz, zzz72ZzV);
        } else {
            zzY(zzydz, zzz72ZzV);
        }
        return zzZ9c();
    }

    public abstract void zzZ(zzYDZ zzydz, com.aspose.words.internal.zzQR zzqr) throws Exception;

    public abstract SaveOutputParameters zzZ9c() throws Exception;

    private void zzY(zzYDZ zzydz, zzZ72 zzz72) throws Exception {
        PageSet pageSet = ((FixedPageSaveOptions) zzydz.zzXpa).getPageSet();
        Document document = zzydz.zzYfy;
        Iterator<Integer> it = pageSet.zzYq1().zzqI(document.getPageCount()).iterator();
        while (it.hasNext()) {
            zzZ(document.zzZ(it.next().intValue(), zzz72), zzX(zzydz.zzXpa), document.getCompatibilityOptions().getBalanceSingleByteDoubleByteWidth());
        }
    }

    private void zzZ(zzYDZ zzydz, zzZ72 zzz72) throws Exception {
        Document document = zzydz.zzYfy;
        PageSetup pageSetup = document.getFirstSection().getPageSetup();
        zzYE[] zzyeArrZzp = zzYF.zzp(document.getPageCount(), pageSetup.getSheetsPerBooklet(), pageSetup.getMultiplePages());
        long jZzW = zzYF.zzW(document);
        int otherPagesTray = document.getFirstSection().getPageSetup().getOtherPagesTray();
        int length = zzyeArrZzp.length;
        int i = 0;
        while (i < length) {
            zzZ72 zzz722 = zzz72;
            zzZ(document.zzZ(zzyeArrZzp[i], jZzW, otherPagesTray, zzz722), zzX(zzydz.zzXpa), document.getCompatibilityOptions().getBalanceSingleByteDoubleByteWidth());
            i++;
            zzz72 = zzz722;
        }
    }

    private void zzZ(com.aspose.words.internal.zzZH zzzh, boolean z, boolean z2) throws Exception {
        if (z) {
            zzzh = (com.aspose.words.internal.zzZH) com.aspose.words.internal.zzZJ.zzZ(zzzh, z2);
        }
        zzT(zzzh);
    }

    private static com.aspose.words.internal.zzQR zzZ(BuiltInDocumentProperties builtInDocumentProperties, CustomDocumentProperties customDocumentProperties, boolean z, boolean z2) {
        com.aspose.words.internal.zzQR zzqr = new com.aspose.words.internal.zzQR();
        zzqr.setTitle(builtInDocumentProperties.getTitle());
        zzqr.setSubject(builtInDocumentProperties.getSubject());
        zzqr.setAuthor(builtInDocumentProperties.getAuthor());
        zzqr.setKeywords(builtInDocumentProperties.getKeywords());
        zzqr.setDescription(builtInDocumentProperties.getComments());
        zzqr.zz9(builtInDocumentProperties.getLastSavedBy());
        zzqr.zz8(Integer.toString(builtInDocumentProperties.getRevisionNumber()));
        zzqr.setCategory(builtInDocumentProperties.getCategory());
        zzqr.zzV(builtInDocumentProperties.zz7g());
        zzqr.zzU(builtInDocumentProperties.zz7h());
        zzqr.zzT(builtInDocumentProperties.zz7f());
        zzqr.zza(builtInDocumentProperties.getNameOfApplication());
        if (z2) {
            for (DocumentProperty documentProperty : customDocumentProperties) {
                zzqr.zzQz().zzB(documentProperty.getName(), documentProperty.getValue());
            }
        }
        if (z) {
            zzqr.zzb("Aspose.Words for Android via Java 24.3.0");
        }
        return zzqr;
    }

    public static void zzZ(com.aspose.words.internal.zzGU zzgu, String str) throws Exception {
        String strZzFB = zzgu.zzFB();
        String resourcesFolderAlias = zzgu.getResourcesFolderAlias();
        if (zzgu.getResourcesFolderAlias() == null) {
            if (com.aspose.words.internal.zzZYD.zzXk(zzgu.zzFB())) {
                resourcesFolderAlias = zzgu.zzFB();
            } else if (com.aspose.words.internal.zzZYD.zzXk(str)) {
                resourcesFolderAlias = com.aspose.words.internal.zzZOQ.zzVg(str);
            }
        }
        if (!com.aspose.words.internal.zzZYD.zzXk(zzgu.zzFB()) && com.aspose.words.internal.zzZYD.zzXk(str)) {
            strZzFB = com.aspose.words.internal.zzZOQ.zzZW(com.aspose.words.internal.zzZOQ.zzVd(str), com.aspose.words.internal.zzZOQ.zzVg(str));
        }
        zzgu.zzYZ(strZzFB);
        zzgu.setResourcesFolderAlias(resourcesFolderAlias);
    }
}

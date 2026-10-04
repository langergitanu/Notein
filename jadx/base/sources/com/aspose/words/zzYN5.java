package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYN5 {
    public static IPageSavingCallback zzU(SaveOptions saveOptions) {
        FixedPageSaveOptions fixedPageSaveOptions = (FixedPageSaveOptions) com.aspose.words.internal.zzZKW.zzZ(saveOptions, FixedPageSaveOptions.class);
        if (fixedPageSaveOptions != null) {
            return fixedPageSaveOptions.zzZ9h();
        }
        return null;
    }

    public static SaveOutputParameters zzZ(IPageSavingCallback iPageSavingCallback, zzYDZ zzydz, zzZBR zzzbr) throws Exception {
        SaveOutputParameters saveOutputParametersZzZ;
        Iterator<Integer> it = ((FixedPageSaveOptions) zzydz.zzXpa).getPageSet().zzYq1().zzqI(zzydz.zzYfy.getPageCount()).iterator();
        SaveOutputParameters saveOutputParameters = null;
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            PageSavingArgs pageSavingArgs = new PageSavingArgs();
            pageSavingArgs.setPageIndex(iIntValue);
            pageSavingArgs.setPageFileName(zzZ8(zzydz.getFileName(), iIntValue));
            iPageSavingCallback.pageSaving(pageSavingArgs);
            if (!com.aspose.words.internal.zzZYD.zzXk(pageSavingArgs.getPageFileName()) && !pageSavingArgs.zzro()) {
                throw new IllegalStateException("Document page file cannot be written. When saving the document either output file name should be specified or custom streams should be provided via PageSavingCallback. Please see documentation for details.");
            }
            zzYDZ zzydz2 = new zzYDZ(zzydz.zzYfy, zzydz.zzXpb, pageSavingArgs.getPageFileName(), zzydz.zzXpa);
            ((FixedPageSaveOptions) zzydz2.zzXpa).setPageSet(new PageSet(iIntValue));
            if (pageSavingArgs.zzro()) {
                zzY3P zzy3pZzZVm = pageSavingArgs.zzZVm();
                zzydz2.zzXpb = zzy3pZzZVm.zzXU9();
                saveOutputParametersZzZ = zzzbr.zzZ(zzydz2);
                zzy3pZzZVm.zzXU8();
            } else {
                com.aspose.words.internal.zzZOS zzzosZzv = com.aspose.words.internal.zzZOU.zzv(pageSavingArgs.getPageFileName(), 2);
                try {
                    zzydz2.zzXpb = zzzosZzv;
                    saveOutputParametersZzZ = zzzbr.zzZ(zzydz2);
                } finally {
                    if (zzzosZzv != null) {
                        zzzosZzv.close();
                    }
                }
            }
            saveOutputParameters = saveOutputParametersZzZ;
        }
        return saveOutputParameters;
    }

    private static String zzZ8(String str, int i) throws Exception {
        return !com.aspose.words.internal.zzZYD.zzXk(str) ? "" : com.aspose.words.internal.zzZKN.format("{0}\\{1}_{2}{3}", com.aspose.words.internal.zzZOQ.zzVd(str), com.aspose.words.internal.zzZOQ.zzVg(str), Integer.valueOf(i), com.aspose.words.internal.zzZOQ.zzVe(str));
    }
}

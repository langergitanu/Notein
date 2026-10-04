package com.aspose.words;

import com.orion.notein.richeditor.utils.p606io.FilenameUtils;

/* JADX INFO: loaded from: classes6.dex */
final class zzYH4 extends zzYHQ {
    private static char[] zzXvm = {ControlChar.SPACE_CHAR, FilenameUtils.EXTENSION_SEPARATOR, ';'};

    public zzYH4(zzYFT zzyft) {
        super(zzyft);
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzY(zzYET zzyet) {
        String[] strArrZzU = com.aspose.words.internal.zzZKN.zzU(zzyet.zzYR(), zzXvm);
        if (strArrZzU.length == 6 && "Microsoft".equals(strArrZzU[0]) && "Word".equals(strArrZzU[1])) {
            int i = com.aspose.words.internal.zzJB.parseInt(strArrZzU[2]);
            getDocument().getBuiltInDocumentProperties().setVersion(com.aspose.words.internal.zzJB.parseInt(strArrZzU[4]) | (i << 16));
        }
    }
}

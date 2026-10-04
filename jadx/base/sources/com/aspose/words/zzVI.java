package com.aspose.words;

import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzVI {
    public static void zzZ(byte[] bArr, ArrayList<String> arrayList, com.aspose.words.internal.zzZO0 zzzo0) throws Exception {
        zzZ(zzZIR.zzKQ(zzzo0.zzZn(bArr)).zzZ31(), arrayList, (com.aspose.words.internal.zzIM<String>) new com.aspose.words.internal.zzIM(arrayList));
    }

    private static void zzZ(zzZIG zzzig, ArrayList<String> arrayList, com.aspose.words.internal.zzIM<String> zzim) {
        boolean zEquals = "object".equals(zzzig.getName());
        Iterator<zzZG4> it = zzzig.zzZ2C().iterator();
        while (it.hasNext()) {
            zzZIG zzzig2 = (zzZIG) com.aspose.words.internal.zzZKW.zzZ(it.next(), zzZIG.class);
            if (zzzig2 != null) {
                if (zEquals) {
                    zzZK9 zzzk9ZzL6 = zzzig2.zzZ2B().zzL6("name");
                    zzZK9 zzzk9ZzL62 = zzzig2.zzZ2B().zzL6("value");
                    if (zzzk9ZzL6 != null && zzzk9ZzL62 != null && com.aspose.words.internal.zzZKN.zzX(zzzk9ZzL6.getValue(), ImagesContract.LOCAL, com.aspose.words.internal.zzZOF.ORDINAL_IGNORE_CASE$4894b8c8)) {
                        String strZzWH = com.aspose.words.internal.zzZVR.zzWH(com.aspose.words.internal.zzZKN.zzU2(zzzk9ZzL62.getValue()));
                        if (zzim.add(strZzWH)) {
                            com.aspose.words.internal.zzZQG.zzZ(arrayList, strZzWH);
                        }
                    }
                } else {
                    zzZ(zzzig2, arrayList, zzim);
                }
            }
        }
    }
}

package com.aspose.words.internal;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
final class zzBO {
    public static void zzS(ArrayList<String> arrayList) {
        final Collator collatorZzcp = zzZHT.zzcp();
        Collections.sort(arrayList, new Comparator<String>() { // from class: com.aspose.words.internal.zzBO.1
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.Comparator
            public int compare(String str, String str2) {
                return collatorZzcp.compare(str, str2);
            }
        });
    }
}

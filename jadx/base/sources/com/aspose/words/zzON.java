package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzON {
    public static void zzZ(zzPR zzpr, zzPS zzps) {
        ArrayList<String> arrayList = new ArrayList();
        for (zzPT zzpt : zzpr) {
            if (zzpt.zzZWj().zzZVz()) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<String>) arrayList, zzpt.zzZWo());
            }
        }
        for (String str : arrayList) {
            zzpr.remove(str);
            zzPT zzptZzSx = zzps.zzSx(str);
            if (zzptZzSx != null && !zzptZzSx.zzZWj().zzZVz()) {
                zzpr.zzY(zzptZzSx);
                zzpr.zzW(str, zzps);
            }
        }
        for (zzPT zzpt2 : zzps) {
            if (zzMR.zzSk(zzpt2.zzZWo()).zzZVD() && zzpr.zzSx(zzpt2.zzZWo()) == null) {
                zzpr.zzY(zzpt2);
                zzpr.zzW(zzpt2.zzZWo(), zzps);
            }
        }
    }
}

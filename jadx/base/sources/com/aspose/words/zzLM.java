package com.aspose.words;

import com.aspose.words.ref.RefInt;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzLM extends zzOP {
    public zzLM() {
        super("text-decoration", false, zzLL.zzZo5);
    }

    private static boolean zzM(zzL4 zzl4) {
        return zzl4.zzY(zzL4.zzZna, zzL4.zzZn9, zzL4.zzZn8, zzL4.zzZn7);
    }

    @Override // com.aspose.words.zzOP
    public final zzPT zzZ(zzL2 zzl2, int i, boolean z, boolean z2, RefInt refInt) {
        refInt.set(0);
        return null;
    }

    @Override // com.aspose.words.zzOP
    public final zzMP zzZ(zzL2 zzl2, boolean z) {
        if (zzl2.getCount() == 1 && zzl2.zzMl(0).zzP(zzL4.zzZno)) {
            return zzLL.zzZo5;
        }
        if (zzl2.getCount() <= 0) {
            return null;
        }
        Iterator<zzL4> it = zzl2.iterator();
        while (it.hasNext()) {
            if (!zzM(it.next())) {
                return null;
            }
        }
        return new zzLL(zzl2);
    }
}

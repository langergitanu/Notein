package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzOR implements zzH2 {
    private ArrayList<zzOS> zzGd;
    private zzOS zzGe;

    public static void zzP(zzP8 zzp8) throws Exception {
        zzp8.zzY(new zzOR());
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzY(zzP5 zzp5) {
        zzOS zzos = this.zzGe;
        if (zzos != null) {
            zzos.zzNv();
        }
        Iterator<zzOS> it = this.zzGd.iterator();
        while (it.hasNext()) {
            zzp5.zzNY().remove(it.next());
        }
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(zzP5 zzp5) {
        this.zzGe = null;
        this.zzGd = new ArrayList<>();
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(zzOS zzos) {
        if (zzos.zzNu().getCount() == 0) {
            return true;
        }
        zzOS zzos2 = this.zzGe;
        if (zzos2 == null) {
            this.zzGe = zzos;
        } else {
            zzos2.zzNu().zzR(zzos.zzNu());
            zzZQG.zzZ(this.zzGd, zzos);
        }
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(zzPZ zzpz) {
        zzOS zzos = this.zzGe;
        if (zzos == null) {
            return true;
        }
        zzos.zzNv();
        this.zzGe = null;
        return true;
    }
}

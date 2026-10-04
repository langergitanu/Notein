package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYL9 {
    private ArrayList<zzYLC> zzXDT;

    public zzYL9(zzYLC zzylc) {
        this();
        com.aspose.words.internal.zzZQG.zzZ(this.zzXDT, zzylc);
    }

    public final void zzNw() {
        for (int i = 0; i < this.zzXDT.size(); i++) {
            this.zzXDT.get(i).zzRx(true);
        }
    }

    public final void zzT(zzYLC zzylc) {
        ArrayList arrayList = new ArrayList(this.zzXDT.size());
        for (int i = 0; i < this.zzXDT.size(); i++) {
            zzYLC zzylcZzY = zzYLA.zzY(zzylc, zzq0(i));
            if (zzylcZzY.zzYnj() != 0) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzYLC>) arrayList, zzylcZzY);
            }
        }
        this.zzXDT.clear();
        com.aspose.words.internal.zzZQG.zzZ((ArrayList) this.zzXDT, (Iterable) arrayList);
    }

    public final void zzU(zzYLC zzylc) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzXDT, zzylc);
    }

    public final void zzV(zzYLC zzylc) {
        ArrayList arrayListZzY = com.aspose.words.internal.zzZQG.zzY(this.zzXDT);
        boolean z = false;
        for (int i = 0; i < arrayListZzY.size(); i++) {
            zzYLC zzylc2 = (zzYLC) arrayListZzY.get(i);
            zzYL9 zzyl9ZzZ = zzYLA.zzZ(zzylc2, zzylc);
            if (zzyl9ZzZ.zzXDT.size() == 1) {
                this.zzXDT.remove(zzylc2);
                this.zzXDT.remove(zzylc);
                zzylc = zzyl9ZzZ.zzq0(0);
                com.aspose.words.internal.zzZQG.zzZ(this.zzXDT, zzylc);
                z = true;
            }
        }
        if (z) {
            return;
        }
        com.aspose.words.internal.zzZQG.zzZ(this.zzXDT, zzylc);
    }

    public final ArrayList<zzYLC> zzYAN() {
        return com.aspose.words.internal.zzZQG.zzY(this.zzXDT);
    }

    public final int zzYna() {
        return this.zzXDT.size();
    }

    public final void zzp(com.aspose.words.internal.zzP9 zzp9) {
        Iterator<zzYLC> it = this.zzXDT.iterator();
        while (it.hasNext()) {
            it.next().zzq(zzp9);
        }
    }

    public final zzYLC zzq0(int i) {
        if (i < 0 || i >= this.zzXDT.size()) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: index");
        }
        return this.zzXDT.get(i);
    }

    public zzYL9(zzYLC zzylc, zzYLC zzylc2) {
        this();
        com.aspose.words.internal.zzZQG.zzZ(this.zzXDT, zzylc);
        com.aspose.words.internal.zzZQG.zzZ(this.zzXDT, zzylc2);
    }

    public zzYL9(zzYL9 zzyl9) {
        this();
        com.aspose.words.internal.zzZQG.zzZ((ArrayList) this.zzXDT, (Iterable) zzyl9.zzXDT);
    }

    public zzYL9() {
        this.zzXDT = new ArrayList<>();
    }

    public final void zzV(zzYL9 zzyl9) {
        Iterator<zzYLC> it = zzyl9.zzXDT.iterator();
        while (it.hasNext()) {
            zzV(it.next());
        }
    }
}

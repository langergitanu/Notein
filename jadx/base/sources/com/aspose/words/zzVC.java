package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzVC {
    private ArrayList<zzVG> zzZm = new ArrayList<>();

    public final void clear() {
        this.zzZm.clear();
    }

    public final int getCount() {
        return this.zzZm.size();
    }

    public final zzZLN zz0Q() {
        return zz0S().zz16().zzZYE().zzZYF();
    }

    public final int zz0R() {
        int length = 0;
        for (int i = 0; i < this.zzZm.size(); i++) {
            length += zzNl(i).zzr5().length;
        }
        return length;
    }

    public final zzVG zz0S() {
        return zzNl(this.zzZm.size() - 1);
    }

    public final zzVG zzNl(int i) {
        return this.zzZm.get(i);
    }

    public final void zzZ(zzVG zzvg) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZm, zzvg);
    }
}

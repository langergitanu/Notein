package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZKD {
    private static zzZIG zzYtw = new zzZIG("ScopeMarker");
    private ArrayList<zzZIG> zzZom = new ArrayList<>();

    public final int getCount() {
        return this.zzZom.size();
    }

    public final zzZIG zzAb(int i) {
        if (this.zzZom.get(i) != zzYtw) {
            return this.zzZom.get(i);
        }
        return null;
    }

    public final zzZIG zzL7(String str) {
        for (int size = this.zzZom.size() - 1; size >= 0 && this.zzZom.get(size) != zzYtw; size--) {
            zzZIG zzzig = this.zzZom.get(size);
            if (com.aspose.words.internal.zzZKN.equals(zzzig.getName(), str)) {
                return zzzig;
            }
        }
        return null;
    }

    public final int zzX(zzZIG zzzig) {
        return this.zzZom.indexOf(zzzig);
    }

    public final void zzY(zzZIG zzzig) {
        this.zzZom.remove(zzzig);
    }

    public final void zzZ(zzZIG zzzig) {
        int i = 0;
        zzZIG zzzig2 = null;
        for (int size = this.zzZom.size() - 1; size >= 0 && this.zzZom.get(size) != zzYtw && i < 3; size--) {
            zzZIG zzzig3 = this.zzZom.get(size);
            if (com.aspose.words.internal.zzZKN.equals(zzzig3.getName(), zzzig.getName()) && com.aspose.words.internal.zzZKN.equals(zzzig3.getNamespace(), zzzig.getNamespace()) && zzzig3.zzZ2B().zzZ(zzzig.zzZ2B())) {
                i++;
                zzzig2 = zzzig3;
            }
        }
        if (i >= 3) {
            this.zzZom.remove(zzzig2);
        }
        com.aspose.words.internal.zzZQG.zzZ(this.zzZom, zzzig);
    }

    public final void zzZ4s() {
        int iLastIndexOf = this.zzZom.lastIndexOf(zzYtw);
        if (iLastIndexOf < 0) {
            this.zzZom.clear();
        } else {
            ArrayList<zzZIG> arrayList = this.zzZom;
            com.aspose.words.internal.zzZQG.zzV(arrayList, iLastIndexOf, arrayList.size() - iLastIndexOf);
        }
    }

    public final void zzZ4t() {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZom, zzYtw);
    }

    public final void zzY(int i, zzZIG zzzig) {
        this.zzZom.set(i, zzzig);
    }

    public final void zzZ(int i, zzZIG zzzig) {
        this.zzZom.add(i, zzzig);
    }
}

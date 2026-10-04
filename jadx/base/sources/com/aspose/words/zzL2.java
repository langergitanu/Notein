package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
class zzL2 implements Iterable<zzL4> {
    private ArrayList<zzL4> zzUY;

    public zzL2() {
        this.zzUY = new ArrayList<>();
    }

    public boolean equals(Object obj) {
        if (com.aspose.words.internal.zzZKO.zzA(null, obj)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, obj)) {
            return true;
        }
        zzL2 zzl2 = (zzL2) com.aspose.words.internal.zzZKW.zzZ(obj, zzL2.class);
        if (zzl2 == null) {
            return false;
        }
        return zzZ(zzl2);
    }

    public final int getCount() {
        return this.zzUY.size();
    }

    public int hashCode() {
        Iterator<zzL4> it = this.zzUY.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 397) ^ it.next().hashCode();
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable
    public Iterator<zzL4> iterator() {
        return this.zzUY.iterator();
    }

    public final void removeAt(int i) {
        this.zzUY.remove(i);
    }

    public final int zzI(zzL4 zzl4) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzUY, zzl4);
        return this.zzUY.size() - 1;
    }

    public final zzL4 zzMl(int i) {
        return this.zzUY.get(i);
    }

    public final boolean zzO(zzL4 zzl4) {
        for (int i = 0; i < this.zzUY.size(); i++) {
            if (zzMl(i).zzP(zzl4)) {
                return true;
            }
        }
        return false;
    }

    public final zzL2 zzYc(int i, int i2) {
        if (i2 == -1) {
            i2 = this.zzUY.size() - i;
        }
        zzL2 zzl2 = new zzL2(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            zzl2.zzI(zzMl(i + i3));
        }
        return zzl2;
    }

    public final boolean zzZ(zzL2 zzl2) {
        if (com.aspose.words.internal.zzZKO.zzA(null, zzl2)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, zzl2)) {
            return true;
        }
        if (this.zzUY.size() != zzl2.zzUY.size()) {
            return false;
        }
        for (int i = 0; i < this.zzUY.size(); i++) {
            if (!this.zzUY.get(i).zzP(zzl2.zzMl(i))) {
                return false;
            }
        }
        return true;
    }

    public final String zzZXu() {
        StringBuilder sb = new StringBuilder();
        for (zzL4 zzl4 : this.zzUY) {
            if (sb.length() > 0 && !(zzl4 instanceof zzQ8)) {
                sb.append(ControlChar.SPACE_CHAR);
            }
            zzl4.zzG(sb);
        }
        return sb.toString();
    }

    public zzL2(int i) {
        this.zzUY = new ArrayList<>(i);
    }

    public zzL2(zzL4... zzl4Arr) {
        this();
        com.aspose.words.internal.zzZQG.zzZ((ArrayList) this.zzUY, (Object[]) zzl4Arr);
    }

    public zzL2(zzL2 zzl2) {
        this(zzl2.zzUY.size());
        com.aspose.words.internal.zzZQG.zzZ((ArrayList) this.zzUY, (Iterable) zzl2.zzUY);
    }

    public final boolean zzZ(zzL4... zzl4Arr) {
        return zzZ(new zzL2(zzl4Arr));
    }
}

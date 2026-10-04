package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZNL implements Iterable<zzZNO> {
    private ArrayList<zzZNO> zzYxW = new ArrayList<>();

    public static Iterable<zzZNO> zzF(Iterable<zzZNO> iterable) {
        if (iterable == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (zzZNO zzzno : iterable) {
            if (zzzno != null && !zzzno.zzZ8W() && !zzzno.zzZ8F()) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZNO>) arrayList, zzzno);
            }
        }
        return arrayList;
    }

    private void zzZ84() {
        for (int size = this.zzYxW.size() - 1; size >= 0; size--) {
            if (zzBz(size).zzZ8W()) {
                this.zzYxW.remove(size);
            }
        }
    }

    public final void clear() {
        this.zzYxW.clear();
    }

    public final int getCount() {
        return this.zzYxW.size();
    }

    @Override // java.lang.Iterable
    public final Iterator<zzZNO> iterator() {
        return this.zzYxW.iterator();
    }

    public final void remove(Object obj) {
        Iterator<zzZNO> it = this.zzYxW.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (obj == it.next().zzZ90()) {
                this.zzYxW.remove(i);
                return;
            }
            i++;
        }
    }

    public final zzZNO zzBz(int i) {
        return this.zzYxW.get(i);
    }

    public final void zzT(zzZNO zzzno) {
        if (zzzno == null) {
            return;
        }
        boolean z = false;
        for (zzZNO zzzno2 : this.zzYxW) {
            z |= zzzno2.zzZ93() == zzzno.zzZ93();
            if (z) {
                zzzno2.zzZ8Q();
            }
        }
    }

    public final void zzU(zzZNO zzzno) throws Exception {
        if (zzzno == null) {
            return;
        }
        zzZNO zzznoZzZu = zzZu(zzzno.zzZ90());
        if (zzznoZzZu == null) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzYxW, zzzno);
            zzznoZzZu = zzzno;
        }
        if (zzznoZzZu != zzzno && zzzno.zzZ8T() && zzznoZzZu.zzZ8T()) {
            zzznoZzZu.zzZ8V().zzY(zzzno.zzZ8V());
        }
    }

    public final void zzY(zzZNL zzznl) {
        for (zzZNO zzzno : zzznl) {
            if (!zzzno.zzZ8W() && zzzno.zzbD()) {
                com.aspose.words.internal.zzZQG.zzZ(this.zzYxW, zzzno);
            }
        }
    }

    public final boolean zzZ(Object obj, zzY5N zzy5n) throws Exception {
        if (zzZu(obj) == null) {
            return false;
        }
        for (int size = this.zzYxW.size() - 1; size >= 0; size--) {
            zzZNO zzznoZzBz = zzBz(size);
            if (!zzznoZzBz.zzZ8X() && zzznoZzBz.zzZ8T()) {
                zzy5n.zzZ(zzznoZzBz, true, true);
            }
            zzznoZzBz.zzZ8Q();
            if (zzznoZzBz.zzbD()) {
                zzznoZzBz.zzZ93().zzNd(3);
            }
            this.zzYxW.remove(size);
            if (zzznoZzBz.zzZ90() == obj) {
                break;
            }
        }
        return true;
    }

    public final int zzZ81() {
        int i = 0;
        while (i < this.zzYxW.size()) {
            zzZNO zzznoZzBz = zzBz(i);
            if (zzznoZzBz.zzZ93().isActive() && zzznoZzBz.zzbD()) {
                break;
            }
            i++;
        }
        if (i >= this.zzYxW.size()) {
            return -1;
        }
        return i;
    }

    public final boolean zzZ82() {
        return zzY((zzZKY) null) != -1;
    }

    public final int zzZ83() {
        int i = 0;
        for (int size = this.zzYxW.size() - 1; size >= 0; size--) {
            zzZNO zzznoZzBz = zzBz(size);
            if (!zzznoZzBz.zzZ93().isActive() || zzznoZzBz.zzbD()) {
                this.zzYxW.remove(size);
                i++;
            }
        }
        return i;
    }

    public final zzZNO zzZu(Object obj) {
        if (obj == null) {
            return null;
        }
        zzZ84();
        for (zzZNO zzzno : this.zzYxW) {
            if (obj == zzzno.zzZ90()) {
                return zzzno;
            }
        }
        return null;
    }

    public final int zzY(zzZKY zzzky) {
        int i = 0;
        while (true) {
            if (i >= this.zzYxW.size()) {
                break;
            }
            zzZNO zzznoZzBz = zzBz(i);
            if (zzznoZzBz.zzZ93().isActive()) {
                if (zzznoZzBz.zzbD()) {
                    i = -1;
                    break;
                }
                if (zzzky == null || zzznoZzBz.zzZ93().zzqh(1024) == zzzky) {
                    break;
                }
            }
            i++;
        }
        if (i >= this.zzYxW.size()) {
            return -1;
        }
        return i;
    }

    public final void zzZ(zzZNL zzznl, zzZKY zzzky) {
        if (zzzky == null || !zzzky.zzac()) {
            return;
        }
        for (zzZNO zzzno : zzznl) {
            if (!zzzno.zzZ8W()) {
                if (zzzno.zzbD()) {
                    return;
                }
                if (((zzZKY) zzzno.zzZ93().zzqh(1024)).isHeader() == zzzky.isHeader()) {
                    com.aspose.words.internal.zzZQG.zzZ(this.zzYxW, zzzno);
                }
            }
        }
    }

    public final boolean zzZ(zzZNL zzznl) throws Exception {
        int i = 0;
        while (i < this.zzYxW.size()) {
            zzZNO zzznoZzBz = zzBz(i);
            if (zzznoZzBz.zzbD()) {
                break;
            }
            if (i >= zzznl.zzYxW.size()) {
                return false;
            }
            zzZNO zzznoZzBz2 = zzznl.zzBz(i);
            if (zzznoZzBz2.zzZ8W() || zzznoZzBz2.zzbD() || !zzznoZzBz2.zzZ8T() || !zzznoZzBz.zzVH(false).zzY(zzznoZzBz2.zzVH(false))) {
                return false;
            }
            i++;
        }
        return i >= zzznl.zzYxW.size() || zzznl.zzBz(i).zzbD();
    }
}

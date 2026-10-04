package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class GeneralFormatCollection implements Iterable<Integer> {
    private zzZR1 zzYFN;

    public static final class zzZ implements Iterator<Integer> {
        private com.aspose.words.internal.zzKV<zzZPC> zzYuQ;

        public zzZ(Iterator<zzZPC> it) {
            this.zzYuQ = new com.aspose.words.internal.zzKV<>(it);
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            while (this.zzYuQ.moveNext()) {
                if (GeneralFormatCollection.zzY(this.zzYuQ.getCurrent())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.Iterator
        public Integer next() {
            try {
                return Integer.valueOf(zzZLM.zzLd(this.zzYuQ.getCurrent().zzZcc().zzW2(true)));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public GeneralFormatCollection(zzZR1 zzzr1) {
        this.zzYFN = zzzr1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzY(zzZPC zzzpc) {
        return zzzpc.zzLL("\\*") && zzzpc.zzZcb();
    }

    public void add(int i) throws Exception {
        this.zzYFN.zzR("\\*", zzZLM.zzAr(i), getCount());
    }

    public int get(int i) {
        int i2 = 0;
        for (zzZPC zzzpc : this.zzYFN.zzZfC()) {
            if (zzY(zzzpc)) {
                if (i2 == i) {
                    return zzZLM.zzLd(zzzpc.zzZcc().zzW2(true));
                }
                i2++;
            }
        }
        return 0;
    }

    public int getCount() {
        Iterator<Integer> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public Iterator<Integer> iterator() {
        return new zzZ(this.zzYFN.zzZfC().iterator());
    }

    public void remove(int i) throws Exception {
        com.aspose.words.internal.zzDB zzdb = new com.aspose.words.internal.zzDB();
        for (int i2 = 0; i2 < getCount(); i2++) {
            if (get(i2) == i) {
                zzdb.add(i2);
            }
        }
        for (int count = zzdb.getCount() - 1; count >= 0; count--) {
            removeAt(zzdb.get(count));
        }
    }

    public void removeAt(int i) throws Exception {
        this.zzYFN.zzR("\\*", null, i);
    }

    public final boolean zzAs(int i) {
        for (int i2 = 0; i2 < getCount(); i2++) {
            if (get(i2) == i) {
                return true;
            }
        }
        return false;
    }

    public final void zzVw(boolean z) throws Exception {
        if (zzAs(54) == z) {
            return;
        }
        if (z) {
            add(54);
        } else {
            remove(54);
        }
    }

    public final int zzZ5i() {
        Iterator<Integer> it = iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (zzZLM.zzAq(iIntValue)) {
                return iIntValue;
            }
        }
        return 0;
    }
}

package com.aspose.words;

import com.aspose.words.ref.Ref;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYK0 implements zzZD4 {
    private static com.aspose.words.internal.zzZNR zzXCC = new com.aspose.words.internal.zzZNR("^((\\w+)\\s+)?((([A-Z]+\\d+)|(R\\d+C\\d+))|(([A-Z]+|\\d+|[A-Z]+\\d+):([A-Z]+|\\d+|[A-Z]+\\d+)))$", 66);
    private zzWQ zzXCD;
    private zzWQ zzXCE;

    public static final class zzZ implements Iterator<Cell> {
        private zzWQ zzXCB;
        private boolean zzZzJ;
        private zzZD4 zzZzO;

        public zzZ(zzZD4 zzzd4) {
            this.zzZzO = zzzd4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: zzYmc, reason: merged with bridge method [inline-methods] */
        public Cell next() {
            if (this.zzZzJ) {
                return this.zzXCB.zz6C();
            }
            return null;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            boolean zIsValid;
            try {
                if (this.zzZzJ) {
                    zIsValid = this.zzXCB.zzOy(1);
                } else {
                    this.zzZzJ = true;
                    zzWQ zzwqZz5I = this.zzZzO.zzYWV().zz5I();
                    this.zzXCB = zzwqZz5I;
                    zIsValid = zzwqZz5I.isValid();
                }
                if (zIsValid && this.zzXCB.getColumnIndex() <= this.zzZzO.zzYWU().getColumnIndex()) {
                    return true;
                }
                this.zzXCB.zzOv(0);
                while (this.zzXCB.zzOx(1) && this.zzXCB.getRowIndex() <= this.zzZzO.zzYWU().getRowIndex()) {
                    if (this.zzXCB.zzOy(this.zzZzO.zzYWV().getColumnIndex())) {
                        return true;
                    }
                }
                return false;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private zzYK0(zzWQ zzwq, zzWQ zzwq2) {
        this.zzXCE = zzwq;
        this.zzXCD = zzwq2;
    }

    private static zzTL zzY(zzZQM zzzqm, String str, Ref<Table> ref) throws Exception {
        ref.set(null);
        Bookmark bookmarkZzT = zzZOO.zzT(zzzqm.getField(), str);
        if (bookmarkZzT == null) {
            return new zzZU3(com.aspose.words.internal.zzZKN.format("!Undefined Bookmark, {0}", str.toUpperCase()));
        }
        Table table = (Table) bookmarkZzT.getBookmarkStart().getAncestor(5);
        Table table2 = (Table) bookmarkZzT.getBookmarkEnd().getAncestor(5);
        boolean z = table != null;
        if (table2 == null && bookmarkZzT.getBookmarkEnd().zzYB9() != table && bookmarkZzT.getBookmarkEnd().zzYBd().zzYB9() != table) {
            return new zzZU3(com.aspose.words.internal.zzZKN.format("!{0} Is Not In Table", str));
        }
        if (!z) {
            return new zzZVZ(0.0d);
        }
        ref.set(table);
        return null;
    }

    public static zzTL zzZ(zzZQM zzzqm, String str, boolean z, Ref<zzZD4> ref) throws Exception {
        Table table;
        ref.set(null);
        com.aspose.words.internal.zzZNT zzzntZzUX = zzXCC.zzUX(str);
        if (!zzzntZzUX.zzhL()) {
            return null;
        }
        com.aspose.words.internal.zzZNV zzznvZzQx = zzzntZzUX.zzhJ().zzQx(2);
        if (zzznvZzQx.zzhL()) {
            Ref ref2 = new Ref(null);
            zzTL zztlZzY = zzY(zzzqm, zzznvZzQx.getValue(), ref2);
            table = (Table) ref2.get();
            if (zztlZzY != null) {
                return zztlZzY;
            }
        } else {
            table = null;
        }
        Table parentTable = table != null ? table : zzzqm.getParentTable() != null ? zzzqm.getParentTable() : null;
        com.aspose.words.internal.zzZNV zzznvZzQx2 = zzzntZzUX.zzhJ().zzQx(4);
        if (zzznvZzQx2.zzhL()) {
            ref.set(zzZ(parentTable, zzznvZzQx2.getValue(), zzznvZzQx2.getValue()));
        } else if (zzzntZzUX.zzhJ().zzQx(7).zzhL()) {
            ref.set(zzZ(parentTable, OooO0O0.OooO00o(zzzntZzUX, 8), OooO0O0.OooO00o(zzzntZzUX, 9)));
        }
        if (ref.get() == null) {
            if (table != null) {
                return zzZU3.zzZiV();
            }
            return null;
        }
        if (parentTable == null) {
            return new zzZU3("!The Formula Not In Table");
        }
        if (z || ref.get().zzYWW()) {
            return null;
        }
        return zzZU3.zzZiV();
    }

    @Override // java.lang.Iterable
    public final Iterator<Cell> iterator() {
        return new zzZ(this);
    }

    @Override // com.aspose.words.zzZD4
    public final boolean zzYWS() {
        return true;
    }

    @Override // com.aspose.words.zzZD4
    public final zzTL zzYWT() {
        return new zzZVZ(0.0d);
    }

    @Override // com.aspose.words.zzZD4
    public final zzWQ zzYWU() {
        return this.zzXCD;
    }

    @Override // com.aspose.words.zzZD4
    public final zzWQ zzYWV() {
        return this.zzXCE;
    }

    @Override // com.aspose.words.zzZD4
    public final boolean zzYWW() {
        return zzWQ.zzZ(this.zzXCE, this.zzXCD);
    }

    @Override // com.aspose.words.zzZD4
    public final boolean zzYWX() {
        return true;
    }

    private static zzZD4 zzZ(Table table, String str, String str2) {
        zzWQ zzwqZzZ = zzWQ.zzZ(table, str, 0);
        zzWQ zzwqZzZ2 = zzWQ.zzZ(table, str2, Integer.MAX_VALUE);
        if (zzwqZzZ == null || zzwqZzZ2 == null) {
            return null;
        }
        return new zzYK0(zzwqZzZ, zzwqZzZ2);
    }
}

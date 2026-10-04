package com.aspose.words.internal;

import com.aspose.words.net.System.Data.DataException;
import com.aspose.words.net.System.Data.DataRelation;
import com.aspose.words.net.System.Data.DataRow;
import com.aspose.words.net.System.Data.DataTable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class zzZZM implements zzHA, Iterable {
    private DataRow[] zzd5;
    private DataRelation zzd6;
    private DataRow zzd7;

    public static final class zzZ implements Iterator {
        private int zzTL = -1;
        private DataRow[] zzd4;

        public zzZ(DataRow[] dataRowArr) {
            this.zzd4 = dataRowArr;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i = this.zzTL + 1;
            this.zzTL = i;
            return i < this.zzd4.length;
        }

        @Override // java.util.Iterator
        public final Object next() {
            return this.zzd4[this.zzTL];
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public zzZZM(DataRow dataRow, DataRelation dataRelation) {
        if (dataRow.getTable() != dataRelation.getChildTable()) {
            dataRow.getTable();
            dataRelation.getParentTable();
        }
        this.zzd7 = dataRow;
        this.zzd6 = dataRelation;
    }

    private boolean zzrD() {
        return this.zzd7.getTable() == this.zzd6.getChildTable();
    }

    private DataRow[] zzrE() {
        if (this.zzd5 == null) {
            this.zzd5 = zzrD() ? this.zzd7.getParentRows(this.zzd6) : this.zzd7.getChildRows(this.zzd6);
        }
        return this.zzd5;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzZ(zzrE());
    }

    @Override // com.aspose.words.internal.zzHA
    public final boolean zzFH() {
        return zzrE().length != 0;
    }

    public final DataTable zzrF() {
        return zzrD() ? this.zzd6.getParentTable() : this.zzd6.getChildTable();
    }

    public final DataRow zzrG() {
        int length = zzrE().length;
        if (length == 0) {
            return null;
        }
        if (length != 1) {
            throw new DataException(zzZKN.format("A single {0} data row is expected, but multiple {0} data rows are found.", zzrD() ? "parent" : "child"));
        }
        return zzrE()[0];
    }
}

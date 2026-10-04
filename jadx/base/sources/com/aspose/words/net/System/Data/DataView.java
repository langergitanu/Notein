package com.aspose.words.net.System.Data;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public class DataView implements Iterable<DataRowView> {
    private final DataTable zzY61;
    private final ArrayList<DataRowView> zzZEU = new ArrayList<>();

    public DataView(DataTable dataTable) {
        this.zzY61 = dataTable;
        Iterator<DataRow> it = dataTable.getRows().iterator();
        while (it.hasNext()) {
            this.zzZEU.add(new DataRowView(this, it.next()));
        }
    }

    public void close() {
    }

    public DataRowView get(int i) {
        return this.zzZEU.get(i);
    }

    public int getCount() {
        return this.zzY61.getRows().getCount();
    }

    public DataTable getTable() {
        return this.zzY61;
    }

    @Override // java.lang.Iterable
    public Iterator<DataRowView> iterator() {
        return this.zzZEU.iterator();
    }
}

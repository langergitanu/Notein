package com.aspose.words.net.System.Data;

import com.aspose.words.internal.zzZKN;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class DataColumnCollection implements Iterable<DataColumn> {
    private DataTable zzY61;
    private final ArrayList<DataColumn> zzYhr = new ArrayList<>();
    private final Map<String, DataColumn> zzWRJ = new HashMap();

    public DataColumnCollection(DataTable dataTable) {
        this.zzY61 = dataTable;
    }

    private static String zzUv(String str) {
        return Normalizer.normalize(str.toLowerCase(), Normalizer.Form.NFD);
    }

    public void add(DataColumn dataColumn) {
        if (zzZKN.zzU3(dataColumn.getColumnName())) {
            throw new IllegalArgumentException("Column name cannot be null or empty");
        }
        String strZzUv = zzUv(dataColumn.getColumnName());
        if (this.zzWRJ.containsKey(strZzUv)) {
            throw new IllegalArgumentException("Column with the same name already exists");
        }
        dataColumn.zzW(this.zzY61);
        dataColumn.setOrdinal(this.zzYhr.size());
        this.zzYhr.add(dataColumn);
        this.zzWRJ.put(strZzUv, dataColumn);
        this.zzY61.onDataColumnInserted(dataColumn);
    }

    public void clear() {
        this.zzWRJ.clear();
        this.zzYhr.clear();
    }

    public boolean contains(String str) {
        return indexOf(str) >= 0;
    }

    public DataColumn get(int i) {
        return this.zzYhr.get(i);
    }

    public int getCount() {
        return this.zzYhr.size();
    }

    public int indexOf(String str) {
        if (zzZKN.zzU3(str)) {
            return -1;
        }
        DataColumn dataColumn = this.zzWRJ.get(zzUv(str));
        if (dataColumn != null) {
            int size = this.zzYhr.size();
            for (int i = 0; i < size; i++) {
                if (this.zzYhr.get(i) == dataColumn) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override // java.lang.Iterable
    public Iterator<DataColumn> iterator() {
        return this.zzYhr.iterator();
    }

    public void remove(String str) {
        int iIndexOf = indexOf(str);
        if (iIndexOf >= 0) {
            DataColumn dataColumnRemove = this.zzYhr.remove(iIndexOf);
            this.zzWRJ.remove(zzUv(dataColumnRemove.getColumnName()));
            Iterator<DataRow> it = this.zzY61.getRows().iterator();
            while (it.hasNext()) {
                it.next().remove(iIndexOf);
            }
            this.zzY61.onDataColumnDeleted(dataColumnRemove);
        }
    }

    public final DataColumn[] zzXQs() {
        ArrayList arrayList = new ArrayList(this.zzYhr);
        return (DataColumn[]) arrayList.toArray(new DataColumn[arrayList.size()]);
    }

    public final void zzZ(String str, DataColumn dataColumn) {
        if (contains(str)) {
            throw new IllegalArgumentException("Column with the same name already exists");
        }
        int size = this.zzYhr.size();
        for (int i = 0; i < size; i++) {
            if (this.zzYhr.get(i) == dataColumn) {
                String strZzUv = zzUv(str);
                this.zzWRJ.remove(zzUv(dataColumn.getColumnName()));
                this.zzWRJ.put(strZzUv, dataColumn);
                return;
            }
        }
    }

    public DataColumn get(String str) {
        int iIndexOf = indexOf(str);
        if (iIndexOf >= 0) {
            return get(iIndexOf);
        }
        return null;
    }

    public int indexOf(DataColumn dataColumn) {
        if (dataColumn == null) {
            return -1;
        }
        return indexOf(dataColumn.getColumnName());
    }

    public void remove(DataColumn dataColumn) {
        remove(dataColumn.getColumnName());
    }

    public void add(String str) {
        add(str, String.class);
    }

    public DataColumn add(String str, Class cls) {
        DataColumn dataColumn = new DataColumn(str, cls, this.zzY61);
        add(dataColumn);
        return dataColumn;
    }

    public DataColumn add(String str, Class cls, int i, boolean z, boolean z2) {
        DataColumn dataColumn = new DataColumn(str, cls, this.zzY61);
        dataColumn.setColumnMapping(i);
        dataColumn.setAutoIncrement(z);
        dataColumn.setAllowDBNull(z2);
        add(dataColumn);
        return dataColumn;
    }
}

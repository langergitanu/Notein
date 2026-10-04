package com.aspose.words.net.System.Data;

import androidx.appcompat.widget.C21532OooOOo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class DataTableCollection implements Iterable<DataTable> {
    private DataSet zzZQ8;
    private HashMap<String, DataTable> zzYwo = new LinkedHashMap();
    private HashMap<String, String> zzWR8 = new HashMap<>();

    public DataTableCollection(DataSet dataSet) {
        this.zzZQ8 = dataSet;
    }

    public void add(DataTable dataTable) {
        this.zzYwo.put(dataTable.getTableName(), dataTable);
        this.zzWR8.put(dataTable.getTableName().toLowerCase(), dataTable.getTableName());
        dataTable.zzW(this.zzZQ8);
        dataTable.setEnforceConstraints(this.zzZQ8.getEnforceConstraints());
    }

    public boolean contains(String str) {
        return get(str) != null;
    }

    public DataTable get(String str) {
        DataTable dataTable = this.zzYwo.get(str);
        return (dataTable != null || str == null) ? dataTable : this.zzYwo.get(this.zzWR8.get(str.toLowerCase()));
    }

    public int getCount() {
        return this.zzYwo.size();
    }

    @Override // java.lang.Iterable
    public Iterator<DataTable> iterator() {
        return this.zzYwo.values().iterator();
    }

    public DataTable get(String str, String str2) {
        return get(str);
    }

    public DataTable get(int i) {
        Iterator<Map.Entry<String, DataTable>> it = this.zzYwo.entrySet().iterator();
        while (i >= 0 && it.hasNext()) {
            Map.Entry<String, DataTable> next = it.next();
            if (i == 0) {
                return next.getValue();
            }
            i--;
        }
        throw new IndexOutOfBoundsException(C21532OooOOo.OooO0OO(i, "There is no table at index "));
    }

    public DataTable add(String str) {
        DataTable dataTable = new DataTable(str);
        add(dataTable);
        return dataTable;
    }
}

package com.aspose.words.net.System.Data;

import com.aspose.words.internal.zzZHV;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public class DataRelationCollection implements Iterable<DataRelation> {
    private ArrayList<DataRelation> zzZm = new ArrayList<>();

    public void add(DataRelation dataRelation) {
        if (this.zzZm.contains(dataRelation)) {
            return;
        }
        this.zzZm.add(dataRelation);
        try {
            dataRelation.zzXQq();
        } catch (Exception e) {
            zzZHV.zzZ(e);
        }
    }

    public void clear() {
        this.zzZm.clear();
    }

    public boolean contains(DataRelation dataRelation) {
        return this.zzZm.contains(dataRelation);
    }

    public DataRelation get(String str) {
        if (str != null && !"".equals(str)) {
            for (DataRelation dataRelation : this.zzZm) {
                if (str.equals(dataRelation.getRelationName())) {
                    return dataRelation;
                }
            }
        }
        return null;
    }

    public int getCount() {
        return this.zzZm.size();
    }

    public int indexOf(DataRelation dataRelation) {
        return this.zzZm.indexOf(dataRelation);
    }

    @Override // java.lang.Iterable
    public Iterator<DataRelation> iterator() {
        return this.zzZm.iterator();
    }

    public void removeAt(int i) {
        this.zzZm.remove(i);
    }

    public DataRelation get(int i) {
        return this.zzZm.get(i);
    }

    public void add(DataTable dataTable, DataTable dataTable2, String str, String str2) {
        add(dataTable, dataTable2, new String[]{str}, new String[]{str2});
    }

    public void add(DataTable dataTable, DataTable dataTable2, String[] strArr, String[] strArr2) {
        add(new DataRelation(dataTable.getTableName() + dataTable2.getTableName(), dataTable, dataTable2, strArr, strArr2));
    }

    public void add(String str, DataColumn dataColumn, DataColumn dataColumn2, boolean z) {
        add(new DataRelation(str, dataColumn, dataColumn2, z));
    }

    public void add(DataColumn dataColumn, DataColumn dataColumn2) {
        add(new DataRelation(null, dataColumn, dataColumn2));
    }

    public void add(String str, DataColumn dataColumn, DataColumn dataColumn2) {
        add(new DataRelation(str, dataColumn, dataColumn2));
    }
}

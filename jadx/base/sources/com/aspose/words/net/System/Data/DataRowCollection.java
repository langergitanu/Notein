package com.aspose.words.net.System.Data;

import Oooo0oO.C21023OooO0Oo;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public class DataRowCollection implements Iterable<DataRow> {
    private final DataTable zzY61;
    private final ArrayList<DataRow> zzZEU = new ArrayList<>();

    public DataRowCollection(DataTable dataTable) {
        this.zzY61 = dataTable;
    }

    public void add(DataRow dataRow) throws ConstraintException, InvalidConstraintException {
        zzW.zzZ(this.zzY61, this.zzZEU, dataRow);
    }

    public void clear() {
        this.zzZEU.clear();
    }

    public DataRow find(String str) {
        return find(new Object[]{str});
    }

    public DataRow get(int i) {
        return this.zzZEU.get(i);
    }

    public int getCount() {
        return this.zzZEU.size();
    }

    public void insertAt(DataRow dataRow, int i) throws ConstraintException, InvalidConstraintException {
        zzW.zzZ(this.zzY61, this.zzZEU, dataRow, i);
    }

    @Override // java.lang.Iterable
    public Iterator<DataRow> iterator() {
        return this.zzZEU.iterator();
    }

    public void removeAt(int i) {
        zzW.zzZ(this.zzY61, this.zzZEU, i);
    }

    public void add(Object... objArr) throws Throwable {
        if (objArr.length != this.zzY61.getColumnsCount()) {
            throw new IndexOutOfBoundsException("Table '" + this.zzY61.getTableName() + "': values length (" + objArr.length + ") should be equal to the DataTable columns count(" + this.zzY61.getColumnsCount() + ")!");
        }
        DataRow dataRow = new DataRow(this.zzY61);
        int length = objArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            dataRow.set(i2, objArr[i]);
            i++;
            i2++;
        }
        zzW.zzZ(this.zzY61, this.zzZEU, dataRow);
    }

    public DataRow find(Object[] objArr) {
        if (this.zzY61.getPrimaryKey() != null && this.zzY61.getPrimaryKey().length == objArr.length) {
            return zzW.zzZ(this.zzY61, objArr);
        }
        StringBuilder sb = new StringBuilder("Expecting ");
        sb.append(this.zzY61.getPrimaryKey().length);
        sb.append(" value(s) for the key being indexed, but received ");
        throw new IllegalArgumentException(C21023OooO0Oo.OooO0OO(" value(s).", objArr.length, sb));
    }

    public DataRow get(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        return zzW.zzY(this.zzY61, objArr);
    }
}

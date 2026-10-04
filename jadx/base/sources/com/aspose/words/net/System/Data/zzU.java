package com.aspose.words.net.System.Data;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzU {
    private final int[] zzWQK;
    private final DataColumn[] zzWQL;
    private final DataTable zzY61;

    public zzU(DataTable dataTable, DataColumn[] dataColumnArr) {
        this.zzY61 = dataTable;
        this.zzWQL = dataColumnArr;
        this.zzWQK = new int[dataColumnArr.length];
        for (int i = 0; i < this.zzWQL.length; i++) {
            this.zzWQK[i] = this.zzY61.getColumns().indexOf(this.zzWQL[i]);
        }
    }

    public final DataColumn[] getColumns() {
        return this.zzWQL;
    }

    public final DataTable getTable() {
        return this.zzY61;
    }

    public boolean hasValue(int i) {
        return false;
    }

    public abstract DataRow[] zzO(Object[] objArr);

    public Map<String, Object> zzV(DataRow dataRow) {
        return Collections.EMPTY_MAP;
    }

    public final int[] zzXQ3() {
        return this.zzWQK;
    }

    public boolean zzXQ4() {
        return false;
    }

    public abstract void zzXQ5();

    public List<Integer> zzhc(int i) {
        return Collections.EMPTY_LIST;
    }

    public int zzhd(int i) {
        return 0;
    }
}

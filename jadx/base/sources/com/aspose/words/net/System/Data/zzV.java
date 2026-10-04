package com.aspose.words.net.System.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzV extends zzU {
    private final Map<Integer, List<Integer>> zzWQM;
    private boolean zzWQN;

    public zzV(DataTable dataTable, DataColumn[] dataColumnArr) {
        super(dataTable, dataColumnArr);
        if (dataTable == null) {
            throw new IllegalArgumentException("Table");
        }
        if (dataColumnArr == null || dataColumnArr.length == 0) {
            throw new IllegalArgumentException("Columns");
        }
        this.zzWQM = new HashMap();
    }

    private void drop() {
        this.zzWQM.clear();
    }

    private static int zzN(Object[] objArr) {
        int iHashCode = 1;
        for (Object obj : objArr) {
            if (obj != null) {
                iHashCode = obj.hashCode() + (iHashCode * 31);
            }
        }
        return iHashCode;
    }

    public static int zzZ(DataColumn[] dataColumnArr, DataRow dataRow) {
        if (dataColumnArr == null || dataColumnArr.length == 0) {
            return -1;
        }
        DataTable table = dataColumnArr[0].getTable();
        int[] iArr = new int[dataColumnArr.length];
        for (int i = 0; i < dataColumnArr.length; i++) {
            iArr[i] = table.getColumns().indexOf(dataColumnArr[i]);
        }
        return zzZ(iArr, dataRow);
    }

    @Override // com.aspose.words.net.System.Data.zzU
    public final boolean hasValue(int i) {
        return this.zzWQM.containsKey(Integer.valueOf(i));
    }

    @Override // com.aspose.words.net.System.Data.zzU
    public final DataRow[] zzO(Object[] objArr) {
        List<Integer> listZzhc = zzhc(zzN(objArr));
        if (listZzhc == null || listZzhc.isEmpty()) {
            return new DataRow[0];
        }
        DataRow[] dataRowArr = new DataRow[listZzhc.size()];
        for (int i = 0; i < listZzhc.size(); i++) {
            dataRowArr[i] = getTable().getRows().get(listZzhc.get(i).intValue());
        }
        return dataRowArr;
    }

    @Override // com.aspose.words.net.System.Data.zzU
    public final Map<String, Object> zzV(DataRow dataRow) {
        if (!this.zzWQM.containsKey(Integer.valueOf(zzZ(zzXQ3(), dataRow)))) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap();
        for (int i = 0; i < getColumns().length; i++) {
            map.put(getColumns()[i].getColumnName(), dataRow.get(zzXQ3()[i]));
        }
        return map;
    }

    @Override // com.aspose.words.net.System.Data.zzU
    public final boolean zzXQ4() {
        return this.zzWQN;
    }

    @Override // com.aspose.words.net.System.Data.zzU
    public final void zzXQ5() {
        drop();
        for (DataRow dataRow : getTable().getRows()) {
            int iZzZ = zzZ(zzXQ3(), dataRow);
            List<Integer> list = this.zzWQM.get(Integer.valueOf(iZzZ));
            if (list == null || list.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Integer.valueOf(dataRow.zzXQp()));
                this.zzWQM.put(Integer.valueOf(iZzZ), arrayList);
            } else {
                this.zzWQN = true;
                list.add(Integer.valueOf(dataRow.zzXQp()));
            }
        }
    }

    @Override // com.aspose.words.net.System.Data.zzU
    public final List<Integer> zzhc(int i) {
        List<Integer> list = this.zzWQM.get(Integer.valueOf(i));
        return (list == null || list.isEmpty()) ? Collections.EMPTY_LIST : list;
    }

    @Override // com.aspose.words.net.System.Data.zzU
    public final int zzhd(int i) {
        List<Integer> listZzhc = zzhc(i);
        if (listZzhc.isEmpty()) {
            return -1;
        }
        return listZzhc.get(0).intValue();
    }

    private static int zzZ(int[] iArr, DataRow dataRow) {
        Object[] objArr = new Object[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            objArr[i] = dataRow.get(iArr[i]);
        }
        return zzN(objArr);
    }
}

package com.aspose.words.net.System.Data;

import com.huawei.hms.network.embedded.C18115b5;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzT implements Iterable<zzU> {
    private final Map<String, zzU> zzWQJ = new HashMap();
    private final DataTable zzY61;

    public zzT(DataTable dataTable) {
        this.zzY61 = dataTable;
    }

    private zzU zzU(DataColumn[] dataColumnArr) {
        return new zzV(this.zzY61, dataColumnArr);
    }

    private static String zzV(DataColumn[] dataColumnArr) {
        if (dataColumnArr == null || dataColumnArr.length == 0) {
            throw new IllegalArgumentException("Columns can't be empty.");
        }
        StringBuilder sb = new StringBuilder("Index");
        for (DataColumn dataColumn : dataColumnArr) {
            sb.append(C18115b5.CONNECTOR);
            sb.append(dataColumn.getColumnName());
        }
        return sb.toString();
    }

    private zzU zzZ(String str, DataColumn[] dataColumnArr) {
        zzU zzu = this.zzWQJ.get(str);
        if (zzu != null) {
            return zzu;
        }
        zzU zzU = zzU(dataColumnArr);
        this.zzWQJ.put(str, zzU);
        zzU.zzXQ5();
        return zzU;
    }

    @Override // java.lang.Iterable
    public final Iterator<zzU> iterator() {
        return this.zzWQJ.values().iterator();
    }

    public final zzU zzW(DataColumn[] dataColumnArr) {
        String strZzV = zzV(dataColumnArr);
        zzU zzu = this.zzWQJ.get(strZzV);
        return zzu == null ? zzZ(strZzV, dataColumnArr) : zzu;
    }

    public final zzU zzX(DataColumn[] dataColumnArr) {
        return zzZ(zzV(dataColumnArr), dataColumnArr);
    }

    public final void zzXQ2() {
        Iterator<Map.Entry<String, zzU>> it = this.zzWQJ.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().zzXQ5();
        }
    }
}

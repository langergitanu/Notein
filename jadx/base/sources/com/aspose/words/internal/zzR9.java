package com.aspose.words.internal;

import com.aspose.words.net.System.Data.DataColumn;
import com.aspose.words.net.System.Data.DataRelation;
import com.aspose.words.net.System.Data.DataTable;

/* JADX INFO: loaded from: classes5.dex */
final class zzR9 {
    private zzYU zzMA;
    private boolean zzMu;
    private Class zzMv;
    private Object zzMw;
    private int zzMx;
    private String zzMy;
    private DataTable zzMz;
    private Object zzVZ;

    private zzR9(zzYU zzyu, DataTable dataTable, String str) {
        this.zzMA = zzyu;
        this.zzMz = dataTable;
        this.zzMy = str;
    }

    private void zzQP() {
        DataColumn dataColumn = this.zzMz.getColumns().get(this.zzMy);
        if (dataColumn != null) {
            this.zzMw = dataColumn;
            this.zzMx = 7;
            this.zzMv = dataColumn.getDataType();
            if (dataColumn.getAllowDBNull() && zzRH.zzT(this.zzMv)) {
                this.zzMx = 8;
                this.zzMv = zzRH.zzS(this.zzMv);
            }
        }
    }

    private zzRA zzQQ() {
        zzQP();
        if (this.zzMz.getDataSet() != null) {
            if (zzZKN.zzW(this.zzMz.getDataSet().getDataSetName(), "_320fb408a82d4bb28501c84241f52bab", zzZOF.ORDINAL$4894b8c8)) {
                zzYr(1);
                if (this.zzMx == 0 && !this.zzMu) {
                    zzYr(2);
                }
            } else {
                zzYr(0);
            }
        }
        int i = this.zzMx;
        return new zzRA((i == 0 || this.zzMu) ? null : new zzAD(this.zzMA, this.zzMw, i, this.zzVZ, this.zzMv), this.zzMu);
    }

    private void zzYr(int i) {
        for (DataRelation dataRelation : this.zzMz.getDataSet().getRelations()) {
            DataTable dataTable = null;
            for (int i2 = 0; i2 <= 3; i2++) {
                DataTable dataTableZzZ = zzZ(dataRelation, i, i2);
                if (dataTableZzZ != null && dataTable != null) {
                    this.zzMu = true;
                    return;
                } else {
                    if (dataTableZzZ != null) {
                        dataTable = dataTableZzZ;
                    }
                }
            }
            if (dataTable != null) {
                if (this.zzMx != 0) {
                    this.zzMu = true;
                    return;
                }
                this.zzMw = dataRelation;
                this.zzMx = 9;
                this.zzVZ = dataTable;
                this.zzMv = zzZZM.class;
            }
        }
    }

    public static zzRA zzZ(zzYU zzyu, DataTable dataTable, String str) {
        return new zzR9(zzyu, dataTable, str).zzQQ();
    }

    private boolean zzi(String str) {
        return !zzZKN.zzW(str, "_320fb408a82d4bb28501c84241f52bab", zzZOF.ORDINAL$4894b8c8) ? zzZYD.zzi(str, this.zzMy) : str.length() == this.zzMy.length() + zzR6.zzMr && zzZKN.zzS(str, this.zzMy, zzZOF.CURRENT_CULTURE_IGNORE_CASE$4894b8c8);
    }

    private DataTable zzZ(DataRelation dataRelation, int i, int i2) {
        String relationName;
        boolean z = false;
        if (i2 != 0) {
            if (i2 == 1) {
                relationName = dataRelation.getRelationName();
            } else if (i2 == 2) {
                relationName = dataRelation.getChildTable().getTableName();
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException();
                }
                relationName = dataRelation.getParentTable().getTableName();
            }
            z = true;
        } else {
            relationName = dataRelation.getRelationName();
        }
        if (z && i == 1) {
            return null;
        }
        if (!z && i == 2) {
            return null;
        }
        if ((z ? dataRelation.getChildTable() : dataRelation.getParentTable()) == this.zzMz && zzi(relationName)) {
            return z ? dataRelation.getParentTable() : dataRelation.getChildTable();
        }
        return null;
    }
}

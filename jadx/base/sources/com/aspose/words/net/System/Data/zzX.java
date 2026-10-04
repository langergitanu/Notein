package com.aspose.words.net.System.Data;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes5.dex */
final class zzX implements DataTableEventListener {
    private WeakReference<DataTableReader> zzWQT;
    private boolean zzWQU = false;
    private DataTable zzWR2;

    public zzX(DataTableReader dataTableReader) {
        this.zzWR2 = null;
        if (dataTableReader == null) {
            throw new IllegalArgumentException("DataTableReader cannot be null");
        }
        this.zzWQT = new WeakReference<>(dataTableReader);
        DataTable dataTableZzXQc = dataTableReader.zzXQc();
        this.zzWR2 = dataTableZzXQc;
        if (dataTableZzXQc != null) {
            zzXQ7();
        }
    }

    private void zzW(DataRow dataRow) {
        DataTableReader dataTableReader = this.zzWQT.get();
        if (dataTableReader == null) {
            zzXQa();
            return;
        }
        dataTableReader.zzX(dataRow);
        if (dataTableReader.zzXQc().getRows().getCount() == 0) {
            dataTableReader.zzXQd();
        }
    }

    private void zzXQ7() {
        DataTable dataTable = this.zzWR2;
        if (dataTable == null || this.zzWQU) {
            return;
        }
        dataTable.addEventListener(this);
        this.zzWQU = true;
    }

    private void zzXQ9() {
        DataTableReader dataTableReader = this.zzWQT.get();
        if (dataTableReader != null) {
            dataTableReader.zzXQe();
        } else {
            zzXQa();
        }
    }

    private void zzXQa() {
        DataTable dataTable = this.zzWR2;
        if (dataTable != null && this.zzWQU) {
            dataTable.removeEventListener(this);
            this.zzWQU = false;
        }
    }

    private void zzXQb() {
        DataTableReader dataTableReader = this.zzWQT.get();
        if (dataTableReader != null) {
            dataTableReader.zzXQf();
        } else {
            zzXQa();
        }
    }

    @Override // com.aspose.words.net.System.Data.DataTableEventListener
    public final void onDataColumnDeleted(DataColumn dataColumn) {
        zzXQ9();
    }

    @Override // com.aspose.words.net.System.Data.DataTableEventListener
    public final void onDataColumnInserted(DataColumn dataColumn) {
        zzXQ9();
    }

    @Override // com.aspose.words.net.System.Data.DataTableEventListener
    public final void onDataRowChanged(DataRow dataRow) {
    }

    @Override // com.aspose.words.net.System.Data.DataTableEventListener
    public final void onDataRowDeleted(DataRow dataRow) {
        zzW(dataRow);
    }

    @Override // com.aspose.words.net.System.Data.DataTableEventListener
    public final void onDataRowInserted(DataRow dataRow) {
        zzXQb();
    }

    public final void zzT(DataTable dataTable) {
        if (dataTable == null) {
            throw new IllegalArgumentException("DataTable cannot be null");
        }
        zzXQa();
        this.zzWR2 = dataTable;
        zzXQ7();
    }

    public final void zzXQ8() {
        zzXQa();
    }
}

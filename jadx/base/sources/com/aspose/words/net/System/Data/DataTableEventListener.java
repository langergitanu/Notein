package com.aspose.words.net.System.Data;

/* JADX INFO: loaded from: classes5.dex */
public interface DataTableEventListener {
    void onDataColumnDeleted(DataColumn dataColumn);

    void onDataColumnInserted(DataColumn dataColumn);

    void onDataRowChanged(DataRow dataRow);

    void onDataRowDeleted(DataRow dataRow);

    void onDataRowInserted(DataRow dataRow);
}

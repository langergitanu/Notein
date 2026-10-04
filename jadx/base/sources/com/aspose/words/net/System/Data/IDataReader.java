package com.aspose.words.net.System.Data;

/* JADX INFO: loaded from: classes5.dex */
public interface IDataReader extends IDataRecord {
    void close();

    int getDepth();

    int getRecordsAffected();

    DataTable getSchemaTable();

    boolean isClosed();

    boolean nextResult();

    boolean read();
}

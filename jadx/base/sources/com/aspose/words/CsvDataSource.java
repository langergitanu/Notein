package com.aspose.words;

import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
public class CsvDataSource implements zzZCV {
    private com.aspose.words.internal.zzRY zzZk6;

    public CsvDataSource(String str) throws Exception {
        com.aspose.words.internal.zzZ4.zzU(str, "csvPath");
        this.zzZk6 = new com.aspose.words.internal.zzRY(str, CsvDataLoadOptions.zzZk7);
    }

    @Override // com.aspose.words.zzZCV
    @ReservedForInternalUse
    @Deprecated
    public com.aspose.words.internal.zzH8 toCore() {
        return this.zzZk6;
    }

    public CsvDataSource(String str, CsvDataLoadOptions csvDataLoadOptions) throws Exception {
        com.aspose.words.internal.zzZ4.zzU(str, "csvPath");
        com.aspose.words.internal.zzZ4.zzY((Object) csvDataLoadOptions, "options");
        this.zzZk6 = new com.aspose.words.internal.zzRY(str, csvDataLoadOptions.zzZTM());
    }

    private CsvDataSource(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        com.aspose.words.internal.zzZ4.zzY((Object) zzzop, "csvStream");
        this.zzZk6 = new com.aspose.words.internal.zzRY(zzzop, CsvDataLoadOptions.zzZk7);
    }

    public CsvDataSource(InputStream inputStream) throws Exception {
        this(com.aspose.words.internal.zzZOP.zzY(inputStream));
    }

    private CsvDataSource(com.aspose.words.internal.zzZOP zzzop, CsvDataLoadOptions csvDataLoadOptions) throws Exception {
        com.aspose.words.internal.zzZ4.zzY((Object) zzzop, "csvStream");
        com.aspose.words.internal.zzZ4.zzY((Object) csvDataLoadOptions, "options");
        this.zzZk6 = new com.aspose.words.internal.zzRY(zzzop, csvDataLoadOptions.zzZTM());
    }

    public CsvDataSource(InputStream inputStream, CsvDataLoadOptions csvDataLoadOptions) throws Exception {
        this(com.aspose.words.internal.zzZOP.zzY(inputStream), csvDataLoadOptions);
    }
}

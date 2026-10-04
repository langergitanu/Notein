package com.aspose.words;

import com.aspose.words.ref.Ref;

/* JADX INFO: loaded from: classes6.dex */
public interface IMailMergeDataSource {
    IMailMergeDataSource getChildDataSource(String str) throws Exception;

    String getTableName() throws Exception;

    boolean getValue(String str, Ref<Object> ref) throws Exception;

    boolean moveNext() throws Exception;
}

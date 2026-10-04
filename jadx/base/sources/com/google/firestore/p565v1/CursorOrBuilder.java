package com.google.firestore.p565v1;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface CursorOrBuilder extends MessageLiteOrBuilder {
    boolean getBefore();

    Value getValues(int i);

    int getValuesCount();

    List<Value> getValuesList();
}

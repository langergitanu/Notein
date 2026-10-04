package com.google.internal.firebase.inappmessaging.p566v1.sdkserving;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface ClientAppInfoOrBuilder extends MessageLiteOrBuilder {
    String getAppInstanceId();

    ByteString getAppInstanceIdBytes();

    String getAppInstanceIdToken();

    ByteString getAppInstanceIdTokenBytes();

    String getGmpAppId();

    ByteString getGmpAppIdBytes();
}

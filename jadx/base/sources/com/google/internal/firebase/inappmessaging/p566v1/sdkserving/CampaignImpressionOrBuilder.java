package com.google.internal.firebase.inappmessaging.p566v1.sdkserving;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes8.dex */
public interface CampaignImpressionOrBuilder extends MessageLiteOrBuilder {
    String getCampaignId();

    ByteString getCampaignIdBytes();

    long getImpressionTimestampMillis();
}

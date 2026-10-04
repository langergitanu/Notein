package com.google.internal.firebase.inappmessaging.p566v1.sdkserving;

import com.google.internal.firebase.inappmessaging.p566v1.CampaignProto;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface FetchEligibleCampaignsResponseOrBuilder extends MessageLiteOrBuilder {
    long getExpirationEpochTimestampMillis();

    CampaignProto.ThickContent getMessages(int i);

    int getMessagesCount();

    List<CampaignProto.ThickContent> getMessagesList();
}

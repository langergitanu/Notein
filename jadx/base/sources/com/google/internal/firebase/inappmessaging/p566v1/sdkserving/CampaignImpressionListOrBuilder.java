package com.google.internal.firebase.inappmessaging.p566v1.sdkserving;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface CampaignImpressionListOrBuilder extends MessageLiteOrBuilder {
    CampaignImpression getAlreadySeenCampaigns(int i);

    int getAlreadySeenCampaignsCount();

    List<CampaignImpression> getAlreadySeenCampaignsList();
}

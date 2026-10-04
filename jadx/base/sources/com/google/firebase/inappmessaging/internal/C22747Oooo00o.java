package com.google.firebase.inappmessaging.internal;

import com.google.internal.firebase.inappmessaging.p566v1.CampaignProto;
import java.util.Comparator;

/* JADX INFO: renamed from: com.google.firebase.inappmessaging.internal.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C22747Oooo00o implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return InAppMessageStreamManager.compareByPriority((CampaignProto.ThickContent) obj, (CampaignProto.ThickContent) obj2);
    }
}

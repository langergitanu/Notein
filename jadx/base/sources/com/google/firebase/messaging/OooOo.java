package com.google.firebase.messaging;

import com.google.android.datatransport.Transformer;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
import com.oplus.ocs.base.common.api.OnConnectionSucceedListener;
import com.orion.notein.MainActivity;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class OooOo implements Transformer, OnConnectionSucceedListener {
    @Override // com.google.android.datatransport.Transformer
    public Object apply(Object obj) {
        return ((MessagingClientEventExtension) obj).toByteArray();
    }

    @Override // com.oplus.ocs.base.common.api.OnConnectionSucceedListener
    public void onConnectionSucceed() {
        MainActivity.initOppoOCS$lambda$0();
    }
}

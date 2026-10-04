package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.ar */
/* JADX INFO: loaded from: classes7.dex */
final class ResultReceiverC16299ar extends ResultReceiver {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ BinderC16300as f51439a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResultReceiverC16299ar(BinderC16300as binderC16300as, Handler handler) {
        super(handler);
        this.f51439a = binderC16300as;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        if (i == 1) {
            this.f51439a.f51440a.trySetResult(3);
        } else if (i == 2) {
            this.f51439a.f51440a.trySetResult(2);
        } else {
            if (i != 3) {
                return;
            }
            this.f51439a.f51440a.trySetResult(1);
        }
    }
}

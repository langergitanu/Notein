package com.oplus.ocs.base.common.api;

import android.os.Looper;
import android.os.Message;
import com.oplus.ocs.base.common.ConnectionResult;
import com.oplus.ocs.base.common.HandlerC18820a;
import com.oplus.ocs.base.utils.C18861a;

/* JADX INFO: renamed from: com.oplus.ocs.base.common.api.d */
/* JADX INFO: loaded from: classes9.dex */
class HandlerC18827d extends HandlerC18820a {

    /* JADX INFO: renamed from: a */
    OnConnectionSucceedListener f57501a;

    /* JADX INFO: renamed from: b */
    OnConnectionFailedListener f57502b;

    /* JADX INFO: renamed from: c */
    private final String f57503c;

    /* JADX INFO: renamed from: d */
    private HandlerC18826c f57504d;

    public HandlerC18827d(Looper looper, HandlerC18826c handlerC18826c) {
        super(looper);
        this.f57503c = "d";
        this.f57504d = handlerC18826c;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i = message.what;
        C18861a.m80545a(this.f57503c, "business handler what ".concat(String.valueOf(i)));
        if (i == 100) {
            OnConnectionSucceedListener onConnectionSucceedListener = this.f57501a;
            if (onConnectionSucceedListener != null) {
                onConnectionSucceedListener.onConnectionSucceed();
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 5;
            this.f57504d.sendMessage(messageObtain);
            return;
        }
        if (i != 101) {
            return;
        }
        int i2 = message.arg1;
        OnConnectionFailedListener onConnectionFailedListener = this.f57502b;
        if (onConnectionFailedListener != null) {
            onConnectionFailedListener.onConnectionFailed(new ConnectionResult(i2));
            return;
        }
        Message messageObtain2 = Message.obtain();
        messageObtain2.what = 5;
        this.f57504d.sendMessage(messageObtain2);
    }
}

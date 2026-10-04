package com.oplus.ocs.base.common.api;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.oplus.ocs.base.common.CapabilityInfo;
import com.oplus.ocs.base.common.HandlerC18820a;
import com.oplus.ocs.base.utils.C18861a;

/* JADX INFO: renamed from: com.oplus.ocs.base.common.api.c */
/* JADX INFO: loaded from: classes9.dex */
class HandlerC18826c extends HandlerC18820a {

    /* JADX INFO: renamed from: a */
    static volatile int f57498a;

    /* JADX INFO: renamed from: b */
    private final String f57499b;

    /* JADX INFO: renamed from: c */
    private BaseClient f57500c;

    private HandlerC18826c(Looper looper, BaseClient baseClient) {
        super(looper);
        this.f57499b = "c";
        this.f57500c = baseClient;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized HandlerC18826c m80496a(BaseClient baseClient) {
        StringBuilder sb = new StringBuilder("base_client_");
        int i = f57498a;
        f57498a = i + 1;
        sb.append(i);
        HandlerThread handlerThread = new HandlerThread(sb.toString());
        handlerThread.start();
        if (handlerThread.getLooper() != null) {
            return new HandlerC18826c(handlerThread.getLooper(), baseClient);
        }
        return new HandlerC18826c(Looper.getMainLooper(), baseClient);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i = message.what;
        C18861a.m80545a(this.f57499b, "base client handler what ".concat(String.valueOf(i)));
        if (i == 1) {
            BaseClient baseClient = this.f57500c;
            CapabilityInfo capabilityInfo = (CapabilityInfo) message.obj;
            String str = BaseClient.f57452a;
            C18861a.m80546b(str, "onAuthenticateSucceed");
            baseClient.f57453b = 1;
            baseClient.f57454c = capabilityInfo;
            InterfaceC18832i interfaceC18832i = baseClient.f57457f;
            if (interfaceC18832i != null) {
                interfaceC18832i.mo80476a(capabilityInfo);
            }
            C18861a.m80545a(str, "handleAuthenticateSuccess");
            if (baseClient.f57458g == null) {
                baseClient.m80474a((Handler) null);
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 100;
            baseClient.f57458g.sendMessage(messageObtain);
            baseClient.disconnect();
            return;
        }
        if (i != 2) {
            if (i == 3) {
                this.f57500c.f57459h.mo80492d();
                return;
            }
            if (i != 5) {
                return;
            }
            BaseClient baseClient2 = this.f57500c;
            while (baseClient2.f57455d.size() > 0) {
                C18861a.m80545a(BaseClient.f57452a, "handleQue");
                baseClient2.m80475a(baseClient2.f57455d.poll());
            }
            C18861a.m80545a(BaseClient.f57452a, "task queue is end");
            return;
        }
        BaseClient baseClient3 = this.f57500c;
        int i2 = message.arg1;
        baseClient3.f57453b = 4;
        baseClient3.disconnect();
        CapabilityInfo capabilityInfoM80472b = BaseClient.m80472b(i2);
        baseClient3.f57454c = capabilityInfoM80472b;
        InterfaceC18832i interfaceC18832i2 = baseClient3.f57457f;
        if (interfaceC18832i2 != null) {
            interfaceC18832i2.mo80476a(capabilityInfoM80472b);
        }
        C18861a.m80545a(BaseClient.f57452a, "connect failed , error code is ".concat(String.valueOf(i2)));
        baseClient3.m80473a(i2);
        InterfaceC18833j interfaceC18833j = baseClient3.f57456e;
        if (interfaceC18833j != null) {
            interfaceC18833j.mo80506a();
        }
    }
}

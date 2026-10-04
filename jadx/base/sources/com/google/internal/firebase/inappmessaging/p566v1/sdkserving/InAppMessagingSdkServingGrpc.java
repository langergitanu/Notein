package com.google.internal.firebase.inappmessaging.p566v1.sdkserving;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.ExtensionRegistryLite;
import io.grpc.stub.AbstractC23924OooO0Oo;
import io.grpc.stub.C23925OooO0o0;
import io.grpc.stub.C23930OooO0oo;
import io.grpc.stub.OooO;
import io.grpc.stub.OooO00o;
import io.grpc.stub.OooO0O0;
import oO000Ooo.C32080OooO0O0;
import oO0OOo0o.AbstractC33060OooO0Oo;
import oO0OOo0o.C33101OoooOO0;
import oO0OOo0o.C33115Ooooooo;
import oO0OOo0o.OooO0OO;
import oO0OOo0o.o0OoOo0;

/* JADX INFO: loaded from: classes8.dex */
public final class InAppMessagingSdkServingGrpc {
    private static final int METHODID_FETCH_ELIGIBLE_CAMPAIGNS = 0;
    public static final String SERVICE_NAME = "google.internal.firebase.inappmessaging.v1.sdkserving.InAppMessagingSdkServing";
    private static volatile C33101OoooOO0<FetchEligibleCampaignsRequest, FetchEligibleCampaignsResponse> getFetchEligibleCampaignsMethod;
    private static volatile o0OoOo0 serviceDescriptor;

    public interface AsyncService {
        default void fetchEligibleCampaigns(FetchEligibleCampaignsRequest fetchEligibleCampaignsRequest, OooO<FetchEligibleCampaignsResponse> oooO) {
            C23930OooO0oo.OooO00o(InAppMessagingSdkServingGrpc.getFetchEligibleCampaignsMethod(), oooO);
        }
    }

    public static final class InAppMessagingSdkServingBlockingStub extends OooO0O0<InAppMessagingSdkServingBlockingStub> {
        public FetchEligibleCampaignsResponse fetchEligibleCampaigns(FetchEligibleCampaignsRequest fetchEligibleCampaignsRequest) {
            return (FetchEligibleCampaignsResponse) C23925OooO0o0.OooO0Oo(getChannel(), InAppMessagingSdkServingGrpc.getFetchEligibleCampaignsMethod(), getCallOptions(), fetchEligibleCampaignsRequest);
        }

        private InAppMessagingSdkServingBlockingStub(AbstractC33060OooO0Oo abstractC33060OooO0Oo, OooO0OO oooO0OO) {
            super(abstractC33060OooO0Oo, oooO0OO);
        }

        @Override // io.grpc.stub.AbstractC23924OooO0Oo
        public InAppMessagingSdkServingBlockingStub build(AbstractC33060OooO0Oo abstractC33060OooO0Oo, OooO0OO oooO0OO) {
            return new InAppMessagingSdkServingBlockingStub(abstractC33060OooO0Oo, oooO0OO);
        }
    }

    public static final class InAppMessagingSdkServingFutureStub extends io.grpc.stub.OooO0OO<InAppMessagingSdkServingFutureStub> {
        public ListenableFuture<FetchEligibleCampaignsResponse> fetchEligibleCampaigns(FetchEligibleCampaignsRequest fetchEligibleCampaignsRequest) {
            return C23925OooO0o0.OooO0o(getChannel().OooO0oO(InAppMessagingSdkServingGrpc.getFetchEligibleCampaignsMethod(), getCallOptions()), fetchEligibleCampaignsRequest);
        }

        private InAppMessagingSdkServingFutureStub(AbstractC33060OooO0Oo abstractC33060OooO0Oo, OooO0OO oooO0OO) {
            super(abstractC33060OooO0Oo, oooO0OO);
        }

        @Override // io.grpc.stub.AbstractC23924OooO0Oo
        public InAppMessagingSdkServingFutureStub build(AbstractC33060OooO0Oo abstractC33060OooO0Oo, OooO0OO oooO0OO) {
            return new InAppMessagingSdkServingFutureStub(abstractC33060OooO0Oo, oooO0OO);
        }
    }

    public static abstract class InAppMessagingSdkServingImplBase implements AsyncService {
        public final C33115Ooooooo bindService() {
            return InAppMessagingSdkServingGrpc.bindService(this);
        }
    }

    public static final class InAppMessagingSdkServingStub extends OooO00o<InAppMessagingSdkServingStub> {
        public void fetchEligibleCampaigns(FetchEligibleCampaignsRequest fetchEligibleCampaignsRequest, OooO<FetchEligibleCampaignsResponse> oooO) {
            C23925OooO0o0.OooO00o(getChannel().OooO0oO(InAppMessagingSdkServingGrpc.getFetchEligibleCampaignsMethod(), getCallOptions()), fetchEligibleCampaignsRequest, oooO);
        }

        private InAppMessagingSdkServingStub(AbstractC33060OooO0Oo abstractC33060OooO0Oo, OooO0OO oooO0OO) {
            super(abstractC33060OooO0Oo, oooO0OO);
        }

        @Override // io.grpc.stub.AbstractC23924OooO0Oo
        public InAppMessagingSdkServingStub build(AbstractC33060OooO0Oo abstractC33060OooO0Oo, OooO0OO oooO0OO) {
            return new InAppMessagingSdkServingStub(abstractC33060OooO0Oo, oooO0OO);
        }
    }

    private InAppMessagingSdkServingGrpc() {
    }

    public static final C33115Ooooooo bindService(AsyncService asyncService) {
        C33115Ooooooo.OooO00o oooO00o = new C33115Ooooooo.OooO00o(getServiceDescriptor());
        C33101OoooOO0<FetchEligibleCampaignsRequest, FetchEligibleCampaignsResponse> fetchEligibleCampaignsMethod = getFetchEligibleCampaignsMethod();
        new MethodHandlers(asyncService, 0);
        oooO00o.OooO00o(fetchEligibleCampaignsMethod, new C23930OooO0oo.OooO0OO());
        return oooO00o.OooO0O0();
    }

    public static C33101OoooOO0<FetchEligibleCampaignsRequest, FetchEligibleCampaignsResponse> getFetchEligibleCampaignsMethod() {
        C33101OoooOO0<FetchEligibleCampaignsRequest, FetchEligibleCampaignsResponse> c33101OoooOO0OooO00o;
        C33101OoooOO0<FetchEligibleCampaignsRequest, FetchEligibleCampaignsResponse> c33101OoooOO0 = getFetchEligibleCampaignsMethod;
        if (c33101OoooOO0 != null) {
            return c33101OoooOO0;
        }
        synchronized (InAppMessagingSdkServingGrpc.class) {
            try {
                c33101OoooOO0OooO00o = getFetchEligibleCampaignsMethod;
                if (c33101OoooOO0OooO00o == null) {
                    C33101OoooOO0.OooO00o oooO00oOooO0O0 = C33101OoooOO0.OooO0O0();
                    oooO00oOooO0O0.f119674OooO0OO = C33101OoooOO0.OooO0OO.f119678OooOo0o;
                    oooO00oOooO0O0.f119675OooO0Oo = C33101OoooOO0.OooO00o(SERVICE_NAME, "FetchEligibleCampaigns");
                    oooO00oOooO0O0.f119676OooO0o0 = true;
                    FetchEligibleCampaignsRequest defaultInstance = FetchEligibleCampaignsRequest.getDefaultInstance();
                    ExtensionRegistryLite extensionRegistryLite = C32080OooO0O0.f114903OooO00o;
                    oooO00oOooO0O0.f119672OooO00o = new C32080OooO0O0.OooO00o(defaultInstance);
                    oooO00oOooO0O0.f119673OooO0O0 = new C32080OooO0O0.OooO00o(FetchEligibleCampaignsResponse.getDefaultInstance());
                    c33101OoooOO0OooO00o = oooO00oOooO0O0.OooO00o();
                    getFetchEligibleCampaignsMethod = c33101OoooOO0OooO00o;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c33101OoooOO0OooO00o;
    }

    public static o0OoOo0 getServiceDescriptor() {
        o0OoOo0 o0oooo02;
        o0OoOo0 o0oooo03 = serviceDescriptor;
        if (o0oooo03 != null) {
            return o0oooo03;
        }
        synchronized (InAppMessagingSdkServingGrpc.class) {
            try {
                o0oooo02 = serviceDescriptor;
                if (o0oooo02 == null) {
                    o0OoOo0.OooO00o OooO00o2 = o0OoOo0.OooO00o(SERVICE_NAME);
                    OooO00o2.OooO00o(getFetchEligibleCampaignsMethod());
                    o0OoOo0 o0oooo04 = new o0OoOo0(OooO00o2);
                    serviceDescriptor = o0oooo04;
                    o0oooo02 = o0oooo04;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o0oooo02;
    }

    public static InAppMessagingSdkServingBlockingStub newBlockingStub(AbstractC33060OooO0Oo abstractC33060OooO0Oo) {
        return (InAppMessagingSdkServingBlockingStub) OooO0O0.newStub(new AbstractC23924OooO0Oo.OooO00o<InAppMessagingSdkServingBlockingStub>() { // from class: com.google.internal.firebase.inappmessaging.v1.sdkserving.InAppMessagingSdkServingGrpc.2
            @Override // io.grpc.stub.AbstractC23924OooO0Oo.OooO00o
            public InAppMessagingSdkServingBlockingStub newStub(AbstractC33060OooO0Oo abstractC33060OooO0Oo2, OooO0OO oooO0OO) {
                return new InAppMessagingSdkServingBlockingStub(abstractC33060OooO0Oo2, oooO0OO);
            }
        }, abstractC33060OooO0Oo);
    }

    public static InAppMessagingSdkServingFutureStub newFutureStub(AbstractC33060OooO0Oo abstractC33060OooO0Oo) {
        return (InAppMessagingSdkServingFutureStub) io.grpc.stub.OooO0OO.newStub(new AbstractC23924OooO0Oo.OooO00o<InAppMessagingSdkServingFutureStub>() { // from class: com.google.internal.firebase.inappmessaging.v1.sdkserving.InAppMessagingSdkServingGrpc.3
            @Override // io.grpc.stub.AbstractC23924OooO0Oo.OooO00o
            public InAppMessagingSdkServingFutureStub newStub(AbstractC33060OooO0Oo abstractC33060OooO0Oo2, OooO0OO oooO0OO) {
                return new InAppMessagingSdkServingFutureStub(abstractC33060OooO0Oo2, oooO0OO);
            }
        }, abstractC33060OooO0Oo);
    }

    public static InAppMessagingSdkServingStub newStub(AbstractC33060OooO0Oo abstractC33060OooO0Oo) {
        return (InAppMessagingSdkServingStub) OooO00o.newStub(new AbstractC23924OooO0Oo.OooO00o<InAppMessagingSdkServingStub>() { // from class: com.google.internal.firebase.inappmessaging.v1.sdkserving.InAppMessagingSdkServingGrpc.1
            @Override // io.grpc.stub.AbstractC23924OooO0Oo.OooO00o
            public InAppMessagingSdkServingStub newStub(AbstractC33060OooO0Oo abstractC33060OooO0Oo2, OooO0OO oooO0OO) {
                return new InAppMessagingSdkServingStub(abstractC33060OooO0Oo2, oooO0OO);
            }
        }, abstractC33060OooO0Oo);
    }

    public static final class MethodHandlers<Req, Resp> {
        private final int methodId;
        private final AsyncService serviceImpl;

        public MethodHandlers(AsyncService asyncService, int i) {
            this.serviceImpl = asyncService;
            this.methodId = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void invoke(Req req, OooO<Resp> oooO) {
            if (this.methodId != 0) {
                throw new AssertionError();
            }
            this.serviceImpl.fetchEligibleCampaigns((FetchEligibleCampaignsRequest) req, oooO);
        }

        public OooO<Req> invoke(OooO<Resp> oooO) {
            throw new AssertionError();
        }
    }
}

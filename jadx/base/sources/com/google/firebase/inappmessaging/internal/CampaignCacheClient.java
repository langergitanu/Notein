package com.google.firebase.inappmessaging.internal;

import OooOOOo.C20453OooO0oO;
import OooOOOo.C20454OooO0oo;
import android.app.Application;
import com.google.firebase.inappmessaging.internal.injection.modules.ProtoStorageClientModule;
import com.google.firebase.inappmessaging.internal.injection.qualifiers.CampaignCache;
import com.google.firebase.inappmessaging.internal.time.Clock;
import com.google.internal.firebase.inappmessaging.p566v1.sdkserving.FetchEligibleCampaignsResponse;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import oO00o0.OooO00o;
import oO00o00o.InterfaceC32329OooO00o;
import oO00o0OO.C32351OooO0o0;
import oO00o0OO.C32362OooOOo0;
import oO00o0OO.C32363OooOOoo;
import oO00o0OO.CallableC32345OooO;
import oO0OooOO.AbstractC33485OooO;
import oO0OooOO.AbstractC33487OooO0O0;

/* JADX INFO: loaded from: classes8.dex */
public class CampaignCacheClient {
    private final Application application;
    private FetchEligibleCampaignsResponse cachedResponse;
    private final Clock clock;
    private final ProtoStorageClient storageClient;

    public CampaignCacheClient(@CampaignCache ProtoStorageClient protoStorageClient, Application application, Clock clock) {
        this.storageClient = protoStorageClient;
        this.application = application;
        this.clock = clock;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isResponseValid(FetchEligibleCampaignsResponse fetchEligibleCampaignsResponse) {
        long expirationEpochTimestampMillis = fetchEligibleCampaignsResponse.getExpirationEpochTimestampMillis();
        long jNow = this.clock.now();
        File file = new File(this.application.getApplicationContext().getFilesDir(), ProtoStorageClientModule.CAMPAIGN_CACHE_FILE);
        if (expirationEpochTimestampMillis != 0) {
            return jNow < expirationEpochTimestampMillis;
        }
        if (file.exists()) {
            return jNow < TimeUnit.DAYS.toMillis(1L) + file.lastModified();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ FetchEligibleCampaignsResponse lambda$get$1() throws Exception {
        return this.cachedResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$get$2(FetchEligibleCampaignsResponse fetchEligibleCampaignsResponse) throws Exception {
        this.cachedResponse = fetchEligibleCampaignsResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$get$3(Throwable th) throws Exception {
        this.cachedResponse = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$put$0(FetchEligibleCampaignsResponse fetchEligibleCampaignsResponse) throws Exception {
        this.cachedResponse = fetchEligibleCampaignsResponse;
    }

    public AbstractC33485OooO<FetchEligibleCampaignsResponse> get() {
        CallableC32345OooO callableC32345OooO = new CallableC32345OooO(new Callable() { // from class: com.google.firebase.inappmessaging.internal.OooO0O0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f68474OooOo0o.lambda$get$1();
            }
        });
        AbstractC33485OooO abstractC33485OooO = this.storageClient.read(FetchEligibleCampaignsResponse.parser());
        OooOOOo.OooO0o oooO0o = new OooOOOo.OooO0o(this);
        abstractC33485OooO.getClass();
        OooO00o.OooO0OO oooO0OO = oO00o0.OooO00o.f116238OooO0Oo;
        return new C32362OooOOo0(new C32351OooO0o0(new C32363OooOOoo(callableC32345OooO, new C32362OooOOo0(abstractC33485OooO, oooO0o, oooO0OO)), new C20453OooO0oO(this)), oooO0OO, new C20454OooO0oo(this));
    }

    public AbstractC33487OooO0O0 put(final FetchEligibleCampaignsResponse fetchEligibleCampaignsResponse) {
        return this.storageClient.write(fetchEligibleCampaignsResponse).OooO0Oo(new InterfaceC32329OooO00o() { // from class: com.google.firebase.inappmessaging.internal.OooO00o
            @Override // oO00o00o.InterfaceC32329OooO00o
            public final void run() throws Exception {
                this.f68473OooOo0o.lambda$put$0(fetchEligibleCampaignsResponse);
            }
        });
    }
}

package com.google.firebase.inappmessaging.internal;

import OooOoO.C20503OooO00o;
import OooOoO.C20504OooO0O0;
import com.google.firebase.inappmessaging.internal.injection.qualifiers.ImpressionStore;
import com.google.internal.firebase.inappmessaging.p566v1.CampaignProto;
import com.google.internal.firebase.inappmessaging.p566v1.sdkserving.CampaignImpression;
import com.google.internal.firebase.inappmessaging.p566v1.sdkserving.CampaignImpressionList;
import com.google.internal.firebase.inappmessaging.p566v1.sdkserving.FetchEligibleCampaignsResponse;
import java.util.HashSet;
import o0Oo0oOo.o00Oo0;
import oO00o0.OooO00o;
import oO00o00o.InterfaceC32329OooO00o;
import oO00o00o.InterfaceC32330OooO0O0;
import oO00o00o.InterfaceC32331OooO0OO;
import oO00o0OO.C32349OooO0Oo;
import oO00o0OO.C32352OooO0oO;
import oO00o0OO.C32357OooOOO;
import oO00o0OO.C32362OooOOo0;
import oO00o0OO.C32363OooOOoo;
import oO00o0OO.C32364OooOo0;
import oO0OOOoO.C33011OooO0OO;
import oO0OOOoO.C33012OooO0Oo;
import oO0OOOoO.C33013OooO0o;
import oO0OOOoO.C33018OooOO0O;
import oO0OOOoO.C33021OooOOO0;
import oO0OOOoo.InterfaceC33026OooO0Oo;
import oO0OOOoo.InterfaceCallableC33030OooO0oo;
import oO0OooOO.AbstractC33485OooO;
import oO0OooOO.AbstractC33487OooO0O0;
import oO0OooOO.AbstractC33491OooO0o0;
import oO0OooOO.AbstractC33498OooOOO0;
import oO0OooOO.AbstractC33502OooOOo0;
import oO0OooOO.InterfaceC33489OooO0Oo;

/* JADX INFO: loaded from: classes8.dex */
public class ImpressionStorageClient {
    private static final CampaignImpressionList EMPTY_IMPRESSIONS = CampaignImpressionList.getDefaultInstance();
    private AbstractC33485OooO<CampaignImpressionList> cachedImpressionsMaybe = C32349OooO0Oo.f116296OooOo0o;
    private final ProtoStorageClient storageClient;

    public ImpressionStorageClient(@ImpressionStore ProtoStorageClient protoStorageClient) {
        this.storageClient = protoStorageClient;
    }

    private static CampaignImpressionList appendImpression(CampaignImpressionList campaignImpressionList, CampaignImpression campaignImpression) {
        return CampaignImpressionList.newBuilder(campaignImpressionList).addAlreadySeenCampaigns(campaignImpression).build();
    }

    private void clearInMemCache() {
        this.cachedImpressionsMaybe = C32349OooO0Oo.f116296OooOo0o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initInMemCache, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$storeImpression$0(CampaignImpressionList campaignImpressionList) {
        this.cachedImpressionsMaybe = AbstractC33485OooO.OooO0O0(campaignImpressionList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ InterfaceC33489OooO0Oo lambda$clearImpressions$4(HashSet hashSet, CampaignImpressionList campaignImpressionList) throws Exception {
        Logging.logd("Existing impressions: " + campaignImpressionList.toString());
        CampaignImpressionList.Builder builderNewBuilder = CampaignImpressionList.newBuilder();
        for (CampaignImpression campaignImpression : campaignImpressionList.getAlreadySeenCampaignsList()) {
            if (!hashSet.contains(campaignImpression.getCampaignId())) {
                builderNewBuilder.addAlreadySeenCampaigns(campaignImpression);
            }
        }
        final CampaignImpressionList campaignImpressionListBuild = builderNewBuilder.build();
        Logging.logd("New cleared impression list: " + campaignImpressionListBuild.toString());
        return this.storageClient.write(campaignImpressionListBuild).OooO0Oo(new InterfaceC32329OooO00o() { // from class: com.google.firebase.inappmessaging.internal.OooOOOo
            @Override // oO00o00o.InterfaceC32329OooO00o
            public final void run() throws Exception {
                this.f68497OooOo0o.lambda$clearImpressions$3(campaignImpressionListBuild);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getAllImpressions$2(Throwable th) throws Exception {
        clearInMemCache();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ InterfaceC33489OooO0Oo lambda$storeImpression$1(CampaignImpression campaignImpression, CampaignImpressionList campaignImpressionList) throws Exception {
        final CampaignImpressionList campaignImpressionListAppendImpression = appendImpression(campaignImpressionList, campaignImpression);
        return this.storageClient.write(campaignImpressionListAppendImpression).OooO0Oo(new InterfaceC32329OooO00o() { // from class: com.google.firebase.inappmessaging.internal.OooOo0
            @Override // oO00o00o.InterfaceC32329OooO00o
            public final void run() throws Exception {
                this.f68505OooOo0o.lambda$storeImpression$0(campaignImpressionListAppendImpression);
            }
        });
    }

    public AbstractC33487OooO0O0 clearImpressions(FetchEligibleCampaignsResponse fetchEligibleCampaignsResponse) {
        final HashSet hashSet = new HashSet();
        for (CampaignProto.ThickContent thickContent : fetchEligibleCampaignsResponse.getMessagesList()) {
            hashSet.add(thickContent.getPayloadCase().equals(CampaignProto.ThickContent.PayloadCase.VANILLA_PAYLOAD) ? thickContent.getVanillaPayload().getCampaignId() : thickContent.getExperimentalPayload().getCampaignId());
        }
        Logging.logd("Potential impressions to clear: " + hashSet.toString());
        AbstractC33485OooO<CampaignImpressionList> allImpressions = getAllImpressions();
        CampaignImpressionList campaignImpressionList = EMPTY_IMPRESSIONS;
        allImpressions.getClass();
        o00Oo0.OooO00o(campaignImpressionList, "item is null");
        return new C32352OooO0oO(new C32363OooOOoo(allImpressions, AbstractC33485OooO.OooO0O0(campaignImpressionList)), new InterfaceC32331OooO0OO() { // from class: com.google.firebase.inappmessaging.internal.OooOo00
            @Override // oO00o00o.InterfaceC32331OooO0OO
            public final Object apply(Object obj) {
                return this.f68507OooOo0o.lambda$clearImpressions$4(hashSet, (CampaignImpressionList) obj);
            }
        });
    }

    public AbstractC33485OooO<CampaignImpressionList> getAllImpressions() {
        AbstractC33485OooO<CampaignImpressionList> abstractC33485OooO = this.cachedImpressionsMaybe;
        AbstractC33485OooO abstractC33485OooO2 = this.storageClient.read(CampaignImpressionList.parser());
        InterfaceC32330OooO0O0 interfaceC32330OooO0O0 = new InterfaceC32330OooO0O0() { // from class: com.google.firebase.inappmessaging.internal.OooOOo
            @Override // oO00o00o.InterfaceC32330OooO0O0
            public final void accept(Object obj) {
                this.f68498OooOo0o.lambda$storeImpression$0((CampaignImpressionList) obj);
            }
        };
        abstractC33485OooO2.getClass();
        OooO00o.OooO0OO oooO0OO = oO00o0.OooO00o.f116238OooO0Oo;
        C32362OooOOo0 c32362OooOOo0 = new C32362OooOOo0(abstractC33485OooO2, interfaceC32330OooO0O0, oooO0OO);
        abstractC33485OooO.getClass();
        return new C32362OooOOo0(new C32363OooOOoo(abstractC33485OooO, c32362OooOOo0), oooO0OO, new C22734OooOOoo(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC33502OooOOo0<Boolean> isImpressed(CampaignProto.ThickContent thickContent) {
        AbstractC33498OooOOO0 c33013OooO0o;
        String campaignId = thickContent.getPayloadCase().equals(CampaignProto.ThickContent.PayloadCase.VANILLA_PAYLOAD) ? thickContent.getVanillaPayload().getCampaignId() : thickContent.getExperimentalPayload().getCampaignId();
        AbstractC33485OooO<CampaignImpressionList> allImpressions = getAllImpressions();
        OooOo00.OooO0OO oooO0OO = new OooOo00.OooO0OO();
        allImpressions.getClass();
        C32357OooOOO c32357OooOOO = new C32357OooOOO(allImpressions, oooO0OO);
        C20503OooO00o c20503OooO00o = new C20503OooO00o();
        AbstractC33498OooOOO0 abstractC33498OooOOO0OooO0O0 = c32357OooOOO instanceof InterfaceC33026OooO0Oo ? ((InterfaceC33026OooO0Oo) c32357OooOOO).OooO0O0() : new C32364OooOo0(c32357OooOOO);
        int i = AbstractC33491OooO0o0.f120996OooOo0o;
        o00Oo0.OooO0O0(Integer.MAX_VALUE, "maxConcurrency");
        o00Oo0.OooO0O0(i, "bufferSize");
        if (abstractC33498OooOOO0OooO0O0 instanceof InterfaceCallableC33030OooO0oo) {
            T tCall = ((InterfaceCallableC33030OooO0oo) abstractC33498OooOOO0OooO0O0).call();
            c33013OooO0o = tCall == 0 ? C33012OooO0Oo.f119422OooOo0o : new C33021OooOOO0(tCall, c20503OooO00o);
        } else {
            c33013OooO0o = new C33013OooO0o(abstractC33498OooOOO0OooO0O0, c20503OooO00o, i);
        }
        C20504OooO0O0 c20504OooO0O0 = new C20504OooO0O0();
        c33013OooO0o.getClass();
        C33018OooOO0O c33018OooOO0O = new C33018OooOO0O(c33013OooO0o, c20504OooO0O0);
        o00Oo0.OooO00o(campaignId, "element is null");
        return new C33011OooO0OO(c33018OooOO0O, new OooO00o.C32323OooO0o0(campaignId));
    }

    public AbstractC33487OooO0O0 storeImpression(final CampaignImpression campaignImpression) {
        AbstractC33485OooO<CampaignImpressionList> allImpressions = getAllImpressions();
        CampaignImpressionList campaignImpressionList = EMPTY_IMPRESSIONS;
        allImpressions.getClass();
        o00Oo0.OooO00o(campaignImpressionList, "item is null");
        return new C32352OooO0oO(new C32363OooOOoo(allImpressions, AbstractC33485OooO.OooO0O0(campaignImpressionList)), new InterfaceC32331OooO0OO() { // from class: com.google.firebase.inappmessaging.internal.OooOOo0
            @Override // oO00o00o.InterfaceC32331OooO0OO
            public final Object apply(Object obj) {
                return this.f68500OooOo0o.lambda$storeImpression$1(campaignImpression, (CampaignImpressionList) obj);
            }
        });
    }
}

package com.orion.notein.p607ui.creative_library.purchase;

import com.aspose.words.StyleIdentifier;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.JsonObject;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.creative_library.purchase.OooO00o;
import com.orion.notein.p607ui.creative_library.purchase.OooO0o;
import com.tencent.p610mm.opensdk.modelpay.PayReq;
import com.tencent.p610mm.opensdk.openapi.IWXAPI;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o00o00.C25206OooO0Oo;
import o00o00O0.C25252OooO0Oo;
import o0Oo0Ooo.C28144OooOO0O;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33768Ooooo00;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.purchase.MaterialPurchaseUiDelegate$bindUiEvents$1", m80623f = "MaterialPurchaseUiDelegate.kt", m80624l = {StyleIdentifier.GRID_TABLE_4}, m80625m = "invokeSuspend")
public final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.creative_library.purchase.OooO00o f71363OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f71364OooOo0o;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.purchase.MaterialPurchaseUiDelegate$bindUiEvents$1$1", m80623f = "MaterialPurchaseUiDelegate.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<OooO0o.OooO0O0, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ com.orion.notein.p607ui.creative_library.purchase.OooO00o f71365OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f71366OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(com.orion.notein.p607ui.creative_library.purchase.OooO00o oooO00o, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f71365OooOo = oooO00o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f71365OooOo, continuation);
            oooO00o.f71366OooOo0o = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(OooO0o.OooO0O0 oooO0O0, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(oooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            JsonObject jsonObject;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            OooO0o.OooO0O0 oooO0O0 = (OooO0o.OooO0O0) this.f71366OooOo0o;
            boolean z = oooO0O0 instanceof OooO0o.OooO0O0.C19190OooO0O0;
            com.orion.notein.p607ui.creative_library.purchase.OooO00o oooO00o = this.f71365OooOo;
            if (z) {
                String str = ((OooO0o.OooO0O0.C19190OooO0O0) oooO0O0).f71385OooO00o;
                oooO00o.getClass();
                if (str.length() == 0) {
                    C25206OooO0Oo.OooO0o(oooO00o.f71332OooO0O0.OooO00o(), R.string.preorder_info_error);
                    oooO00o.f71333OooO0OO.OooO0o(false);
                } else {
                    C33609OooO0oo.OooO0OO(oooO00o.f71334OooO0Oo, null, null, new C23074OooO0o0(oooO00o, str, null), 3);
                }
            } else if (oooO0O0 instanceof OooO0o.OooO0O0.OooO0OO) {
                String str2 = ((OooO0o.OooO0O0.OooO0OO) oooO0O0).f71386OooO00o;
                oooO00o.getClass();
                int length = str2.length();
                OooO00o.InterfaceC19187OooO00o interfaceC19187OooO00o = oooO00o.f71332OooO0O0;
                OooO0o oooO0o = oooO00o.f71333OooO0OO;
                if (length == 0) {
                    C25206OooO0Oo.OooO0o(interfaceC19187OooO00o.OooO00o(), R.string.preorder_info_error);
                    oooO0o.OooO0o(false);
                } else {
                    try {
                        jsonObject = (JsonObject) oooO00o.f71353OooOo0o.fromJson(str2, JsonObject.class);
                    } catch (Exception e) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("MaterialPurchaseUiDelegate");
                        c20358OooO00o.OooOO0o(e, "triggerWeChatAppPay: invalid prepay info", new Object[0]);
                        jsonObject = null;
                    }
                    if (jsonObject == null) {
                        C25206OooO0Oo.OooO0o(interfaceC19187OooO00o.OooO00o(), R.string.preorder_info_error);
                        oooO0o.OooO0o(false);
                    } else {
                        PayReq payReq = new PayReq();
                        payReq.appId = jsonObject.get(RemoteConfigConstants.RequestFieldKey.APP_ID).getAsString();
                        payReq.partnerId = jsonObject.get("partnerId").getAsString();
                        payReq.packageValue = jsonObject.get("packageValue").getAsString();
                        payReq.prepayId = jsonObject.get("prepayId").getAsString();
                        payReq.nonceStr = jsonObject.get("nonceStr").getAsString();
                        payReq.timeStamp = jsonObject.get("timeStamp").getAsString();
                        payReq.sign = jsonObject.get("sign").getAsString();
                        IWXAPI iwxapi = oooO00o.f71349OooOo;
                        if (iwxapi == null) {
                            OooOOO0.OooOOOO("weChatApi");
                            throw null;
                        }
                        iwxapi.sendReq(payReq);
                    }
                }
            } else if (oooO0O0 instanceof OooO0o.OooO0O0.C19191OooO0o) {
                String str3 = ((OooO0o.OooO0O0.C19191OooO0o) oooO0O0).f71388OooO00o;
                oooO00o.getClass();
                C33609OooO0oo.OooO0OO(oooO00o.f71334OooO0Oo, null, null, new C28144OooOO0O(oooO00o, str3, null), 3);
            } else if (oooO0O0 instanceof OooO0o.OooO0O0.OooO0o0) {
                C25206OooO0Oo.OooO0o(oooO00o.f71332OooO0O0.OooO00o(), R.string.pay_success);
                oooO00o.f71332OooO0O0.OooO0o0();
            } else if (oooO0O0 instanceof OooO0o.OooO0O0.C23071OooO0Oo) {
                C25206OooO0Oo.OooO0oO(oooO00o.f71332OooO0O0.OooO00o(), ((OooO0o.OooO0O0.C23071OooO0Oo) oooO0O0).f71387OooO00o);
            } else {
                if (!(oooO0O0 instanceof OooO0o.OooO0O0.OooO00o)) {
                    throw new C32442OooOO0o();
                }
                oooO00o.f71332OooO0O0.onDismiss();
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(com.orion.notein.p607ui.creative_library.purchase.OooO00o oooO00o, Continuation<? super OooO0OO> continuation) {
        super(2, continuation);
        this.f71363OooOo = oooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooO0OO(this.f71363OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f71364OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            com.orion.notein.p607ui.creative_library.purchase.OooO00o oooO00o = this.f71363OooOo;
            C33768Ooooo00 c33768Ooooo00 = oooO00o.f71333OooO0OO.f71376OooO0oo;
            OooO00o oooO00o2 = new OooO00o(oooO00o, null);
            this.f71364OooOo0o = 1;
            if (C25252OooO0Oo.OooO0oO(c33768Ooooo00, oooO00o2, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}

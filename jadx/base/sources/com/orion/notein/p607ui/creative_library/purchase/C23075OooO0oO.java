package com.orion.notein.p607ui.creative_library.purchase;

import com.orion.notein.data.service.dto.MaterialOrderDto;
import com.orion.notein.data.service.dto.MaterialPurchaseRequest;
import com.orion.notein.data.service.dto.MaterialPurchaseResponse;
import com.orion.notein.domain.models.transactions.TransactionsConstants;
import com.orion.notein.p607ui.creative_library.purchase.OooO0o;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0OOOOO0.InterfaceC27151OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.C33781o00o0O;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: com.orion.notein.ui.creative_library.purchase.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.purchase.MaterialPurchaseViewModel$createOrder$2", m80623f = "MaterialPurchaseViewModel.kt", m80624l = {109, 138, 141}, m80625m = "invokeSuspend")
public final class C23075OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f71409OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f71410OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ OooO0o f71411OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ int f71412OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23075OooO0oO(String str, int i, OooO0o oooO0o, Continuation<? super C23075OooO0oO> continuation) {
        super(2, continuation);
        this.f71409OooOo = str;
        this.f71412OooOoO0 = i;
        this.f71411OooOoO = oooO0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C23075OooO0oO(this.f71409OooOo, this.f71412OooOoO0, this.f71411OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C23075OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x011e, code lost:
    
        if (r3.emit(r6, r19) == r2) goto L57;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objOooOO0;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        OooO0o.OooO0OO oooO0OO;
        OooO0o.OooO00o.OooO0O0 oooO0O0;
        String errMsg;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f71410OooOo0o;
        int i2 = this.f71412OooOoO0;
        OooO0o oooO0o = this.f71411OooOoO;
        try {
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("MaterialPurchaseVM");
            c20358OooO00o.OooO0Oo(e, "Create order failed", new Object[0]);
            C33781o00o0O c33781o00o0O = oooO0o.f71374OooO0o0;
            do {
                value = c33781o00o0O.getValue();
            } while (!c33781o00o0O.OooO(value, OooO0o.OooO0OO.OooO00o((OooO0o.OooO0OO) value, null, null, 0, OooO0o.OooO00o.OooO0O0.f71379OooO00o, "网络错误，请重试", 7)));
        }
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            MaterialPurchaseRequest materialPurchaseRequest = new MaterialPurchaseRequest(this.f71409OooOo, i2, 1);
            InterfaceC27151OooO0o0 interfaceC27151OooO0o0 = oooO0o.f71372OooO0Oo;
            this.f71410OooOo0o = 1;
            objOooOO0 = interfaceC27151OooO0o0.OooOO0(materialPurchaseRequest, this);
            if (objOooOO0 == enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        objOooOO0 = obj;
        MaterialPurchaseResponse materialPurchaseResponse = (MaterialPurchaseResponse) objOooOO0;
        if (materialPurchaseResponse.getErrCode() != null && !OooOOO0.OooO0O0(materialPurchaseResponse.getErrCode(), TransactionsConstants.API_RESULT_SUCCESS)) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("MaterialPurchaseVM");
            c20358OooO00o2.OooO0OO("Create order failed: " + materialPurchaseResponse.getErrCode() + " - " + materialPurchaseResponse.getErrMsg(), new Object[0]);
            C33781o00o0O c33781o00o0O2 = oooO0o.f71374OooO0o0;
            do {
                value5 = c33781o00o0O2.getValue();
                oooO0OO = (OooO0o.OooO0OO) value5;
                oooO0O0 = OooO0o.OooO00o.OooO0O0.f71379OooO00o;
                errMsg = materialPurchaseResponse.getErrMsg();
                if (errMsg == null) {
                    errMsg = "创建订单失败";
                }
            } while (!c33781o00o0O2.OooO(value5, OooO0o.OooO0OO.OooO00o(oooO0OO, null, null, 0, oooO0O0, errMsg, 7)));
            return C32460OooOooO.f116667OooO00o;
        }
        MaterialOrderDto order = materialPurchaseResponse.getOrder();
        if (order == null) {
            C33781o00o0O c33781o00o0O3 = oooO0o.f71374OooO0o0;
            do {
                value4 = c33781o00o0O3.getValue();
            } while (!c33781o00o0O3.OooO(value4, OooO0o.OooO0OO.OooO00o((OooO0o.OooO0OO) value4, null, null, 0, OooO0o.OooO00o.OooO0O0.f71379OooO00o, "订单创建异常", 7)));
            return C32460OooOooO.f116667OooO00o;
        }
        oooO0o.f71371OooO = order.getOrderNo();
        C33781o00o0O c33781o00o0O4 = oooO0o.f71374OooO0o0;
        order.getTradeNo();
        do {
            value2 = c33781o00o0O4.getValue();
        } while (!c33781o00o0O4.OooO(value2, OooO0o.OooO0OO.OooO00o((OooO0o.OooO0OO) value2, null, null, 0, OooO0o.OooO00o.C19189OooO0o.f71382OooO00o, null, 23)));
        String prepayInfo = materialPurchaseResponse.getPrepayInfo();
        if (prepayInfo == null || prepayInfo.length() == 0) {
            do {
                value3 = c33781o00o0O4.getValue();
            } while (!c33781o00o0O4.OooO(value3, OooO0o.OooO0OO.OooO00o((OooO0o.OooO0OO) value3, null, null, 0, OooO0o.OooO00o.OooO0O0.f71379OooO00o, "支付信息获取失败", 7)));
            return C32460OooOooO.f116667OooO00o;
        }
        C33772OooooOo c33772OooooOo = oooO0o.f71375OooO0oO;
        if (i2 != 0) {
            if (i2 == 1) {
                OooO0o.OooO0O0.C19190OooO0O0 c19190OooO0O0 = new OooO0o.OooO0O0.C19190OooO0O0(prepayInfo);
                this.f71410OooOo0o = 2;
                if (c33772OooooOo.emit(c19190OooO0O0, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            }
            return C32460OooOooO.f116667OooO00o;
        }
        OooO0o.OooO0O0.OooO0OO oooO0OO2 = new OooO0o.OooO0O0.OooO0OO(prepayInfo);
        this.f71410OooOo0o = 3;
    }
}

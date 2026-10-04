package com.orion.notein.p607ui.creative_library.purchase;

import android.app.Activity;
import androidx.fragment.app.ActivityC21897OooOo0;
import com.alipay.sdk.app.PayTask;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.transactions.TransactionsConstants;
import com.orion.notein.global.R;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o00o00.C25206OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: com.orion.notein.ui.creative_library.purchase.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.purchase.MaterialPurchaseUiDelegate$triggerAlipayAppPay$1", m80623f = "MaterialPurchaseUiDelegate.kt", m80624l = {StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_6}, m80625m = "invokeSuspend")
public final class C23074OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.creative_library.purchase.OooO00o f71404OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f71405OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f71406OooOoO0;

    /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.purchase.OooO0o0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.purchase.MaterialPurchaseUiDelegate$triggerAlipayAppPay$1$result$1", m80623f = "MaterialPurchaseUiDelegate.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Map<String, String>>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ String f71407OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Activity f71408OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Activity activity, String str, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f71408OooOo0o = activity;
            this.f71407OooOo = str;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f71408OooOo0o, this.f71407OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Map<String, String>> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            return new PayTask(this.f71408OooOo0o).payV2(this.f71407OooOo, true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23074OooO0o0(com.orion.notein.p607ui.creative_library.purchase.OooO00o oooO00o, String str, Continuation<? super C23074OooO0o0> continuation) {
        super(2, continuation);
        this.f71404OooOo = oooO00o;
        this.f71406OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C23074OooO0o0(this.f71404OooOo, this.f71406OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C23074OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f71405OooOo0o;
        com.orion.notein.p607ui.creative_library.purchase.OooO00o oooO00o = this.f71404OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            ActivityC21897OooOo0 activityC21897OooOo0OooO0Oo = oooO00o.f71332OooO0O0.OooO0Oo();
            if (activityC21897OooOo0OooO0Oo == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("MaterialPurchaseUiDelegate");
                c20358OooO00o.OooOO0O("triggerAlipayAppPay: unable to get Activity instance", new Object[0]);
                C25206OooO0Oo.OooO0o(oooO00o.f71332OooO0O0.OooO00o(), R.string.preorder_info_error);
                oooO00o.f71333OooO0OO.OooO0o(false);
                return C32460OooOooO.f116667OooO00o;
            }
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            OooO00o oooO00o2 = new OooO00o(activityC21897OooOo0OooO0Oo, this.f71406OooOoO0, null);
            this.f71405OooOo0o = 1;
            obj = C33609OooO0oo.OooO0o(executorC33873OooO0O0, oooO00o2, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        oooO00o.f71333OooO0OO.OooO0o(OooOOO0.OooO0O0((String) ((Map) obj).get("resultStatus"), TransactionsConstants.ALIPAY_PAY_RESULT_OK));
        return C32460OooOooO.f116667OooO00o;
    }
}

package com.orion.notein.p607ui.creative_library.purchase;

import Oooo0oO.C21111o0ooOoO;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.creative_library.purchase.OooO0o;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0oo000O.OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33769Ooooo0o;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.purchase.MaterialPurchaseUiDelegate$bindProductInfo$1", m80623f = "MaterialPurchaseUiDelegate.kt", m80624l = {123}, m80625m = "invokeSuspend")
public final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.creative_library.purchase.OooO00o f71359OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f71360OooOo0o;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.purchase.MaterialPurchaseUiDelegate$bindProductInfo$1$1", m80623f = "MaterialPurchaseUiDelegate.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<OooO0o.OooO0OO, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ com.orion.notein.p607ui.creative_library.purchase.OooO00o f71361OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f71362OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(com.orion.notein.p607ui.creative_library.purchase.OooO00o oooO00o, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f71361OooOo = oooO00o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f71361OooOo, continuation);
            oooO00o.f71362OooOo0o = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(OooO0o.OooO0OO oooO0OO, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(oooO0OO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            OooO0o.OooO0OO oooO0OO = (OooO0o.OooO0OO) this.f71362OooOo0o;
            com.orion.notein.p607ui.creative_library.purchase.OooO00o oooO00o = this.f71361OooOo;
            oooO00o.getClass();
            oooO00o.f71336OooO0o0.setText(oooO0OO.f71392OooO0O0);
            oooO00o.f71335OooO0o.setText(oooO00o.f71332OooO0O0.OooO00o().getString(R.string.long_term_product));
            oooO00o.f71337OooO0oO.setVisibility(8);
            oooO00o.f71338OooO0oo.setVisibility(8);
            int i = OooOOOO.f111245OooO00o;
            DecimalFormat decimalFormat = new DecimalFormat("0.##");
            decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
            oooO00o.f71330OooO.setText(C21111o0ooOoO.OooO0Oo(decimalFormat.format(oooO0OO.f71393OooO0OO / 100.0f), "元"));
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(com.orion.notein.p607ui.creative_library.purchase.OooO00o oooO00o, Continuation<? super OooO0O0> continuation) {
        super(2, continuation);
        this.f71359OooOo = oooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooO0O0(this.f71359OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f71360OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            com.orion.notein.p607ui.creative_library.purchase.OooO00o oooO00o = this.f71359OooOo;
            C33769Ooooo0o c33769Ooooo0o = oooO00o.f71333OooO0OO.f71373OooO0o;
            OooO00o oooO00o2 = new OooO00o(oooO00o, null);
            this.f71360OooOo0o = 1;
            if (C25252OooO0Oo.OooO0oO(c33769Ooooo0o, oooO00o2, this) == enumC32485OooO00o) {
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

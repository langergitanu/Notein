package com.orion.notein.p607ui.creative_library.purchase;

import android.widget.ImageView;
import com.orion.notein.p607ui.creative_library.purchase.OooO0o;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o00o00.C25206OooO0Oo;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33769Ooooo0o;

/* JADX INFO: renamed from: com.orion.notein.ui.creative_library.purchase.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.purchase.MaterialPurchaseUiDelegate$bindUiState$1", m80623f = "MaterialPurchaseUiDelegate.kt", m80624l = {304}, m80625m = "invokeSuspend")
public final class C23068OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.creative_library.purchase.OooO00o f71367OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f71368OooOo0o;

    /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.purchase.OooO0Oo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.purchase.MaterialPurchaseUiDelegate$bindUiState$1$1", m80623f = "MaterialPurchaseUiDelegate.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<OooO0o.OooO0OO, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ com.orion.notein.p607ui.creative_library.purchase.OooO00o f71369OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f71370OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(com.orion.notein.p607ui.creative_library.purchase.OooO00o oooO00o, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f71369OooOo = oooO00o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f71369OooOo, continuation);
            oooO00o.f71370OooOo0o = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(OooO0o.OooO0OO oooO0OO, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(oooO0OO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            ImageView imageView;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            OooO0o.OooO0OO oooO0OO = (OooO0o.OooO0OO) this.f71370OooOo0o;
            OooO0o.OooO00o oooO00o = oooO0OO.f71394OooO0Oo;
            boolean zOooO0O0 = OooOOO0.OooO0O0(oooO00o, OooO0o.OooO00o.OooO0O0.f71379OooO00o);
            com.orion.notein.p607ui.creative_library.purchase.OooO00o oooO00o2 = this.f71369OooOo;
            if (zOooO0O0) {
                ImageView imageView2 = oooO00o2.f71352OooOo0O;
                if (imageView2 != null) {
                    imageView2.setImageDrawable(null);
                }
                String str = oooO0OO.f71395OooO0o0;
                if (str != null) {
                    C25206OooO0Oo.OooO0oO(oooO00o2.f71332OooO0O0.OooO00o(), str);
                }
            } else if (OooOOO0.OooO0O0(oooO00o, OooO0o.OooO00o.C23069OooO0Oo.f71381OooO00o) && (imageView = oooO00o2.f71352OooOo0O) != null) {
                imageView.setImageDrawable(null);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23068OooO0Oo(com.orion.notein.p607ui.creative_library.purchase.OooO00o oooO00o, Continuation<? super C23068OooO0Oo> continuation) {
        super(2, continuation);
        this.f71367OooOo = oooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C23068OooO0Oo(this.f71367OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C23068OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f71368OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            com.orion.notein.p607ui.creative_library.purchase.OooO00o oooO00o = this.f71367OooOo;
            C33769Ooooo0o c33769Ooooo0o = oooO00o.f71333OooO0OO.f71373OooO0o;
            OooO00o oooO00o2 = new OooO00o(oooO00o, null);
            this.f71368OooOo0o = 1;
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

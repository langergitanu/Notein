package o0Oo0Ooo;

import kotlin.coroutines.Continuation;
import o0OOOOO0.InterfaceC27151OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0Oo0Ooo.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.purchase.MaterialPurchaseViewModel$cancelOrder$1", m80623f = "MaterialPurchaseViewModel.kt", m80624l = {209}, m80625m = "invokeSuspend")
public final class C28145OooOO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.creative_library.purchase.OooO0o f99760OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f99761OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f99762OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28145OooOO0o(com.orion.notein.p607ui.creative_library.purchase.OooO0o oooO0o, String str, Continuation<? super C28145OooOO0o> continuation) {
        super(2, continuation);
        this.f99760OooOo = oooO0o;
        this.f99762OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28145OooOO0o(this.f99760OooOo, this.f99762OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28145OooOO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f99761OooOo0o;
        String str = this.f99762OooOoO0;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC27151OooO0o0 interfaceC27151OooO0o0 = this.f99760OooOo.f71372OooO0Oo;
                this.f99761OooOo0o = 1;
                if (interfaceC27151OooO0o0.OooO0o0(str, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("MaterialPurchaseVM");
            c20358OooO00o.OooO00o("Order cancelled: " + str, new Object[0]);
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("MaterialPurchaseVM");
            c20358OooO00o2.OooOO0o(e, "Cancel order failed", new Object[0]);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}

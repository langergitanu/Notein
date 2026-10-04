package o0o0OOoO;

import android.content.Context;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.pay.aiquota.AiQuotaPayDialogFragment;
import kotlin.coroutines.Continuation;
import o00o00.C25206OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o0OOoO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pay.aiquota.AiQuotaPayDialogFragment$onOrderFailed$1", m80623f = "AiQuotaPayDialogFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30553OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ AiQuotaPayDialogFragment f109288OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30553OooO0OO(AiQuotaPayDialogFragment aiQuotaPayDialogFragment, Continuation<? super C30553OooO0OO> continuation) {
        super(2, continuation);
        this.f109288OooOo0o = aiQuotaPayDialogFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30553OooO0OO(this.f109288OooOo0o, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30553OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        AiQuotaPayDialogFragment aiQuotaPayDialogFragment = this.f109288OooOo0o;
        Context context = aiQuotaPayDialogFragment.getContext();
        if (context != null) {
            String string = aiQuotaPayDialogFragment.getString(R.string.pay_error);
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
            C25206OooO0Oo.OooO0oO(context, string);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}

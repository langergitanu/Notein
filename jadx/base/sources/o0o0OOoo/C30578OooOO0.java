package o0o0OOoo;

import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.os.Bundle;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.pay.google.GooglePayDialogFragment;
import kotlin.coroutines.Continuation;
import o00o00.C25206OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33644OoooO0;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o0OOoo.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pay.google.GooglePayDialogFragment$onOrderSuccess$1", m80623f = "GooglePayDialogFragment.kt", m80624l = {StyleIdentifier.LIST_TABLE_2_ACCENT_4}, m80625m = "invokeSuspend")
public final class C30578OooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ GooglePayDialogFragment f109390OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f109391OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30578OooOO0(GooglePayDialogFragment googlePayDialogFragment, Continuation<? super C30578OooOO0> continuation) {
        super(2, continuation);
        this.f109390OooOo = googlePayDialogFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30578OooOO0(this.f109390OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30578OooOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f109391OooOo0o;
        GooglePayDialogFragment googlePayDialogFragment = this.f109390OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            Context context = googlePayDialogFragment.getContext();
            if (context != null) {
                String string = googlePayDialogFragment.getString(R.string.pay_success);
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                C25206OooO0Oo.OooO0oO(context, string);
            }
            this.f109391OooOo0o = 1;
            if (C33644OoooO0.OooO00o(1000L, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        Bundle EMPTY = Bundle.EMPTY;
        kotlin.jvm.internal.OooOOO0.OooO0o(EMPTY, "EMPTY");
        googlePayDialogFragment.getParentFragmentManager().OooooOo(EMPTY, "refresh_purchases_server");
        C21030OooOO0o.OooO0OO(googlePayDialogFragment).OooOOo(R.id.googlePayDialogFragment, true);
        return C32460OooOooO.f116667OooO00o;
    }
}

package o0o0OOoO;

import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.os.Bundle;
import com.aspose.words.StyleIdentifier;
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
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33644OoooO0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0o0OOoO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pay.aiquota.AiQuotaPayDialogFragment$onOrderSuccess$1", m80623f = "AiQuotaPayDialogFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_7_COLORFUL_ACCENT_5}, m80625m = "invokeSuspend")
public final class C30554OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AiQuotaPayDialogFragment f109289OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f109290OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30554OooO0Oo(AiQuotaPayDialogFragment aiQuotaPayDialogFragment, Continuation<? super C30554OooO0Oo> continuation) {
        super(2, continuation);
        this.f109289OooOo = aiQuotaPayDialogFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30554OooO0Oo(this.f109289OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30554OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f109290OooOo0o;
        AiQuotaPayDialogFragment aiQuotaPayDialogFragment = this.f109289OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C30558OooO0oo c30558OooO0ooOooo0 = aiQuotaPayDialogFragment.Oooo0();
            String str = (String) c30558OooO0ooOooo0.f109296OooO.getValue();
            if (str != null) {
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(ExecutorC33873OooO0O0.f122045OooOoO0), null, null, new C30562OooOO0(c30558OooO0ooOooo0, str, null), 3);
            }
            Context context = aiQuotaPayDialogFragment.getContext();
            if (context != null) {
                String string = aiQuotaPayDialogFragment.getString(R.string.pay_success);
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                C25206OooO0Oo.OooO0oO(context, string);
            }
            this.f109290OooOo0o = 1;
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
        aiQuotaPayDialogFragment.getParentFragmentManager().OooooOo(EMPTY, "refresh_purchases_server");
        C21030OooOO0o.OooO0OO(aiQuotaPayDialogFragment).OooOOo(R.id.aiQuotaPayDialogFragment, true);
        return C32460OooOooO.f116667OooO00o;
    }
}

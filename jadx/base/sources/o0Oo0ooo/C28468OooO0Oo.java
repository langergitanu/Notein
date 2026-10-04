package o0Oo0ooo;

import android.view.View;
import com.orion.notein.p607ui.login.BaseGetPhoneVerificationFragment;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0Oo0ooo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.BaseGetPhoneVerificationFragment$observeButtonState$3", m80623f = "BaseGetPhoneVerificationFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C28468OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ BaseGetPhoneVerificationFragment f100863OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ boolean f100864OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28468OooO0Oo(BaseGetPhoneVerificationFragment baseGetPhoneVerificationFragment, Continuation<? super C28468OooO0Oo> continuation) {
        super(2, continuation);
        this.f100863OooOo = baseGetPhoneVerificationFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C28468OooO0Oo c28468OooO0Oo = new C28468OooO0Oo(this.f100863OooOo, continuation);
        c28468OooO0Oo.f100864OooOo0o = ((Boolean) obj).booleanValue();
        return c28468OooO0Oo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((C28468OooO0Oo) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        boolean z = this.f100864OooOo0o;
        BaseGetPhoneVerificationFragment baseGetPhoneVerificationFragment = this.f100863OooOo;
        View view = baseGetPhoneVerificationFragment.f72101OooOo;
        if (view == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("requestCodeButton");
            throw null;
        }
        view.setEnabled(z);
        View view2 = baseGetPhoneVerificationFragment.f72101OooOo;
        if (view2 != null) {
            view2.setClickable(z);
            return C32460OooOooO.f116667OooO00o;
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("requestCodeButton");
        throw null;
    }
}

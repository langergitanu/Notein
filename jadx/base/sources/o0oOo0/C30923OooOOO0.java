package o0oOo0;

import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.user.UserInfoFragment;
import kotlin.coroutines.Continuation;
import o0Oo00o.C28026OooO0OO;
import o0Oo0o00.C28201OooooO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0oOo0.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.UserInfoFragment$initUserUsage$syncClickListener$1$1", m80623f = "UserInfoFragment.kt", m80624l = {214, 216}, m80625m = "invokeSuspend")
public final class C30923OooOOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ UserInfoFragment f110497OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f110498OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30923OooOOO0(UserInfoFragment userInfoFragment, Continuation<? super C30923OooOOO0> continuation) {
        super(2, continuation);
        this.f110497OooOo = userInfoFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30923OooOOO0(this.f110497OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30923OooOOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r6 == r0) goto L17;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f110498OooOo0o;
        UserInfoFragment userInfoFragment = this.f110497OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f110498OooOo0o = 1;
            obj = UserInfoFragment.OooOoOO(userInfoFragment, 9, this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            if (!((Boolean) obj).booleanValue()) {
                Context contextRequireContext = userInfoFragment.requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                C28026OooO0OO.OooO00o(C21030OooOO0o.OooO0OO(userInfoFragment), o0oo000O.OooOO0O.OooO00o(contextRequireContext) ? R.id.cloudSyncLoginDialogFragment : R.id.cloudSyncLoginContainerFragment, null);
            }
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        if (!((Boolean) obj).booleanValue()) {
            C28201OooooO0 c28201OooooO0 = (C28201OooooO0) userInfoFragment.f79646OoooO.getValue();
            this.f110498OooOo0o = 2;
            obj = c28201OooooO0.OooO(this);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}

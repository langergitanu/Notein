package o0oOoO0;

import android.content.Context;
import androidx.lifecycle.C21989OooOooO;
import com.orion.notein.domain.models.login.AuthorizeInfo;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.user.settings.home.UserSettingFragment;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0OOOo0.C27174OooO0O0;
import o0OoO0.C28513OooO0oO;
import oO00ooO.C32444OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33721OooO0o;

/* JADX INFO: renamed from: o0oOoO0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.settings.home.UserSettingFragment$handleBindHonor$1", m80623f = "UserSettingFragment.kt", m80624l = {630, 630}, m80625m = "invokeSuspend")
public final class C30995OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ UserSettingFragment f110701OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f110702OooOo0o;

    /* JADX INFO: renamed from: o0oOoO0.OooO0OO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.settings.home.UserSettingFragment$handleBindHonor$1$1", m80623f = "UserSettingFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C27174OooO0O0<AuthorizeInfo>, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ UserSettingFragment f110703OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f110704OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(UserSettingFragment userSettingFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f110703OooOo = userSettingFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f110703OooOo, continuation);
            oooO00o.f110704OooOo0o = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(C27174OooO0O0<AuthorizeInfo> c27174OooO0O0, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(c27174OooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            AuthorizeInfo authorizeInfo = (AuthorizeInfo) ((C27174OooO0O0) this.f110704OooOo0o).OooO0O0();
            UserSettingFragment userSettingFragment = this.f110703OooOo;
            if (authorizeInfo == null) {
                Context context = userSettingFragment.getContext();
                if (context != null) {
                    C28513OooO0oO.OooO00o(context, R.string.network_error, "getString(...)", context);
                }
            } else if (authorizeInfo.getIntent() != null) {
                userSettingFragment.f79865OoooOoO.OooO00o(authorizeInfo.getIntent());
            } else if (authorizeInfo.getAuthCode() != null) {
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(userSettingFragment), null, null, new C30998OooO0o0(userSettingFragment, authorizeInfo.getAuthCode(), null), 3);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30995OooO0OO(UserSettingFragment userSettingFragment, Continuation<? super C30995OooO0OO> continuation) {
        super(2, continuation);
        this.f110701OooOo = userSettingFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30995OooO0OO(this.f110701OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30995OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f110702OooOo0o;
        UserSettingFragment userSettingFragment = this.f110701OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            userSettingFragment.OooOoOO();
            this.f110702OooOo0o = 1;
            throw new C32444OooOOO0("An operation is not implemented: Not yet implemented");
        }
        if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
            OooO00o oooO00o = new OooO00o(userSettingFragment, null);
            this.f110702OooOo0o = 2;
            if (C25252OooO0Oo.OooO0oO((InterfaceC33721OooO0o) obj, oooO00o, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}

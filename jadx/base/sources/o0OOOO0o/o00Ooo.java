package o0OOOO0o;

import com.orion.notein.data.service.dto.UserApiResultDto;
import com.orion.notein.domain.models.User;
import kotlin.coroutines.Continuation;
import o00Ooo.C25086OooOo0O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.user.UserRepoImpl$updatePhone$2", m80623f = "UserRepoImpl.kt", m80624l = {236, 239}, m80625m = "invokeSuspend")
public final class o00Ooo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Integer>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f94723OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f94724OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f94725OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C27129OoooOOO f94726OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f94727OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ String f94728OooOoo0;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.user.UserRepoImpl$updatePhone$2$result$1", m80623f = "UserRepoImpl.kt", m80624l = {236}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super UserApiResultDto>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C27129OoooOOO f94729OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f94730OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ String f94731OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ String f94732OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ String f94733OooOoOO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C27129OoooOOO c27129OoooOOO, String str, String str2, String str3, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f94729OooOo = c27129OoooOOO;
            this.f94732OooOoO0 = str;
            this.f94731OooOoO = str2;
            this.f94733OooOoOO = str3;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f94729OooOo, this.f94732OooOoO0, this.f94731OooOoO, this.f94733OooOoOO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super UserApiResultDto> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f94730OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C27119Oooo0OO c27119Oooo0OO = this.f94729OooOo.f94599OooO0Oo;
                this.f94730OooOo0o = 1;
                obj = c27119Oooo0OO.OooOOOO(this.f94732OooOoO0, this.f94731OooOoO, this.f94733OooOoOO, this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            kotlin.jvm.internal.OooOOO0.OooO0Oo(obj);
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Ooo(C27129OoooOOO c27129OoooOOO, String str, String str2, String str3, Continuation<? super o00Ooo> continuation) {
        super(2, continuation);
        this.f94726OooOoO0 = c27129OoooOOO;
        this.f94725OooOoO = str;
        this.f94727OooOoOO = str2;
        this.f94728OooOoo0 = str3;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o00Ooo(this.f94726OooOoO0, this.f94725OooOoO, this.f94727OooOoOO, this.f94728OooOoo0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Integer> continuation) {
        return ((o00Ooo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = this.f94723OooOo;
        try {
            if (i3 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C27129OoooOOO c27129OoooOOO = this.f94726OooOoO0;
                OooO00o oooO00o = new OooO00o(c27129OoooOOO, this.f94725OooOoO, this.f94727OooOoOO, this.f94728OooOoo0, null);
                this.f94723OooOo = 1;
                int i4 = C27129OoooOOO.f94595OooO;
                obj = c27129OoooOOO.OooO0O0(oooO00o, this);
                if (obj == enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = this.f94724OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                i = i2;
                return new Integer(i);
            }
            C32446OooOOOo.OooO0O0(obj);
            UserApiResultDto userApiResultDto = (UserApiResultDto) obj;
            i = Integer.parseInt(userApiResultDto.getErrorCode());
            if (i == 0) {
                C25086OooOo0O c25086OooOo0O = this.f94726OooOoO0.f94598OooO0OO;
                User user = userApiResultDto.getUser();
                this.f94724OooOo0o = i;
                this.f94723OooOo = 2;
                if (c25086OooOo0O.OooO0O0(user, this) != enumC32485OooO00o) {
                    i2 = i;
                    i = i2;
                }
                return enumC32485OooO00o;
            }
            return new Integer(i);
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("UserRepoImpl");
            c20358OooO00o.OooO0Oo(e, "updatePhone error", new Object[0]);
            return new Integer(-999);
        }
    }
}

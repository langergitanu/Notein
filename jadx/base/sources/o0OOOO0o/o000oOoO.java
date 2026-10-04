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
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.user.UserRepoImpl$fetchUserInfoSync$2", m80623f = "UserRepoImpl.kt", m80624l = {191, 195, 201}, m80625m = "invokeSuspend")
public final class o000oOoO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super User>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27129OoooOOO f94701OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f94702OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f94703OooOoO0;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.user.UserRepoImpl$fetchUserInfoSync$2$result$1", m80623f = "UserRepoImpl.kt", m80624l = {191}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super UserApiResultDto>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C27129OoooOOO f94704OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f94705OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C27129OoooOOO c27129OoooOOO, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f94704OooOo = c27129OoooOOO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f94704OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super UserApiResultDto> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f94705OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C27119Oooo0OO c27119Oooo0OO = this.f94704OooOo.f94599OooO0Oo;
                this.f94705OooOo0o = 1;
                obj = c27119Oooo0OO.OooO00o(this);
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
    public o000oOoO(C27129OoooOOO c27129OoooOOO, String str, Continuation<? super o000oOoO> continuation) {
        super(2, continuation);
        this.f94701OooOo = c27129OoooOOO;
        this.f94703OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o000oOoO(this.f94701OooOo, this.f94703OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super User> continuation) {
        return ((o000oOoO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072 A[RETURN] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f94702OooOo0o;
        C27129OoooOOO c27129OoooOOO = this.f94701OooOo;
        try {
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("UserRepoImpl");
            c20358OooO00o.OooO0Oo(e, "fetchUserInfoSync error", new Object[0]);
        }
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            OooO00o oooO00o = new OooO00o(c27129OoooOOO, null);
            this.f94702OooOo0o = 1;
            int i2 = C27129OoooOOO.f94595OooO;
            obj = c27129OoooOOO.OooO0O0(oooO00o, this);
            if (obj == enumC32485OooO00o) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return obj;
            }
            C32446OooOOOo.OooO0O0(obj);
            C25086OooOo0O c25086OooOo0O = c27129OoooOOO.f94598OooO0OO;
            this.f94702OooOo0o = 3;
            Object objOooO0OO = c25086OooOo0O.OooO0OO(this.f94703OooOoO0, this);
            return objOooO0OO != enumC32485OooO00o ? enumC32485OooO00o : objOooO0OO;
        }
        C32446OooOOOo.OooO0O0(obj);
        UserApiResultDto userApiResultDto = (UserApiResultDto) obj;
        if (Integer.parseInt(userApiResultDto.getErrorCode()) == 0) {
            C25086OooOo0O c25086OooOo0O2 = c27129OoooOOO.f94598OooO0OO;
            User user = userApiResultDto.getUser();
            this.f94702OooOo0o = 2;
            if (c25086OooOo0O2.OooO0O0(user, this) != enumC32485OooO00o) {
                C25086OooOo0O c25086OooOo0O3 = c27129OoooOOO.f94598OooO0OO;
                this.f94702OooOo0o = 3;
                Object objOooO0OO2 = c25086OooOo0O3.OooO0OO(this.f94703OooOoO0, this);
                if (objOooO0OO2 != enumC32485OooO00o) {
                }
            }
        }
    }
}

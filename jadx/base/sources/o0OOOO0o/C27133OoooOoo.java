package o0OOOO0o;

import com.orion.notein.App;
import com.orion.notein.data.service.dto.UserApiResultDto;
import com.orion.notein.domain.models.User;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24332OooO;
import o0000oOO.C24334OooO0O0;
import o00Ooo.C25086OooOo0O;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOOO0o.OoooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.user.UserRepoImpl$loginByPhoneNumberAndVerificationCode$2", m80623f = "UserRepoImpl.kt", m80624l = {59, 68, 69}, m80625m = "invokeSuspend")
public final class C27133OoooOoo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Integer>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public UserApiResultDto f94632OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f94633OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f94634OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f94635OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C27129OoooOOO f94636OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ String f94637OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ String f94638OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ String f94639OooOooO;

    /* JADX INFO: renamed from: o0OOOO0o.OoooOoo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.user.UserRepoImpl$loginByPhoneNumberAndVerificationCode$2$1", m80623f = "UserRepoImpl.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24334OooO0O0, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ String f94640OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f94641OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ UserApiResultDto f94642OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(String str, UserApiResultDto userApiResultDto, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f94640OooOo = str;
            this.f94642OooOoO0 = userApiResultDto;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f94640OooOo, this.f94642OooOoO0, continuation);
            oooO00o.f94641OooOo0o = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(C24334OooO0O0 c24334OooO0O0, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(c24334OooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            C24334OooO0O0 c24334OooO0O0 = (C24334OooO0O0) this.f94641OooOo0o;
            AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = App.f69543OooOoo0;
            c24334OooO0O0.OooO0oO(App.f69542OooOoo, this.f94640OooOo);
            c24334OooO0O0.OooO0oO(App.f69544OooOooO, this.f94642OooOoO0.getUser().getId());
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27133OoooOoo(C27129OoooOOO c27129OoooOOO, String str, String str2, String str3, Continuation<? super C27133OoooOoo> continuation) {
        super(2, continuation);
        this.f94636OooOoOO = c27129OoooOOO;
        this.f94638OooOoo0 = str;
        this.f94637OooOoo = str2;
        this.f94639OooOooO = str3;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27133OoooOoo(this.f94636OooOoOO, this.f94638OooOoo0, this.f94637OooOoo, this.f94639OooOooO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Integer> continuation) {
        return ((C27133OoooOoo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0098  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        int i;
        UserApiResultDto userApiResultDto;
        int i2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = this.f94634OooOoO;
        C27129OoooOOO c27129OoooOOO = this.f94636OooOoOO;
        try {
            if (i3 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C27119Oooo0OO c27119Oooo0OO = c27129OoooOOO.f94599OooO0Oo;
                String str2 = this.f94638OooOoo0;
                String str3 = this.f94637OooOoo;
                String str4 = this.f94639OooOooO;
                this.f94634OooOoO = 1;
                obj = c27119Oooo0OO.OooO0OO(str2, str3, str4, this);
                if (obj == enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = this.f94635OooOoO0;
                    C32446OooOOOo.OooO0O0(obj);
                    i = i2;
                    return new Integer(i);
                }
                i = this.f94635OooOoO0;
                userApiResultDto = this.f94632OooOo;
                str = this.f94633OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                o0000o0O.OooOO0<AbstractC24338OooO0o0> oooOO02 = c27129OoooOOO.f94596OooO00o;
                OooO00o oooO00o = new OooO00o(str, userApiResultDto, null);
                this.f94633OooOo0o = null;
                this.f94632OooOo = null;
                this.f94635OooOoO0 = i;
                this.f94634OooOoO = 3;
                obj = C24332OooO.OooO00o(oooOO02, oooO00o, this);
                if (obj != enumC32485OooO00o) {
                    i2 = i;
                    i = i2;
                    return new Integer(i);
                }
                return enumC32485OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            C32443OooOOO c32443OooOOO = (C32443OooOOO) obj;
            str = (String) c32443OooOOO.f116638OooOo0o;
            UserApiResultDto userApiResultDto2 = (UserApiResultDto) c32443OooOOO.f116637OooOo;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(userApiResultDto2);
            i = Integer.parseInt(userApiResultDto2.getErrorCode());
            if (i == 0) {
                if (str != null && str.length() != 0) {
                    C25086OooOo0O c25086OooOo0O = c27129OoooOOO.f94598OooO0OO;
                    User user = userApiResultDto2.getUser();
                    this.f94633OooOo0o = str;
                    this.f94632OooOo = userApiResultDto2;
                    this.f94635OooOoO0 = i;
                    this.f94634OooOoO = 2;
                    if (c25086OooOo0O.OooO0O0(user, this) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                    userApiResultDto = userApiResultDto2;
                    o0000o0O.OooOO0<AbstractC24338OooO0o0> oooOO022 = c27129OoooOOO.f94596OooO00o;
                    OooO00o oooO00o2 = new OooO00o(str, userApiResultDto, null);
                    this.f94633OooOo0o = null;
                    this.f94632OooOo = null;
                    this.f94635OooOoO0 = i;
                    this.f94634OooOoO = 3;
                    obj = C24332OooO.OooO00o(oooOO022, oooO00o2, this);
                    if (obj != enumC32485OooO00o) {
                    }
                    return enumC32485OooO00o;
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("UserRepoImpl");
                c20358OooO00o.OooO0OO("Login's authorization doesn't exist.", new Object[0]);
                return new Integer(-999);
            }
            return new Integer(i);
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("UserRepoImpl");
            c20358OooO00o2.OooO0Oo(e, "loginByPhoneNumberAndVerificationCode error", new Object[0]);
            return new Integer(-999);
        }
    }
}

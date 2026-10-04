package o0OOOO0o;

import com.orion.notein.data.service.dto.UserApiResultDto;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOOO0o.Ooooo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.user.UserRepoImpl$logoff$2", m80623f = "UserRepoImpl.kt", m80624l = {120, 124}, m80625m = "invokeSuspend")
public final class C27134Ooooo00 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Integer>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f94643OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f94644OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f94645OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C27129OoooOOO f94646OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f94647OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ String f94648OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ String f94649OooOoo0;

    /* JADX INFO: renamed from: o0OOOO0o.Ooooo00$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.user.UserRepoImpl$logoff$2$result$1", m80623f = "UserRepoImpl.kt", m80624l = {120}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super UserApiResultDto>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C27129OoooOOO f94650OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f94651OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ String f94652OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ String f94653OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ String f94654OooOoOO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C27129OoooOOO c27129OoooOOO, String str, String str2, String str3, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f94650OooOo = c27129OoooOOO;
            this.f94653OooOoO0 = str;
            this.f94652OooOoO = str2;
            this.f94654OooOoOO = str3;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f94650OooOo, this.f94653OooOoO0, this.f94652OooOoO, this.f94654OooOoOO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super UserApiResultDto> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f94651OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C27119Oooo0OO c27119Oooo0OO = this.f94650OooOo.f94599OooO0Oo;
                this.f94651OooOo0o = 1;
                obj = c27119Oooo0OO.OooO0o0(this.f94653OooOoO0, this.f94652OooOoO, this.f94654OooOoOO, this);
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
    public C27134Ooooo00(C27129OoooOOO c27129OoooOOO, String str, String str2, String str3, String str4, Continuation<? super C27134Ooooo00> continuation) {
        super(2, continuation);
        this.f94646OooOoO0 = c27129OoooOOO;
        this.f94645OooOoO = str;
        this.f94647OooOoOO = str2;
        this.f94649OooOoo0 = str3;
        this.f94648OooOoo = str4;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27134Ooooo00(this.f94646OooOoO0, this.f94645OooOoO, this.f94647OooOoOO, this.f94649OooOoo0, this.f94648OooOoo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Integer> continuation) {
        return ((C27134Ooooo00) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = this.f94643OooOo;
        try {
            if (i3 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C27129OoooOOO c27129OoooOOO = this.f94646OooOoO0;
                OooO00o oooO00o = new OooO00o(c27129OoooOOO, this.f94647OooOoOO, this.f94649OooOoo0, this.f94648OooOoo, null);
                this.f94643OooOo = 1;
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
                i2 = this.f94644OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                i = i2;
                return new Integer(i);
            }
            C32446OooOOOo.OooO0O0(obj);
            i = Integer.parseInt(((UserApiResultDto) obj).getErrorCode());
            if (i == 0) {
                C27129OoooOOO c27129OoooOOO2 = this.f94646OooOoO0;
                String str = this.f94645OooOoO;
                this.f94644OooOo0o = i;
                this.f94643OooOo = 2;
                if (c27129OoooOOO2.OooO0oo(str, this) != enumC32485OooO00o) {
                    i2 = i;
                    i = i2;
                }
                return enumC32485OooO00o;
            }
            return new Integer(i);
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("UserRepoImpl");
            c20358OooO00o.OooO0Oo(e, "logoff error", new Object[0]);
            return new Integer(-999);
        }
    }
}

package o0OOOO0o;

import com.aspose.words.StyleIdentifier;
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

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.user.UserRepoImpl$submitVerificationCode$2", m80623f = "UserRepoImpl.kt", m80624l = {StyleIdentifier.INTENSE_REFERENCE}, m80625m = "invokeSuspend")
public final class o00O0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Integer>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27129OoooOOO f94706OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f94707OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f94708OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f94709OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f94710OooOoOO;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.user.UserRepoImpl$submitVerificationCode$2$result$1", m80623f = "UserRepoImpl.kt", m80624l = {StyleIdentifier.INTENSE_REFERENCE}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super UserApiResultDto>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C27129OoooOOO f94711OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f94712OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ String f94713OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ String f94714OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ String f94715OooOoOO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C27129OoooOOO c27129OoooOOO, String str, String str2, String str3, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f94711OooOo = c27129OoooOOO;
            this.f94714OooOoO0 = str;
            this.f94713OooOoO = str2;
            this.f94715OooOoOO = str3;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f94711OooOo, this.f94714OooOoO0, this.f94713OooOoO, this.f94715OooOoOO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super UserApiResultDto> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f94712OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C27119Oooo0OO c27119Oooo0OO = this.f94711OooOo.f94599OooO0Oo;
                this.f94712OooOo0o = 1;
                obj = c27119Oooo0OO.OooOOO0(this.f94714OooOoO0, this.f94713OooOoO, this.f94715OooOoOO, this);
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
    public o00O0O(C27129OoooOOO c27129OoooOOO, String str, String str2, String str3, Continuation<? super o00O0O> continuation) {
        super(2, continuation);
        this.f94706OooOo = c27129OoooOOO;
        this.f94709OooOoO0 = str;
        this.f94708OooOoO = str2;
        this.f94710OooOoOO = str3;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o00O0O(this.f94706OooOo, this.f94709OooOoO0, this.f94708OooOoO, this.f94710OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Integer> continuation) {
        return ((o00O0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f94707OooOo0o;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C27129OoooOOO c27129OoooOOO = this.f94706OooOo;
                OooO00o oooO00o = new OooO00o(c27129OoooOOO, this.f94709OooOoO0, this.f94708OooOoO, this.f94710OooOoOO, null);
                this.f94707OooOo0o = 1;
                int i2 = C27129OoooOOO.f94595OooO;
                obj = c27129OoooOOO.OooO0O0(oooO00o, this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return new Integer(Integer.parseInt(((UserApiResultDto) obj).getErrorCode()));
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("UserRepoImpl");
            c20358OooO00o.OooO0Oo(e, "submitVerificationCode error", new Object[0]);
            return new Integer(-999);
        }
    }
}

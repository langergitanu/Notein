package o0Oo0ooo;

import com.orion.notein.domain.models.login.LoginErrorCode;
import kotlin.coroutines.Continuation;
import o0OOOO0o.C27129OoooOOO;
import o0OOOo0.C27174OooO0O0;
import o0Oo0ooo.AbstractC28490OooOoOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.C33781o00o0O;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0Oo0ooo.Oooo000, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.VerificationSubmissionViewModel$verifyCodeForPasswordResetBeforeLogin$2", m80623f = "VerificationSubmissionViewModel.kt", m80624l = {78, 88, 111, 116}, m80625m = "invokeSuspend")
public final class C28498Oooo000 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C28496OooOooO f101003OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f101004OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f101005OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C28495OooOoo0 f101006OooOoO0;

    /* JADX INFO: renamed from: o0Oo0ooo.Oooo000$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.VerificationSubmissionViewModel$verifyCodeForPasswordResetBeforeLogin$2$response$1", m80623f = "VerificationSubmissionViewModel.kt", m80624l = {82}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C27174OooO0O0<Boolean>>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C28496OooOooO f101007OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f101008OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ String f101009OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ C28495OooOoo0 f101010OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(String str, Continuation continuation, C28495OooOoo0 c28495OooOoo0, C28496OooOooO c28496OooOooO) {
            super(2, continuation);
            this.f101007OooOo = c28496OooOooO;
            this.f101010OooOoO0 = c28495OooOoo0;
            this.f101009OooOoO = str;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f101009OooOoO, continuation, this.f101010OooOoO0, this.f101007OooOo);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C27174OooO0O0<Boolean>> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f101008OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C27129OoooOOO c27129OoooOOO = this.f101007OooOo.f100981OooO0Oo;
                C28495OooOoo0 c28495OooOoo0 = this.f101010OooOoO0;
                this.f101008OooOo0o = 1;
                obj = c27129OoooOOO.f94599OooO0Oo.OooOOOo(c28495OooOoo0.f100978OooO00o, c28495OooOoo0.f100979OooO0O0, this.f101009OooOoO, this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return (C27174OooO0O0) obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28498Oooo000(String str, Continuation continuation, C28495OooOoo0 c28495OooOoo0, C28496OooOooO c28496OooOooO) {
        super(2, continuation);
        this.f101003OooOo = c28496OooOooO;
        this.f101006OooOoO0 = c28495OooOoo0;
        this.f101005OooOoO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28498Oooo000(this.f101005OooOoO, continuation, this.f101006OooOoO0, this.f101003OooOo);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28498Oooo000) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        if (r13.emit(r1, r12) == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c1, code lost:
    
        if (r1.emit(r13, r12) == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d1, code lost:
    
        if (r1.emit(r13, r12) == r0) goto L38;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        C33781o00o0O c33781o00o0O;
        Object value2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f101004OooOo0o;
        C28495OooOoo0 c28495OooOoo0 = this.f101006OooOoO0;
        String str = this.f101005OooOoO;
        C28496OooOooO c28496OooOooO = this.f101003OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            OooO00o oooO00o = new OooO00o(str, null, c28495OooOoo0, c28496OooOooO);
            this.f101004OooOo0o = 1;
            obj = C33609OooO0oo.OooO0o(executorC33873OooO0O0, oooO00o, this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2 && i != 3 && i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        C27174OooO0O0 c27174OooO0O0 = (C27174OooO0O0) obj;
        if (!c27174OooO0O0.f94862OooO00o || !kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O0.OooO0O0(), Boolean.TRUE)) {
            C33781o00o0O c33781o00o0O2 = c28496OooOooO.f100983OooO0o0;
            do {
                value = c33781o00o0O2.getValue();
            } while (!c33781o00o0O2.OooO(value, C28482OooOOoo.OooO00o((C28482OooOOoo) value, false, null, 1)));
            String errorCode = c27174OooO0O0.getErrorCode();
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(errorCode, LoginErrorCode.ERROR_CODE_VERIFICATION_CODE_ERROR)) {
                do {
                    c33781o00o0O = c28496OooOooO.f100983OooO0o0;
                    value2 = c33781o00o0O.getValue();
                } while (!c33781o00o0O.OooO(value2, C28482OooOOoo.OooO00o((C28482OooOOoo) value2, false, EnumC28488OooOoO.f100950OooOo0o, 3)));
            } else {
                boolean zOooO0O0 = kotlin.jvm.internal.OooOOO0.OooO0O0(errorCode, LoginErrorCode.ERROR_CODE_USER_NOT_EXIST);
                C33772OooooOo c33772OooooOo = c28496OooOooO.f100984OooO0oO;
                if (zOooO0O0) {
                    AbstractC28490OooOoOO.C28493OooO0oO c28493OooO0oO = new AbstractC28490OooOoOO.C28493OooO0oO(EnumC28500Oooo00o.f101019OooOo);
                    this.f101004OooOo0o = 3;
                } else {
                    AbstractC28490OooOoOO.C28493OooO0oO c28493OooO0oO2 = new AbstractC28490OooOoOO.C28493OooO0oO(EnumC28500Oooo00o.f101020OooOo0o);
                    this.f101004OooOo0o = 4;
                }
            }
            return C32460OooOooO.f116667OooO00o;
        }
        C33781o00o0O c33781o00o0O3 = c28496OooOooO.f100983OooO0o0;
        C28482OooOOoo c28482OooOOoo = new C28482OooOOoo(0);
        c33781o00o0O3.getClass();
        c33781o00o0O3.OooOO0(null, c28482OooOOoo);
        C33772OooooOo c33772OooooOo2 = c28496OooOooO.f100984OooO0oO;
        AbstractC28490OooOoOO.OooO0o oooO0o = new AbstractC28490OooOoOO.OooO0o(c28495OooOoo0.f100978OooO00o, c28495OooOoo0.f100979OooO0O0, str);
        this.f101004OooOo0o = 2;
    }
}

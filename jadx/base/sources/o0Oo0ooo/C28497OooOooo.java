package o0Oo0ooo;

import com.aspose.words.StyleIdentifier;
import kotlin.coroutines.Continuation;
import o0OOOO0o.C27129OoooOOO;
import o0OOOO0o.o00O0O;
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

/* JADX INFO: renamed from: o0Oo0ooo.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.VerificationSubmissionViewModel$verifyCodeForPasswordResetAfterLogin$2", m80623f = "VerificationSubmissionViewModel.kt", m80624l = {StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_1, StyleIdentifier.LIST_TABLE_2_ACCENT_3, StyleIdentifier.LIST_TABLE_4_ACCENT_6}, m80625m = "invokeSuspend")
public final class C28497OooOooo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C28496OooOooO f100995OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f100996OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C28495OooOoo0 f100997OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f100998OooOoO0;

    /* JADX INFO: renamed from: o0Oo0ooo.OooOooo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.VerificationSubmissionViewModel$verifyCodeForPasswordResetAfterLogin$2$result$1", m80623f = "VerificationSubmissionViewModel.kt", m80624l = {StyleIdentifier.LIST_TABLE_2_ACCENT_2}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Integer>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C28496OooOooO f100999OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f101000OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ String f101001OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ C28495OooOoo0 f101002OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(String str, Continuation continuation, C28495OooOoo0 c28495OooOoo0, C28496OooOooO c28496OooOooO) {
            super(2, continuation);
            this.f100999OooOo = c28496OooOooO;
            this.f101002OooOoO0 = c28495OooOoo0;
            this.f101001OooOoO = str;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f101001OooOoO, continuation, this.f101002OooOoO0, this.f100999OooOo);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Integer> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f101000OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C27129OoooOOO c27129OoooOOO = this.f100999OooOo.f100981OooO0Oo;
                C28495OooOoo0 c28495OooOoo0 = this.f101002OooOoO0;
                this.f101000OooOo0o = 1;
                c27129OoooOOO.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o00O0O(c27129OoooOOO, c28495OooOoo0.f100978OooO00o, c28495OooOoo0.f100979OooO0O0, this.f101001OooOoO, null), this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return new Integer(((Number) obj).intValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28497OooOooo(String str, Continuation continuation, C28495OooOoo0 c28495OooOoo0, C28496OooOooO c28496OooOooO) {
        super(2, continuation);
        this.f100995OooOo = c28496OooOooO;
        this.f100998OooOoO0 = str;
        this.f100997OooOoO = c28495OooOoo0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28497OooOooo(this.f100998OooOoO0, continuation, this.f100997OooOoO, this.f100995OooOo);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28497OooOooo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
    
        if (r10.emit(r1, r9) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a0, code lost:
    
        if (r10.emit(r1, r9) == r0) goto L30;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f100996OooOo0o;
        String str = this.f100998OooOoO0;
        C28496OooOooO c28496OooOooO = this.f100995OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            OooO00o oooO00o = new OooO00o(str, null, this.f100997OooOoO, c28496OooOooO);
            this.f100996OooOo0o = 1;
            obj = C33609OooO0oo.OooO0o(executorC33873OooO0O0, oooO00o, this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        int iIntValue = ((Number) obj).intValue();
        if (iIntValue != 0) {
            if (iIntValue != 4001) {
                C33781o00o0O c33781o00o0O = c28496OooOooO.f100983OooO0o0;
                do {
                    value2 = c33781o00o0O.getValue();
                } while (!c33781o00o0O.OooO(value2, C28482OooOOoo.OooO00o((C28482OooOOoo) value2, false, EnumC28488OooOoO.f100952OooOoO0, 1)));
                C33772OooooOo c33772OooooOo = c28496OooOooO.f100984OooO0oO;
                AbstractC28490OooOoOO.C28493OooO0oO c28493OooO0oO = new AbstractC28490OooOoOO.C28493OooO0oO(EnumC28500Oooo00o.f101020OooOo0o);
                this.f100996OooOo0o = 3;
            } else {
                C33781o00o0O c33781o00o0O2 = c28496OooOooO.f100983OooO0o0;
                do {
                    value = c33781o00o0O2.getValue();
                } while (!c33781o00o0O2.OooO(value, C28482OooOOoo.OooO00o((C28482OooOOoo) value, false, EnumC28488OooOoO.f100950OooOo0o, 1)));
            }
            return C32460OooOooO.f116667OooO00o;
        }
        C33781o00o0O c33781o00o0O3 = c28496OooOooO.f100983OooO0o0;
        C28482OooOOoo c28482OooOOoo = new C28482OooOOoo(0);
        c33781o00o0O3.getClass();
        c33781o00o0O3.OooOO0(null, c28482OooOOoo);
        C33772OooooOo c33772OooooOo2 = c28496OooOooO.f100984OooO0oO;
        AbstractC28490OooOoOO.C28492OooO0o0 c28492OooO0o0 = new AbstractC28490OooOoOO.C28492OooO0o0(str);
        this.f100996OooOo0o = 2;
    }
}

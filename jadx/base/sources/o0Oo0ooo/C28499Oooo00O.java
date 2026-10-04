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

/* JADX INFO: renamed from: o0Oo0ooo.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.VerificationSubmissionViewModel$verifyExistingPhoneCode$2", m80623f = "VerificationSubmissionViewModel.kt", m80624l = {StyleIdentifier.GRID_TABLE_7_COLORFUL, StyleIdentifier.GRID_TABLE_4_ACCENT_2, StyleIdentifier.GRID_TABLE_2_ACCENT_5}, m80625m = "invokeSuspend")
public final class C28499Oooo00O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C28496OooOooO f101011OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f101012OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f101013OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C28495OooOoo0 f101014OooOoO0;

    /* JADX INFO: renamed from: o0Oo0ooo.Oooo00O$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.VerificationSubmissionViewModel$verifyExistingPhoneCode$2$result$1", m80623f = "VerificationSubmissionViewModel.kt", m80624l = {StyleIdentifier.GRID_TABLE_4_ACCENT_1}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Integer>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C28496OooOooO f101015OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f101016OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ String f101017OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ C28495OooOoo0 f101018OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(String str, Continuation continuation, C28495OooOoo0 c28495OooOoo0, C28496OooOooO c28496OooOooO) {
            super(2, continuation);
            this.f101015OooOo = c28496OooOooO;
            this.f101018OooOoO0 = c28495OooOoo0;
            this.f101017OooOoO = str;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f101017OooOoO, continuation, this.f101018OooOoO0, this.f101015OooOo);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Integer> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f101016OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C27129OoooOOO c27129OoooOOO = this.f101015OooOo.f100981OooO0Oo;
                C28495OooOoo0 c28495OooOoo0 = this.f101018OooOoO0;
                this.f101016OooOo0o = 1;
                c27129OoooOOO.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o00O0O(c27129OoooOOO, c28495OooOoo0.f100978OooO00o, c28495OooOoo0.f100979OooO0O0, this.f101017OooOoO, null), this);
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
    public C28499Oooo00O(String str, Continuation continuation, C28495OooOoo0 c28495OooOoo0, C28496OooOooO c28496OooOooO) {
        super(2, continuation);
        this.f101011OooOo = c28496OooOooO;
        this.f101014OooOoO0 = c28495OooOoo0;
        this.f101013OooOoO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28499Oooo00O(this.f101013OooOoO, continuation, this.f101014OooOoO0, this.f101011OooOo);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28499Oooo00O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
    
        if (r10.emit(r1, r9) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009d, code lost:
    
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
        int i = this.f101012OooOo0o;
        C28496OooOooO c28496OooOooO = this.f101011OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            OooO00o oooO00o = new OooO00o(this.f101013OooOoO, null, this.f101014OooOoO0, c28496OooOooO);
            this.f101012OooOo0o = 1;
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
                this.f101012OooOo0o = 3;
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
        AbstractC28490OooOoOO.C28491OooO0Oo c28491OooO0Oo = AbstractC28490OooOoOO.C28491OooO0Oo.f100964OooO00o;
        this.f101012OooOo0o = 2;
    }
}

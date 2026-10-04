package o0Oo0ooo;

import kotlin.coroutines.Continuation;
import o0OOOO0o.C27129OoooOOO;
import o0Oo0ooo.AbstractC28485OooOo00;
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

/* JADX INFO: renamed from: o0Oo0ooo.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.VerificationRequestViewModel$requestVerificationCode$2", m80623f = "VerificationRequestViewModel.kt", m80624l = {96, 112, 130, 145}, m80625m = "invokeSuspend")
public final class C28487OooOo0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C28489OooOoO0 f100938OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f100939OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f100940OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f100941OooOoO0;

    /* JADX INFO: renamed from: o0Oo0ooo.OooOo0o$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.VerificationRequestViewModel$requestVerificationCode$2$isValid$1", m80623f = "VerificationRequestViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ String f100942OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C28489OooOoO0 f100943OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ String f100944OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C28489OooOoO0 c28489OooOoO0, String str, String str2, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f100943OooOo0o = c28489OooOoO0;
            this.f100942OooOo = str;
            this.f100944OooOoO0 = str2;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f100943OooOo0o, this.f100942OooOo, this.f100944OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            return Boolean.valueOf(this.f100943OooOo0o.f100955OooO0Oo.OooO00o(this.f100942OooOo, this.f100944OooOoO0));
        }
    }

    /* JADX INFO: renamed from: o0Oo0ooo.OooOo0o$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.VerificationRequestViewModel$requestVerificationCode$2$sendSuccess$1", m80623f = "VerificationRequestViewModel.kt", m80624l = {116}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C28489OooOoO0 f100945OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f100946OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ String f100947OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ String f100948OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(C28489OooOoO0 c28489OooOoO0, String str, String str2, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f100945OooOo = c28489OooOoO0;
            this.f100948OooOoO0 = str;
            this.f100947OooOoO = str2;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0O0(this.f100945OooOo, this.f100948OooOoO0, this.f100947OooOoO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f100946OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C27129OoooOOO c27129OoooOOO = this.f100945OooOo.f100957OooO0o0;
                this.f100946OooOo0o = 1;
                obj = c27129OoooOOO.OooOO0(this.f100948OooOoO0, this.f100947OooOoO, this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            Boolean bool = (Boolean) obj;
            bool.getClass();
            return bool;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28487OooOo0o(C28489OooOoO0 c28489OooOoO0, String str, String str2, Continuation<? super C28487OooOo0o> continuation) {
        super(2, continuation);
        this.f100938OooOo = c28489OooOoO0;
        this.f100941OooOoO0 = str;
        this.f100940OooOoO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28487OooOo0o(this.f100938OooOo, this.f100941OooOoO0, this.f100940OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28487OooOo0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00db, code lost:
    
        if (r2.emit(r3, r20) == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0106, code lost:
    
        if (r2.emit(r4, r20) == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00de  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object objOooO0o;
        Object objOooO0o2;
        Object value2;
        Object value3;
        Object value4;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f100939OooOo0o;
        String str = this.f100940OooOoO;
        String str2 = this.f100941OooOoO0;
        C28489OooOoO0 c28489OooOoO0 = this.f100938OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C33781o00o0O c33781o00o0O = c28489OooOoO0.f100956OooO0o;
            do {
                value = c33781o00o0O.getValue();
            } while (!c33781o00o0O.OooO(value, C28480OooOOo.OooO0O0((C28480OooOOo) value, this.f100941OooOoO0, this.f100940OooOoO, true, null, false, 0, 48)));
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            OooO00o oooO00o = new OooO00o(c28489OooOoO0, str2, str, null);
            this.f100939OooOo0o = 1;
            objOooO0o = C33609OooO0oo.OooO0o(executorC33873OooO0O0, oooO00o, this);
            if (objOooO0o != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
            objOooO0o = obj;
        } else {
            if (i != 2) {
                if (i != 3 && i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            objOooO0o2 = obj;
            if (((Boolean) objOooO0o2).booleanValue()) {
                C33781o00o0O c33781o00o0O2 = c28489OooOoO0.f100956OooO0o;
                do {
                    value3 = c33781o00o0O2.getValue();
                } while (!c33781o00o0O2.OooO(value3, C28480OooOOo.OooO0O0((C28480OooOOo) value3, null, null, false, EnumC28481OooOOo0.f100916OooOo, false, 0, 3)));
                C33772OooooOo c33772OooooOo = c28489OooOoO0.f100959OooO0oo;
                AbstractC28485OooOo00.OooO00o oooO00o2 = AbstractC28485OooOo00.OooO00o.f100930OooO00o;
                this.f100939OooOo0o = 4;
            } else {
                C33781o00o0O c33781o00o0O3 = c28489OooOoO0.f100956OooO0o;
                do {
                    value4 = c33781o00o0O3.getValue();
                } while (!c33781o00o0O3.OooO(value4, C28480OooOOo.OooO0O0((C28480OooOOo) value4, this.f100941OooOoO0, this.f100940OooOoO, false, null, false, 0, 48)));
                C28489OooOoO0.OooOO0(c28489OooOoO0);
                C33772OooooOo c33772OooooOo2 = c28489OooOoO0.f100959OooO0oo;
                AbstractC28485OooOo00.OooO0O0 oooO0O0 = new AbstractC28485OooOo00.OooO0O0(str2, str);
                this.f100939OooOo0o = 3;
            }
        }
        if (!((Boolean) objOooO0o).booleanValue()) {
            C33781o00o0O c33781o00o0O4 = c28489OooOoO0.f100956OooO0o;
            do {
                value2 = c33781o00o0O4.getValue();
            } while (!c33781o00o0O4.OooO(value2, C28480OooOOo.OooO0O0((C28480OooOOo) value2, null, null, false, EnumC28481OooOOo0.f100917OooOo0o, false, 0, 3)));
            return C32460OooOooO.f116667OooO00o;
        }
        C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
        ExecutorC33873OooO0O0 executorC33873OooO0O02 = ExecutorC33873OooO0O0.f122045OooOoO0;
        OooO0O0 oooO0O02 = new OooO0O0(c28489OooOoO0, str2, str, null);
        this.f100939OooOo0o = 2;
        objOooO0o2 = C33609OooO0oo.OooO0o(executorC33873OooO0O02, oooO0O02, this);
        if (objOooO0o2 != enumC32485OooO00o) {
            if (((Boolean) objOooO0o2).booleanValue()) {
            }
        }
        return enumC32485OooO00o;
    }
}

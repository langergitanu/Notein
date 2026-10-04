package o0OoO0OO;

import androidx.lifecycle.o0OoOo0;
import kotlin.coroutines.Continuation;
import o0OOOO0o.C27129OoooOOO;
import o0OoO0OO.InterfaceC28620OooOOoo;
import oO00ooO.C32445OooOOOO;
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
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoO0OO.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.thirdparty.PhoneBindingSkipViewModel$onSkipRequested$1", m80623f = "PhoneBindingSkipViewModel.kt", m80624l = {46, 58, 60}, m80625m = "invokeSuspend")
public final class C28624OooOo0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C28625OooOo0o f101453OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f101454OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f101455OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ int f101456OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f101457OooOoOO;

    /* JADX INFO: renamed from: o0OoO0OO.OooOo0O$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.thirdparty.PhoneBindingSkipViewModel$onSkipRequested$1$skipSucceeded$1", m80623f = "PhoneBindingSkipViewModel.kt", m80624l = {48}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ Object f101458OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f101459OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ int f101460OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ C28625OooOo0o f101461OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ String f101462OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final /* synthetic */ String f101463OooOoo0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C28625OooOo0o c28625OooOo0o, int i, String str, String str2, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f101461OooOoO0 = c28625OooOo0o;
            this.f101460OooOoO = i;
            this.f101462OooOoOO = str;
            this.f101463OooOoo0 = str2;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f101461OooOoO0, this.f101460OooOoO, this.f101462OooOoOO, this.f101463OooOoo0, continuation);
            oooO00o.f101458OooOo = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            Object objOooO00o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f101459OooOo0o;
            try {
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    C28625OooOo0o c28625OooOo0o = this.f101461OooOoO0;
                    int i2 = this.f101460OooOoO;
                    String str = this.f101462OooOoOO;
                    String str2 = this.f101463OooOoo0;
                    C27129OoooOOO c27129OoooOOO = c28625OooOo0o.f101465OooO0Oo;
                    this.f101459OooOo0o = 1;
                    obj = c27129OoooOOO.OooOOO0(i2, str, str2, this);
                    if (obj == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                }
                objOooO00o = (Boolean) obj;
                objOooO00o.getClass();
            } catch (Throwable th) {
                objOooO00o = C32446OooOOOo.OooO00o(th);
            }
            Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
            if (thOooO00o != null) {
                C34406OooO00o.f123390OooO00o.OooO0Oo(thOooO00o, "Skip bind phone request failed", new Object[0]);
            }
            return objOooO00o instanceof C32445OooOOOO.OooO00o ? Boolean.FALSE : objOooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28624OooOo0O(C28625OooOo0o c28625OooOo0o, int i, String str, String str2, Continuation<? super C28624OooOo0O> continuation) {
        super(2, continuation);
        this.f101453OooOo = c28625OooOo0o;
        this.f101456OooOoO0 = i;
        this.f101455OooOoO = str;
        this.f101457OooOoOO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28624OooOo0O(this.f101453OooOo, this.f101456OooOoO0, this.f101455OooOoO, this.f101457OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28624OooOo0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
    
        if (r1.emit(r13, r12) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009a, code lost:
    
        if (r1.emit(r13, r12) == r0) goto L28;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f101454OooOo0o;
        C28625OooOo0o c28625OooOo0o = this.f101453OooOo;
        C33781o00o0O c33781o00o0O = c28625OooOo0o.f101468OooO0oO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            do {
                value = c33781o00o0O.getValue();
                ((C28623OooOo00) value).getClass();
            } while (!c33781o00o0O.OooO(value, new C28623OooOo00(true)));
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            String str = this.f101457OooOoOO;
            OooO00o oooO00o = new OooO00o(c28625OooOo0o, this.f101456OooOoO0, this.f101455OooOoO, str, null);
            this.f101454OooOo0o = 1;
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
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        do {
            value2 = c33781o00o0O.getValue();
            ((C28623OooOo00) value2).getClass();
        } while (!c33781o00o0O.OooO(value2, new C28623OooOo00(false)));
        C33772OooooOo c33772OooooOo = c28625OooOo0o.f101464OooO;
        if (zBooleanValue) {
            InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c28625OooOo0o);
            C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C28622OooOo0(c28625OooOo0o, null), 2);
            InterfaceC28620OooOOoo.OooO0O0 oooO0O0 = InterfaceC28620OooOOoo.OooO0O0.f101447OooO00o;
            this.f101454OooOo0o = 2;
        } else {
            InterfaceC28620OooOOoo.OooO00o oooO00o2 = InterfaceC28620OooOOoo.OooO00o.f101446OooO00o;
            this.f101454OooOo0o = 3;
        }
    }
}

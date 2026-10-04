package o0OOo0o;

import com.orion.notein.domain.models.NoteinFirebaseUser;
import kotlin.coroutines.Continuation;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0OoO.C33799OooOO0O;

/* JADX INFO: renamed from: o0OOo0o.o00ooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27591o00ooOOo implements InterfaceC33721OooO0o<Integer> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27597o00ooo00 f96881OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C33799OooOO0O f96882OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ int f96883OooOoO0;

    /* JADX INFO: renamed from: o0OOo0o.o00ooOOo$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C27597o00ooo00 f96884OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f96885OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ int f96886OooOoO0;

        /* JADX INFO: renamed from: o0OOo0o.o00ooOOo$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.VipFeatureUseCase$whetherToAllowTheFeatureByGoogleBilling$$inlined$map$1$2", m80623f = "VipFeatureUseCase.kt", m80624l = {52, 50}, m80625m = "emit")
        public static final class C19865OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f96887OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f96888OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public InterfaceC33723OooO0oO f96890OooOoO0;

            public C19865OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f96888OooOo0o = obj;
                this.f96887OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, C27597o00ooo00 c27597o00ooo00, int i) {
            this.f96885OooOo0o = interfaceC33723OooO0oO;
            this.f96884OooOo = c27597o00ooo00;
            this.f96886OooOoO0 = i;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
        
            if (r7.emit(r8, r0) == r1) goto L22;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C19865OooO00o c19865OooO00o;
            InterfaceC33723OooO0oO interfaceC33723OooO0oO;
            if (continuation instanceof C19865OooO00o) {
                c19865OooO00o = (C19865OooO00o) continuation;
                int i = c19865OooO00o.f96887OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19865OooO00o.f96887OooOo = i - Integer.MIN_VALUE;
                } else {
                    c19865OooO00o = new C19865OooO00o(continuation);
                }
            }
            Object obj2 = c19865OooO00o.f96888OooOo0o;
            Object obj3 = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19865OooO00o.f96887OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                NoteinFirebaseUser noteinFirebaseUser = (NoteinFirebaseUser) ((C32443OooOOO) obj).f116638OooOo0o;
                InterfaceC33723OooO0oO interfaceC33723OooO0oO2 = this.f96885OooOo0o;
                c19865OooO00o.f96890OooOoO0 = interfaceC33723OooO0oO2;
                c19865OooO00o.f96887OooOo = 1;
                Object objOooO00o = C27597o00ooo00.OooO00o(this.f96884OooOo, this.f96886OooOoO0, noteinFirebaseUser, c19865OooO00o);
                if (objOooO00o != obj3) {
                    obj2 = objOooO00o;
                    interfaceC33723OooO0oO = interfaceC33723OooO0oO2;
                }
                return obj3;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj2);
                return C32460OooOooO.f116667OooO00o;
            }
            InterfaceC33723OooO0oO interfaceC33723OooO0oO3 = c19865OooO00o.f96890OooOoO0;
            C32446OooOOOo.OooO0O0(obj2);
            interfaceC33723OooO0oO = interfaceC33723OooO0oO3;
            c19865OooO00o.f96890OooOoO0 = null;
            c19865OooO00o.f96887OooOo = 2;
        }
    }

    public C27591o00ooOOo(C33799OooOO0O c33799OooOO0O, C27597o00ooo00 c27597o00ooo00, int i) {
        this.f96882OooOo0o = c33799OooOO0O;
        this.f96881OooOo = c27597o00ooo00;
        this.f96883OooOoO0 = i;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super Integer> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f96882OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f96881OooOo, this.f96883OooOoO0), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}

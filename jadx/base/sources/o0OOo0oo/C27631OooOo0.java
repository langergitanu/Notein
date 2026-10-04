package o0OOo0oo;

import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OOo0oo.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27631OooOo0 implements InterfaceC33721OooO0o<Integer> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27635OooOoO f97160OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f97161OooOo0o;

    /* JADX INFO: renamed from: o0OOo0oo.OooOo0$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C27635OooOoO f97162OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f97163OooOo0o;

        /* JADX INFO: renamed from: o0OOo0oo.OooOo0$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.CloudSyncNetworkStrategyUseCase$get$$inlined$map$1$2", m80623f = "CloudSyncNetworkStrategyUseCase.kt", m80624l = {50}, m80625m = "emit")
        public static final class C19867OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f97164OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f97165OooOo0o;

            public C19867OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f97165OooOo0o = obj;
                this.f97164OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, C27635OooOoO c27635OooOoO) {
            this.f97163OooOo0o = interfaceC33723OooO0oO;
            this.f97162OooOo = c27635OooOoO;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C19867OooO00o c19867OooO00o;
            if (continuation instanceof C19867OooO00o) {
                c19867OooO00o = (C19867OooO00o) continuation;
                int i = c19867OooO00o.f97164OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19867OooO00o.f97164OooOo = i - Integer.MIN_VALUE;
                } else {
                    c19867OooO00o = new C19867OooO00o(continuation);
                }
            }
            Object obj2 = c19867OooO00o.f97165OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19867OooO00o.f97164OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                Object objOooO0OO = ((AbstractC24338OooO0o0) obj).OooO0OO(this.f97162OooOo.f97186OooO0Oo);
                c19867OooO00o.f97164OooOo = 1;
                if (this.f97163OooOo0o.emit(objOooO0OO, c19867OooO00o) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj2);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public C27631OooOo0(InterfaceC33721OooO0o interfaceC33721OooO0o, C27635OooOoO c27635OooOoO) {
        this.f97161OooOo0o = interfaceC33721OooO0o;
        this.f97160OooOo = c27635OooOoO;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super Integer> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f97161OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f97160OooOo), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}

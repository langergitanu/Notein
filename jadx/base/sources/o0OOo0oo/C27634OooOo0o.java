package o0OOo0oo;

import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0OOooO0.EnumC27953o00000Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OOo0oo.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27634OooOo0o implements InterfaceC33721OooO0o<EnumC27953o00000Oo> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27635OooOoO f97175OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f97176OooOo0o;

    /* JADX INFO: renamed from: o0OOo0oo.OooOo0o$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C27635OooOoO f97177OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f97178OooOo0o;

        /* JADX INFO: renamed from: o0OOo0oo.OooOo0o$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.CloudSyncNetworkStrategyUseCase$getFlow$$inlined$map$1$2", m80623f = "CloudSyncNetworkStrategyUseCase.kt", m80624l = {50}, m80625m = "emit")
        public static final class C19868OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f97179OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f97180OooOo0o;

            public C19868OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f97180OooOo0o = obj;
                this.f97179OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, C27635OooOoO c27635OooOoO) {
            this.f97178OooOo0o = interfaceC33723OooO0oO;
            this.f97177OooOo = c27635OooOoO;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C19868OooO00o c19868OooO00o;
            EnumC27953o00000Oo enumC27953o00000Oo;
            if (continuation instanceof C19868OooO00o) {
                c19868OooO00o = (C19868OooO00o) continuation;
                int i = c19868OooO00o.f97179OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19868OooO00o.f97179OooOo = i - Integer.MIN_VALUE;
                } else {
                    c19868OooO00o = new C19868OooO00o(continuation);
                }
            }
            Object obj2 = c19868OooO00o.f97180OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19868OooO00o.f97179OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                Integer num = (Integer) ((AbstractC24338OooO0o0) obj).OooO0OO(this.f97177OooOo.f97186OooO0Oo);
                if (num != null) {
                    int iIntValue = num.intValue();
                    enumC27953o00000Oo = iIntValue != 0 ? iIntValue != 1 ? EnumC27953o00000Oo.f98990OooOo : EnumC27953o00000Oo.f98990OooOo : EnumC27953o00000Oo.f98991OooOo0o;
                } else {
                    enumC27953o00000Oo = C27635OooOoO.f97182OooO0o0;
                }
                c19868OooO00o.f97179OooOo = 1;
                if (this.f97178OooOo0o.emit(enumC27953o00000Oo, c19868OooO00o) == enumC32485OooO00o) {
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

    public C27634OooOo0o(InterfaceC33721OooO0o interfaceC33721OooO0o, C27635OooOoO c27635OooOoO) {
        this.f97176OooOo0o = interfaceC33721OooO0o;
        this.f97175OooOo = c27635OooOoO;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super EnumC27953o00000Oo> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f97176OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f97175OooOo), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}

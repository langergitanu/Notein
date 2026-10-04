package o0OOooO0;

import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0OOooO0.C27883OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0O0o.C33599OooOo0O;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OOooO0.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27894OooOO0 implements InterfaceC33721OooO0o<C27883OooO00o.C27885OooO0Oo> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AbstractC24338OooO0o0.OooO00o f98611OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f98612OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ AbstractC24338OooO0o0.OooO00o f98613OooOoO0;

    /* JADX INFO: renamed from: o0OOooO0.OooOO0$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ AbstractC24338OooO0o0.OooO00o f98614OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f98615OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ AbstractC24338OooO0o0.OooO00o f98616OooOoO0;

        /* JADX INFO: renamed from: o0OOooO0.OooOO0$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.drive.CloudLockManager$loadLockLease$$inlined$map$1$2", m80623f = "CloudLockManager.kt", m80624l = {50}, m80625m = "emit")
        public static final class C19879OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f98617OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f98618OooOo0o;

            public C19879OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f98618OooOo0o = obj;
                this.f98617OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, AbstractC24338OooO0o0.OooO00o oooO00o, AbstractC24338OooO0o0.OooO00o oooO00o2) {
            this.f98615OooOo0o = interfaceC33723OooO0oO;
            this.f98614OooOo = oooO00o;
            this.f98616OooOoO0 = oooO00o2;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C19879OooO00o c19879OooO00o;
            if (continuation instanceof C19879OooO00o) {
                c19879OooO00o = (C19879OooO00o) continuation;
                int i = c19879OooO00o.f98617OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19879OooO00o.f98617OooOo = i - Integer.MIN_VALUE;
                } else {
                    c19879OooO00o = new C19879OooO00o(continuation);
                }
            }
            Object obj2 = c19879OooO00o.f98618OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19879OooO00o.f98617OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                AbstractC24338OooO0o0 abstractC24338OooO0o0 = (AbstractC24338OooO0o0) obj;
                String str = (String) abstractC24338OooO0o0.OooO0OO(this.f98614OooOo);
                Long l = (Long) abstractC24338OooO0o0.OooO0OO(this.f98616OooOoO0);
                C27883OooO00o.C27885OooO0Oo c27885OooO0Oo = (str == null || C33599OooOo0O.Oooo0o0(str) || l == null) ? null : new C27883OooO00o.C27885OooO0Oo(str, l.longValue());
                c19879OooO00o.f98617OooOo = 1;
                if (this.f98615OooOo0o.emit(c27885OooO0Oo, c19879OooO00o) == enumC32485OooO00o) {
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

    public C27894OooOO0(InterfaceC33721OooO0o interfaceC33721OooO0o, AbstractC24338OooO0o0.OooO00o oooO00o, AbstractC24338OooO0o0.OooO00o oooO00o2) {
        this.f98612OooOo0o = interfaceC33721OooO0o;
        this.f98611OooOo = oooO00o;
        this.f98613OooOoO0 = oooO00o2;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super C27883OooO00o.C27885OooO0Oo> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f98612OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f98611OooOo, this.f98613OooOoO0), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}

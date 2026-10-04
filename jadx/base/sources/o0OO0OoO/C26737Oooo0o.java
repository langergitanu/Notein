package o0OO0OoO;

import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0OOo0Oo.EnumC27285OooO;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OO0OoO.Oooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26737Oooo0o implements InterfaceC33721OooO0o<EnumC27285OooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C26740Oooo0oo f92477OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f92478OooOo0o;

    /* JADX INFO: renamed from: o0OO0OoO.Oooo0o$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C26740Oooo0oo f92479OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f92480OooOo0o;

        /* JADX INFO: renamed from: o0OO0OoO.Oooo0o$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.CloudSyncRepoImpl$special$$inlined$map$1$2", m80623f = "CloudSyncRepoImpl.kt", m80624l = {50}, m80625m = "emit")
        public static final class C19812OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f92481OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f92482OooOo0o;

            public C19812OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f92482OooOo0o = obj;
                this.f92481OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, C26740Oooo0oo c26740Oooo0oo) {
            this.f92480OooOo0o = interfaceC33723OooO0oO;
            this.f92479OooOo = c26740Oooo0oo;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C19812OooO00o c19812OooO00o;
            Object objOooO00o;
            if (continuation instanceof C19812OooO00o) {
                c19812OooO00o = (C19812OooO00o) continuation;
                int i = c19812OooO00o.f92481OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19812OooO00o.f92481OooOo = i - Integer.MIN_VALUE;
                } else {
                    c19812OooO00o = new C19812OooO00o(continuation);
                }
            }
            Object obj2 = c19812OooO00o.f92482OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19812OooO00o.f92481OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                String str = (String) ((AbstractC24338OooO0o0) obj).OooO0OO(this.f92479OooOo.f92495OooO0Oo);
                if (str != null) {
                    try {
                        objOooO00o = EnumC27285OooO.valueOf(str);
                    } catch (Throwable th) {
                        objOooO00o = C32446OooOOOo.OooO00o(th);
                    }
                    if (objOooO00o instanceof C32445OooOOOO.OooO00o) {
                        objOooO00o = null;
                    }
                    EnumC27285OooO enumC27285OooO = (EnumC27285OooO) objOooO00o;
                    if (enumC27285OooO == null) {
                        enumC27285OooO = EnumC27285OooO.f95076OooOo0o;
                    }
                    c19812OooO00o.f92481OooOo = 1;
                    if (this.f92480OooOo0o.emit(enumC27285OooO, c19812OooO00o) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
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

    public C26737Oooo0o(InterfaceC33721OooO0o interfaceC33721OooO0o, C26740Oooo0oo c26740Oooo0oo) {
        this.f92478OooOo0o = interfaceC33721OooO0o;
        this.f92477OooOo = c26740Oooo0oo;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super EnumC27285OooO> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f92478OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f92477OooOo), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}

package o0OO0o0;

import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes9.dex */
public final class o0OOO0o implements InterfaceC33721OooO0o<String> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f93105OooOo0o;

    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f93106OooOo0o;

        /* JADX INFO: renamed from: o0OO0o0.o0OOO0o$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.onedrive.OneDriveDriveSyncBackend$getCursorInternal$lambda$55$$inlined$map$1$2", m80623f = "OneDriveDriveSyncBackend.kt", m80624l = {50}, m80625m = "emit")
        public static final class C19820OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f93107OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f93108OooOo0o;

            public C19820OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f93108OooOo0o = obj;
                this.f93107OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
            this.f93106OooOo0o = interfaceC33723OooO0oO;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C19820OooO00o c19820OooO00o;
            if (continuation instanceof C19820OooO00o) {
                c19820OooO00o = (C19820OooO00o) continuation;
                int i = c19820OooO00o.f93107OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19820OooO00o.f93107OooOo = i - Integer.MIN_VALUE;
                } else {
                    c19820OooO00o = new C19820OooO00o(continuation);
                }
            }
            Object obj2 = c19820OooO00o.f93108OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19820OooO00o.f93107OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                Object objOooO0OO = ((AbstractC24338OooO0o0) obj).OooO0OO(o00oO0O.f93061OooOO0);
                c19820OooO00o.f93107OooOo = 1;
                if (this.f93106OooOo0o.emit(objOooO0OO, c19820OooO00o) == enumC32485OooO00o) {
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

    public o0OOO0o(InterfaceC33721OooO0o interfaceC33721OooO0o) {
        this.f93105OooOo0o = interfaceC33721OooO0o;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super String> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f93105OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}

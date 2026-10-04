package o0OOooO0;

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
public final class o0000Ooo implements InterfaceC33721OooO0o<Long> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AbstractC24338OooO0o0.OooO00o f98999OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f99000OooOo0o;

    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ AbstractC24338OooO0o0.OooO00o f99001OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f99002OooOo0o;

        /* JADX INFO: renamed from: o0OOooO0.o0000Ooo$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.drive.SyncCursorManager$getCursor$$inlined$map$1$2", m80623f = "SyncCursorManager.kt", m80624l = {50}, m80625m = "emit")
        public static final class C19880OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f99003OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f99004OooOo0o;

            public C19880OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f99004OooOo0o = obj;
                this.f99003OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, AbstractC24338OooO0o0.OooO00o oooO00o) {
            this.f99002OooOo0o = interfaceC33723OooO0oO;
            this.f99001OooOo = oooO00o;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C19880OooO00o c19880OooO00o;
            if (continuation instanceof C19880OooO00o) {
                c19880OooO00o = (C19880OooO00o) continuation;
                int i = c19880OooO00o.f99003OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19880OooO00o.f99003OooOo = i - Integer.MIN_VALUE;
                } else {
                    c19880OooO00o = new C19880OooO00o(continuation);
                }
            }
            Object obj2 = c19880OooO00o.f99004OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19880OooO00o.f99003OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                Object objOooO0OO = ((AbstractC24338OooO0o0) obj).OooO0OO(this.f99001OooOo);
                c19880OooO00o.f99003OooOo = 1;
                if (this.f99002OooOo0o.emit(objOooO0OO, c19880OooO00o) == enumC32485OooO00o) {
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

    public o0000Ooo(InterfaceC33721OooO0o interfaceC33721OooO0o, AbstractC24338OooO0o0.OooO00o oooO00o) {
        this.f99000OooOo0o = interfaceC33721OooO0o;
        this.f98999OooOo = oooO00o;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super Long> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f99000OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f98999OooOo), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}

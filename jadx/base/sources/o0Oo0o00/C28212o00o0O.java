package o0Oo0o00;

import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0OOo0oo.o00000O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0Oo0o00.o00o0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28212o00o0O implements InterfaceC33721OooO0o<Long> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f100008OooOo0o;

    /* JADX INFO: renamed from: o0Oo0o00.o00o0O$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f100009OooOo0o;

        /* JADX INFO: renamed from: o0Oo0o00.o00o0O$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.datasync.CloudSyncViewModel$special$$inlined$map$1$2", m80623f = "CloudSyncViewModel.kt", m80624l = {50}, m80625m = "emit")
        public static final class C19896OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f100010OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f100011OooOo0o;

            public C19896OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f100011OooOo0o = obj;
                this.f100010OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
            this.f100009OooOo0o = interfaceC33723OooO0oO;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C19896OooO00o c19896OooO00o;
            if (continuation instanceof C19896OooO00o) {
                c19896OooO00o = (C19896OooO00o) continuation;
                int i = c19896OooO00o.f100010OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19896OooO00o.f100010OooOo = i - Integer.MIN_VALUE;
                } else {
                    c19896OooO00o = new C19896OooO00o(continuation);
                }
            }
            Object obj2 = c19896OooO00o.f100011OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19896OooO00o.f100010OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                Long l = (Long) ((AbstractC24338OooO0o0) obj).OooO0OO(o00000O.f97395OooO0O0);
                Long l2 = new Long(l != null ? l.longValue() : 0L);
                c19896OooO00o.f100010OooOo = 1;
                if (this.f100009OooOo0o.emit(l2, c19896OooO00o) == enumC32485OooO00o) {
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

    public C28212o00o0O(InterfaceC33721OooO0o interfaceC33721OooO0o) {
        this.f100008OooOo0o = interfaceC33721OooO0o;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super Long> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f100008OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}

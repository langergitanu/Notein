package o0o00oOo;

import com.orion.notein.p607ui.settings.debug.DebugFragment;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0o00oOo.o000000o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30081o000000o implements InterfaceC33721OooO0o<Boolean> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f107035OooOo0o;

    /* JADX INFO: renamed from: o0o00oOo.o000000o$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f107036OooOo0o;

        /* JADX INFO: renamed from: o0o00oOo.o000000o$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListViewModel$special$$inlined$map$6$2", m80623f = "NoteListViewModel.kt", m80624l = {50}, m80625m = "emit")
        public static final class C20039OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f107037OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f107038OooOo0o;

            public C20039OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f107038OooOo0o = obj;
                this.f107037OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
            this.f107036OooOo0o = interfaceC33723OooO0oO;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C20039OooO00o c20039OooO00o;
            if (continuation instanceof C20039OooO00o) {
                c20039OooO00o = (C20039OooO00o) continuation;
                int i = c20039OooO00o.f107037OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c20039OooO00o.f107037OooOo = i - Integer.MIN_VALUE;
                } else {
                    c20039OooO00o = new C20039OooO00o(continuation);
                }
            }
            Object obj2 = c20039OooO00o.f107038OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c20039OooO00o.f107037OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                Object objOooO0OO = ((AbstractC24338OooO0o0) obj).OooO0OO(DebugFragment.f79020Oooo0OO);
                c20039OooO00o.f107037OooOo = 1;
                if (this.f107036OooOo0o.emit(objOooO0OO, c20039OooO00o) == enumC32485OooO00o) {
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

    public C30081o000000o(InterfaceC33721OooO0o interfaceC33721OooO0o) {
        this.f107035OooOo0o = interfaceC33721OooO0o;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super Boolean> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f107035OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}

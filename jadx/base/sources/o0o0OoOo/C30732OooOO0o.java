package o0o0OoOo;

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

/* JADX INFO: renamed from: o0o0OoOo.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30732OooOO0o implements InterfaceC33721OooO0o<Boolean> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f109916OooOo0o;

    /* JADX INFO: renamed from: o0o0OoOo.OooOO0o$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f109917OooOo0o;

        /* JADX INFO: renamed from: o0o0OoOo.OooOO0o$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.debug.viewmodel.DebugViewModel$getSkipNoteMetaWriteSwitchFlow$$inlined$map$1$2", m80623f = "DebugViewModel.kt", m80624l = {50}, m80625m = "emit")
        public static final class C20123OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f109918OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f109919OooOo0o;

            public C20123OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f109919OooOo0o = obj;
                this.f109918OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
            this.f109917OooOo0o = interfaceC33723OooO0oO;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C20123OooO00o c20123OooO00o;
            if (continuation instanceof C20123OooO00o) {
                c20123OooO00o = (C20123OooO00o) continuation;
                int i = c20123OooO00o.f109918OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c20123OooO00o.f109918OooOo = i - Integer.MIN_VALUE;
                } else {
                    c20123OooO00o = new C20123OooO00o(continuation);
                }
            }
            Object obj2 = c20123OooO00o.f109919OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c20123OooO00o.f109918OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                Object objOooO0OO = ((AbstractC24338OooO0o0) obj).OooO0OO(DebugFragment.f79021Oooo0o0);
                c20123OooO00o.f109918OooOo = 1;
                if (this.f109917OooOo0o.emit(objOooO0OO, c20123OooO00o) == enumC32485OooO00o) {
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

    public C30732OooOO0o(InterfaceC33721OooO0o interfaceC33721OooO0o) {
        this.f109916OooOo0o = interfaceC33721OooO0o;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super Boolean> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f109916OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}

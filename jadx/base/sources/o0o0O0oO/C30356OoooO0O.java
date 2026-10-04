package o0o0O0oO;

import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0OOOoo.C27205OooO0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0o0O0oO.OoooO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30356OoooO0O implements InterfaceC33721OooO0o<com.orion.notein.p607ui.p609vo.OooO00o> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f108273OooOo0o;

    /* JADX INFO: renamed from: o0o0O0oO.OoooO0O$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f108274OooOo0o;

        /* JADX INFO: renamed from: o0o0O0oO.OoooO0O$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.trashbin.TrashBinListViewModel$special$$inlined$map$1$2", m80623f = "TrashBinListViewModel.kt", m80624l = {50}, m80625m = "emit")
        public static final class C20067OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f108275OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f108276OooOo0o;

            public C20067OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f108276OooOo0o = obj;
                this.f108275OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
            this.f108274OooOo0o = interfaceC33723OooO0oO;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C20067OooO00o c20067OooO00o;
            com.orion.notein.p607ui.p609vo.OooO00o oooO00oValueOf;
            String str;
            if (continuation instanceof C20067OooO00o) {
                c20067OooO00o = (C20067OooO00o) continuation;
                int i = c20067OooO00o.f108275OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c20067OooO00o.f108275OooOo = i - Integer.MIN_VALUE;
                } else {
                    c20067OooO00o = new C20067OooO00o(continuation);
                }
            }
            Object obj2 = c20067OooO00o.f108276OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c20067OooO00o.f108275OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                try {
                    str = (String) ((AbstractC24338OooO0o0) obj).OooO0OO(C27205OooO0OO.f95008OooO0oO);
                } catch (Exception unused) {
                    oooO00oValueOf = com.orion.notein.p607ui.p609vo.OooO00o.f80085OooOoO;
                }
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(str, "USER_CUSTOM")) {
                    throw new IllegalStateException();
                }
                kotlin.jvm.internal.OooOOO0.OooO0Oo(str);
                oooO00oValueOf = com.orion.notein.p607ui.p609vo.OooO00o.valueOf(str);
                c20067OooO00o.f108275OooOo = 1;
                if (this.f108274OooOo0o.emit(oooO00oValueOf, c20067OooO00o) == enumC32485OooO00o) {
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

    public C30356OoooO0O(InterfaceC33721OooO0o interfaceC33721OooO0o) {
        this.f108273OooOo0o = interfaceC33721OooO0o;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super com.orion.notein.p607ui.p609vo.OooO00o> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f108273OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}

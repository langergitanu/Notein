package o0oOO0Oo;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0oOO0Oo.OooOo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30820OooOo00 implements InterfaceC33721OooO0o<com.orion.notein.p607ui.p609vo.OooO00o> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f110154OooOo0o;

    /* JADX INFO: renamed from: o0oOO0Oo.OooOo00$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f110155OooOo0o;

        /* JADX INFO: renamed from: o0oOO0Oo.OooOo00$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.noteswitch.NoteSwitchViewModel$special$$inlined$map$1$2", m80623f = "NoteSwitchViewModel.kt", m80624l = {50}, m80625m = "emit")
        public static final class C20130OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f110156OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f110157OooOo0o;

            public C20130OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f110157OooOo0o = obj;
                this.f110156OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
            this.f110155OooOo0o = interfaceC33723OooO0oO;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C20130OooO00o c20130OooO00o;
            if (continuation instanceof C20130OooO00o) {
                c20130OooO00o = (C20130OooO00o) continuation;
                int i = c20130OooO00o.f110156OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c20130OooO00o.f110156OooOo = i - Integer.MIN_VALUE;
                } else {
                    c20130OooO00o = new C20130OooO00o(continuation);
                }
            }
            Object obj2 = c20130OooO00o.f110157OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c20130OooO00o.f110156OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                String str = (String) obj;
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooO0o0(androidx.core.app.OooO.OooO0O0(c20358OooO00o, "NoteSwitchViewModel", "noteMetaRepo.getNoteSortKeyName: ", str), new Object[0]);
                com.orion.notein.p607ui.p609vo.OooO00o oooO00oValueOf = com.orion.notein.p607ui.p609vo.OooO00o.valueOf(str);
                c20130OooO00o.f110156OooOo = 1;
                if (this.f110155OooOo0o.emit(oooO00oValueOf, c20130OooO00o) == enumC32485OooO00o) {
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

    public C30820OooOo00(InterfaceC33721OooO0o interfaceC33721OooO0o) {
        this.f110154OooOo0o = interfaceC33721OooO0o;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super com.orion.notein.p607ui.p609vo.OooO00o> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f110154OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}

package o0o00o;

import androidx.lifecycle.o0OoOo0;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24019OooOO0o;
import o0Ooo0oo.C29518o0000OOO;
import o0Ooo0oo.C29519o0000OOo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOOO implements PenBox.OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 f106249OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C24019OooOO0o f106250OooO0O0;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbox.popup.listener.PenSettingsFillShapeWithColorListener$isLimitedToUsingFillShapeWithColor$1", m80623f = "PenSettingsFillShapeWithColorListener.kt", m80624l = {34}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f106252OooOo0o;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return OooOOO.this.new OooO00o(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Type inference failed for: r5v2, types: [kotlin.jvm.internal.OooOO0o, oO0O000o.OooOOOo] */
        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f106252OooOo0o;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return obj;
            }
            C32446OooOOOo.OooO0O0(obj);
            ?? r5 = OooOOO.this.f106250OooO0O0;
            Integer num = new Integer(26);
            this.f106252OooOo0o = 1;
            Object objInvoke = r5.invoke(num, this);
            return objInvoke == enumC32485OooO00o ? enumC32485OooO00o : objInvoke;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OooOOO(com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 viewModel, InterfaceC32507OooOO0o<? super Boolean, C32460OooOooO> interfaceC32507OooOO0o, InterfaceC32507OooOO0o<? super Integer, C32460OooOooO> interfaceC32507OooOO0o2, InterfaceC32508OooOOOo<? super Integer, ? super Continuation<? super Boolean>, ? extends Object> interfaceC32508OooOOOo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(viewModel, "viewModel");
        this.f106249OooO00o = viewModel;
        this.f106250OooO0O0 = (C24019OooOO0o) interfaceC32508OooOOOo;
    }

    @Override // com.orion.notein.ui.noteeditor.toolbox.PenBox.OooOOOO
    public final void OooO00o(boolean z) {
        com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0 = this.f106249OooO00o;
        oooO0O0.getClass();
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(oooO0O0);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C29518o0000OOO(oooO0O0, z, null), 2);
    }

    @Override // com.orion.notein.ui.noteeditor.toolbox.PenBox.OooOOOO
    public final boolean OooO0O0() {
        return ((Boolean) C33609OooO0oo.OooO0Oo(oOo0000O.OooO.f123416OooOo0o, new OooO00o(null))).booleanValue();
    }

    @Override // com.orion.notein.ui.noteeditor.toolbox.PenBox.OooOOOO
    public final void OooO0OO(int i) {
        com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0 = this.f106249OooO00o;
        oooO0O0.getClass();
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(oooO0O0);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C29519o0000OOo(oooO0O0, i / 100.0f, null), 2);
    }
}

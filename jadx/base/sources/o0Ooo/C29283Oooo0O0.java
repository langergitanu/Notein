package o0Ooo;

import androidx.lifecycle.C21989OooOooO;
import com.orion.notein.p607ui.noteeditor.penbox.PenBoxChildFragment;
import kotlin.coroutines.Continuation;
import o0o00Ooo.OooOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0Ooo.Oooo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29283Oooo0O0 implements OooOO0.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ PenBoxChildFragment f103817OooO00o;

    /* JADX INFO: renamed from: o0Ooo.Oooo0O0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$initPenColorPopupWindow$1$4$onEyeDropperClicked$1", m80623f = "PenBoxChildFragment.kt", m80624l = {613}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PenBoxChildFragment f103818OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103819OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(PenBoxChildFragment penBoxChildFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f103818OooOo = penBoxChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f103818OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOO0.OooO00o oooO00o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103819OooOo0o;
            PenBoxChildFragment penBoxChildFragment = this.f103818OooOo;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f103819OooOo0o = 1;
                obj = PenBoxChildFragment.OooOoo0(penBoxChildFragment, 2, this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            if (!((Boolean) obj).booleanValue() && (oooO00o = penBoxChildFragment.f75406o00o0O) != null) {
                oooO00o.OooO00o();
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public C29283Oooo0O0(PenBoxChildFragment penBoxChildFragment) {
        this.f103817OooO00o = penBoxChildFragment;
    }

    @Override // o0o00Ooo.OooOO0.OooO00o
    public final void OooO00o() {
        PenBoxChildFragment penBoxChildFragment = this.f103817OooO00o;
        PenBoxChildFragment.OooOoOO(penBoxChildFragment);
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(penBoxChildFragment), null, null, new OooO00o(penBoxChildFragment, null), 3);
    }
}

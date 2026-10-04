package o0OoO0oo;

import androidx.core.app.FrameMetricsAggregator;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24332OooO;
import o0000oOO.C24334OooO0O0;
import o0OOOoo.C27205OooO0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerViewModel$1", m80623f = "NoteEditorContainerViewModel.kt", m80624l = {FrameMetricsAggregator.EVERY_DURATION}, m80625m = "invokeSuspend")
public final class o000O0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.OooO0OO f101923OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f101924OooOo0o;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerViewModel$1$1", m80623f = "NoteEditorContainerViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24334OooO0O0, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f101925OooOo0o;

        public OooO00o() {
            throw null;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(2, continuation);
            oooO00o.f101925OooOo0o = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(C24334OooO0O0 c24334OooO0O0, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(c24334OooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            C24334OooO0O0 c24334OooO0O0 = (C24334OooO0O0) this.f101925OooOo0o;
            AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = C27205OooO0OO.f95002OooO00o;
            c24334OooO0O0.OooO0oO(C27205OooO0OO.f95011OooOO0O, Boolean.TRUE);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0O0(com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OO, Continuation<? super o000O0O0> continuation) {
        super(2, continuation);
        this.f101923OooOo = oooO0OO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o000O0O0(this.f101923OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((o000O0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f101924OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            o0000o0O.OooOO0<AbstractC24338OooO0o0> oooOO02 = this.f101923OooOo.f73366OooOo0;
            OooO00o oooO00o = new OooO00o(2, null);
            this.f101924OooOo0o = 1;
            if (C24332OooO.OooO00o(oooOO02, oooO00o, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}

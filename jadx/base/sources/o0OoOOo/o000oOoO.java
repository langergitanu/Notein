package o0OoOOo;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oOo000Oo.C34438OooOoo0;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$switchAudioFileListSelectionMode$1", m80623f = "NoteAudioViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class o000oOoO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.audio.OooO0o f103490OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000oOoO(com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o, Continuation<? super o000oOoO> continuation) {
        super(2, continuation);
        this.f103490OooOo0o = oooO0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o000oOoO(this.f103490OooOo0o, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((o000oOoO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o = this.f103490OooOo0o;
        C33781o00o0O c33781o00o0O = oooO0o.f74247OooOooO;
        C34438OooOoo0 c34438OooOoo0 = C34438OooOoo0.f123458OooOo0o;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, c34438OooOoo0);
        C33781o00o0O c33781o00o0O2 = oooO0o.f74246OooOoo0;
        Boolean boolValueOf = Boolean.valueOf(!((Boolean) c33781o00o0O2.getValue()).booleanValue());
        c33781o00o0O2.getClass();
        c33781o00o0O2.OooOO0(null, boolValueOf);
        return C32460OooOooO.f116667OooO00o;
    }
}

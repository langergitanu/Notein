package o0OoO0oo;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: o0OoO0oo.o00o0000, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorViewModel$editorVO$2", m80623f = "NoteEditorViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C28909o00o0000 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<C28694OooOO0O, Boolean, Continuation<? super C28694OooOO0O>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ boolean f102426OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ C28694OooOO0O f102427OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(C28694OooOO0O c28694OooOO0O, Boolean bool, Continuation<? super C28694OooOO0O> continuation) {
        boolean zBooleanValue = bool.booleanValue();
        C28909o00o0000 c28909o00o0000 = new C28909o00o0000(3, continuation);
        c28909o00o0000.f102427OooOo0o = c28694OooOO0O;
        c28909o00o0000.f102426OooOo = zBooleanValue;
        return c28909o00o0000.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C28694OooOO0O c28694OooOO0O = this.f102427OooOo0o;
        c28694OooOO0O.f101679OooOOO0 = this.f102426OooOo;
        return c28694OooOO0O;
    }
}

package o0OoO0oo;

import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: o0OoO0oo.o000o0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerViewModel$notePosList$1", m80623f = "NoteEditorContainerViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C28814o000o0o extends AbstractC32476OooO implements InterfaceC32510OooOOo0<List<? extends C28961o00oOoOO>, Boolean, Continuation<? super C32443OooOOO<? extends List<? extends C28961o00oOoOO>, ? extends Boolean>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ boolean f102016OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f102017OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(List<? extends C28961o00oOoOO> list, Boolean bool, Continuation<? super C32443OooOOO<? extends List<? extends C28961o00oOoOO>, ? extends Boolean>> continuation) {
        boolean zBooleanValue = bool.booleanValue();
        C28814o000o0o c28814o000o0o = new C28814o000o0o(3, continuation);
        c28814o000o0o.f102017OooOo0o = list;
        c28814o000o0o.f102016OooOo = zBooleanValue;
        return c28814o000o0o.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        return new C32443OooOOO(this.f102017OooOo0o, Boolean.valueOf(this.f102016OooOo));
    }
}

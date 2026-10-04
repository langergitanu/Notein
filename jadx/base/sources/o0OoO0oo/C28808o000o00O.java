package o0OoO0oo;

import java.util.Map;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: o0OoO0oo.o000o00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerViewModel$hasEditorUndoHistory$1", m80623f = "NoteEditorContainerViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C28808o000o00O extends AbstractC32476OooO implements InterfaceC32510OooOOo0<Integer, Map<Integer, ? extends Integer>, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Map f102004OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ int f102005OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(Integer num, Map<Integer, ? extends Integer> map, Continuation<? super Boolean> continuation) {
        int iIntValue = num.intValue();
        C28808o000o00O c28808o000o00O = new C28808o000o00O(3, continuation);
        c28808o000o00O.f102005OooOo0o = iIntValue;
        c28808o000o00O.f102004OooOo = map;
        return c28808o000o00O.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        Integer num = (Integer) this.f102004OooOo.get(new Integer(this.f102005OooOo0o));
        return Boolean.valueOf((num != null ? num.intValue() : 0) > 0);
    }
}

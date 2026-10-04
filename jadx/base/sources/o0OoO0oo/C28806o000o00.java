package o0OoO0oo;

import java.util.Map;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: o0OoO0oo.o000o00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerViewModel$hasEditorOpHistory$1", m80623f = "NoteEditorContainerViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C28806o000o00 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<Integer, Map<Integer, ? extends Integer>, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Map f101998OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ int f101999OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(Integer num, Map<Integer, ? extends Integer> map, Continuation<? super Boolean> continuation) {
        int iIntValue = num.intValue();
        C28806o000o00 c28806o000o00 = new C28806o000o00(3, continuation);
        c28806o000o00.f101999OooOo0o = iIntValue;
        c28806o000o00.f101998OooOo = map;
        return c28806o000o00.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        Integer num = (Integer) this.f101998OooOo.get(new Integer(this.f101999OooOo0o));
        return Boolean.valueOf((num != null ? num.intValue() : 0) > 0);
    }
}

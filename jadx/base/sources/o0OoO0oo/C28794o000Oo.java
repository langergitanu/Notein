package o0OoO0oo;

import com.orion.notein.domain.models.note.NoteMeta;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: o0OoO0oo.o000Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerViewModel$focusedNoteMeta$1", m80623f = "NoteEditorContainerViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C28794o000Oo extends AbstractC32476OooO implements InterfaceC32510OooOOo0<Integer, List<? extends NoteMeta>, Continuation<? super NoteMeta>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ List f101963OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ int f101964OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(Integer num, List<? extends NoteMeta> list, Continuation<? super NoteMeta> continuation) {
        int iIntValue = num.intValue();
        C28794o000Oo c28794o000Oo = new C28794o000Oo(3, continuation);
        c28794o000Oo.f101964OooOo0o = iIntValue;
        c28794o000Oo.f101963OooOo = list;
        return c28794o000Oo.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        int i = this.f101964OooOo0o;
        List list = this.f101963OooOo;
        return (i < 0 || i >= list.size()) ? (NoteMeta) oOo000Oo.OooOo.OoooOo0(list) : list.get(i);
    }
}

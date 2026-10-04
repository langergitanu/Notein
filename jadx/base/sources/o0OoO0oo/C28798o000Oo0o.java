package o0OoO0oo;

import com.orion.notein.domain.models.note.NoteContent;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: o0OoO0oo.o000Oo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerViewModel$focusedNote$1", m80623f = "NoteEditorContainerViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C28798o000Oo0o extends AbstractC32476OooO implements InterfaceC32510OooOOo0<Integer, List<? extends NoteContent>, Continuation<? super NoteContent>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ List f101975OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ int f101976OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(Integer num, List<? extends NoteContent> list, Continuation<? super NoteContent> continuation) {
        int iIntValue = num.intValue();
        C28798o000Oo0o c28798o000Oo0o = new C28798o000Oo0o(3, continuation);
        c28798o000Oo0o.f101976OooOo0o = iIntValue;
        c28798o000Oo0o.f101975OooOo = list;
        return c28798o000Oo0o.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        return oOo000Oo.OooOo.OoooO00(this.f101976OooOo0o, this.f101975OooOo);
    }
}

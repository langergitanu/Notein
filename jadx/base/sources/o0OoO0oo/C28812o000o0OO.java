package o0OoO0oo;

import com.orion.notein.domain.models.note.NoteContent;
import java.util.Map;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: o0OoO0oo.o000o0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerViewModel$isNoteSyncing$1", m80623f = "NoteEditorContainerViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C28812o000o0OO extends AbstractC32476OooO implements InterfaceC32510OooOOo0<Map<String, ? extends Boolean>, NoteContent, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ NoteContent f102012OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Map f102013OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(Map<String, ? extends Boolean> map, NoteContent noteContent, Continuation<? super Boolean> continuation) {
        C28812o000o0OO c28812o000o0OO = new C28812o000o0OO(3, continuation);
        c28812o000o0OO.f102013OooOo0o = map;
        c28812o000o0OO.f102012OooOo = noteContent;
        return c28812o000o0OO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Boolean bool;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        Map map = this.f102013OooOo0o;
        NoteContent noteContent = this.f102012OooOo;
        boolean zBooleanValue = false;
        if (noteContent != null && (bool = (Boolean) map.get(noteContent.getId())) != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }
}

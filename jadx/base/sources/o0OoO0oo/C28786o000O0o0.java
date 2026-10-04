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

/* JADX INFO: renamed from: o0OoO0oo.o000O0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerViewModel$_noteList$1$2$1", m80623f = "NoteEditorContainerViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C28786o000O0o0 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<List<? extends NoteContent>, List<? extends NoteContent>, Continuation<? super List<? extends NoteContent>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ List f101927OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f101928OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(List<? extends NoteContent> list, List<? extends NoteContent> list2, Continuation<? super List<? extends NoteContent>> continuation) {
        C28786o000O0o0 c28786o000O0o0 = new C28786o000O0o0(3, continuation);
        c28786o000O0o0.f101928OooOo0o = list;
        c28786o000O0o0.f101927OooOo = list2;
        return c28786o000O0o0.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        return oOo000Oo.OooOo.OooooOO(this.f101928OooOo0o, this.f101927OooOo);
    }
}

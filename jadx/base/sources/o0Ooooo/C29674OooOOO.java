package o0Ooooo;

import com.orion.notein.domain.models.note.NoteContent;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: o0Ooooo.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewViewModel$creationTime$1", m80623f = "EditorPreviewViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29674OooOOO extends AbstractC32476OooO implements InterfaceC32510OooOOo0<NoteContent, String, Continuation<? super String>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ String f105204OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ NoteContent f105205OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(NoteContent noteContent, String str, Continuation<? super String> continuation) {
        C29674OooOOO c29674OooOOO = new C29674OooOOO(3, continuation);
        c29674OooOOO.f105205OooOo0o = noteContent;
        c29674OooOOO.f105204OooOo = str;
        return c29674OooOOO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        return new SimpleDateFormat(this.f105204OooOo, Locale.getDefault()).format(new Long(this.f105205OooOo0o.getCreationTime()));
    }
}

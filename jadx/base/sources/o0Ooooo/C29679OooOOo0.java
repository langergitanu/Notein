package o0Ooooo;

import com.orion.notein.domain.models.note.NoteContent;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: o0Ooooo.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewViewModel$enableTnNavigator$1", m80623f = "EditorPreviewViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29679OooOOo0 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<NoteContent, Integer, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ int f105220OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ NoteContent f105221OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(NoteContent noteContent, Integer num, Continuation<? super Boolean> continuation) {
        int iIntValue = num.intValue();
        C29679OooOOo0 c29679OooOOo0 = new C29679OooOOo0(3, continuation);
        c29679OooOOo0.f105221OooOo0o = noteContent;
        c29679OooOOo0.f105220OooOo = iIntValue;
        return c29679OooOOo0.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        return Boolean.valueOf(this.f105221OooOo0o.getUnboundedNote() && this.f105220OooOo == 0);
    }
}

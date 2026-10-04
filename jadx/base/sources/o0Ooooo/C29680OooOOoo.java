package o0Ooooo;

import com.orion.notein.domain.models.Label;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.page.Page;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.InterfaceC33721OooO0o;

/* JADX INFO: renamed from: o0Ooooo.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewViewModel$pageIdToLabelsMap$1", m80623f = "EditorPreviewViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29680OooOOoo extends AbstractC32476OooO implements InterfaceC32510OooOOo0<List<? extends Page>, NoteContent, Continuation<? super InterfaceC33721OooO0o<? extends Map<C32443OooOOO<? extends String, ? extends String>, ? extends List<? extends Label>>>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0OO f105222OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f105223OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29680OooOOoo(com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0OO oooO0OO, Continuation<? super C29680OooOOoo> continuation) {
        super(3, continuation);
        this.f105222OooOo = oooO0OO;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(List<? extends Page> list, NoteContent noteContent, Continuation<? super InterfaceC33721OooO0o<? extends Map<C32443OooOOO<? extends String, ? extends String>, ? extends List<? extends Label>>>> continuation) {
        C29680OooOOoo c29680OooOOoo = new C29680OooOOoo(this.f105222OooOo, continuation);
        c29680OooOOoo.f105223OooOo0o = list;
        return c29680OooOOoo.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        return this.f105222OooOo.f76065OooO.OooO0Oo(this.f105223OooOo0o);
    }
}

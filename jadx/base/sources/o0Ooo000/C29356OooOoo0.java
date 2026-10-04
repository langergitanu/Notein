package o0Ooo000;

import OooOoo.C20593OooO0Oo;
import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.dialog.NoteTreeInfo;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0Ooo000.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.hyperlinkeditor.dialog.NoteTreeSelectionViewModel$treeItems$2", m80623f = "NoteTreeSelectionFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29356OooOoo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends NoteTreeInfo>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f104114OooOo0o;

    public C29356OooOoo0() {
        throw null;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C29356OooOoo0 c29356OooOoo0 = new C29356OooOoo0(2, continuation);
        c29356OooOoo0.f104114OooOo0o = obj;
        return c29356OooOoo0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(List<? extends NoteTreeInfo> list, Continuation<? super C32460OooOooO> continuation) {
        return ((C29356OooOoo0) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        String strOooO0O0 = C20593OooO0Oo.OooO0O0("treeItems.onEach: ", oOo000Oo.OooOo.o000oOoO((List) this.f104114OooOo0o, null, null, null, new com.orion.notein.domain.mapper.OooO00o(2), 31), ".");
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("NoteTreeSelection");
        c20358OooO00o.OooO00o(strOooO0O0, new Object[0]);
        return C32460OooOooO.f116667OooO00o;
    }
}

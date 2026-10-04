package o0OoO0oo;

import android.view.View;
import com.orion.notein.p607ui.TipsDialogFragment;
import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OoO0oo.o00OoOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$showTipsDialog$1", m80623f = "NoteEditorFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C28887o00OoOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f102350OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ String f102351OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f102352OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f102353OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f102354OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ boolean f102355OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32507OooOO0o<Boolean, C32460OooOooO> f102356OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ NoteEditorFragment f102357OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28887o00OoOO0(String str, String str2, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, InterfaceC32507OooOO0o interfaceC32507OooOO0o, boolean z, NoteEditorFragment noteEditorFragment, Continuation continuation) {
        super(2, continuation);
        this.f102351OooOo0o = str;
        this.f102350OooOo = str2;
        this.f102353OooOoO0 = onClickListener;
        this.f102352OooOoO = onClickListener2;
        this.f102354OooOoOO = onClickListener3;
        this.f102356OooOoo0 = interfaceC32507OooOO0o;
        this.f102355OooOoo = z;
        this.f102357OooOooO = noteEditorFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28887o00OoOO0(this.f102351OooOo0o, this.f102350OooOo, this.f102353OooOoO0, this.f102352OooOoO, this.f102354OooOoOO, this.f102356OooOoo0, this.f102355OooOoo, this.f102357OooOooO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28887o00OoOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        TipsDialogFragment tipsDialogFragment = new TipsDialogFragment(this.f102351OooOo0o, this.f102350OooOo, this.f102353OooOoO0, this.f102352OooOoO, this.f102354OooOoOO, this.f102356OooOoo0, this.f102355OooOoo);
        NoteEditorFragment noteEditorFragment = this.f102357OooOooO;
        if (noteEditorFragment.getChildFragmentManager().OooOooo("TipsDialogFragment") == null) {
            tipsDialogFragment.show(noteEditorFragment.getChildFragmentManager(), "TipsDialogFragment");
        }
        return C32460OooOooO.f116667OooO00o;
    }
}

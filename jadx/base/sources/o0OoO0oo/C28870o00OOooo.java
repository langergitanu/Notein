package o0OoO0oo;

import android.content.Context;
import android.view.View;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OoO0oo.o00OOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$initLimitedUnboundedNoteTips$2", m80623f = "NoteEditorFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C28870o00OOooo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ View f102292OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ NoteEditorFragment f102293OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28870o00OOooo(NoteEditorFragment noteEditorFragment, View view, Continuation<? super C28870o00OOooo> continuation) {
        super(2, continuation);
        this.f102293OooOo0o = noteEditorFragment;
        this.f102292OooOo = view;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28870o00OOooo(this.f102293OooOo0o, this.f102292OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28870o00OOooo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        int iOooO0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        NoteEditorFragment noteEditorFragment = this.f102293OooOo0o;
        com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOoooO0 = noteEditorFragment.OoooO0();
        Context contextRequireContext = noteEditorFragment.requireContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
        if (oooO0OOOoooO0.Oooo0oo(contextRequireContext)) {
            iOooO0o = Oooo0.o000000O.OooO0o(10) + this.f102292OooOo.getContext().getResources().getDimensionPixelSize(R.dimen.immersive_toolbar_height);
        } else {
            iOooO0o = 0;
        }
        View view = noteEditorFragment.f73018OoooOO0;
        if (view != null) {
            view.setTranslationY(iOooO0o);
            return C32460OooOooO.f116667OooO00o;
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("limitedUnboundedNoteTipsView");
        throw null;
    }
}

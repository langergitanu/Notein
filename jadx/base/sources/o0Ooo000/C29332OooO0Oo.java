package o0Ooo000;

import android.content.Context;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.dialog.HyperlinkTiledPagesFragment;
import kotlin.coroutines.Continuation;
import o00o00.C25206OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33644OoooO0;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0Ooo000.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.hyperlinkeditor.dialog.HyperlinkTiledPagesFragment$doHint$1", m80623f = "HyperlinkTiledPagesFragment.kt", m80624l = {104}, m80625m = "invokeSuspend")
public final class C29332OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ HyperlinkTiledPagesFragment f104048OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f104049OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29332OooO0Oo(HyperlinkTiledPagesFragment hyperlinkTiledPagesFragment, Continuation<? super C29332OooO0Oo> continuation) {
        super(2, continuation);
        this.f104048OooOo = hyperlinkTiledPagesFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29332OooO0Oo(this.f104048OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29332OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f104049OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f104049OooOo0o = 1;
            if (C33644OoooO0.OooO00o(500L, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        HyperlinkTiledPagesFragment hyperlinkTiledPagesFragment = this.f104048OooOo;
        Context context = hyperlinkTiledPagesFragment.getContext();
        if (context != null) {
            String string = hyperlinkTiledPagesFragment.getString(R.string.hint_hyper_link_to_some_page);
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
            C25206OooO0Oo.OooO0oO(context, string);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}

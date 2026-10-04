package o0Oo0oOo;

import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.creative_library.CreativeLibraryListFragment;
import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;
import o000o0O0.C24572OooOO0o;
import o000o0O0.C24583OooOo0o;
import o0O0oooO.C26320o0000OoO;
import o0OoO0oo.C28785o000O0o;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: o0Oo0oOo.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28334OooOooO implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f100470OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100471OooOo0o;

    public /* synthetic */ C28334OooOooO(Fragment fragment, int i) {
        this.f100471OooOo0o = i;
        this.f100470OooOo = fragment;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        C24572OooOO0o c24572OooOO0oOooO0OO;
        C24583OooOo0o c24583OooOo0oOooO0oO;
        Fragment fragment = this.f100470OooOo;
        switch (this.f100471OooOo0o) {
            case 0:
                ((CreativeLibraryListFragment) fragment).OooOoo().OooO0o();
                return C32460OooOooO.f116667OooO00o;
            case 1:
                NoteEditorFragment noteEditorFragment = (NoteEditorFragment) fragment;
                if (noteEditorFragment.f73032Ooooooo.f105431OooO00o && (c24583OooOo0oOooO0oO = (c24572OooOO0oOooO0OO = C21030OooOO0o.OooO0OO(noteEditorFragment)).OooO0oO()) != null && c24583OooOo0oOooO0oO.f83302OooOooO == R.id.noteEditorContainerFragment) {
                    double degrees = Math.toDegrees(noteEditorFragment.f73032Ooooooo.f105434OooO0Oo);
                    double d = StyleIdentifier.LIST_TABLE_4_ACCENT_5;
                    c24572OooOO0oOooO0OO.OooOOOO(new C28785o000O0o(oO0O00oo.OooOO0.OooO0o(oO0O00O.OooO00o.OooO00o((((180.0d - (((degrees % d) + d) % d)) % 180.0d) + 180.0d) % 180.0d), 0, 179)));
                }
                return C32460OooOooO.f116667OooO00o;
            default:
                int i = PenBarChildFragment.f75240o0000OOo;
                PenBarChildFragment penBarChildFragment = (PenBarChildFragment) fragment;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0oO = penBarChildFragment.Oooo0oO();
                InterfaceC21987OooOoo interfaceC21987OooOoo = penBarChildFragment.f75247OooOooO;
                if (interfaceC21987OooOoo == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("containerViewLifecycleOwner");
                    throw null;
                }
                C26320o0000OoO c26320o0000OoOOooo0o = penBarChildFragment.Oooo0o();
                Context contextRequireContext = penBarChildFragment.requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                return new o0o00o.OooOOO0(oooO0O0Oooo0oO, interfaceC21987OooOoo, c26320o0000OoOOooo0o, contextRequireContext, penBarChildFragment.getActivity(), new PenBarChildFragment.OooO(2, penBarChildFragment, PenBarChildFragment.class, "showNonVipFeatureLimitedDialog", "showNonVipFeatureLimitedDialog(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), new PenBarChildFragment.OooOO0(0, penBarChildFragment, PenBarChildFragment.class, "dismissPopupWindow", "dismissPopupWindow()V", 0));
        }
    }
}

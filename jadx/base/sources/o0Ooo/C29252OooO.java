package o0Ooo;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.orion.notein.p607ui.noteeditor.penbox.PenBoxChildFragment;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import o0o000oo.ViewOnClickListenerC29824OooOoO;
import o0o00O00.C29870OooO0o0;

/* JADX INFO: renamed from: o0Ooo.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C29252OooO implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f103745OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f103746OooOo0o;

    public /* synthetic */ C29252OooO(Fragment fragment, int i) {
        this.f103746OooOo0o = i;
        this.f103745OooOo = fragment;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f103746OooOo0o) {
            case 0:
                return ((PenBoxChildFragment) this.f103745OooOo).f75395o000000o;
            default:
                BaseToolbarChildFragment baseToolbarChildFragment = (BaseToolbarChildFragment) this.f103745OooOo;
                baseToolbarChildFragment.getClass();
                ViewOnClickListenerC29824OooOoO viewOnClickListenerC29824OooOoO = new ViewOnClickListenerC29824OooOoO(baseToolbarChildFragment);
                Context contextRequireContext = baseToolbarChildFragment.requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                return new C29870OooO0o0(contextRequireContext, viewOnClickListenerC29824OooOoO);
        }
    }
}

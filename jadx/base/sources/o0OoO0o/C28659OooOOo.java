package o0OoO0o;

import androidx.fragment.app.Fragment;
import androidx.ink.brush.behavior.ResponseNodeNative;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;

/* JADX INFO: renamed from: o0OoO0o.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C28659OooOOo implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f101568OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101569OooOo0o;

    public /* synthetic */ C28659OooOOo(Object obj, int i) {
        this.f101569OooOo0o = i;
        this.f101568OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f101569OooOo0o) {
            case 0:
                return Long.valueOf(ResponseNodeNative.f65366OooO00o.create(((AbstractC28645OooO0o) this.f101568OooOo).OooO00o()));
            default:
                Fragment fragmentRequireParentFragment = ((BaseToolbarChildFragment) this.f101568OooOo).requireParentFragment();
                kotlin.jvm.internal.OooOOO0.OooO0o(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
        }
    }
}

package o000Oo0O;

import androidx.fragment.app.Fragment;
import com.orion.notein.p607ui.noteeditor.textstylebar.TextStyleBarChildFragment;

/* JADX INFO: renamed from: o000Oo0O.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24530OooOo0O implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f82980OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f82981OooOo0o;

    public /* synthetic */ C24530OooOo0O(Object obj, int i) {
        this.f82981OooOo0o = i;
        this.f82980OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f82981OooOo0o) {
            case 0:
                return new C24526OooOOo(((C24531OooOo0o) this.f82980OooOo).f82982OooO0O0);
            default:
                Fragment fragmentRequireParentFragment = ((TextStyleBarChildFragment) this.f82980OooOo).requireParentFragment();
                kotlin.jvm.internal.OooOOO0.OooO0o(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
        }
    }
}

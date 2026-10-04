package o0OooOo;

import androidx.fragment.app.Fragment;
import com.orion.notein.domain.models.papertheme.paperstyle.threecolumns.SquareThreeColumnPaperStyle;
import com.orion.notein.p607ui.noteeditor.textstylebar.TextStyleBarChildFragment;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0OooOo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C29576OooO0O0 implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f104899OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f104900OooOo0o;

    public /* synthetic */ C29576OooO0O0(Object obj, int i) {
        this.f104900OooOo0o = i;
        this.f104899OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f104900OooOo0o) {
            case 0:
                return ((SquareThreeColumnPaperStyle) this.f104899OooOo).generateSquarePaperStyle();
            default:
                Fragment fragmentRequireParentFragment = ((TextStyleBarChildFragment) this.f104899OooOo).requireParentFragment();
                OooOOO0.OooO0o(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
        }
    }
}

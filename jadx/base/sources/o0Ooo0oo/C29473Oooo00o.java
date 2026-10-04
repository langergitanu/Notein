package o0Ooo0oo;

import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;
import com.orion.notein.p607ui.widget.crop.ImageCropView;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: o0Ooo0oo.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C29473Oooo00o implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f104553OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f104554OooOo0o;

    public /* synthetic */ C29473Oooo00o(Object obj, int i) {
        this.f104554OooOo0o = i;
        this.f104553OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        Object obj = this.f104553OooOo;
        switch (this.f104554OooOo0o) {
            case 0:
                int i = PenBarChildFragment.f75240o0000OOo;
                PenBarChildFragment penBarChildFragment = (PenBarChildFragment) obj;
                return new o0o00o.OooOOO(penBarChildFragment.Oooo0oO(), new PenBarChildFragment.OooOO0O(1, penBarChildFragment, PenBarChildFragment.class, "setLassoShapeFillColorEnable", "setLassoShapeFillColorEnable(Z)V", 0), new PenBarChildFragment.C23476OooOO0o(1, penBarChildFragment, PenBarChildFragment.class, "setLassoShapeFillColorOpacity", "setLassoShapeFillColorOpacity(I)V", 0), new PenBarChildFragment.OooOOO0(2, penBarChildFragment, PenBarChildFragment.class, "showNonVipFeatureLimitedDialog", "showNonVipFeatureLimitedDialog(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0));
            default:
                int i2 = ImageCropView.f80139OooooO0;
                ((ImageCropView) obj).invalidate();
                return C32460OooOooO.f116667OooO00o;
        }
    }
}

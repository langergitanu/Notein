package androidx.core.splashscreen;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.splashscreen.SplashScreenViewProvider;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m80612d2 = {"<anonymous>", "Landroid/view/ViewGroup;", "invoke"}, m80613k = 3, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class SplashScreenViewProvider$ViewImpl$_splashScreenView$2 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<ViewGroup> {
    final /* synthetic */ SplashScreenViewProvider.ViewImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashScreenViewProvider$ViewImpl$_splashScreenView$2(SplashScreenViewProvider.ViewImpl viewImpl) {
        super(0);
        this.this$0 = viewImpl;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // oO0O000o.OooO00o
    public final ViewGroup invoke() {
        View viewInflate = View.inflate(this.this$0.getActivity(), C0038R.layout.splash_screen_view, null);
        if (viewInflate != null) {
            return (ViewGroup) viewInflate;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }
}

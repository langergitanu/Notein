package o0o000oo;

import android.view.View;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import oOo000Oo.C34438OooOoo0;

/* JADX INFO: renamed from: o0o000oo.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class ViewOnClickListenerC29824OooOoO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ BaseToolbarChildFragment f105809OooOo0o;

    public ViewOnClickListenerC29824OooOoO(BaseToolbarChildFragment baseToolbarChildFragment) {
        this.f105809OooOo0o = baseToolbarChildFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(v, "v");
        BaseToolbarChildFragment baseToolbarChildFragment = this.f105809OooOo0o;
        baseToolbarChildFragment.Ooooo0o();
        baseToolbarChildFragment.OoooOo0(C34438OooOoo0.f123458OooOo0o);
        switch (v.getId()) {
            case R.id.cl_page_rotate_180 /* 2131297156 */:
                baseToolbarChildFragment.OooooOO(36, Page.RotationDirection.ROTATION_180);
                break;
            case R.id.cl_page_rotate_90_ccw /* 2131297157 */:
                baseToolbarChildFragment.OooooOO(36, Page.RotationDirection.CLOCKWISE_270);
                break;
            case R.id.cl_page_rotate_90_cw /* 2131297158 */:
                baseToolbarChildFragment.OooooOO(36, Page.RotationDirection.CLOCKWISE_90);
                break;
        }
    }
}

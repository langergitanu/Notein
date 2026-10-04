package o0O0oO0o;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.FragmentManager;
import com.orion.editor.p600ui.zoom.DefaultZoomHandle;
import com.orion.editor.p600ui.zoom.dialog.FavoriteZoomTipsDialogFragment;
import com.orion.notein.global.R;
import o0O0oOO0.C26113OooO00o;

/* JADX INFO: renamed from: o0O0oO0o.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class ViewOnClickListenerC26097OooO0o0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ DefaultZoomHandle f89097OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Context f89098OooOo0o;

    public ViewOnClickListenerC26097OooO0o0(DefaultZoomHandle defaultZoomHandle, Context context) {
        this.f89097OooOo = defaultZoomHandle;
        this.f89098OooOo0o = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        this.f89097OooOo.OooO0o();
        Object tag = this.f89097OooOo.f69428OooOoOO.getTag();
        if (tag instanceof C26113OooO00o) {
            if (this.f89097OooOo.f69429OooOoo.isActivated()) {
                this.f89097OooOo.f69436Oooo00o.OooO0Oo((C26113OooO00o) tag);
                return;
            }
            C26113OooO00o c26113OooO00o = (C26113OooO00o) tag;
            if (c26113OooO00o.f89152OooO0O0 > this.f89097OooOo.f69427OooOoO0.getMaxZoomLevel()) {
                this.f89097OooOo.OooO0Oo(this.f89098OooOo0o.getString(R.string.can_not_add_large_favorite)).show();
                return;
            }
            ActivityC21897OooOo0 fragmentActivity = this.f89097OooOo.getFragmentActivity();
            if (fragmentActivity != null) {
                OooOOO oooOOO = this.f89097OooOo.f69436Oooo00o;
                synchronized (oooOOO.f89110OooO0O0) {
                    z = ((float) oooOOO.f89110OooO0O0.size()) < 12.0f;
                }
                if (!z) {
                    FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                    if (supportFragmentManager.OooOooo("zoom_tips") == null) {
                        FavoriteZoomTipsDialogFragment favoriteZoomTipsDialogFragment = new FavoriteZoomTipsDialogFragment();
                        favoriteZoomTipsDialogFragment.f69440OooOo0o = new ViewOnClickListenerC26096OooO0Oo(this, (C26113OooO00o) tag);
                        favoriteZoomTipsDialogFragment.show(supportFragmentManager, "zoom_tips");
                        return;
                    }
                    return;
                }
            }
            this.f89097OooOo.f69436Oooo00o.OooO00o(c26113OooO00o);
        }
    }
}

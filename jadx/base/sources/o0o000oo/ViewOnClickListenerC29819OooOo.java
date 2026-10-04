package o0o000oo;

import android.view.View;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import o0OoO0oo.C28755o00000o0;
import oOo000Oo.C34438OooOoo0;

/* JADX INFO: renamed from: o0o000oo.OooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class ViewOnClickListenerC29819OooOo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ BaseToolbarChildFragment f105797OooOo0o;

    public ViewOnClickListenerC29819OooOo(BaseToolbarChildFragment baseToolbarChildFragment) {
        this.f105797OooOo0o = baseToolbarChildFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(v, "v");
        BaseToolbarChildFragment baseToolbarChildFragment = this.f105797OooOo0o;
        baseToolbarChildFragment.Ooooo0o();
        C34438OooOoo0 c34438OooOoo0 = C34438OooOoo0.f123458OooOo0o;
        baseToolbarChildFragment.OoooOo0(c34438OooOoo0);
        switch (v.getId()) {
            case R.id.item_audio /* 2131297855 */:
                baseToolbarChildFragment.OoooO0();
                break;
            case R.id.item_camera /* 2131297858 */:
                baseToolbarChildFragment.Ooooo0o();
                baseToolbarChildFragment.OoooOo0(c34438OooOoo0);
                C28755o00000o0 c28755o00000o0 = baseToolbarChildFragment.f76506o000oOoO;
                if (c28755o00000o0 != null) {
                    c28755o00000o0.OooO0O0();
                }
                break;
            case R.id.item_image /* 2131297878 */:
                baseToolbarChildFragment.OoooO00();
                break;
            case R.id.item_sticker /* 2131297903 */:
                baseToolbarChildFragment.o000oOoO();
                break;
        }
    }
}

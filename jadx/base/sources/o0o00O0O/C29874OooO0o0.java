package o0o00O0O;

import android.view.View;
import com.orion.notein.global.R;
import kotlin.jvm.internal.OooOOO0;
import o0O0oooO.o0OoOo0;
import o0Oo0o0o.OooOo00;
import o0Oo0o0o.ViewOnClickListenerC28241OooOOoo;

/* JADX INFO: renamed from: o0o00O0O.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29874OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final View f106006OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooO00o f106007OooO0O0;

    /* JADX INFO: renamed from: o0o00O0O.OooO0o0$OooO00o */
    public interface OooO00o {
        void OooO00o();

        void OooO0O0();

        void OooO0OO();
    }

    public C29874OooO0o0(View view) {
        OooOOO0.OooO0oO(view, "view");
        this.f106006OooO00o = view;
        view.findViewById(R.id.cl_recover_page).setOnClickListener(new ViewOnClickListenerC28241OooOOoo(this, 1));
        view.findViewById(R.id.cl_recover_all_pages).setOnClickListener(new o0OoOo0(this, 4));
        view.findViewById(R.id.cl_change_template).setOnClickListener(new OooOo00(this, 2));
    }

    public final void OooO00o(boolean z, boolean z2) {
        View view = this.f106006OooO00o;
        view.findViewById(R.id.cl_recover_page).setVisibility(z ? 0 : 8);
        view.findViewById(R.id.cl_recover_all_pages).setVisibility(z2 ? 0 : 8);
    }
}

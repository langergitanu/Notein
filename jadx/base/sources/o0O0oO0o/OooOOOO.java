package o0O0oO0o;

import android.view.View;
import com.orion.editor.PDFView;
import com.orion.editor.p600ui.zoom.DefaultZoomHandle;
import com.orion.notein.global.R;
import o0O0oOO.C26112OooO0oo;
import o0O0oOO0.C26113OooO00o;
import o0O0oOO0.C26116OooO0Oo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes9.dex */
public final class OooOOOO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C26098OooO0oO f89115OooOo0o;

    public OooOOOO(C26098OooO0oO c26098OooO0oO) {
        this.f89115OooOo0o = c26098OooO0oO;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        float f;
        C26116OooO0Oo c26116OooO0Oo = (C26116OooO0Oo) view.getTag();
        float f2 = c26116OooO0Oo.f89155OooO00o;
        C26113OooO00o c26113OooO00o = new C26113OooO00o(f2, c26116OooO0Oo.f89156OooO0O0);
        int id = view.getId();
        DefaultZoomHandle defaultZoomHandle = this.f89115OooOo0o.f89099OooO00o;
        if (id == R.id.btn_delete) {
            defaultZoomHandle.f69436Oooo00o.OooO0Oo(c26113OooO00o);
            return;
        }
        PDFView pDFView = defaultZoomHandle.f69427OooOoO0;
        if (pDFView == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("DefaultZoomHandle");
            c20358OooO00o.OooO0OO("onFavoriteZoomSelected: DFView is null", new Object[0]);
            return;
        }
        if (pDFView.f69173Oooo0.get() || pDFView.f69170OooOooO == null) {
            f = 0.0f;
        } else {
            int iMax = Math.max(pDFView.getWidth(), pDFView.getHeight());
            int iMin = Math.min(pDFView.getWidth(), pDFView.getHeight());
            C26112OooO0oo c26112OooO0ooOooOo0o = pDFView.f69170OooOooO.OooOo0o(0, pDFView.f69176Oooo00o);
            float f3 = c26112OooO0ooOooOo0o.f89150OooO0O0;
            float f4 = c26112OooO0ooOooOo0o.f89149OooO00o;
            f = pDFView.f69176Oooo00o * (f2 / (f4 / (f3 > f4 ? iMin : iMax)));
        }
        if (f > 0.0f) {
            defaultZoomHandle.f69427OooOoO0.o0OOO0o(f);
        }
    }
}

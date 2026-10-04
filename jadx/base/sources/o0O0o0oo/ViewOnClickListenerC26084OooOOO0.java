package o0O0o0oo;

import android.view.View;
import com.orion.editor.AbstractC22830OooO0Oo;
import com.orion.editor.PDFView;
import com.orion.penkit.models.QuoteInfo;
import o0O0oooo.C26395Oooo0o0;

/* JADX INFO: renamed from: o0O0o0oo.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class ViewOnClickListenerC26084OooOOO0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C26085OooOOOO f89044OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C26090OooOo00 f89045OooOo0o;

    public ViewOnClickListenerC26084OooOOO0(C26085OooOOOO c26085OooOOOO, C26090OooOo00 c26090OooOo00) {
        this.f89044OooOo = c26085OooOOOO;
        this.f89045OooOo0o = c26090OooOo00;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PDFView pDFView;
        AbstractC22830OooO0Oo abstractC22830OooO0Oo;
        QuoteInfo quoteInfo = this.f89044OooOo.f89053OooO0oO;
        if (quoteInfo == null || (abstractC22830OooO0Oo = (pDFView = this.f89045OooOo0o.f89074OooO00o).f69170OooOooO) == null) {
            return;
        }
        C26395Oooo0o0 c26395Oooo0o0 = abstractC22830OooO0Oo.f69109OooO0O0;
        c26395Oooo0o0.getClass();
        c26395Oooo0o0.f90558OooO0oO.OooO0oo(quoteInfo);
        pDFView.Oooo000();
        pDFView.invalidate();
    }
}

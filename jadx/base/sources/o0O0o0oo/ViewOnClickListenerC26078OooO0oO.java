package o0O0o0oo;

import android.view.View;
import com.orion.editor.PDFView;
import com.orion.penkit.models.QuoteInfo;
import java.util.Collections;
import java.util.List;
import o0O0o00.EnumC25982o0000oO;
import o0oo0o.InterfaceC31284OooO0O0;

/* JADX INFO: renamed from: o0O0o0oo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class ViewOnClickListenerC26078OooO0oO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C26085OooOOOO f89033OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C26090OooOo00 f89034OooOo0o;

    public ViewOnClickListenerC26078OooO0oO(C26085OooOOOO c26085OooOOOO, C26090OooOo00 c26090OooOo00) {
        this.f89033OooOo = c26085OooOOOO;
        this.f89034OooOo0o = c26090OooOo00;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        QuoteInfo quoteInfo = this.f89033OooOo.f89053OooO0oO;
        if (quoteInfo == null) {
            return;
        }
        C26090OooOo00 c26090OooOo00 = this.f89034OooOo0o;
        List<InterfaceC31284OooO0O0> listSingletonList = Collections.singletonList(quoteInfo);
        List<InterfaceC31284OooO0O0> list = Collections.EMPTY_LIST;
        EnumC25982o0000oO enumC25982o0000oO = EnumC25982o0000oO.f88734OooOo;
        PDFView pDFView = c26090OooOo00.f89074OooO00o;
        pDFView.OooOO0O(listSingletonList, list, enumC25982o0000oO);
        Boolean bool = Boolean.TRUE;
        pDFView.Oooo00O(bool, bool);
    }
}

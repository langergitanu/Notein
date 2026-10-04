package o0O0o0oo;

import OooOOOo.C20451OooO0Oo;
import android.view.View;
import com.orion.editor.PDFView;
import com.orion.penkit.models.QuoteInfo;
import java.util.Collections;
import java.util.UUID;
import o0O0o00.EnumC25982o0000oO;
import o0O0o0oO.InterfaceC26013OooO00o;

/* JADX INFO: renamed from: o0O0o0oo.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class ViewOnClickListenerC26080OooOO0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C26085OooOOOO f89036OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C26090OooOo00 f89037OooOo0o;

    public ViewOnClickListenerC26080OooOO0(C26085OooOOOO c26085OooOOOO, C26090OooOo00 c26090OooOo00) {
        this.f89036OooOo = c26085OooOOOO;
        this.f89037OooOo0o = c26090OooOo00;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C26085OooOOOO c26085OooOOOO = this.f89036OooOo;
        QuoteInfo quoteInfo = c26085OooOOOO.f89053OooO0oO;
        if (quoteInfo == null) {
            return;
        }
        QuoteInfo quoteInfo2 = (QuoteInfo) quoteInfo.deepCopy(UUID.randomUUID().toString(), c26085OooOOOO.f89053OooO0oO.getBgColor(), c26085OooOOOO.f89053OooO0oO.getUnderlineColor(), 2);
        C26090OooOo00 c26090OooOo00 = this.f89037OooOo0o;
        PDFView pDFView = c26090OooOo00.f89074OooO00o;
        InterfaceC26013OooO00o interfaceC26013OooO00o = c26090OooOo00.f89076OooO0OO;
        if (interfaceC26013OooO00o != null && ((C20451OooO0Oo) interfaceC26013OooO00o).OooO0OO("label_add_stroke_line").booleanValue()) {
            Boolean bool = Boolean.TRUE;
            pDFView.Oooo00O(bool, bool);
            return;
        }
        com.orion.editor.OooO0o oooO0o = c26090OooOo00.f89075OooO0O0;
        QuoteInfo quoteInfoOooO0O0 = oooO0o.OooO0O0();
        QuoteInfo quoteInfo3 = (QuoteInfo) quoteInfo2.deepCopy(quoteInfo2.getId());
        pDFView.OooOO0O(quoteInfoOooO0O0 != null ? Collections.singletonList(quoteInfoOooO0O0) : Collections.EMPTY_LIST, Collections.singletonList(quoteInfo3), EnumC25982o0000oO.f88734OooOo);
        oooO0o.OooO0o0(quoteInfo3);
        Boolean bool2 = Boolean.TRUE;
        pDFView.Oooo00O(bool2, bool2);
    }
}

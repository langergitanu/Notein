package o0O0o0oo;

import OooOOOo.C20451OooO0Oo;
import com.orion.editor.PDFView;
import com.orion.penkit.models.QuoteInfo;
import java.util.Collections;
import o0O0o00.EnumC25982o0000oO;
import o0O0o0oO.InterfaceC26013OooO00o;

/* JADX INFO: renamed from: o0O0o0oo.OooOo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26090OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final PDFView f89074OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final com.orion.editor.OooO0o f89075OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC26013OooO00o f89076OooO0OO;

    public C26090OooOo00(PDFView pDFView, com.orion.editor.OooO0o oooO0o, InterfaceC26013OooO00o interfaceC26013OooO00o) {
        this.f89074OooO00o = pDFView;
        this.f89075OooO0O0 = oooO0o;
        this.f89076OooO0OO = interfaceC26013OooO00o;
    }

    public final void OooO00o(QuoteInfo quoteInfo, Boolean bool) {
        PDFView pDFView = this.f89074OooO00o;
        InterfaceC26013OooO00o interfaceC26013OooO00o = this.f89076OooO0OO;
        if (interfaceC26013OooO00o != null && ((C20451OooO0Oo) interfaceC26013OooO00o).OooO0OO("label_add_annotation").booleanValue()) {
            Boolean bool2 = Boolean.TRUE;
            pDFView.Oooo00O(bool2, bool2);
            return;
        }
        QuoteInfo quoteInfoOooO0O0 = this.f89075OooO0O0.OooO0O0();
        if (quoteInfoOooO0O0 != null && quoteInfoOooO0O0.getType() == -1) {
            quoteInfoOooO0O0 = null;
        }
        QuoteInfo quoteInfo2 = (QuoteInfo) quoteInfo.deepCopy(quoteInfo.getId());
        pDFView.OooOO0O(quoteInfoOooO0O0 != null ? Collections.singletonList(quoteInfoOooO0O0) : Collections.EMPTY_LIST, Collections.singletonList(quoteInfo2), EnumC25982o0000oO.f88734OooOo);
        if (!bool.booleanValue()) {
            pDFView.setActivatedQuoteInfo(quoteInfo2);
        } else {
            Boolean bool3 = Boolean.TRUE;
            pDFView.Oooo00O(bool3, bool3);
        }
    }
}

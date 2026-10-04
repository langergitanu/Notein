package o0O0o0oo;

import OooOOOo.C20451OooO0Oo;
import android.view.View;
import com.orion.editor.PDFView;
import com.orion.editor.p600ui.contextmenu.textselect.p601vo.TextBasicStyleVO;
import com.orion.penkit.models.QuoteInfo;
import o0O0o0oO.InterfaceC26013OooO00o;

/* JADX INFO: renamed from: o0O0o0oo.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class ViewOnClickListenerC26081OooOO0O implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C26085OooOOOO f89038OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C26090OooOo00 f89039OooOo0o;

    public ViewOnClickListenerC26081OooOO0O(C26085OooOOOO c26085OooOOOO, C26090OooOo00 c26090OooOo00) {
        this.f89038OooOo = c26085OooOOOO;
        this.f89039OooOo0o = c26090OooOo00;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TextBasicStyleVO textBasicStyleVO;
        C26085OooOOOO c26085OooOOOO = this.f89038OooOo;
        QuoteInfo quoteInfo = c26085OooOOOO.f89053OooO0oO;
        if (quoteInfo == null) {
            return;
        }
        int bgColor = quoteInfo.getBgColor();
        if (bgColor == 0) {
            C26089OooOOoo c26089OooOOoo = c26085OooOOOO.f89048OooO0O0;
            synchronized (c26089OooOOoo.f89069OooO0OO) {
                textBasicStyleVO = c26089OooOOoo.f89069OooO0OO;
            }
            bgColor = textBasicStyleVO.highlightColor;
        }
        QuoteInfo quoteInfo2 = c26085OooOOOO.f89053OooO0oO;
        QuoteInfo quoteInfo3 = (QuoteInfo) quoteInfo2.deepCopy(quoteInfo2.getId(), bgColor, c26085OooOOOO.f89053OooO0oO.getUnderlineColor(), 5);
        C26090OooOo00 c26090OooOo00 = this.f89039OooOo0o;
        PDFView pDFView = c26090OooOo00.f89074OooO00o;
        InterfaceC26013OooO00o interfaceC26013OooO00o = c26090OooOo00.f89076OooO0OO;
        if (interfaceC26013OooO00o != null && ((C20451OooO0Oo) interfaceC26013OooO00o).OooO0OO("label_add_text_annotation").booleanValue()) {
            Boolean bool = Boolean.TRUE;
            pDFView.Oooo00O(bool, bool);
        } else {
            quoteInfo3.recreateIconBounds(pDFView.getZoomLevel());
            pDFView.Oooo00O(Boolean.FALSE, Boolean.TRUE);
            pDFView.OooooOO(quoteInfo3);
        }
    }
}

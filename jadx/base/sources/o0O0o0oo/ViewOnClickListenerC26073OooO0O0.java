package o0O0o0oo;

import android.view.View;
import com.orion.editor.PDFView;
import com.orion.editor.p600ui.contextmenu.textselect.p601vo.TextBasicStyleVO;
import com.orion.penkit.models.QuoteInfo;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import o0O0o00.EnumC25982o0000oO;
import o0oo0o.InterfaceC31284OooO0O0;

/* JADX INFO: renamed from: o0O0o0oo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class ViewOnClickListenerC26073OooO0O0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ o00O00O.OooO0O0 f89024OooOo0o;

    public ViewOnClickListenerC26073OooO0O0(o00O00O.OooO0O0 oooO0O0) {
        this.f89024OooOo0o = oooO0O0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TextBasicStyleVO textBasicStyleVO = (TextBasicStyleVO) view.getTag();
        o00O00O.OooO0O0 oooO0O0 = this.f89024OooOo0o;
        int i = textBasicStyleVO.highlightColor;
        C26085OooOOOO c26085OooOOOO = (C26085OooOOOO) oooO0O0.f84088OooOo;
        QuoteInfo quoteInfo = (i == 0 && textBasicStyleVO.underlineColor == 0) ? (QuoteInfo) c26085OooOOOO.f89053OooO0oO.deepCopy(UUID.randomUUID().toString(), 0, 0, 4) : i != 0 ? i == c26085OooOOOO.f89053OooO0oO.getBgColor() ? (QuoteInfo) c26085OooOOOO.f89053OooO0oO.deepCopy(UUID.randomUUID().toString(), 0, c26085OooOOOO.f89053OooO0oO.getUnderlineColor(), 4) : (QuoteInfo) c26085OooOOOO.f89053OooO0oO.deepCopy(UUID.randomUUID().toString(), textBasicStyleVO.highlightColor, c26085OooOOOO.f89053OooO0oO.getUnderlineColor(), 4) : textBasicStyleVO.underlineColor == c26085OooOOOO.f89053OooO0oO.getUnderlineColor() ? (QuoteInfo) c26085OooOOOO.f89053OooO0oO.deepCopy(UUID.randomUUID().toString(), c26085OooOOOO.f89053OooO0oO.getBgColor(), 0, 4) : (QuoteInfo) c26085OooOOOO.f89053OooO0oO.deepCopy(UUID.randomUUID().toString(), c26085OooOOOO.f89053OooO0oO.getBgColor(), textBasicStyleVO.underlineColor, 4);
        int bgColor = quoteInfo.getBgColor();
        C26090OooOo00 c26090OooOo00 = (C26090OooOo00) oooO0O0.f84089OooOo0o;
        if (bgColor == 0 && quoteInfo.getUnderlineColor() == 0) {
            c26085OooOOOO.f89047OooO00o.f89026OooO00o.dismiss();
            List<InterfaceC31284OooO0O0> listSingletonList = Collections.singletonList((QuoteInfo) quoteInfo.deepCopy(c26085OooOOOO.f89053OooO0oO.getId()));
            List<InterfaceC31284OooO0O0> list = Collections.EMPTY_LIST;
            EnumC25982o0000oO enumC25982o0000oO = EnumC25982o0000oO.f88734OooOo;
            PDFView pDFView = c26090OooOo00.f89074OooO00o;
            pDFView.OooOO0O(listSingletonList, list, enumC25982o0000oO);
            Boolean bool = Boolean.TRUE;
            pDFView.Oooo00O(bool, bool);
        } else {
            c26090OooOo00.OooO00o(quoteInfo, Boolean.FALSE);
            c26085OooOOOO.f89048OooO0O0.OooO0O0(quoteInfo.getBgColor(), quoteInfo.getUnderlineColor(), true);
            c26085OooOOOO.OooO00o(quoteInfo);
            c26085OooOOOO.f89047OooO00o.f89028OooO0OO.OooO0Oo(c26085OooOOOO.f89048OooO0O0.OooO00o());
        }
        c26085OooOOOO.f89053OooO0oO = quoteInfo;
    }
}

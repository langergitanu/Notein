package o0O0o0oo;

import android.view.View;
import android.widget.Toast;
import com.orion.editor.PDFView;
import com.orion.notein.global.R;
import com.orion.penkit.models.QuoteInfo;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import o0O0o00.EnumC25982o0000oO;
import o0oo0o.InterfaceC31284OooO0O0;

/* JADX INFO: renamed from: o0O0o0oo.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class ViewOnClickListenerC26082OooOO0o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C26085OooOOOO f89040OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C26090OooOo00 f89041OooOo0o;

    public ViewOnClickListenerC26082OooOO0o(C26085OooOOOO c26085OooOOOO, C26090OooOo00 c26090OooOo00) {
        this.f89040OooOo = c26085OooOOOO;
        this.f89041OooOo0o = c26090OooOo00;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C26085OooOOOO c26085OooOOOO = this.f89040OooOo;
        QuoteInfo quoteInfo = c26085OooOOOO.f89053OooO0oO;
        if (quoteInfo != null) {
            QuoteInfo quoteInfo2 = (QuoteInfo) quoteInfo.deepCopy(UUID.randomUUID().toString(), c26085OooOOOO.f89053OooO0oO.getBgColor(), c26085OooOOOO.f89053OooO0oO.getUnderlineColor(), 3);
            C26090OooOo00 c26090OooOo00 = this.f89041OooOo0o;
            QuoteInfo quoteInfoOooO0O0 = c26090OooOo00.f89075OooO0O0.OooO0O0();
            QuoteInfo quoteInfo3 = (QuoteInfo) quoteInfo2.deepCopy(quoteInfo2.getId());
            List<InterfaceC31284OooO0O0> listSingletonList = quoteInfoOooO0O0 != null ? Collections.singletonList(quoteInfoOooO0O0) : Collections.EMPTY_LIST;
            List<InterfaceC31284OooO0O0> listSingletonList2 = Collections.singletonList(quoteInfo3);
            EnumC25982o0000oO enumC25982o0000oO = EnumC25982o0000oO.f88734OooOo;
            PDFView pDFView = c26090OooOo00.f89074OooO00o;
            pDFView.OooOO0O(listSingletonList, listSingletonList2, enumC25982o0000oO);
            Toast toastMakeText = Toast.makeText(pDFView.getContext(), pDFView.getContext().getString(R.string.toast_add_to_outline_success), 0);
            toastMakeText.setGravity(17, 0, 0);
            toastMakeText.show();
            pDFView.Oooo000();
        }
    }
}

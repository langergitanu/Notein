package o0O0o0oo;

import android.view.View;
import com.orion.editor.p600ui.contextmenu.textselect.p601vo.TextBasicStyleVO;
import com.orion.penkit.models.QuoteInfo;
import java.util.UUID;

/* JADX INFO: renamed from: o0O0o0oo.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class ViewOnClickListenerC26071OooO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C26085OooOOOO f89022OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C26090OooOo00 f89023OooOo0o;

    public ViewOnClickListenerC26071OooO(C26085OooOOOO c26085OooOOOO, C26090OooOo00 c26090OooOo00) {
        this.f89022OooOo = c26085OooOOOO;
        this.f89023OooOo0o = c26090OooOo00;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TextBasicStyleVO textBasicStyleVO;
        C26085OooOOOO c26085OooOOOO = this.f89022OooOo;
        if (c26085OooOOOO.f89053OooO0oO == null) {
            return;
        }
        C26089OooOOoo c26089OooOOoo = c26085OooOOOO.f89048OooO0O0;
        synchronized (c26089OooOOoo.f89069OooO0OO) {
            textBasicStyleVO = c26089OooOOoo.f89069OooO0OO;
        }
        if (textBasicStyleVO.highlightColor == 0 && textBasicStyleVO.underlineColor == 0) {
            return;
        }
        this.f89023OooOo0o.OooO00o((QuoteInfo) c26085OooOOOO.f89053OooO0oO.deepCopy(UUID.randomUUID().toString(), textBasicStyleVO.highlightColor, textBasicStyleVO.underlineColor, 4), Boolean.TRUE);
    }
}

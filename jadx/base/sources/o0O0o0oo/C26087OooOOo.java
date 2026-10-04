package o0O0o0oo;

import androidx.core.location.LocationRequestCompat;
import com.orion.editor.p600ui.contextmenu.textselect.p601vo.TextBasicStyleVO;

/* JADX INFO: renamed from: o0O0o0oo.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26087OooOOo implements oOO00OOO.OooO0O0<TextBasicStyleVO> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C26089OooOOoo f89063OooOo0o;

    public C26087OooOOo(C26089OooOOoo c26089OooOOoo) {
        this.f89063OooOo0o = c26089OooOOoo;
    }

    @Override // oOO00OOO.OooO0O0
    public final void OooO0Oo(oOO00OOO.OooO0OO oooO0OO) {
        this.f89063OooOo0o.f89068OooO0O0 = oooO0OO;
        oooO0OO.request(LocationRequestCompat.PASSIVE_INTERVAL);
    }

    @Override // oOO00OOO.OooO0O0
    public final void onComplete() {
    }

    @Override // oOO00OOO.OooO0O0
    public final void onError(Throwable th) {
    }

    @Override // oOO00OOO.OooO0O0
    public final void onNext(TextBasicStyleVO textBasicStyleVO) {
        TextBasicStyleVO textBasicStyleVO2 = textBasicStyleVO;
        if (textBasicStyleVO2.isEmpty()) {
            return;
        }
        C26089OooOOoo c26089OooOOoo = this.f89063OooOo0o;
        c26089OooOOoo.f89069OooO0OO = textBasicStyleVO2;
        C26079OooO0oo c26079OooO0oo = c26089OooOOoo.f89071OooO0o;
        c26079OooO0oo.getClass();
        c26079OooO0oo.f89035OooO00o.OooO0O0(textBasicStyleVO2.highlightColor, textBasicStyleVO2.underlineColor);
    }
}

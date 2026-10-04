package o0ooOOoo;

import Oooo0.o000000O;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.global.R;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o0OoOo.C29194OooO00o;
import o0OoOo.C29196OooO0OO;
import o0OoOo.C29197OooO0Oo;

/* JADX INFO: renamed from: o0ooOOoo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31657OooO0OO implements InterfaceC31661OooO0oO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C31660OooO0o0 f113157OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final PopupWindow f113158OooOo0o;

    public C31657OooO0OO(Context context) {
        int iOooO0o = o000000O.OooO0o(StyleIdentifier.SUBTLE_EMPHASIS);
        Object systemService = context.getSystemService("layout_inflater");
        OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.popup_audio_file, (ViewGroup) null);
        OooOOO0.OooO0o(viewInflate, "inflate(...)");
        this.f113157OooOo = new C31660OooO0o0(viewInflate);
        PopupWindow popupWindow = new PopupWindow(viewInflate, iOooO0o, -2, true);
        this.f113158OooOo0o = popupWindow;
        popupWindow.setOutsideTouchable(true);
        popupWindow.setElevation(10.0f);
    }

    @Override // o0ooOOoo.InterfaceC31661OooO0oO
    public final void OooO(InterfaceC31656OooO0O0 interfaceC31656OooO0O0) {
        this.f113157OooOo.f113165OooO0O0 = interfaceC31656OooO0O0;
    }

    @Override // o0ooOOoo.InterfaceC31661OooO0oO
    public final void OooO00o() {
        this.f113158OooOo0o.dismiss();
    }

    @Override // o0ooOOoo.InterfaceC31661OooO0oO
    public final void OooO0O0(View anchor) {
        OooOOO0.OooO0oO(anchor, "anchor");
        this.f113158OooOo0o.showAsDropDown(anchor, 0, 0);
    }

    @Override // o0ooOOoo.InterfaceC31661OooO0oO
    public final void OooO0Oo(List<C29197OooO0Oo> list) {
        OooOOO0.OooO0oO(list, "list");
        C31660OooO0o0 c31660OooO0o0 = this.f113157OooOo;
        c31660OooO0o0.getClass();
        c31660OooO0o0.f113168OooO0o.OooO0Oo(list);
    }

    @Override // o0ooOOoo.InterfaceC31661OooO0oO
    public final void OooOO0(boolean z) {
        this.f113157OooOo.OooO00o(z);
    }

    @Override // o0ooOOoo.InterfaceC31661OooO0oO
    public final boolean OooOO0o() {
        return this.f113158OooOo0o.isShowing();
    }

    @Override // o0ooOOoo.InterfaceC31661OooO0oO
    public final void OooOOoo(List<C29196OooO0OO> list, C29194OooO00o c29194OooO00o, boolean z) {
        OooOOO0.OooO0oO(list, "list");
        this.f113157OooOo.OooO0O0(list, c29194OooO00o, z);
    }
}

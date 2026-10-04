package o0ooOOoo;

import android.content.Context;
import android.view.View;
import com.orion.notein.global.R;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o0OoOo.C29194OooO00o;
import o0OoOo.C29196OooO0OO;
import o0OoOo.C29197OooO0Oo;
import o0oOo0o0.DialogC30986OooO0oo;

/* JADX INFO: renamed from: o0ooOOoo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class DialogC31655OooO00o extends DialogC30986OooO0oo implements InterfaceC31661OooO0oO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C31660OooO0o0 f113156OooOo;

    public DialogC31655OooO00o(Context context) {
        super(context, R.layout.dialog_bottom_sheet_audio_file);
        this.f113156OooOo = new C31660OooO0o0(this.f110684OooOo0o);
    }

    @Override // o0ooOOoo.InterfaceC31661OooO0oO
    public final void OooO(InterfaceC31656OooO0O0 interfaceC31656OooO0O0) {
        this.f113156OooOo.f113165OooO0O0 = interfaceC31656OooO0O0;
    }

    @Override // o0ooOOoo.InterfaceC31661OooO0oO
    public final void OooO0O0(View anchor) {
        OooOOO0.OooO0oO(anchor, "anchor");
        show();
    }

    @Override // o0ooOOoo.InterfaceC31661OooO0oO
    public final void OooO0Oo(List<C29197OooO0Oo> list) {
        OooOOO0.OooO0oO(list, "list");
        C31660OooO0o0 c31660OooO0o0 = this.f113156OooOo;
        c31660OooO0o0.getClass();
        c31660OooO0o0.f113168OooO0o.OooO0Oo(list);
    }

    @Override // o0ooOOoo.InterfaceC31661OooO0oO
    public final void OooOO0(boolean z) {
        this.f113156OooOo.OooO00o(z);
    }

    @Override // o0ooOOoo.InterfaceC31661OooO0oO
    public final void OooOOoo(List<C29196OooO0OO> list, C29194OooO00o c29194OooO00o, boolean z) {
        OooOOO0.OooO0oO(list, "list");
        this.f113156OooOo.OooO0O0(list, c29194OooO00o, z);
    }
}

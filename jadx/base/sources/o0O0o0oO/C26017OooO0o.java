package o0O0o0oO;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import com.orion.editor.PDFView;
import com.orion.editor.model.ClipboardData;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import o0O0oO0.InterfaceC26092OooO00o;
import o0O0oOO.C26106OooO0O0;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00o.AbstractC32316OooO0OO;
import oO00o0oo.C32394OooO00o;
import oO00oO00.InterfaceC32402OooO0O0;
import oO00oO0O.C32408OooO0Oo;
import oO00oOO.C32416OooO0OO;
import oO00oOo.C32428OooO00o;
import oOO00oo.C34406OooO00o;
import oOo00ooo.C34581OooO0o;
import oOo00ooo.C34585OooOO0;

/* JADX INFO: renamed from: o0O0o0oO.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26017OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final PDFView f88845OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC26092OooO00o f88846OooO0O0;

    public C26017OooO0o(PDFView pDFView, InterfaceC26092OooO00o interfaceC26092OooO00o) {
        this.f88845OooO00o = pDFView;
        this.f88846OooO0O0 = interfaceC26092OooO00o;
    }

    public final void OooO00o(final Point point, final boolean z) {
        PDFView pDFView = this.f88845OooO00o;
        pDFView.getTool().OooOO0O();
        final Context context = pDFView.getContext();
        final ClipboardData clipboardData = pDFView.getClipboardData();
        AbstractC32316OooO0OO<Boolean> abstractC32316OooO0OOOooO0O0 = C26106OooO0O0.OooO0O0(pDFView.getContext(), "image");
        C32416OooO0OO c32416OooO0OO = C32428OooO00o.f116617OooO00o;
        Objects.requireNonNull(c32416OooO0OO, "scheduler is null");
        new C34581OooO0o(new C34585OooOO0(abstractC32316OooO0OOOooO0O0, c32416OooO0OO), new C26014OooO0O0(this)).OooO0O0(C32394OooO00o.OooO00o()).OooO00o(new C32408OooO0Oo(new InterfaceC32402OooO0O0() { // from class: o0O0o0oO.OooO0OO
            @Override // oO00oO00.InterfaceC32402OooO0O0
            public final void accept(Object obj) {
                Uri uri;
                Long l = (Long) obj;
                C26017OooO0o c26017OooO0o = this.f88840OooO00o;
                c26017OooO0o.getClass();
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("ContextMenuEventImpl");
                c20358OooO00o.OooO0o0("ContextMenuEventListenerImpl.onPaste, sys timestamp: %s", l);
                Point point2 = point;
                ClipboardData clipboardData2 = clipboardData;
                InterfaceC26092OooO00o interfaceC26092OooO00o = c26017OooO0o.f88846OooO0O0;
                if (clipboardData2 == null || clipboardData2.f69322OooO0O0.longValue() < l.longValue()) {
                    Context context2 = context;
                    ClipData primaryClip = ((ClipboardManager) context2.getSystemService("clipboard")).getPrimaryClip();
                    if (primaryClip == null || primaryClip.getItemCount() <= 0 || (uri = primaryClip.getItemAt(0).getUri()) == null) {
                        return;
                    }
                    interfaceC26092OooO00o.OooO00o(uri, point2);
                    C26106OooO0O0.OooO00o(context2);
                    return;
                }
                List<InterfaceC31284OooO0O0> list = clipboardData2.f69321OooO00o;
                PDFView pDFView2 = c26017OooO0o.f88845OooO00o;
                if (list == null || list.isEmpty()) {
                    C26106OooO0O0.OooO00o(pDFView2.getContext());
                } else {
                    interfaceC26092OooO00o.OooO0O0((List) clipboardData2.f69321OooO00o.stream().map(new C26016OooO0Oo()).collect(Collectors.toList()), new C26018OooO0o0(c26017OooO0o, point2, z));
                    C26106OooO0O0.OooO00o(pDFView2.getContext());
                }
            }
        }));
    }
}

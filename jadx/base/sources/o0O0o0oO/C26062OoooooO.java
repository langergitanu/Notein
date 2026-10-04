package o0O0o0oO;

import android.graphics.RectF;
import androidx.core.util.Pair;
import com.orion.editor.PDFView;
import com.orion.editor.model.ClipboardData;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import o0oo0o.InterfaceC31284OooO0O0;

/* JADX INFO: renamed from: o0O0o0oO.OoooooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26062OoooooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final PDFView f88962OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC26048OoooO0O f88963OooO0O0;

    public C26062OoooooO(PDFView pDFView, InterfaceC26048OoooO0O interfaceC26048OoooO0O) {
        this.f88962OooO00o = pDFView;
        this.f88963OooO0O0 = interfaceC26048OoooO0O;
    }

    public final void OooO00o(List list, final RectF rectF) {
        PDFView pDFView = this.f88962OooO00o;
        Pair<Integer, Integer> pairOooOOOo = pDFView.f69170OooOooO.OooOOOo(rectF);
        ClipboardData clipboardData = new ClipboardData();
        final float f = pDFView.f69170OooOooO.OooOO0O(pairOooOOOo.first.intValue()).f89149OooO00o / pDFView.f69170OooOooO.OooOo0o(pairOooOOOo.first.intValue(), pDFView.getZoom()).f89149OooO00o;
        clipboardData.f69321OooO00o = (List) list.stream().map(new Function() { // from class: o0O0o0oO.Oooooo
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = (InterfaceC31284OooO0O0) obj;
                C26062OoooooO c26062OoooooO = this.f88956OooO00o;
                c26062OoooooO.getClass();
                InterfaceC31284OooO0O0 interfaceC31284OooO0O0DeepCopy = interfaceC31284OooO0O0.deepCopy(interfaceC31284OooO0O0.getId());
                RectF rectF2 = rectF;
                interfaceC31284OooO0O0DeepCopy.offset(-rectF2.left, -rectF2.top);
                interfaceC31284OooO0O0DeepCopy.scale(f, c26062OoooooO.f88962OooO00o.getPenWidthScale());
                return interfaceC31284OooO0O0DeepCopy;
            }
        }).collect(Collectors.toList());
        pDFView.setClipboardData(clipboardData);
    }
}

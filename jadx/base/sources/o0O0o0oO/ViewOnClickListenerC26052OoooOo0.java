package o0O0o0oO;

import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import com.google.firebase.firestore.C22609OoooO;
import com.orion.editor.PDFView;
import com.orion.notein.p607ui.export.ExportDialogFragment;
import com.orion.penkit.models.LassoParams;
import java.util.List;
import o0oo0o.InterfaceC31284OooO0O0;

/* JADX INFO: renamed from: o0O0o0oO.OoooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ViewOnClickListenerC26052OoooOo0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f88940OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f88941OooOo0o;

    public /* synthetic */ ViewOnClickListenerC26052OoooOo0(Object obj, int i) {
        this.f88941OooOo0o = i;
        this.f88940OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f88941OooOo0o) {
            case 0:
                C26061Oooooo0 c26061Oooooo0 = (C26061Oooooo0) this.f88940OooOo;
                LassoParams lassoParams = c26061Oooooo0.f88960OooO0O0;
                if (lassoParams != null) {
                    C26062OoooooO c26062OoooooO = c26061Oooooo0.f88961OooO0OO;
                    c26062OoooooO.getClass();
                    InterfaceC31284OooO0O0.OooO00o oooO00o = InterfaceC31284OooO0O0.f111702OooO0O0;
                    List<InterfaceC31284OooO0O0> selectedItems = lassoParams.getSelectedItems();
                    PDFView pDFView = c26062OoooooO.f88962OooO00o;
                    float zoomLevel = pDFView.getZoomLevel();
                    oooO00o.getClass();
                    RectF rectFOooO0O0 = InterfaceC31284OooO0O0.OooO00o.OooO0O0(zoomLevel, selectedItems);
                    if (rectFOooO0O0 != null) {
                        c26062OoooooO.OooO00o(lassoParams.getSelectedItems(), rectFOooO0O0);
                        C22609OoooO c22609OoooO = pDFView.f69269o000o000;
                        if (c22609OoooO != null) {
                            RectF border = lassoParams.getBorder();
                            c22609OoooO.OooO00o(rectFOooO0O0, new PointF((border.left + border.right) / 2.0f, (border.top + border.bottom) / 2.0f));
                        }
                        break;
                    }
                }
                break;
            default:
                ((ExportDialogFragment) this.f88940OooOo).Oooo0OO().OooO0oo(2);
                break;
        }
    }
}

package o0o00Ooo;

import Oooo0.o000000O;
import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import com.orion.notein.p607ui.p609vo.PenColorVO;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o0Oo00oO.C28038OooO0Oo;
import o0OoOOOo.InterfaceC29093OooO00o;
import o0o00OoO.DialogC29911OooO0O0;
import o0o00o0.C29935OooO0o0;
import o0o00o0.InterfaceC29930OooO00o;
import o0o00o0O.AbstractC29946OooO0O0;
import o0o00oO0.C29990OooO0oO;
import o0oOo0o0.C30983OooO0o;
import oO00ooO.C32443OooOOO;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOO0 extends AbstractC29946OooO0O0 implements InterfaceC29093OooO00o {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final int f106166OooOO0O = o000000O.OooO0o(220);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public OooO00o f106167OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f106168OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f106169OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public DialogC29911OooO0O0 f106170OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final View f106171OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public C29990OooO0oO f106172OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public View.OnClickListener f106173OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public PenBox.OooO0o f106174OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public List<C29920OooO0oo> f106175OooOO0;

    public interface OooO00o {
        void OooO00o();
    }

    public OooOO0(boolean z, boolean z2, Context context) {
        super(context, R.layout.popup_toolbox_pen_color, o000000O.OooO0o(220), o000000O.OooO0o(StyleIdentifier.GRID_TABLE_2_ACCENT_2));
        this.f106168OooO0O0 = z;
        this.f106169OooO0OO = z2;
        this.f106175OooOO0 = C34434OooOoO.f123453OooOo0o;
        View contentView = OooO0OO().getContentView();
        OooOOO0.OooO0o(contentView, "getContentView(...)");
        this.f106171OooO0o = contentView.findViewById(R.id.iv_eyedropper_vip_badge);
        OooO0OO().setInputMethodMode(1);
        OooO0OO().setSoftInputMode(16);
        OooO0OO().setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: o0o00Ooo.OooO
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                OooOO0 oooOO02 = this.f106131OooOo0o;
                InterfaceC29930OooO00o interfaceC29930OooO00o = oooOO02.f106170OooO0Oo;
                if (interfaceC29930OooO00o == null) {
                    interfaceC29930OooO00o = null;
                }
                if (interfaceC29930OooO00o == null) {
                    interfaceC29930OooO00o = oooOO02.f106172OooO0o0;
                }
                if (interfaceC29930OooO00o != null) {
                    interfaceC29930OooO00o.onDismiss();
                }
            }
        });
        OooO0OO().getContentView().setSystemUiVisibility(2);
    }

    public static int OooO0Oo(int i) {
        return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), i == -2 ? 0 : 1073741824);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO(View view, int i, PenColorVO penColorVO) {
        if (C30983OooO0o.OooO00o(view, "getContext(...)")) {
            OooO0oo(view, penColorVO);
            return;
        }
        OooO0o(penColorVO);
        C32443OooOOO c32443OooOOOOooO0O0 = OooO0O0(i, view);
        OooO0OO().showAtLocation(view, 0, ((Number) c32443OooOOOOooO0O0.f116638OooOo0o).intValue(), ((Number) c32443OooOOOOooO0O0.f116637OooOo).intValue());
    }

    @Override // o0o00Oo.InterfaceC29896OooO0OO
    public final boolean OooO00o() {
        DialogC29911OooO0O0 dialogC29911OooO0O0 = this.f106170OooO0Oo;
        if (dialogC29911OooO0O0 == null) {
            return OooO0OO().isShowing();
        }
        if (dialogC29911OooO0O0 != null) {
            return dialogC29911OooO0O0.isShowing();
        }
        return false;
    }

    public final void OooO0o(PenColorVO penColorVO) {
        this.f106170OooO0Oo = null;
        if (this.f106172OooO0o0 == null) {
            View contentView = OooO0OO().getContentView();
            OooOOO0.OooO0o(contentView, "getContentView(...)");
            this.f106172OooO0o0 = new C29990OooO0oO(f106166OooOO0O, contentView);
        }
        C29990OooO0oO c29990OooO0oO = this.f106172OooO0o0;
        if (c29990OooO0oO != null) {
            c29990OooO0oO.OooO00o(penColorVO);
        }
        C29990OooO0oO c29990OooO0oO2 = this.f106172OooO0o0;
        if (c29990OooO0oO2 != null) {
            c29990OooO0oO2.f106537Oooo0o = new C29935OooO0o0(this.f106173OooO0oO, this.f106174OooO0oo, this.f106167OooO);
        }
        if (c29990OooO0oO2 != null) {
            c29990OooO0oO2.OooO0O0(this.f106168OooO0O0);
        }
        C29990OooO0oO c29990OooO0oO3 = this.f106172OooO0o0;
        if (c29990OooO0oO3 != null) {
            c29990OooO0oO3.OooO0Oo(this.f106169OooO0OO);
        }
        C29990OooO0oO c29990OooO0oO4 = this.f106172OooO0o0;
        if (c29990OooO0oO4 != null) {
            c29990OooO0oO4.OooOOo(this.f106175OooOO0);
        }
    }

    public final void OooO0o0(boolean z) {
        this.f106171OooO0o.setVisibility((z && this.f106169OooO0OO) ? 0 : 8);
    }

    public final void OooO0oO(View anchor, PenColorVO penColorVO) {
        OooOOO0.OooO0oO(anchor, "anchor");
        Context context = anchor.getContext();
        OooOOO0.OooO0o(context, "getContext(...)");
        if (C28038OooO0Oo.OooO0O0(context)) {
            OooO0oo(anchor, penColorVO);
        } else {
            OooO0o(penColorVO);
            OooO0OO().showAsDropDown(anchor);
        }
    }

    public final void OooO0oo(View view, PenColorVO penColorVO) {
        Context context = view.getContext();
        OooOOO0.OooO0o(context, "getContext(...)");
        DialogC29911OooO0O0 dialogC29911OooO0O0 = new DialogC29911OooO0O0(context, R.layout.dialog_bottom_sheet_pen_color_settings);
        dialogC29911OooO0O0.f106127OooOoO0 = penColorVO;
        dialogC29911OooO0O0.f106126OooOoO = new C29935OooO0o0(this.f106173OooO0oO, this.f106174OooO0oo, this.f106167OooO);
        dialogC29911OooO0O0.f106128OooOoOO = this.f106168OooO0O0;
        dialogC29911OooO0O0.f106130OooOoo0 = this.f106169OooO0OO;
        dialogC29911OooO0O0.OooOOo(this.f106175OooOO0);
        this.f106170OooO0Oo = dialogC29911OooO0O0;
        dialogC29911OooO0O0.show();
    }

    public final void OooOO0(List<C29920OooO0oo> list) {
        OooOOO0.OooO0oO(list, "list");
        this.f106175OooOO0 = list;
        InterfaceC29930OooO00o interfaceC29930OooO00o = this.f106170OooO0Oo;
        if (interfaceC29930OooO00o == null) {
            interfaceC29930OooO00o = null;
        }
        if (interfaceC29930OooO00o == null) {
            interfaceC29930OooO00o = this.f106172OooO0o0;
        }
        if (interfaceC29930OooO00o != null) {
            interfaceC29930OooO00o.OooOOo(list);
        }
    }

    @Override // o0o00Oo.InterfaceC29896OooO0OO
    public final void dismiss() {
        DialogC29911OooO0O0 dialogC29911OooO0O0 = this.f106170OooO0Oo;
        if (dialogC29911OooO0O0 == null) {
            OooO0OO().dismiss();
        } else if (dialogC29911OooO0O0 != null) {
            dialogC29911OooO0O0.dismiss();
        }
    }
}

package o0o0O0;

import OooOoOO.C20519OooO0Oo;
import Oooo0.o000000O;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.PopupWindow;
import androidx.fragment.app.C21929Ooooo0o;
import androidx.fragment.app.FragmentManager;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.notelist.notemorepopupwindow.NoteMoreActionsBottomSheetDialog;
import com.orion.notein.p607ui.p609vo.NoteVO;
import kotlin.jvm.internal.OooOOO0;
import o0Oo00oO.C28038OooO0Oo;
import o0Ooo.C29260OooO0oo;
import o0o0O00.C30201OooOOO0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32447OooOOo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f107434OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C30201OooOOO0 f107435OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public C30183OooO0oo f107436OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public View f107437OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C32447OooOOo f107438OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public NoteMoreActionsBottomSheetDialog f107439OooO0o0;

    public OooO(Context context, C30201OooOOO0 c30201OooOOO0) {
        this.f107434OooO00o = context;
        this.f107435OooO0O0 = c30201OooOOO0;
        c30201OooOOO0.f107552OooO0o0 = this;
        this.f107438OooO0o = C20519OooO0Oo.OooO0OO(new C29260OooO0oo(this, 1));
    }

    public final void OooO00o() {
        NoteMoreActionsBottomSheetDialog noteMoreActionsBottomSheetDialog = this.f107439OooO0o0;
        if (noteMoreActionsBottomSheetDialog != null) {
            noteMoreActionsBottomSheetDialog.dismissAllowingStateLoss();
        }
        ((PopupWindow) this.f107438OooO0o.getValue()).dismiss();
    }

    public final boolean OooO0O0() {
        NoteMoreActionsBottomSheetDialog noteMoreActionsBottomSheetDialog = this.f107439OooO0o0;
        return noteMoreActionsBottomSheetDialog != null ? noteMoreActionsBottomSheetDialog.isVisible() : ((PopupWindow) this.f107438OooO0o.getValue()).isShowing();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0OO(View anchor, NoteVO noteVO) {
        C32443OooOOO c32443OooOOO;
        OooOOO0.OooO0oO(anchor, "anchor");
        Context context = anchor.getContext();
        OooOOO0.OooO0o(context, "getContext(...)");
        boolean zOooO0O0 = C28038OooO0Oo.OooO0O0(context);
        C30201OooOOO0 c30201OooOOO0 = this.f107435OooO0O0;
        if (zOooO0O0) {
            FragmentManager childFragmentManager = C21929Ooooo0o.OooO0Oo(anchor).getChildFragmentManager();
            OooOOO0.OooO0o(childFragmentManager, "getChildFragmentManager(...)");
            NoteMoreActionsBottomSheetDialog noteMoreActionsBottomSheetDialog = new NoteMoreActionsBottomSheetDialog();
            noteMoreActionsBottomSheetDialog.f77826OooOoO = noteVO;
            noteMoreActionsBottomSheetDialog.f77827OooOoO0 = c30201OooOOO0;
            this.f107439OooO0o0 = noteMoreActionsBottomSheetDialog;
            noteMoreActionsBottomSheetDialog.show(childFragmentManager, "NoteMoreActionsBottomSheetDialog");
            return;
        }
        this.f107437OooO0Oo = anchor;
        Rect rect = new Rect();
        anchor.getGlobalVisibleRect(rect);
        if (anchor.getId() == R.id.more) {
            Rect rect2 = new Rect();
            anchor.getGlobalVisibleRect(rect2);
            c32443OooOOO = new C32443OooOOO(Integer.valueOf(rect2.left - o000000O.OooO0o(80)), Integer.valueOf(rect.bottom));
        } else {
            c32443OooOOO = new C32443OooOOO(Integer.valueOf(rect.centerX()), Integer.valueOf(rect.centerY()));
        }
        ((PopupWindow) this.f107438OooO0o.getValue()).showAtLocation(anchor, 0, ((Number) c32443OooOOO.f116638OooOo0o).intValue(), ((Number) c32443OooOOO.f116637OooOo).intValue());
        C30183OooO0oo c30183OooO0oo = this.f107436OooO0OO;
        if (c30183OooO0oo != null) {
            c30183OooO0oo.OooO00o(noteVO, c30201OooOOO0);
        }
    }
}

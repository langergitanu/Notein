package o0OoOoo0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.p609vo.LatestOpenedNoteVO;
import java.util.Iterator;
import java.util.List;
import o0Oo00oO.C28038OooO0Oo;
import o0Oo0oOo.o000000O;
import o0OoO000.o000OOo;
import oO0OOooo.C33163OooO0oO;

/* JADX INFO: renamed from: o0OoOoo0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29229OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000000O f103647OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final PopupWindow f103648OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final RecyclerView f103649OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C29227OooO0O0 f103650OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f103651OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f103652OooO0o0;

    public C29229OooO0Oo(C33163OooO0oO c33163OooO0oO, o000000O o000000o2) {
        this.f103647OooO00o = o000000o2;
        Object systemService = c33163OooO0oO.getSystemService("layout_inflater");
        kotlin.jvm.internal.OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.popup_window_latest_opened_note, (ViewGroup) null);
        kotlin.jvm.internal.OooOOO0.OooO0o(viewInflate, "inflate(...)");
        int dimensionPixelSize = c33163OooO0oO.getResources().getDimensionPixelSize(R.dimen.latest_opened_note_popup_window_width);
        this.f103652OooO0o0 = (int) (((double) C28038OooO0Oo.OooO00o(c33163OooO0oO).f116637OooOo.intValue()) * 0.6d);
        this.f103651OooO0o = Oooo0.o000000O.OooO0o(45);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.rv_latest_opened_note);
        this.f103649OooO0OO = recyclerView;
        C29227OooO0O0 c29227OooO0O0 = new C29227OooO0O0(o000000o2);
        this.f103650OooO0Oo = c29227OooO0O0;
        recyclerView.setAdapter(c29227OooO0O0);
        View viewFindViewById = viewInflate.findViewById(R.id.cl_close_other_tabs);
        kotlin.jvm.internal.OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
        viewFindViewById.setOnClickListener(new o000OOo(this, 1));
        PopupWindow popupWindow = new PopupWindow(viewInflate, dimensionPixelSize, -2, false);
        this.f103648OooO0O0 = popupWindow;
        popupWindow.setOutsideTouchable(true);
        popupWindow.setElevation(10.0f);
    }

    public final void OooO00o(final List<LatestOpenedNoteVO> vos) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(vos, "vos");
        try {
            int size = vos.size();
            int i = this.f103651OooO0o;
            int iOooO0o = (Oooo0.o000000O.OooO0o(8) * 2) + (size * i) + i;
            int i2 = this.f103652OooO0o0;
            if (iOooO0o > i2) {
                iOooO0o = i2;
            }
            PopupWindow popupWindow = this.f103648OooO0O0;
            popupWindow.update(popupWindow.getWidth(), iOooO0o);
        } catch (Exception unused) {
        }
        this.f103650OooO0Oo.OooO0o0(vos, new Runnable() { // from class: o0OoOoo0.OooO0OO
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = vos.iterator();
                int i3 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i3 = -1;
                        break;
                    } else if (((LatestOpenedNoteVO) it.next()).isSelected()) {
                        break;
                    } else {
                        i3++;
                    }
                }
                this.f103649OooO0OO.scrollToPosition(i3);
            }
        });
    }
}

package o0O0o0oo;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.editor.p600ui.contextmenu.textselect.p601vo.TextBasicStyleVO;
import com.orion.notein.global.R;
import o0O0oo0O.C26211OooO0O0;

/* JADX INFO: renamed from: o0O0o0oo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26075OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final PopupWindow f89026OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00O00O.OooO0O0 f89027OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C26211OooO0O0 f89028OooO0OO;

    /* JADX INFO: renamed from: o0O0o0oo.OooO0Oo$OooO00o */
    public class OooO00o extends OooOOO.AbstractC22036OooO0o0<TextBasicStyleVO> {
        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(TextBasicStyleVO textBasicStyleVO, TextBasicStyleVO textBasicStyleVO2) {
            return textBasicStyleVO.isSelected == textBasicStyleVO2.isSelected;
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(TextBasicStyleVO textBasicStyleVO, TextBasicStyleVO textBasicStyleVO2) {
            TextBasicStyleVO textBasicStyleVO3 = textBasicStyleVO;
            TextBasicStyleVO textBasicStyleVO4 = textBasicStyleVO2;
            return textBasicStyleVO3.highlightColor == textBasicStyleVO4.highlightColor && textBasicStyleVO3.underlineColor == textBasicStyleVO4.underlineColor;
        }
    }

    public C26075OooO0Oo(Context context, o00O00O.OooO0O0 oooO0O0) {
        OooO00o oooO00o = new OooO00o();
        this.f89027OooO0O0 = oooO0O0;
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.popup_text_hightlight_style, (ViewGroup) null);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.rv_highlight_style);
        recyclerView.setItemAnimator(null);
        recyclerView.setOverScrollMode(2);
        C26211OooO0O0 c26211OooO0O0 = new C26211OooO0O0(oooO00o);
        this.f89028OooO0OO = c26211OooO0O0;
        c26211OooO0O0.f89540OooO0O0 = new ViewOnClickListenerC26073OooO0O0(oooO0O0);
        recyclerView.setAdapter(c26211OooO0O0);
        PopupWindow popupWindow = new PopupWindow(viewInflate, (int) (Resources.getSystem().getDisplayMetrics().density * 288.0f), -2, false);
        this.f89026OooO00o = popupWindow;
        popupWindow.setOutsideTouchable(false);
        if (Build.VERSION.SDK_INT >= 29) {
            popupWindow.setIsLaidOutInScreen(true);
        }
        popupWindow.setElevation(10.0f);
        popupWindow.setOnDismissListener(new C26074OooO0OO(oooO0O0));
    }
}

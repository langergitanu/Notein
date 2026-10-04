package o0O0o0oO;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.orion.editor.AbstractC22830OooO0Oo;
import com.orion.editor.PDFView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.notelist.search.SearchListContainerFragment;
import com.orion.penkit.models.LassoParams;
import java.util.List;
import o0O0oooo.C26371OooOOOo;
import o0O0oooo.C26395Oooo0o0;
import o0Ooo0Oo.C29407OooO0Oo;
import o0Ooo0o0.C29420OooO0Oo;
import o0o0O0o.C30294OooO0OO;
import o0oo0o.InterfaceC31284OooO0O0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o00oO0O implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f88992OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f88993OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f88994OooOoO0;

    public /* synthetic */ o00oO0O(int i, Object obj, Object obj2) {
        this.f88993OooOo0o = i;
        this.f88992OooOo = obj;
        this.f88994OooOoO0 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Exception {
        switch (this.f88993OooOo0o) {
            case 0:
                PDFView pDFView = ((C26068o0ooOO0) this.f88992OooOo).f89008OooO00o.f89013OooO00o;
                AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView.f69170OooOooO;
                pDFView.OooOoo();
                List<InterfaceC31284OooO0O0> selectRecords = ((LassoParams) this.f88994OooOoO0).getSelectedItems();
                C26395Oooo0o0 c26395Oooo0o0 = abstractC22830OooO0Oo.f69109OooO0O0;
                c26395Oooo0o0.getClass();
                kotlin.jvm.internal.OooOOO0.OooO0oO(selectRecords, "selectRecords");
                c26395Oooo0o0.f90558OooO0oO.OooO0o(selectRecords);
                return;
            case 1:
                C29420OooO0Oo c29420OooO0Oo = (C29420OooO0Oo) this.f88992OooOo;
                C26371OooOOOo c26371OooOOOo = ((C29407OooO0Oo) this.f88994OooOoO0).f104282OooO0O0;
                if (c26371OooOOOo != null) {
                    c26371OooOOOo.invoke(c29420OooO0Oo);
                    return;
                }
                return;
            default:
                View view2 = (View) this.f88992OooOo;
                ((ImageView) view2.findViewById(R.id.sort_icon)).setImageResource(R.drawable.ic_ni_filter_pressed);
                SearchListContainerFragment searchListContainerFragment = (SearchListContainerFragment) this.f88994OooOoO0;
                ((TextView) view2.findViewById(R.id.sort_text)).setTextColor(searchListContainerFragment.requireContext().getColor(R.color.blue_01));
                C30294OooO0OO c30294OooO0OO = searchListContainerFragment.f77990Oooo0;
                if (c30294OooO0OO == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("sortPopupWindow");
                    throw null;
                }
                kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
                C30294OooO0OO.OooO0O0(c30294OooO0OO, view, 0, 6);
                return;
        }
    }
}

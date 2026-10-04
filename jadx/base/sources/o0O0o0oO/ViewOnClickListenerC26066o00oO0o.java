package o0O0o0oO;

import android.view.View;
import com.orion.editor.AbstractC22830OooO0Oo;
import com.orion.editor.PDFView;
import com.orion.notein.p607ui.noteeditor.pagepadding.PagePaddingFragment;
import com.orion.penkit.models.LassoParams;
import java.util.List;
import o00Ooo.C25080OooOO0o;
import o0O0oooo.C26395Oooo0o0;
import o0Ooo0Oo.C29404OooO00o;
import o0Ooo0Oo.C29406OooO0OO;
import o0Ooo0o.C29415OooO0o;
import o0oo0o.InterfaceC31284OooO0O0;

/* JADX INFO: renamed from: o0O0o0oO.o00oO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ViewOnClickListenerC26066o00oO0o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f88995OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f88996OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f88997OooOoO0;

    public /* synthetic */ ViewOnClickListenerC26066o00oO0o(int i, Object obj, Object obj2) {
        this.f88996OooOo0o = i;
        this.f88995OooOo = obj;
        this.f88997OooOoO0 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f88996OooOo0o) {
            case 0:
                PDFView pDFView = ((C26068o0ooOO0) this.f88995OooOo).f89008OooO00o.f89013OooO00o;
                AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView.f69170OooOooO;
                pDFView.OooOoo();
                List<InterfaceC31284OooO0O0> selectRecords = ((LassoParams) this.f88997OooOoO0).getSelectedItems();
                C26395Oooo0o0 c26395Oooo0o0 = abstractC22830OooO0Oo.f69109OooO0O0;
                c26395Oooo0o0.getClass();
                kotlin.jvm.internal.OooOOO0.OooO0oO(selectRecords, "selectRecords");
                c26395Oooo0o0.f90558OooO0oO.OooO00o(selectRecords);
                return;
            default:
                C25080OooOO0o c25080OooOO0o = ((C29404OooO00o) this.f88995OooOo).f104273OooO0O0;
                if (c25080OooOO0o != null) {
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
                    C29406OooO0OO c29406OooO0OO = (C29406OooO0OO) this.f88997OooOoO0;
                    PagePaddingFragment pagePaddingFragment = (PagePaddingFragment) c25080OooOO0o.f85125OooO00o;
                    boolean z = c29406OooO0OO.f104280OooO0O0;
                    int i = c29406OooO0OO.f104279OooO00o;
                    if (!z) {
                        pagePaddingFragment.OooOooO().OooOOOO(i);
                        return;
                    }
                    List list = (List) pagePaddingFragment.OooOooO().f104380OooOo0o.f121747OooOo0o.getValue();
                    C29415OooO0o c29415OooO0o = pagePaddingFragment.f74941Ooooo0o;
                    if (c29415OooO0o != null) {
                        c29415OooO0o.OooO0o(view, i, false, list.size() > 1);
                        return;
                    } else {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("pagePaddingColorPicker");
                        throw null;
                    }
                }
                return;
        }
    }
}

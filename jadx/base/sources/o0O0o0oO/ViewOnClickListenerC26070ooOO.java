package o0O0o0oO;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.orion.editor.AbstractC22830OooO0Oo;
import com.orion.editor.PDFView;
import com.orion.notein.p607ui.noteeditor.propertypanel.outline.EditorOutlineFragment;
import com.orion.notein.p607ui.p609vo.SortKeyVO;
import com.orion.penkit.models.LassoParams;
import java.util.List;
import o0O0oooo.C26395Oooo0o0;
import o0o0O0o.C30294OooO0OO;

/* JADX INFO: renamed from: o0O0o0oO.ooOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ViewOnClickListenerC26070ooOO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f89019OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f89020OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f89021OooOoO0;

    public /* synthetic */ ViewOnClickListenerC26070ooOO(int i, Object obj, Object obj2) {
        this.f89020OooOo0o = i;
        this.f89019OooOo = obj;
        this.f89021OooOoO0 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f89020OooOo0o) {
            case 0:
                PDFView pDFView = ((C26068o0ooOO0) this.f89019OooOo).f89008OooO00o.f89013OooO00o;
                AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView.f69170OooOooO;
                pDFView.OooOoo();
                C26395Oooo0o0 c26395Oooo0o0 = abstractC22830OooO0Oo.f69109OooO0O0;
                c26395Oooo0o0.getClass();
                LassoParams params = (LassoParams) this.f89021OooOoO0;
                kotlin.jvm.internal.OooOOO0.OooO0oO(params, "params");
                c26395Oooo0o0.f90558OooO0oO.OooOO0(params);
                break;
            default:
                EditorOutlineFragment editorOutlineFragment = (EditorOutlineFragment) this.f89019OooOo;
                if (editorOutlineFragment.f75805Oooo0o0 == null) {
                    Context context = ((ImageView) this.f89021OooOoO0).getContext();
                    kotlin.jvm.internal.OooOOO0.OooO0o(context, "getContext(...)");
                    editorOutlineFragment.f75805Oooo0o0 = new C30294OooO0OO(context, new ViewOnClickListenerC26058OooooOO(editorOutlineFragment, 2));
                    List<SortKeyVO> list = (List) editorOutlineFragment.OooOooO().f105299OooOOOO.f121747OooOo0o.getValue();
                    C30294OooO0OO c30294OooO0OO = editorOutlineFragment.f75805Oooo0o0;
                    if (c30294OooO0OO != null) {
                        c30294OooO0OO.OooO0OO(list);
                    }
                }
                C30294OooO0OO c30294OooO0OO2 = editorOutlineFragment.f75805Oooo0o0;
                if (c30294OooO0OO2 != null) {
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
                    C30294OooO0OO.OooO0O0(c30294OooO0OO2, view, -Oooo0.o000000O.OooO0o(15), 4);
                }
                break;
        }
    }
}

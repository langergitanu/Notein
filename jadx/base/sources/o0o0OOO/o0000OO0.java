package o0o0OOO;

import android.view.View;
import com.orion.notein.p607ui.p609vo.PageColorThemeVO;
import com.orion.notein.p607ui.paperconfig.StandardTemplateFragment;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o0000OO0 implements View.OnLongClickListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ StandardTemplateFragment f109108OooO00o;

    public /* synthetic */ o0000OO0(StandardTemplateFragment standardTemplateFragment) {
        this.f109108OooO00o = standardTemplateFragment;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        Object tag = view.getTag();
        kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.PageColorThemeVO");
        PageColorThemeVO pageColorThemeVO = (PageColorThemeVO) tag;
        StandardTemplateFragment standardTemplateFragment = this.f109108OooO00o;
        if (!pageColorThemeVO.isAdd() && !pageColorThemeVO.isEditAble()) {
            C30520o000000o c30520o000000oOooOooo = standardTemplateFragment.OooOooo();
            int color = pageColorThemeVO.getColor();
            c30520o000000oOooOooo.getClass();
            if (!C30520o000000o.f108997ooOO.values().contains(Integer.valueOf(color))) {
                C30520o000000o c30520o000000oOooOooo2 = standardTemplateFragment.OooOooo();
                Boolean bool = Boolean.TRUE;
                C33781o00o0O c33781o00o0O = c30520o000000oOooOooo2.f109018OooOo0o;
                c33781o00o0O.getClass();
                c33781o00o0O.OooOO0(null, bool);
            }
        }
        return true;
    }
}

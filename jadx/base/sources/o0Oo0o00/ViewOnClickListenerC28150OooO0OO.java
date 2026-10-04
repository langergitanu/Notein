package o0Oo0o00;

import Oooo0oO.C21030OooOO0o;
import android.view.View;
import com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.StatusDisplayView;
import com.orion.notein.p607ui.p609vo.PenColorVO;
import com.orion.notein.p607ui.stickers.edit.StickerCollectionEditFragment;
import o0o00o0.C29936OooO0oO;
import o0o00oO0.C30022OoooOOo;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0Oo0o00.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28150OooO0OO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f99768OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f99769OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28150OooO0OO(Object obj, int i) {
        this.f99769OooOo0o = i;
        this.f99768OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f99769OooOo0o) {
            case 0:
                ((InterfaceC32507OooOO0o) this.f99768OooOo).invoke(Boolean.TRUE);
                break;
            case 1:
                StatusDisplayView.OooO00o oooO00o = ((StatusDisplayView) this.f99768OooOo).f75702OooOo0o;
                if (oooO00o != null) {
                    oooO00o.OooO00o();
                }
                break;
            case 2:
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.PenColorVO");
                PenColorVO penColorVO = (PenColorVO) tag;
                C30022OoooOOo c30022OoooOOo = (C30022OoooOOo) this.f99768OooOo;
                C29936OooO0oO c29936OooO0oO = c30022OoooOOo.f106713OooOooO;
                if (c29936OooO0oO != null) {
                    c29936OooO0oO.OooO0Oo(penColorVO, view, c30022OoooOOo.f106706OooOo);
                }
                break;
            default:
                C21030OooOO0o.OooO0OO((StickerCollectionEditFragment) this.f99768OooOo).OooOOo0();
                break;
        }
    }
}

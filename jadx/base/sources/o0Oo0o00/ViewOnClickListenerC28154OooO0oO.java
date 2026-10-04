package o0Oo0o00;

import android.view.View;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.p607ui.datasync.CloudSyncDetailsFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.EditorPropertyFragment;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import com.orion.notein.p607ui.noteeditor.toolbox.VectorVO;
import com.orion.notein.p607ui.p609vo.PageColorThemeVO;
import com.orion.notein.p607ui.paperconfig.MyTemplateFragment;
import com.orion.notein.p607ui.stickers.edit.StickerCollectionEditFragment;
import o0OoooO.C29617OooO0Oo;
import o0o00o0.C29936OooO0oO;
import o0o00oO0.C30025OoooOoo;
import oO0o0OO.C33609OooO0oo;
import oO0o0Oo.C33781o00o0O;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0Oo0o00.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28154OooO0oO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f99776OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f99777OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28154OooO0oO(Object obj, int i) {
        this.f99777OooOo0o = i;
        this.f99776OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f99777OooOo0o) {
            case 0:
                CloudSyncDetailsFragment cloudSyncDetailsFragment = (CloudSyncDetailsFragment) this.f99776OooOo;
                InterfaceC21987OooOoo viewLifecycleOwner = cloudSyncDetailsFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C28174OooOoo(cloudSyncDetailsFragment, null), 3);
                break;
            case 1:
                ((EditorPropertyFragment) this.f99776OooOo).OooOoO().Oooo0o(1);
                break;
            case 2:
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.toolbox.VectorVO");
                VectorVO vectorVO = (VectorVO) tag;
                int type = vectorVO.getType();
                C30025OoooOoo c30025OoooOoo = (C30025OoooOoo) this.f99776OooOo;
                c30025OoooOoo.OooO0Oo(type);
                C29936OooO0oO c29936OooO0oO = c30025OoooOoo.f106730Oooo00O;
                if (c29936OooO0oO != null) {
                    String type2 = String.valueOf(vectorVO.getType());
                    kotlin.jvm.internal.OooOOO0.OooO0oO(type2, "type");
                    PenBox.InterfaceC23609OooOO0o interfaceC23609OooOO0o = c29936OooO0oO.f106289OooO0oo;
                    if (interfaceC23609OooOO0o != null) {
                        interfaceC23609OooOO0o.OooO0O0(type2);
                    }
                }
                break;
            case 3:
                MyTemplateFragment myTemplateFragment = (MyTemplateFragment) this.f99776OooOo;
                if (myTemplateFragment.f78636OoooOOO == MyTemplateFragment.OooO00o.f78644OooOoO0) {
                    Object tag2 = view.getTag();
                    PageColorThemeVO pageColorThemeVO = tag2 instanceof PageColorThemeVO ? (PageColorThemeVO) tag2 : null;
                    if (pageColorThemeVO != null && !pageColorThemeVO.isAdd()) {
                        String strOooo00O = MyTemplateFragment.Oooo00O(pageColorThemeVO.getColor());
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("MyTemplateFragment");
                        c20358OooO00o.OooO00o("variant color click (books): color=" + strOooo00O + ", orientation=" + myTemplateFragment.OooOooo().f109035Oooo0oO.getValue() + ", selectorId=" + myTemplateFragment.OooOooo().f109034Oooo0o0.getValue(), new Object[0]);
                        C33781o00o0O c33781o00o0O = myTemplateFragment.OooOooo().f109036Oooo0oo;
                        c33781o00o0O.getClass();
                        c33781o00o0O.OooOO0(null, strOooo00O);
                    }
                }
                break;
            default:
                StickerCollectionEditFragment stickerCollectionEditFragment = (StickerCollectionEditFragment) this.f99776OooOo;
                stickerCollectionEditFragment.f79504Oooo00O.OooOoO(new C29617OooO0Oo(stickerCollectionEditFragment, 1));
                break;
        }
    }
}

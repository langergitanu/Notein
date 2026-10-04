package o0OoO0oO;

import android.view.View;
import android.widget.EditText;
import androidx.core.os.BundleKt;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.OooOo;
import com.orion.notein.p607ui.notelist.folder.FolderCreationDialogFragment;
import com.orion.notein.p607ui.p609vo.PageColorThemeVO;
import com.orion.notein.p607ui.paperconfig.MyTemplateFragment;
import kotlin.jvm.internal.C24034Oooo00O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0Oo.C33781o00o0O;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoO0oO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28677OooO0o0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f101620OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101621OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28677OooO0o0(Object obj, int i) {
        this.f101621OooOo0o = i;
        this.f101620OooOo = obj;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [T, java.lang.String] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f101620OooOo;
        switch (this.f101621OooOo0o) {
            case 0:
                View.OnClickListener onClickListener = ((C28675OooO0Oo) obj).f101612OooO0O0;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            case 1:
                C24034Oooo00O c24034Oooo00O = new C24034Oooo00O();
                FolderCreationDialogFragment folderCreationDialogFragment = (FolderCreationDialogFragment) obj;
                EditText editText = folderCreationDialogFragment.f77601Oooo0OO;
                if (editText == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("inputName");
                    throw null;
                }
                c24034Oooo00O.f80942OooOo0o = editText.getText().toString();
                InterfaceC21987OooOoo viewLifecycleOwner = folderCreationDialogFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                OooOo oooOoOooO00o = C21989OooOooO.OooO00o(viewLifecycleOwner);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(oooOoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new FolderCreationDialogFragment.OooO0O0(c24034Oooo00O, folderCreationDialogFragment, null), 2);
                folderCreationDialogFragment.requireActivity().getSupportFragmentManager().OooooOo(BundleKt.bundleOf(), "create_folder");
                return;
            default:
                MyTemplateFragment myTemplateFragment = (MyTemplateFragment) obj;
                if (myTemplateFragment.f78636OoooOOO == MyTemplateFragment.OooO00o.f78641OooOo) {
                    Object tag = view.getTag();
                    PageColorThemeVO pageColorThemeVO = tag instanceof PageColorThemeVO ? (PageColorThemeVO) tag : null;
                    if (pageColorThemeVO == null || pageColorThemeVO.isAdd()) {
                        return;
                    }
                    String strOooo00O = MyTemplateFragment.Oooo00O(pageColorThemeVO.getColor());
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("MyTemplateFragment");
                    c20358OooO00o.OooO00o("variant color click: color=" + strOooo00O + ", orientation=" + myTemplateFragment.OooOooo().f109035Oooo0oO.getValue() + ", selectorId=" + myTemplateFragment.OooOooo().f109034Oooo0o0.getValue(), new Object[0]);
                    C33781o00o0O c33781o00o0O = myTemplateFragment.OooOooo().f109036Oooo0oo;
                    c33781o00o0O.getClass();
                    c33781o00o0O.OooOO0(null, strOooo00O);
                    return;
                }
                return;
        }
    }
}

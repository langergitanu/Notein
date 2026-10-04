package o0OoOO00;

import android.content.Intent;
import android.view.View;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.aspose.slides.C22200OooO0o0;
import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.p607ui.notelist.folder.FolderCreationDialogFragment;
import com.orion.notein.p607ui.settings.debug.DebugFragment;
import o0000oOO.AbstractC24338OooO0o0;
import o0O0oooO.ViewOnClickListenerC26295OoooO00;
import o0OoooOo.C29635OooO00o;
import o0o00oOo.C30030OooO0O0;
import o0oOoOo.C31040OooOO0o;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: renamed from: o0OoOO00.OoooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC29033OoooOOo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f102852OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f102853OooOo0o;

    public /* synthetic */ ViewOnClickListenerC29033OoooOOo(Object obj, int i) {
        this.f102853OooOo0o = i;
        this.f102852OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f102852OooOo;
        switch (this.f102853OooOo0o) {
            case 0:
                com.google.android.material.search.OooOO0O oooOO0O = ((C29032OoooOOO) obj).f102847OooO0O0;
                if (oooOO0O != null) {
                    oooOO0O.onClick(view);
                    return;
                }
                return;
            case 1:
                ViewOnClickListenerC26295OoooO00 viewOnClickListenerC26295OoooO00 = ((C29635OooO00o) obj).f105080OooO0O0;
                if (viewOnClickListenerC26295OoooO00 != null) {
                    viewOnClickListenerC26295OoooO00.onClick(view);
                    return;
                }
                return;
            case 2:
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.FolderColorVO");
                C31040OooOO0o c31040OooOO0o = (C31040OooOO0o) tag;
                C30030OooO0O0 c30030OooO0O0 = (C30030OooO0O0) obj;
                InterfaceC32508OooOOOo<String, Integer, C32460OooOooO> interfaceC32508OooOOOo = c30030OooO0O0.f106747OooO0O0;
                String str = c30030OooO0O0.f106750OooO0o;
                if (str != null) {
                    interfaceC32508OooOOOo.invoke(str, Integer.valueOf(c31040OooOO0o.f110821OooO00o));
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO(Folder.PROPERTY_FOLDER_ID);
                    throw null;
                }
            case 3:
                FolderCreationDialogFragment folderCreationDialogFragment = (FolderCreationDialogFragment) obj;
                InterfaceC21987OooOoo viewLifecycleOwner = folderCreationDialogFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new FolderCreationDialogFragment.OooO0OO(view, folderCreationDialogFragment, null), 3);
                return;
            default:
                AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = DebugFragment.f79020Oooo0OO;
                Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
                intent.addCategory("android.intent.category.OPENABLE");
                intent.setType("application/zip");
                intent.putExtra("android.intent.extra.TITLE", C22200OooO0o0.OooO0O0(System.currentTimeMillis(), "log-", ".zip"));
                ((DebugFragment) obj).f79030Oooo0O0.OooO00o(intent);
                return;
        }
    }
}

package o0o00oO0;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.core.os.BundleKt;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import com.orion.notein.p607ui.settings.page.BasePageOptionFragment;
import com.orion.penkit.tools.DrawToolFactory;
import o0o00o0.C29936OooO0oO;
import oO00ooO.C32443OooOOO;
import oO0o0OO.C33609OooO0oo;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: renamed from: o0o00oO0.Oooo0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC30013Oooo0o0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f106670OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f106671OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f106672OooOoO0;

    public /* synthetic */ ViewOnClickListenerC30013Oooo0o0(int i, Object obj, Object obj2) {
        this.f106671OooOo0o = i;
        this.f106670OooOo = obj;
        this.f106672OooOoO0 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f106671OooOo0o) {
            case 0:
                C30012Oooo0o c30012Oooo0o = (C30012Oooo0o) this.f106670OooOo;
                c30012Oooo0o.getClass();
                String str = (String) C34444Oooo0O0.OooO0oo(new C32443OooOOO(Integer.valueOf(R.id.lasso_type_free), DrawToolFactory.LASSO_TYPE_FREE), new C32443OooOOO(Integer.valueOf(R.id.lasso_type_rect), DrawToolFactory.LASSO_TYPE_RECT), new C32443OooOOO(Integer.valueOf(R.id.lasso_type_capture), DrawToolFactory.LASSO_TYPE_CAPTURE)).get(Integer.valueOf(((ImageView) this.f106672OooOoO0).getId()));
                if (str != null) {
                    c30012Oooo0o.OooO0Oo(str);
                    C29936OooO0oO c29936OooO0oO = c30012Oooo0o.f106668Oooo0OO;
                    if (c29936OooO0oO != null) {
                        Bundle extras = BundleKt.bundleOf(new C32443OooOOO(C18437z2.f56754h, str));
                        kotlin.jvm.internal.OooOOO0.OooO0oO(extras, "extras");
                        PenBox.InterfaceC23606OooO0o0 interfaceC23606OooO0o0 = c29936OooO0oO.f106288OooO0oO;
                        if (interfaceC23606OooO0o0 != null) {
                            interfaceC23606OooO0o0.OooO00o(extras);
                        }
                    }
                    break;
                }
                break;
            default:
                BasePageOptionFragment basePageOptionFragment = (BasePageOptionFragment) this.f106670OooOo;
                T t = basePageOptionFragment.f79185OooOoO0;
                BasePageOptionFragment.OooO0O0 oooO0O0 = (BasePageOptionFragment.OooO0O0) this.f106672OooOoO0;
                if (!kotlin.jvm.internal.OooOOO0.OooO0O0(t, oooO0O0.f79192OooO0Oo)) {
                    InterfaceC21987OooOoo viewLifecycleOwner = basePageOptionFragment.getViewLifecycleOwner();
                    kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new com.orion.notein.p607ui.settings.page.OooO00o(basePageOptionFragment, oooO0O0, null), 3);
                    break;
                }
                break;
        }
    }
}

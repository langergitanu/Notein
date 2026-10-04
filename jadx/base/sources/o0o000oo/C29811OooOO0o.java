package o0o000oo;

import android.net.Uri;
import android.provider.Settings;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import com.orion.notein.p607ui.paperconfig.MyTemplateFragment;
import com.orion.notein.ui.paperconfig.MyTemplateFragment.OooO0O0;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: renamed from: o0o000oo.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C29811OooOO0o implements OooO0o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f105782OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f105783OooOo0o;

    public /* synthetic */ C29811OooOO0o(Fragment fragment, int i) {
        this.f105783OooOo0o = i;
        this.f105782OooOo = fragment;
    }

    @Override // OooO0o.OooO00o
    public final void OooO0O0(Object obj) {
        MyTemplateFragment myTemplateFragment;
        Uri uri;
        switch (this.f105783OooOo0o) {
            case 0:
                ActivityResult result = (ActivityResult) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(result, "result");
                BaseToolbarChildFragment baseToolbarChildFragment = (BaseToolbarChildFragment) this.f105782OooOo;
                if (Settings.canDrawOverlays(baseToolbarChildFragment.getContext())) {
                    baseToolbarChildFragment.Oooooo0();
                }
                break;
            default:
                Boolean success = (Boolean) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(success, "success");
                if (success.booleanValue() && (uri = (myTemplateFragment = (MyTemplateFragment) this.f105782OooOo).f78637OoooOOo) != null) {
                    InterfaceC21987OooOoo viewLifecycleOwner = myTemplateFragment.getViewLifecycleOwner();
                    kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, myTemplateFragment.new OooO0O0(uri, null), 3);
                }
                break;
        }
    }
}

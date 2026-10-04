package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import androidx.appcompat.app.AbstractC21486OooOO0o;
import androidx.core.app.AppLocalesStorageHelper;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.microsoft.identity.common.java.providers.oauth2.IDToken;
import com.orion.notein.p607ui.settings.debug.DebugFragment;
import com.orion.notein.p607ui.settings.debug.DebugFragment.C23806OooO0o0;
import o0000oOO.AbstractC24338OooO0o0;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOO0 implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f62440OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f62441OooOo0o;

    public /* synthetic */ OooOO0(Object obj, int i) {
        this.f62441OooOo0o = i;
        this.f62440OooOo = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f62440OooOo;
        switch (this.f62441OooOo0o) {
            case 0:
                if (Build.VERSION.SDK_INT >= 33) {
                    Context context = (Context) obj;
                    ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (AbstractC21486OooOO0o.OooO0o().isEmpty()) {
                            String locales = AppLocalesStorageHelper.readLocales(context);
                            Object systemService = context.getSystemService(IDToken.LOCALE);
                            if (systemService != null) {
                                AbstractC21486OooOO0o.OooO0O0.OooO0O0(systemService, AbstractC21486OooOO0o.OooO00o.OooO00o(locales));
                            }
                        }
                        context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
                AbstractC21486OooOO0o.f62450OooOoo0 = true;
                break;
            default:
                AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = DebugFragment.f79020Oooo0OO;
                DebugFragment debugFragment = (DebugFragment) obj;
                InterfaceC21987OooOoo viewLifecycleOwner = debugFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, debugFragment.new C23806OooO0o0(null), 3);
                break;
        }
    }
}

package o0ooOO0;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import o0OOO0o.C27048OooO0OO;

/* JADX INFO: renamed from: o0ooOO0.OoooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C31538OoooO0 implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27048OooO0OO f112735OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Configuration f112736OooOo0o;

    public ComponentCallbacks2C31538OoooO0(Configuration configuration, C27048OooO0OO c27048OooO0OO) {
        this.f112736OooOo0o = configuration;
        this.f112735OooOo = c27048OooO0OO;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(configuration, "configuration");
        Configuration configuration2 = this.f112736OooOo0o;
        int iUpdateFrom = configuration2.updateFrom(configuration);
        Iterator<Map.Entry<C27048OooO0OO.OooO0O0, WeakReference<C27048OooO0OO.OooO00o>>> it = this.f112735OooOo.f94176OooO00o.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<C27048OooO0OO.OooO0O0, WeakReference<C27048OooO0OO.OooO00o>> next = it.next();
            kotlin.jvm.internal.OooOOO0.OooO0o(next, "it.next()");
            C27048OooO0OO.OooO00o oooO00o = next.getValue().get();
            if (oooO00o == null || Configuration.needNewResources(iUpdateFrom, oooO00o.f94178OooO0O0)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f112735OooOo.f94176OooO00o.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        this.f112735OooOo.f94176OooO00o.clear();
    }
}

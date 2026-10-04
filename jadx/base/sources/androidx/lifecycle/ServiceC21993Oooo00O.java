package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.lifecycle.AbstractC21979OooOOo0;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.lifecycle.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m80612d2 = {"Landroidx/lifecycle/Oooo00O;", "Landroid/app/Service;", "Landroidx/lifecycle/OooOoo;", "<init>", "()V", "lifecycle-service_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public class ServiceC21993Oooo00O extends Service implements InterfaceC21987OooOoo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C22016Oooooo f65590OooOo0o = new C22016Oooooo(this);

    @Override // androidx.lifecycle.InterfaceC21987OooOoo
    public final AbstractC21979OooOOo0 getLifecycle() {
        return this.f65590OooOo0o.f65668OooO00o;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(intent, "intent");
        this.f65590OooOo0o.OooO00o(AbstractC21979OooOOo0.OooO00o.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f65590OooOo0o.OooO00o(AbstractC21979OooOOo0.OooO00o.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        AbstractC21979OooOOo0.OooO00o oooO00o = AbstractC21979OooOOo0.OooO00o.ON_STOP;
        C22016Oooooo c22016Oooooo = this.f65590OooOo0o;
        c22016Oooooo.OooO00o(oooO00o);
        c22016Oooooo.OooO00o(AbstractC21979OooOOo0.OooO00o.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        this.f65590OooOo0o.OooO00o(AbstractC21979OooOOo0.OooO00o.ON_START);
        super.onStart(intent, i);
    }
}

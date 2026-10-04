package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C21984OooOoO;
import java.util.List;
import kotlin.Metadata;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m80612d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Lo00O0000/OooO0O0;", "Landroidx/lifecycle/OooOoo;", "<init>", "()V", "lifecycle-process_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class ProcessLifecycleInitializer implements o00O0000.OooO0O0<InterfaceC21987OooOoo> {
    @Override // o00O0000.OooO0O0
    public final InterfaceC21987OooOoo OooO00o(Context context) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
        o00O0000.OooO00o oooO00oOooO0OO = o00O0000.OooO00o.OooO0OO(context);
        kotlin.jvm.internal.OooOOO0.OooO0o(oooO00oOooO0OO, "getInstance(context)");
        if (!oooO00oOooO0OO.f84074OooO0O0.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!C21984OooOoO.f65557OooO00o.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.OooOOO0.OooO0o0(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C21984OooOoO.OooO00o());
        }
        C22003OoooO00 c22003OoooO00 = C22003OoooO00.f65631OooOooo;
        c22003OoooO00.getClass();
        c22003OoooO00.f65636OooOoOO = new Handler();
        c22003OoooO00.f65638OooOoo0.OooO0o(AbstractC21979OooOOo0.OooO00o.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        kotlin.jvm.internal.OooOOO0.OooO0o0(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new C22002OoooO0(c22003OoooO00));
        return c22003OoooO00;
    }

    @Override // o00O0000.OooO0O0
    public final List<Class<? extends o00O0000.OooO0O0<?>>> dependencies() {
        return C34434OooOoO.f123453OooOo0o;
    }
}

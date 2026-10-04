package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.google.firebase.messaging.OooOO0;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements o00O0000.OooO0O0<OooO00o> {

    public static class OooO00o {
    }

    @Override // o00O0000.OooO0O0
    public final OooO00o OooO00o(Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: o000oOoo.OooO0Oo
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                this.f83476OooOo0o.getClass();
                (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new OooOO0(applicationContext, 1), new Random().nextInt(Math.max(1000, 1)) + 5000);
            }
        });
        return new OooO00o();
    }

    @Override // o00O0000.OooO0O0
    public final List<Class<? extends o00O0000.OooO0O0<?>>> dependencies() {
        return Collections.EMPTY_LIST;
    }
}

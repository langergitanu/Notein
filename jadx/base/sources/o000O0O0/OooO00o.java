package o000O0O0;

import OooO0Oo.OooOO0O;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.lifecycle.C22015OooooOo;
import kotlin.jvm.internal.OooOOO0;
import oO0OoOO0.C33283OooO0O0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {
    public static final C33283OooO0O0 OooO00o(ActivityC21897OooOo0 activityC21897OooOo0, C22015OooooOo delegateFactory) {
        OooOOO0.OooO0oO(delegateFactory, "delegateFactory");
        Context context = activityC21897OooOo0;
        while (context instanceof ContextWrapper) {
            if (context instanceof OooOO0O) {
                return C33283OooO0O0.OooO0OO((OooOO0O) context, delegateFactory);
            }
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            OooOOO0.OooO0o(baseContext, "ctx.baseContext");
            context = baseContext;
        }
        throw new IllegalStateException("Expected an activity context for creating a HiltViewModelFactory but instead found: " + context);
    }
}

package androidx.work;

import Oooo0oo.AbstractC21138OooO0oo;
import android.content.Context;
import androidx.work.OooO00o;
import java.util.Collections;
import java.util.List;
import o00O0O0o.OooOO0O;

/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements o00O0000.OooO0O0<AbstractC21138OooO0oo> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String f66689OooO00o = OooOO0O.OooO0o0("WrkMgrInitializer");

    @Override // o00O0000.OooO0O0
    public final AbstractC21138OooO0oo OooO00o(Context context) {
        OooOO0O.OooO0OO().OooO00o(f66689OooO00o, "Initializing WorkManager with default configuration.", new Throwable[0]);
        o00O0OO0.OooOO0O.Ooooooo(context, new OooO00o(new OooO00o.C19047OooO00o()));
        return o00O0OO0.OooOO0O.OoooooO(context);
    }

    @Override // o00O0000.OooO0O0
    public final List<Class<? extends o00O0000.OooO0O0<?>>> dependencies() {
        return Collections.EMPTY_LIST;
    }
}

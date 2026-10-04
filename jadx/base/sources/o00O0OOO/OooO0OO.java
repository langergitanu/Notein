package o00O0OOO;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import o00O0O0o.OooOO0O;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final String f84393OooO0O0 = OooOO0O.OooO0o0("SystemJobInfoConverter");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ComponentName f84394OooO00o;

    public OooO0OO(Context context) {
        this.f84394OooO00o = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}

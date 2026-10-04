package o00O0OO;

import Oooo0oO.C21023OooO0Oo;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o00O0O0o.OooOO0O;
import o00O0OO.C24844OooO0o0;
import o00O0OOo.C24855OooO0Oo;
import o00O0OOo.InterfaceC24854OooO0OO;
import o00O0OoO.C24880OooOOoo;
import o00O0OoO.C24890OooOooo;
import o00O0Ooo.C24911OooOOoo;
import o00O0Ooo.C24912OooOo;

/* JADX INFO: renamed from: o00O0OO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24843OooO0Oo implements InterfaceC24854OooO0OO, o00O0OO0.OooO0O0, C24912OooOo.OooO0O0 {

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final String f84299Oooo000 = OooOO0O.OooO0o0("DelayMetCommandHandler");

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f84300OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Context f84301OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C24844OooO0o0 f84302OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final String f84303OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C24855OooO0Oo f84304OooOoOO;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public PowerManager.WakeLock f84307OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public boolean f84308OooOooo = false;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f84305OooOoo = 0;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final Object f84306OooOoo0 = new Object();

    public C24843OooO0Oo(Context context, int i, String str, C24844OooO0o0 c24844OooO0o0) {
        this.f84301OooOo0o = context;
        this.f84300OooOo = i;
        this.f84302OooOoO = c24844OooO0o0;
        this.f84303OooOoO0 = str;
        this.f84304OooOoOO = new C24855OooO0Oo(context, c24844OooO0o0.f84310OooOo, this);
    }

    @Override // o00O0Ooo.C24912OooOo.OooO0O0
    public final void OooO00o(String str) {
        OooOO0O.OooO0OO().OooO00o(f84299Oooo000, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Exceeded time limits on execution for ", str), new Throwable[0]);
        OooO0oO();
    }

    @Override // o00O0OO0.OooO0O0
    public final void OooO0O0(String str, boolean z) {
        OooOO0O.OooO0OO().OooO00o(f84299Oooo000, "onExecuted " + str + ", " + z, new Throwable[0]);
        OooO0OO();
        int i = this.f84300OooOo;
        C24844OooO0o0 c24844OooO0o0 = this.f84302OooOoO;
        Context context = this.f84301OooOo0o;
        if (z) {
            c24844OooO0o0.OooO0o0(new C24844OooO0o0.OooO0O0(i, OooO0O0.OooO0OO(context, this.f84303OooOoO0), c24844OooO0o0));
        }
        if (this.f84308OooOooo) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_CONSTRAINTS_CHANGED");
            c24844OooO0o0.OooO0o0(new C24844OooO0o0.OooO0O0(i, intent, c24844OooO0o0));
        }
    }

    public final void OooO0OO() {
        synchronized (this.f84306OooOoo0) {
            try {
                this.f84304OooOoOO.OooO0OO();
                this.f84302OooOoO.f84313OooOoO0.OooO0O0(this.f84303OooOoO0);
                PowerManager.WakeLock wakeLock = this.f84307OooOooO;
                if (wakeLock != null && wakeLock.isHeld()) {
                    OooOO0O.OooO0OO().OooO00o(f84299Oooo000, "Releasing wakelock " + this.f84307OooOooO + " for WorkSpec " + this.f84303OooOoO0, new Throwable[0]);
                    this.f84307OooOooO.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o00O0OOo.InterfaceC24854OooO0OO
    public final void OooO0Oo(ArrayList arrayList) {
        OooO0oO();
    }

    @Override // o00O0OOo.InterfaceC24854OooO0OO
    public final void OooO0o(List<String> list) {
        if (list.contains(this.f84303OooOoO0)) {
            synchronized (this.f84306OooOoo0) {
                try {
                    if (this.f84305OooOoo == 0) {
                        this.f84305OooOoo = 1;
                        OooOO0O.OooO0OO().OooO00o(f84299Oooo000, "onAllConstraintsMet for " + this.f84303OooOoO0, new Throwable[0]);
                        if (this.f84302OooOoO.f84312OooOoO.OooO0oO(this.f84303OooOoO0, null)) {
                            this.f84302OooOoO.f84313OooOoO0.OooO00o(this.f84303OooOoO0, this);
                        } else {
                            OooO0OO();
                        }
                    } else {
                        OooOO0O.OooO0OO().OooO00o(f84299Oooo000, "Already started work for " + this.f84303OooOoO0, new Throwable[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void OooO0o0() {
        StringBuilder sb = new StringBuilder();
        String str = this.f84303OooOoO0;
        sb.append(str);
        sb.append(" (");
        this.f84307OooOooO = C24911OooOOoo.OooO00o(this.f84301OooOo0o, C21023OooO0Oo.OooO0OO(")", this.f84300OooOo, sb));
        OooOO0O oooOO0OOooO0OO = OooOO0O.OooO0OO();
        PowerManager.WakeLock wakeLock = this.f84307OooOooO;
        String str2 = f84299Oooo000;
        oooOO0OOooO0OO.OooO00o(str2, "Acquiring wakelock " + wakeLock + " for WorkSpec " + str, new Throwable[0]);
        this.f84307OooOooO.acquire();
        C24880OooOOoo c24880OooOOooOooOO0 = ((C24890OooOooo) this.f84302OooOoO.f84314OooOoOO.f84362OooO0OO.OooOoO()).OooOO0(str);
        if (c24880OooOOooOooOO0 == null) {
            OooO0oO();
            return;
        }
        boolean zOooO0O0 = c24880OooOOooOooOO0.OooO0O0();
        this.f84308OooOooo = zOooO0O0;
        if (zOooO0O0) {
            this.f84304OooOoOO.OooO0O0(Collections.singletonList(c24880OooOOooOooOO0));
        } else {
            OooOO0O.OooO0OO().OooO00o(str2, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("No constraints for ", str), new Throwable[0]);
            OooO0o(Collections.singletonList(str));
        }
    }

    public final void OooO0oO() {
        synchronized (this.f84306OooOoo0) {
            try {
                if (this.f84305OooOoo < 2) {
                    this.f84305OooOoo = 2;
                    OooOO0O oooOO0OOooO0OO = OooOO0O.OooO0OO();
                    String str = f84299Oooo000;
                    oooOO0OOooO0OO.OooO00o(str, "Stopping work for WorkSpec " + this.f84303OooOoO0, new Throwable[0]);
                    Context context = this.f84301OooOo0o;
                    String str2 = this.f84303OooOoO0;
                    Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
                    intent.setAction("ACTION_STOP_WORK");
                    intent.putExtra("KEY_WORKSPEC_ID", str2);
                    C24844OooO0o0 c24844OooO0o0 = this.f84302OooOoO;
                    c24844OooO0o0.OooO0o0(new C24844OooO0o0.OooO0O0(this.f84300OooOo, intent, c24844OooO0o0));
                    if (this.f84302OooOoO.f84312OooOoO.OooO0Oo(this.f84303OooOoO0)) {
                        OooOO0O.OooO0OO().OooO00o(str, "WorkSpec " + this.f84303OooOoO0 + " needs to be rescheduled", new Throwable[0]);
                        Intent intentOooO0OO = OooO0O0.OooO0OO(this.f84301OooOo0o, this.f84303OooOoO0);
                        C24844OooO0o0 c24844OooO0o02 = this.f84302OooOoO;
                        c24844OooO0o02.OooO0o0(new C24844OooO0o0.OooO0O0(this.f84300OooOo, intentOooO0OO, c24844OooO0o02));
                    } else {
                        OooOO0O.OooO0OO().OooO00o(str, "Processor does not have WorkSpec " + this.f84303OooOoO0 + ". No need to reschedule ", new Throwable[0]);
                    }
                } else {
                    OooOO0O.OooO0OO().OooO00o(f84299Oooo000, "Already stopped work for " + this.f84303OooOoO0, new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

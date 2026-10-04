package com.android.billingclient.api;

import Oooo.C20813OooO0o0;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.fragment.app.ActivityC21897OooOo0;
import com.android.billingclient.api.C22161OooO0oO;
import com.android.billingclient.api.OooO0O0;
import com.android.billingclient.api.OooOO0O;
import com.android.billingclient.api.OooOOO;
import com.google.android.gms.internal.play_billing.zza;
import com.google.android.gms.internal.play_billing.zzam;
import com.google.android.gms.internal.play_billing.zzbi;
import com.google.android.gms.internal.play_billing.zzbl;
import com.google.android.gms.internal.play_billing.zzbt;
import com.google.android.gms.internal.play_billing.zzby;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzcu;
import com.google.android.gms.internal.play_billing.zzcz;
import com.google.android.gms.internal.play_billing.zzdj;
import com.google.android.gms.internal.play_billing.zzdk;
import com.google.android.gms.internal.play_billing.zzhv;
import com.google.android.gms.internal.play_billing.zzhx;
import com.google.android.gms.internal.play_billing.zzhz;
import com.google.android.gms.internal.play_billing.zzib;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzil;
import com.google.android.gms.internal.play_billing.zziq;
import com.google.android.gms.internal.play_billing.zzis;
import com.google.android.gms.internal.play_billing.zzjt;
import com.google.android.gms.internal.play_billing.zzjv;
import com.huawei.hms.network.embedded.C18437z2;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.orion.notein.data.repo.transactions.OooO;
import com.orion.notein.data.service.dto.MaterialPurchaseStatusResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o00OoO.C25065OooO00o;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.android.billingclient.api.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C22159OooO0Oo extends OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public volatile zzam f66892OooO;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f66895OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f66896OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public volatile C22196OoooOoO f66897OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Context f66899OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C22190OoooO00 f66900OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public volatile ServiceConnectionC22175OooOoo f66901OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f66902OooOO0O;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f66904OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f66905OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f66906OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f66907OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f66908OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f66909OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f66910OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final OooOO0 f66911OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public boolean f66912OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public boolean f66913OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f66914OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f66915OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public ExecutorService f66916OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final boolean f66917OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final Long f66918OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final zzbl f66919OooOoo0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f66893OooO00o = new Object();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public volatile int f66894OooO0O0 = 0;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Handler f66898OooO0o0 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f66903OooOO0o = 0;

    public C22159OooO0Oo(OooOO0 oooOO02, Context context, OooOOO0 oooOOO0, OooO0O0.OooO00o oooO00o) {
        long jNextLong = new Random().nextLong();
        this.f66918OooOoOO = Long.valueOf(jNextLong);
        this.f66919OooOoo0 = com.google.android.gms.internal.play_billing.zzaz.zza();
        this.f66895OooO0OO = "8.0.0";
        String strOooOo = OooOo();
        this.f66896OooO0Oo = strOooOo;
        this.f66899OooO0oO = context.getApplicationContext();
        zziq zziqVarZzc = zzis.zzc();
        zziqVarZzc.zzs("8.0.0");
        if (strOooOo != null) {
            zziqVarZzc.zzt(strOooOo);
        }
        zziqVarZzc.zzq(this.f66899OooO0oO.getPackageName());
        zziqVarZzc.zzn(jNextLong);
        oooO00o.getClass();
        zziqVarZzc.zzr(false);
        zziqVarZzc.zza(Build.VERSION.SDK_INT);
        zziqVarZzc.zzp(772604006L);
        try {
            zziqVarZzc.zzl(this.f66899OooO0oO.getPackageManager().getPackageInfo(this.f66899OooO0oO.getPackageName(), 0).versionCode);
        } catch (Throwable th) {
            zzc.zzo("BillingClient", "Error getting app version code.", th);
        }
        this.f66900OooO0oo = new C22190OoooO00(this.f66899OooO0oO, (zzis) zziqVarZzc.zze());
        if (oooOOO0 == null) {
            zzc.zzn("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f66897OooO0o = new C22196OoooOoO(this.f66899OooO0oO, oooOOO0, this.f66900OooO0oo);
        this.f66911OooOo = oooOO02;
        this.f66917OooOoO0 = false;
        this.f66899OooO0oO.getPackageName();
    }

    public static Future OooO0oO(Callable callable, long j, final Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            final Future futureSubmit = executorService.submit(callable);
            handler.postDelayed(new Runnable() { // from class: com.android.billingclient.api.OooOo00
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = futureSubmit;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    future.cancel(true);
                    zzc.zzn("BillingClient", "Async task is taking too long, cancel it!");
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, (long) (j * 0.95d));
            return futureSubmit;
        } catch (Exception e) {
            zzc.zzo("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void OooOOo0(C22159OooO0Oo c22159OooO0Oo, int i) {
        if (i != 0) {
            c22159OooO0Oo.OooOO0o(0);
            return;
        }
        synchronized (c22159OooO0Oo.f66893OooO00o) {
            try {
                if (c22159OooO0Oo.f66894OooO0O0 == 3) {
                    return;
                }
                c22159OooO0Oo.OooOO0o(2);
                C22196OoooOoO c22196OoooOoO = c22159OooO0Oo.f66897OooO0o != null ? c22159OooO0Oo.f66897OooO0o : null;
                if (c22196OoooOoO != null) {
                    boolean z = c22159OooO0Oo.f66912OooOo0;
                    IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                    IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
                    intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
                    c22196OoooOoO.f67074OooO0o = z;
                    C22195OoooOo0 c22195OoooOo0 = c22196OoooOoO.f67075OooO0o0;
                    Context context = c22196OoooOoO.f67070OooO00o;
                    c22195OoooOo0.OooO00o(context, intentFilter2);
                    if (!c22196OoooOoO.f67074OooO0o) {
                        c22196OoooOoO.f67073OooO0Oo.OooO00o(context, intentFilter);
                        return;
                    }
                    C22195OoooOo0 c22195OoooOo02 = c22196OoooOoO.f67073OooO0Oo;
                    synchronized (c22195OoooOo02) {
                        try {
                            if (c22195OoooOo02.f67067OooO00o) {
                                return;
                            }
                            if (Build.VERSION.SDK_INT >= 33) {
                                context.registerReceiver(c22195OoooOo02, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != c22195OoooOo02.f67068OooO0O0 ? 4 : 2);
                            } else {
                                context.registerReceiver(c22195OoooOo02, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                            }
                            c22195OoooOo02.f67067OooO00o = true;
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    public static String OooOo() {
        try {
            return (String) C25065OooO00o.class.getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void OooO(zzhx zzhxVar) {
        try {
            C22190OoooO00 c22190OoooO00 = this.f66900OooO0oo;
            int i = this.f66903OooOO0o;
            c22190OoooO00.getClass();
            try {
                zziq zziqVar = (zziq) c22190OoooO00.f67059OooO0O0.zzm();
                zziqVar.zzm(i);
                c22190OoooO00.f67059OooO0O0 = (zzis) zziqVar.zze();
                c22190OoooO00.OooO00o(zzhxVar);
            } catch (Throwable th) {
                zzc.zzo("BillingLogger", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            zzc.zzo("BillingClient", "Unable to log.", th2);
        }
    }

    public void OooO00o(final C20813OooO0o0 c20813OooO0o0, final OooO00o oooO00o) {
        if (OooO0oO(new Callable() { // from class: com.android.billingclient.api.OooOOo0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzam zzamVar;
                C22159OooO0Oo c22159OooO0Oo = this.f66989OooOo0o;
                OooO00o oooO00o2 = oooO00o;
                C20813OooO0o0 c20813OooO0o02 = c20813OooO0o0;
                try {
                    if (!c22159OooO0Oo.OooOOOO()) {
                        zzie zzieVar = zzie.SERVICE_CONNECTION_NOT_READY;
                        C22162OooO0oo c22162OooO0oo = C22179Oooo.f67028OooOO0;
                        c22159OooO0Oo.OooOoO(3, c22162OooO0oo, zzieVar);
                        oooO00o2.OooO00o(c22162OooO0oo);
                        return null;
                    }
                    if (TextUtils.isEmpty((String) c20813OooO0o02.f59765OooO00o)) {
                        zzc.zzn("BillingClient", "Please provide a valid purchase token.");
                        zzie zzieVar2 = zzie.EMPTY_PURCHASE_TOKEN;
                        C22162OooO0oo c22162OooO0oo2 = C22179Oooo.f67026OooO0oO;
                        c22159OooO0Oo.OooOoO(3, c22162OooO0oo2, zzieVar2);
                        oooO00o2.OooO00o(c22162OooO0oo2);
                        return null;
                    }
                    if (!c22159OooO0Oo.f66904OooOOO) {
                        zzie zzieVar3 = zzie.API_VERSION_NOT_V9;
                        C22162OooO0oo c22162OooO0oo3 = C22179Oooo.f67020OooO00o;
                        c22159OooO0Oo.OooOoO(3, c22162OooO0oo3, zzieVar3);
                        oooO00o2.OooO00o(c22162OooO0oo3);
                        return null;
                    }
                    synchronized (c22159OooO0Oo.f66893OooO00o) {
                        zzamVar = c22159OooO0Oo.f66892OooO;
                    }
                    if (zzamVar == null) {
                        c22159OooO0Oo.OooO0oo(oooO00o2, C22179Oooo.f67028OooOO0, zzie.SERVICE_RESET_TO_NULL, null);
                        return null;
                    }
                    String packageName = c22159OooO0Oo.f66899OooO0oO.getPackageName();
                    String str = (String) c20813OooO0o02.f59765OooO00o;
                    String str2 = c22159OooO0Oo.f66895OooO0OO;
                    String str3 = c22159OooO0Oo.f66896OooO0Oo;
                    long jLongValue = c22159OooO0Oo.f66918OooOoOO.longValue();
                    int i = zzc.zza;
                    Bundle bundle = new Bundle();
                    zzc.zzc(bundle, str2, str3, jLongValue);
                    Bundle bundleZzd = zzamVar.zzd(9, packageName, str, bundle);
                    oooO00o2.OooO00o(C22179Oooo.OooO00o(zzc.zzb(bundleZzd, "BillingClient"), zzc.zzj(bundleZzd, "BillingClient")));
                    return null;
                } catch (DeadObjectException e) {
                    c22159OooO0Oo.OooO0oo(oooO00o2, C22179Oooo.f67028OooOO0, zzie.ACKNOWLEDGE_PURCHASE_SERVICE_CALL_EXCEPTION, e);
                    return null;
                } catch (Exception e2) {
                    c22159OooO0Oo.OooO0oo(oooO00o2, C22179Oooo.f67027OooO0oo, zzie.ACKNOWLEDGE_PURCHASE_SERVICE_CALL_EXCEPTION, e2);
                    return null;
                }
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.OooOOo
            @Override // java.lang.Runnable
            public final void run() {
                zzie zzieVar = zzie.EXECUTE_ASYNC_TIMEOUT;
                C22162OooO0oo c22162OooO0oo = C22179Oooo.f67029OooOO0O;
                this.f66987OooOo0o.OooOoO(3, c22162OooO0oo, zzieVar);
                oooO00o.OooO00o(c22162OooO0oo);
            }
        }, OooOOo(), OooO0o()) == null) {
            C22162OooO0oo c22162OooO0ooOooOo0 = OooOo0();
            OooOoO(3, c22162OooO0ooOooOo0, zzie.MISSING_RESULT_FROM_EXECUTE_ASYNC);
            oooO00o.OooO00o(c22162OooO0ooOooOo0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void OooO0O0() {
        try {
            int i = C22186Oooo0oO.f67057OooO00o;
            OooOO0(C22186Oooo0oO.OooO0OO(12, zzil.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            zzc.zzo("BillingClient", "Unable to log.", th);
        }
        synchronized (this.f66893OooO00o) {
            try {
            } finally {
            }
            if (this.f66897OooO0o != null) {
                C22196OoooOoO c22196OoooOoO = this.f66897OooO0o;
                C22195OoooOo0 c22195OoooOo0 = c22196OoooOoO.f67073OooO0Oo;
                Context context = c22196OoooOoO.f67070OooO00o;
                c22195OoooOo0.OooO0O0(context);
                c22196OoooOoO.f67075OooO0o0.OooO0O0(context);
                try {
                    zzc.zzm("BillingClient", "Unbinding from service.");
                    OooOOO();
                } catch (Throwable th2) {
                    zzc.zzo("BillingClient", "There was an exception while unbinding from the service while ending connection!", th2);
                }
                try {
                    synchronized (this) {
                        ExecutorService executorService = this.f66916OooOoO;
                        if (executorService != null) {
                            executorService.shutdownNow();
                            this.f66916OooOoO = null;
                        }
                    }
                } finally {
                    try {
                    } finally {
                    }
                }
            } else {
                zzc.zzm("BillingClient", "Unbinding from service.");
                OooOOO();
                synchronized (this) {
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02c2  */
    /* JADX WARN: Type inference failed for: r30v0, types: [com.android.billingclient.api.OooO0Oo] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [com.android.billingclient.api.OooOO0O$OooO00o] */
    /* JADX WARN: Type inference failed for: r3v9, types: [com.android.billingclient.api.OooOO0O$OooO00o] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v1, types: [long] */
    /* JADX WARN: Type inference failed for: r5v2, types: [long] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v2, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C22162OooO0oo OooO0OO(ActivityC21897OooOo0 activityC21897OooOo0, final C22161OooO0oO c22161OooO0oO) {
        boolean z;
        String str;
        boolean z2;
        boolean z3;
        long j;
        SkuDetails skuDetails;
        String str2;
        String str3;
        C22162OooO0oo c22162OooO0ooOooO00o;
        ?? r3;
        C22162OooO0oo c22162OooO0ooOooO00o2;
        boolean z4;
        Future futureOooO0oO;
        ?? r6;
        String str4;
        ?? r62;
        ?? r4;
        ?? r63;
        ?? r42;
        zzie zzieVarZzb;
        zzie zzieVar;
        boolean z5;
        long j2;
        String str5;
        Object obj;
        String str6;
        boolean z6;
        long j3;
        boolean z7;
        boolean z8;
        boolean z9 = true;
        long jNextLong = new Random().nextLong();
        if (this.f66897OooO0o == null || this.f66897OooO0o.f67071OooO0O0 == null) {
            zzie zzieVar2 = zzie.MISSING_LISTENER;
            C22162OooO0oo c22162OooO0oo = C22179Oooo.f67036OooOOo0;
            OooOoOO(zzieVar2, c22162OooO0oo, jNextLong);
            return c22162OooO0oo;
        }
        try {
            int i = ((C22162OooO0oo) OooOo0O(1).get(Build.VERSION.SDK_INT < 29 ? 0L : 3000L, TimeUnit.MILLISECONDS)).f66936OooO00o;
            if (i == 0) {
                zzc.zzm("BillingClient", "Reconnection succeeded with result: " + i);
            } else {
                zzc.zzn("BillingClient", "Reconnection failed with result: " + i);
            }
        } catch (Exception e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            zzc.zzo("BillingClient", "Error during reconnection attempt: ", e);
        }
        if (!OooOOOo()) {
            zzie zzieVar3 = zzie.SERVICE_CONNECTION_NOT_READY;
            C22162OooO0oo c22162OooO0oo2 = C22179Oooo.f67028OooOO0;
            OooOoOO(zzieVar3, c22162OooO0oo2, jNextLong);
            OooOooo(c22162OooO0oo2);
            return c22162OooO0oo2;
        }
        synchronized (this.f66893OooO00o) {
            try {
                z = this.f66901OooOO0 != null ? this.f66901OooOO0.f67010OooOoO > 0 : false;
            } finally {
            }
        }
        c22161OooO0oO.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(c22161OooO0oO.f66924OooO0Oo);
        zzbt zzbtVar = c22161OooO0oO.f66923OooO0OO;
        SkuDetails skuDetails2 = (SkuDetails) zzby.zza(arrayList, null);
        C22161OooO0oO.OooO0O0 oooO0O0 = (C22161OooO0oO.OooO0O0) zzby.zza(zzbtVar, null);
        if (skuDetails2 != null) {
            throw null;
        }
        OooOO0O oooOO0O = oooO0O0.f66927OooO00o;
        String str7 = oooOO0O.f66947OooO0OO;
        String str8 = oooOO0O.f66948OooO0Oo;
        if (str8.equals("subs") && !this.f66902OooOO0O) {
            zzc.zzn("BillingClient", "Current client doesn't support subscriptions.");
            zzie zzieVar4 = zzie.SUBSCRIPTIONS_NOT_SUPPORTED;
            C22162OooO0oo c22162OooO0oo3 = C22179Oooo.f67030OooOO0o;
            OooOoo(zzieVar4, c22162OooO0oo3, jNextLong, z);
            OooOooo(c22162OooO0oo3);
            return c22162OooO0oo3;
        }
        C22161OooO0oO.OooO0OO oooO0OO = c22161OooO0oO.f66922OooO0O0;
        oooO0OO.getClass();
        if (oooO0OO.f66932OooO0O0 != 0 || c22161OooO0oO.f66921OooO00o) {
            str = null;
            if (!this.f66905OooOOO0) {
                zzc.zzn("BillingClient", "Current client doesn't support extra params for buy intent.");
                zzie zzieVar5 = zzie.EXTRA_PARAMS_NOT_SUPPORTED;
                C22162OooO0oo c22162OooO0oo4 = C22179Oooo.f67024OooO0o;
                OooOoo(zzieVar5, c22162OooO0oo4, jNextLong, z);
                OooOooo(c22162OooO0oo4);
                return c22162OooO0oo4;
            }
        } else {
            zzbt zzbtVar2 = c22161OooO0oO.f66923OooO0OO;
            str = null;
            if (zzbtVar2 != null) {
                int size = zzbtVar2.size();
                for (int i2 = 0; i2 < size; i2++) {
                }
            }
        }
        if (arrayList.size() > 1 && !this.f66909OooOOo0) {
            zzc.zzn("BillingClient", "Current client doesn't support multi-item purchases.");
            zzie zzieVar6 = zzie.MULTI_ITEM_NOT_SUPPORTED;
            C22162OooO0oo c22162OooO0oo5 = C22179Oooo.f67032OooOOO0;
            OooOoo(zzieVar6, c22162OooO0oo5, jNextLong, z);
            OooOooo(c22162OooO0oo5);
            return c22162OooO0oo5;
        }
        if (!zzbtVar.isEmpty() && !this.f66908OooOOo) {
            zzc.zzn("BillingClient", "Current client doesn't support purchases with ProductDetails.");
            zzie zzieVar7 = zzie.PRODUCT_DETAILS_NOT_SUPPORTED;
            C22162OooO0oo c22162OooO0oo6 = C22179Oooo.f67033OooOOOO;
            OooOoo(zzieVar7, c22162OooO0oo6, jNextLong, z);
            OooOooo(c22162OooO0oo6);
            return c22162OooO0oo6;
        }
        if (c22161OooO0oO.f66923OooO0OO.isEmpty()) {
            c22162OooO0ooOooO00o = C22179Oooo.f67019OooO;
            z2 = true;
            z3 = z;
            j = jNextLong;
            skuDetails = skuDetails2;
            str2 = str8;
            str3 = str7;
        } else {
            C22161OooO0oO.OooO0O0 oooO0O02 = (C22161OooO0oO.OooO0O0) c22161OooO0oO.f66923OooO0OO.get(0);
            int i3 = 1;
            while (true) {
                z2 = z9;
                if (i3 < c22161OooO0oO.f66923OooO0OO.size()) {
                    C22161OooO0oO.OooO0O0 oooO0O03 = (C22161OooO0oO.OooO0O0) c22161OooO0oO.f66923OooO0OO.get(i3);
                    z3 = z;
                    if (!oooO0O03.f66927OooO00o.f66948OooO0Oo.equals(oooO0O02.f66927OooO00o.f66948OooO0Oo) && !oooO0O03.f66927OooO00o.f66948OooO0Oo.equals("play_pass_subs")) {
                        c22162OooO0ooOooO00o2 = C22179Oooo.OooO00o(5, "All products should have same ProductType.");
                        j = jNextLong;
                        skuDetails = skuDetails2;
                        str2 = str8;
                        str3 = str7;
                        break;
                    }
                    i3++;
                    z9 = z2;
                    z = z3;
                } else {
                    z3 = z;
                    String strOptString = oooO0O02.f66927OooO00o.f66946OooO0O0.optString("packageName");
                    HashMap map = new HashMap();
                    HashSet hashSet = new HashSet();
                    j = jNextLong;
                    zzbt zzbtVar3 = c22161OooO0oO.f66923OooO0OO;
                    int size2 = zzbtVar3.size();
                    skuDetails = skuDetails2;
                    str2 = str8;
                    int i4 = 0;
                    while (true) {
                        str3 = str7;
                        OooOO0O oooOO0O2 = oooO0O02.f66927OooO00o;
                        if (i4 < size2) {
                            zzbt zzbtVar4 = zzbtVar3;
                            C22161OooO0oO.OooO0O0 oooO0O04 = (C22161OooO0oO.OooO0O0) zzbtVar3.get(i4);
                            int i5 = size2;
                            OooOO0O oooOO0O3 = oooO0O04.f66927OooO00o;
                            int i6 = i4;
                            ArrayList arrayList2 = oooOO0O3.f66944OooO;
                            String str9 = oooOO0O3.f66947OooO0OO;
                            if (arrayList2 != null && oooO0O04.f66928OooO0O0 == null) {
                                c22162OooO0ooOooO00o = C22179Oooo.OooO00o(5, "offerToken is required for constructing ProductDetailsParams for subscriptions. Missing value for product id: " + str9);
                                break;
                            }
                            boolean zContainsKey = map.containsKey(str9);
                            OooOO0O oooOO0O4 = oooO0O04.f66927OooO00o;
                            if (zContainsKey) {
                                c22162OooO0ooOooO00o = C22179Oooo.OooO00o(5, "ProductId can not be duplicated. Invalid product id: " + oooOO0O4.f66947OooO0OO + ".");
                                break;
                            }
                            map.put(oooOO0O4.f66947OooO0OO, oooO0O04);
                            if (!oooOO0O2.f66948OooO0Oo.equals("play_pass_subs") && !oooOO0O4.f66948OooO0Oo.equals("play_pass_subs") && !strOptString.equals(oooOO0O4.f66946OooO0O0.optString("packageName"))) {
                                c22162OooO0ooOooO00o = C22179Oooo.OooO00o(5, "All products must have the same package name.");
                                break;
                            }
                            i4 = i6 + 1;
                            str7 = str3;
                            size2 = i5;
                            zzbtVar3 = zzbtVar4;
                        } else {
                            Iterator it = hashSet.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    String str10 = (String) it.next();
                                    if (map.containsKey(str10)) {
                                        c22162OooO0ooOooO00o = C22179Oooo.OooO00o(5, "OldProductId must not be one of the products to be purchased. Invalid old product id: " + str10 + ".");
                                        break;
                                    }
                                } else {
                                    ArrayList arrayList3 = oooOO0O2.f66953OooOO0;
                                    String str11 = oooO0O02.f66928OooO0O0;
                                    if (str11 == null || arrayList3 == null) {
                                        c22162OooO0ooOooO00o = C22179Oooo.f67019OooO;
                                    } else {
                                        Iterator it2 = arrayList3.iterator();
                                        while (true) {
                                            if (!it2.hasNext()) {
                                                r3 = str;
                                                break;
                                            }
                                            r3 = (OooOO0O.OooO00o) it2.next();
                                            if (str11.equals(r3.f66957OooO0Oo)) {
                                                break;
                                            }
                                        }
                                        if (r3 != 0 && r3.f66960OooO0oO != null) {
                                            c22162OooO0ooOooO00o = C22179Oooo.OooO00o(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        c22162OooO0ooOooO00o2 = c22162OooO0ooOooO00o;
        if (c22162OooO0ooOooO00o2 != C22179Oooo.f67019OooO) {
            OooOoo(zzie.INVALID_BILLING_FLOW_PARAMS, c22162OooO0ooOooO00o2, j, z3);
            OooOooo(c22162OooO0ooOooO00o2);
            return c22162OooO0ooOooO00o2;
        }
        boolean z10 = z3;
        long j4 = j;
        if (this.f66905OooOOO0) {
            boolean z11 = this.f66904OooOOO;
            this.f66911OooOo.getClass();
            this.f66911OooOo.getClass();
            boolean z12 = this.f66917OooOoO0;
            String str12 = this.f66895OooO0OO;
            String str13 = this.f66896OooO0Oo;
            long jLongValue = this.f66918OooOoOO.longValue();
            this.f66899OooO0oO.getPackageName();
            int i7 = zzc.zza;
            boolean z13 = z10;
            final Bundle bundle = new Bundle();
            zzc.zzc(bundle, str12, str13, jLongValue);
            bundle.putLong("billingClientTransactionId", j4);
            int i8 = c22161OooO0oO.f66922OooO0O0.f66932OooO0O0;
            if (i8 != 0) {
                bundle.putInt("prorationMode", i8);
            }
            if (TextUtils.isEmpty(str)) {
                str6 = str;
            } else {
                str6 = str;
                bundle.putString("accountId", str6);
            }
            if (!TextUtils.isEmpty(str6)) {
                bundle.putString("obfuscatedProfileId", str6);
            }
            if (!TextUtils.isEmpty(str6)) {
                bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(str6)));
            }
            if (!TextUtils.isEmpty(c22161OooO0oO.f66922OooO0O0.f66931OooO00o)) {
                bundle.putString("oldSkuPurchaseToken", c22161OooO0oO.f66922OooO0O0.f66931OooO00o);
            }
            if (!TextUtils.isEmpty(null)) {
                bundle.putString("oldSkuPurchaseId", null);
            }
            c22161OooO0oO.f66922OooO0O0.getClass();
            if (!TextUtils.isEmpty(null)) {
                c22161OooO0oO.f66922OooO0O0.getClass();
                bundle.putString("originalExternalTransactionId", null);
            }
            if (!TextUtils.isEmpty(null)) {
                bundle.putString("paymentsPurchaseParams", null);
            }
            if (z11) {
                z6 = z2;
                bundle.putBoolean("enablePendingPurchases", z6);
            } else {
                z6 = z2;
            }
            if (z12) {
                bundle.putBoolean("enableAlternativeBilling", z6);
            }
            ArrayList arrayList4 = new ArrayList();
            for (C22161OooO0oO.OooO0O0 oooO0O05 : c22161OooO0oO.f66923OooO0OO) {
            }
            if (!arrayList4.isEmpty()) {
                zzdj zzdjVarZza = zzdk.zza();
                zzdjVarZza.zza(arrayList4);
                bundle.putByteArray("subscriptionProductReplacementParamsList", ((zzdk) zzdjVarZza.zze()).zzM());
            }
            if (arrayList.isEmpty()) {
                ArrayList<String> arrayList5 = new ArrayList<>(zzbtVar.size() - 1);
                ArrayList<String> arrayList6 = new ArrayList<>(zzbtVar.size() - 1);
                ArrayList<String> arrayList7 = new ArrayList<>();
                ArrayList<String> arrayList8 = new ArrayList<>();
                ArrayList<String> arrayList9 = new ArrayList<>();
                ArrayList<Integer> arrayList10 = new ArrayList<>();
                int i9 = 0;
                while (i9 < zzbtVar.size()) {
                    C22161OooO0oO.OooO0O0 oooO0O06 = (C22161OooO0oO.OooO0O0) zzbtVar.get(i9);
                    OooOO0O oooOO0O5 = oooO0O06.f66927OooO00o;
                    long j5 = j4;
                    if (!oooOO0O5.f66951OooO0oO.isEmpty()) {
                        arrayList7.add(oooOO0O5.f66951OooO0oO);
                    }
                    arrayList8.add(oooO0O06.f66928OooO0O0);
                    String str14 = oooOO0O5.f66952OooO0oo;
                    ArrayList arrayList11 = oooOO0O5.f66953OooOO0;
                    if (arrayList11 != null && !arrayList11.isEmpty()) {
                        Iterator it3 = oooOO0O5.f66953OooOO0.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            OooOO0O.OooO00o oooO00o = (OooOO0O.OooO00o) it3.next();
                            if (!TextUtils.isEmpty(oooO00o.f66958OooO0o)) {
                                str14 = oooO00o.f66958OooO0o;
                                break;
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(str14)) {
                        arrayList9.add(str14);
                    }
                    if (i9 > 0) {
                        arrayList5.add(((C22161OooO0oO.OooO0O0) zzbtVar.get(i9)).f66927OooO00o.f66947OooO0OO);
                        arrayList6.add(((C22161OooO0oO.OooO0O0) zzbtVar.get(i9)).f66927OooO00o.f66948OooO0Oo);
                    }
                    i9++;
                    j4 = j5;
                }
                j3 = j4;
                z7 = true;
                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList8);
                if (!arrayList10.isEmpty()) {
                    bundle.putIntegerArrayList("autoPayBalanceThresholdList", arrayList10);
                }
                if (!arrayList7.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList7);
                }
                if (!arrayList9.isEmpty()) {
                    bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList9);
                }
                if (!arrayList5.isEmpty()) {
                    bundle.putStringArrayList("additionalSkus", arrayList5);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList6);
                }
            } else {
                ArrayList<String> arrayList12 = new ArrayList<>();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                Iterator it4 = arrayList.iterator();
                if (it4.hasNext()) {
                    ((SkuDetails) it4.next()).getClass();
                    throw null;
                }
                if (!arrayList12.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList12);
                }
                if (arrayList.size() > 1) {
                    ArrayList<String> arrayList13 = new ArrayList<>(arrayList.size() - 1);
                    ArrayList<String> arrayList14 = new ArrayList<>(arrayList.size() - 1);
                    if (1 < arrayList.size()) {
                        ((SkuDetails) arrayList.get(1)).getClass();
                        throw null;
                    }
                    bundle.putStringArrayList("additionalSkus", arrayList13);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList14);
                }
                z7 = true;
                j3 = j4;
            }
            if (bundle.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !this.f66906OooOOOO) {
                zzie zzieVar8 = zzie.OFFER_ID_TOKEN_NOT_SUPPORTED;
                C22162OooO0oo c22162OooO0oo7 = C22179Oooo.f67031OooOOO;
                OooOoo(zzieVar8, c22162OooO0oo7, j3, z13);
                OooOooo(c22162OooO0oo7);
                return c22162OooO0oo7;
            }
            j4 = j3;
            if (skuDetails != null) {
                throw null;
            }
            if (TextUtils.isEmpty(oooO0O0.f66927OooO00o.f66946OooO0O0.optString("packageName"))) {
                z8 = false;
            } else {
                bundle.putString("skuPackageName", oooO0O0.f66927OooO00o.f66946OooO0O0.optString("packageName"));
                z8 = z7;
            }
            if (!TextUtils.isEmpty(null)) {
                bundle.putString("accountName", null);
            }
            Intent intent = activityC21897OooOo0.getIntent();
            if (intent == null) {
                zzc.zzn("BillingClient", "Activity's intent is null.");
            } else if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                bundle.putString("proxyPackage", stringExtra);
                try {
                    bundle.putString("proxyPackageVersion", this.f66899OooO0oO.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                } catch (PackageManager.NameNotFoundException unused) {
                    bundle.putString("proxyPackageVersion", "package not found");
                }
            }
            final int i10 = (!this.f66908OooOOo || zzbtVar.isEmpty()) ? (this.f66907OooOOOo && z8) ? 15 : this.f66904OooOOO ? 9 : 6 : 17;
            final String str15 = str2;
            final String str16 = str3;
            futureOooO0oO = OooO0oO(new Callable(i10, str16, str15, c22161OooO0oO, bundle) { // from class: com.android.billingclient.api.OoooOoo

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ int f67076OooOo;

                /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
                public final /* synthetic */ String f67078OooOoO;

                /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
                public final /* synthetic */ String f67079OooOoO0;

                /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
                public final /* synthetic */ Bundle f67080OooOoOO;

                {
                    this.f67080OooOoOO = bundle;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzam zzamVar;
                    C22159OooO0Oo c22159OooO0Oo = this.f67077OooOo0o;
                    int i11 = this.f67076OooOo;
                    String str17 = this.f67079OooOoO0;
                    String str18 = this.f67078OooOoO;
                    Bundle bundle2 = this.f67080OooOoOO;
                    try {
                        synchronized (c22159OooO0Oo.f66893OooO00o) {
                            zzamVar = c22159OooO0Oo.f66892OooO;
                        }
                        return zzamVar == null ? zzc.zzd(C22179Oooo.f67028OooOO0, zzie.SERVICE_RESET_TO_NULL) : zzamVar.zzg(i11, c22159OooO0Oo.f66899OooO0oO.getPackageName(), str17, str18, null, bundle2);
                    } catch (DeadObjectException e2) {
                        return zzc.zze(C22179Oooo.f67028OooOO0, zzie.LAUNCH_BILLING_FLOW_EXCEPTION, C22186Oooo0oO.OooO00o(e2));
                    } catch (Exception e3) {
                        return zzc.zze(C22179Oooo.f67027OooO0oo, zzie.LAUNCH_BILLING_FLOW_EXCEPTION, C22186Oooo0oO.OooO00o(e3));
                    }
                }
            }, 5000L, null, this.f66898OooO0o0, OooO0o());
            str4 = str15;
            r6 = bundle;
            z4 = z13;
        } else {
            z4 = z10;
            final String str17 = str2;
            final String str18 = str3;
            futureOooO0oO = OooO0oO(new Callable() { // from class: com.android.billingclient.api.Ooooo00
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzam zzamVar;
                    C22159OooO0Oo c22159OooO0Oo = this.f67082OooOo0o;
                    String str19 = str18;
                    String str20 = str17;
                    try {
                        synchronized (c22159OooO0Oo.f66893OooO00o) {
                            zzamVar = c22159OooO0Oo.f66892OooO;
                        }
                        return zzamVar == null ? zzc.zzd(C22179Oooo.f67028OooOO0, zzie.SERVICE_RESET_TO_NULL) : zzamVar.zzf(3, c22159OooO0Oo.f66899OooO0oO.getPackageName(), str19, str20, null);
                    } catch (DeadObjectException e2) {
                        return zzc.zze(C22179Oooo.f67028OooOO0, zzie.LAUNCH_BILLING_FLOW_EXCEPTION, C22186Oooo0oO.OooO00o(e2));
                    } catch (Exception e3) {
                        return zzc.zze(C22179Oooo.f67027OooO0oo, zzie.LAUNCH_BILLING_FLOW_EXCEPTION, C22186Oooo0oO.OooO00o(e3));
                    }
                }
            }, 5000L, null, this.f66898OooO0o0, OooO0o());
            str4 = str17;
            r6 = z10;
        }
        try {
            if (futureOooO0oO == null) {
                try {
                    zzie zzieVar9 = zzie.MISSING_RESULT_FROM_EXECUTE_ASYNC;
                    C22162OooO0oo c22162OooO0oo8 = C22179Oooo.f67022OooO0OO;
                    OooOoo(zzieVar9, c22162OooO0oo8, j4, z4);
                    OooOooo(c22162OooO0oo8);
                    return c22162OooO0oo8;
                } catch (CancellationException e2) {
                    e = e2;
                    r42 = j4;
                    r63 = z4;
                    zzc.zzo("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    zzie zzieVar10 = zzie.LAUNCH_BILLING_FLOW_TIMEOUT;
                    C22162OooO0oo c22162OooO0oo9 = C22179Oooo.f67029OooOO0O;
                    OooOooO(zzieVar10, c22162OooO0oo9, C22186Oooo0oO.OooO00o(e), r42, r63);
                    OooOooo(c22162OooO0oo9);
                    return c22162OooO0oo9;
                } catch (TimeoutException e3) {
                    e = e3;
                    r42 = j4;
                    r63 = z4;
                    zzc.zzo("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    zzie zzieVar102 = zzie.LAUNCH_BILLING_FLOW_TIMEOUT;
                    C22162OooO0oo c22162OooO0oo92 = C22179Oooo.f67029OooOO0O;
                    OooOooO(zzieVar102, c22162OooO0oo92, C22186Oooo0oO.OooO00o(e), r42, r63);
                    OooOooo(c22162OooO0oo92);
                    return c22162OooO0oo92;
                } catch (Exception e4) {
                    e = e4;
                    r4 = j4;
                    r62 = z4;
                    zzc.zzo("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                    zzie zzieVar11 = zzie.LAUNCH_BILLING_FLOW_EXCEPTION;
                    C22162OooO0oo c22162OooO0oo10 = C22179Oooo.f67028OooOO0;
                    OooOooO(zzieVar11, c22162OooO0oo10, C22186Oooo0oO.OooO00o(e), r4, r62);
                    OooOooo(c22162OooO0oo10);
                    return c22162OooO0oo10;
                }
            }
            long j6 = j4;
            boolean z14 = z4;
            Bundle bundle2 = (Bundle) futureOooO0oO.get(5000L, TimeUnit.MILLISECONDS);
            int iZzb = zzc.zzb(bundle2, "BillingClient");
            String strZzj = zzc.zzj(bundle2, "BillingClient");
            if (iZzb == 0) {
                Intent intent2 = new Intent(activityC21897OooOo0, (Class<?>) ProxyBillingActivity.class);
                intent2.putExtra("BUY_INTENT", (PendingIntent) bundle2.getParcelable("BUY_INTENT"));
                intent2.putExtra("billingClientTransactionId", j6);
                intent2.putExtra("wasServiceAutoReconnected", z14);
                activityC21897OooOo0.startActivity(intent2);
                return C22179Oooo.f67019OooO;
            }
            zzc.zzn("BillingClient", "Unable to buy item, Error response code: " + iZzb);
            C22162OooO0oo c22162OooO0ooOooO00o3 = C22179Oooo.OooO00o(iZzb, strZzj);
            try {
                if (bundle2 == null || (obj = bundle2.get("LOG_REASON")) == null) {
                    zzieVarZzb = zzie.REASON_UNSPECIFIED;
                } else if (obj instanceof Integer) {
                    zzieVarZzb = zzie.zzb(((Integer) obj).intValue());
                } else {
                    zzc.zzn("BillingClient", "Unexpected type for bundle log reason: " + obj.getClass().getName());
                    zzieVarZzb = zzie.REASON_UNSPECIFIED;
                }
            } catch (Throwable th) {
                zzc.zzn("BillingClient", "Failed to get log reason from bundle: ".concat(String.valueOf(th.getMessage())));
                zzieVarZzb = zzie.REASON_UNSPECIFIED;
            }
            if (zzieVarZzb == zzie.REASON_UNSPECIFIED) {
                zzieVarZzb = zzie.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
            }
            zzie zzieVar12 = zzieVarZzb;
            try {
                if (bundle2 != null) {
                    try {
                        String string = bundle2.getString("ADDITIONAL_LOG_DETAILS");
                        zzieVar = zzieVar12;
                        z5 = z14 ? 1 : 0;
                        j2 = j6;
                        str5 = string;
                    } catch (Throwable th2) {
                        zzc.zzn("BillingClient", "Failed to get additional log details from bundle: ".concat(String.valueOf(th2.getMessage())));
                        zzieVar = zzieVar12;
                        z5 = z14 ? 1 : 0;
                        j2 = j6;
                        str5 = null;
                    }
                    OooOooO(zzieVar, c22162OooO0ooOooO00o3, str5, j2, z5);
                    OooOooo(c22162OooO0ooOooO00o3);
                    return c22162OooO0ooOooO00o3;
                }
                OooOooO(zzieVar, c22162OooO0ooOooO00o3, str5, j2, z5);
                OooOooo(c22162OooO0ooOooO00o3);
                return c22162OooO0ooOooO00o3;
            } catch (CancellationException e5) {
                e = e5;
                r42 = j2;
                r63 = z5;
                zzc.zzo("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                zzie zzieVar1022 = zzie.LAUNCH_BILLING_FLOW_TIMEOUT;
                C22162OooO0oo c22162OooO0oo922 = C22179Oooo.f67029OooOO0O;
                OooOooO(zzieVar1022, c22162OooO0oo922, C22186Oooo0oO.OooO00o(e), r42, r63);
                OooOooo(c22162OooO0oo922);
                return c22162OooO0oo922;
            } catch (TimeoutException e6) {
                e = e6;
                r42 = j2;
                r63 = z5;
                zzc.zzo("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                zzie zzieVar10222 = zzie.LAUNCH_BILLING_FLOW_TIMEOUT;
                C22162OooO0oo c22162OooO0oo9222 = C22179Oooo.f67029OooOO0O;
                OooOooO(zzieVar10222, c22162OooO0oo9222, C22186Oooo0oO.OooO00o(e), r42, r63);
                OooOooo(c22162OooO0oo9222);
                return c22162OooO0oo9222;
            } catch (Exception e7) {
                e = e7;
                r4 = j2;
                r62 = z5;
                zzc.zzo("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                zzie zzieVar112 = zzie.LAUNCH_BILLING_FLOW_EXCEPTION;
                C22162OooO0oo c22162OooO0oo102 = C22179Oooo.f67028OooOO0;
                OooOooO(zzieVar112, c22162OooO0oo102, C22186Oooo0oO.OooO00o(e), r4, r62);
                OooOooo(c22162OooO0oo102);
                return c22162OooO0oo102;
            }
            zzieVar = zzieVar12;
            z5 = z14 ? 1 : 0;
            j2 = j6;
            str5 = null;
        } catch (CancellationException e8) {
            e = e8;
        } catch (TimeoutException e9) {
            e = e9;
            r42 = str4;
            r63 = r6;
        } catch (Exception e10) {
            e = e10;
        }
    }

    public void OooO0Oo(final OooOOO oooOOO, final OooO.OooO00o oooO00o) {
        if (OooO0oO(new Callable() { // from class: com.android.billingclient.api.OooOo0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C22177OooOooO c22177OooOooO;
                zzam zzamVar;
                C22159OooO0Oo c22159OooO0Oo = this.f66996OooOo0o;
                OooO.OooO00o oooO00o2 = oooO00o;
                OooOOO oooOOO2 = oooOOO;
                Exception exc = null;
                if (!c22159OooO0Oo.OooOOOO()) {
                    zzie zzieVar = zzie.SERVICE_CONNECTION_NOT_READY;
                    C22162OooO0oo c22162OooO0oo = C22179Oooo.f67028OooOO0;
                    c22159OooO0Oo.OooOoO(7, c22162OooO0oo, zzieVar);
                    oooO00o2.OooO00o(c22162OooO0oo, new OooOOOO(zzbt.zzk(), zzbt.zzk()));
                    return null;
                }
                if (!c22159OooO0Oo.f66908OooOOo) {
                    zzc.zzn("BillingClient", "Querying product details is not supported.");
                    zzie zzieVar2 = zzie.PRODUCT_DETAILS_NOT_SUPPORTED;
                    C22162OooO0oo c22162OooO0oo2 = C22179Oooo.f67033OooOOOO;
                    c22159OooO0Oo.OooOoO(7, c22162OooO0oo2, zzieVar2);
                    oooO00o2.OooO00o(c22162OooO0oo2, new OooOOOO(zzbt.zzk(), zzbt.zzk()));
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                String str = ((OooOOO.OooO0O0) oooOOO2.f66974OooO00o.get(0)).f66977OooO0O0;
                zzbt zzbtVar = oooOOO2.f66974OooO00o;
                int size = zzbtVar.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        c22177OooOooO = new C22177OooOooO(0, "", arrayList, arrayList2);
                        break;
                    }
                    int i2 = i + 20;
                    ArrayList<OooOOO.OooO0O0> arrayList3 = new ArrayList(zzbtVar.subList(i, i2 > size ? size : i2));
                    ArrayList<String> arrayList4 = new ArrayList<>();
                    int size2 = arrayList3.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        arrayList4.add(((OooOOO.OooO0O0) arrayList3.get(i3)).f66976OooO00o);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putStringArrayList("ITEM_ID_LIST", arrayList4);
                    String str2 = c22159OooO0Oo.f66895OooO0OO;
                    bundle.putString("playBillingLibraryVersion", str2);
                    try {
                        synchronized (c22159OooO0Oo.f66893OooO00o) {
                            zzamVar = c22159OooO0Oo.f66892OooO;
                        }
                        if (zzamVar == null) {
                            c22177OooOooO = c22159OooO0Oo.OooOOoo(C22179Oooo.f67028OooOO0, zzie.SERVICE_RESET_TO_NULL, "Service has been reset to null.", exc);
                            break;
                        }
                        if (c22159OooO0Oo.f66910OooOOoo) {
                            c22159OooO0Oo.f66911OooOo.getClass();
                        }
                        c22159OooO0Oo.OooOo0o();
                        c22159OooO0Oo.OooOo0o();
                        c22159OooO0Oo.OooOo0o();
                        c22159OooO0Oo.OooOo0o();
                        Bundle bundleZzj = zzamVar.zzj(true != c22159OooO0Oo.f66913OooOo00 ? 17 : 20, c22159OooO0Oo.f66899OooO0oO.getPackageName(), str, bundle, zzc.zzf(str2, c22159OooO0Oo.f66896OooO0Oo, arrayList3, null, null, zza.zza(false, true, false, true, false, true), c22159OooO0Oo.f66918OooOoOO.longValue()));
                        if (bundleZzj == null) {
                            c22177OooOooO = c22159OooO0Oo.OooOOoo(C22179Oooo.f67034OooOOOo, zzie.NULL_BUNDLE_FROM_GET_SKU_DETAILS_SERVICE_CALL, "queryProductDetailsAsync got empty product details response.", null);
                            break;
                        }
                        if (bundleZzj.containsKey("DETAILS_LIST")) {
                            ArrayList<String> stringArrayList = bundleZzj.getStringArrayList("DETAILS_LIST");
                            if (stringArrayList == null) {
                                c22177OooOooO = c22159OooO0Oo.OooOOoo(C22179Oooo.f67034OooOOOo, zzie.NULL_DETAILS_LIST_IN_GET_SKU_DETAILS_RESPONSE, "queryProductDetailsAsync got null response list", null);
                                break;
                            }
                            ArrayList arrayList5 = new ArrayList();
                            int size3 = stringArrayList.size();
                            int i4 = 0;
                            while (i4 < size3) {
                                try {
                                    OooOO0O oooOO0O = new OooOO0O(stringArrayList.get(i4));
                                    zzc.zzm("BillingClient", "Got product details: ".concat(oooOO0O.toString()));
                                    arrayList5.add(oooOO0O);
                                    i4++;
                                    zzbtVar = zzbtVar;
                                } catch (JSONException e) {
                                    c22177OooOooO = c22159OooO0Oo.OooOOoo(C22179Oooo.OooO00o(6, "Error trying to decode SkuDetails."), zzie.ERROR_DECODING_SKU_DETAILS, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e);
                                }
                            }
                            zzbt zzbtVar2 = zzbtVar;
                            ArrayList<String> stringArrayList2 = bundleZzj.getStringArrayList("UNFETCHED_PRODUCT_LIST");
                            new ArrayList();
                            try {
                                ArrayList arrayList6 = new ArrayList();
                                if (stringArrayList2 == null) {
                                    for (OooOOO.OooO0O0 oooO0O0 : arrayList3) {
                                        Iterator it = arrayList5.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                arrayList6.add(new C22165OooOOOo(new JSONObject().put("productId", oooO0O0.f66976OooO00o).put(C18437z2.f56754h, oooO0O0.f66977OooO0O0).put(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, 0).toString()));
                                                break;
                                            }
                                            OooOO0O oooOO0O2 = (OooOO0O) it.next();
                                            if (!oooO0O0.f66976OooO00o.equals(oooOO0O2.f66947OooO0OO) || !oooO0O0.f66977OooO0O0.equals(oooOO0O2.f66948OooO0Oo)) {
                                            }
                                        }
                                    }
                                } else {
                                    Iterator<String> it2 = stringArrayList2.iterator();
                                    while (it2.hasNext()) {
                                        C22165OooOOOo c22165OooOOOo = new C22165OooOOOo(it2.next());
                                        zzc.zzm("BillingClient", "Got unfetchedProduct: ".concat(c22165OooOOOo.toString()));
                                        arrayList6.add(c22165OooOOOo);
                                    }
                                }
                                arrayList.addAll(arrayList5);
                                arrayList2.addAll(arrayList6);
                                i = i2;
                                zzbtVar = zzbtVar2;
                                exc = null;
                            } catch (JSONException e2) {
                                c22177OooOooO = c22159OooO0Oo.OooOOoo(C22179Oooo.OooO00o(6, "Error trying to decode SkuDetails."), zzie.ERROR_DECODING_SKU_DETAILS, "Got a JSON exception trying to decode UnfetchedProduct. \n Exception: ", e2);
                            }
                        } else {
                            int iZzb = zzc.zzb(bundleZzj, "BillingClient");
                            String strZzj = zzc.zzj(bundleZzj, "BillingClient");
                            c22177OooOooO = iZzb != 0 ? c22159OooO0Oo.OooOOoo(C22179Oooo.OooO00o(iZzb, strZzj), zzie.BILLING_RESULT_RECEIVED_FROM_PHONESKY, C21532OooOOo.OooO0OO(iZzb, "getSkuDetails() failed for queryProductDetailsAsync. Response code: "), null) : c22159OooO0Oo.OooOOoo(C22179Oooo.OooO00o(6, strZzj), zzie.MISSING_DETAILS_LIST_IN_GET_SKU_DETAILS_RESPONSE, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null);
                        }
                    } catch (DeadObjectException e3) {
                        c22177OooOooO = c22159OooO0Oo.OooOOoo(C22179Oooo.f67028OooOO0, zzie.GET_SKU_DETAILS_SERVICE_CALL_EXCEPTION, "queryProductDetailsAsync got a remote exception (try to reconnect).", e3);
                    } catch (Exception e4) {
                        c22177OooOooO = c22159OooO0Oo.OooOOoo(C22179Oooo.f67027OooO0oo, zzie.GET_SKU_DETAILS_SERVICE_CALL_EXCEPTION, "queryProductDetailsAsync got a remote exception (try to reconnect).", e4);
                    }
                }
                oooO00o2.OooO00o(C22179Oooo.OooO00o(c22177OooOooO.f67016OooO0OO, c22177OooOooO.f67017OooO0Oo), new OooOOOO(c22177OooOooO.f67014OooO00o, c22177OooOooO.f67015OooO0O0));
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.OooOo0O
            @Override // java.lang.Runnable
            public final void run() {
                zzie zzieVar = zzie.EXECUTE_ASYNC_TIMEOUT;
                C22162OooO0oo c22162OooO0oo = C22179Oooo.f67029OooOO0O;
                this.f67001OooOo0o.OooOoO(7, c22162OooO0oo, zzieVar);
                oooO00o.OooO00o(c22162OooO0oo, new OooOOOO(zzbt.zzk(), zzbt.zzk()));
            }
        }, OooOOo(), OooO0o()) == null) {
            C22162OooO0oo c22162OooO0ooOooOo0 = OooOo0();
            OooOoO(7, c22162OooO0ooOooOo0, zzie.MISSING_RESULT_FROM_EXECUTE_ASYNC);
            oooO00o.OooO00o(c22162OooO0ooOooOo0, new OooOOOO(zzbt.zzk(), zzbt.zzk()));
        }
    }

    public final synchronized ExecutorService OooO0o() {
        try {
            if (this.f66916OooOoO == null) {
                this.f66916OooOoO = Executors.newFixedThreadPool(zzc.zza, new OooOo(this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f66916OooOoO;
    }

    public void OooO0o0(OooO0o oooO0o) {
        OooOOO0(oooO0o, 0);
    }

    public final void OooO0oo(OooO00o oooO00o, C22162OooO0oo c22162OooO0oo, zzie zzieVar, Exception exc) {
        zzc.zzo("BillingClient", "Error in acknowledge purchase!", exc);
        OooOoo0(zzieVar, 3, c22162OooO0oo, C22186Oooo0oO.OooO00o(exc));
        oooO00o.OooO00o(c22162OooO0oo);
    }

    public final void OooOO0(zzib zzibVar) {
        try {
            C22190OoooO00 c22190OoooO00 = this.f66900OooO0oo;
            int i = this.f66903OooOO0o;
            c22190OoooO00.getClass();
            try {
                zziq zziqVar = (zziq) c22190OoooO00.f67059OooO0O0.zzm();
                zziqVar.zzm(i);
                zzis zzisVar = (zzis) zziqVar.zze();
                c22190OoooO00.f67059OooO0O0 = zzisVar;
                try {
                    c22190OoooO00.OooO0oO(zzibVar, zzisVar);
                } catch (Throwable th) {
                    zzc.zzo("BillingLogger", "Unable to log.", th);
                }
            } catch (Throwable th2) {
                zzc.zzo("BillingLogger", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            zzc.zzo("BillingClient", "Unable to log.", th3);
        }
    }

    public final void OooOO0O(int i, C22162OooO0oo c22162OooO0oo, zzie zzieVar) {
        try {
            int i2 = C22186Oooo0oO.f67057OooO00o;
            zzhv zzhvVar = (zzhv) C22186Oooo0oO.OooO0O0(zzieVar, 6, c22162OooO0oo, null, zzil.BROADCAST_ACTION_UNSPECIFIED).zzm();
            zzjt zzjtVarZzc = zzjv.zzc();
            zzjtVarZzc.zza(i > 0);
            zzjtVarZzc.zzl(i);
            zzhvVar.zzo(zzjtVarZzc);
            OooO((zzhx) zzhvVar.zze());
        } catch (Throwable th) {
            zzc.zzo("BillingClient", "Unable to log.", th);
        }
    }

    public final void OooOO0o(int i) {
        synchronized (this.f66893OooO00o) {
            try {
                if (this.f66894OooO0O0 == 3) {
                    return;
                }
                int i2 = this.f66894OooO0O0;
                zzc.zzm("BillingClient", "Setting clientState from " + (i2 != 0 ? i2 != 1 ? i2 != 2 ? MaterialPurchaseStatusResponse.STATUS_CLOSED : "CONNECTED" : "CONNECTING" : "DISCONNECTED") + " to " + (i != 0 ? i != 1 ? i != 2 ? MaterialPurchaseStatusResponse.STATUS_CLOSED : "CONNECTED" : "CONNECTING" : "DISCONNECTED"));
                this.f66894OooO0O0 = i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOOO() {
        synchronized (this.f66893OooO00o) {
            if (this.f66901OooOO0 != null) {
                try {
                    this.f66899OooO0oO.unbindService(this.f66901OooOO0);
                } catch (Throwable th) {
                    try {
                        zzc.zzo("BillingClient", "There was an exception while unbinding service!", th);
                        this.f66892OooO = null;
                        this.f66901OooOO0 = null;
                    } finally {
                        this.f66892OooO = null;
                        this.f66901OooOO0 = null;
                    }
                }
            }
        }
    }

    public final void OooOOO0(OooO0o oooO0o, int i) {
        zzie zzieVar;
        C22162OooO0oo c22162OooO0ooOooOo00;
        C22162OooO0oo c22162OooO0oo;
        synchronized (this.f66893OooO00o) {
            try {
                if (OooOOOo()) {
                    c22162OooO0ooOooOo00 = OooOo00(i);
                } else {
                    if (this.f66894OooO0O0 == 1) {
                        zzc.zzn("BillingClient", "Client is already in the process of connecting to billing service.");
                        zzie zzieVar2 = zzie.BILLING_CLIENT_CONNECTING;
                        c22162OooO0oo = C22179Oooo.f67023OooO0Oo;
                        OooOO0O(i, c22162OooO0oo, zzieVar2);
                    } else if (this.f66894OooO0O0 == 3) {
                        zzc.zzn("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                        zzie zzieVar3 = zzie.BILLING_CLIENT_CLOSED;
                        c22162OooO0oo = C22179Oooo.f67028OooOO0;
                        OooOO0O(i, c22162OooO0oo, zzieVar3);
                    } else {
                        OooOO0o(1);
                        if (i == 0) {
                            i = 0;
                        }
                        OooOOO();
                        zzc.zzm("BillingClient", "Starting in-app billing setup.");
                        this.f66901OooOO0 = new ServiceConnectionC22175OooOoo(this, oooO0o, i);
                        zzbi zzbiVar = this.f66901OooOO0.f67008OooOo;
                        zzbiVar.zzd();
                        zzbiVar.zze();
                        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                        intent.setPackage("com.android.vending");
                        List<ResolveInfo> listQueryIntentServices = this.f66899OooO0oO.getPackageManager().queryIntentServices(intent, 0);
                        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                            zzieVar = zzie.INTENT_SERVICE_NOT_FOUND;
                        } else {
                            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                            if (serviceInfo != null) {
                                String str = serviceInfo.packageName;
                                String str2 = serviceInfo.name;
                                if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                    zzieVar = zzie.INVALID_PHONESKY_PACKAGE;
                                    zzc.zzn("BillingClient", "The device doesn't have valid Play Store.");
                                } else {
                                    ComponentName componentName = new ComponentName(str, str2);
                                    Intent intent2 = new Intent(intent);
                                    intent2.setComponent(componentName);
                                    intent2.putExtra("playBillingLibraryVersion", this.f66895OooO0OO);
                                    synchronized (this.f66893OooO00o) {
                                        try {
                                            if (this.f66894OooO0O0 == 2) {
                                                c22162OooO0ooOooOo00 = OooOo00(i);
                                            } else if (this.f66894OooO0O0 != 1) {
                                                zzc.zzn("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                                zzie zzieVar4 = zzie.BILLING_CLIENT_TRANSITIONED_OUT_OF_CONNECTING;
                                                c22162OooO0oo = C22179Oooo.f67028OooOO0;
                                                OooOO0O(i, c22162OooO0oo, zzieVar4);
                                            } else {
                                                ServiceConnectionC22175OooOoo serviceConnectionC22175OooOoo = this.f66901OooOO0;
                                                if ((i <= 0 || Build.VERSION.SDK_INT < 29) ? this.f66899OooO0oO.bindService(intent2, serviceConnectionC22175OooOoo, 1) : this.f66899OooO0oO.bindService(intent2, 1, OooO0o(), serviceConnectionC22175OooOoo)) {
                                                    zzc.zzm("BillingClient", "Service was bonded successfully.");
                                                    c22162OooO0ooOooOo00 = null;
                                                } else {
                                                    zzieVar = zzie.BILLING_SERVICE_BLOCKED;
                                                    zzc.zzn("BillingClient", "Connection to Billing service is blocked.");
                                                }
                                            }
                                        } finally {
                                        }
                                    }
                                }
                            } else {
                                zzieVar = zzie.INVALID_PHONESKY_PACKAGE;
                                zzc.zzn("BillingClient", "The device doesn't have valid Play Store.");
                            }
                        }
                        OooOO0o(0);
                        zzc.zzm("BillingClient", "Billing service unavailable on device.");
                        C22162OooO0oo c22162OooO0oo2 = C22179Oooo.f67021OooO0O0;
                        OooOO0O(i, c22162OooO0oo2, zzieVar);
                        c22162OooO0ooOooOo00 = c22162OooO0oo2;
                    }
                    c22162OooO0ooOooOo00 = c22162OooO0oo;
                }
            } finally {
            }
        }
        if (c22162OooO0ooOooOo00 != null) {
            oooO0o.OooO00o(c22162OooO0ooOooOo00);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean OooOOOO() {
        long jMax;
        zzbi zzbiVarZzb = zzbi.zzb(this.f66919OooOoo0);
        long jZza = 30000;
        for (int i = 1; i <= 3; i++) {
            try {
                jMax = Math.max(0L, jZza);
            } catch (Exception e) {
                if (e instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                zzc.zzo("BillingClient", "Error during reconnection attempt: ", e);
            }
            if (jMax <= 0) {
                zzc.zzn("BillingClient", "No time remaining for reconnection attempt.");
                return OooOOOo();
            }
            int i2 = ((C22162OooO0oo) OooOo0O(i).get(jMax, TimeUnit.MILLISECONDS)).f66936OooO00o;
            if (i2 == 0) {
                zzc.zzm("BillingClient", "Reconnection succeeded with result: " + i2);
                return OooOOOo();
            }
            zzc.zzn("BillingClient", "Reconnection failed with result: " + i2);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            jZza = 30000 - zzbiVarZzb.zza(timeUnit);
            long jPow = ((long) Math.pow(2.0d, i - 1)) * 1000;
            if (jZza < jPow) {
                zzc.zzn("BillingClient", "Reconnection failed due to timeout limit reached.");
                return OooOOOo();
            }
            if (i < 3 && jPow > 0) {
                try {
                    Thread.sleep(jPow);
                    jZza = 30000 - zzbiVarZzb.zza(timeUnit);
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    zzc.zzo("BillingClient", "Error sleeping during reconnection attempt: ", e2);
                }
            }
        }
        zzc.zzn("BillingClient", "Max retries reached.");
        return OooOOOo();
    }

    public final boolean OooOOOo() {
        boolean z;
        synchronized (this.f66893OooO00o) {
            try {
                z = false;
                if (this.f66894OooO0O0 == 2 && this.f66892OooO != null && this.f66901OooOO0 != null) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    public final Handler OooOOo() {
        return Looper.myLooper() == null ? this.f66898OooO0o0 : new Handler(Looper.myLooper());
    }

    public final C22177OooOooO OooOOoo(C22162OooO0oo c22162OooO0oo, zzie zzieVar, String str, Exception exc) {
        zzc.zzo("BillingClient", str, exc);
        OooOoo0(zzieVar, 7, c22162OooO0oo, C22186Oooo0oO.OooO00o(exc));
        return new C22177OooOooO(c22162OooO0oo.f66936OooO00o, c22162OooO0oo.f66938OooO0OO, new ArrayList(), new ArrayList());
    }

    public final C22162OooO0oo OooOo0() {
        int[] iArr = {0, 3};
        synchronized (this.f66893OooO00o) {
            for (int i = 0; i < 2; i++) {
                if (this.f66894OooO0O0 == iArr[i]) {
                    return C22179Oooo.f67028OooOO0;
                }
            }
            return C22179Oooo.f67027OooO0oo;
        }
    }

    public final C22162OooO0oo OooOo00(int i) {
        zzc.zzm("BillingClient", "Service connection is valid. No need to re-initialize.");
        zzhz zzhzVarZzc = zzib.zzc();
        zzhzVarZzc.zzo(6);
        zzjt zzjtVarZzc = zzjv.zzc();
        zzjtVarZzc.zzn(true);
        zzjtVarZzc.zza(i > 0);
        zzjtVarZzc.zzl(i);
        zzhzVarZzc.zzn(zzjtVarZzc);
        OooOO0((zzib) zzhzVarZzc.zze());
        return C22179Oooo.f67019OooO;
    }

    public final zzcz OooOo0O(int i) {
        zzc.zzm("BillingClient", "Already connected or not opted into auto reconnection.");
        return zzcu.zza(C22179Oooo.f67019OooO);
    }

    public final void OooOo0o() {
        if (TextUtils.isEmpty(null)) {
            this.f66899OooO0oO.getPackageName();
        }
    }

    public final void OooOoO(int i, C22162OooO0oo c22162OooO0oo, zzie zzieVar) {
        try {
            int i2 = C22186Oooo0oO.f67057OooO00o;
            OooO(C22186Oooo0oO.OooO0O0(zzieVar, i, c22162OooO0oo, null, zzil.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            zzc.zzo("BillingClient", "Unable to log.", th);
        }
    }

    public final C22194OoooOOo OooOoO0(C22162OooO0oo c22162OooO0oo, zzie zzieVar, String str, Exception exc) {
        OooOoo0(zzieVar, 9, c22162OooO0oo, C22186Oooo0oO.OooO00o(exc));
        zzc.zzo("BillingClient", str, exc);
        return new C22194OoooOOo(c22162OooO0oo, (ArrayList) null);
    }

    public final void OooOoOO(zzie zzieVar, C22162OooO0oo c22162OooO0oo, long j) {
        try {
            int i = C22186Oooo0oO.f67057OooO00o;
            try {
                this.f66900OooO0oo.OooO0O0(C22186Oooo0oO.OooO0O0(zzieVar, 2, c22162OooO0oo, null, zzil.BROADCAST_ACTION_UNSPECIFIED), this.f66903OooOO0o, j);
            } catch (Throwable th) {
                zzc.zzo("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            zzc.zzo("BillingClient", "Unable to log.", th2);
        }
    }

    public final void OooOoo(zzie zzieVar, C22162OooO0oo c22162OooO0oo, long j, boolean z) {
        try {
            int i = C22186Oooo0oO.f67057OooO00o;
            try {
                this.f66900OooO0oo.OooO0Oo(C22186Oooo0oO.OooO0O0(zzieVar, 2, c22162OooO0oo, null, zzil.BROADCAST_ACTION_UNSPECIFIED), this.f66903OooOO0o, j, z);
            } catch (Throwable th) {
                zzc.zzo("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            zzc.zzo("BillingClient", "Unable to log.", th2);
        }
    }

    public final void OooOoo0(zzie zzieVar, int i, C22162OooO0oo c22162OooO0oo, String str) {
        try {
            int i2 = C22186Oooo0oO.f67057OooO00o;
            OooO(C22186Oooo0oO.OooO0O0(zzieVar, i, c22162OooO0oo, str, zzil.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            zzc.zzo("BillingClient", "Unable to log.", th);
        }
    }

    public final void OooOooO(zzie zzieVar, C22162OooO0oo c22162OooO0oo, String str, long j, boolean z) {
        try {
            int i = C22186Oooo0oO.f67057OooO00o;
            try {
                this.f66900OooO0oo.OooO0Oo(C22186Oooo0oO.OooO0O0(zzieVar, 2, c22162OooO0oo, str, zzil.BROADCAST_ACTION_UNSPECIFIED), this.f66903OooOO0o, j, z);
            } catch (Throwable th) {
                zzc.zzo("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            zzc.zzo("BillingClient", "Unable to log.", th2);
        }
    }

    public final void OooOooo(final C22162OooO0oo c22162OooO0oo) {
        if (Thread.interrupted()) {
            return;
        }
        this.f66898OooO0o0.post(new Runnable() { // from class: com.android.billingclient.api.OooOOoo
            @Override // java.lang.Runnable
            public final void run() {
                C22159OooO0Oo c22159OooO0Oo = this.f66992OooOo0o;
                C22162OooO0oo c22162OooO0oo2 = c22162OooO0oo;
                if (c22159OooO0Oo.f66897OooO0o.f67071OooO0O0 != null) {
                    c22159OooO0Oo.f66897OooO0o.f67071OooO0O0.OooO00o(c22162OooO0oo2, null);
                } else {
                    zzc.zzn("BillingClient", "No valid listener is set in BroadcastManager");
                }
            }
        });
    }

    public C22159OooO0Oo(OooOO0 oooOO02, Context context, OooO0O0.OooO00o oooO00o) {
        long jNextLong = new Random().nextLong();
        this.f66918OooOoOO = Long.valueOf(jNextLong);
        this.f66919OooOoo0 = com.google.android.gms.internal.play_billing.zzaz.zza();
        this.f66895OooO0OO = "8.0.0";
        String strOooOo = OooOo();
        this.f66896OooO0Oo = strOooOo;
        this.f66899OooO0oO = context.getApplicationContext();
        zziq zziqVarZzc = zzis.zzc();
        zziqVarZzc.zzs("8.0.0");
        if (strOooOo != null) {
            zziqVarZzc.zzt(strOooOo);
        }
        zziqVarZzc.zzq(this.f66899OooO0oO.getPackageName());
        zziqVarZzc.zzn(jNextLong);
        oooO00o.getClass();
        zziqVarZzc.zzr(false);
        zziqVarZzc.zza(Build.VERSION.SDK_INT);
        zziqVarZzc.zzp(772604006L);
        try {
            zziqVarZzc.zzl(this.f66899OooO0oO.getPackageManager().getPackageInfo(this.f66899OooO0oO.getPackageName(), 0).versionCode);
        } catch (Throwable th) {
            zzc.zzo("BillingClient", "Error getting app version code.", th);
        }
        this.f66900OooO0oo = new C22190OoooO00(this.f66899OooO0oO, (zzis) zziqVarZzc.zze());
        zzc.zzn("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f66897OooO0o = new C22196OoooOoO(this.f66899OooO0oO, null, this.f66900OooO0oo);
        this.f66911OooOo = oooOO02;
        this.f66899OooO0oO.getPackageName();
    }
}

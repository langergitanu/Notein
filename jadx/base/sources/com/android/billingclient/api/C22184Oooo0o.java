package com.android.billingclient.api;

import Oooo.C20813OooO0o0;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import androidx.core.util.Consumer;
import androidx.fragment.app.ActivityC21897OooOo0;
import com.android.billingclient.api.OooO0O0;
import com.google.android.gms.internal.play_billing.zzau;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzcu;
import com.google.android.gms.internal.play_billing.zzcz;
import com.google.android.gms.internal.play_billing.zzhx;
import com.google.android.gms.internal.play_billing.zzib;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzil;
import com.google.android.gms.internal.play_billing.zzp;
import com.google.android.gms.internal.play_billing.zzr;
import com.google.android.gms.internal.play_billing.zzu;
import com.orion.notein.data.repo.transactions.OooO;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: com.android.billingclient.api.Oooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C22184Oooo0o extends C22159OooO0Oo {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final Context f67051OooOoo;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public volatile int f67052OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public volatile zzau f67053OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public volatile ServiceConnectionC22185Oooo0o0 f67054Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public volatile ScheduledExecutorService f67055Oooo00O;

    public C22184Oooo0o(OooOO0 oooOO02, Context context, OooO0O0.OooO00o oooO00o) {
        super(oooOO02, context, oooO00o);
        this.f67052OooOooO = 0;
        this.f67051OooOoo = context;
    }

    @Override // com.android.billingclient.api.C22159OooO0Oo
    public final void OooO00o(final C20813OooO0o0 c20813OooO0o0, final OooO00o oooO00o) {
        Oooo0(3, new Consumer() { // from class: com.android.billingclient.api.Oooo00o
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                oooO00o.OooO00o((C22162OooO0oo) obj);
            }
        }, new Runnable() { // from class: com.android.billingclient.api.Oooo0
            @Override // java.lang.Runnable
            public final void run() {
                super/*com.android.billingclient.api.OooO0Oo*/.OooO00o(c20813OooO0o0, oooO00o);
            }
        });
    }

    @Override // com.android.billingclient.api.C22159OooO0Oo
    public final void OooO0O0() {
        synchronized (this) {
            Oooo00o(27);
            try {
                try {
                    if (this.f67054Oooo000 != null && this.f67053OooOooo != null) {
                        zzc.zzm("BillingClientTesting", "Unbinding from Billing Override Service.");
                        this.f67051OooOoo.unbindService(this.f67054Oooo000);
                        this.f67054Oooo000 = new ServiceConnectionC22185Oooo0o0(this);
                    }
                    this.f67053OooOooo = null;
                    if (this.f67055Oooo00O != null) {
                        this.f67055Oooo00O.shutdownNow();
                        this.f67055Oooo00O = null;
                    }
                } catch (RuntimeException e) {
                    zzc.zzo("BillingClientTesting", "There was an exception while ending Billing Override Service connection!", e);
                }
                this.f67052OooOooO = 3;
            } catch (Throwable th) {
                this.f67052OooOooO = 3;
                throw th;
            }
        }
        super.OooO0O0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.billingclient.api.C22159OooO0Oo
    public final C22162OooO0oo OooO0OO(ActivityC21897OooOo0 activityC21897OooOo0, C22161OooO0oO c22161OooO0oO) {
        int iIntValue = 0;
        try {
            iIntValue = ((Integer) Oooo000(2).get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e) {
            Oooo00O(28, C22179Oooo.f67035OooOOo, zzie.BILLING_OVERRIDE_SERVICE_CALL_TIMEOUT);
            zzc.zzo("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e);
        } catch (Exception e2) {
            if (e2 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            Oooo00O(28, C22179Oooo.f67035OooOOo, zzie.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION);
            zzc.zzo("BillingClientTesting", "An error occurred while retrieving billing override.", e2);
        }
        if (iIntValue > 0) {
            C22162OooO0oo c22162OooO0ooOooO00o = C22179Oooo.OooO00o(iIntValue, "Billing override value was set by a license tester.");
            Oooo00O(2, c22162OooO0ooOooO00o, zzie.LICENSE_TESTER_BILLING_OVERRIDE);
            OooOooo(c22162OooO0ooOooO00o);
            return c22162OooO0ooOooO00o;
        }
        try {
            return super.OooO0OO(activityC21897OooOo0, c22161OooO0oO);
        } catch (Exception e3) {
            zzie zzieVar = zzie.BILLING_OVERRIDE_SERVICE_FALLBACK_ERROR;
            C22162OooO0oo c22162OooO0oo = C22179Oooo.f67027OooO0oo;
            Oooo00O(2, c22162OooO0oo, zzieVar);
            zzc.zzo("BillingClientTesting", "An internal error occurred.", e3);
            return c22162OooO0oo;
        }
    }

    @Override // com.android.billingclient.api.C22159OooO0Oo
    public final void OooO0Oo(final OooOOO oooOOO, final OooO.OooO00o oooO00o) {
        Oooo0(7, new Consumer() { // from class: com.android.billingclient.api.OooOooo
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                OooOOOO oooOOOO = new OooOOOO(new ArrayList(), new ArrayList());
                oooO00o.OooO00o((C22162OooO0oo) obj, oooOOOO);
            }
        }, new Runnable() { // from class: com.android.billingclient.api.Oooo000
            @Override // java.lang.Runnable
            public final void run() {
                super/*com.android.billingclient.api.OooO0Oo*/.OooO0Oo(oooOOO, oooO00o);
            }
        });
    }

    @Override // com.android.billingclient.api.C22159OooO0Oo
    public final void OooO0o0(OooO0o oooO0o) {
        synchronized (this) {
            if (Oooo0o0()) {
                zzc.zzm("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
                Oooo00o(26);
            } else if (this.f67052OooOooO == 1) {
                zzc.zzn("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
            } else if (this.f67052OooOooO == 3) {
                zzc.zzn("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
                Oooo00O(26, C22179Oooo.OooO00o(-1, "Billing Override Service connection is disconnected."), zzie.BILLING_CLIENT_CLOSED);
            } else {
                this.f67052OooOooO = 1;
                zzc.zzm("BillingClientTesting", "Starting Billing Override Service setup.");
                this.f67054Oooo000 = new ServiceConnectionC22185Oooo0o0(this);
                Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
                intent.setPackage("com.google.android.apps.play.billingtestcompanion");
                Context context = this.f67051OooOoo;
                List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
                zzie zzieVar = zzie.REASON_UNSPECIFIED;
                if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                    zzieVar = zzie.INTENT_SERVICE_NOT_FOUND;
                } else {
                    ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                    if (serviceInfo != null) {
                        String str = serviceInfo.packageName;
                        String str2 = serviceInfo.name;
                        if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                            zzieVar = zzie.BILLING_SERVICE_BLOCKED;
                            zzc.zzn("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                        } else {
                            ComponentName componentName = new ComponentName(str, str2);
                            Intent intent2 = new Intent(intent);
                            intent2.setComponent(componentName);
                            if (context.bindService(intent2, this.f67054Oooo000, 1)) {
                                zzc.zzm("BillingClientTesting", "Billing Override Service was bonded successfully.");
                            } else {
                                zzieVar = zzie.BILLING_SERVICE_BLOCKED;
                                zzc.zzn("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                            }
                        }
                    }
                }
                this.f67052OooOooO = 0;
                zzc.zzm("BillingClientTesting", "Billing Override Service unavailable on device.");
                Oooo00O(26, C22179Oooo.OooO00o(2, "Billing Override Service unavailable on device."), zzieVar);
            }
        }
        OooOOO0(oooO0o, 0);
    }

    public final void Oooo0(int i, Consumer consumer, Runnable runnable) {
        ScheduledExecutorService scheduledExecutorService;
        zzcz zzczVarOooo000 = Oooo000(i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (this) {
            try {
                if (this.f67055Oooo00O == null) {
                    this.f67055Oooo00O = Executors.newSingleThreadScheduledExecutor();
                }
                scheduledExecutorService = this.f67055Oooo00O;
            } catch (Throwable th) {
                throw th;
            }
        }
        zzcu.zzc(zzcu.zzb(zzczVarOooo000, 28500L, timeUnit, scheduledExecutorService), new C22182Oooo0O0(this, i, consumer, runnable), OooO0o());
    }

    public final zzcz Oooo000(final int i) {
        if (Oooo0o0()) {
            return zzu.zza(new zzr() { // from class: com.android.billingclient.api.Oooo00O
                @Override // com.google.android.gms.internal.play_billing.zzr
                public final Object zza(zzp zzpVar) {
                    C22184Oooo0o c22184Oooo0o = this.f67043OooO00o;
                    int i2 = i;
                    try {
                        if (c22184Oooo0o.f67053OooOooo == null) {
                            throw null;
                        }
                        c22184Oooo0o.f67053OooOooo.zza(c22184Oooo0o.f67051OooOoo.getPackageName(), i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? i2 != 6 ? "QUERY_PRODUCT_DETAILS_ASYNC" : "START_CONNECTION" : "IS_FEATURE_SUPPORTED" : "CONSUME_ASYNC" : "ACKNOWLEDGE_PURCHASE" : "LAUNCH_BILLING_FLOW", new BinderC22183Oooo0OO(zzpVar));
                        return "billingOverrideService.getBillingOverride";
                    } catch (Exception e) {
                        c22184Oooo0o.Oooo00O(28, C22179Oooo.f67035OooOOo, zzie.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION);
                        zzc.zzo("BillingClientTesting", "An error occurred while retrieving billing override.", e);
                        zzpVar.zzb(0);
                        return "billingOverrideService.getBillingOverride";
                    }
                }
            });
        }
        zzc.zzn("BillingClientTesting", "Billing Override Service is not ready.");
        Oooo00O(28, C22179Oooo.OooO00o(-1, "Billing Override Service connection is disconnected."), zzie.BILLING_OVERRIDE_SERVICE_CONNECTION_NOT_READY);
        return zzcu.zza(0);
    }

    public final void Oooo00O(int i, C22162OooO0oo c22162OooO0oo, zzie zzieVar) {
        int i2 = C22186Oooo0oO.f67057OooO00o;
        zzhx zzhxVarOooO0O0 = C22186Oooo0oO.OooO0O0(zzieVar, i, c22162OooO0oo, null, zzil.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(zzhxVarOooO0O0, "ApiFailure should not be null");
        this.f66900OooO0oo.OooO00o(zzhxVarOooO0O0);
    }

    public final void Oooo00o(int i) {
        int i2 = C22186Oooo0oO.f67057OooO00o;
        zzib zzibVarOooO0OO = C22186Oooo0oO.OooO0OO(i, zzil.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(zzibVarOooO0OO, "ApiSuccess should not be null");
        C22190OoooO00 c22190OoooO00 = this.f66900OooO0oo;
        c22190OoooO00.getClass();
        try {
            c22190OoooO00.OooO0oO(zzibVarOooO0OO, c22190OoooO00.f67059OooO0O0);
        } catch (Throwable th) {
            zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }

    public final synchronized boolean Oooo0o0() {
        if (this.f67052OooOooO == 2 && this.f67053OooOooo != null) {
            if (this.f67054Oooo000 != null) {
                return true;
            }
        }
        return false;
    }

    public C22184Oooo0o(OooOO0 oooOO02, Context context, OooOOO0 oooOOO0, OooO0O0.OooO00o oooO00o) {
        super(oooOO02, context, oooOOO0, oooO00o);
        this.f67052OooOooO = 0;
        this.f67051OooOoo = context;
    }
}

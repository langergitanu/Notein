package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzal;
import com.google.android.gms.internal.play_billing.zzam;
import com.google.android.gms.internal.play_billing.zzbi;
import com.google.android.gms.internal.play_billing.zzbl;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzhv;
import com.google.android.gms.internal.play_billing.zzhx;
import com.google.android.gms.internal.play_billing.zzhz;
import com.google.android.gms.internal.play_billing.zzib;
import com.google.android.gms.internal.play_billing.zzic;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzig;
import com.google.android.gms.internal.play_billing.zzij;
import com.google.android.gms.internal.play_billing.zzjg;
import com.google.android.gms.internal.play_billing.zzji;
import com.google.android.gms.internal.play_billing.zzjm;
import com.google.android.gms.internal.play_billing.zzjo;
import com.google.android.gms.internal.play_billing.zzjs;
import com.google.android.gms.internal.play_billing.zzjt;
import com.google.android.gms.internal.play_billing.zzjv;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.android.billingclient.api.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC22175OooOoo implements ServiceConnection {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final zzbi f67008OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final OooO0o f67009OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final int f67010OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final zzbi f67011OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C22159OooO0Oo f67012OooOoOO;

    public /* synthetic */ ServiceConnectionC22175OooOoo(C22159OooO0Oo c22159OooO0Oo, OooO0o oooO0o, int i) {
        Objects.requireNonNull(c22159OooO0Oo);
        this.f67012OooOoOO = c22159OooO0Oo;
        zzbl zzblVar = c22159OooO0Oo.f66919OooOoo0;
        this.f67008OooOo = zzbi.zzc(zzblVar);
        this.f67011OooOoO0 = zzbi.zzc(zzblVar);
        this.f67009OooOo0o = oooO0o;
        this.f67010OooOoO = i;
    }

    public final Long OooO00o(boolean z) {
        if (z) {
            zzbi zzbiVar = this.f67008OooOo;
            if (!zzbiVar.zzg()) {
                return null;
            }
            zzbiVar.zzf();
            return Long.valueOf(zzbiVar.zza(TimeUnit.MILLISECONDS));
        }
        zzbi zzbiVar2 = this.f67011OooOoO0;
        if (!zzbiVar2.zzg()) {
            return null;
        }
        zzbiVar2.zzf();
        return Long.valueOf(zzbiVar2.zza(TimeUnit.MILLISECONDS));
    }

    public final void OooO0O0(C22162OooO0oo c22162OooO0oo, zzie zzieVar, String str, boolean z) {
        try {
            zzic zzicVarZzc = zzig.zzc();
            zzicVarZzc.zzo(c22162OooO0oo.f66936OooO00o);
            zzicVarZzc.zzl(c22162OooO0oo.f66938OooO0OO);
            zzicVarZzc.zzn(zzieVar);
            if (str != null) {
                zzicVarZzc.zza(str);
            }
            Long lOooO00o = OooO00o(z);
            C22159OooO0Oo c22159OooO0Oo = this.f67012OooOoOO;
            if (!z) {
                zzjm zzjmVarZzc = zzjo.zzc();
                zzjmVarZzc.zza(zzicVarZzc);
                if (lOooO00o != null) {
                    zzjmVarZzc.zzl(lOooO00o.longValue());
                }
                c22159OooO0Oo.f66900OooO0oo.OooO0o0((zzjo) zzjmVarZzc.zze());
                return;
            }
            zzjt zzjtVarZzc = zzjv.zzc();
            int i = this.f67010OooOoO;
            zzjtVarZzc.zza(i > 0);
            zzjtVarZzc.zzl(i);
            if (lOooO00o != null) {
                zzjtVarZzc.zzm(lOooO00o.longValue());
            }
            zzhv zzhvVarZzc = zzhx.zzc();
            zzhvVarZzc.zzl(zzicVarZzc);
            zzhvVarZzc.zzp(6);
            zzhvVarZzc.zzo(zzjtVarZzc);
            c22159OooO0Oo.OooO((zzhx) zzhvVarZzc.zze());
        } catch (Throwable th) {
            zzc.zzo("BillingClient", "Unable to log.", th);
        }
    }

    public final void OooO0OO(C22162OooO0oo c22162OooO0oo) {
        C22159OooO0Oo c22159OooO0Oo = this.f67012OooOoOO;
        synchronized (c22159OooO0Oo.f66893OooO00o) {
            try {
                if (c22159OooO0Oo.f66894OooO0O0 == 3) {
                    return;
                }
                try {
                    this.f67009OooOo0o.OooO00o(c22162OooO0oo);
                } catch (Throwable th) {
                    zzc.zzo("BillingClient", "Exception while calling onBillingSetupFinished.", th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        boolean z;
        boolean z2;
        zzc.zzn("BillingClient", "Billing service died.");
        try {
            C22159OooO0Oo c22159OooO0Oo = this.f67012OooOoOO;
            synchronized (c22159OooO0Oo.f66893OooO00o) {
                z = true;
                z2 = c22159OooO0Oo.f66894OooO0O0 == 1;
            }
            if (z2) {
                C22190OoooO00 c22190OoooO00 = c22159OooO0Oo.f66900OooO0oo;
                zzhv zzhvVarZzc = zzhx.zzc();
                zzhvVarZzc.zzp(6);
                zzic zzicVarZzc = zzig.zzc();
                zzicVarZzc.zzn(zzie.BINDING_DIED);
                zzhvVarZzc.zzl(zzicVarZzc);
                zzjt zzjtVarZzc = zzjv.zzc();
                int i = this.f67010OooOoO;
                if (i <= 0) {
                    z = false;
                }
                zzjtVarZzc.zza(z);
                zzjtVarZzc.zzl(i);
                zzhvVarZzc.zzo(zzjtVarZzc);
                c22190OoooO00.OooO00o((zzhx) zzhvVarZzc.zze());
            } else {
                C22190OoooO00 c22190OoooO002 = c22159OooO0Oo.f66900OooO0oo;
                zzij zzijVarZzd = zzij.zzd();
                c22190OoooO002.getClass();
                try {
                    zzjg zzjgVarZzc = zzji.zzc();
                    zzjgVarZzc.zzn(c22190OoooO002.f67059OooO0O0);
                    zzjgVarZzc.zzm(zzijVarZzd);
                    c22190OoooO002.f67060OooO0OO.OooO00o((zzji) zzjgVarZzc.zze());
                } catch (Throwable th) {
                    zzc.zzo("BillingLogger", "Unable to log.", th);
                }
            }
        } catch (Throwable th2) {
            zzc.zzo("BillingClient", "Unable to log.", th2);
        }
        C22159OooO0Oo c22159OooO0Oo2 = this.f67012OooOoOO;
        synchronized (c22159OooO0Oo2.f66893OooO00o) {
            if (c22159OooO0Oo2.f66894OooO0O0 != 3 && c22159OooO0Oo2.f66894OooO0O0 != 0) {
                c22159OooO0Oo2.OooOO0o(0);
                c22159OooO0Oo2.OooOOO();
                try {
                    this.f67009OooOo0o.OooO0O0();
                } catch (Throwable th3) {
                    zzc.zzo("BillingClient", "Exception while calling onBillingServiceDisconnected.", th3);
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzc.zzm("BillingClient", "Billing service connected.");
        C22159OooO0Oo c22159OooO0Oo = this.f67012OooOoOO;
        synchronized (c22159OooO0Oo.f66893OooO00o) {
            try {
                if (c22159OooO0Oo.f66894OooO0O0 == 3) {
                    return;
                }
                c22159OooO0Oo.f66892OooO = zzal.zzs(iBinder);
                if (C22159OooO0Oo.OooO0oO(new Callable() { // from class: com.android.billingclient.api.OooOoOO
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Bundle bundleOooO00o;
                        zzam zzamVar;
                        ServiceConnectionC22175OooOoo serviceConnectionC22175OooOoo = this.f67007OooOo0o;
                        C22159OooO0Oo c22159OooO0Oo2 = serviceConnectionC22175OooOoo.f67012OooOoOO;
                        synchronized (c22159OooO0Oo2.f66893OooO00o) {
                            try {
                                if (c22159OooO0Oo2.f66894OooO0O0 == 3) {
                                    return null;
                                }
                                boolean z = c22159OooO0Oo2.f66894OooO0O0 == 1;
                                if (TextUtils.isEmpty(null)) {
                                    bundleOooO00o = null;
                                } else {
                                    bundleOooO00o = C22172OooOoO.OooO00o("accountName", null);
                                    zzc.zzc(bundleOooO00o, c22159OooO0Oo2.f66895OooO0OO, c22159OooO0Oo2.f66896OooO0Oo, c22159OooO0Oo2.f66918OooOoOO.longValue());
                                }
                                zzie zzieVar = zzie.REASON_UNSPECIFIED;
                                synchronized (c22159OooO0Oo2.f66893OooO00o) {
                                    zzamVar = c22159OooO0Oo2.f66892OooO;
                                }
                                if (zzamVar == null) {
                                    C22159OooO0Oo c22159OooO0Oo3 = serviceConnectionC22175OooOoo.f67012OooOoOO;
                                    c22159OooO0Oo3.OooOO0o(0);
                                    int i = serviceConnectionC22175OooOoo.f67010OooOoO;
                                    zzie zzieVar2 = zzie.SERVICE_RESET_TO_NULL;
                                    C22162OooO0oo c22162OooO0oo = C22179Oooo.f67028OooOO0;
                                    c22159OooO0Oo3.OooOO0O(i, c22162OooO0oo, zzieVar2);
                                    serviceConnectionC22175OooOoo.OooO0OO(c22162OooO0oo);
                                    return null;
                                }
                                C22159OooO0Oo c22159OooO0Oo4 = serviceConnectionC22175OooOoo.f67012OooOoOO;
                                String packageName = c22159OooO0Oo4.f66899OooO0oO.getPackageName();
                                int iZzw = 3;
                                int i2 = 25;
                                while (true) {
                                    if (i2 < 3) {
                                        i2 = 0;
                                        break;
                                    }
                                    if (bundleOooO00o == null) {
                                        try {
                                            iZzw = zzamVar.zzw(i2, packageName, "subs");
                                        } catch (Exception e) {
                                            zzc.zzo("BillingClient", "Exception while checking if billing is supported; try to reconnect", e);
                                            boolean z2 = e instanceof DeadObjectException;
                                            zzie zzieVar3 = z2 ? zzie.IS_BILLING_SUPPORTED_DEAD_OBJECT_EXCEPTION : e instanceof RemoteException ? zzie.IS_BILLING_SUPPORTED_REMOTE_EXCEPTION : e instanceof SecurityException ? zzie.IS_BILLING_SUPPORTED_SECURITY_EXCEPTION : zzie.IS_BILLING_SUPPORTED_SERVICE_CALL_EXCEPTION;
                                            String strOooO00o = zzieVar3.equals(zzie.IS_BILLING_SUPPORTED_SERVICE_CALL_EXCEPTION) ? C22186Oooo0oO.OooO00o(e) : null;
                                            serviceConnectionC22175OooOoo.f67012OooOoOO.OooOO0o(0);
                                            serviceConnectionC22175OooOoo.OooO0O0(z2 ? C22179Oooo.f67028OooOO0 : C22179Oooo.f67027OooO0oo, zzieVar3, strOooO00o, z);
                                            serviceConnectionC22175OooOoo.OooO0OO(z2 ? C22179Oooo.f67028OooOO0 : C22179Oooo.f67027OooO0oo);
                                        }
                                    } else {
                                        iZzw = zzamVar.zzc(i2, packageName, "subs", bundleOooO00o);
                                    }
                                    if (iZzw == 0) {
                                        zzc.zzm("BillingClient", "highestLevelSupportedForSubs: " + i2);
                                        break;
                                    }
                                    i2--;
                                }
                                c22159OooO0Oo4.f66902OooOO0O = i2 >= 3;
                                if (i2 < 3) {
                                    zzieVar = zzie.SUBSCRIPTIONS_NOT_SUPPORTED;
                                    zzc.zzm("BillingClient", "In-app billing API does not support subscription on this device.");
                                }
                                int i3 = 25;
                                while (true) {
                                    if (i3 < 3) {
                                        break;
                                    }
                                    iZzw = bundleOooO00o == null ? zzamVar.zzw(i3, packageName, "inapp") : zzamVar.zzc(i3, packageName, "inapp", bundleOooO00o);
                                    if (iZzw == 0) {
                                        c22159OooO0Oo4.f66903OooOO0o = i3;
                                        zzc.zzm("BillingClient", "mHighestLevelSupportedForInApp: " + i3);
                                        break;
                                    }
                                    i3--;
                                }
                                int i4 = c22159OooO0Oo4.f66903OooOO0o;
                                c22159OooO0Oo4.f66903OooOO0o = i4;
                                c22159OooO0Oo4.f66915OooOo0o = i4 >= 26;
                                c22159OooO0Oo4.f66914OooOo0O = i4 >= 24;
                                c22159OooO0Oo4.f66912OooOo0 = i4 >= 21;
                                c22159OooO0Oo4.f66913OooOo00 = i4 >= 20;
                                c22159OooO0Oo4.f66910OooOOoo = i4 >= 19;
                                c22159OooO0Oo4.f66908OooOOo = i4 >= 17;
                                c22159OooO0Oo4.f66909OooOOo0 = i4 >= 16;
                                c22159OooO0Oo4.f66907OooOOOo = i4 >= 15;
                                c22159OooO0Oo4.f66906OooOOOO = i4 >= 14;
                                c22159OooO0Oo4.f66904OooOOO = i4 >= 9;
                                c22159OooO0Oo4.f66905OooOOO0 = i4 >= 6;
                                if (i4 < 3) {
                                    zzieVar = zzie.ONE_TIME_PRODUCT_NOT_SUPPORTED;
                                    zzc.zzn("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                }
                                C22159OooO0Oo.OooOOo0(c22159OooO0Oo4, iZzw);
                                if (iZzw != 0) {
                                    C22162OooO0oo c22162OooO0oo2 = C22179Oooo.f67021OooO0O0;
                                    serviceConnectionC22175OooOoo.OooO0O0(c22162OooO0oo2, zzieVar, null, z);
                                    serviceConnectionC22175OooOoo.OooO0OO(c22162OooO0oo2);
                                    return null;
                                }
                                try {
                                    Long lOooO00o = serviceConnectionC22175OooOoo.OooO00o(z);
                                    if (z) {
                                        zzhz zzhzVarZzc = zzib.zzc();
                                        zzhzVarZzc.zzo(6);
                                        zzjt zzjtVarZzc = zzjv.zzc();
                                        int i5 = serviceConnectionC22175OooOoo.f67010OooOoO;
                                        zzjtVarZzc.zza(i5 > 0);
                                        zzjtVarZzc.zzl(i5);
                                        if (lOooO00o != null) {
                                            zzjtVarZzc.zzm(lOooO00o.longValue());
                                        }
                                        C22159OooO0Oo c22159OooO0Oo5 = serviceConnectionC22175OooOoo.f67012OooOoOO;
                                        zzhzVarZzc.zzn(zzjtVarZzc);
                                        c22159OooO0Oo5.OooOO0((zzib) zzhzVarZzc.zze());
                                    } else {
                                        zzjm zzjmVarZzc = zzjo.zzc();
                                        zzic zzicVarZzc = zzig.zzc();
                                        zzicVarZzc.zzo(0);
                                        zzjmVarZzc.zza(zzicVarZzc);
                                        if (lOooO00o != null) {
                                            zzjmVarZzc.zzl(lOooO00o.longValue());
                                        }
                                        serviceConnectionC22175OooOoo.f67012OooOoOO.f66900OooO0oo.OooO0o0((zzjo) zzjmVarZzc.zze());
                                    }
                                } catch (Throwable th) {
                                    zzc.zzo("BillingClient", "Unable to log.", th);
                                }
                                serviceConnectionC22175OooOoo.OooO0OO(C22179Oooo.f67019OooO);
                                return null;
                            } finally {
                            }
                        }
                    }
                }, 30000L, new Runnable() { // from class: com.android.billingclient.api.OooOoo0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ServiceConnectionC22175OooOoo serviceConnectionC22175OooOoo = this.f67013OooOo0o;
                        C22159OooO0Oo c22159OooO0Oo2 = serviceConnectionC22175OooOoo.f67012OooOoOO;
                        c22159OooO0Oo2.OooOO0o(0);
                        zzie zzieVar = zzie.EXECUTE_ASYNC_TIMEOUT;
                        C22162OooO0oo c22162OooO0oo = C22179Oooo.f67029OooOO0O;
                        c22159OooO0Oo2.OooOO0O(serviceConnectionC22175OooOoo.f67010OooOoO, c22162OooO0oo, zzieVar);
                        serviceConnectionC22175OooOoo.OooO0OO(c22162OooO0oo);
                    }
                }, c22159OooO0Oo.OooOOo(), c22159OooO0Oo.OooO0o()) == null) {
                    int i = this.f67010OooOoO;
                    C22162OooO0oo c22162OooO0ooOooOo0 = c22159OooO0Oo.OooOo0();
                    c22159OooO0Oo.OooOO0O(i, c22162OooO0ooOooOo0, zzie.MISSING_RESULT_FROM_EXECUTE_ASYNC);
                    OooO0OO(c22162OooO0ooOooOo0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        boolean z;
        boolean z2;
        zzc.zzn("BillingClient", "Billing service disconnected.");
        try {
            C22159OooO0Oo c22159OooO0Oo = this.f67012OooOoOO;
            synchronized (c22159OooO0Oo.f66893OooO00o) {
                z = true;
                z2 = c22159OooO0Oo.f66894OooO0O0 == 1;
            }
            if (z2) {
                C22190OoooO00 c22190OoooO00 = c22159OooO0Oo.f66900OooO0oo;
                zzhv zzhvVarZzc = zzhx.zzc();
                zzhvVarZzc.zzp(6);
                zzic zzicVarZzc = zzig.zzc();
                zzicVarZzc.zzn(zzie.SERVICE_DISCONNECTED);
                zzhvVarZzc.zzl(zzicVarZzc);
                zzjt zzjtVarZzc = zzjv.zzc();
                int i = this.f67010OooOoO;
                if (i <= 0) {
                    z = false;
                }
                zzjtVarZzc.zza(z);
                zzjtVarZzc.zzl(i);
                zzhvVarZzc.zzo(zzjtVarZzc);
                c22190OoooO00.OooO00o((zzhx) zzhvVarZzc.zze());
            } else {
                C22190OoooO00 c22190OoooO002 = c22159OooO0Oo.f66900OooO0oo;
                zzjs zzjsVarZzd = zzjs.zzd();
                c22190OoooO002.getClass();
                if (zzjsVarZzd != null) {
                    try {
                        zzjg zzjgVarZzc = zzji.zzc();
                        zzjgVarZzc.zzn(c22190OoooO002.f67059OooO0O0);
                        zzjgVarZzc.zzp(zzjsVarZzd);
                        c22190OoooO002.f67060OooO0OO.OooO00o((zzji) zzjgVarZzc.zze());
                    } catch (Throwable th) {
                        zzc.zzo("BillingLogger", "Unable to log.", th);
                    }
                }
            }
        } catch (Throwable th2) {
            zzc.zzo("BillingClient", "Unable to log.", th2);
        }
        zzbi zzbiVar = this.f67011OooOoO0;
        zzbiVar.zzd();
        zzbiVar.zze();
        C22159OooO0Oo c22159OooO0Oo2 = this.f67012OooOoOO;
        synchronized (c22159OooO0Oo2.f66893OooO00o) {
            try {
                if (c22159OooO0Oo2.f66894OooO0O0 == 3) {
                    return;
                }
                c22159OooO0Oo2.OooOO0o(0);
                try {
                    this.f67009OooOo0o.OooO0O0();
                } catch (Throwable th3) {
                    zzc.zzo("BillingClient", "Exception while calling onBillingServiceDisconnected.", th3);
                }
            } finally {
            }
        }
    }
}

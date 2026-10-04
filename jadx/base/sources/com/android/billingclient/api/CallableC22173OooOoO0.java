package com.android.billingclient.api;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.text.TextUtils;
import com.android.billingclient.api.C22162OooO0oo;
import com.google.android.gms.internal.play_billing.zzam;
import com.google.android.gms.internal.play_billing.zzbt;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzie;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONException;

/* JADX INFO: renamed from: com.android.billingclient.api.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC22173OooOoO0 implements Callable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f67004OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C22160OooO0o0 f67005OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C22159OooO0Oo f67006OooOoO0;

    public CallableC22173OooOoO0(C22159OooO0Oo c22159OooO0Oo, C22160OooO0o0 c22160OooO0o0, String str) {
        this.f67005OooOo0o = c22160OooO0o0;
        this.f67004OooOo = str;
        Objects.requireNonNull(c22159OooO0Oo);
        this.f67006OooOoO0 = c22159OooO0Oo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0081, code lost:
    
        r0 = r2.OooOoO0(com.android.billingclient.api.C22179Oooo.f67028OooOO0, com.google.android.gms.internal.play_billing.zzie.SERVICE_RESET_TO_NULL, "Service has been reset to null", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008b, code lost:
    
        r17 = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0235  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() throws Exception {
        Exception exc;
        C22194OoooOOo c22194OoooOOoOooOoO0;
        ArrayList arrayList;
        zzam zzamVar;
        int i;
        int i2;
        Bundle bundleZzi;
        C22162OooO0oo c22162OooO0ooOooO00o;
        zzie zzieVar;
        C22159OooO0Oo c22159OooO0Oo = this.f67006OooOoO0;
        Exception exc2 = null;
        int i3 = 9;
        if (!c22159OooO0Oo.OooOOOO()) {
            zzie zzieVar2 = zzie.SERVICE_CONNECTION_NOT_READY;
            C22162OooO0oo c22162OooO0oo = C22179Oooo.f67028OooOO0;
            c22159OooO0Oo.OooOoO(9, c22162OooO0oo, zzieVar2);
            this.f67005OooOo0o.OooO00o(c22162OooO0oo, zzbt.zzk());
            return null;
        }
        String str = this.f67004OooOo;
        if (TextUtils.isEmpty(str)) {
            zzc.zzn("BillingClient", "Please provide a valid product type.");
            zzie zzieVar3 = zzie.EMPTY_PRODUCT_TYPE;
            C22162OooO0oo c22162OooO0oo2 = C22179Oooo.f67025OooO0o0;
            c22159OooO0Oo.OooOoO(9, c22162OooO0oo2, zzieVar3);
            this.f67005OooOo0o.OooO00o(c22162OooO0oo2, zzbt.zzk());
            return null;
        }
        zzc.zzm("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList2 = new ArrayList();
        boolean z = c22159OooO0Oo.f66904OooOOO;
        c22159OooO0Oo.f66911OooOo.getClass();
        c22159OooO0Oo.f66911OooOo.getClass();
        long jLongValue = c22159OooO0Oo.f66918OooOoOO.longValue();
        Bundle bundle = new Bundle();
        zzc.zzc(bundle, c22159OooO0Oo.f66895OooO0OO, c22159OooO0Oo.f66896OooO0Oo, jLongValue);
        if (z) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        String string = null;
        while (true) {
            try {
                synchronized (c22159OooO0Oo.f66893OooO00o) {
                    try {
                        zzamVar = c22159OooO0Oo.f66892OooO;
                    } catch (Throwable th) {
                        th = th;
                        exc = exc2;
                        while (true) {
                            try {
                                try {
                                    throw th;
                                } catch (DeadObjectException e) {
                                    e = e;
                                    c22194OoooOOoOooOoO0 = c22159OooO0Oo.OooOoO0(C22179Oooo.f67028OooOO0, zzie.GET_PURCHASE_SERVICE_CALL_EXCEPTION, "Got exception trying to get purchases try to reconnect", e);
                                    arrayList = (ArrayList) c22194OoooOOoOooOoO0.f67065OooO00o;
                                    if (arrayList != null) {
                                    }
                                    return exc;
                                } catch (Exception e2) {
                                    e = e2;
                                    c22194OoooOOoOooOoO0 = c22159OooO0Oo.OooOoO0(C22179Oooo.f67027OooO0oo, zzie.GET_PURCHASE_SERVICE_CALL_EXCEPTION, "Got exception trying to get purchases try to reconnect", e);
                                    arrayList = (ArrayList) c22194OoooOOoOooOoO0.f67065OooO00o;
                                    if (arrayList != null) {
                                    }
                                    return exc;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                }
                if (zzamVar == null) {
                    break;
                }
                if (c22159OooO0Oo.f66904OooOOO) {
                    if (c22159OooO0Oo.f66915OooOo0o) {
                        i2 = 26;
                    } else if (c22159OooO0Oo.f66914OooOo0O) {
                        i2 = 24;
                    } else if (c22159OooO0Oo.f66910OooOOoo) {
                        i2 = 19;
                    } else {
                        i = i3;
                        bundleZzi = zzamVar.zzi(i, c22159OooO0Oo.f66899OooO0oO.getPackageName(), str, string, bundle);
                    }
                    i = i2;
                    bundleZzi = zzamVar.zzi(i, c22159OooO0Oo.f66899OooO0oO.getPackageName(), str, string, bundle);
                } else {
                    bundleZzi = zzamVar.zzh(3, c22159OooO0Oo.f66899OooO0oO.getPackageName(), str, string);
                }
                C22162OooO0oo c22162OooO0oo3 = C22179Oooo.f67027OooO0oo;
                if (bundleZzi == null) {
                    zzc.zzn("BillingClient", "getPurchase() got null owned items list");
                    zzieVar = zzie.NULL_OWNED_ITEMS_LIST;
                } else {
                    int iZzb = zzc.zzb(bundleZzi, "BillingClient");
                    String strZzj = zzc.zzj(bundleZzi, "BillingClient");
                    C22162OooO0oo.OooO00o OooO00o2 = C22162OooO0oo.OooO00o();
                    OooO00o2.f66939OooO00o = iZzb;
                    OooO00o2.f66941OooO0OO = strZzj;
                    c22162OooO0ooOooO00o = OooO00o2.OooO00o();
                    if (iZzb != 0) {
                        zzc.zzn("BillingClient", "getPurchase() failed. Response code: " + iZzb);
                        zzieVar = zzie.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
                    } else if (bundleZzi.containsKey("INAPP_PURCHASE_ITEM_LIST") && bundleZzi.containsKey("INAPP_PURCHASE_DATA_LIST") && bundleZzi.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                        ArrayList<String> stringArrayList = bundleZzi.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                        ArrayList<String> stringArrayList2 = bundleZzi.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        ArrayList<String> stringArrayList3 = bundleZzi.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                        if (stringArrayList == null) {
                            zzc.zzn("BillingClient", "Bundle returned from getPurchase() contains null SKUs list.");
                            zzieVar = zzie.NULL_SKUS_LIST;
                        } else if (stringArrayList2 == null) {
                            zzc.zzn("BillingClient", "Bundle returned from getPurchase() contains null purchases list.");
                            zzieVar = zzie.NULL_PURCHASES_LIST;
                        } else if (stringArrayList3 == null) {
                            zzc.zzn("BillingClient", "Bundle returned from getPurchase() contains null signatures list.");
                            zzieVar = zzie.NULL_SIGNATURES_LIST;
                        } else {
                            c22162OooO0ooOooO00o = C22179Oooo.f67019OooO;
                            zzieVar = zzie.REASON_UNSPECIFIED;
                        }
                    } else {
                        zzc.zzn("BillingClient", "Bundle returned from getPurchase() doesn't contain required fields.");
                        zzieVar = zzie.MISSING_REQUIRED_PURCHASE_KEY;
                    }
                    if (c22162OooO0ooOooO00o == C22179Oooo.f67019OooO) {
                        c22194OoooOOoOooOoO0 = c22159OooO0Oo.OooOoO0(c22162OooO0ooOooO00o, zzieVar, "Purchase bundle invalid", exc2);
                        break;
                    }
                    ArrayList<String> stringArrayList4 = bundleZzi.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                    ArrayList<String> stringArrayList5 = bundleZzi.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                    ArrayList<String> stringArrayList6 = bundleZzi.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                    int i4 = 0;
                    boolean z2 = false;
                    while (i4 < stringArrayList5.size()) {
                        String str2 = stringArrayList5.get(i4);
                        exc = exc2;
                        String str3 = stringArrayList6.get(i4);
                        ArrayList<String> arrayList3 = stringArrayList4;
                        zzc.zzm("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList4.get(i4))));
                        try {
                            Purchase purchase = new Purchase(str2, str3);
                            if (TextUtils.isEmpty(purchase.OooO0OO())) {
                                zzc.zzn("BillingClient", "BUG: empty/null token!");
                                z2 = true;
                            }
                            arrayList2.add(purchase);
                            i4++;
                            exc2 = exc;
                            stringArrayList4 = arrayList3;
                        } catch (JSONException e3) {
                            c22194OoooOOoOooOoO0 = c22159OooO0Oo.OooOoO0(C22179Oooo.f67027OooO0oo, zzie.ERROR_DECODING_PURCHASE_DATA, "Got an exception trying to decode the purchase!", e3);
                        }
                    }
                    exc = exc2;
                    if (z2) {
                        i3 = 9;
                        c22159OooO0Oo.OooOoO(9, c22162OooO0oo3, zzie.EMPTY_PURCHASE_TOKEN);
                    } else {
                        i3 = 9;
                    }
                    string = bundleZzi.getString("INAPP_CONTINUATION_TOKEN");
                    zzc.zzm("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
                    if (TextUtils.isEmpty(string)) {
                        c22194OoooOOoOooOoO0 = new C22194OoooOOo(C22179Oooo.f67019OooO, arrayList2);
                        break;
                    }
                    exc2 = exc;
                }
                c22162OooO0ooOooO00o = c22162OooO0oo3;
                if (c22162OooO0ooOooO00o == C22179Oooo.f67019OooO) {
                }
            } catch (DeadObjectException e4) {
                e = e4;
                exc = exc2;
            } catch (Exception e5) {
                e = e5;
                exc = exc2;
            }
        }
        arrayList = (ArrayList) c22194OoooOOoOooOoO0.f67065OooO00o;
        if (arrayList != null) {
            this.f67005OooOo0o.OooO00o((C22162OooO0oo) c22194OoooOOoOooOoO0.f67066OooO0O0, arrayList);
        } else {
            this.f67005OooOo0o.OooO00o((C22162OooO0oo) c22194OoooOOoOooOoO0.f67066OooO0O0, zzbt.zzk());
        }
        return exc;
    }
}

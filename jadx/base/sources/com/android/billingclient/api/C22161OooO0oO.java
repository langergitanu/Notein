package com.android.billingclient.api;

import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzbg;
import com.google.android.gms.internal.play_billing.zzbt;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.android.billingclient.api.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C22161OooO0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f66921OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooO0OO f66922OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public zzbt f66923OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ArrayList f66924OooO0Oo;

    /* JADX INFO: renamed from: com.android.billingclient.api.OooO0oO$OooO00o */
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public ArrayList f66925OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public OooO0OO.OooO00o f66926OooO0O0;

        public final C22161OooO0oO OooO00o() {
            ArrayList arrayList = this.f66925OooO00o;
            boolean z = (arrayList == null || arrayList.isEmpty()) ? false : true;
            if (!z) {
                throw new IllegalArgumentException("Details of the products must be provided.");
            }
            ArrayList arrayList2 = this.f66925OooO00o;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (((OooO0O0) it.next()) == null) {
                        throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                    }
                }
            }
            C22161OooO0oO c22161OooO0oO = new C22161OooO0oO();
            c22161OooO0oO.f66921OooO00o = z && !((OooO0O0) this.f66925OooO00o.get(0)).f66927OooO00o.f66946OooO0O0.optString("packageName").isEmpty();
            OooO0OO.OooO00o oooO00o = this.f66926OooO0O0;
            boolean z2 = true;
            if (TextUtils.isEmpty(oooO00o.f66933OooO00o) && TextUtils.isEmpty(null)) {
                z2 = false;
            }
            boolean zIsEmpty = TextUtils.isEmpty(null);
            if (z2 && !zIsEmpty) {
                throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
            }
            if (!oooO00o.f66934OooO0O0 && !z2 && zIsEmpty) {
                throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
            }
            OooO0OO oooO0OO = new OooO0OO();
            oooO0OO.f66931OooO00o = oooO00o.f66933OooO00o;
            oooO0OO.f66932OooO0O0 = oooO00o.f66935OooO0OO;
            c22161OooO0oO.f66922OooO0O0 = oooO0OO;
            c22161OooO0oO.f66924OooO0Oo = new ArrayList();
            ArrayList arrayList3 = this.f66925OooO00o;
            c22161OooO0oO.f66923OooO0OO = arrayList3 != null ? zzbt.zzj(arrayList3) : zzbt.zzk();
            return c22161OooO0oO;
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.OooO0oO$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooOO0O f66927OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f66928OooO0O0;

        /* JADX INFO: renamed from: com.android.billingclient.api.OooO0oO$OooO0O0$OooO00o */
        public static class OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public OooOO0O f66929OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public String f66930OooO0O0;

            public final OooO0O0 OooO00o() {
                zzbg.zzc(this.f66929OooO00o, "ProductDetails is required for constructing ProductDetailsParams.");
                return new OooO0O0(this);
            }

            public final void OooO0O0(OooOO0O oooOO0O) {
                this.f66929OooO00o = oooOO0O;
                if (oooOO0O.OooO00o() != null) {
                    oooOO0O.OooO00o().getClass();
                    String str = oooOO0O.OooO00o().f66957OooO0Oo;
                    if (str != null) {
                        this.f66930OooO0O0 = str;
                    }
                }
            }
        }

        public /* synthetic */ OooO0O0(OooO00o oooO00o) {
            this.f66927OooO00o = oooO00o.f66929OooO00o;
            this.f66928OooO0O0 = oooO00o.f66930OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.OooO0oO$OooO0OO */
    public static class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f66931OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f66932OooO0O0;

        /* JADX INFO: renamed from: com.android.billingclient.api.OooO0oO$OooO0OO$OooO00o */
        public static class OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public String f66933OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public boolean f66934OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public int f66935OooO0OO;
        }
    }

    public C22161OooO0oO() {
        throw null;
    }

    public static OooO00o OooO00o() {
        OooO00o oooO00o = new OooO00o();
        OooO0OO.OooO00o oooO00o2 = new OooO0OO.OooO00o();
        oooO00o2.f66935OooO0OO = 0;
        oooO00o2.f66934OooO0O0 = true;
        oooO00o.f66926OooO0O0 = oooO00o2;
        return oooO00o;
    }
}

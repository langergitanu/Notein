package oooo00o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.network.embedded.C18437z2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: renamed from: oooo00o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C35203OooO00o {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Object f126398OooO0o = new Object();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static C35203OooO00o f126399OooO0oO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f126400OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HashMap<BroadcastReceiver, ArrayList<OooO0OO>> f126401OooO0O0 = new HashMap<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final HashMap<String, ArrayList<OooO0OO>> f126402OooO0OO = new HashMap<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayList<OooO0O0> f126403OooO0Oo = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final HandlerC20389OooO00o f126404OooO0o0;

    /* JADX INFO: renamed from: oooo00o.OooO00o$OooO00o, reason: collision with other inner class name */
    public class HandlerC20389OooO00o extends Handler {
        public HandlerC20389OooO00o(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int size;
            OooO0O0[] oooO0O0Arr;
            if (message.what != 1) {
                super.handleMessage(message);
                return;
            }
            C35203OooO00o c35203OooO00o = C35203OooO00o.this;
            while (true) {
                synchronized (c35203OooO00o.f126401OooO0O0) {
                    try {
                        size = c35203OooO00o.f126403OooO0Oo.size();
                        if (size <= 0) {
                            return;
                        }
                        oooO0O0Arr = new OooO0O0[size];
                        c35203OooO00o.f126403OooO0Oo.toArray(oooO0O0Arr);
                        c35203OooO00o.f126403OooO0Oo.clear();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                for (int i = 0; i < size; i++) {
                    OooO0O0 oooO0O0 = oooO0O0Arr[i];
                    int size2 = oooO0O0.f126407OooO0O0.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        OooO0OO oooO0OO = oooO0O0.f126407OooO0O0.get(i2);
                        if (!oooO0OO.f126411OooO0Oo) {
                            oooO0OO.f126409OooO0O0.onReceive(c35203OooO00o.f126400OooO00o, oooO0O0.f126406OooO00o);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: oooo00o.OooO00o$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Intent f126406OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ArrayList<OooO0OO> f126407OooO0O0;

        public OooO0O0(Intent intent, ArrayList<OooO0OO> arrayList) {
            this.f126406OooO00o = intent;
            this.f126407OooO0O0 = arrayList;
        }
    }

    /* JADX INFO: renamed from: oooo00o.OooO00o$OooO0OO */
    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final IntentFilter f126408OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final BroadcastReceiver f126409OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f126410OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f126411OooO0Oo;

        public OooO0OO(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f126408OooO00o = intentFilter;
            this.f126409OooO0O0 = broadcastReceiver;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f126409OooO0O0);
            sb.append(" filter=");
            sb.append(this.f126408OooO00o);
            if (this.f126411OooO0Oo) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    public C35203OooO00o(Context context) {
        this.f126400OooO00o = context;
        this.f126404OooO0o0 = new HandlerC20389OooO00o(context.getMainLooper());
    }

    public static C35203OooO00o OooO00o(Context context) {
        C35203OooO00o c35203OooO00o;
        synchronized (f126398OooO0o) {
            try {
                if (f126399OooO0oO == null) {
                    f126399OooO0oO = new C35203OooO00o(context.getApplicationContext());
                }
                c35203OooO00o = f126399OooO0oO;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c35203OooO00o;
    }

    public final void OooO0O0(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f126401OooO0O0) {
            try {
                OooO0OO oooO0OO = new OooO0OO(intentFilter, broadcastReceiver);
                ArrayList<OooO0OO> arrayList = this.f126401OooO0O0.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList<>(1);
                    this.f126401OooO0O0.put(broadcastReceiver, arrayList);
                }
                arrayList.add(oooO0OO);
                for (int i = 0; i < intentFilter.countActions(); i++) {
                    String action = intentFilter.getAction(i);
                    ArrayList<OooO0OO> arrayList2 = this.f126402OooO0OO.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>(1);
                        this.f126402OooO0OO.put(action, arrayList2);
                    }
                    arrayList2.add(oooO0OO);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean OooO0OO(Intent intent) {
        ArrayList<OooO0OO> arrayList;
        synchronized (this.f126401OooO0O0) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f126400OooO00o.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z = (intent.getFlags() & 8) != 0;
                if (z) {
                    Log.v("LocalBroadcastManager", "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList<OooO0OO> arrayList2 = this.f126402OooO0OO.get(intent.getAction());
                if (arrayList2 != null) {
                    if (z) {
                        Log.v("LocalBroadcastManager", "Action list: " + arrayList2);
                    }
                    ArrayList arrayList3 = null;
                    int i = 0;
                    while (i < arrayList2.size()) {
                        OooO0OO oooO0OO = arrayList2.get(i);
                        if (z) {
                            Log.v("LocalBroadcastManager", "Matching against filter " + oooO0OO.f126408OooO00o);
                        }
                        if (oooO0OO.f126410OooO0OO) {
                            if (z) {
                                Log.v("LocalBroadcastManager", "  Filter's target already added");
                            }
                            arrayList = arrayList2;
                        } else {
                            int iMatch = oooO0OO.f126408OooO00o.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                            if (iMatch >= 0) {
                                if (z) {
                                    StringBuilder sb = new StringBuilder();
                                    arrayList = arrayList2;
                                    sb.append("  Filter matched!  match=0x");
                                    sb.append(Integer.toHexString(iMatch));
                                    Log.v("LocalBroadcastManager", sb.toString());
                                } else {
                                    arrayList = arrayList2;
                                }
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(oooO0OO);
                                oooO0OO.f126410OooO0OO = true;
                            } else {
                                arrayList = arrayList2;
                                if (z) {
                                    Log.v("LocalBroadcastManager", "  Filter did not match: " + (iMatch != -4 ? iMatch != -3 ? iMatch != -2 ? iMatch != -1 ? "unknown reason" : C18437z2.f56754h : Constants.ScionAnalytics.MessageType.DATA_MESSAGE : "action" : "category"));
                                }
                            }
                        }
                        i++;
                        arrayList2 = arrayList;
                    }
                    if (arrayList3 != null) {
                        for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                            ((OooO0OO) arrayList3.get(i2)).f126410OooO0OO = false;
                        }
                        this.f126403OooO0Oo.add(new OooO0O0(intent, arrayList3));
                        if (!this.f126404OooO0o0.hasMessages(1)) {
                            this.f126404OooO0o0.sendEmptyMessage(1);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO0Oo(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f126401OooO0O0) {
            try {
                ArrayList<OooO0OO> arrayListRemove = this.f126401OooO0O0.remove(broadcastReceiver);
                if (arrayListRemove == null) {
                    return;
                }
                for (int size = arrayListRemove.size() - 1; size >= 0; size--) {
                    OooO0OO oooO0OO = arrayListRemove.get(size);
                    oooO0OO.f126411OooO0Oo = true;
                    for (int i = 0; i < oooO0OO.f126408OooO00o.countActions(); i++) {
                        String action = oooO0OO.f126408OooO00o.getAction(i);
                        ArrayList<OooO0OO> arrayList = this.f126402OooO0OO.get(action);
                        if (arrayList != null) {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                OooO0OO oooO0OO2 = arrayList.get(size2);
                                if (oooO0OO2.f126409OooO0O0 == broadcastReceiver) {
                                    oooO0OO2.f126411OooO0Oo = true;
                                    arrayList.remove(size2);
                                }
                            }
                            if (arrayList.size() <= 0) {
                                this.f126402OooO0OO.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

package o00Oo0oO;

import OooOooO.C20741OooOOoo;
import Oooo0oO.o0Oo0oo;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.alipay.android.app.IAlixPay;
import com.alipay.android.app.IRemoteServiceCallback;
import com.alipay.sdk.app.APayEntranceActivity;
import com.alipay.sdk.app.AlipayResultActivity;
import com.alipay.share.sdk.Constant;
import com.aspose.words.WarningType;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.microsoft.identity.common.internal.p590ui.webview.ProcessUtil;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import o00OOOoO.C25016OooO00o;
import o00Oo0o0.C25047OooO00o;
import o00Oo0oO.OooOOOO;
import o00oO0O.o0OoOo0;
import oOo000Oo.C34449Oooo0oo;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Activity f85062OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public volatile IAlixPay f85063OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f85064OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO0OO f85065OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C25047OooO00o f85067OooO0o0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f85066OooO0o = false;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public String f85068OooO0oO = null;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public String f85069OooO0oo = null;

    public class OooO00o extends IRemoteServiceCallback.Stub {
        public OooO00o() {
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public final int getVersion() throws RemoteException {
            return 4;
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public final boolean isHideLoadingScreen() throws RemoteException {
            return false;
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public final void payEnd(boolean z, String str) throws RemoteException {
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public final void r03(String str, String str2, Map map) throws RemoteException {
            OooOO0 oooOO02 = OooOO0.this;
            o00OOOOo.OooO00o.OooO0OO(oooOO02.f85067OooO0o0, "wlt", str, str2);
            if (TextUtils.equals(str2, "ActivityStartSuccess")) {
                OooO0OO oooO0OO = oooOO02.f85065OooO0Oo;
                if (oooO0OO != null) {
                    oooO0OO.mo80618a();
                }
                C25047OooO00o c25047OooO00o = oooOO02.f85067OooO0o0;
                if (c25047OooO00o != null) {
                    c25047OooO00o.f85041OooOO0 = true;
                }
            }
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public final void startActivity(String str, String str2, int i, Bundle bundle) throws RemoteException {
            OooOO0 oooOO02 = OooOO0.this;
            Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
            if (bundle == null) {
                bundle = new Bundle();
            }
            try {
                bundle.putInt("CallingPid", i);
                intent.putExtras(bundle);
            } catch (Exception e) {
                o00OOOOo.OooO00o.OooO0Oo(oooOO02.f85067OooO0o0, "biz", "ErrIntentEx", e);
            }
            intent.setClassName(str, str2);
            try {
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                o00OOOOo.OooO00o.OooO0OO(oooOO02.f85067OooO0o0, "biz", "isFg", runningAppProcessInfo.processName + "|" + runningAppProcessInfo.importance + "|");
            } catch (Throwable unused) {
            }
            try {
                if (oooOO02.f85062OooO00o == null) {
                    o00OOOOo.OooO00o.OooO0oO(oooOO02.f85067OooO0o0, "biz", "ErrActNull", "");
                    Context context = oooOO02.f85067OooO0o0.f85035OooO0OO;
                    if (context != null) {
                        context.startActivity(intent);
                        return;
                    }
                    return;
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                oooOO02.f85062OooO00o.startActivity(intent);
                o00OOOOo.OooO00o.OooO0OO(oooOO02.f85067OooO0o0, "biz", "stAct2", "" + (SystemClock.elapsedRealtime() - jElapsedRealtime));
            } catch (Throwable th) {
                o00OOOOo.OooO00o.OooO0Oo(oooOO02.f85067OooO0o0, "biz", "ErrActEx", th);
                throw th;
            }
        }
    }

    public class OooO0O0 implements ServiceConnection {
        public OooO0O0() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            o00OOOOo.OooO00o.OooO0O0("srvCon", OooOO0.this.f85067OooO0o0);
            OooOO0.this.getClass();
            synchronized (IAlixPay.class) {
                OooOO0.this.f85063OooO0O0 = IAlixPay.Stub.asInterface(iBinder);
                OooOO0.this.getClass();
                IAlixPay.class.notify();
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            o00OOOOo.OooO00o.OooO0O0("srvDis", OooOO0.this.f85067OooO0o0);
            OooOO0.this.f85063OooO0O0 = null;
        }
    }

    public interface OooO0OO {
        /* JADX INFO: renamed from: a */
        void mo80618a();
    }

    public OooOO0(Activity activity, C25047OooO00o c25047OooO00o, OooO0OO oooO0OO) {
        this.f85062OooO00o = activity;
        this.f85067OooO0o0 = c25047OooO00o;
        this.f85065OooO0Oo = oooO0OO;
    }

    public static boolean OooO0o0(Context context, String str, C25047OooO00o c25047OooO00o) {
        try {
            Intent intent = new Intent();
            intent.setClassName(str, "com.alipay.android.app.flybird.ui.window.FlyBirdWindowActivity");
            if (intent.resolveActivityInfo(context.getPackageManager(), 0) != null) {
                return true;
            }
            o00OOOOo.OooO00o.OooO0O0("BSADetectFail", c25047OooO00o);
            return false;
        } catch (Throwable th) {
            o00OOOOo.OooO00o.OooO0Oo(c25047OooO00o, "biz", "BSADetectFail", th);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Pair<String, Boolean> OooO00o(String str, String str2, C25047OooO00o c25047OooO00o) {
        int i;
        IRemoteServiceCallback oooO00o;
        Activity activity;
        int version;
        String strOooO0O0;
        Activity activity2;
        Activity activity3;
        Activity activity4;
        Intent intent = new Intent();
        intent.setPackage(str2);
        intent.setAction("com.eg.android.AlipayGphone.IAlixPay");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        StringBuilder sbOooO00o = o0OoOo0.OooO00o(jElapsedRealtime, "", "|");
        sbOooO00o.append(str != null ? str.length() : 0);
        o00OOOOo.OooO00o.OooO0OO(c25047OooO00o, "biz", "PgBindStarting", sbOooO00o.toString());
        o00OOOOo.OooO00o.OooO00o(this.f85062OooO00o, str, c25047OooO00o.f85036OooO0Oo, c25047OooO00o);
        try {
            try {
                if (C25016OooO00o.OooO00o().f84906OooO) {
                    o00OOOOo.OooO00o.OooO0OO(c25047OooO00o, "biz", "stSrv", "skipped");
                } else {
                    ComponentName componentNameStartService = this.f85062OooO00o.getApplication().startService(intent);
                    o00OOOOo.OooO00o.OooO0OO(c25047OooO00o, "biz", "stSrv", componentNameStartService != null ? componentNameStartService.getPackageName() : CloudMetaExtra.DEFINE_NON_PARENT_ID);
                }
            } catch (Throwable th) {
                o00OOOOo.OooO00o.OooO0Oo(c25047OooO00o, "biz", "TryStartServiceEx", th);
            }
            if (C25016OooO00o.OooO00o().f84917OooOO0o) {
                o00OOOOo.OooO00o.OooO0OO(c25047OooO00o, "biz", "bindFlg", "imp");
                i = 65;
            } else {
                i = 1;
            }
            OooO0O0 oooO0O0 = new OooO0O0();
            if (!this.f85062OooO00o.getApplicationContext().bindService(intent, oooO0O0, i)) {
                throw new Throwable("bindService fail");
            }
            synchronized (IAlixPay.class) {
                if (this.f85063OooO0O0 == null) {
                    try {
                        IAlixPay.class.wait(C25016OooO00o.OooO00o().OooO0oO());
                    } catch (InterruptedException e) {
                        o00OOOOo.OooO00o.OooO0Oo(c25047OooO00o, "biz", "BindWaitTimeoutEx", e);
                    }
                }
            }
            IAlixPay iAlixPay = this.f85063OooO0O0;
            try {
                if (iAlixPay == null) {
                    o00OOOOo.OooO00o.OooO0oO(c25047OooO00o, "biz", "ClientBindFailed", "");
                    OooOOOO.OooO0oO(this.f85062OooO00o, "bindServiceTimeout", this.f85067OooO0o0);
                    Pair<String, Boolean> pair = new Pair<>(TelemetryEventStrings.Value.FAILED, Boolean.TRUE);
                    try {
                        this.f85062OooO00o.getApplicationContext().unbindService(oooO0O0);
                    } catch (Throwable th2) {
                        C25052OooO0Oo.OooO00o(th2);
                    }
                    o00OOOOo.OooO00o.OooO0OO(c25047OooO00o, "biz", "PgBindEnd", "" + SystemClock.elapsedRealtime());
                    o00OOOOo.OooO00o.OooO00o(this.f85062OooO00o, str, c25047OooO00o.f85036OooO0Oo, c25047OooO00o);
                    this.f85063OooO0O0 = null;
                    if (this.f85064OooO0OO && (activity4 = this.f85062OooO00o) != null) {
                        activity4.setRequestedOrientation(0);
                        this.f85064OooO0OO = false;
                    }
                    return pair;
                }
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                o00OOOOo.OooO00o.OooO0OO(c25047OooO00o, "biz", "PgBinded", "" + jElapsedRealtime2);
                if (this.f85062OooO00o.getRequestedOrientation() == 0) {
                    this.f85062OooO00o.setRequestedOrientation(1);
                    this.f85064OooO0OO = true;
                }
                try {
                    version = iAlixPay.getVersion();
                } catch (Throwable th3) {
                    C25052OooO0Oo.OooO00o(th3);
                    version = 0;
                }
                oooO00o = new OooO00o();
                try {
                    if (version >= 3) {
                        iAlixPay.registerCallback03(oooO00o, str, null);
                    } else {
                        iAlixPay.registerCallback(oooO00o);
                    }
                    long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                    o00OOOOo.OooO00o.OooO0OO(c25047OooO00o, "biz", "PgBindPay", "" + jElapsedRealtime3);
                    if (version >= 3) {
                        iAlixPay.r03("biz", "bind_pay", null);
                    }
                    try {
                        if (version >= 2) {
                            HashMap<String, String> mapOooO0Oo = C25047OooO00o.OooO0Oo(c25047OooO00o);
                            mapOooO0Oo.put("ts_bind", String.valueOf(jElapsedRealtime));
                            mapOooO0Oo.put("ts_bend", String.valueOf(jElapsedRealtime2));
                            mapOooO0Oo.put("ts_pay", String.valueOf(jElapsedRealtime3));
                            strOooO0O0 = iAlixPay.pay02(str, mapOooO0Oo);
                        } else {
                            strOooO0O0 = iAlixPay.Pay(str);
                        }
                    } catch (Throwable th4) {
                        C25047OooO00o c25047OooO00o2 = this.f85067OooO0o0;
                        if (c25047OooO00o2 != null && !c25047OooO00o2.f85041OooOO0) {
                            o00OOOOo.OooO00o.OooO0Oo(c25047OooO00o, "biz", "ClientBindException", th4);
                            OooOOOO.OooO0oO(this.f85062OooO00o, "bindServiceEx", this.f85067OooO0o0);
                            if (C25016OooO00o.OooO00o().f84926OooOo0) {
                                Pair<String, Boolean> pair2 = new Pair<>(TelemetryEventStrings.Value.FAILED, Boolean.FALSE);
                                try {
                                    iAlixPay.unregisterCallback(oooO00o);
                                } catch (Throwable th5) {
                                    C25052OooO0Oo.OooO00o(th5);
                                }
                                try {
                                    this.f85062OooO00o.getApplicationContext().unbindService(oooO0O0);
                                } catch (Throwable th6) {
                                    C25052OooO0Oo.OooO00o(th6);
                                }
                                o00OOOOo.OooO00o.OooO0OO(c25047OooO00o, "biz", "PgBindEnd", "" + SystemClock.elapsedRealtime());
                                o00OOOOo.OooO00o.OooO00o(this.f85062OooO00o, str, c25047OooO00o.f85036OooO0Oo, c25047OooO00o);
                                this.f85063OooO0O0 = null;
                                if (this.f85064OooO0OO && (activity2 = this.f85062OooO00o) != null) {
                                    activity2.setRequestedOrientation(0);
                                    this.f85064OooO0OO = false;
                                }
                                return pair2;
                            }
                        }
                        strOooO0O0 = C20741OooOOoo.OooO0O0();
                    }
                    String str3 = strOooO0O0;
                    try {
                        iAlixPay.unregisterCallback(oooO00o);
                    } catch (Throwable th7) {
                        C25052OooO0Oo.OooO00o(th7);
                    }
                    try {
                        this.f85062OooO00o.getApplicationContext().unbindService(oooO0O0);
                    } catch (Throwable th8) {
                        C25052OooO0Oo.OooO00o(th8);
                    }
                    o00OOOOo.OooO00o.OooO0OO(c25047OooO00o, "biz", "PgBindEnd", "" + SystemClock.elapsedRealtime());
                    o00OOOOo.OooO00o.OooO00o(this.f85062OooO00o, str, c25047OooO00o.f85036OooO0Oo, c25047OooO00o);
                    this.f85063OooO0O0 = null;
                    if (this.f85064OooO0OO && (activity3 = this.f85062OooO00o) != null) {
                        activity3.setRequestedOrientation(0);
                        this.f85064OooO0OO = false;
                    }
                    return new Pair<>(str3, Boolean.FALSE);
                } catch (Throwable th9) {
                    th = th9;
                }
            } catch (Throwable th10) {
                th = th10;
                oooO00o = null;
            }
            try {
                o00OOOOo.OooO00o.OooO0o0(c25047OooO00o, "ClientBindFailed", th, "in_bind");
                Pair<String, Boolean> pair3 = new Pair<>(TelemetryEventStrings.Value.FAILED, Boolean.TRUE);
                if (oooO00o != null) {
                    try {
                        iAlixPay.unregisterCallback(oooO00o);
                    } catch (Throwable th11) {
                        C25052OooO0Oo.OooO00o(th11);
                    }
                }
                try {
                    this.f85062OooO00o.getApplicationContext().unbindService(oooO0O0);
                } catch (Throwable th12) {
                    C25052OooO0Oo.OooO00o(th12);
                }
                o00OOOOo.OooO00o.OooO0OO(c25047OooO00o, "biz", "PgBindEnd", "" + SystemClock.elapsedRealtime());
                o00OOOOo.OooO00o.OooO00o(this.f85062OooO00o, str, c25047OooO00o.f85036OooO0Oo, c25047OooO00o);
                this.f85063OooO0O0 = null;
                if (this.f85064OooO0OO && (activity = this.f85062OooO00o) != null) {
                    activity.setRequestedOrientation(0);
                    this.f85064OooO0OO = false;
                }
                return pair3;
            } finally {
            }
        } catch (Throwable th13) {
            o00OOOOo.OooO00o.OooO0Oo(c25047OooO00o, "biz", "ClientBindServiceFailed", th13);
            OooOOOO.OooO0oO(this.f85062OooO00o, "bindServiceFail", this.f85067OooO0o0);
            return new Pair<>(TelemetryEventStrings.Value.FAILED, Boolean.TRUE);
        }
    }

    public final String OooO0O0(String str, String str2, PackageInfo packageInfo) {
        JSONObject jSONObject;
        o00OOOOo.OooO00o.OooO0OO(this.f85067OooO0o0, "biz", "PgWltVer", o0Oo0oo.OooO0Oo(str2, "|", packageInfo != null ? packageInfo.versionName : ""));
        Activity activity = this.f85062OooO00o;
        C25047OooO00o c25047OooO00o = this.f85067OooO0o0;
        o00OOOOo.OooO00o.OooO00o(activity, str, c25047OooO00o.f85036OooO0Oo, c25047OooO00o);
        Object obj = new Object();
        String strOooO00o = OooOOOO.OooO00o(32);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        o00OOOOo.OooO00o.OooO0OO(this.f85067OooO0o0, "biz", "BSAStart", strOooO00o + "|" + jElapsedRealtime);
        C25047OooO00o c25047OooO00o2 = this.f85067OooO0o0;
        HashMap<UUID, C25047OooO00o> map = C25047OooO00o.C19671OooO00o.f85044OooO00o;
        if (c25047OooO00o2 != null && !TextUtils.isEmpty(strOooO00o)) {
            C25047OooO00o.C19671OooO00o.f85045OooO0O0.put(strOooO00o, c25047OooO00o2);
        }
        C25054OooO0oO c25054OooO0oO = new C25054OooO0oO(this, obj);
        APayEntranceActivity.f66825OooOoO.put(strOooO00o, c25054OooO0oO);
        try {
            HashMap<String, String> mapOooO0Oo = C25047OooO00o.OooO0Oo(this.f85067OooO0o0);
            mapOooO0Oo.put("ts_intent", String.valueOf(jElapsedRealtime));
            jSONObject = new JSONObject(mapOooO0Oo);
        } catch (Throwable th) {
            try {
                o00OOOOo.OooO00o.OooO0Oo(this.f85067OooO0o0, "biz", "BSALocEx", th);
                jSONObject = null;
            } catch (InterruptedException e) {
                o00OOOOo.OooO00o.OooO0Oo(this.f85067OooO0o0, "biz", "BSAWaiting", e);
                return C20741OooOOoo.OooO0OO(8000, "支付结果确认中", "");
            } catch (Throwable th2) {
                o00OOOOo.OooO00o.OooO0Oo(this.f85067OooO0o0, "biz", "BSAEx", th2);
                OooOOOO.OooO0oO(this.f85062OooO00o, "startActivityEx", this.f85067OooO0o0);
                return "scheme_failed";
            }
        }
        Intent intent = new Intent(this.f85062OooO00o, (Class<?>) APayEntranceActivity.class);
        intent.putExtra("ap_order_info", str);
        intent.putExtra("ap_target_packagename", str2);
        intent.putExtra("ap_session", strOooO00o);
        if (jSONObject != null) {
            intent.putExtra("ap_local_info", jSONObject.toString());
        }
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC25055OooO0oo(this, c25054OooO0oO), C25016OooO00o.OooO00o().OooO0oO());
        Activity activity2 = this.f85062OooO00o;
        C25047OooO00o c25047OooO00o3 = this.f85067OooO0o0;
        o00OOOOo.OooO00o.OooO00o(activity2, str, c25047OooO00o3.f85036OooO0Oo, c25047OooO00o3);
        if (C25016OooO00o.OooO00o().f84913OooO0oO) {
            new Handler(Looper.getMainLooper()).post(new OooO(this, intent, obj));
        } else {
            try {
                Activity activity3 = this.f85062OooO00o;
                if (activity3 != null) {
                    activity3.startActivity(intent);
                } else {
                    o00OOOOo.OooO00o.OooO0oO(this.f85067OooO0o0, "biz", "ErrActNull", "");
                    Context context = this.f85067OooO0o0.f85035OooO0OO;
                    if (context != null) {
                        context.startActivity(intent);
                    }
                }
            } catch (Throwable th3) {
                o00OOOOo.OooO00o.OooO0Oo(this.f85067OooO0o0, "biz", "ErrActEx", th3);
                throw th3;
            }
        }
        synchronized (obj) {
            obj.wait();
        }
        String str3 = this.f85069OooO0oo;
        String str4 = "unknown";
        try {
            String str5 = (String) C34449Oooo0oo.OooO0OO(str3, this.f85067OooO0o0).get("resultStatus");
            str4 = str5 == null ? CloudMetaExtra.DEFINE_NON_PARENT_ID : str5;
        } catch (Throwable th4) {
            o00OOOOo.OooO00o.OooO0Oo(this.f85067OooO0o0, "biz", "BSAStatEx", th4);
        }
        o00OOOOo.OooO00o.OooO0O0("BSADone-".concat(str4), this.f85067OooO0o0);
        if (!TextUtils.isEmpty(str3)) {
            return str3;
        }
        o00OOOOo.OooO00o.OooO0O0("BSAEmpty", this.f85067OooO0o0);
        return "scheme_failed";
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        if (android.text.TextUtils.equals(r0, r12[1]) != false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01e1 A[Catch: all -> 0x0202, TryCatch #3 {all -> 0x0202, blocks: (B:128:0x01db, B:130:0x01e1, B:132:0x01eb, B:134:0x01f3), top: B:224:0x01db }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x012a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0190 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x01c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:267:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079 A[Catch: all -> 0x00c8, TRY_LEAVE, TryCatch #8 {all -> 0x00c8, blocks: (B:27:0x0071, B:29:0x0079), top: B:234:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c5 A[PHI: r3
      0x00c5: PHI (r3v16 int) = (r3v0 int), (r3v0 int), (r3v17 int), (r3v0 int), (r3v0 int), (r3v18 int) binds: [B:28:0x0077, B:30:0x007d, B:217:0x00c5, B:32:0x0088, B:34:0x008e, B:260:0x00c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fe A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String OooO0OO(String str, boolean z) {
        int i;
        String str2;
        OooOOOO.OooO00o oooO00oOooO0o;
        PackageInfo packageInfo;
        boolean zContains;
        boolean zContains2;
        boolean z2;
        int i2;
        String[] strArrSplit;
        String str3;
        String str4;
        String str5;
        Activity activity;
        int iOooOOO0;
        String str6;
        String str7;
        JSONObject jSONObjectOptJSONObject;
        int i3 = 1;
        C25047OooO00o c25047OooO00o = this.f85067OooO0o0;
        try {
            ArrayList arrayList = C25016OooO00o.OooO00o().f84934OooOoo0;
            C25016OooO00o.OooO00o().getClass();
            oooO00oOooO0o = OooOOOO.OooO0o(c25047OooO00o, this.f85062OooO00o, o00OOOO0.OooO00o.f84883OooO0Oo);
            if (oooO00oOooO0o != null) {
                try {
                    if (!oooO00oOooO0o.OooO00o(c25047OooO00o)) {
                        PackageInfo packageInfo2 = oooO00oOooO0o.f85078OooO00o;
                        if (!(packageInfo2.versionCode < oooO00oOooO0o.f85079OooO0O0)) {
                            try {
                                String str8 = packageInfo2.versionName;
                                String[] strArr = OooOOOO.f85076OooO00o;
                                if (!TextUtils.equals(str8, strArr[0])) {
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    i = 1;
                    str2 = "";
                }
            }
            return TelemetryEventStrings.Value.FAILED;
        } catch (Throwable th2) {
            th = th2;
            i = 1;
            str2 = "";
            oooO00oOooO0o = null;
        }
        i3 = i;
        i = i3;
        if (c25047OooO00o != null) {
        }
        if (!z) {
        }
        if (packageInfo != null) {
        }
        if (c25047OooO00o != null) {
        }
        if (zContains2) {
        }
        o00OOOOo.OooO00o.OooO00o(this.f85062OooO00o, str, c25047OooO00o.f85036OooO0Oo, c25047OooO00o);
        if (!TelemetryEventStrings.Value.FAILED.equals(str4)) {
        }
        if (Constant.ZFB_PACKAGE_NAME.equals(oooO00oOooO0o.f85078OooO00o.packageName)) {
            try {
                str6 = o00OOOO0.OooO00o.f84883OooO0Oo.get(0).f84940OooO00o;
            } catch (Throwable unused2) {
                str6 = Constant.ZFB_PACKAGE_NAME;
            }
        } else {
            str6 = oooO00oOooO0o.f85078OooO00o.packageName;
        }
        str2 = str6;
        try {
            packageInfo = oooO00oOooO0o.f85078OooO00o;
            try {
                str7 = C25016OooO00o.OooO00o().f84922OooOOo;
                if (str7 == null) {
                    if (str7.length() > 0) {
                        try {
                            jSONObjectOptJSONObject = new JSONObject(str7).optJSONObject(str2);
                        } catch (Throwable unused3) {
                        }
                        if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() > 0) {
                            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                i = i3;
                                try {
                                    if (packageInfo.versionCode >= Integer.parseInt(next)) {
                                        try {
                                            boolean zOooO0o = C25016OooO00o.OooO00o().OooO0o(this.f85062OooO00o, Integer.parseInt(jSONObjectOptJSONObject.getString(next)));
                                            this.f85066OooO0o = zOooO0o;
                                            if (zOooO0o) {
                                                break;
                                            }
                                        } catch (Exception unused4) {
                                            continue;
                                        }
                                    }
                                    i3 = i;
                                } catch (Throwable unused5) {
                                }
                            }
                            i = i3;
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                i = 1;
                o00OOOOo.OooO00o.OooO0Oo(c25047OooO00o, "biz", "CheckClientSignEx", th);
                if (c25047OooO00o != null) {
                    String str9 = c25047OooO00o.f85039OooO0oO;
                    zContains = !TextUtils.isEmpty(str9) ? str9.toLowerCase().contains(ProcessUtil.AuthServiceProcess) : false;
                }
                if ((!z && !this.f85066OooO0o) || zContains || !OooO0o0(this.f85062OooO00o, str2, c25047OooO00o)) {
                    int i4 = packageInfo != null ? packageInfo.versionCode : 0;
                    if (c25047OooO00o != null) {
                        String str10 = c25047OooO00o.f85039OooO0oO;
                        zContains2 = !TextUtils.isEmpty(str10) ? str10.toLowerCase().contains(ProcessUtil.AuthServiceProcess) : false;
                    }
                    if (zContains2) {
                        z2 = zContains2;
                        i2 = 2;
                        if (!z2) {
                        }
                        if (oooO00oOooO0o != null) {
                        }
                        Pair<String, Boolean> pairOooO00o = OooO00o(str, str2, c25047OooO00o);
                        str4 = (String) pairOooO00o.first;
                        if (TelemetryEventStrings.Value.FAILED.equals(str4)) {
                        }
                    } else {
                        try {
                            strArrSplit = C25016OooO00o.OooO00o().f84916OooOO0O.split("\\|");
                            str3 = Build.MODEL;
                        } catch (Throwable th4) {
                            th = th4;
                            z2 = zContains2;
                            i2 = 2;
                        }
                        try {
                            if (TextUtils.isEmpty(str3)) {
                                z2 = zContains2;
                                i2 = 2;
                                if (!z2) {
                                }
                                if (oooO00oOooO0o != null) {
                                }
                                Pair<String, Boolean> pairOooO00o2 = OooO00o(str, str2, c25047OooO00o);
                                str4 = (String) pairOooO00o2.first;
                                if (TelemetryEventStrings.Value.FAILED.equals(str4)) {
                                    o00OOOOo.OooO00o.OooO0O0("BindRetry", c25047OooO00o);
                                    str4 = (String) OooO00o(str, str2, c25047OooO00o).first;
                                }
                            } else {
                                int length = strArrSplit.length;
                                i2 = 2;
                                int i5 = 0;
                                while (i5 < length) {
                                    String[] strArr2 = strArrSplit;
                                    try {
                                        String str11 = strArr2[i5];
                                        if (TextUtils.equals(str3, str11)) {
                                            z2 = zContains2;
                                        } else {
                                            z2 = zContains2;
                                            try {
                                                if (!TextUtils.equals(str11, "all")) {
                                                    i5++;
                                                    strArrSplit = strArr2;
                                                    zContains2 = z2;
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                                C25052OooO0Oo.OooO00o(th);
                                                if (!z2) {
                                                    try {
                                                        iOooOOO0 = OooOOOO.OooOOO0(str2);
                                                        o00OOOOo.OooO00o.OooO0OO(c25047OooO00o, "biz", "bindExt", "" + iOooOOO0);
                                                    } catch (Throwable unused6) {
                                                    }
                                                    if (C25016OooO00o.OooO00o().f84928OooOo0O && (iOooOOO0 & 2) == i2) {
                                                        if (oooO00oOooO0o != null) {
                                                            try {
                                                                if (C25016OooO00o.OooO00o().f84920OooOOOO) {
                                                                    OooO0Oo(oooO00oOooO0o);
                                                                }
                                                            } catch (Throwable unused7) {
                                                            }
                                                        }
                                                        o00OOOOo.OooO00o.OooO0O0("BindSkipByL", c25047OooO00o);
                                                        str4 = TelemetryEventStrings.Value.FAILED;
                                                        o00OOOOo.OooO00o.OooO00o(this.f85062OooO00o, str, c25047OooO00o.f85036OooO0Oo, c25047OooO00o);
                                                        if (!TelemetryEventStrings.Value.FAILED.equals(str4)) {
                                                            return str4;
                                                        }
                                                        if (!Constant.ZFB_PACKAGE_NAME.equals(str2)) {
                                                            o00OOOOo.OooO00o.OooO0OO(c25047OooO00o, "biz", "BSPNotStartByAlipay", str2 + "|" + i4);
                                                            return str4;
                                                        }
                                                        boolean z3 = C25016OooO00o.OooO00o().f84924OooOOoo;
                                                        if (i4 >= 460 && z3 && !z2 && (activity = this.f85062OooO00o) != null && OooO0o0(activity, str2, c25047OooO00o)) {
                                                            return OooO0O0(str, str2, packageInfo);
                                                        }
                                                        if (!C25016OooO00o.OooO00o().f84912OooO0o0) {
                                                            o00OOOOo.OooO00o.OooO0OO(c25047OooO00o, "biz", "BSPNotStartByConfig", "");
                                                            return str4;
                                                        }
                                                        if (i4 <= 125) {
                                                            o00OOOOo.OooO00o.OooO0OO(c25047OooO00o, "biz", "BSPNotStartByPkg", str2 + "|" + i4);
                                                            return str4;
                                                        }
                                                        if (C25016OooO00o.OooO00o().f84915OooOO0 && c25047OooO00o.f85037OooO0o / 100000 != 0) {
                                                            o00OOOOo.OooO00o.OooO0O0("BSPNotStartByUsr", c25047OooO00o);
                                                            return str4;
                                                        }
                                                        Activity activity2 = this.f85062OooO00o;
                                                        if (activity2 == null) {
                                                            return "scheme_failed";
                                                        }
                                                        try {
                                                            Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
                                                            intent.setClassName(str2, "com.alipay.android.msp.ui.views.MspContainerActivity");
                                                            if (intent.resolveActivityInfo(activity2.getPackageManager(), 0) == null) {
                                                                o00OOOOo.OooO00o.OooO0O0("BSPDetectFail", c25047OooO00o);
                                                                return "scheme_failed";
                                                            }
                                                            CountDownLatch countDownLatch = new CountDownLatch(i);
                                                            String strOooO00o = OooOOOO.OooO00o(32);
                                                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                                                            o00OOOOo.OooO00o.OooO0OO(c25047OooO00o, "biz", "BSPStart", strOooO00o + "|" + jElapsedRealtime);
                                                            HashMap<UUID, C25047OooO00o> map = C25047OooO00o.C19671OooO00o.f85044OooO00o;
                                                            if (!TextUtils.isEmpty(strOooO00o)) {
                                                                C25047OooO00o.C19671OooO00o.f85045OooO0O0.put(strOooO00o, c25047OooO00o);
                                                            }
                                                            AlipayResultActivity.f66829OooOo0o.put(strOooO00o, new OooO0o(this, countDownLatch));
                                                            try {
                                                                JSONObject jSONObject = new JSONObject();
                                                                jSONObject.put("sourcePid", Binder.getCallingPid());
                                                                jSONObject.put("external_info", str);
                                                                jSONObject.put("pkgName", this.f85062OooO00o.getPackageName());
                                                                jSONObject.put("session", strOooO00o);
                                                                String strEncodeToString = Base64.encodeToString(jSONObject.toString().getBytes("UTF-8"), 2);
                                                                Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("alipays").authority("platformapi").path("startapp").appendQueryParameter(RemoteConfigConstants.RequestFieldKey.APP_ID, "20000125");
                                                                builderAppendQueryParameter.appendQueryParameter("mqpSchemePay", strEncodeToString);
                                                                try {
                                                                    HashMap<String, String> mapOooO0Oo = C25047OooO00o.OooO0Oo(c25047OooO00o);
                                                                    mapOooO0Oo.put("ts_scheme", String.valueOf(jElapsedRealtime));
                                                                    builderAppendQueryParameter.appendQueryParameter("mqpLoc", new JSONObject(mapOooO0Oo).toString());
                                                                } catch (Throwable th6) {
                                                                    o00OOOOo.OooO00o.OooO0Oo(c25047OooO00o, "biz", "BSPLocEx", th6);
                                                                }
                                                                String string = builderAppendQueryParameter.build().toString();
                                                                Intent intent2 = new Intent();
                                                                intent2.setPackage(str2);
                                                                intent2.addFlags(WarningType.HINT);
                                                                intent2.setData(Uri.parse(string));
                                                                o00OOOOo.OooO00o.OooO00o(this.f85062OooO00o, str, c25047OooO00o.f85036OooO0Oo, c25047OooO00o);
                                                                this.f85062OooO00o.startActivity(intent2);
                                                                countDownLatch.await();
                                                                String str12 = this.f85068OooO0oO;
                                                                try {
                                                                    str5 = (String) C34449Oooo0oo.OooO0OO(str12, c25047OooO00o).get("resultStatus");
                                                                    if (str5 == null) {
                                                                        str5 = CloudMetaExtra.DEFINE_NON_PARENT_ID;
                                                                    }
                                                                } catch (Throwable th7) {
                                                                    o00OOOOo.OooO00o.OooO0Oo(c25047OooO00o, "biz", "BSPStatEx", th7);
                                                                    str5 = "unknown";
                                                                }
                                                                o00OOOOo.OooO00o.OooO0O0("BSPDone-".concat(str5), c25047OooO00o);
                                                                if (!TextUtils.isEmpty(str12)) {
                                                                    return str12;
                                                                }
                                                                o00OOOOo.OooO00o.OooO0O0("BSPEmpty", c25047OooO00o);
                                                                return "scheme_failed";
                                                            } catch (InterruptedException e) {
                                                                o00OOOOo.OooO00o.OooO0Oo(c25047OooO00o, "biz", "BSPWaiting", e);
                                                                return C20741OooOOoo.OooO0OO(8000, "支付结果确认中", "");
                                                            } catch (Throwable th8) {
                                                                o00OOOOo.OooO00o.OooO0Oo(c25047OooO00o, "biz", "BSPEx", th8);
                                                                return "scheme_failed";
                                                            }
                                                        } catch (Throwable th9) {
                                                            o00OOOOo.OooO00o.OooO0Oo(c25047OooO00o, "biz", "BSPDetectFail", th9);
                                                            return "scheme_failed";
                                                        }
                                                    }
                                                }
                                                if (oooO00oOooO0o != null) {
                                                    try {
                                                        if (!C25016OooO00o.OooO00o().f84918OooOOO) {
                                                            OooO0Oo(oooO00oOooO0o);
                                                        }
                                                    } catch (Throwable unused8) {
                                                    }
                                                }
                                                Pair<String, Boolean> pairOooO00o22 = OooO00o(str, str2, c25047OooO00o);
                                                str4 = (String) pairOooO00o22.first;
                                                if (TelemetryEventStrings.Value.FAILED.equals(str4) && ((Boolean) pairOooO00o22.second).booleanValue() && C25016OooO00o.OooO00o().f84919OooOOO0) {
                                                    o00OOOOo.OooO00o.OooO0O0("BindRetry", c25047OooO00o);
                                                    str4 = (String) OooO00o(str, str2, c25047OooO00o).first;
                                                }
                                                o00OOOOo.OooO00o.OooO00o(this.f85062OooO00o, str, c25047OooO00o.f85036OooO0Oo, c25047OooO00o);
                                                if (!TelemetryEventStrings.Value.FAILED.equals(str4)) {
                                                }
                                            }
                                        }
                                        if (oooO00oOooO0o != null) {
                                            try {
                                                if (C25016OooO00o.OooO00o().f84920OooOOOO) {
                                                    OooO0Oo(oooO00oOooO0o);
                                                }
                                            } catch (Throwable unused9) {
                                            }
                                        }
                                        o00OOOOo.OooO00o.OooO0O0("BindSkipByModel", c25047OooO00o);
                                    } catch (Throwable th10) {
                                        th = th10;
                                        z2 = zContains2;
                                    }
                                    str4 = TelemetryEventStrings.Value.FAILED;
                                }
                                z2 = zContains2;
                                if (!z2) {
                                }
                                if (oooO00oOooO0o != null) {
                                }
                                Pair<String, Boolean> pairOooO00o222 = OooO00o(str, str2, c25047OooO00o);
                                str4 = (String) pairOooO00o222.first;
                                if (TelemetryEventStrings.Value.FAILED.equals(str4)) {
                                }
                            }
                            if (TelemetryEventStrings.Value.FAILED.equals(str4)) {
                            }
                        } catch (Throwable th11) {
                            o00OOOOo.OooO00o.OooO0Oo(c25047OooO00o, "biz", "BindRetryEx", th11);
                        }
                        C25052OooO0Oo.OooO00o(th);
                        if (!z2) {
                        }
                        if (oooO00oOooO0o != null) {
                        }
                        Pair<String, Boolean> pairOooO00o2222 = OooO00o(str, str2, c25047OooO00o);
                        str4 = (String) pairOooO00o2222.first;
                    }
                    o00OOOOo.OooO00o.OooO00o(this.f85062OooO00o, str, c25047OooO00o.f85036OooO0Oo, c25047OooO00o);
                    if (!TelemetryEventStrings.Value.FAILED.equals(str4)) {
                    }
                }
            }
        } catch (Throwable th12) {
            th = th12;
            i = 1;
            packageInfo = null;
            o00OOOOo.OooO00o.OooO0Oo(c25047OooO00o, "biz", "CheckClientSignEx", th);
            if (c25047OooO00o != null) {
            }
            return !z ? OooO0O0(str, str2, packageInfo) : OooO0O0(str, str2, packageInfo);
            if (packageInfo != null) {
            }
            if (c25047OooO00o != null) {
            }
            if (zContains2) {
            }
            o00OOOOo.OooO00o.OooO00o(this.f85062OooO00o, str, c25047OooO00o.f85036OooO0Oo, c25047OooO00o);
            if (!TelemetryEventStrings.Value.FAILED.equals(str4)) {
            }
        }
        if (c25047OooO00o != null) {
        }
        if (!z) {
        }
        if (packageInfo != null) {
        }
        if (c25047OooO00o != null) {
        }
        if (zContains2) {
        }
        o00OOOOo.OooO00o.OooO00o(this.f85062OooO00o, str, c25047OooO00o.f85036OooO0Oo, c25047OooO00o);
        if (!TelemetryEventStrings.Value.FAILED.equals(str4)) {
        }
        str2 = str6;
        packageInfo = oooO00oOooO0o.f85078OooO00o;
        str7 = C25016OooO00o.OooO00o().f84922OooOOo;
        if (str7 == null) {
        }
        if (c25047OooO00o != null) {
        }
        if (!z) {
        }
        if (packageInfo != null) {
        }
        if (c25047OooO00o != null) {
        }
        if (zContains2) {
        }
        o00OOOOo.OooO00o.OooO00o(this.f85062OooO00o, str, c25047OooO00o.f85036OooO0Oo, c25047OooO00o);
        if (!TelemetryEventStrings.Value.FAILED.equals(str4)) {
        }
    }

    public final void OooO0Oo(OooOOOO.OooO00o oooO00o) throws InterruptedException {
        String str = oooO00o.f85078OooO00o.packageName;
        Intent intent = new Intent();
        intent.setClassName(str, "com.alipay.android.app.TransProcessPayActivity");
        try {
            this.f85062OooO00o.startActivity(intent);
        } catch (Throwable th) {
            o00OOOOo.OooO00o.OooO0Oo(this.f85067OooO0o0, "biz", "StartLaunchAppTransEx", th);
        }
        Thread.sleep(200L);
    }
}

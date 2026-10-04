package o0oooOOo;

import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.Constants;
import com.xiaomi.account.OooO00o;
import com.xiaomi.account.OooO0O0;
import java.lang.ref.WeakReference;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import o0oooOo.C31853OooO0OO;
import o0oooOo.C31856OooO0o0;
import o0oooOo0.C31858OooO00o;
import o0oooOo0.C31860OooO0OO;
import oO0oO0O0.InterfaceC34009OooO00o;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: o0oooOOo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31844OooO0OO implements InterfaceC31841OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Context f113473OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f113474OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public String f113475OooO0OO;

    /* JADX INFO: renamed from: o0oooOOo.OooO0OO$OooO00o */
    public class OooO00o extends FutureTask<Bundle> implements ServiceConnection {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final OooO0O0 f113476OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final WeakReference<Activity> f113477OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final C31845OooO0Oo f113478OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public C31849OooO0oo f113479OooOoO0;

        /* JADX INFO: renamed from: o0oooOOo.OooO0OO$OooO00o$OooO00o, reason: collision with other inner class name */
        public class CallableC20180OooO00o implements Callable<Bundle> {
            @Override // java.util.concurrent.Callable
            public final Bundle call() throws Exception {
                throw new IllegalStateException("this should never be called");
            }
        }

        /* JADX INFO: renamed from: o0oooOOo.OooO0OO$OooO00o$OooO0O0 */
        public class OooO0O0 extends OooO00o.AbstractBinderC19585OooO00o {
            public OooO0O0() {
            }

            @Override // com.xiaomi.account.OooO00o
            public final void OooOOoo(Bundle bundle) throws RemoteException {
                OooO00o.this.set(bundle);
            }

            @Override // com.xiaomi.account.OooO00o
            public final void onCancel() throws RemoteException {
                OooO00o.this.setException(new OperationCanceledException());
            }
        }

        public OooO00o(WeakReference<Activity> weakReference, C31845OooO0Oo c31845OooO0Oo) {
            super(new CallableC20180OooO00o());
            this.f113477OooOo0o = weakReference;
            this.f113478OooOoO = c31845OooO0Oo;
            this.f113476OooOo = new OooO0O0();
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0042 A[PHI: r0
          0x0042: PHI (r0v32 android.content.Intent) = (r0v4 android.content.Intent), (r0v10 android.content.Intent) binds: [B:14:0x0040, B:63:0x014a] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean OooO00o() {
            ArrayList<C31846OooO0o> arrayList;
            PackageInfo packageInfo;
            JSONObject jSONObject;
            C31844OooO0OO c31844OooO0OO = C31844OooO0OO.this;
            Context context = c31844OooO0OO.f113473OooO00o;
            Intent intent = new Intent("miui.intent.action.XIAOMI_ACCOUNT_AUTHORIZE");
            intent.setPackage("com.xiaomi.account");
            PackageManager packageManager = context.getPackageManager();
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            Intent intent2 = null;
            if (listQueryIntentServices == null || listQueryIntentServices.size() <= 0) {
                intent = new Intent("android.intent.action.XIAOMI_ACCOUNT_AUTHORIZE");
                intent.setPackage("com.xiaomi.account");
                List<ResolveInfo> listQueryIntentServices2 = packageManager.queryIntentServices(intent, 0);
                if (listQueryIntentServices2 == null || listQueryIntentServices2.size() <= 0) {
                    intent = null;
                }
            }
            if (intent != null) {
                intent2 = intent;
            } else {
                C31860OooO0OO c31860OooO0OO = new C31860OooO0OO();
                CookieHandler.setDefault(new CookieManager());
                ((CookieManager) CookieHandler.getDefault()).setCookiePolicy(CookiePolicy.ACCEPT_ORIGINAL_SERVER);
                C31858OooO00o.C20183OooO00o c20183OooO00o = new C31858OooO00o.C20183OooO00o();
                c20183OooO00o.f113554OooO0O0 = true;
                String str = C31847OooO0o0.f113508OooO00o;
                try {
                    c20183OooO00o.f113553OooO00o = new URI(str);
                    if (!TextUtils.isEmpty("platform=android")) {
                        URI uri = c20183OooO00o.f113553OooO00o;
                        String query = uri.getQuery();
                        try {
                            c20183OooO00o.f113553OooO00o = new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), query != null ? query.concat("&platform=android") : "platform=android", uri.getFragment());
                        } catch (URISyntaxException unused) {
                            throw new IllegalArgumentException("unexpected newQuery: platform=android");
                        }
                    }
                    c20183OooO00o.f113554OooO0O0 = false;
                    try {
                        jSONObject = new JSONObject(c31860OooO0OO.OooO00o(new C31858OooO00o(c20183OooO00o)).f113556OooO0O0);
                    } catch (Exception e) {
                        Log.e("OAuthServiceManager", e.toString());
                    }
                    if (jSONObject.getInt("code") == 0) {
                        JSONArray jSONArrayOptJSONArray = jSONObject.getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).optJSONArray("order");
                        arrayList = new ArrayList();
                        int length = jSONArrayOptJSONArray != null ? jSONArrayOptJSONArray.length() : 0;
                        for (int i = 0; i < length; i++) {
                            JSONObject jSONObject2 = (JSONObject) jSONArrayOptJSONArray.get(i);
                            String strOptString = jSONObject2.optString("name");
                            int iOptInt = jSONObject2.optInt("version");
                            C31846OooO0o c31846OooO0o = new C31846OooO0o();
                            c31846OooO0o.f113506OooO00o = strOptString;
                            c31846OooO0o.f113507OooO0O0 = iOptInt;
                            arrayList.add(c31846OooO0o);
                        }
                    } else {
                        arrayList = null;
                    }
                    if (arrayList == null || arrayList.size() == 0) {
                        intent = null;
                        if (intent != null) {
                        }
                    } else {
                        for (C31846OooO0o c31846OooO0o2 : arrayList) {
                            String str2 = c31846OooO0o2.f113506OooO00o;
                            int i2 = c31846OooO0o2.f113507OooO0O0;
                            PackageManager packageManager2 = context.getPackageManager();
                            try {
                                packageInfo = packageManager2.getPackageInfo(str2, 0);
                            } catch (PackageManager.NameNotFoundException e2) {
                                e2.printStackTrace();
                                packageInfo = null;
                            }
                            if (i2 <= (packageInfo != null ? packageInfo.versionCode : 0)) {
                                intent = new Intent("miui.intent.action.XIAOMI_ACCOUNT_AUTHORIZE");
                                intent.setPackage(str2);
                                List<ResolveInfo> listQueryIntentServices3 = packageManager2.queryIntentServices(intent, 0);
                                if (listQueryIntentServices3 != null && listQueryIntentServices3.size() > 0) {
                                    break;
                                }
                            }
                        }
                        intent = null;
                        if (intent != null) {
                        }
                    }
                } catch (URISyntaxException unused2) {
                    throw new IllegalArgumentException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("unexpected url: ", str));
                }
            }
            if (intent2 == null) {
                Log.i("MiuiOauth", "no xiaomi OAuth service");
                return false;
            }
            boolean zBindService = c31844OooO0OO.f113473OooO00o.bindService(intent2, this, 1);
            if (!zBindService) {
                Log.i("MiuiOauth", "bind failed");
            }
            return zBindService;
        }

        @Override // java.util.concurrent.FutureTask
        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public final void set(Bundle bundle) {
            if (bundle == null || !bundle.containsKey("extra_intent")) {
                if (this.f113479OooOoO0 != null) {
                    this.f113479OooOoO0 = null;
                    C31844OooO0OO.this.f113473OooO00o.unbindService(this);
                }
                super.set(bundle);
                return;
            }
            Intent intent = (Intent) bundle.getParcelable("extra_intent");
            if (intent == null) {
                setException(new C31853OooO0OO("intent == null"));
                return;
            }
            WeakReference<Activity> weakReference = this.f113477OooOo0o;
            if (weakReference.get() != null && (weakReference.get() == null || !weakReference.get().isFinishing())) {
                if (weakReference.get() != null) {
                    weakReference.get().startActivity(intent);
                }
            } else {
                Bundle bundle2 = new Bundle();
                bundle2.putInt("extra_error_code", -1001);
                bundle2.putString("extra_error_description", "activity is null");
                super.set(bundle2);
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            com.xiaomi.account.OooO0O0 oooO0O0;
            C31849OooO0oo c31849OooO0oo = new C31849OooO0oo();
            InterfaceC34009OooO00o interfaceC34009OooO00o = null;
            try {
                int i = OooO0O0.OooO00o.f80219OooO0o0;
                if (iBinder == null) {
                    oooO0O0 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.account.IXiaomiAuthService");
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof com.xiaomi.account.OooO0O0)) {
                        OooO0O0.OooO00o.C19587OooO00o c19587OooO00o = new OooO0O0.OooO00o.C19587OooO00o();
                        c19587OooO00o.f80220OooO0o0 = iBinder;
                        oooO0O0 = c19587OooO00o;
                    } else {
                        oooO0O0 = (com.xiaomi.account.OooO0O0) iInterfaceQueryLocalInterface;
                    }
                }
                c31849OooO0oo.f113515OooO0o0 = oooO0O0;
            } catch (SecurityException unused) {
                int i2 = InterfaceC34009OooO00o.AbstractBinderC20341OooO00o.f122306OooO0o0;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface2 = iBinder.queryLocalInterface("miui.net.IXiaomiAuthService");
                    if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof InterfaceC34009OooO00o)) {
                        InterfaceC34009OooO00o.AbstractBinderC20341OooO00o.C20342OooO00o c20342OooO00o = new InterfaceC34009OooO00o.AbstractBinderC20341OooO00o.C20342OooO00o();
                        c20342OooO00o.f122307OooO0o0 = iBinder;
                        interfaceC34009OooO00o = c20342OooO00o;
                    } else {
                        interfaceC34009OooO00o = (InterfaceC34009OooO00o) iInterfaceQueryLocalInterface2;
                    }
                }
                c31849OooO0oo.f113514OooO0o = interfaceC34009OooO00o;
            }
            this.f113479OooOoO0 = c31849OooO0oo;
            try {
                Context context = C31844OooO0OO.this.f113473OooO00o;
                c31849OooO0oo.OooOo0(this.f113476OooOo, this.f113478OooOoO);
            } catch (RemoteException e) {
                setException(e);
            } catch (C31843OooO0O0 e2) {
                setException(e2);
            } catch (C31853OooO0OO e3) {
                setException(e3);
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            this.f113479OooOoO0 = null;
            setException(new RemoteException("onServiceDisconnected"));
        }

        @Override // java.util.concurrent.FutureTask
        public final void setException(Throwable th) {
            if (this.f113479OooOoO0 != null) {
                this.f113479OooOoO0 = null;
                C31844OooO0OO.this.f113473OooO00o.unbindService(this);
            }
            super.setException(th);
        }
    }

    @Override // o0oooOOo.InterfaceC31841OooO
    public final C31856OooO0o0 OooO00o(WeakReference<Activity> weakReference, C31845OooO0Oo c31845OooO0Oo) throws Exception {
        OooO00o oooO00o = new OooO00o(weakReference, c31845OooO0Oo);
        try {
            if (oooO00o.OooO00o()) {
                try {
                    return C31856OooO0o0.OooO0OO(oooO00o.get(10L, TimeUnit.MINUTES));
                } catch (ExecutionException e) {
                    Throwable cause = e.getCause();
                    if (cause instanceof Exception) {
                        throw ((Exception) cause);
                    }
                    throw ((Error) cause);
                }
            }
        } catch (C31843OooO0O0 unused) {
        }
        Log.i("MiuiOauth", "fallBack to WebView OAuth");
        return new C31848OooO0oO(this.f113474OooO0O0, this.f113475OooO0OO).OooO00o(weakReference, c31845OooO0Oo);
    }
}

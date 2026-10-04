package com.tencent.p610mm.opensdk.diffdev.p612a;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import com.tencent.p610mm.opensdk.diffdev.IDiffDevOAuth;
import com.tencent.p610mm.opensdk.diffdev.OAuthErrCode;
import com.tencent.p610mm.opensdk.diffdev.OAuthListener;
import com.tencent.p610mm.opensdk.utils.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.mm.opensdk.diffdev.a.a */
/* JADX INFO: loaded from: classes10.dex */
public class C18916a implements IDiffDevOAuth {

    /* JADX INFO: renamed from: c */
    private AsyncTaskC18917b f58093c;

    /* JADX INFO: renamed from: a */
    private Handler f58091a = null;

    /* JADX INFO: renamed from: b */
    private List<OAuthListener> f58092b = new ArrayList();

    /* JADX INFO: renamed from: d */
    private OAuthListener f58094d = new a();

    /* JADX INFO: renamed from: com.tencent.mm.opensdk.diffdev.a.a$a */
    public class a implements OAuthListener {

        /* JADX INFO: renamed from: com.tencent.mm.opensdk.diffdev.a.a$a$a, reason: collision with other inner class name */
        public class RunnableC19584a implements Runnable {
            public RunnableC19584a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(C18916a.this.f58092b);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((OAuthListener) it.next()).onQrcodeScanned();
                }
            }
        }

        public a() {
        }

        @Override // com.tencent.p610mm.opensdk.diffdev.OAuthListener
        public void onAuthFinish(OAuthErrCode oAuthErrCode, String str) {
            Log.m80583d("MicroMsg.SDK.ListenerWrapper", "onAuthFinish, errCode = " + oAuthErrCode.toString() + ", authCode = " + str);
            C18916a.this.f58093c = null;
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(C18916a.this.f58092b);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((OAuthListener) it.next()).onAuthFinish(oAuthErrCode, str);
            }
        }

        @Override // com.tencent.p610mm.opensdk.diffdev.OAuthListener
        public void onAuthGotQrcode(String str, byte[] bArr) {
            Log.m80583d("MicroMsg.SDK.ListenerWrapper", "onAuthGotQrcode, qrcodeImgPath = " + str);
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(C18916a.this.f58092b);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((OAuthListener) it.next()).onAuthGotQrcode(str, bArr);
            }
        }

        @Override // com.tencent.p610mm.opensdk.diffdev.OAuthListener
        public void onQrcodeScanned() {
            Log.m80583d("MicroMsg.SDK.ListenerWrapper", "onQrcodeScanned");
            if (C18916a.this.f58091a != null) {
                C18916a.this.f58091a.post(new RunnableC19584a());
            }
        }
    }

    @Override // com.tencent.p610mm.opensdk.diffdev.IDiffDevOAuth
    public void addListener(OAuthListener oAuthListener) {
        if (this.f58092b.contains(oAuthListener)) {
            return;
        }
        this.f58092b.add(oAuthListener);
    }

    @Override // com.tencent.p610mm.opensdk.diffdev.IDiffDevOAuth
    public boolean auth(String str, String str2, String str3, String str4, String str5, OAuthListener oAuthListener) {
        Log.m80585i("MicroMsg.SDK.DiffDevOAuth", "start auth, appId = " + str);
        if (str == null || str.length() <= 0 || str2 == null || str2.length() <= 0) {
            Log.m80583d("MicroMsg.SDK.DiffDevOAuth", "auth fail, invalid argument, appId = " + str + ", scope = " + str2);
            return false;
        }
        if (this.f58091a == null) {
            this.f58091a = new Handler(Looper.getMainLooper());
        }
        if (!this.f58092b.contains(oAuthListener)) {
            this.f58092b.add(oAuthListener);
        }
        if (this.f58093c != null) {
            Log.m80583d("MicroMsg.SDK.DiffDevOAuth", "auth, already running, no need to start auth again");
            return true;
        }
        AsyncTaskC18917b asyncTaskC18917b = new AsyncTaskC18917b(str, str2, str3, str4, str5, this.f58094d);
        this.f58093c = asyncTaskC18917b;
        asyncTaskC18917b.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        return true;
    }

    @Override // com.tencent.p610mm.opensdk.diffdev.IDiffDevOAuth
    public void detach() {
        Log.m80585i("MicroMsg.SDK.DiffDevOAuth", "detach");
        this.f58092b.clear();
        stopAuth();
    }

    @Override // com.tencent.p610mm.opensdk.diffdev.IDiffDevOAuth
    public void removeAllListeners() {
        this.f58092b.clear();
    }

    @Override // com.tencent.p610mm.opensdk.diffdev.IDiffDevOAuth
    public void removeListener(OAuthListener oAuthListener) {
        this.f58092b.remove(oAuthListener);
    }

    @Override // com.tencent.p610mm.opensdk.diffdev.IDiffDevOAuth
    public boolean stopAuth() {
        boolean zM80575a;
        Log.m80585i("MicroMsg.SDK.DiffDevOAuth", "stopAuth");
        try {
            AsyncTaskC18917b asyncTaskC18917b = this.f58093c;
            zM80575a = asyncTaskC18917b == null ? true : asyncTaskC18917b.m80575a();
        } catch (Exception e) {
            Log.m80587w("MicroMsg.SDK.DiffDevOAuth", "stopAuth fail, ex = " + e.getMessage());
            zM80575a = false;
        }
        this.f58093c = null;
        return zM80575a;
    }
}

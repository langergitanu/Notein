package com.miui.penengine.p592a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import com.miui.penengine.p594c.C18759b;
import com.miui.penengine.p595d.C18765e;
import com.miui.penengine.p596e.C18766a;
import com.miui.penengine.p596e.C18767b;
import com.miui.penengine.p596e.C18770e;
import com.miui.penengine.p596e.C18771f;
import com.miui.penengine.p596e.C18772g;
import com.miui.penengine.p596e.C18773h;
import com.miui.penengine.p596e.C18774i;
import com.miui.penengine.p596e.C18775j;
import com.miui.penengine.p596e.InterfaceC18768c;
import com.miui.penengine.p598g.InterfaceC18786a;
import com.miui.penengine.p598g.InterfaceC18787b;
import dalvik.system.PathClassLoader;
import java.io.File;

/* JADX INFO: renamed from: com.miui.penengine.a.b */
/* JADX INFO: loaded from: classes9.dex */
public class C18756b implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: A */
    public static final String f57093A = "stylus_pencil_engine_version";

    /* JADX INFO: renamed from: B */
    public static final String f57094B = "com.xiaomi.touchservice";

    /* JADX INFO: renamed from: C */
    public static final String f57095C = "/system_ext/framework/xiaomi-pencilengine-pad.jar";

    /* JADX INFO: renamed from: D */
    public static final String f57096D = "com.xiaomi.touchservice.pencilengine.PencilEngineManagerService";

    /* JADX INFO: renamed from: m */
    public static volatile C18756b f57097m = null;

    /* JADX INFO: renamed from: n */
    public static final boolean f57098n;

    /* JADX INFO: renamed from: o */
    public static boolean f57099o = false;

    /* JADX INFO: renamed from: p */
    public static C18770e f57100p = null;

    /* JADX INFO: renamed from: q */
    public static C18771f f57101q = null;

    /* JADX INFO: renamed from: r */
    public static C18775j f57102r = null;

    /* JADX INFO: renamed from: s */
    public static InterfaceC18768c f57103s = null;

    /* JADX INFO: renamed from: t */
    public static C18774i f57104t = null;

    /* JADX INFO: renamed from: u */
    public static PathClassLoader f57105u = null;

    /* JADX INFO: renamed from: v */
    public static final int f57106v = 1;

    /* JADX INFO: renamed from: w */
    public static final int f57107w = 2;

    /* JADX INFO: renamed from: x */
    public static final int f57108x = 4;

    /* JADX INFO: renamed from: y */
    public static final String f57109y = "MI-PencilManager";

    /* JADX INFO: renamed from: z */
    public static final String f57110z = "0.3.2";

    /* JADX INFO: renamed from: a */
    public Context f57111a;

    /* JADX INFO: renamed from: c */
    public String f57113c;

    /* JADX INFO: renamed from: d */
    public boolean f57114d = false;

    /* JADX INFO: renamed from: h */
    public InterfaceC18786a f57118h = null;

    /* JADX INFO: renamed from: g */
    public int f57117g = 0;

    /* JADX INFO: renamed from: e */
    public boolean f57115e = false;

    /* JADX INFO: renamed from: f */
    public boolean f57116f = false;

    /* JADX INFO: renamed from: b */
    public Handler f57112b = new b(Looper.getMainLooper());

    /* JADX INFO: renamed from: i */
    public C18766a f57119i = new C18766a();

    /* JADX INFO: renamed from: j */
    public C18773h f57120j = new C18773h();

    /* JADX INFO: renamed from: l */
    public final c f57122l = new c();

    /* JADX INFO: renamed from: k */
    public final ServiceConnection f57121k = new a();

    /* JADX INFO: renamed from: com.miui.penengine.a.b$a */
    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C18756b.this.f57118h = InterfaceC18786a.b.m80449a(iBinder);
            try {
                iBinder.linkToDeath(C18756b.this, 0);
                C18756b.this.f57112b.sendEmptyMessage(0);
                Log.i(C18756b.f57109y, "Service connected: " + C18756b.this.f57118h);
            } catch (RemoteException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            C18756b.this.f57118h.asBinder().unlinkToDeath(C18756b.this, 0);
            C18756b.this.f57118h = null;
            Log.i(C18756b.f57109y, "Service disconnected");
        }
    }

    /* JADX INFO: renamed from: com.miui.penengine.a.b$b */
    public class b extends Handler {

        /* JADX INFO: renamed from: b */
        public static final int f57124b = 0;

        /* JADX INFO: renamed from: c */
        public static final int f57125c = 1;

        /* JADX INFO: renamed from: d */
        public static final int f57126d = 2;

        /* JADX INFO: renamed from: e */
        public static final String f57127e = "color";

        /* JADX INFO: renamed from: f */
        public static final String f57128f = "color_space";

        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 0) {
                if (i == 1) {
                    if (C18756b.this.f57119i != null) {
                        C18756b.this.f57119i.m80321a(message.getData());
                        return;
                    }
                    return;
                } else {
                    if (i != 2) {
                        return;
                    }
                    Intent intent = new Intent();
                    intent.setComponent(new ComponentName(C18756b.f57094B, C18756b.f57096D));
                    Log.i(C18756b.f57109y, "Reconnect service, is bound service = " + C18756b.this.f57111a.bindService(intent, C18756b.this.f57121k, 1));
                    return;
                }
            }
            if (C18756b.this.f57118h == null) {
                return;
            }
            try {
                C18756b c18756b = C18756b.this;
                String str = c18756b.f57113c;
                if (str != null) {
                    c18756b.f57118h.mo80448a(c18756b.f57122l, str);
                } else {
                    c18756b.f57118h.mo80447a(c18756b.f57122l);
                }
            } catch (RemoteException e) {
                Log.i(C18756b.f57109y, "Fail to register listener, " + e);
            }
            C18756b c18756b2 = C18756b.this;
            if (c18756b2.f57115e) {
                c18756b2.f57115e = false;
                C18756b.this.m80261a(true);
            }
            C18756b c18756b3 = C18756b.this;
            if (c18756b3.f57116f) {
                c18756b3.f57116f = false;
                C18756b.this.m80264b(true);
            }
        }
    }

    /* JADX INFO: renamed from: com.miui.penengine.a.b$c */
    public class c extends InterfaceC18787b.b {

        /* JADX INFO: renamed from: d */
        public static final int f57130d = 0;

        /* JADX INFO: renamed from: e */
        public static final int f57131e = 1;

        /* JADX INFO: renamed from: f */
        public static final int f57132f = 2;

        public c() {
        }

        @Override // com.miui.penengine.p598g.InterfaceC18787b
        /* JADX INFO: renamed from: a */
        public void mo80268a(int i, int i2, int i3) {
            if (i == 0) {
                Message messageObtainMessage = C18756b.this.f57112b.obtainMessage(1);
                Bundle bundle = new Bundle();
                bundle.putInt("color", i3);
                bundle.putInt("color_space", i2);
                messageObtainMessage.setData(bundle);
                messageObtainMessage.sendToTarget();
            }
        }
    }

    static {
        int i = 0;
        if (!new File(f57095C).exists()) {
            f57098n = false;
            f57103s = C18767b.m80323c();
            Log.i(f57109y, "Estimate initialization successful");
            return;
        }
        f57098n = true;
        PathClassLoader pathClassLoader = new PathClassLoader(f57095C, ClassLoader.getSystemClassLoader());
        f57105u = pathClassLoader;
        int iM80318a = C18765e.m80318a(pathClassLoader);
        if (iM80318a != 0) {
            C18759b.m80276b(f57109y, "LoadSysMotionEventInfo fail");
            i = iM80318a;
        }
        int iM80347a = C18772g.m80347a(f57105u);
        if (iM80347a != 0) {
            i |= iM80347a;
            C18759b.m80276b(f57109y, "LoadSysStrokeEstimate fail");
        }
        int iM80336a = C18770e.m80336a(f57105u);
        if (iM80336a != 0) {
            i |= iM80336a;
            C18759b.m80276b(f57109y, "LoadSysOneStroke fail");
        }
        int iM80343a = C18771f.m80343a(f57105u);
        if (iM80343a != 0) {
            i |= iM80343a;
            C18759b.m80276b(f57109y, "LoadSysRecognize fail");
        }
        int iM80351a = C18774i.m80351a(f57105u);
        if (iM80351a != 0) {
            i |= iM80351a;
            C18759b.m80276b(f57109y, "LoadPencilEngineManager fail");
        }
        if (i != 0) {
            Log.e(f57109y, "System initialization failed");
            return;
        }
        f57100p = new C18770e();
        f57101q = new C18771f();
        f57102r = new C18775j();
        f57103s = new C18772g();
        f57104t = new C18774i();
        f57099o = true;
        Log.i(f57109y, "System initialization successful");
    }

    /* JADX INFO: renamed from: j */
    public static C18775j m80260j() {
        if (f57102r == null) {
            C18759b.m80276b(f57109y, "Failed to getTouchFilmInstance");
        }
        return f57102r;
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        this.f57112b.sendEmptyMessageDelayed(2, 500L);
        Log.i(f57109y, "Service died, try to reconnect");
    }

    /* JADX INFO: renamed from: k */
    public int m80267k() {
        InterfaceC18786a interfaceC18786a = this.f57118h;
        if (interfaceC18786a == null) {
            return -1;
        }
        try {
            return interfaceC18786a.mo80445a(0, 0);
        } catch (RemoteException e) {
            Log.i(f57109y, "Fail to trigger color picking, " + e);
            return -1;
        }
    }

    /* JADX INFO: renamed from: c */
    public static C18756b m80247c() {
        if (f57097m == null) {
            synchronized (C18756b.class) {
                try {
                    if (f57097m == null) {
                        f57097m = new C18756b();
                    }
                } finally {
                }
            }
        }
        return f57097m;
    }

    /* JADX INFO: renamed from: d */
    public static C18770e m80250d() {
        return f57100p;
    }

    /* JADX INFO: renamed from: e */
    public static C18771f m80251e() {
        if (f57101q == null) {
            C18759b.m80276b(f57109y, "Failed to getRecognizeInstance");
        }
        return f57101q;
    }

    /* JADX INFO: renamed from: f */
    public static InterfaceC18768c m80253f() {
        if (f57103s == null) {
            C18759b.m80276b(f57109y, "Failed to getStrokeEstimateInstance");
        }
        return f57103s;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m80257h() {
        return f57099o && f57098n;
    }

    /* JADX INFO: renamed from: i */
    public static C18774i m80259i() {
        if (f57104t == null) {
            C18759b.m80276b(f57109y, "Failed to getSysPencilEngineManager");
        }
        return f57104t;
    }

    /* JADX INFO: renamed from: g */
    public C18773h m80266g() {
        if (this.f57114d) {
            return this.f57120j;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public C18766a m80265b() {
        if (this.f57114d) {
            return this.f57119i;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m80262a(int i) {
        synchronized (C18756b.class) {
            int i2 = (~i) & this.f57117g;
            this.f57117g = i2;
            if (i2 == 0 && this.f57114d) {
                InterfaceC18786a interfaceC18786a = this.f57118h;
                if (interfaceC18786a != null) {
                    try {
                        interfaceC18786a.mo80446a();
                        this.f57118h.asBinder().unlinkToDeath(this, 0);
                        this.f57118h = null;
                    } catch (RemoteException e) {
                        Log.i(f57109y, "Fail to unregister listener, " + e);
                    }
                }
                this.f57111a.unbindService(this.f57121k);
                this.f57114d = false;
                this.f57111a = null;
                Log.i(f57109y, "Unbound service");
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public int m80264b(boolean z) {
        InterfaceC18786a interfaceC18786a = this.f57118h;
        if (interfaceC18786a == null) {
            if (!z) {
                return 0;
            }
            this.f57116f = true;
            return 0;
        }
        try {
            return interfaceC18786a.mo80445a(2, z ? 1 : 0);
        } catch (RemoteException e) {
            Log.i(f57109y, "Fail to enable or disable touch film, " + e);
            return -1;
        }
    }

    /* JADX INFO: renamed from: a */
    public static PathClassLoader m80243a() {
        if (!f57098n || f57105u == null) {
            C18759b.m80276b(f57109y, "Failed to getClassLoader");
        }
        return f57105u;
    }

    /* JADX INFO: renamed from: a */
    public boolean m80263a(Context context, int i) {
        synchronized (C18756b.class) {
            try {
                this.f57117g = i | this.f57117g;
                boolean z = true;
                if (this.f57114d) {
                    return true;
                }
                this.f57111a = context;
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(f57094B, f57096D));
                boolean zBindService = this.f57111a.bindService(intent, this.f57121k, 1);
                String string = Settings.System.getString(this.f57111a.getContentResolver(), f57093A);
                if (string != null && string.equals(f57110z)) {
                    this.f57113c = this.f57111a.getPackageName();
                }
                this.f57114d = zBindService;
                StringBuilder sb = new StringBuilder("Is bound service = ");
                sb.append(zBindService);
                sb.append(", is support notify system = ");
                if (this.f57113c == null) {
                    z = false;
                }
                sb.append(z);
                Log.i(f57109y, sb.toString());
                return zBindService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public int m80261a(boolean z) {
        InterfaceC18786a interfaceC18786a = this.f57118h;
        if (interfaceC18786a == null) {
            if (!z) {
                return 0;
            }
            this.f57115e = true;
            return 0;
        }
        try {
            return interfaceC18786a.mo80445a(1, z ? 1 : 0);
        } catch (RemoteException e) {
            Log.i(f57109y, "Fail to enable or disable stylus posture, " + e);
            return -1;
        }
    }
}

package com.google.android.play.integrity.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.ae */
/* JADX INFO: loaded from: classes7.dex */
public final class C16365ae {

    /* JADX INFO: renamed from: a */
    private static final Map f51539a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final Context f51540b;

    /* JADX INFO: renamed from: c */
    private final C16408s f51541c;

    /* JADX INFO: renamed from: d */
    private final String f51542d;

    /* JADX INFO: renamed from: h */
    private boolean f51546h;

    /* JADX INFO: renamed from: i */
    private final Intent f51547i;

    /* JADX INFO: renamed from: j */
    private final InterfaceC16415z f51548j;

    /* JADX INFO: renamed from: n */
    private ServiceConnection f51552n;

    /* JADX INFO: renamed from: o */
    private IInterface f51553o;

    /* JADX INFO: renamed from: e */
    private final List f51543e = new ArrayList();

    /* JADX INFO: renamed from: f */
    private final Set f51544f = new HashSet();

    /* JADX INFO: renamed from: g */
    private final Object f51545g = new Object();

    /* JADX INFO: renamed from: l */
    private final IBinder.DeathRecipient f51550l = new IBinder.DeathRecipient() { // from class: com.google.android.play.integrity.internal.u
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            C16365ae.m74999k(this.f51579a);
        }
    };

    /* JADX INFO: renamed from: m */
    private final AtomicInteger f51551m = new AtomicInteger(0);

    /* JADX INFO: renamed from: k */
    private final WeakReference f51549k = new WeakReference(null);

    public C16365ae(Context context, C16408s c16408s, String str, Intent intent, InterfaceC16415z interfaceC16415z, InterfaceC16414y interfaceC16414y) {
        this.f51540b = context;
        this.f51541c = c16408s;
        this.f51542d = str;
        this.f51547i = intent;
        this.f51548j = interfaceC16415z;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m74999k(C16365ae c16365ae) {
        c16365ae.f51541c.m75061d("reportBinderDeath", new Object[0]);
        InterfaceC16414y interfaceC16414y = (InterfaceC16414y) c16365ae.f51549k.get();
        if (interfaceC16414y != null) {
            c16365ae.f51541c.m75061d("calling onBinderDied", new Object[0]);
            interfaceC16414y.m75064a();
        } else {
            c16365ae.f51541c.m75061d("%s : Binder has died.", c16365ae.f51542d);
            Iterator it = c16365ae.f51543e.iterator();
            while (it.hasNext()) {
                ((AbstractRunnableC16409t) it.next()).mo74936a(c16365ae.m75008w());
            }
            c16365ae.f51543e.clear();
        }
        synchronized (c16365ae.f51545g) {
            c16365ae.m75009x();
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* bridge */ /* synthetic */ void m75003o(final C16365ae c16365ae, final TaskCompletionSource taskCompletionSource) {
        c16365ae.f51544f.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.play.integrity.internal.v
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f51580a.m75013u(taskCompletionSource, task);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ void m75005q(C16365ae c16365ae, AbstractRunnableC16409t abstractRunnableC16409t) {
        if (c16365ae.f51553o != null || c16365ae.f51546h) {
            if (!c16365ae.f51546h) {
                abstractRunnableC16409t.run();
                return;
            } else {
                c16365ae.f51541c.m75061d("Waiting to bind to the service.", new Object[0]);
                c16365ae.f51543e.add(abstractRunnableC16409t);
                return;
            }
        }
        c16365ae.f51541c.m75061d("Initiate binding to the service.", new Object[0]);
        c16365ae.f51543e.add(abstractRunnableC16409t);
        ServiceConnectionC16364ad serviceConnectionC16364ad = new ServiceConnectionC16364ad(c16365ae, null);
        c16365ae.f51552n = serviceConnectionC16364ad;
        c16365ae.f51546h = true;
        if (c16365ae.f51540b.bindService(c16365ae.f51547i, serviceConnectionC16364ad, 1)) {
            return;
        }
        c16365ae.f51541c.m75061d("Failed to bind to the service.", new Object[0]);
        c16365ae.f51546h = false;
        Iterator it = c16365ae.f51543e.iterator();
        while (it.hasNext()) {
            ((AbstractRunnableC16409t) it.next()).mo74936a(new C16366af());
        }
        c16365ae.f51543e.clear();
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ void m75006r(C16365ae c16365ae) {
        c16365ae.f51541c.m75061d("linkToDeath", new Object[0]);
        try {
            c16365ae.f51553o.asBinder().linkToDeath(c16365ae.f51550l, 0);
        } catch (RemoteException e) {
            c16365ae.f51541c.m75060c(e, "linkToDeath failed", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: s */
    public static /* bridge */ /* synthetic */ void m75007s(C16365ae c16365ae) {
        c16365ae.f51541c.m75061d("unlinkToDeath", new Object[0]);
        c16365ae.f51553o.asBinder().unlinkToDeath(c16365ae.f51550l, 0);
    }

    /* JADX INFO: renamed from: w */
    private final RemoteException m75008w() {
        return new RemoteException(String.valueOf(this.f51542d).concat(" : Binder has died."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public final void m75009x() {
        Iterator it = this.f51544f.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(m75008w());
        }
        this.f51544f.clear();
    }

    /* JADX INFO: renamed from: c */
    public final Handler m75010c() {
        Handler handler;
        Map map = f51539a;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f51542d)) {
                    HandlerThread handlerThread = new HandlerThread(this.f51542d, 10);
                    handlerThread.start();
                    map.put(this.f51542d, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f51542d);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    /* JADX INFO: renamed from: e */
    public final IInterface m75011e() {
        return this.f51553o;
    }

    /* JADX INFO: renamed from: t */
    public final void m75012t(AbstractRunnableC16409t abstractRunnableC16409t, TaskCompletionSource taskCompletionSource) {
        m75010c().post(new C16412w(this, abstractRunnableC16409t.m75063c(), taskCompletionSource, abstractRunnableC16409t));
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m75013u(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.f51545g) {
            this.f51544f.remove(taskCompletionSource);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m75014v(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f51545g) {
            this.f51544f.remove(taskCompletionSource);
        }
        m75010c().post(new C16413x(this));
    }
}

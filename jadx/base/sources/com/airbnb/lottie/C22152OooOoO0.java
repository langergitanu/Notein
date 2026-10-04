package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import o00OO00O.C24983OooO0Oo;

/* JADX INFO: renamed from: com.airbnb.lottie.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C22152OooOoO0<T> {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final ExecutorService f66814OooO0o0 = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final LinkedHashSet f66815OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final LinkedHashSet f66816OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Handler f66817OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile C22150OooOo0o<T> f66818OooO0Oo;

    /* JADX INFO: renamed from: com.airbnb.lottie.OooOoO0$OooO00o */
    public class OooO00o extends FutureTask<C22150OooOo0o<T>> {
        public OooO00o(Callable<C22150OooOo0o<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public final void done() {
            C22152OooOoO0 c22152OooOoO0 = C22152OooOoO0.this;
            if (isCancelled()) {
                return;
            }
            try {
                c22152OooOoO0.OooO00o(get());
            } catch (InterruptedException | ExecutionException e) {
                c22152OooOoO0.OooO00o(new C22150OooOo0o<>(e));
            }
        }
    }

    public C22152OooOoO0() {
        throw null;
    }

    public C22152OooOoO0(Callable<C22150OooOo0o<T>> callable, boolean z) {
        this.f66815OooO00o = new LinkedHashSet(1);
        this.f66816OooO0O0 = new LinkedHashSet(1);
        this.f66817OooO0OO = new Handler(Looper.getMainLooper());
        this.f66818OooO0Oo = null;
        if (!z) {
            f66814OooO0o0.execute(new OooO00o(callable));
            return;
        }
        try {
            OooO00o(callable.call());
        } catch (Throwable th) {
            OooO00o(new C22150OooOo0o<>(th));
        }
    }

    public final void OooO00o(C22150OooOo0o<T> c22150OooOo0o) {
        if (this.f66818OooO0Oo != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f66818OooO0Oo = c22150OooOo0o;
        this.f66817OooO0OO.post(new Runnable() { // from class: com.airbnb.lottie.OooOo
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                C22152OooOoO0 c22152OooOoO0 = this.f66796OooOo0o;
                C22150OooOo0o<T> c22150OooOo0o2 = c22152OooOoO0.f66818OooO0Oo;
                if (c22150OooOo0o2 == 0) {
                    return;
                }
                V v = c22150OooOo0o2.f66812OooO00o;
                if (v != 0) {
                    synchronized (c22152OooOoO0) {
                        Iterator it = new ArrayList(c22152OooOoO0.f66815OooO00o).iterator();
                        while (it.hasNext()) {
                            ((InterfaceC22149OooOo0O) it.next()).onResult(v);
                        }
                    }
                    return;
                }
                Throwable th = c22150OooOo0o2.f66813OooO0O0;
                synchronized (c22152OooOoO0) {
                    ArrayList arrayList = new ArrayList(c22152OooOoO0.f66816OooO0O0);
                    if (arrayList.isEmpty()) {
                        C24983OooO0Oo.OooO0OO("Lottie encountered an error but no failure listener was added:", th);
                        return;
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC22149OooOo0O) it2.next()).onResult(th);
                    }
                }
            }
        });
    }
}

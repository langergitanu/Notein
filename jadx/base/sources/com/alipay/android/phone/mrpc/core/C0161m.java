package com.alipay.android.phone.mrpc.core;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: com.alipay.android.phone.mrpc.core.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0161m extends FutureTask<C0169u> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CallableC0165q f79a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0160l f80b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0161m(C0160l c0160l, Callable callable, CallableC0165q callableC0165q) {
        super(callable);
        this.f80b = c0160l;
        this.f79a = callableC0165q;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        C0163o c0163oM111a = this.f79a.m111a();
        if (c0163oM111a.m114f() == null) {
            super.done();
            return;
        }
        try {
            get();
            if (!isCancelled() && !c0163oM111a.m116h()) {
                return;
            }
            c0163oM111a.m115g();
            if (isCancelled() && isDone()) {
                return;
            }
            cancel(false);
        } catch (InterruptedException e) {
            e.toString();
        } catch (CancellationException unused) {
            c0163oM111a.m115g();
        } catch (ExecutionException e2) {
            if (e2.getCause() == null || !(e2.getCause() instanceof HttpException)) {
                e2.toString();
                return;
            }
            HttpException httpException = (HttpException) e2.getCause();
            httpException.getCode();
            httpException.getMsg();
        } catch (Throwable th) {
            throw new RuntimeException("An error occured while executing http request", th);
        }
    }
}

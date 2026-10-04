package oOO00o0o;

import android.content.Context;
import com.hihonor.honorid.core.helper.handler.ErrorStatus;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import oOO00o0.C34370OooO0o0;

/* JADX INFO: renamed from: oOO00o0o.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractRunnableC34378OooO0OO implements Runnable {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final Context f123378OooOoO0;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final CountDownLatch f123377OooOo0o = new CountDownLatch(1);

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final AtomicBoolean f123376OooOo = new AtomicBoolean(false);

    public AbstractRunnableC34378OooO0OO(Context context) {
        this.f123378OooOoO0 = context;
    }

    public abstract void OooO00o();

    public abstract void OooO0O0(ErrorStatus errorStatus);

    public final void OooO0OO() {
        C34370OooO0o0.OooO0Oo("AIDLTask", "finishTask");
        ServiceConnectionC34376OooO00o serviceConnectionC34376OooO00oOooO00o = ServiceConnectionC34376OooO00o.OooO00o(this.f123378OooOoO0);
        if (serviceConnectionC34376OooO00oOooO00o != null) {
            C34370OooO0o0.OooO0Oo("AIDLClientInvokeManager", "sendTaskFinishMsg");
            synchronized (serviceConnectionC34376OooO00oOooO00o.f123369OooOoO0) {
                try {
                    if (ServiceConnectionC34376OooO00o.f123364Oooo000.decrementAndGet() == 0) {
                        serviceConnectionC34376OooO00oOooO00o.f123373OooOooO.sendEmptyMessage(3004);
                    }
                } finally {
                }
            }
        }
        this.f123377OooOo0o.countDown();
        this.f123376OooOo.set(true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicBoolean atomicBoolean = this.f123376OooOo;
        OooO00o();
        try {
            if (this.f123377OooOo0o.await(12000L, TimeUnit.MILLISECONDS) || atomicBoolean.get()) {
                return;
            }
            atomicBoolean.set(true);
            OooO0O0(null);
            OooO0OO();
        } catch (InterruptedException unused) {
            C34370OooO0o0.OooO0Oo("AIDLTask", "execute await InterruptedException");
            if (atomicBoolean.get()) {
                return;
            }
            atomicBoolean.set(true);
            OooO0O0(null);
            OooO0OO();
        }
    }
}

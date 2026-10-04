package o00O0O0o;

import com.aspose.slides.C22218Oooo;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 implements ThreadFactory {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ boolean f84229OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final AtomicInteger f84230OooOo0o = new AtomicInteger(0);

    public OooO0O0(boolean z) {
        this.f84229OooOo = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        StringBuilder sbOooO0OO = C22218Oooo.OooO0OO(this.f84229OooOo ? "WM.task-" : "androidx.work-");
        sbOooO0OO.append(this.f84230OooOo0o.incrementAndGet());
        return new Thread(runnable, sbOooO0OO.toString());
    }
}

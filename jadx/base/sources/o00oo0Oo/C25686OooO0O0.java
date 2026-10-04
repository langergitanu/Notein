package o00oo0Oo;

import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: o00oo0Oo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25686OooO0O0 implements InterfaceC25699OooOOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f87635OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f87636OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Object f87637OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f87638OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Object f87639OooO0o0;

    public C25686OooO0O0(int i) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(2, new ThreadFactoryC25705OooOo0o("FrescoIoBoundExecutor"));
        kotlin.jvm.internal.OooOOO0.OooO0o(executorServiceNewFixedThreadPool, "newFixedThreadPool(...)");
        this.f87635OooO00o = executorServiceNewFixedThreadPool;
        ExecutorService executorServiceNewFixedThreadPool2 = Executors.newFixedThreadPool(i, new ThreadFactoryC25705OooOo0o("FrescoDecodeExecutor"));
        kotlin.jvm.internal.OooOOO0.OooO0o(executorServiceNewFixedThreadPool2, "newFixedThreadPool(...)");
        this.f87636OooO0O0 = executorServiceNewFixedThreadPool2;
        ExecutorService executorServiceNewFixedThreadPool3 = Executors.newFixedThreadPool(i, new ThreadFactoryC25705OooOo0o("FrescoBackgroundExecutor"));
        kotlin.jvm.internal.OooOOO0.OooO0o(executorServiceNewFixedThreadPool3, "newFixedThreadPool(...)");
        this.f87637OooO0OO = executorServiceNewFixedThreadPool3;
        ExecutorService executorServiceNewFixedThreadPool4 = Executors.newFixedThreadPool(1, new ThreadFactoryC25705OooOo0o("FrescoLightWeightBackgroundExecutor"));
        kotlin.jvm.internal.OooOOO0.OooO0o(executorServiceNewFixedThreadPool4, "newFixedThreadPool(...)");
        this.f87638OooO0Oo = executorServiceNewFixedThreadPool4;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(i, new ThreadFactoryC25705OooOo0o("FrescoBackgroundExecutor"));
        kotlin.jvm.internal.OooOOO0.OooO0o(scheduledExecutorServiceNewScheduledThreadPool, "newScheduledThreadPool(...)");
        this.f87639OooO0o0 = scheduledExecutorServiceNewScheduledThreadPool;
    }

    @Override // o00oo0Oo.InterfaceC25699OooOOOo
    public ExecutorService OooO00o() {
        return (ExecutorService) this.f87638OooO0Oo;
    }

    @Override // o00oo0Oo.InterfaceC25699OooOOOo
    public ExecutorService OooO0O0() {
        return (ExecutorService) this.f87637OooO0OO;
    }

    @Override // o00oo0Oo.InterfaceC25699OooOOOo
    public ExecutorService OooO0OO() {
        return (ExecutorService) this.f87635OooO00o;
    }

    @Override // o00oo0Oo.InterfaceC25699OooOOOo
    public ExecutorService OooO0Oo() {
        return (ExecutorService) this.f87635OooO00o;
    }

    @Override // o00oo0Oo.InterfaceC25699OooOOOo
    public ExecutorService OooO0o() {
        return (ExecutorService) this.f87636OooO0O0;
    }

    @Override // o00oo0Oo.InterfaceC25699OooOOOo
    public ExecutorService OooO0o0() {
        return (ExecutorService) this.f87635OooO00o;
    }

    public C25686OooO0O0(TextView textView, TextView textView2, ProgressBar progressBar, RecyclerView recyclerView, SearchView searchView) {
        this.f87635OooO00o = textView;
        this.f87636OooO0O0 = textView2;
        this.f87637OooO0OO = progressBar;
        this.f87638OooO0Oo = recyclerView;
        this.f87639OooO0o0 = searchView;
    }
}

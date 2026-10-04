package okhttp3.internal.concurrent;

import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lokhttp3/internal/concurrent/Task;", "", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public abstract class Task {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f124317OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f124318OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public TaskQueue f124319OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f124320OooO0Oo;

    public Task(String name, boolean z) {
        OooOOO0.OooO0oO(name, "name");
        this.f124317OooO00o = name;
        this.f124318OooO0O0 = z;
        this.f124320OooO0Oo = -1L;
    }

    public abstract long OooO00o();

    /* JADX INFO: renamed from: toString, reason: from getter */
    public final String getF124317OooO00o() {
        return this.f124317OooO00o;
    }
}

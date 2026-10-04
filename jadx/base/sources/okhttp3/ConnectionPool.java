package okhttp3;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealConnectionPool;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m80612d2 = {"Lokhttp3/ConnectionPool;", "", "<init>", "()V", "Lokhttp3/internal/connection/RealConnectionPool;", "delegate", "Lokhttp3/internal/connection/RealConnectionPool;", "OooO0O0", "()Lokhttp3/internal/connection/RealConnectionPool;", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class ConnectionPool {
    private final RealConnectionPool delegate;

    public ConnectionPool() {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        OooOOO0.OooO0oO(timeUnit, "timeUnit");
        this.delegate = new RealConnectionPool(TaskRunner.f124329OooO);
    }

    public final void OooO00o() {
        this.delegate.OooO0Oo();
    }

    /* JADX INFO: renamed from: OooO0O0, reason: from getter */
    public final RealConnectionPool getDelegate() {
        return this.delegate;
    }
}

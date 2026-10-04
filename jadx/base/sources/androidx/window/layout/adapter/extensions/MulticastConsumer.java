package androidx.window.layout.adapter.extensions;

import android.content.Context;
import androidx.core.util.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o00O0.C24797OooO0o0;
import o00O00oO.C24812OooO;
import o00O00oO.C24822OooOO0o;
import oO00ooO.C32460OooOooO;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Landroidx/window/layout/adapter/extensions/MulticastConsumer;", "Landroidx/core/util/Consumer;", "Landroidx/window/extensions/layout/WindowLayoutInfo;", "Landroidx/window/extensions/core/util/function/Consumer;", "value", "LoO00ooO/OooOooO;", "accept", "(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", "window_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class MulticastConsumer implements Consumer<WindowLayoutInfo>, androidx.window.extensions.core.util.function.Consumer<WindowLayoutInfo> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Context f66641OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C24822OooOO0o f66643OooOoO0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final ReentrantLock f66640OooOo = new ReentrantLock();

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final LinkedHashSet f66642OooOoO = new LinkedHashSet();

    public MulticastConsumer(Context context) {
        this.f66641OooOo0o = context;
    }

    public final void OooO00o(C24812OooO c24812OooO) {
        ReentrantLock reentrantLock = this.f66640OooOo;
        reentrantLock.lock();
        try {
            C24822OooOO0o c24822OooOO0o = this.f66643OooOoO0;
            if (c24822OooOO0o != null) {
                c24812OooO.accept(c24822OooOO0o);
            }
            this.f66642OooOoO.add(c24812OooO);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // androidx.core.util.Consumer
    public void accept(WindowLayoutInfo value) {
        OooOOO0.OooO0oO(value, "value");
        ReentrantLock reentrantLock = this.f66640OooOo;
        reentrantLock.lock();
        try {
            C24822OooOO0o c24822OooOO0oOooO0O0 = C24797OooO0o0.OooO0O0(this.f66641OooOo0o, value);
            this.f66643OooOoO0 = c24822OooOO0oOooO0O0;
            Iterator it = this.f66642OooOoO.iterator();
            while (it.hasNext()) {
                ((Consumer) it.next()).accept(c24822OooOO0oOooO0O0);
            }
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}

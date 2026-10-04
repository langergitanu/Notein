package o00O0;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.layout.adapter.extensions.MulticastConsumer;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import o0000OO0.OooO;
import o00O00oO.C24812OooO;
import oO00ooO.C32460OooOooO;
import oo00o.InterfaceC34660OooO00o;

/* JADX INFO: renamed from: o00O0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24796OooO0Oo implements InterfaceC34660OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final WindowLayoutComponent f84065OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ReentrantLock f84066OooO0O0 = new ReentrantLock();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final LinkedHashMap f84067OooO0OO = new LinkedHashMap();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final LinkedHashMap f84068OooO0Oo = new LinkedHashMap();

    public C24796OooO0Oo(WindowLayoutComponent windowLayoutComponent) {
        this.f84065OooO00o = windowLayoutComponent;
    }

    @Override // oo00o.InterfaceC34660OooO00o
    public final void OooO00o(C24812OooO c24812OooO) {
        ReentrantLock reentrantLock = this.f84066OooO0O0;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f84068OooO0Oo;
        try {
            Context context = (Context) linkedHashMap.get(c24812OooO);
            if (context == null) {
                reentrantLock.unlock();
                return;
            }
            LinkedHashMap linkedHashMap2 = this.f84067OooO0OO;
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap2.get(context);
            if (multicastConsumer == null) {
                reentrantLock.unlock();
                return;
            }
            ReentrantLock reentrantLock2 = multicastConsumer.f66640OooOo;
            reentrantLock2.lock();
            LinkedHashSet linkedHashSet = multicastConsumer.f66642OooOoO;
            try {
                linkedHashSet.remove(c24812OooO);
                reentrantLock2.unlock();
                linkedHashMap.remove(c24812OooO);
                if (linkedHashSet.isEmpty()) {
                    linkedHashMap2.remove(context);
                    this.f84065OooO00o.removeWindowLayoutInfoListener(multicastConsumer);
                }
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock2.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // oo00o.InterfaceC34660OooO00o
    public final void OooO0O0(Context context, OooO oooO, C24812OooO c24812OooO) {
        C32460OooOooO c32460OooOooO;
        ReentrantLock reentrantLock = this.f84066OooO0O0;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f84067OooO0OO;
        try {
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f84068OooO0Oo;
            if (multicastConsumer != null) {
                multicastConsumer.OooO00o(c24812OooO);
                linkedHashMap2.put(c24812OooO, context);
                c32460OooOooO = C32460OooOooO.f116667OooO00o;
            } else {
                c32460OooOooO = null;
            }
            if (c32460OooOooO == null) {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(context);
                linkedHashMap.put(context, multicastConsumer2);
                linkedHashMap2.put(c24812OooO, context);
                multicastConsumer2.OooO00o(c24812OooO);
                this.f84065OooO00o.addWindowLayoutInfoListener(context, multicastConsumer2);
            }
            C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}

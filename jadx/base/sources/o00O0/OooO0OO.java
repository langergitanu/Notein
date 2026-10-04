package o00O0;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.extensions.MulticastConsumer;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C24035Oooo00o;
import o0000OO0.OooO;
import o00O00o.OooO0OO;
import o00O00oO.C24812OooO;
import oO00ooO.C32460OooOooO;
import oOo000Oo.C34434OooOoO;
import oo00o.InterfaceC34660OooO00o;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO implements InterfaceC34660OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final WindowLayoutComponent f84059OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00O00o.OooO0OO f84060OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ReentrantLock f84061OooO0OO = new ReentrantLock();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final LinkedHashMap f84062OooO0Oo = new LinkedHashMap();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final LinkedHashMap f84064OooO0o0 = new LinkedHashMap();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final LinkedHashMap f84063OooO0o = new LinkedHashMap();

    public OooO0OO(WindowLayoutComponent windowLayoutComponent, o00O00o.OooO0OO oooO0OO) {
        this.f84059OooO00o = windowLayoutComponent;
        this.f84060OooO0O0 = oooO0OO;
    }

    @Override // oo00o.InterfaceC34660OooO00o
    public final void OooO00o(C24812OooO c24812OooO) {
        ReentrantLock reentrantLock = this.f84061OooO0OO;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f84064OooO0o0;
        try {
            Context context = (Context) linkedHashMap.get(c24812OooO);
            if (context == null) {
                reentrantLock.unlock();
                return;
            }
            LinkedHashMap linkedHashMap2 = this.f84062OooO0Oo;
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
                    OooO0OO.OooO0O0 oooO0O0 = (OooO0OO.OooO0O0) this.f84063OooO0o.remove(multicastConsumer);
                    if (oooO0O0 != null) {
                        oooO0O0.dispose();
                    }
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
        ReentrantLock reentrantLock = this.f84061OooO0OO;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f84062OooO0Oo;
        try {
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f84064OooO0o0;
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
                if (!(context instanceof Activity)) {
                    multicastConsumer2.accept(new WindowLayoutInfo(C34434OooOoO.f123453OooOo0o));
                    reentrantLock.unlock();
                    return;
                } else {
                    this.f84063OooO0o.put(multicastConsumer2, this.f84060OooO0O0.OooO00o(this.f84059OooO00o, C24035Oooo00o.f80943OooO00o.OooO0O0(WindowLayoutInfo.class), (Activity) context, new OooO0O0(1, multicastConsumer2, MulticastConsumer.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0)));
                }
            }
            C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}

package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.producers.C22265OooOOOo;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import o00O0o0o.C24935OooO0O0;
import o00O0o0o.C24937OooO0Oo;
import o00O0o0o.C24939OooO0o0;
import o00O0o0o.C24941OooO0oo;
import o00O0o0o.RunnableC24938OooO0o;
import o00o0OOO.C25401OooO0o;
import o00o0OOO.InterfaceC25397OooO00o;
import o00o0Ooo.C25428OooO0o;
import o00o0Ooo.InterfaceC25423OooO;
import o00o0o.AbstractC25434OooO00o;
import o00o0o.C25435OooO0O0;
import o00o0o00.C25438OooO00o;
import o00o0o00.C25439OooO0O0;
import o00o0o0o.InterfaceC25449OooO0oO;
import o00oo.C25638OooO0oO;
import o00oo0O0.C25661OooO0o;
import o00oo0O0.C25667OooOO0o;
import o00oo0Oo.InterfaceC25687OooO0OO;
import o00ooO.C25732OooO0O0;
import o00ooO0o.C25763OooO00o;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22268OooOOoo implements InterfaceC22291OoooO0O<C25638OooO0oO> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC25423OooO<InterfaceC25687OooO0OO> f67336OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C25667OooOO0o f67337OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooOo00 f67338OooO0OO;

    public C22268OooOOoo(InterfaceC25423OooO interfaceC25423OooO, C25667OooOO0o c25667OooOO0o, OooOo00 oooOo00) {
        this.f67336OooO00o = interfaceC25423OooO;
        this.f67337OooO0O0 = c25667OooOO0o;
        this.f67338OooO0OO = oooOo00;
    }

    public static Map<String, String> OooO0O0(o000oOoO o000oooo2, InterfaceC22288OoooO interfaceC22288OoooO, boolean z, int i) {
        if (o000oooo2.OooO0Oo(interfaceC22288OoooO, "DiskCacheProducer")) {
            return z ? C25428OooO0o.OooO0O0("cached_value_found", String.valueOf(z), "encodedImageSize", String.valueOf(i)) : C25428OooO0o.OooO00o("cached_value_found", String.valueOf(z));
        }
        return null;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC22291OoooO0O
    public final void OooO00o(OooO<C25638OooO0oO> oooO, InterfaceC22288OoooO interfaceC22288OoooO) {
        C24941OooO0oo c24941OooO0ooOooO0O0;
        boolean z;
        C25763OooO00o c25763OooO00oOooOOoo = interfaceC22288OoooO.OooOOoo();
        boolean zOooO0OO = interfaceC22288OoooO.OooOOoo().OooO0OO(16);
        OooOo00 oooOo00 = this.f67338OooO0OO;
        if (!zOooO0OO) {
            if (interfaceC22288OoooO.o0Oo0oo().f87928OooOo0o < 2) {
                oooOo00.OooO00o(oooO, interfaceC22288OoooO);
                return;
            } else {
                interfaceC22288OoooO.Oooo00o("disk", "nil-result_read");
                oooO.OooO00o(1, null);
                return;
            }
        }
        interfaceC22288OoooO.OooOOo0().OooO0OO(interfaceC22288OoooO, "DiskCacheProducer");
        final C25401OooO0o key = this.f67337OooO0O0.OooO0OO(c25763OooO00oOooOOoo, interfaceC22288OoooO.OooO00o());
        InterfaceC25687OooO0OO interfaceC25687OooO0OO = this.f67336OooO00o.get();
        final C25661OooO0o c25661OooO0oOooO00o = C22265OooOOOo.OooO00o(c25763OooO00oOooOOoo, interfaceC25687OooO0OO.OooO00o(), interfaceC25687OooO0OO.OooO0O0(), interfaceC25687OooO0OO.OooO0OO());
        if (c25661OooO0oOooO00o == null) {
            interfaceC22288OoooO.OooOOo0().OooOO0O(interfaceC22288OoooO, "DiskCacheProducer", new C22265OooOOOo.OooO00o("Got no disk cache for CacheChoice: " + Integer.valueOf(c25763OooO00oOooOOoo.f87910OooO00o.ordinal()).toString()), null);
            if (interfaceC22288OoooO.o0Oo0oo().f87928OooOo0o < 2) {
                oooOo00.OooO00o(oooO, interfaceC22288OoooO);
                return;
            } else {
                interfaceC22288OoooO.Oooo00o("disk", "nil-result_read");
                oooO.OooO00o(1, null);
                return;
            }
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        c25661OooO0oOooO00o.getClass();
        kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
        C25732OooO0O0.OooO00o();
        C25638OooO0oO c25638OooO0oOOooO00o = c25661OooO0oOooO00o.f87596OooO0oO.OooO00o(key);
        if (c25638OooO0oOOooO00o != null) {
            C25438OooO00o.OooO0Oo(C25661OooO0o.class, key.OooO00o(), "Found image for %s in staging area");
            c25661OooO0oOooO00o.f87594OooO0o.getClass();
            ExecutorService executorService = C24941OooO0oo.f84621OooO0oO;
            c24941OooO0ooOooO0O0 = new C24941OooO0oo();
            if (!c24941OooO0ooOooO0O0.OooO0oO(c25638OooO0oOOooO00o)) {
                throw new IllegalStateException("Cannot set the result of a completed task.");
            }
            kotlin.jvm.internal.OooOOO0.OooO0o(c24941OooO0ooOooO0O0, "forResult(...)");
        } else {
            try {
                c24941OooO0ooOooO0O0 = C24941OooO0oo.OooO00o(new Callable() { // from class: o00oo0O0.OooO0OO
                    @Override // java.util.concurrent.Callable
                    public final Object call() throws InterruptedException {
                        AtomicBoolean atomicBoolean2 = atomicBoolean;
                        C25661OooO0o this$0 = c25661OooO0oOooO00o;
                        kotlin.jvm.internal.OooOOO0.OooO0oO(this$0, "this$0");
                        InterfaceC25397OooO00o key2 = key;
                        kotlin.jvm.internal.OooOOO0.OooO0oO(key2, "$key");
                        if (atomicBoolean2.get()) {
                            throw new CancellationException();
                        }
                        C25638OooO0oO c25638OooO0oOOooO00o2 = this$0.f87596OooO0oO.OooO00o(key2);
                        C25679OooOo0o c25679OooOo0o = this$0.f87594OooO0o;
                        if (c25638OooO0oOOooO00o2 != null) {
                            C25438OooO00o.OooO0Oo(C25661OooO0o.class, key2.OooO00o(), "Found image for %s in staging area");
                            c25679OooOo0o.getClass();
                        } else {
                            C25438OooO00o.OooO0Oo(C25661OooO0o.class, key2.OooO00o(), "Did not find image for %s in staging area");
                            c25679OooOo0o.getClass();
                            try {
                                InterfaceC25449OooO0oO interfaceC25449OooO0oOOooO00o = this$0.OooO00o(key2);
                                if (interfaceC25449OooO0oOOooO00o == null) {
                                    return null;
                                }
                                C25435OooO0O0 c25435OooO0O0O00Oo0 = AbstractC25434OooO00o.o00Oo0(interfaceC25449OooO0oOOooO00o);
                                kotlin.jvm.internal.OooOOO0.OooO0o(c25435OooO0O0O00Oo0, "of(...)");
                                try {
                                    c25638OooO0oOOooO00o2 = new C25638OooO0oO(c25435OooO0O0O00Oo0);
                                } finally {
                                    c25435OooO0O0O00Oo0.close();
                                }
                            } catch (Exception unused) {
                                return null;
                            }
                        }
                        if (!Thread.interrupted()) {
                            return c25638OooO0oOOooO00o2;
                        }
                        if (C25438OooO00o.f86720OooO00o.OooO00o(2)) {
                            C25439OooO0O0.OooO0O0(2, C25661OooO0o.class.getSimpleName(), "Host thread was interrupted, decreasing reference count");
                        }
                        c25638OooO0oOOooO00o2.close();
                        throw new InterruptedException();
                    }
                }, c25661OooO0oOooO00o.f87593OooO0Oo);
            } catch (Exception e) {
                C25438OooO00o.OooO(e, "Failed to schedule disk-cache read for %s", key.OooO00o());
                c24941OooO0ooOooO0O0 = C24941OooO0oo.OooO0O0(e);
            }
        }
        C22267OooOOo0 c22267OooOOo0 = new C22267OooOOo0(this, interfaceC22288OoooO.OooOOo0(), interfaceC22288OoooO, oooO);
        c24941OooO0ooOooO0O0.getClass();
        C24935OooO0O0.OooO00o oooO00o = C24941OooO0oo.f84622OooO0oo;
        o00000O0.OooO00o oooO00o2 = new o00000O0.OooO00o();
        synchronized (c24941OooO0ooOooO0O0.f84624OooO00o) {
            try {
                synchronized (c24941OooO0ooOooO0O0.f84624OooO00o) {
                    z = c24941OooO0ooOooO0O0.f84625OooO0O0;
                }
                if (!z) {
                    c24941OooO0ooOooO0O0.f84628OooO0o.add(new C24939OooO0o0(oooO00o2, c22267OooOOo0, oooO00o));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            try {
                oooO00o.execute(new RunnableC24938OooO0o(oooO00o2, c22267OooOOo0, c24941OooO0ooOooO0O0));
            } catch (Exception e2) {
                oooO00o2.OooO00o(new C24937OooO0Oo(e2));
            }
        }
        interfaceC22288OoooO.OooO0OO(new C22266OooOOo(atomicBoolean));
    }
}

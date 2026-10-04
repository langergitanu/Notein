package com.google.android.play.integrity.internal;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.ax */
/* JADX INFO: loaded from: classes7.dex */
public final class C16384ax implements InterfaceC16389bb {

    /* JADX INFO: renamed from: a */
    private static final Object f51571a = new Object();

    /* JADX INFO: renamed from: b */
    private volatile InterfaceC16389bb f51572b;

    /* JADX INFO: renamed from: c */
    private volatile Object f51573c = f51571a;

    private C16384ax(InterfaceC16389bb interfaceC16389bb) {
        this.f51572b = interfaceC16389bb;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC16389bb m75038b(InterfaceC16389bb interfaceC16389bb) {
        return interfaceC16389bb instanceof C16384ax ? interfaceC16389bb : new C16384ax(interfaceC16389bb);
    }

    @Override // com.google.android.play.integrity.internal.InterfaceC16391bd, com.google.android.play.integrity.internal.InterfaceC16390bc
    /* JADX INFO: renamed from: a */
    public final Object mo74933a() {
        Object objMo74933a;
        Object obj = this.f51573c;
        Object obj2 = f51571a;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objMo74933a = this.f51573c;
                if (objMo74933a == obj2) {
                    objMo74933a = this.f51572b.mo74933a();
                    Object obj3 = this.f51573c;
                    if (obj3 != obj2 && obj3 != objMo74933a) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objMo74933a + ". This is likely due to a circular dependency.");
                    }
                    this.f51573c = objMo74933a;
                    this.f51572b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objMo74933a;
    }
}

package com.google.android.play.integrity.internal;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.az */
/* JADX INFO: loaded from: classes7.dex */
public final class C16386az implements InterfaceC16385ay {

    /* JADX INFO: renamed from: a */
    private final Object f51574a;

    private C16386az(Object obj) {
        this.f51574a = obj;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC16385ay m75039b(Object obj) {
        if (obj != null) {
            return new C16386az(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // com.google.android.play.integrity.internal.InterfaceC16391bd, com.google.android.play.integrity.internal.InterfaceC16390bc
    /* JADX INFO: renamed from: a */
    public final Object mo74933a() {
        return this.f51574a;
    }
}

package com.google.android.play.core.integrity;

import com.google.android.play.integrity.internal.InterfaceC16385ay;
import com.google.android.play.integrity.internal.InterfaceC16391bd;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.au */
/* JADX INFO: loaded from: classes7.dex */
public final class C16302au implements InterfaceC16385ay {

    /* JADX INFO: renamed from: a */
    private final InterfaceC16391bd f51448a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC16391bd f51449b;

    public C16302au(InterfaceC16391bd interfaceC16391bd, InterfaceC16391bd interfaceC16391bd2) {
        this.f51448a = interfaceC16391bd;
        this.f51449b = interfaceC16391bd2;
    }

    @Override // com.google.android.play.integrity.internal.InterfaceC16391bd, com.google.android.play.integrity.internal.InterfaceC16390bc
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C16301at mo74933a() {
        return new C16301at(this.f51448a, this.f51449b);
    }
}

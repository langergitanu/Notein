package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.C16408s;
import com.google.android.play.integrity.internal.InterfaceC16385ay;
import com.google.android.play.integrity.internal.InterfaceC16391bd;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.bp */
/* JADX INFO: loaded from: classes7.dex */
public final class C16324bp implements InterfaceC16385ay {

    /* JADX INFO: renamed from: a */
    private final InterfaceC16391bd f51491a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC16391bd f51492b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC16391bd f51493c;

    public C16324bp(InterfaceC16391bd interfaceC16391bd, InterfaceC16391bd interfaceC16391bd2, InterfaceC16391bd interfaceC16391bd3, InterfaceC16391bd interfaceC16391bd4) {
        this.f51491a = interfaceC16391bd;
        this.f51492b = interfaceC16391bd2;
        this.f51493c = interfaceC16391bd3;
    }

    @Override // com.google.android.play.integrity.internal.InterfaceC16391bd, com.google.android.play.integrity.internal.InterfaceC16390bc
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo74933a() {
        return new C16322bn((Context) this.f51491a.mo74933a(), (C16408s) this.f51492b.mo74933a(), ((C16302au) this.f51493c).mo74933a(), new C16338j());
    }
}

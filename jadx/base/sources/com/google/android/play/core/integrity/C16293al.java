package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.C16408s;
import com.google.android.play.integrity.internal.InterfaceC16385ay;
import com.google.android.play.integrity.internal.InterfaceC16391bd;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.al */
/* JADX INFO: loaded from: classes7.dex */
public final class C16293al implements InterfaceC16385ay {

    /* JADX INFO: renamed from: a */
    private final InterfaceC16391bd f51429a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC16391bd f51430b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC16391bd f51431c;

    public C16293al(InterfaceC16391bd interfaceC16391bd, InterfaceC16391bd interfaceC16391bd2, InterfaceC16391bd interfaceC16391bd3, InterfaceC16391bd interfaceC16391bd4) {
        this.f51429a = interfaceC16391bd;
        this.f51430b = interfaceC16391bd2;
        this.f51431c = interfaceC16391bd3;
    }

    @Override // com.google.android.play.integrity.internal.InterfaceC16391bd, com.google.android.play.integrity.internal.InterfaceC16390bc
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo74933a() {
        return new C16291aj((Context) this.f51429a.mo74933a(), (C16408s) this.f51430b.mo74933a(), ((C16302au) this.f51431c).mo74933a(), new C16337i());
    }
}

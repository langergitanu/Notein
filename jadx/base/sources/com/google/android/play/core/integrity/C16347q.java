package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.C16388ba;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.q */
/* JADX INFO: loaded from: classes7.dex */
final class C16347q implements InterfaceC16354x {

    /* JADX INFO: renamed from: a */
    private Context f51514a;

    private C16347q() {
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final C16347q m74983a(Context context) {
        context.getClass();
        this.f51514a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.InterfaceC16354x
    /* JADX INFO: renamed from: b */
    public final C16349s mo74984b() {
        C16388ba.m75041a(this.f51514a, Context.class);
        return new C16349s(this.f51514a, null);
    }

    public /* synthetic */ C16347q(C16346p c16346p) {
    }
}

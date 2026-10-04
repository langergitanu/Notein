package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.C16388ba;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.u */
/* JADX INFO: loaded from: classes7.dex */
final class C16351u implements InterfaceC16303av {

    /* JADX INFO: renamed from: a */
    private Context f51520a;

    private C16351u() {
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final C16351u m74986a(Context context) {
        context.getClass();
        this.f51520a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.InterfaceC16303av
    /* JADX INFO: renamed from: b */
    public final InterfaceC16304aw mo74951b() {
        C16388ba.m75041a(this.f51520a, Context.class);
        return new C16353w(this.f51520a, null);
    }

    public /* synthetic */ C16351u(C16350t c16350t) {
    }
}

package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.C16384ax;
import com.google.android.play.integrity.internal.C16386az;
import com.google.android.play.integrity.internal.InterfaceC16385ay;
import com.google.android.play.integrity.internal.InterfaceC16389bb;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.w */
/* JADX INFO: loaded from: classes7.dex */
final class C16353w implements InterfaceC16304aw {

    /* JADX INFO: renamed from: a */
    private final InterfaceC16389bb f51521a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC16389bb f51522b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC16389bb f51523c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC16389bb f51524d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC16389bb f51525e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC16389bb f51526f;

    public /* synthetic */ C16353w(Context context, C16352v c16352v) {
        InterfaceC16385ay interfaceC16385ayM75039b = C16386az.m75039b(context);
        this.f51521a = interfaceC16385ayM75039b;
        InterfaceC16389bb interfaceC16389bbM75038b = C16384ax.m75038b(C16310bb.f51459a);
        this.f51522b = interfaceC16389bbM75038b;
        C16302au c16302au = new C16302au(interfaceC16385ayM75039b, C16344n.f51513a);
        this.f51523c = c16302au;
        InterfaceC16389bb interfaceC16389bbM75038b2 = C16384ax.m75038b(new C16324bp(interfaceC16385ayM75039b, interfaceC16389bbM75038b, c16302au, C16344n.f51513a));
        this.f51524d = interfaceC16389bbM75038b2;
        InterfaceC16389bb interfaceC16389bbM75038b3 = C16384ax.m75038b(new C16329bu(interfaceC16389bbM75038b2));
        this.f51525e = interfaceC16389bbM75038b3;
        this.f51526f = C16384ax.m75038b(new C16309ba(interfaceC16389bbM75038b2, interfaceC16389bbM75038b3));
    }

    @Override // com.google.android.play.core.integrity.InterfaceC16304aw
    /* JADX INFO: renamed from: a */
    public final StandardIntegrityManager mo74952a() {
        return (StandardIntegrityManager) this.f51526f.mo74933a();
    }
}

package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.C16384ax;
import com.google.android.play.integrity.internal.C16386az;
import com.google.android.play.integrity.internal.InterfaceC16385ay;
import com.google.android.play.integrity.internal.InterfaceC16389bb;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.s */
/* JADX INFO: loaded from: classes7.dex */
final class C16349s {

    /* JADX INFO: renamed from: a */
    private final InterfaceC16389bb f51515a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC16389bb f51516b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC16389bb f51517c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC16389bb f51518d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC16389bb f51519e;

    public /* synthetic */ C16349s(Context context, C16348r c16348r) {
        InterfaceC16385ay interfaceC16385ayM75039b = C16386az.m75039b(context);
        this.f51515a = interfaceC16385ayM75039b;
        InterfaceC16389bb interfaceC16389bbM75038b = C16384ax.m75038b(C16284ac.f51406a);
        this.f51516b = interfaceC16389bbM75038b;
        C16302au c16302au = new C16302au(interfaceC16385ayM75039b, C16340l.f51508a);
        this.f51517c = c16302au;
        InterfaceC16389bb interfaceC16389bbM75038b2 = C16384ax.m75038b(new C16293al(interfaceC16385ayM75039b, interfaceC16389bbM75038b, c16302au, C16340l.f51508a));
        this.f51518d = interfaceC16389bbM75038b2;
        this.f51519e = C16384ax.m75038b(new C16283ab(interfaceC16389bbM75038b2));
    }

    /* JADX INFO: renamed from: a */
    public final IntegrityManager m74985a() {
        return (IntegrityManager) this.f51519e.mo74933a();
    }
}

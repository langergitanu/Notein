package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.h */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractBinderC16397h extends BinderC16387b implements InterfaceC16398i {
    /* JADX INFO: renamed from: b */
    public static InterfaceC16398i m75053b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC16398i ? (InterfaceC16398i) iInterfaceQueryLocalInterface : new C16396g(iBinder);
    }
}

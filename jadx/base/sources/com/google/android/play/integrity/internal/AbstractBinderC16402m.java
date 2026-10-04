package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.m */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractBinderC16402m extends BinderC16387b implements InterfaceC16403n {
    /* JADX INFO: renamed from: b */
    public static InterfaceC16403n m75056b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC16403n ? (InterfaceC16403n) iInterfaceQueryLocalInterface : new C16401l(iBinder);
    }
}

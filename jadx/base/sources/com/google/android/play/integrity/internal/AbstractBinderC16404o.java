package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.o */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractBinderC16404o extends BinderC16387b implements InterfaceC16405p {
    public AbstractBinderC16404o() {
        super("com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
    }

    @Override // com.google.android.play.integrity.internal.BinderC16387b
    /* JADX INFO: renamed from: a */
    public final boolean mo75040a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 2) {
            return false;
        }
        Bundle bundle = (Bundle) C16392c.m75042a(parcel, Bundle.CREATOR);
        C16392c.m75043b(parcel);
        mo74939b(bundle);
        return true;
    }
}

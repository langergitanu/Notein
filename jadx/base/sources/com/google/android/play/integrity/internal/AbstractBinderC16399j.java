package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.j */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractBinderC16399j extends BinderC16387b implements InterfaceC16400k {
    public AbstractBinderC16399j() {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
    }

    @Override // com.google.android.play.integrity.internal.BinderC16387b
    /* JADX INFO: renamed from: a */
    public final boolean mo75040a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            Bundle bundle = (Bundle) C16392c.m75042a(parcel, Bundle.CREATOR);
            C16392c.m75043b(parcel);
            mo74962e(bundle);
            return true;
        }
        if (i == 3) {
            Bundle bundle2 = (Bundle) C16392c.m75042a(parcel, Bundle.CREATOR);
            C16392c.m75043b(parcel);
            mo74960c(bundle2);
            return true;
        }
        if (i == 4) {
            Bundle bundle3 = (Bundle) C16392c.m75042a(parcel, Bundle.CREATOR);
            C16392c.m75043b(parcel);
            mo74961d(bundle3);
            return true;
        }
        if (i != 5) {
            return false;
        }
        Bundle bundle4 = (Bundle) C16392c.m75042a(parcel, Bundle.CREATOR);
        C16392c.m75043b(parcel);
        mo74959b(bundle4);
        return true;
    }
}

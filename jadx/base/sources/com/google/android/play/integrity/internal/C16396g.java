package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.g */
/* JADX INFO: loaded from: classes7.dex */
public final class C16396g extends C16360a implements InterfaceC16398i {
    public C16396g(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.InterfaceC16398i
    /* JADX INFO: renamed from: c */
    public final void mo75050c(Bundle bundle, InterfaceC16407r interfaceC16407r) throws RemoteException {
        Parcel parcelM74989a = m74989a();
        C16392c.m75044c(parcelM74989a, bundle);
        parcelM74989a.writeStrongBinder(interfaceC16407r);
        m74990b(6, parcelM74989a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.InterfaceC16398i
    /* JADX INFO: renamed from: d */
    public final void mo75051d(Bundle bundle, InterfaceC16400k interfaceC16400k) throws RemoteException {
        Parcel parcelM74989a = m74989a();
        C16392c.m75044c(parcelM74989a, bundle);
        parcelM74989a.writeStrongBinder(interfaceC16400k);
        m74990b(3, parcelM74989a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.InterfaceC16398i
    /* JADX INFO: renamed from: e */
    public final void mo75052e(Bundle bundle, InterfaceC16400k interfaceC16400k) throws RemoteException {
        Parcel parcelM74989a = m74989a();
        C16392c.m75044c(parcelM74989a, bundle);
        parcelM74989a.writeStrongBinder(interfaceC16400k);
        m74990b(2, parcelM74989a);
    }
}

package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.l */
/* JADX INFO: loaded from: classes7.dex */
public final class C16401l extends C16360a implements InterfaceC16403n {
    public C16401l(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.InterfaceC16403n
    /* JADX INFO: renamed from: c */
    public final void mo75054c(Bundle bundle, InterfaceC16407r interfaceC16407r) throws RemoteException {
        Parcel parcelM74989a = m74989a();
        C16392c.m75044c(parcelM74989a, bundle);
        parcelM74989a.writeStrongBinder(interfaceC16407r);
        m74990b(3, parcelM74989a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.InterfaceC16403n
    /* JADX INFO: renamed from: d */
    public final void mo75055d(Bundle bundle, InterfaceC16405p interfaceC16405p) throws RemoteException {
        Parcel parcelM74989a = m74989a();
        C16392c.m75044c(parcelM74989a, bundle);
        parcelM74989a.writeStrongBinder(interfaceC16405p);
        m74990b(2, parcelM74989a);
    }
}

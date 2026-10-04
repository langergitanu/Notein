package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.a */
/* JADX INFO: loaded from: classes7.dex */
public class C16360a implements IInterface {

    /* JADX INFO: renamed from: a */
    private final IBinder f51533a;

    /* JADX INFO: renamed from: b */
    private final String f51534b;

    public C16360a(IBinder iBinder, String str) {
        this.f51533a = iBinder;
        this.f51534b = str;
    }

    /* JADX INFO: renamed from: a */
    public final Parcel m74989a() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f51534b);
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f51533a;
    }

    /* JADX INFO: renamed from: b */
    public final void m74990b(int i, Parcel parcel) throws RemoteException {
        try {
            this.f51533a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}

package com.google.android.gms.internal.p622authapi;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.AuthorizationResult;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes7.dex */
public interface zbj extends IInterface {
    void zbb(Status status, AuthorizationResult authorizationResult) throws RemoteException;
}

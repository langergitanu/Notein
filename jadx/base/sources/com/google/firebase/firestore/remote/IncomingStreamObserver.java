package com.google.firebase.firestore.remote;

import oO0OOo0o.C33094OoooO;
import oO0OOo0o.o00Oo0;

/* JADX INFO: loaded from: classes8.dex */
interface IncomingStreamObserver<RespT> {
    void onClose(o00Oo0 o00oo02);

    void onHeaders(C33094OoooO c33094OoooO);

    void onNext(RespT respt);

    void onOpen();
}

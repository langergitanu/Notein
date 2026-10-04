package com.aspose.slides;

import com.aspose.slides.internal.p032b1.C1569kk;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.core.FirestoreClient;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOo00 implements Continuation, o000OOO.OooO {
    public static int OooO0O0(C1569kk c1569kk) {
        return c1569kk.m8445t6().m23860uz().m54594m9();
    }

    @Override // o000OOO.OooO
    public double OooO00o(double d) {
        return d;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return FirestoreClient.lambda$getDocumentFromLocalCache$10(task);
    }
}

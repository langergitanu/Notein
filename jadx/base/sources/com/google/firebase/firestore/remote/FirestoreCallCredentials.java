package com.google.firebase.firestore.remote;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApiNotAvailableException;
import com.google.firebase.firestore.auth.CredentialsProvider;
import com.google.firebase.firestore.auth.User;
import com.google.firebase.firestore.util.Executors;
import com.google.firebase.firestore.util.Logger;
import com.google.firebase.internal.api.FirebaseNoSignedInUserException;
import java.util.BitSet;
import java.util.concurrent.Executor;
import oO0OOo0o.AbstractC33059OooO0O0;
import oO0OOo0o.C33094OoooO;
import oO0OOo0o.o00Oo0;

/* JADX INFO: loaded from: classes8.dex */
final class FirestoreCallCredentials extends AbstractC33059OooO0O0 {
    private static final C33094OoooO.AbstractC33095OooO0Oo<String> AUTHORIZATION_HEADER;
    private static final String LOG_TAG = "FirestoreCallCredentials";
    private static final C33094OoooO.AbstractC33095OooO0Oo<String> X_FIREBASE_APPCHECK;
    private final CredentialsProvider<String> appCheckProvider;
    private final CredentialsProvider<User> authProvider;

    static {
        C33094OoooO.OooO00o oooO00o = C33094OoooO.f119652OooO0Oo;
        BitSet bitSet = C33094OoooO.AbstractC33095OooO0Oo.f119657OooO0Oo;
        AUTHORIZATION_HEADER = new C33094OoooO.OooO0O0("Authorization", oooO00o);
        X_FIREBASE_APPCHECK = new C33094OoooO.OooO0O0("x-firebase-appcheck", oooO00o);
    }

    public FirestoreCallCredentials(CredentialsProvider<User> credentialsProvider, CredentialsProvider<String> credentialsProvider2) {
        this.authProvider = credentialsProvider;
        this.appCheckProvider = credentialsProvider2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$applyRequestMetadata$0(Task task, AbstractC33059OooO0O0.OooO00o oooO00o, Task task2, Task task3) {
        C33094OoooO c33094OoooO = new C33094OoooO();
        if (task.isSuccessful()) {
            String str = (String) task.getResult();
            Logger.debug(LOG_TAG, "Successfully fetched auth token.", new Object[0]);
            if (str != null) {
                c33094OoooO.OooO0o(AUTHORIZATION_HEADER, "Bearer ".concat(str));
            }
        } else {
            Exception exception = task.getException();
            if (exception instanceof FirebaseApiNotAvailableException) {
                Logger.debug(LOG_TAG, "Firebase Auth API not available, not using authentication.", new Object[0]);
            } else {
                if (!(exception instanceof FirebaseNoSignedInUserException)) {
                    Logger.warn(LOG_TAG, "Failed to get auth token: %s.", exception);
                    oooO00o.OooO0O0(o00Oo0.f119720OooOO0.OooO0oO(exception));
                    return;
                }
                Logger.debug(LOG_TAG, "No user signed in, not using authentication.", new Object[0]);
            }
        }
        if (task2.isSuccessful()) {
            String str2 = (String) task2.getResult();
            if (str2 != null && !str2.isEmpty()) {
                Logger.debug(LOG_TAG, "Successfully fetched AppCheck token.", new Object[0]);
                c33094OoooO.OooO0o(X_FIREBASE_APPCHECK, str2);
            }
        } else {
            Exception exception2 = task2.getException();
            if (!(exception2 instanceof FirebaseApiNotAvailableException)) {
                Logger.warn(LOG_TAG, "Failed to get AppCheck token: %s.", exception2);
                oooO00o.OooO0O0(o00Oo0.f119720OooOO0.OooO0oO(exception2));
                return;
            }
            Logger.debug(LOG_TAG, "Firebase AppCheck API not available.", new Object[0]);
        }
        oooO00o.OooO00o(c33094OoooO);
    }

    @Override // oO0OOo0o.AbstractC33059OooO0O0
    public void applyRequestMetadata(AbstractC33059OooO0O0.AbstractC20298OooO0O0 abstractC20298OooO0O0, Executor executor, final AbstractC33059OooO0O0.OooO00o oooO00o) {
        final Task<String> token = this.authProvider.getToken();
        final Task<String> token2 = this.appCheckProvider.getToken();
        Tasks.whenAll((Task<?>[]) new Task[]{token, token2}).addOnCompleteListener(Executors.DIRECT_EXECUTOR, new OnCompleteListener() { // from class: com.google.firebase.firestore.remote.OooOO0O
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FirestoreCallCredentials.lambda$applyRequestMetadata$0(token, oooO00o, token2, task);
            }
        });
    }

    @Override // oO0OOo0o.AbstractC33059OooO0O0
    public void thisUsesUnstableApi() {
    }
}

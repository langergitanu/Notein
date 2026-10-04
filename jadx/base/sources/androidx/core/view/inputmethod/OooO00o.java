package androidx.core.view.inputmethod;

import android.os.Bundle;
import android.view.View;
import androidx.core.view.inputmethod.InputConnectionCompat;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.appcheck.AppCheckTokenResult;
import com.google.firebase.functions.FirebaseContextProvider;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements InputConnectionCompat.OnCommitContentListener, SuccessContinuation {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f64297OooOo0o;

    public /* synthetic */ OooO00o(Object obj) {
        this.f64297OooOo0o = obj;
    }

    @Override // androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener
    public boolean onCommitContent(InputContentInfoCompat inputContentInfoCompat, int i, Bundle bundle) {
        return InputConnectionCompat.lambda$createOnCommitContentListenerUsingPerformReceiveContent$0((View) this.f64297OooOo0o, inputContentInfoCompat, i, bundle);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return FirebaseContextProvider.getAppCheckToken$lambda$4((FirebaseContextProvider) this.f64297OooOo0o, (AppCheckTokenResult) obj);
    }
}

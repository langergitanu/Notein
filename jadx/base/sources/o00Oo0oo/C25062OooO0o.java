package o00Oo0oo;

import android.os.ConditionVariable;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;

/* JADX INFO: renamed from: o00Oo0oo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25062OooO0o implements APSecuritySdk.InitResultListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ String[] f85088OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ ConditionVariable f85089OooO0O0;

    public C25062OooO0o(String[] strArr, ConditionVariable conditionVariable) {
        this.f85088OooO00o = strArr;
        this.f85089OooO0O0 = conditionVariable;
    }

    @Override // com.alipay.apmobilesecuritysdk.face.APSecuritySdk.InitResultListener
    public final void onResult(APSecuritySdk.TokenResult tokenResult) {
        if (tokenResult != null) {
            this.f85088OooO00o[0] = tokenResult.apdidToken;
        }
        this.f85089OooO0O0.open();
    }
}

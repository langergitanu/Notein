package o00OO0;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.sdk.app.PayResultActivity;
import com.hihonor.honorid.usecase.WriteHnAccountUseCase;
import java.io.File;
import java.io.FileOutputStream;
import oOO00Ooo.C34364OooO00o;
import oOO00o0.C34370OooO0o0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f84715OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f84716OooOo0o = 1;

    public /* synthetic */ OooO0OO() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f84716OooOo0o) {
            case 0:
                ((PayResultActivity) this.f84715OooOo).finish();
                break;
            default:
                WriteHnAccountUseCase writeHnAccountUseCase = (WriteHnAccountUseCase) this.f84715OooOo;
                C34370OooO0o0.OooO0Oo("WriteHnAccountUseCase", "writeHnAccount");
                Context context = writeHnAccountUseCase.f68955OooO00o;
                FileOutputStream fileOutputStream = C34364OooO00o.f123341OooO00o;
                if (context != null && !TextUtils.isEmpty("accounts.xml")) {
                    C34364OooO00o.OooO0Oo(new File(context.getFilesDir(), "accounts.xml"));
                }
                try {
                    o0O00O0o.OooO0O0.OooO0O0(context, writeHnAccountUseCase.f68956OooO0O0);
                } catch (Exception unused) {
                    C34370OooO0o0.OooO0o("WriteHnAccountUseCase", "Exception");
                }
                break;
        }
    }

    public OooO0OO(PayResultActivity payResultActivity) {
        this.f84715OooOo = payResultActivity;
    }
}

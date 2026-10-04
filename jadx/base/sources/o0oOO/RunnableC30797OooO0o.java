package o0oOO;

import OooOooO.C20741OooOOoo;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import com.alipay.sdk.app.H5PayActivity;
import com.alipay.sdk.p011m.p012x.C0200d;
import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: renamed from: o0oOO.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC30797OooO0o implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ SslErrorHandler f110081OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ H5PayActivity f110082OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C0200d f110083OooOoO0;

    /* JADX INFO: renamed from: o0oOO.OooO0o$OooO00o */
    public class OooO00o implements DialogInterface.OnClickListener {
        public OooO00o() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            RunnableC30797OooO0o runnableC30797OooO0o = RunnableC30797OooO0o.this;
            runnableC30797OooO0o.f110081OooOo.cancel();
            o00OOOOo.OooO00o.OooO0oO(runnableC30797OooO0o.f110083OooOoO0.f66861OooOoo, "net", "SSLDenied", "2");
            C20741OooOOoo.f59588OooO0O0 = C20741OooOOoo.OooO0O0();
            runnableC30797OooO0o.f110082OooOo0o.finish();
        }
    }

    public RunnableC30797OooO0o(C0200d c0200d, H5PayActivity h5PayActivity, SslErrorHandler sslErrorHandler) {
        this.f110083OooOoO0 = c0200d;
        this.f110082OooOo0o = h5PayActivity;
        this.f110081OooOo = sslErrorHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OooO00o oooO00o = new OooO00o();
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f110082OooOo0o);
        TextUtils.isEmpty(null);
        if (!TextUtils.isEmpty("确定")) {
            builder.setNegativeButton("确定", oooO00o);
        }
        builder.setTitle("安全警告");
        builder.setMessage("安全连接证书校验无效，将无法保证访问数据的安全性，请安装支付宝后重试。");
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.setCanceledOnTouchOutside(false);
        alertDialogCreate.setOnKeyListener(new DialogInterfaceOnKeyListenerC30796OooO0Oo());
        try {
            alertDialogCreate.show();
        } catch (Throwable th) {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            stringWriter.toString();
        }
    }
}

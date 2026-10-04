package o0oOO;

import android.content.Intent;
import android.net.Uri;
import android.webkit.DownloadListener;
import com.alipay.sdk.app.H5PayActivity;
import com.aspose.words.WarningType;
import com.huawei.hms.support.api.entity.common.CommonConstant;

/* JADX INFO: renamed from: o0oOO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C30799OooO0oO implements DownloadListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ H5PayActivity f110086OooO00o;

    public C30799OooO0oO(H5PayActivity h5PayActivity) {
        this.f110086OooO00o = h5PayActivity;
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str));
            intent.setFlags(WarningType.HINT);
            this.f110086OooO00o.startActivity(intent);
        } catch (Throwable unused) {
        }
    }
}

package com.huawei.hms.hwid;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Base64;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.account.result.AccountIcon;
import com.huawei.hms.support.account.result.GetChannelResult;
import com.huawei.hms.support.api.client.Status;
import o0O00OOO.C25834OooO0oO;
import org.json.JSONException;

/* JADX INFO: renamed from: com.huawei.hms.hwid.i */
/* JADX INFO: loaded from: classes8.dex */
public class C18061i extends TaskApiCall<C18055c, AccountIcon> {

    /* JADX INFO: renamed from: a */
    private Context f53970a;

    public C18061i(String str, String str2, String str3, Context context) {
        super(str, str2, str3);
        this.f53970a = context;
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(C18055c c18055c, ResponseErrorCode responseErrorCode, String str, C25834OooO0oO<AccountIcon> c25834OooO0oO) {
        C18053as.m77659b("[AccountSDK]AccountGetChannelTaskApiCall", "ResponseErrorCode.status:" + responseErrorCode.getErrorCode(), true);
        AccountIcon accountIcon = new AccountIcon();
        if (TextUtils.isEmpty(str)) {
            C18053as.m77659b("[AccountSDK]AccountGetChannelTaskApiCall", "getChannel complete, response is null, failed", true);
            c25834OooO0oO.OooO00o(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
            return;
        }
        if ("{}".equals(str)) {
            C18053as.m77659b("[AccountSDK]AccountGetChannelTaskApiCall", "getChannel complete, body is null", true);
            c25834OooO0oO.OooO00o(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
            return;
        }
        try {
            GetChannelResult getChannelResultFromJson = new GetChannelResult().fromJson(str);
            if (!getChannelResultFromJson.isSuccess()) {
                C18053as.m77659b("[AccountSDK]AccountGetChannelTaskApiCall", "getChannel failed", true);
                c25834OooO0oO.OooO00o(new ApiException(getChannelResultFromJson.getStatus()));
                return;
            }
            C18053as.m77659b("[AccountSDK]AccountGetChannelTaskApiCall", "getChannel success", true);
            accountIcon.setDescription(getChannelResultFromJson.getDescription());
            accountIcon.setIcon(m77681a(getChannelResultFromJson.getIcon()));
            c25834OooO0oO.OooO0O0(accountIcon);
            long jM77644a = C18049ao.m77644a();
            SharedPreferences.Editor editorEdit = this.f53970a.getSharedPreferences("ACCOUNT_CHANNEL_CACHE", 0).edit();
            editorEdit.putLong("cache_time", jM77644a);
            editorEdit.putString("desc", getChannelResultFromJson.getDescription());
            editorEdit.putString("icon", getChannelResultFromJson.getIcon());
            editorEdit.apply();
        } catch (JSONException unused) {
            C18053as.m77660c("[AccountSDK]AccountGetChannelTaskApiCall", "getChannel complete, but parser json exception", true);
            c25834OooO0oO.OooO00o(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
        }
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 10;
    }

    /* JADX INFO: renamed from: a */
    private Bitmap m77681a(String str) {
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (Exception e) {
            C18053as.m77661d("[AccountSDK]AccountGetChannelTaskApiCall", "stringToBitmap Exception is ".concat(e.getClass().getSimpleName()), true);
            return null;
        } catch (OutOfMemoryError unused) {
            C18053as.m77661d("[AccountSDK]AccountGetChannelTaskApiCall", "out of memory error ", true);
            return null;
        }
    }
}

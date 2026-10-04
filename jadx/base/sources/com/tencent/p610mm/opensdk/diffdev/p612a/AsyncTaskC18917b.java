package com.tencent.p610mm.opensdk.diffdev.p612a;

import OooOO0.OooO0OO;
import android.os.AsyncTask;
import android.util.Base64;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.hihonor.honorid.core.data.DeviceInfo;
import com.huawei.hms.feature.dynamic.InterfaceC17909b;
import com.tencent.p610mm.opensdk.channel.p611a.C18915a;
import com.tencent.p610mm.opensdk.diffdev.OAuthErrCode;
import com.tencent.p610mm.opensdk.diffdev.OAuthListener;
import com.tencent.p610mm.opensdk.utils.Log;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.mm.opensdk.diffdev.a.b */
/* JADX INFO: loaded from: classes10.dex */
public class AsyncTaskC18917b extends AsyncTask<Void, Void, a> {

    /* JADX INFO: renamed from: a */
    private String f58097a;

    /* JADX INFO: renamed from: b */
    private String f58098b;

    /* JADX INFO: renamed from: c */
    private String f58099c;

    /* JADX INFO: renamed from: d */
    private String f58100d;

    /* JADX INFO: renamed from: e */
    private String f58101e;

    /* JADX INFO: renamed from: f */
    private OAuthListener f58102f;

    /* JADX INFO: renamed from: g */
    private AsyncTaskC18918c f58103g;

    /* JADX INFO: renamed from: com.tencent.mm.opensdk.diffdev.a.b$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public OAuthErrCode f58104a;

        /* JADX INFO: renamed from: b */
        public String f58105b;

        /* JADX INFO: renamed from: c */
        public String f58106c;

        /* JADX INFO: renamed from: d */
        public String f58107d;

        /* JADX INFO: renamed from: e */
        public byte[] f58108e;

        private a() {
        }

        /* JADX INFO: renamed from: a */
        public static a m80576a(byte[] bArr) {
            OAuthErrCode oAuthErrCode;
            String message;
            StringBuilder sb;
            OAuthErrCode oAuthErrCode2;
            a aVar = new a();
            if (bArr == null || bArr.length == 0) {
                Log.m80584e("MicroMsg.SDK.GetQRCodeResult", "parse fail, buf is null");
                oAuthErrCode = OAuthErrCode.WechatAuth_Err_NetworkErr;
            } else {
                try {
                    try {
                        JSONObject jSONObject = new JSONObject(new String(bArr, "utf-8"));
                        int i = jSONObject.getInt(InterfaceC17909b.f53582h);
                        if (i != 0) {
                            Log.m80584e("MicroMsg.SDK.GetQRCodeResult", String.format("resp errcode = %d", Integer.valueOf(i)));
                            aVar.f58104a = OAuthErrCode.WechatAuth_Err_NormalErr;
                            jSONObject.optString("errmsg");
                            return aVar;
                        }
                        String string = jSONObject.getJSONObject("qrcode").getString("qrcodebase64");
                        if (string == null || string.length() == 0) {
                            Log.m80584e("MicroMsg.SDK.GetQRCodeResult", "parse fail, qrcodeBase64 is null");
                            oAuthErrCode2 = OAuthErrCode.WechatAuth_Err_JsonDecodeErr;
                        } else {
                            byte[] bArrDecode = Base64.decode(string, 0);
                            if (bArrDecode != null && bArrDecode.length != 0) {
                                aVar.f58104a = OAuthErrCode.WechatAuth_Err_OK;
                                aVar.f58108e = bArrDecode;
                                aVar.f58105b = jSONObject.getString(DeviceInfo.TAG_UUID);
                                String string2 = jSONObject.getString("appname");
                                aVar.f58106c = string2;
                                Log.m80583d("MicroMsg.SDK.GetQRCodeResult", String.format("parse succ, save in memory, uuid = %s, appname = %s, imgBufLength = %d", aVar.f58105b, string2, Integer.valueOf(aVar.f58108e.length)));
                                return aVar;
                            }
                            Log.m80584e("MicroMsg.SDK.GetQRCodeResult", "parse fail, qrcodeBuf is null");
                            oAuthErrCode2 = OAuthErrCode.WechatAuth_Err_JsonDecodeErr;
                        }
                        aVar.f58104a = oAuthErrCode2;
                        return aVar;
                    } catch (Exception e) {
                        message = e.getMessage();
                        sb = new StringBuilder("parse json fail, ex = ");
                        sb.append(message);
                        Log.m80584e("MicroMsg.SDK.GetQRCodeResult", sb.toString());
                        oAuthErrCode = OAuthErrCode.WechatAuth_Err_NormalErr;
                        aVar.f58104a = oAuthErrCode;
                        return aVar;
                    }
                } catch (Exception e2) {
                    message = e2.getMessage();
                    sb = new StringBuilder("parse fail, build String fail, ex = ");
                }
            }
            aVar.f58104a = oAuthErrCode;
            return aVar;
        }
    }

    public AsyncTaskC18917b(String str, String str2, String str3, String str4, String str5, OAuthListener oAuthListener) {
        this.f58097a = str;
        this.f58098b = str2;
        this.f58099c = str3;
        this.f58100d = str4;
        this.f58101e = str5;
        this.f58102f = oAuthListener;
    }

    /* JADX INFO: renamed from: a */
    public boolean m80575a() {
        Log.m80585i("MicroMsg.SDK.GetQRCodeTask", "cancelTask");
        AsyncTaskC18918c asyncTaskC18918c = this.f58103g;
        return asyncTaskC18918c == null ? cancel(true) : asyncTaskC18918c.cancel(true);
    }

    @Override // android.os.AsyncTask
    public a doInBackground(Void[] voidArr) throws Throwable {
        Thread.currentThread().setName("OpenSdkGetQRCodeTask");
        Log.m80585i("MicroMsg.SDK.GetQRCodeTask", "doInBackground");
        String str = this.f58097a;
        String str2 = this.f58099c;
        String str3 = this.f58100d;
        String str4 = this.f58098b;
        String str5 = this.f58101e;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("https://open.weixin.qq.com/connect/sdk/qrconnect?appid=", str, "&noncestr=", str2, "&timestamp=");
        OooO0OO.OooO0o0(sbOooO0O0, str3, "&scope=", str4, "&signature=");
        sbOooO0O0.append(str5);
        String string = sbOooO0O0.toString();
        long jCurrentTimeMillis = System.currentTimeMillis();
        byte[] bArrM80570a = C18915a.m80570a(string, 60000);
        Log.m80583d("MicroMsg.SDK.GetQRCodeTask", String.format("doInBackground, url = %s, time consumed = %d(ms)", string, Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
        return a.m80576a(bArrM80570a);
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(a aVar) {
        a aVar2 = aVar;
        OAuthErrCode oAuthErrCode = aVar2.f58104a;
        if (oAuthErrCode != OAuthErrCode.WechatAuth_Err_OK) {
            Log.m80584e("MicroMsg.SDK.GetQRCodeTask", "onPostExecute, get qrcode fail, OAuthErrCode = " + oAuthErrCode);
            this.f58102f.onAuthFinish(aVar2.f58104a, null);
            return;
        }
        Log.m80583d("MicroMsg.SDK.GetQRCodeTask", "onPostExecute, get qrcode success imgBufSize = " + aVar2.f58108e.length);
        this.f58102f.onAuthGotQrcode(aVar2.f58107d, aVar2.f58108e);
        AsyncTaskC18918c asyncTaskC18918c = new AsyncTaskC18918c(aVar2.f58105b, this.f58102f);
        this.f58103g = asyncTaskC18918c;
        asyncTaskC18918c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}

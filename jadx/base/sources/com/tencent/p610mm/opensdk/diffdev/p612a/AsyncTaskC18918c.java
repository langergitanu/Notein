package com.tencent.p610mm.opensdk.diffdev.p612a;

import android.os.AsyncTask;
import com.alibaba.sdk.android.oss.internal.OooO00o;
import com.tencent.p610mm.opensdk.channel.p611a.C18915a;
import com.tencent.p610mm.opensdk.diffdev.OAuthErrCode;
import com.tencent.p610mm.opensdk.diffdev.OAuthListener;
import com.tencent.p610mm.opensdk.utils.Log;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.mm.opensdk.diffdev.a.c */
/* JADX INFO: loaded from: classes10.dex */
class AsyncTaskC18918c extends AsyncTask<Void, Void, a> {

    /* JADX INFO: renamed from: a */
    private String f58109a;

    /* JADX INFO: renamed from: b */
    private String f58110b;

    /* JADX INFO: renamed from: c */
    private OAuthListener f58111c;

    /* JADX INFO: renamed from: d */
    private int f58112d;

    /* JADX INFO: renamed from: com.tencent.mm.opensdk.diffdev.a.c$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public OAuthErrCode f58113a;

        /* JADX INFO: renamed from: b */
        public String f58114b;

        /* JADX INFO: renamed from: c */
        public int f58115c;
    }

    public AsyncTaskC18918c(String str, OAuthListener oAuthListener) {
        this.f58109a = str;
        this.f58111c = oAuthListener;
        this.f58110b = OooO00o.OooO00o("https://long.open.weixin.qq.com/connect/l/qrconnect?f=json&uuid=", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00c9 A[Catch: Exception -> 0x00be, TryCatch #0 {Exception -> 0x00be, blocks: (B:20:0x0085, B:22:0x0094, B:26:0x00ad, B:28:0x00b1, B:31:0x00c0, B:35:0x00cb, B:32:0x00c3, B:33:0x00c6, B:34:0x00c9), top: B:64:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015c A[SYNTHETIC] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a doInBackground(Void[] voidArr) throws Throwable {
        a aVar;
        OAuthErrCode oAuthErrCode;
        String str;
        OAuthErrCode oAuthErrCode2;
        OAuthErrCode oAuthErrCode3;
        String message;
        StringBuilder sb;
        JSONObject jSONObject;
        int i;
        OAuthErrCode oAuthErrCode4;
        Thread.currentThread().setName("OpenSdkNoopingTask");
        String str2 = this.f58109a;
        if (str2 == null || str2.length() == 0) {
            Log.m80584e("MicroMsg.SDK.NoopingTask", "run fail, uuid is null");
            a aVar2 = new a();
            aVar2.f58113a = OAuthErrCode.WechatAuth_Err_NormalErr;
            return aVar2;
        }
        Log.m80585i("MicroMsg.SDK.NoopingTask", "doInBackground start " + isCancelled());
        while (true) {
            if (isCancelled()) {
                Log.m80585i("MicroMsg.SDK.NoopingTask", "IDiffDevOAuth.stopAuth / detach invoked");
                aVar = new a();
                oAuthErrCode = OAuthErrCode.WechatAuth_Err_Auth_Stopped;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f58110b);
                if (this.f58112d == 0) {
                    str = "";
                } else {
                    str = "&last=" + this.f58112d;
                }
                sb2.append(str);
                String string = sb2.toString();
                long jCurrentTimeMillis = System.currentTimeMillis();
                byte[] bArrM80570a = C18915a.m80570a(string, 60000);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                aVar = new a();
                Log.m80583d("MicroMsg.SDK.NoopingResult", "star parse NoopingResult");
                if (bArrM80570a == null || bArrM80570a.length == 0) {
                    Log.m80584e("MicroMsg.SDK.NoopingResult", "parse fail, buf is null");
                    oAuthErrCode2 = OAuthErrCode.WechatAuth_Err_NetworkErr;
                } else {
                    try {
                        try {
                            jSONObject = new JSONObject(new String(bArrM80570a, "utf-8"));
                            int i2 = jSONObject.getInt("wx_errcode");
                            aVar.f58115c = i2;
                            Log.m80583d("MicroMsg.SDK.NoopingResult", String.format("nooping uuidStatusCode = %d", Integer.valueOf(i2)));
                            i = aVar.f58115c;
                        } catch (Exception e) {
                            message = e.getMessage();
                            sb = new StringBuilder("parse json fail, ex = ");
                            sb.append(message);
                            Log.m80584e("MicroMsg.SDK.NoopingResult", sb.toString());
                            oAuthErrCode2 = OAuthErrCode.WechatAuth_Err_NormalErr;
                            aVar.f58113a = oAuthErrCode2;
                        }
                    } catch (Exception e2) {
                        message = e2.getMessage();
                        sb = new StringBuilder("parse fail, build String fail, ex = ");
                    }
                    if (i == 408) {
                        oAuthErrCode4 = OAuthErrCode.WechatAuth_Err_OK;
                        aVar.f58113a = oAuthErrCode4;
                        Log.m80583d("MicroMsg.SDK.NoopingTask", String.format("nooping, url = %s, errCode = %s, uuidStatusCode = %d, time consumed = %d(ms)", string, aVar.f58113a.toString(), Integer.valueOf(aVar.f58115c), Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis)));
                        oAuthErrCode3 = aVar.f58113a;
                        if (oAuthErrCode3 != OAuthErrCode.WechatAuth_Err_OK) {
                            int i3 = aVar.f58115c;
                            this.f58112d = i3;
                            if (i3 == EnumC18919d.UUID_SCANED.m80577a()) {
                                this.f58111c.onQrcodeScanned();
                            } else if (aVar.f58115c != EnumC18919d.UUID_KEEP_CONNECT.m80577a() && aVar.f58115c == EnumC18919d.UUID_CONFIRM.m80577a()) {
                                String str3 = aVar.f58114b;
                                if (str3 == null || str3.length() == 0) {
                                    Log.m80584e("MicroMsg.SDK.NoopingTask", "nooping fail, confirm with an empty code!!!");
                                    oAuthErrCode = OAuthErrCode.WechatAuth_Err_NormalErr;
                                }
                            }
                        } else {
                            Log.m80584e("MicroMsg.SDK.NoopingTask", String.format("nooping fail, errCode = %s, uuidStatusCode = %d", oAuthErrCode3.toString(), Integer.valueOf(aVar.f58115c)));
                        }
                    } else if (i != 500) {
                        switch (i) {
                            case 402:
                                oAuthErrCode4 = OAuthErrCode.WechatAuth_Err_Timeout;
                                aVar.f58113a = oAuthErrCode4;
                                break;
                            case 403:
                                oAuthErrCode4 = OAuthErrCode.WechatAuth_Err_Cancel;
                                aVar.f58113a = oAuthErrCode4;
                                break;
                            case 404:
                                break;
                            case 405:
                                aVar.f58113a = OAuthErrCode.WechatAuth_Err_OK;
                                aVar.f58114b = jSONObject.getString("wx_code");
                                break;
                            default:
                                oAuthErrCode4 = OAuthErrCode.WechatAuth_Err_NormalErr;
                                aVar.f58113a = oAuthErrCode4;
                                break;
                        }
                        Log.m80583d("MicroMsg.SDK.NoopingTask", String.format("nooping, url = %s, errCode = %s, uuidStatusCode = %d, time consumed = %d(ms)", string, aVar.f58113a.toString(), Integer.valueOf(aVar.f58115c), Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis)));
                        oAuthErrCode3 = aVar.f58113a;
                        if (oAuthErrCode3 != OAuthErrCode.WechatAuth_Err_OK) {
                        }
                    } else {
                        oAuthErrCode4 = OAuthErrCode.WechatAuth_Err_NormalErr;
                        aVar.f58113a = oAuthErrCode4;
                        Log.m80583d("MicroMsg.SDK.NoopingTask", String.format("nooping, url = %s, errCode = %s, uuidStatusCode = %d, time consumed = %d(ms)", string, aVar.f58113a.toString(), Integer.valueOf(aVar.f58115c), Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis)));
                        oAuthErrCode3 = aVar.f58113a;
                        if (oAuthErrCode3 != OAuthErrCode.WechatAuth_Err_OK) {
                        }
                    }
                }
                aVar.f58113a = oAuthErrCode2;
                Log.m80583d("MicroMsg.SDK.NoopingTask", String.format("nooping, url = %s, errCode = %s, uuidStatusCode = %d, time consumed = %d(ms)", string, aVar.f58113a.toString(), Integer.valueOf(aVar.f58115c), Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis)));
                oAuthErrCode3 = aVar.f58113a;
                if (oAuthErrCode3 != OAuthErrCode.WechatAuth_Err_OK) {
                }
            }
        }
        aVar.f58113a = oAuthErrCode;
        return aVar;
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(a aVar) {
        a aVar2 = aVar;
        this.f58111c.onAuthFinish(aVar2.f58113a, aVar2.f58114b);
    }
}

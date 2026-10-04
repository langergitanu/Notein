package com.orion.notein.wxapi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.orion.notein.MainActivity;
import com.tencent.p610mm.opensdk.modelbase.BaseReq;
import com.tencent.p610mm.opensdk.modelbase.BaseResp;
import com.tencent.p610mm.opensdk.openapi.IWXAPI;
import com.tencent.p610mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.p610mm.opensdk.openapi.WXAPIFactory;

/* JADX INFO: loaded from: classes10.dex */
public class WXPayEntryActivity extends Activity implements IWXAPIEventHandler {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public IWXAPI f80194OooOo0o;

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        Log.d("MicroMsg.WXPayEntryActivity", "onCreate. ");
        super.onCreate(bundle);
        this.f80194OooOo0o = WXAPIFactory.createWXAPI(this, "wxc4d946ffb632036e", false);
        try {
            this.f80194OooOo0o.handleIntent(getIntent(), this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        Log.d("MicroMsg.WXPayEntryActivity", "onNewIntent. " + intent);
        super.onNewIntent(intent);
        setIntent(intent);
        this.f80194OooOo0o.handleIntent(intent, this);
    }

    @Override // com.tencent.p610mm.opensdk.openapi.IWXAPIEventHandler
    public final void onReq(BaseReq baseReq) {
    }

    @Override // com.tencent.p610mm.opensdk.openapi.IWXAPIEventHandler
    public final void onResp(BaseResp baseResp) {
        Log.d("MicroMsg.WXPayEntryActivity", "onResp. " + baseResp);
        if (baseResp.getType() == 5) {
            Log.d("MicroMsg.WXPayEntryActivity", "onPayFinish. errCode=" + baseResp.errCode);
            Intent intent = new Intent(this, (Class<?>) MainActivity.class);
            intent.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            intent.putExtra("wx_pay_result", baseResp.errCode);
            startActivity(intent);
        }
        finish();
    }
}

package com.alipay.share.sdk.openapi;

import android.os.Bundle;
import android.util.Log;
import com.alipay.share.sdk.Constant;
import com.alipay.share.sdk.openapi.APMediaMessage;

/* JADX INFO: loaded from: base.apk:libs/libapshare.jar:com/alipay/share/sdk/openapi/SendMessageToZFB.class */
public class SendMessageToZFB {

    /* JADX INFO: loaded from: base.apk:libs/libapshare.jar:com/alipay/share/sdk/openapi/SendMessageToZFB$Resp.class */
    public static class Resp extends BaseResp {
        public Resp() {
        }

        public Resp(Bundle bundle) {
            fromBundle(bundle);
        }

        @Override // com.alipay.share.sdk.openapi.BaseResp
        public int getType() {
            return 1;
        }

        @Override // com.alipay.share.sdk.openapi.BaseResp
        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
        }

        @Override // com.alipay.share.sdk.openapi.BaseResp
        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
        }

        @Override // com.alipay.share.sdk.openapi.BaseResp
        final boolean checkArgs() {
            return true;
        }
    }

    /* JADX INFO: loaded from: base.apk:libs/libapshare.jar:com/alipay/share/sdk/openapi/SendMessageToZFB$Req.class */
    public static class Req extends BaseReq {
        private static final String TAG = "APSDK.SendToZFB.Req";
        public static final int ZFBSceneSession = 0;
        public static final int ZFBSceneTimeLine = 1;
        public APMediaMessage message;
        public int scene = 0;

        public Req() {
        }

        public Req(Bundle bundle) {
            fromBundle(bundle);
        }

        @Override // com.alipay.share.sdk.openapi.BaseReq
        public int getType() {
            return 1;
        }

        @Override // com.alipay.share.sdk.openapi.BaseReq
        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.message = APMediaMessage.Builder.fromBundle(bundle);
            this.scene = bundle.getInt(Constant.EXTRA_SEND_MESSAGE_SCENE);
        }

        @Override // com.alipay.share.sdk.openapi.BaseReq
        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putAll(APMediaMessage.Builder.toBundle(this.message));
            bundle.putInt(Constant.EXTRA_SEND_MESSAGE_SCENE, this.scene);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.alipay.share.sdk.openapi.BaseReq
        public final boolean checkArgs() {
            if (this.message == null) {
                Log.e(TAG, "checkArgs fail ,message is null");
                return false;
            }
            return this.message.checkArgs();
        }
    }
}

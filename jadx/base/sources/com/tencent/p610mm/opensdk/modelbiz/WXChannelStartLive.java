package com.tencent.p610mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.p610mm.opensdk.modelbase.BaseReq;
import com.tencent.p610mm.opensdk.modelbase.BaseResp;
import com.tencent.p610mm.opensdk.utils.C18923b;
import com.tencent.p610mm.opensdk.utils.Log;

/* JADX INFO: loaded from: classes10.dex */
public class WXChannelStartLive {

    public static class Req extends BaseReq {
        private static final String TAG = "MicroMsg.SDK.WXChannelStartLive.Req";
        public String liveJsonInfo;

        @Override // com.tencent.p610mm.opensdk.modelbase.BaseReq
        public boolean checkArgs() {
            if (!C18923b.m80592b(this.liveJsonInfo)) {
                return true;
            }
            Log.m80584e(TAG, "liveInfoData is null");
            return false;
        }

        @Override // com.tencent.p610mm.opensdk.modelbase.BaseReq
        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.liveJsonInfo = bundle.getString("_wxapi_finder_start_live_info_data");
        }

        @Override // com.tencent.p610mm.opensdk.modelbase.BaseReq
        public int getType() {
            return 39;
        }

        @Override // com.tencent.p610mm.opensdk.modelbase.BaseReq
        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_wxapi_finder_start_live_info_data", this.liveJsonInfo);
        }
    }

    public static class Resp extends BaseResp {
        public String extMsg;

        public Resp() {
        }

        @Override // com.tencent.p610mm.opensdk.modelbase.BaseResp
        public boolean checkArgs() {
            return true;
        }

        @Override // com.tencent.p610mm.opensdk.modelbase.BaseResp
        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.extMsg = bundle.getString("_wxapi_finder_extMsg");
        }

        @Override // com.tencent.p610mm.opensdk.modelbase.BaseResp
        public int getType() {
            return 39;
        }

        @Override // com.tencent.p610mm.opensdk.modelbase.BaseResp
        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_wxapi_finder_extMsg", this.extMsg);
        }

        public Resp(Bundle bundle) {
            fromBundle(bundle);
        }
    }
}

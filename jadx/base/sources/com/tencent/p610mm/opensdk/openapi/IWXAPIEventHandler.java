package com.tencent.p610mm.opensdk.openapi;

import com.tencent.p610mm.opensdk.modelbase.BaseReq;
import com.tencent.p610mm.opensdk.modelbase.BaseResp;

/* JADX INFO: loaded from: classes10.dex */
public interface IWXAPIEventHandler {
    void onReq(BaseReq baseReq);

    void onResp(BaseResp baseResp);
}

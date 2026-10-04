package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;

/* JADX INFO: renamed from: com.aspose.slides.xh */
/* JADX INFO: loaded from: classes3.dex */
class C14786xh {

    /* JADX INFO: renamed from: k4 */
    private sdp f50075k4;

    /* JADX INFO: renamed from: x1 */
    private int f50078x1 = -1;

    /* JADX INFO: renamed from: to */
    private long f50077to = 1;

    /* JADX INFO: renamed from: kk */
    private Dictionary<Long, Object> f50076kk = new Dictionary<>();

    public C14786xh(sdp sdpVar) {
        this.f50075k4 = sdpVar;
    }

    /* JADX INFO: renamed from: k4 */
    public sdp m73359k4() {
        return this.f50075k4;
    }

    /* JADX INFO: renamed from: x1 */
    public long m73360x1() {
        long j = this.f50077to + 1;
        this.f50077to = j;
        return j;
    }
}

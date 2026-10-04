package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.InterfaceC22256OooO0o0;
import com.huawei.hms.network.embedded.C18240k4;
import java.io.IOException;
import java.io.InputStream;
import o00OooOO.C25159OooO0oO;
import o00o000.OooOo;

/* JADX INFO: loaded from: classes5.dex */
public final class OooOO0O implements InterfaceC22256OooO0o0<InputStream> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOo f67213OooO00o;

    public static final class OooO00o implements InterfaceC22256OooO0o0.OooO00o<InputStream> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C25159OooO0oO f67214OooO00o;

        public OooO00o(C25159OooO0oO c25159OooO0oO) {
            this.f67214OooO00o = c25159OooO0oO;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC22256OooO0o0.OooO00o
        public final Class<InputStream> OooO00o() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC22256OooO0o0.OooO00o
        public final InterfaceC22256OooO0o0<InputStream> OooO0O0(InputStream inputStream) {
            return new OooOO0O(inputStream, this.f67214OooO00o);
        }
    }

    public OooOO0O(InputStream inputStream, C25159OooO0oO c25159OooO0oO) {
        OooOo oooOo = new OooOo(inputStream, c25159OooO0oO);
        this.f67213OooO00o = oooOo;
        oooOo.mark(C18240k4.f55418l);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC22256OooO0o0
    public final InputStream OooO00o() throws IOException {
        OooOo oooOo = this.f67213OooO00o;
        oooOo.reset();
        return oooOo;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC22256OooO0o0
    public final void OooO0O0() {
        this.f67213OooO00o.release();
    }
}

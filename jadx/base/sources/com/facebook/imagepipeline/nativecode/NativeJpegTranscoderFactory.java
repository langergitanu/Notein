package com.facebook.imagepipeline.nativecode;

import o00oOoOo.C25622OooO0O0;
import o00oOoOo.C25623OooO0OO;
import o00ooOO0.InterfaceC25774OooO0OO;
import o00ooOO0.InterfaceC25775OooO0Oo;

/* JADX INFO: loaded from: classes5.dex */
public class NativeJpegTranscoderFactory implements InterfaceC25775OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f67266OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f67267OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f67268OooO0OO;

    public NativeJpegTranscoderFactory(int i, boolean z, boolean z2) {
        this.f67266OooO00o = i;
        this.f67267OooO0O0 = z;
        this.f67268OooO0OO = z2;
    }

    @Override // o00ooOO0.InterfaceC25775OooO0Oo
    public InterfaceC25774OooO0OO createImageTranscoder(C25623OooO0OO c25623OooO0OO, boolean z) {
        if (c25623OooO0OO != C25622OooO0O0.f87441OooO00o) {
            return null;
        }
        NativeJpegTranscoder nativeJpegTranscoder = new NativeJpegTranscoder();
        nativeJpegTranscoder.f67264OooO00o = this.f67266OooO00o;
        nativeJpegTranscoder.f67265OooO0O0 = this.f67267OooO0O0;
        if (this.f67268OooO0OO) {
            OooO0O0.OooO00o();
        }
        return nativeJpegTranscoder;
    }
}

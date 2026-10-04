package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class OooOOO0 extends OooO0O0<InputStream> {
    @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
    public final Class<InputStream> OooO00o() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.OooO0O0
    public final InputStream OooO0o(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }

    @Override // com.bumptech.glide.load.data.OooO0O0
    public final void OooO0o0(InputStream inputStream) throws IOException {
        inputStream.close();
    }
}

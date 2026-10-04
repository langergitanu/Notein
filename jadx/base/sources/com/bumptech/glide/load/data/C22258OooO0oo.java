package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22258OooO0oo extends OooO0O0<AssetFileDescriptor> {
    @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
    public final Class<AssetFileDescriptor> OooO00o() {
        return AssetFileDescriptor.class;
    }

    @Override // com.bumptech.glide.load.data.OooO0O0
    public final AssetFileDescriptor OooO0o(AssetManager assetManager, String str) throws IOException {
        return assetManager.openFd(str);
    }

    @Override // com.bumptech.glide.load.data.OooO0O0
    public final void OooO0o0(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }
}

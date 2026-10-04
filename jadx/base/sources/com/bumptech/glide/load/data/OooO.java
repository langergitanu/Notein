package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.appcompat.widget.C21559Oooo0oO;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class OooO extends AbstractC22259OooOO0o<ParcelFileDescriptor> {
    @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
    public final Class<ParcelFileDescriptor> OooO00o() {
        return ParcelFileDescriptor.class;
    }

    @Override // com.bumptech.glide.load.data.AbstractC22259OooOO0o
    public final Object OooO0o(ContentResolver contentResolver, Uri uri) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (assetFileDescriptorOpenAssetFileDescriptor != null) {
            return assetFileDescriptorOpenAssetFileDescriptor.getParcelFileDescriptor();
        }
        throw new FileNotFoundException(C21559Oooo0oO.OooO00o(uri, "FileDescriptor is null for: "));
    }

    @Override // com.bumptech.glide.load.data.AbstractC22259OooOO0o
    public final void OooO0o0(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }
}

package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import androidx.appcompat.widget.C21559Oooo0oO;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import o00o0oOo.C25461OooO0Oo;
import o00oo.C25638OooO0oO;
import o00ooO0.C25750OooOoOO;
import o00ooO0o.C25763OooO00o;
import oO0o0O0o.C33595OooOOo;

/* JADX INFO: loaded from: classes5.dex */
public final class Oooo000 extends AbstractC22281Oooo00o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ContentResolver f67391OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(Executor executor, C25750OooOoOO pooledByteBufferFactory, ContentResolver contentResolver) {
        super(executor, pooledByteBufferFactory);
        kotlin.jvm.internal.OooOOO0.OooO0oO(executor, "executor");
        kotlin.jvm.internal.OooOOO0.OooO0oO(pooledByteBufferFactory, "pooledByteBufferFactory");
        kotlin.jvm.internal.OooOOO0.OooO0oO(contentResolver, "contentResolver");
        this.f67391OooO0OO = contentResolver;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC22281Oooo00o
    public final C25638OooO0oO OooO0OO(C25763OooO00o imageRequest) throws IOException {
        C25638OooO0oO c25638OooO0oOOooO0O0;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        InputStream inputStreamCreateInputStream;
        kotlin.jvm.internal.OooOOO0.OooO0oO(imageRequest, "imageRequest");
        Uri uri = imageRequest.f87911OooO0O0;
        kotlin.jvm.internal.OooOOO0.OooO0o(uri, "getSourceUri(...)");
        Uri uri2 = C25461OooO0Oo.f86761OooO00o;
        String path = uri.getPath();
        ContentResolver contentResolver = this.f67391OooO0OO;
        if (path == null || !FirebaseAnalytics.Param.CONTENT.equals(C25461OooO0Oo.OooO0O0(uri)) || !"com.android.contacts".equals(uri.getAuthority()) || uri.getPath().startsWith(C25461OooO0Oo.f86761OooO00o.getPath())) {
            String string = uri.toString();
            if (string.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) || string.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString())) {
                try {
                    parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
                } catch (FileNotFoundException unused) {
                    c25638OooO0oOOooO0O0 = null;
                }
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                c25638OooO0oOOooO0O0 = OooO0O0(new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()), (int) parcelFileDescriptorOpenFileDescriptor.getStatSize());
                parcelFileDescriptorOpenFileDescriptor.close();
                if (c25638OooO0oOOooO0O0 != null) {
                    return c25638OooO0oOOooO0O0;
                }
            }
            InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
            if (inputStreamOpenInputStream != null) {
                return OooO0O0(inputStreamOpenInputStream, -1);
            }
            throw new IllegalStateException("Required value was null.");
        }
        String string2 = uri.toString();
        kotlin.jvm.internal.OooOOO0.OooO0o(string2, "toString(...)");
        if (C33595OooOOo.OooOOo0(string2, "/photo", false)) {
            inputStreamCreateInputStream = contentResolver.openInputStream(uri);
        } else {
            String string3 = uri.toString();
            kotlin.jvm.internal.OooOOO0.OooO0o(string3, "toString(...)");
            if (C33595OooOOo.OooOOo0(string3, "/display_photo", false)) {
                try {
                    AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                    if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    inputStreamCreateInputStream = assetFileDescriptorOpenAssetFileDescriptor.createInputStream();
                } catch (IOException unused2) {
                    throw new IOException(C21559Oooo0oO.OooO00o(uri, "Contact photo does not exist: "));
                }
            } else {
                InputStream inputStreamOpenContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri);
                if (inputStreamOpenContactPhotoInputStream == null) {
                    throw new IOException(C21559Oooo0oO.OooO00o(uri, "Contact photo does not exist: "));
                }
                inputStreamCreateInputStream = inputStreamOpenContactPhotoInputStream;
            }
        }
        if (inputStreamCreateInputStream != null) {
            return OooO0O0(inputStreamCreateInputStream, -1);
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC22281Oooo00o
    public final String OooO0Oo() {
        return "LocalContentUriFetchProducer";
    }
}

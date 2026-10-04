package com.facebook.imagepipeline.producers;

import android.graphics.Rect;
import android.net.Uri;
import android.provider.MediaStore;
import java.io.IOException;
import o00o0oOo.C25461OooO0Oo;
import o00oo.C25638OooO0oO;
import o00ooO0o.C25763OooO00o;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22280Oooo00O extends AbstractC22281Oooo00o implements InterfaceC22305OoooooO<C25638OooO0oO> {
    static {
        new Rect(0, 0, 512, 384);
        new Rect(0, 0, 96, 96);
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC22281Oooo00o
    public final C25638OooO0oO OooO0OO(C25763OooO00o c25763OooO00o) throws IOException {
        Uri uri = c25763OooO00o.f87911OooO0O0;
        Uri uri2 = C25461OooO0Oo.f86761OooO00o;
        String string = uri.toString();
        if (string.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString())) {
            return null;
        }
        string.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString());
        return null;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC22281Oooo00o
    public final String OooO0Oo() {
        return "LocalContentUriThumbnailFetchProducer";
    }
}

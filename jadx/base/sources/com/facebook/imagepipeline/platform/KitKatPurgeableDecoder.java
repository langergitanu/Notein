package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import o00o0o.AbstractC25434OooO00o;
import o00o0o0o.InterfaceC25449OooO0oO;
import o00ooO0.OooOo00;

/* JADX INFO: loaded from: classes5.dex */
public class KitKatPurgeableDecoder extends DalvikPurgeableDecoder {
    public KitKatPurgeableDecoder(OooOo00 oooOo00) {
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public final Bitmap OooO0OO(AbstractC25434OooO00o<InterfaceC25449OooO0oO> abstractC25434OooO00o, BitmapFactory.Options options) {
        abstractC25434OooO00o.Oooo000().size();
        throw null;
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public final Bitmap OooO0Oo(AbstractC25434OooO00o<InterfaceC25449OooO0oO> abstractC25434OooO00o, int i, BitmapFactory.Options options) {
        DalvikPurgeableDecoder.OooO0o0(i, abstractC25434OooO00o);
        if (i <= abstractC25434OooO00o.Oooo000().size()) {
            throw null;
        }
        throw new IllegalArgumentException();
    }
}

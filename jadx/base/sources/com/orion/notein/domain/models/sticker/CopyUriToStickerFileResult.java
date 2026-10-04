package com.orion.notein.domain.models.sticker;

import android.net.Uri;
import com.aspose.slides.internal.p497xc.OooO00o;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m80612d2 = {"Lcom/orion/notein/domain/models/sticker/CopyUriToStickerFileResult;", "", "stickerId", "", "srcUri", "Landroid/net/Uri;", "dstPath", "svgAspectRatio", "", "<init>", "(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;F)V", "getStickerId", "()Ljava/lang/String;", "getSrcUri", "()Landroid/net/Uri;", "getDstPath", "getSvgAspectRatio", "()F", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class CopyUriToStickerFileResult {
    private final String dstPath;
    private final Uri srcUri;
    private final String stickerId;
    private final float svgAspectRatio;

    public CopyUriToStickerFileResult(String stickerId, Uri srcUri, String dstPath, float f) {
        OooOOO0.OooO0oO(stickerId, "stickerId");
        OooOOO0.OooO0oO(srcUri, "srcUri");
        OooOOO0.OooO0oO(dstPath, "dstPath");
        this.stickerId = stickerId;
        this.srcUri = srcUri;
        this.dstPath = dstPath;
        this.svgAspectRatio = f;
    }

    public static /* synthetic */ CopyUriToStickerFileResult copy$default(CopyUriToStickerFileResult copyUriToStickerFileResult, String str, Uri uri, String str2, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = copyUriToStickerFileResult.stickerId;
        }
        if ((i & 2) != 0) {
            uri = copyUriToStickerFileResult.srcUri;
        }
        if ((i & 4) != 0) {
            str2 = copyUriToStickerFileResult.dstPath;
        }
        if ((i & 8) != 0) {
            f = copyUriToStickerFileResult.svgAspectRatio;
        }
        return copyUriToStickerFileResult.copy(str, uri, str2, f);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStickerId() {
        return this.stickerId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Uri getSrcUri() {
        return this.srcUri;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDstPath() {
        return this.dstPath;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getSvgAspectRatio() {
        return this.svgAspectRatio;
    }

    public final CopyUriToStickerFileResult copy(String stickerId, Uri srcUri, String dstPath, float svgAspectRatio) {
        OooOOO0.OooO0oO(stickerId, "stickerId");
        OooOOO0.OooO0oO(srcUri, "srcUri");
        OooOOO0.OooO0oO(dstPath, "dstPath");
        return new CopyUriToStickerFileResult(stickerId, srcUri, dstPath, svgAspectRatio);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CopyUriToStickerFileResult)) {
            return false;
        }
        CopyUriToStickerFileResult copyUriToStickerFileResult = (CopyUriToStickerFileResult) other;
        return OooOOO0.OooO0O0(this.stickerId, copyUriToStickerFileResult.stickerId) && OooOOO0.OooO0O0(this.srcUri, copyUriToStickerFileResult.srcUri) && OooOOO0.OooO0O0(this.dstPath, copyUriToStickerFileResult.dstPath) && Float.compare(this.svgAspectRatio, copyUriToStickerFileResult.svgAspectRatio) == 0;
    }

    public final String getDstPath() {
        return this.dstPath;
    }

    public final Uri getSrcUri() {
        return this.srcUri;
    }

    public final String getStickerId() {
        return this.stickerId;
    }

    public final float getSvgAspectRatio() {
        return this.svgAspectRatio;
    }

    public int hashCode() {
        return Float.hashCode(this.svgAspectRatio) + OooO00o.OooO0O0((this.srcUri.hashCode() + (this.stickerId.hashCode() * 31)) * 31, 31, this.dstPath);
    }

    public String toString() {
        return "CopyUriToStickerFileResult(stickerId=" + this.stickerId + ", srcUri=" + this.srcUri + ", dstPath=" + this.dstPath + ", svgAspectRatio=" + this.svgAspectRatio + ")";
    }

    public /* synthetic */ CopyUriToStickerFileResult(String str, Uri uri, String str2, float f, int i, C24018OooO0oo c24018OooO0oo) {
        this(str, uri, str2, (i & 8) != 0 ? 1.0f : f);
    }
}

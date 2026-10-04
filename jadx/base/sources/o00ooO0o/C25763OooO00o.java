package o00ooO0o;

import android.net.Uri;
import android.os.Build;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.io.File;
import o000000o.C24085OooO0OO;
import o00o0Ooo.C25431OooO0oo;
import o00o0o0O.C25440OooO00o;
import o00o0oOo.C25461OooO0Oo;
import o00oo0O.C25651OooO00o;
import o00oo0O.C25654OooO0Oo;
import o00oo0O.EnumC25653OooO0OO;
import oO0o0O0o.C33595OooOOo;

/* JADX INFO: renamed from: o00ooO0o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25763OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooO0OO f87909OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0O0 f87910OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Uri f87911OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f87912OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public File f87913OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C25651OooO00o f87914OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f87915OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C25654OooO0Oo f87916OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final EnumC25653OooO0OO f87917OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f87918OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final boolean f87919OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final boolean f87920OooOO0o;

    /* JADX INFO: renamed from: o00ooO0o.OooO00o$OooO00o, reason: collision with other inner class name */
    public class C19716OooO00o {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: o00ooO0o.OooO00o$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO0O0 f87921OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0O0 f87922OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final /* synthetic */ OooO0O0[] f87923OooOoO0;

        static {
            OooO0O0 oooO0O0 = new OooO0O0("SMALL", 0);
            f87922OooOo0o = oooO0O0;
            OooO0O0 oooO0O02 = new OooO0O0("DEFAULT", 1);
            f87921OooOo = oooO0O02;
            f87923OooOoO0 = new OooO0O0[]{oooO0O0, oooO0O02, new OooO0O0("DYNAMIC", 2)};
        }

        public OooO0O0() {
            throw null;
        }

        public static OooO0O0 valueOf(String str) {
            return (OooO0O0) Enum.valueOf(OooO0O0.class, str);
        }

        public static OooO0O0[] values() {
            return (OooO0O0[]) f87923OooOoO0.clone();
        }
    }

    /* JADX INFO: renamed from: o00ooO0o.OooO00o$OooO0OO */
    public enum OooO0OO {
        FULL_FETCH(1),
        DISK_CACHE(2),
        /* JADX INFO: Fake field, exist only in values array */
        ENCODED_MEMORY_CACHE(3),
        BITMAP_MEMORY_CACHE(4);


        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final int f87928OooOo0o;

        OooO0OO(int i) {
            this.f87928OooOo0o = i;
        }
    }

    public C25763OooO00o(C25764OooO0O0 c25764OooO0O0) {
        this.f87910OooO00o = c25764OooO0O0.f87934OooO0o;
        Uri uri = c25764OooO0O0.f87930OooO00o;
        this.f87911OooO0O0 = uri;
        int i = -1;
        if (uri != null) {
            if (C25461OooO0Oo.OooO0OO(uri)) {
                i = 0;
            } else if (uri.getPath() != null && "file".equals(C25461OooO0Oo.OooO0O0(uri))) {
                String strOooO00o = C25440OooO00o.OooO00o(uri.getPath());
                i = strOooO00o != null ? C33595OooOOo.OooOoO0(strOooO00o, "video/", false) : false ? 2 : 3;
            } else if (FirebaseAnalytics.Param.CONTENT.equals(C25461OooO0Oo.OooO0O0(uri))) {
                i = 4;
            } else if ("asset".equals(C25461OooO0Oo.OooO0O0(uri))) {
                i = 5;
            } else if ("res".equals(C25461OooO0Oo.OooO0O0(uri))) {
                i = 6;
            } else if (Constants.ScionAnalytics.MessageType.DATA_MESSAGE.equals(uri.getScheme())) {
                i = 7;
            } else if ("android.resource".equals(C25461OooO0Oo.OooO0O0(uri))) {
                i = 8;
            }
        }
        this.f87912OooO0OO = i;
        this.f87915OooO0o0 = c25764OooO0O0.f87936OooO0oO;
        this.f87914OooO0o = c25764OooO0O0.f87935OooO0o0;
        C25654OooO0Oo c25654OooO0Oo = c25764OooO0O0.f87933OooO0Oo;
        this.f87916OooO0oO = c25654OooO0Oo == null ? C25654OooO0Oo.f87571OooO0O0 : c25654OooO0Oo;
        this.f87917OooO0oo = c25764OooO0O0.f87937OooO0oo;
        this.f87909OooO = c25764OooO0O0.f87931OooO0O0;
        boolean z = (c25764OooO0O0.f87932OooO0OO & 48) == 0 && (C25461OooO0Oo.OooO0OO(c25764OooO0O0.f87930OooO00o) || C25764OooO0O0.OooO0Oo(c25764OooO0O0.f87930OooO00o));
        this.f87919OooOO0O = z;
        int i2 = c25764OooO0O0.f87932OooO0OO;
        this.f87918OooOO0 = !z ? i2 | 48 : i2;
        this.f87920OooOO0o = (i2 & 15) == 0;
    }

    public final boolean OooO00o() {
        return Build.VERSION.SDK_INT >= 29 && this.f87915OooO0o0;
    }

    public final synchronized File OooO0O0() {
        try {
            if (this.f87913OooO0Oo == null) {
                this.f87911OooO0O0.getPath().getClass();
                this.f87913OooO0Oo = new File(this.f87911OooO0O0.getPath());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f87913OooO0Oo;
    }

    public final boolean OooO0OO(int i) {
        return (i & this.f87918OooOO0) == 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C25763OooO00o)) {
            return false;
        }
        C25763OooO00o c25763OooO00o = (C25763OooO00o) obj;
        c25763OooO00o.getClass();
        return this.f87919OooOO0O == c25763OooO00o.f87919OooOO0O && this.f87920OooOO0o == c25763OooO00o.f87920OooOO0o && C25431OooO0oo.OooO00o(this.f87911OooO0O0, c25763OooO00o.f87911OooO0O0) && C25431OooO0oo.OooO00o(this.f87910OooO00o, c25763OooO00o.f87910OooO00o) && C25431OooO0oo.OooO00o(null, null) && C25431OooO0oo.OooO00o(this.f87913OooO0Oo, c25763OooO00o.f87913OooO0Oo) && C25431OooO0oo.OooO00o(null, null) && C25431OooO0oo.OooO00o(this.f87914OooO0o, c25763OooO00o.f87914OooO0o) && C25431OooO0oo.OooO00o(null, null) && C25431OooO0oo.OooO00o(this.f87917OooO0oo, c25763OooO00o.f87917OooO0oo) && C25431OooO0oo.OooO00o(this.f87909OooO, c25763OooO00o.f87909OooO) && C25431OooO0oo.OooO00o(Integer.valueOf(this.f87918OooOO0), Integer.valueOf(c25763OooO00o.f87918OooOO0)) && C25431OooO0oo.OooO00o(null, null) && C25431OooO0oo.OooO00o(null, null) && C25431OooO0oo.OooO00o(null, null) && C25431OooO0oo.OooO00o(this.f87916OooO0oO, c25763OooO00o.f87916OooO0oO) && this.f87915OooO0o0 == c25763OooO00o.f87915OooO0o0 && C25431OooO0oo.OooO00o(null, null);
    }

    public final int hashCode() {
        return C24085OooO0OO.OooO00o(C24085OooO0OO.OooO00o(C24085OooO0OO.OooO00o(C24085OooO0OO.OooO00o(C24085OooO0OO.OooO00o(C24085OooO0OO.OooO00o(C24085OooO0OO.OooO00o(C24085OooO0OO.OooO00o(C24085OooO0OO.OooO00o(C24085OooO0OO.OooO00o(C24085OooO0OO.OooO00o(C24085OooO0OO.OooO00o(C24085OooO0OO.OooO00o(C24085OooO0OO.OooO00o(C24085OooO0OO.OooO00o(C24085OooO0OO.OooO00o(C24085OooO0OO.OooO00o(C24085OooO0OO.OooO00o(0, this.f87910OooO00o), this.f87911OooO0O0), Boolean.FALSE), null), this.f87917OooO0oo), this.f87909OooO), Integer.valueOf(this.f87918OooOO0)), Boolean.valueOf(this.f87919OooOO0O)), Boolean.valueOf(this.f87920OooOO0o)), this.f87914OooO0o), null), null), this.f87916OooO0oO), null), null), null), 0), Boolean.valueOf(this.f87915OooO0o0));
    }

    public final String toString() {
        C25431OooO0oo.OooO00o oooO00oOooO0O0 = C25431OooO0oo.OooO0O0(this);
        oooO00oOooO0O0.OooO0OO(this.f87911OooO0O0, "uri");
        oooO00oOooO0O0.OooO0OO(this.f87910OooO00o, "cacheChoice");
        oooO00oOooO0O0.OooO0OO(this.f87914OooO0o, "decodeOptions");
        oooO00oOooO0O0.OooO0OO(null, "postprocessor");
        oooO00oOooO0O0.OooO0OO(this.f87917OooO0oo, "priority");
        oooO00oOooO0O0.OooO0OO(null, "resizeOptions");
        oooO00oOooO0O0.OooO0OO(this.f87916OooO0oO, "rotationOptions");
        oooO00oOooO0O0.OooO0OO(null, "bytesRange");
        oooO00oOooO0O0.OooO0OO(null, "resizingAllowedOverride");
        oooO00oOooO0O0.OooO0OO(null, "downsampleOverride");
        oooO00oOooO0O0.OooO0O0("progressiveRenderingEnabled", false);
        oooO00oOooO0O0.OooO0O0("localThumbnailPreviewsEnabled", false);
        oooO00oOooO0O0.OooO0O0("loadThumbnailOnly", this.f87915OooO0o0);
        oooO00oOooO0O0.OooO0OO(this.f87909OooO, "lowestPermittedRequestLevel");
        oooO00oOooO0O0.OooO00o("cachesDisabled", this.f87918OooOO0);
        oooO00oOooO0O0.OooO0O0("isDiskCacheEnabled", this.f87919OooOO0O);
        oooO00oOooO0O0.OooO0O0("isMemoryCacheEnabled", this.f87920OooOO0o);
        oooO00oOooO0O0.OooO0OO(null, "decodePrefetches");
        oooO00oOooO0O0.OooO00o("delayMs", 0);
        return oooO00oOooO0O0.toString();
    }
}

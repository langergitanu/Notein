package o00o0OOo;

import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import com.microsoft.identity.common.internal.net.cache.HttpCache;
import java.io.File;
import o00o0OOO.C25400OooO0Oo;
import o00o0OOO.C25402OooO0o0;
import o00o0Oo0.C25419OooO00o;
import o00o0Ooo.InterfaceC25423OooO;

/* JADX INFO: renamed from: o00o0OOo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25409OooO0Oo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C25402OooO0o0 f86643OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f86644OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f86645OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO00o f86646OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f86647OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f86648OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f86649OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C25408OooO0OO f86650OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C25400OooO0Oo f86651OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Context f86652OooOO0;

    /* JADX INFO: renamed from: o00o0OOo.OooO0Oo$OooO00o */
    public class OooO00o implements InterfaceC25423OooO<File> {
        public OooO00o() {
        }

        @Override // o00o0Ooo.InterfaceC25423OooO
        public final File get() {
            C25409OooO0Oo c25409OooO0Oo = C25409OooO0Oo.this;
            c25409OooO0Oo.f86652OooOO0.getClass();
            return c25409OooO0Oo.f86652OooOO0.getApplicationContext().getCacheDir();
        }
    }

    /* JADX INFO: renamed from: o00o0OOo.OooO0Oo$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public OooO00o f86654OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final C25408OooO0OO f86655OooO0O0 = new C25408OooO0OO();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Context f86656OooO0OO;

        public OooO0O0(Context context) {
            this.f86656OooO0OO = context;
        }
    }

    public C25409OooO0Oo(OooO0O0 oooO0O0) {
        C25400OooO0Oo c25400OooO0Oo;
        C25402OooO0o0 c25402OooO0o0;
        Context context = oooO0O0.f86656OooO0OO;
        this.f86652OooOO0 = context;
        OooO00o oooO00o = oooO0O0.f86654OooO00o;
        if (!((oooO00o == null && context == null) ? false : true)) {
            throw new IllegalStateException("Either a non-null context or a base directory path or supplier must be provided.");
        }
        if (oooO00o == null && context != null) {
            oooO0O0.f86654OooO00o = new OooO00o();
        }
        this.f86644OooO00o = 1;
        this.f86645OooO0O0 = "image_cache";
        OooO00o oooO00o2 = oooO0O0.f86654OooO00o;
        oooO00o2.getClass();
        this.f86646OooO0OO = oooO00o2;
        this.f86647OooO0Oo = 41943040L;
        this.f86649OooO0o0 = HttpCache.DEFAULT_HTTP_CACHE_CAPACITY_BYTES;
        this.f86648OooO0o = PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE;
        this.f86650OooO0oO = oooO0O0.f86655OooO0O0;
        synchronized (C25400OooO0Oo.class) {
            try {
                if (C25400OooO0Oo.f86614OooO00o == null) {
                    C25400OooO0Oo.f86614OooO00o = new C25400OooO0Oo();
                }
                c25400OooO0Oo = C25400OooO0Oo.f86614OooO00o;
            } finally {
            }
        }
        this.f86651OooO0oo = c25400OooO0Oo;
        synchronized (C25402OooO0o0.class) {
            try {
                if (C25402OooO0o0.f86617OooO00o == null) {
                    C25402OooO0o0.f86617OooO00o = new C25402OooO0o0();
                }
                c25402OooO0o0 = C25402OooO0o0.f86617OooO00o;
            } finally {
            }
        }
        this.f86643OooO = c25402OooO0o0;
        synchronized (C25419OooO00o.class) {
            if (C25419OooO00o.f86696OooO00o == null) {
                C25419OooO00o.f86696OooO00o = new C25419OooO00o();
            }
        }
    }
}

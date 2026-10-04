package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import androidx.core.provider.FontRequest;
import androidx.core.provider.FontsContractCompat;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.OooO0OO;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o000O000.OooOO0;

/* JADX INFO: renamed from: androidx.emoji2.text.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21868OooO0o0 extends OooO0OO.AbstractC19015OooO0OO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooO00o f64726OooO0Oo = new OooO00o();

    /* JADX INFO: renamed from: androidx.emoji2.text.OooO0o0$OooO00o */
    public static class OooO00o {
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.OooO0o0$OooO0O0 */
    public static class OooO0O0 implements OooO0OO.InterfaceC21865OooO0oO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f64727OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final FontRequest f64728OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final OooO00o f64729OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Object f64730OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public ThreadPoolExecutor f64731OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Handler f64732OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public ThreadPoolExecutor f64733OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public OooO0OO.AbstractC21866OooO0oo f64734OooO0oo;

        public OooO0O0(Context context, FontRequest fontRequest) {
            OooO00o oooO00o = C21868OooO0o0.f64726OooO0Oo;
            this.f64730OooO0Oo = new Object();
            Preconditions.checkNotNull(context, "Context cannot be null");
            Preconditions.checkNotNull(fontRequest, "FontRequest cannot be null");
            this.f64727OooO00o = context.getApplicationContext();
            this.f64728OooO0O0 = fontRequest;
            this.f64729OooO0OO = oooO00o;
        }

        @Override // androidx.emoji2.text.OooO0OO.InterfaceC21865OooO0oO
        public final void OooO00o(OooO0OO.AbstractC21866OooO0oo abstractC21866OooO0oo) {
            Preconditions.checkNotNull(abstractC21866OooO0oo, "LoaderCallback cannot be null");
            synchronized (this.f64730OooO0Oo) {
                this.f64734OooO0oo = abstractC21866OooO0oo;
            }
            synchronized (this.f64730OooO0Oo) {
                try {
                    if (this.f64734OooO0oo == null) {
                        return;
                    }
                    if (this.f64731OooO0o == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new o000O000.OooO00o("emojiCompat"));
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                        this.f64733OooO0oO = threadPoolExecutor;
                        this.f64731OooO0o = threadPoolExecutor;
                    }
                    this.f64731OooO0o.execute(new OooOO0(this, 0));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void OooO0O0() {
            synchronized (this.f64730OooO0Oo) {
                try {
                    this.f64734OooO0oo = null;
                    Handler handler = this.f64732OooO0o0;
                    if (handler != null) {
                        handler.removeCallbacks(null);
                    }
                    this.f64732OooO0o0 = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f64733OooO0oO;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f64731OooO0o = null;
                    this.f64733OooO0oO = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final FontsContractCompat.FontInfo OooO0OO() {
            try {
                OooO00o oooO00o = this.f64729OooO0OO;
                Context context = this.f64727OooO00o;
                FontRequest fontRequest = this.f64728OooO0O0;
                oooO00o.getClass();
                FontsContractCompat.FontFamilyResult fontFamilyResultFetchFonts = FontsContractCompat.fetchFonts(context, null, fontRequest);
                if (fontFamilyResultFetchFonts.getStatusCode() != 0) {
                    throw new RuntimeException("fetchFonts failed (" + fontFamilyResultFetchFonts.getStatusCode() + ")");
                }
                FontsContractCompat.FontInfo[] fonts = fontFamilyResultFetchFonts.getFonts();
                if (fonts == null || fonts.length == 0) {
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                return fonts[0];
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        }
    }
}

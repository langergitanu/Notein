package o00Ooo0O;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.fragment.app.C21929Ooooo0o;
import com.bumptech.glide.C22253OooOO0o;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayList;
import o00Ooo0O.C25109OooOO0o;
import o00Ooo0o.C25119OooO0oo;
import o00Ooo0o.InterfaceC25116OooO0o;
import o00OooO.AbstractC25133OooOO0o;
import o00OooOO.InterfaceC25155OooO0O0;
import o00o0.InterfaceC25205OooO0O0;
import o00o0000.C25240OooO0OO;
import o00o00oO.C25291OooO0oO;
import o00o00oo.AbstractC25296OooO0OO;
import o00o0O0.C25316OooOO0o;
import o00o0O00.C25320OooO0Oo;

/* JADX INFO: loaded from: classes5.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final C25119OooO0oo<C25109OooOO0o> f85344OooOOo0 = C25119OooO0oo.OooO00o(C25109OooOO0o.f85338OooO0OO, "com.bumptech.glide.integration.webp.decoder.WebpFrameLoader.CacheStrategy");

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public OooO00o f85345OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C25108OooO0oo f85346OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Handler f85347OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayList f85348OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final com.bumptech.glide.OooOOO0 f85349OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f85350OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final InterfaceC25155OooO0O0 f85351OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f85352OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C22253OooOO0o<Bitmap> f85353OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f85354OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public OooO00o f85355OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public Bitmap f85356OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final int f85357OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public OooO00o f85358OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final int f85359OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final int f85360OooOOOo;

    public static class OooO00o extends AbstractC25296OooO0OO<Bitmap> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final int f85361OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Handler f85362OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public Bitmap f85363OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final long f85364OooOoO0;

        public OooO00o(Handler handler, int i, long j) {
            this.f85362OooOo0o = handler;
            this.f85361OooOo = i;
            this.f85364OooOoO0 = j;
        }

        @Override // o00o00oo.InterfaceC25293OooO
        public final void onLoadCleared(Drawable drawable) {
            this.f85363OooOoO = null;
        }

        @Override // o00o00oo.InterfaceC25293OooO
        public final void onResourceReady(Object obj, InterfaceC25205OooO0O0 interfaceC25205OooO0O0) {
            this.f85363OooOoO = (Bitmap) obj;
            Handler handler = this.f85362OooOo0o;
            handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f85364OooOoO0);
        }
    }

    public interface OooO0O0 {
        void OooO00o();
    }

    public class OooO0OO implements Handler.Callback {
        public OooO0OO() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.what;
            OooOOO0 oooOOO0 = OooOOO0.this;
            if (i == 1) {
                oooOOO0.OooO0O0((OooO00o) message.obj);
                return true;
            }
            if (i != 2) {
                return false;
            }
            oooOOO0.f85349OooO0Oo.OooO0Oo((OooO00o) message.obj);
            return false;
        }
    }

    /* JADX INFO: renamed from: o00Ooo0O.OooOOO0$OooO0Oo, reason: case insensitive filesystem */
    public static class C25110OooO0Oo implements InterfaceC25116OooO0o {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final C25320OooO0Oo f85366OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f85367OooO0OO;

        public C25110OooO0Oo(C25320OooO0Oo c25320OooO0Oo, int i) {
            this.f85366OooO0O0 = c25320OooO0Oo;
            this.f85367OooO0OO = i;
        }

        @Override // o00Ooo0o.InterfaceC25116OooO0o
        public final void OooO00o(MessageDigest messageDigest) {
            messageDigest.update(ByteBuffer.allocate(12).putInt(this.f85367OooO0OO).array());
            this.f85366OooO0O0.OooO00o(messageDigest);
        }

        @Override // o00Ooo0o.InterfaceC25116OooO0o
        public final boolean equals(Object obj) {
            if (!(obj instanceof C25110OooO0Oo)) {
                return false;
            }
            C25110OooO0Oo c25110OooO0Oo = (C25110OooO0Oo) obj;
            return this.f85366OooO0O0.equals(c25110OooO0Oo.f85366OooO0O0) && this.f85367OooO0OO == c25110OooO0Oo.f85367OooO0OO;
        }

        @Override // o00Ooo0o.InterfaceC25116OooO0o
        public final int hashCode() {
            return (this.f85366OooO0O0.f86167OooO0O0.hashCode() * 31) + this.f85367OooO0OO;
        }
    }

    public OooOOO0(com.bumptech.glide.OooO0OO oooO0OO, C25108OooO0oo c25108OooO0oo, int i, int i2, C25240OooO0OO c25240OooO0OO, Bitmap bitmap) {
        InterfaceC25155OooO0O0 interfaceC25155OooO0O0 = oooO0OO.f67114OooOo0o;
        com.bumptech.glide.OooO0o oooO0o = oooO0OO.f67116OooOoO0;
        com.bumptech.glide.OooOOO0 oooOOO0OooO0Oo = com.bumptech.glide.OooO0OO.OooO0Oo(oooO0o.getBaseContext());
        C22253OooOO0o<Bitmap> c22253OooOO0oOooO00o = com.bumptech.glide.OooO0OO.OooO0Oo(oooO0o.getBaseContext()).OooO0O0().OooO00o(((C25291OooO0oO) new C25291OooO0oO().OooO0oO(AbstractC25133OooOO0o.f85488OooO00o).Oooo0o0()).OooOoo(true).OooOo00(i, i2));
        this.f85348OooO0OO = new ArrayList();
        this.f85350OooO0o = false;
        this.f85352OooO0oO = false;
        this.f85349OooO0Oo = oooOOO0OooO0Oo;
        Handler handler = new Handler(Looper.getMainLooper(), new OooO0OO());
        this.f85351OooO0o0 = interfaceC25155OooO0O0;
        this.f85347OooO0O0 = handler;
        this.f85353OooO0oo = c22253OooOO0oOooO00o;
        this.f85346OooO00o = c25108OooO0oo;
        C21929Ooooo0o.OooO0OO(c25240OooO0OO, "Argument must not be null");
        this.f85356OooOO0o = bitmap;
        this.f85353OooO0oo = this.f85353OooO0oo.OooO00o(new C25291OooO0oO().Oooo00O(c25240OooO0OO, true));
        this.f85357OooOOO = C25316OooOO0o.OooO0OO(bitmap);
        this.f85359OooOOOO = bitmap.getWidth();
        this.f85360OooOOOo = bitmap.getHeight();
    }

    public final void OooO00o() {
        int i;
        if (!this.f85350OooO0o || this.f85352OooO0oO) {
            return;
        }
        OooO00o oooO00o = this.f85358OooOOO0;
        if (oooO00o != null) {
            this.f85358OooOOO0 = null;
            OooO0O0(oooO00o);
            return;
        }
        this.f85352OooO0oO = true;
        C25108OooO0oo c25108OooO0oo = this.f85346OooO00o;
        int[] iArr = c25108OooO0oo.f85318OooO0o0;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) ((iArr.length == 0 || (i = c25108OooO0oo.f85316OooO0Oo) < 0) ? 0 : (i < 0 || i >= iArr.length) ? -1 : iArr[i]));
        c25108OooO0oo.OooO0O0();
        int i2 = c25108OooO0oo.f85316OooO0Oo;
        this.f85355OooOO0O = new OooO00o(this.f85347OooO0O0, i2, jUptimeMillis);
        C22253OooOO0o<Bitmap> c22253OooOO0oOoooOo0 = this.f85353OooO0oo.OooO00o(new C25291OooO0oO().OooOoo0(new C25110OooO0Oo(new C25320OooO0Oo(c25108OooO0oo), i2)).OooOoo(c25108OooO0oo.f85322OooOO0O.f85339OooO00o == C25109OooOO0o.OooO00o.f85341OooOo0o)).OoooOo0(c25108OooO0oo);
        c22253OooOO0oOoooOo0.OoooO0O(this.f85355OooOO0O, c22253OooOO0oOoooOo0);
    }

    public final void OooO0O0(OooO00o oooO00o) {
        this.f85352OooO0oO = false;
        boolean z = this.f85354OooOO0;
        Handler handler = this.f85347OooO0O0;
        if (z) {
            handler.obtainMessage(2, oooO00o).sendToTarget();
            return;
        }
        if (!this.f85350OooO0o) {
            this.f85358OooOOO0 = oooO00o;
            return;
        }
        if (oooO00o.f85363OooOoO != null) {
            Bitmap bitmap = this.f85356OooOO0o;
            if (bitmap != null) {
                this.f85351OooO0o0.OooO00o(bitmap);
                this.f85356OooOO0o = null;
            }
            OooO00o oooO00o2 = this.f85345OooO;
            this.f85345OooO = oooO00o;
            ArrayList arrayList = this.f85348OooO0OO;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                try {
                    OooO0O0 oooO0O0 = (OooO0O0) arrayList.get(size);
                    if (oooO0O0 != null) {
                        oooO0O0.OooO00o();
                    }
                } catch (IndexOutOfBoundsException e) {
                    e.printStackTrace();
                }
            }
            if (oooO00o2 != null) {
                handler.obtainMessage(2, oooO00o2).sendToTarget();
            }
        }
        OooO00o();
    }
}

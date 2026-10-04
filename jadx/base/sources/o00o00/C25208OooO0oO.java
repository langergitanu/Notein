package o00o00;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.fragment.app.C21929Ooooo0o;
import com.bumptech.glide.C22253OooOO0o;
import com.bumptech.glide.OooOOO0;
import java.util.ArrayList;
import o00Ooo0.C25099OooO0o0;
import o00Ooo0o.InterfaceC25123OooOOO0;
import o00OooO.AbstractC25133OooOO0o;
import o00OooOO.InterfaceC25155OooO0O0;
import o00o0.InterfaceC25205OooO0O0;
import o00o0000.C25240OooO0OO;
import o00o00oO.C25291OooO0oO;
import o00o00oo.AbstractC25296OooO0OO;
import o00o0O0.C25316OooOO0o;
import o00o0O00.C25320OooO0Oo;

/* JADX INFO: renamed from: o00o00.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25208OooO0oO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public OooO00o f85831OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C25099OooO0o0 f85832OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Handler f85833OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayList f85834OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOOO0 f85835OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f85836OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final InterfaceC25155OooO0O0 f85837OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f85838OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public C22253OooOO0o<Bitmap> f85839OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f85840OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public OooO00o f85841OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public Bitmap f85842OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public OooO00o f85843OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public InterfaceC25123OooOOO0<Bitmap> f85844OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f85845OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f85846OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f85847OooOOo0;

    /* JADX INFO: renamed from: o00o00.OooO0oO$OooO00o */
    public static class OooO00o extends AbstractC25296OooO0OO<Bitmap> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final int f85848OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Handler f85849OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public Bitmap f85850OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final long f85851OooOoO0;

        public OooO00o(Handler handler, int i, long j) {
            this.f85849OooOo0o = handler;
            this.f85848OooOo = i;
            this.f85851OooOoO0 = j;
        }

        @Override // o00o00oo.InterfaceC25293OooO
        public final void onLoadCleared(Drawable drawable) {
            this.f85850OooOoO = null;
        }

        @Override // o00o00oo.InterfaceC25293OooO
        public final void onResourceReady(Object obj, InterfaceC25205OooO0O0 interfaceC25205OooO0O0) {
            this.f85850OooOoO = (Bitmap) obj;
            Handler handler = this.f85849OooOo0o;
            handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f85851OooOoO0);
        }
    }

    /* JADX INFO: renamed from: o00o00.OooO0oO$OooO0O0 */
    public interface OooO0O0 {
        void OooO00o();
    }

    /* JADX INFO: renamed from: o00o00.OooO0oO$OooO0OO */
    public class OooO0OO implements Handler.Callback {
        public OooO0OO() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.what;
            C25208OooO0oO c25208OooO0oO = C25208OooO0oO.this;
            if (i == 1) {
                c25208OooO0oO.OooO0O0((OooO00o) message.obj);
                return true;
            }
            if (i != 2) {
                return false;
            }
            c25208OooO0oO.f85835OooO0Oo.OooO0Oo((OooO00o) message.obj);
            return false;
        }
    }

    public C25208OooO0oO(com.bumptech.glide.OooO0OO oooO0OO, C25099OooO0o0 c25099OooO0o0, int i, int i2, C25240OooO0OO c25240OooO0OO, Bitmap bitmap) {
        InterfaceC25155OooO0O0 interfaceC25155OooO0O0 = oooO0OO.f67114OooOo0o;
        com.bumptech.glide.OooO0o oooO0o = oooO0OO.f67116OooOoO0;
        OooOOO0 oooOOO0OooO0Oo = com.bumptech.glide.OooO0OO.OooO0Oo(oooO0o.getBaseContext());
        C22253OooOO0o<Bitmap> c22253OooOO0oOooo0oO = com.bumptech.glide.OooO0OO.OooO0Oo(oooO0o.getBaseContext()).OooO0O0().OooO00o(((C25291OooO0oO) new C25291OooO0oO().OooO0oO(AbstractC25133OooOO0o.f85488OooO00o).Oooo0o0()).OooOoo(true).OooOo00(i, i2));
        this.f85834OooO0OO = new ArrayList();
        this.f85835OooO0Oo = oooOOO0OooO0Oo;
        Handler handler = new Handler(Looper.getMainLooper(), new OooO0OO());
        this.f85837OooO0o0 = interfaceC25155OooO0O0;
        this.f85833OooO0O0 = handler;
        this.f85839OooO0oo = c22253OooOO0oOooo0oO;
        this.f85832OooO00o = c25099OooO0o0;
        OooO0OO(c25240OooO0OO, bitmap);
    }

    public final void OooO00o() {
        int i;
        if (!this.f85836OooO0o || this.f85838OooO0oO) {
            return;
        }
        OooO00o oooO00o = this.f85843OooOOO;
        if (oooO00o != null) {
            this.f85843OooOOO = null;
            OooO0O0(oooO00o);
            return;
        }
        this.f85838OooO0oO = true;
        C25099OooO0o0 c25099OooO0o0 = this.f85832OooO00o;
        o00Ooo0.OooO0OO oooO0OO = c25099OooO0o0.f85246OooOO0o;
        int i2 = oooO0OO.f85223OooO0OO;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) ((i2 <= 0 || (i = c25099OooO0o0.f85245OooOO0O) < 0) ? 0 : (i < 0 || i >= i2) ? -1 : ((o00Ooo0.OooO0O0) oooO0OO.f85226OooO0o0.get(i)).f85209OooO));
        c25099OooO0o0.OooO0O0();
        this.f85841OooOO0O = new OooO00o(this.f85833OooO0O0, c25099OooO0o0.f85245OooOO0O, jUptimeMillis);
        C22253OooOO0o<Bitmap> c22253OooOO0oOoooOo0 = this.f85839OooO0oo.OooO00o(new C25291OooO0oO().OooOoo0(new C25320OooO0Oo(Double.valueOf(Math.random())))).OoooOo0(c25099OooO0o0);
        c22253OooOO0oOoooOo0.OoooO0O(this.f85841OooOO0O, c22253OooOO0oOoooOo0);
    }

    public final void OooO0O0(OooO00o oooO00o) {
        this.f85838OooO0oO = false;
        boolean z = this.f85840OooOO0;
        Handler handler = this.f85833OooO0O0;
        if (z) {
            handler.obtainMessage(2, oooO00o).sendToTarget();
            return;
        }
        if (!this.f85836OooO0o) {
            this.f85843OooOOO = oooO00o;
            return;
        }
        if (oooO00o.f85850OooOoO != null) {
            Bitmap bitmap = this.f85842OooOO0o;
            if (bitmap != null) {
                this.f85837OooO0o0.OooO00o(bitmap);
                this.f85842OooOO0o = null;
            }
            OooO00o oooO00o2 = this.f85831OooO;
            this.f85831OooO = oooO00o;
            ArrayList arrayList = this.f85834OooO0OO;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((OooO0O0) arrayList.get(size)).OooO00o();
            }
            if (oooO00o2 != null) {
                handler.obtainMessage(2, oooO00o2).sendToTarget();
            }
        }
        OooO00o();
    }

    public final void OooO0OO(InterfaceC25123OooOOO0<Bitmap> interfaceC25123OooOOO0, Bitmap bitmap) {
        C21929Ooooo0o.OooO0OO(interfaceC25123OooOOO0, "Argument must not be null");
        this.f85844OooOOO0 = interfaceC25123OooOOO0;
        C21929Ooooo0o.OooO0OO(bitmap, "Argument must not be null");
        this.f85842OooOO0o = bitmap;
        this.f85839OooO0oo = this.f85839OooO0oo.OooO00o(new C25291OooO0oO().Oooo00O(interfaceC25123OooOOO0, true));
        this.f85845OooOOOO = C25316OooOO0o.OooO0OO(bitmap);
        this.f85846OooOOOo = bitmap.getWidth();
        this.f85847OooOOo0 = bitmap.getHeight();
    }
}

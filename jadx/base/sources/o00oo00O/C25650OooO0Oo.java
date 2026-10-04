package o00oo00O;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.facebook.animated.webp.WebPFrame;
import o00o0o.AbstractC25434OooO00o;
import o00oOoo0.C25627OooO0O0;
import o00oOoo0.C25629OooO0Oo;
import o00oOoo0.InterfaceC25626OooO00o;
import o00oOoo0.InterfaceC25628OooO0OO;

/* JADX INFO: renamed from: o00oo00O.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25650OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC25626OooO00o f87553OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f87554OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Paint f87555OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f87556OooO0Oo;

    /* JADX INFO: renamed from: o00oo00O.OooO0Oo$OooO00o */
    public interface OooO00o {
        void OooO00o(Bitmap bitmap);

        AbstractC25434OooO00o<Bitmap> OooO0O0(int i);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: o00oo00O.OooO0Oo$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO0O0 f87557OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0O0 f87558OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final OooO0O0 f87559OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO0O0 f87560OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public static final /* synthetic */ OooO0O0[] f87561OooOoOO;

        static {
            OooO0O0 oooO0O0 = new OooO0O0("REQUIRED", 0);
            f87558OooOo0o = oooO0O0;
            OooO0O0 oooO0O02 = new OooO0O0("NOT_REQUIRED", 1);
            f87557OooOo = oooO0O02;
            OooO0O0 oooO0O03 = new OooO0O0("SKIP", 2);
            f87560OooOoO0 = oooO0O03;
            OooO0O0 oooO0O04 = new OooO0O0("ABORT", 3);
            f87559OooOoO = oooO0O04;
            f87561OooOoOO = new OooO0O0[]{oooO0O0, oooO0O02, oooO0O03, oooO0O04};
        }

        public OooO0O0() {
            throw null;
        }

        public static OooO0O0 valueOf(String str) {
            return (OooO0O0) Enum.valueOf(OooO0O0.class, str);
        }

        public static OooO0O0[] values() {
            return (OooO0O0[]) f87561OooOoOO.clone();
        }
    }

    public C25650OooO0Oo(InterfaceC25626OooO00o interfaceC25626OooO00o, boolean z, OooO00o oooO00o) {
        this.f87553OooO00o = interfaceC25626OooO00o;
        this.f87554OooO0O0 = oooO00o;
        this.f87556OooO0Oo = z;
        Paint paint = new Paint();
        this.f87555OooO0OO = paint;
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final void OooO00o(Canvas canvas, C25627OooO0O0 c25627OooO0O0) {
        canvas.drawRect(c25627OooO0O0.f87461OooO00o, c25627OooO0O0.f87462OooO0O0, r0 + c25627OooO0O0.f87463OooO0OO, r1 + c25627OooO0O0.f87464OooO0Oo, this.f87555OooO0OO);
    }

    public final boolean OooO0O0(C25627OooO0O0 c25627OooO0O0) {
        if (c25627OooO0O0.f87461OooO00o != 0 || c25627OooO0O0.f87462OooO0O0 != 0) {
            return false;
        }
        C25647OooO00o c25647OooO00o = (C25647OooO00o) this.f87553OooO00o;
        if (c25627OooO0O0.f87463OooO0OO == c25647OooO00o.f87538OooO0Oo.width()) {
            return c25627OooO0O0.f87464OooO0Oo == c25647OooO00o.f87538OooO0Oo.height();
        }
        return false;
    }

    public final boolean OooO0OO(int i) {
        if (i == 0) {
            return true;
        }
        InterfaceC25626OooO00o interfaceC25626OooO00o = this.f87553OooO00o;
        C25627OooO0O0 c25627OooO0O0 = ((C25647OooO00o) interfaceC25626OooO00o).f87541OooO0oO[i];
        C25627OooO0O0 c25627OooO0O02 = ((C25647OooO00o) interfaceC25626OooO00o).f87541OooO0oO[i - 1];
        if (c25627OooO0O0.f87466OooO0o0 == C25627OooO0O0.OooO00o.f87467OooOo && OooO0O0(c25627OooO0O0)) {
            return true;
        }
        return c25627OooO0O02.f87465OooO0o == C25627OooO0O0.EnumC19713OooO0O0.f87470OooOo && OooO0O0(c25627OooO0O02);
    }

    public final void OooO0Oo(int i, Bitmap bitmap) {
        C25627OooO0O0.OooO00o oooO00o;
        InterfaceC25626OooO00o interfaceC25626OooO00o = this.f87553OooO00o;
        boolean z = this.f87556OooO0Oo;
        if (z) {
            Canvas canvas = new Canvas(bitmap);
            C25647OooO00o c25647OooO00o = (C25647OooO00o) interfaceC25626OooO00o;
            InterfaceC25628OooO0OO interfaceC25628OooO0OO = c25647OooO00o.f87537OooO0OO;
            WebPFrame webPFrameOooO0o = interfaceC25628OooO0OO.OooO0o(i);
            C25627OooO0O0 c25627OooO0O0OooO0oO = interfaceC25628OooO0OO.OooO0oO(i);
            C25627OooO0O0 c25627OooO0O0OooO0oO2 = i != 0 ? interfaceC25628OooO0OO.OooO0oO(i - 1) : null;
            try {
                if (webPFrameOooO0o.OooO0OO() > 0 && webPFrameOooO0o.OooO0O0() > 0) {
                    c25647OooO00o.OooO0o0(canvas, webPFrameOooO0o, c25627OooO0O0OooO0oO, c25627OooO0O0OooO0oO2);
                    return;
                }
                return;
            } finally {
                webPFrameOooO0o.OooO00o();
            }
        }
        Canvas canvas2 = new Canvas(bitmap);
        int i2 = 0;
        canvas2.drawColor(0, PorterDuff.Mode.SRC);
        boolean zOooO0OO = OooO0OO(i);
        OooO00o oooO00o2 = this.f87554OooO0O0;
        C25627OooO0O0.EnumC19713OooO0O0 enumC19713OooO0O0 = C25627OooO0O0.EnumC19713OooO0O0.f87473OooOoO0;
        C25627OooO0O0.EnumC19713OooO0O0 enumC19713OooO0O02 = C25627OooO0O0.EnumC19713OooO0O0.f87470OooOo;
        if (zOooO0OO) {
            i2 = i;
        } else {
            int i3 = i - 1;
            while (true) {
                if (i3 < 0) {
                    break;
                }
                C25647OooO00o c25647OooO00o2 = (C25647OooO00o) interfaceC25626OooO00o;
                C25627OooO0O0 c25627OooO0O0 = c25647OooO00o2.f87541OooO0oO[i3];
                C25627OooO0O0.EnumC19713OooO0O0 enumC19713OooO0O03 = c25627OooO0O0.f87465OooO0o;
                C25627OooO0O0.EnumC19713OooO0O0 enumC19713OooO0O04 = C25627OooO0O0.EnumC19713OooO0O0.f87471OooOo0o;
                OooO0O0 oooO0O0 = OooO0O0.f87558OooOo0o;
                if (enumC19713OooO0O03 != enumC19713OooO0O04) {
                    if (enumC19713OooO0O03 != enumC19713OooO0O02) {
                        oooO0O0 = enumC19713OooO0O03 == enumC19713OooO0O0 ? OooO0O0.f87560OooOoO0 : OooO0O0.f87559OooOoO;
                    } else if (OooO0O0(c25627OooO0O0)) {
                        oooO0O0 = OooO0O0.f87557OooOo;
                    }
                }
                int iOrdinal = oooO0O0.ordinal();
                if (iOrdinal == 0) {
                    C25627OooO0O0 c25627OooO0O02 = c25647OooO00o2.f87541OooO0oO[i3];
                    AbstractC25434OooO00o<Bitmap> abstractC25434OooO00oOooO0O0 = oooO00o2.OooO0O0(i3);
                    if (abstractC25434OooO00oOooO0O0 != null) {
                        try {
                            canvas2.drawBitmap(abstractC25434OooO00oOooO0O0.Oooo000(), 0.0f, 0.0f, (Paint) null);
                            if (c25627OooO0O02.f87465OooO0o == enumC19713OooO0O02) {
                                OooO00o(canvas2, c25627OooO0O02);
                            }
                            i2 = i3 + 1;
                        } finally {
                            if (!z) {
                                abstractC25434OooO00oOooO0O0.close();
                            }
                        }
                    } else if (OooO0OO(i3)) {
                        break;
                    } else {
                        i3--;
                    }
                } else if (iOrdinal == 1) {
                    i2 = i3 + 1;
                    break;
                } else if (iOrdinal == 3) {
                    break;
                } else {
                    i3--;
                }
            }
            i2 = i3;
        }
        while (true) {
            oooO00o = C25627OooO0O0.OooO00o.f87467OooOo;
            if (i2 >= i) {
                break;
            }
            C25647OooO00o c25647OooO00o3 = (C25647OooO00o) interfaceC25626OooO00o;
            C25627OooO0O0 c25627OooO0O03 = c25647OooO00o3.f87541OooO0oO[i2];
            C25627OooO0O0.EnumC19713OooO0O0 enumC19713OooO0O05 = c25627OooO0O03.f87465OooO0o;
            if (enumC19713OooO0O05 != enumC19713OooO0O0) {
                if (c25627OooO0O03.f87466OooO0o0 == oooO00o) {
                    OooO00o(canvas2, c25627OooO0O03);
                }
                c25647OooO00o3.OooO0OO(canvas2, i2);
                oooO00o2.getClass();
                if (enumC19713OooO0O05 == enumC19713OooO0O02) {
                    OooO00o(canvas2, c25627OooO0O03);
                }
            }
            i2++;
        }
        C25647OooO00o c25647OooO00o4 = (C25647OooO00o) interfaceC25626OooO00o;
        C25627OooO0O0 c25627OooO0O04 = c25647OooO00o4.f87541OooO0oO[i];
        if (c25627OooO0O04.f87466OooO0o0 == oooO00o) {
            OooO00o(canvas2, c25627OooO0O04);
        }
        c25647OooO00o4.OooO0OO(canvas2, i);
        C25629OooO0Oo c25629OooO0Oo = c25647OooO00o4.f87536OooO0O0;
    }
}

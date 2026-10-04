package o0oooOOo;

import android.content.Context;
import com.aspose.words.ControlChar;
import o0oooOo.AbstractActivityC31852OooO0O0;

/* JADX INFO: renamed from: o0oooOOo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31845OooO0Oo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final String f113482OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f113483OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f113484OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f113485OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Boolean f113486OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final String f113487OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Class<? extends AbstractActivityC31852OooO0O0> f113488OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f113489OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Context f113490OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Boolean f113491OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final Boolean f113492OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final Boolean f113493OooOO0o;

    /* JADX INFO: renamed from: o0oooOOo.OooO0Oo$OooO00o */
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public String f113494OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int[] f113495OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f113496OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public String f113497OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Boolean f113498OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public String f113499OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Class<? extends AbstractActivityC31852OooO0O0> f113500OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f113501OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public Context f113502OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public Boolean f113503OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public Boolean f113504OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public Boolean f113505OooOO0o;
    }

    public C31845OooO0Oo(OooO00o oooO00o) {
        String string;
        int[] iArr = oooO00o.f113495OooO00o;
        if (iArr == null || iArr.length <= 0) {
            string = null;
        } else {
            StringBuilder sb = new StringBuilder();
            int length = iArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = iArr[i];
                int i4 = i2 + 1;
                if (i2 > 0) {
                    sb.append(ControlChar.SPACE_CHAR);
                }
                sb.append(i3);
                i++;
                i2 = i4;
            }
            string = sb.toString();
        }
        this.f113483OooO00o = string;
        this.f113484OooO0O0 = oooO00o.f113496OooO0O0;
        this.f113485OooO0OO = oooO00o.f113497OooO0OO;
        this.f113486OooO0Oo = oooO00o.f113498OooO0Oo;
        this.f113488OooO0o0 = oooO00o.f113500OooO0o0;
        this.f113487OooO0o = oooO00o.f113499OooO0o;
        this.f113489OooO0oO = oooO00o.f113501OooO0oO;
        this.f113490OooO0oo = oooO00o.f113502OooO0oo;
        this.f113482OooO = oooO00o.f113494OooO;
        this.f113491OooOO0 = oooO00o.f113503OooOO0;
        this.f113492OooOO0O = oooO00o.f113504OooOO0O;
        this.f113493OooOO0o = oooO00o.f113505OooOO0o;
    }
}

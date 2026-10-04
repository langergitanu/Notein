package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: renamed from: androidx.recyclerview.widget.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C22059Oooo00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0O0 f66042OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f66043OooO0O0;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.Oooo00o$OooO00o */
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f66044OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f66045OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f66046OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f66047OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f66048OooO0o0;

        public final boolean OooO00o() {
            int i = this.f66044OooO00o;
            int i2 = 2;
            if ((i & 7) != 0) {
                int i3 = this.f66047OooO0Oo;
                int i4 = this.f66045OooO0O0;
                if (((i3 > i4 ? 1 : i3 == i4 ? 2 : 4) & i) == 0) {
                    return false;
                }
            }
            if ((i & 112) != 0) {
                int i5 = this.f66047OooO0Oo;
                int i6 = this.f66046OooO0OO;
                if ((((i5 > i6 ? 1 : i5 == i6 ? 2 : 4) << 4) & i) == 0) {
                    return false;
                }
            }
            if ((i & 1792) != 0) {
                int i7 = this.f66048OooO0o0;
                int i8 = this.f66045OooO0O0;
                if ((((i7 > i8 ? 1 : i7 == i8 ? 2 : 4) << 8) & i) == 0) {
                    return false;
                }
            }
            if ((i & 28672) != 0) {
                int i9 = this.f66048OooO0o0;
                int i10 = this.f66046OooO0OO;
                if (i9 > i10) {
                    i2 = 1;
                } else if (i9 != i10) {
                    i2 = 4;
                }
                if ((i & (i2 << 12)) == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.Oooo00o$OooO0O0 */
    public interface OooO0O0 {
        int OooO00o();

        int OooO0O0();

        View OooO0OO(int i);

        int OooO0Oo(View view);

        int OooO0o0(View view);
    }

    public C22059Oooo00o(OooO0O0 oooO0O0) {
        this.f66042OooO00o = oooO0O0;
        OooO00o oooO00o = new OooO00o();
        oooO00o.f66044OooO00o = 0;
        this.f66043OooO0O0 = oooO00o;
    }

    public final View OooO00o(int i, int i2, int i3, int i4) {
        OooO0O0 oooO0O0 = this.f66042OooO00o;
        int iOooO00o = oooO0O0.OooO00o();
        int iOooO0O0 = oooO0O0.OooO0O0();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewOooO0OO = oooO0O0.OooO0OO(i);
            int iOooO0Oo = oooO0O0.OooO0Oo(viewOooO0OO);
            int iOooO0o0 = oooO0O0.OooO0o0(viewOooO0OO);
            OooO00o oooO00o = this.f66043OooO0O0;
            oooO00o.f66045OooO0O0 = iOooO00o;
            oooO00o.f66046OooO0OO = iOooO0O0;
            oooO00o.f66047OooO0Oo = iOooO0Oo;
            oooO00o.f66048OooO0o0 = iOooO0o0;
            if (i3 != 0) {
                oooO00o.f66044OooO00o = i3;
                if (oooO00o.OooO00o()) {
                    return viewOooO0OO;
                }
            }
            if (i4 != 0) {
                oooO00o.f66044OooO00o = i4;
                if (oooO00o.OooO00o()) {
                    view = viewOooO0OO;
                }
            }
            i += i5;
        }
        return view;
    }

    public final boolean OooO0O0(View view) {
        OooO0O0 oooO0O0 = this.f66042OooO00o;
        int iOooO00o = oooO0O0.OooO00o();
        int iOooO0O0 = oooO0O0.OooO0O0();
        int iOooO0Oo = oooO0O0.OooO0Oo(view);
        int iOooO0o0 = oooO0O0.OooO0o0(view);
        OooO00o oooO00o = this.f66043OooO0O0;
        oooO00o.f66045OooO0O0 = iOooO00o;
        oooO00o.f66046OooO0OO = iOooO0O0;
        oooO00o.f66047OooO0Oo = iOooO0Oo;
        oooO00o.f66048OooO0o0 = iOooO0o0;
        oooO00o.f66044OooO00o = 24579;
        return oooO00o.OooO00o();
    }
}

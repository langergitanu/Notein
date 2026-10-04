package Oooo0;

import oo0o0Oo.C34680OooO0O0;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f60136OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooO00o f60137OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OooO00o f60138OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f60139OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f60140OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Long f60141OooO0o0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public OooO00o f60142OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public o00000.Oooo0 f60143OooO0O0;
    }

    public o000O0O0() {
        this(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO00o(o00000.Oooo0 oooo0) {
        OooO00o oooO00o;
        this.f60140OooO0o = false;
        OooO00o oooO00o2 = this.f60137OooO0O0;
        if (oooo0.equals(oooO00o2 != null ? oooO00o2.f60143OooO0O0 : null)) {
            return;
        }
        C34680OooO0O0 c34680OooO0O0 = oooo0.f81083OooO00o;
        String str = c34680OooO0O0.f124887OooOo0o;
        OooO00o oooO00o3 = this.f60137OooO0O0;
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(str, oooO00o3 != null ? oooO00o3.f60143OooO0O0.f81083OooO00o.f124887OooOo0o : null)) {
            OooO00o oooO00o4 = this.f60137OooO0O0;
            if (oooO00o4 == null) {
                return;
            }
            oooO00o4.f60143OooO0O0 = oooo0;
            return;
        }
        OooO00o oooO00o5 = this.f60137OooO0O0;
        OooO00o oooO00o6 = new OooO00o();
        oooO00o6.f60142OooO00o = oooO00o5;
        oooO00o6.f60143OooO0O0 = oooo0;
        this.f60137OooO0O0 = oooO00o6;
        this.f60138OooO0OO = null;
        int length = c34680OooO0O0.f124887OooOo0o.length() + this.f60139OooO0Oo;
        this.f60139OooO0Oo = length;
        if (length > this.f60136OooO00o) {
            OooO00o oooO00o7 = this.f60137OooO0O0;
            if ((oooO00o7 != null ? oooO00o7.f60142OooO00o : null) == null) {
                return;
            }
            while (true) {
                if (oooO00o7 == null) {
                    oooO00o = null;
                } else {
                    OooO00o oooO00o8 = oooO00o7.f60142OooO00o;
                    if (oooO00o8 != null) {
                        oooO00o = oooO00o8.f60142OooO00o;
                    }
                }
                if (oooO00o == null) {
                    break;
                } else {
                    oooO00o7 = oooO00o7.f60142OooO00o;
                }
            }
            if (oooO00o7 == null) {
                return;
            }
            oooO00o7.f60142OooO00o = null;
        }
    }

    public o000O0O0(int i) {
        this.f60136OooO00o = 100000;
    }
}

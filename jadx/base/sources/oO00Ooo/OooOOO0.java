package oO00Ooo;

import com.huawei.hms.network.embedded.C18437z2;
import oO00Ooo.C32297OooO0o0;
import oO00Ooo0.C32309OooO00o;

/* JADX INFO: loaded from: classes10.dex */
public abstract class OooOOO0 extends AbstractC32299OooO0oo {

    public static abstract class OooO00o {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO0O0 f116198OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0O0 f116199OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final /* synthetic */ OooO0O0[] f116200OooOoO0;

        static {
            OooO0O0 oooO0O0 = new OooO0O0("SENT", 0);
            f116199OooOo0o = oooO0O0;
            OooO0O0 oooO0O02 = new OooO0O0("RECEIVED", 1);
            f116198OooOo = oooO0O02;
            f116200OooOoO0 = new OooO0O0[]{oooO0O0, oooO0O02};
        }

        public OooO0O0() {
            throw null;
        }

        public static OooO0O0 valueOf(String str) {
            return (OooO0O0) Enum.valueOf(OooO0O0.class, str);
        }

        public static OooO0O0[] values() {
            return (OooO0O0[]) f116200OooOoO0.clone();
        }
    }

    public static C32297OooO0o0.OooO00o OooO00o(OooO0O0 oooO0O0, long j) {
        C32297OooO0o0.OooO00o oooO00o = new C32297OooO0o0.OooO00o();
        C32309OooO00o.OooO00o(oooO0O0, C18437z2.f56754h);
        oooO00o.f116188OooO00o = oooO0O0;
        oooO00o.f116189OooO0O0 = Long.valueOf(j);
        oooO00o.f116190OooO0OO = 0L;
        oooO00o.f116191OooO0Oo = 0L;
        return oooO00o;
    }

    public abstract long OooO0O0();

    public abstract long OooO0OO();

    public abstract OooO0O0 OooO0Oo();

    public abstract long OooO0o0();
}

package o00O0oo0;

import o00O0oOo.C24949OooO0O0;

/* JADX INFO: renamed from: o00O0oo0.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24975OooOOo0 implements InterfaceC24962OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C24949OooO0O0 f84699OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C24949OooO0O0 f84700OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C24949OooO0O0 f84701OooO0OO;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: o00O0oo0.OooOOo0$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO00o f84702OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f84703OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f84704OooOoO0;

        static {
            OooO00o oooO00o = new OooO00o("SIMULTANEOUSLY", 0);
            f84703OooOo0o = oooO00o;
            OooO00o oooO00o2 = new OooO00o("INDIVIDUALLY", 1);
            f84702OooOo = oooO00o2;
            f84704OooOoO0 = new OooO00o[]{oooO00o, oooO00o2};
        }

        public OooO00o() {
            throw null;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f84704OooOoO0.clone();
        }
    }

    public C24975OooOOo0(String str, OooO00o oooO00o, C24949OooO0O0 c24949OooO0O0, C24949OooO0O0 c24949OooO0O02, C24949OooO0O0 c24949OooO0O03, boolean z) {
        this.f84699OooO00o = c24949OooO0O0;
        this.f84700OooO0O0 = c24949OooO0O02;
        this.f84701OooO0OO = c24949OooO0O03;
    }

    public final String toString() {
        return "Trim Path: {start: " + this.f84699OooO00o + ", end: " + this.f84700OooO0O0 + ", offset: " + this.f84701OooO0OO + "}";
    }
}

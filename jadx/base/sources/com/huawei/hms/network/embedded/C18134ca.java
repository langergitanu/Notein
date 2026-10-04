package com.huawei.hms.network.embedded;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.ca */
/* JADX INFO: loaded from: classes9.dex */
public final class C18134ca {

    /* JADX INFO: renamed from: a */
    public final C18303ob f54496a;

    /* JADX INFO: renamed from: b */
    public final C18303ob f54497b;

    /* JADX INFO: renamed from: c */
    public final int f54498c;

    /* JADX INFO: renamed from: d */
    public static final C18303ob f54485d = C18303ob.m79299d(C18241k5.f55433h);

    /* JADX INFO: renamed from: e */
    public static final String f54486e = ":status";

    /* JADX INFO: renamed from: j */
    public static final C18303ob f54491j = C18303ob.m79299d(f54486e);

    /* JADX INFO: renamed from: f */
    public static final String f54487f = ":method";

    /* JADX INFO: renamed from: k */
    public static final C18303ob f54492k = C18303ob.m79299d(f54487f);

    /* JADX INFO: renamed from: g */
    public static final String f54488g = ":path";

    /* JADX INFO: renamed from: l */
    public static final C18303ob f54493l = C18303ob.m79299d(f54488g);

    /* JADX INFO: renamed from: h */
    public static final String f54489h = ":scheme";

    /* JADX INFO: renamed from: m */
    public static final C18303ob f54494m = C18303ob.m79299d(f54489h);

    /* JADX INFO: renamed from: i */
    public static final String f54490i = ":authority";

    /* JADX INFO: renamed from: n */
    public static final C18303ob f54495n = C18303ob.m79299d(f54490i);

    public C18134ca(C18303ob c18303ob, C18303ob c18303ob2) {
        this.f54496a = c18303ob;
        this.f54497b = c18303ob2;
        this.f54498c = c18303ob2.mo78736j() + c18303ob.mo78736j() + 32;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C18134ca) {
            C18134ca c18134ca = (C18134ca) obj;
            if (this.f54496a.equals(c18134ca.f54496a) && this.f54497b.equals(c18134ca.f54497b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f54497b.hashCode() + ((this.f54496a.hashCode() + 527) * 31);
    }

    public String toString() {
        return C18313p8.m79366a("%s: %s", this.f54496a.mo78740n(), this.f54497b.mo78740n());
    }

    public C18134ca(C18303ob c18303ob, String str) {
        this(c18303ob, C18303ob.m79299d(str));
    }

    public C18134ca(String str, String str2) {
        this(C18303ob.m79299d(str), C18303ob.m79299d(str2));
    }
}

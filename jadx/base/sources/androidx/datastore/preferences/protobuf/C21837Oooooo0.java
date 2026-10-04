package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Oooooo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21837Oooooo0 implements InterfaceC21812Oooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOo f64552OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f64553OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Object[] f64554OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f64555OooO0Oo;

    public C21837Oooooo0(OooOo oooOo, String str, Object[] objArr) {
        this.f64552OooO00o = oooOo;
        this.f64553OooO0O0 = str;
        this.f64554OooO0OO = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f64555OooO0Oo = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i4 = i2 + 1;
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 < 55296) {
                this.f64555OooO0Oo = i | (cCharAt2 << i3);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i2 = i4;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC21812Oooo
    public final InterfaceC21822OoooO0 getDefaultInstance() {
        return this.f64552OooO00o;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC21812Oooo
    public final EnumC21833OooooO0 getSyntax() {
        int i = this.f64555OooO0Oo;
        return (i & 1) != 0 ? EnumC21833OooooO0.f64543OooOo0o : (i & 4) == 4 ? EnumC21833OooooO0.f64545OooOoO0 : EnumC21833OooooO0.f64542OooOo;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC21812Oooo
    public final boolean isMessageSetWireFormat() {
        return (this.f64555OooO0Oo & 2) == 2;
    }
}

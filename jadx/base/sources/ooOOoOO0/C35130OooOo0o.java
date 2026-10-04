package ooOOoOO0;

import oO0o.InterfaceC33531OooO0o0;
import oO0o.OooOOO0;

/* JADX INFO: renamed from: ooOOoOO0.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35130OooOo0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Object[] f126138OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int[] f126139OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f126140OooO0OO;

    /* JADX INFO: renamed from: ooOOoOO0.OooOo0o$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f126141OooO00o = new OooO00o();
    }

    public final String OooO00o() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.f126140OooO0OO + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = this.f126138OooO00o[i2];
            if (obj instanceof InterfaceC33531OooO0o0) {
                InterfaceC33531OooO0o0 interfaceC33531OooO0o0 = (InterfaceC33531OooO0o0) obj;
                if (!kotlin.jvm.internal.OooOOO0.OooO0O0(interfaceC33531OooO0o0.getKind(), OooOOO0.OooO0O0.f121133OooO00o)) {
                    int i3 = this.f126139OooO0O0[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(interfaceC33531OooO0o0.OooO0o(i3));
                    }
                } else if (this.f126139OooO0O0[i2] != -1) {
                    sb.append("[");
                    sb.append(this.f126139OooO0O0[i2]);
                    sb.append("]");
                }
            } else if (obj != OooO00o.f126141OooO00o) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        String string = sb.toString();
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
        return string;
    }

    public final String toString() {
        return OooO00o();
    }
}

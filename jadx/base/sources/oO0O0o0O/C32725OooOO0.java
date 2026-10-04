package oO0O0o0O;

import androidx.datastore.preferences.protobuf.C21825OoooOO0;
import kotlin.jvm.internal.OooOOO0;
import oO0O0oO0.AbstractC32748OooOo0O;
import oO0O0ooO.InterfaceC32825OooOO0o;

/* JADX INFO: renamed from: oO0O0o0O.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32725OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C32725OooOO0 f117652OooO00o = new C32725OooOO0();

    /* JADX INFO: renamed from: oO0O0o0O.OooOO0$OooO00o */
    public static final class OooO00o implements ooOOO00O.OooO00o {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final AbstractC32748OooOo0O f117653OooO0O0;

        public OooO00o(AbstractC32748OooOo0O javaElement) {
            OooOOO0.OooO0oO(javaElement, "javaElement");
            this.f117653OooO0O0 = javaElement;
        }

        @Override // ooOOO00O.OooO00o
        public final AbstractC32748OooOo0O OooO00o() {
            return this.f117653OooO0O0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            C21825OoooOO0.OooO0OO(OooO00o.class, sb, ": ");
            sb.append(this.f117653OooO0O0);
            return sb.toString();
        }
    }

    public final OooO00o OooO00o(InterfaceC32825OooOO0o javaElement) {
        OooOOO0.OooO0oO(javaElement, "javaElement");
        return new OooO00o((AbstractC32748OooOo0O) javaElement);
    }
}

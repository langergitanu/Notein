package oO0OOo0o;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import oO000Oo.C32012o000000o;
import oO000Oo.o0000O0;

/* JADX INFO: loaded from: classes10.dex */
public interface OooOO0O extends InterfaceC33064OooOO0o, InterfaceC33070OooOOoo {

    public static final class OooO00o implements OooOO0O {
        @Override // oO0OOo0o.InterfaceC33064OooOO0o, oO0OOo0o.InterfaceC33070OooOOoo
        public final String OooO00o() {
            return "gzip";
        }

        @Override // oO0OOo0o.InterfaceC33070OooOOoo
        public final InputStream OooO0O0(o0000O0.OooO00o oooO00o) throws IOException {
            return new GZIPInputStream(oooO00o);
        }

        @Override // oO0OOo0o.InterfaceC33064OooOO0o
        public final OutputStream OooO0OO(C32012o000000o.OooO00o oooO00o) throws IOException {
            return new GZIPOutputStream(oooO00o);
        }
    }

    public static final class OooO0O0 implements OooOO0O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0O0 f119551OooO00o = new OooO0O0();

        @Override // oO0OOo0o.InterfaceC33064OooOO0o, oO0OOo0o.InterfaceC33070OooOOoo
        public final String OooO00o() {
            return "identity";
        }

        @Override // oO0OOo0o.InterfaceC33070OooOOoo
        public final InputStream OooO0O0(o0000O0.OooO00o oooO00o) {
            return oooO00o;
        }

        @Override // oO0OOo0o.InterfaceC33064OooOO0o
        public final OutputStream OooO0OO(C32012o000000o.OooO00o oooO00o) {
            return oooO00o;
        }
    }
}

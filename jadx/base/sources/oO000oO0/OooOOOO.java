package oO000oO0;

import io.ktor.utils.p616io.InterfaceC23986Ooooo0o;
import io.ktor.utils.p616io.jvm.javaio.C24002OooO0o0;
import java.io.IOException;
import oO00ooO.C32435OooO0Oo;
import oO00ooO.C32447OooOOo;
import oOo00OoO.C34534OooOOOO;
import oOo00OoO.C34535OooOOOo;
import oOo00OoO.InterfaceC34526OooO0o0;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOOOO extends RequestBody {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Long f115143OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final kotlin.jvm.internal.OooOOOO f115144OooO0O0;

    /* JADX WARN: Multi-variable type inference failed */
    public OooOOOO(Long l, oO0O000o.OooO00o<? extends InterfaceC23986Ooooo0o> oooO00o) {
        this.f115143OooO00o = l;
        this.f115144OooO0O0 = (kotlin.jvm.internal.OooOOOO) oooO00o;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        Long l = this.f115143OooO00o;
        if (l != null) {
            return l.longValue();
        }
        return -1L;
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: contentType */
    public final MediaType getF124249OooO00o() {
        return null;
    }

    @Override // okhttp3.RequestBody
    public final boolean isOneShot() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooO00o] */
    @Override // okhttp3.RequestBody
    public final void writeTo(InterfaceC34526OooO0o0 sink) throws IOException {
        Long lValueOf;
        kotlin.jvm.internal.OooOOO0.OooO0oO(sink, "sink");
        try {
            InterfaceC23986Ooooo0o interfaceC23986Ooooo0o = (InterfaceC23986Ooooo0o) this.f115144OooO0O0.invoke();
            C32447OooOOo c32447OooOOo = io.ktor.utils.p616io.jvm.javaio.OooO0O0.f80853OooO00o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC23986Ooooo0o, "<this>");
            Throwable th = null;
            C34534OooOOOO c34534OooOOOOOooO0o = C34535OooOOOo.OooO0o(new C24002OooO0o0(null, interfaceC23986Ooooo0o));
            try {
                lValueOf = Long.valueOf(sink.o0000O00(c34534OooOOOOOooO0o));
            } catch (Throwable th2) {
                th = th2;
                lValueOf = null;
            }
            try {
                c34534OooOOOOOooO0o.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                } else {
                    C32435OooO0Oo.OooO00o(th, th3);
                }
            }
            if (th != null) {
                throw th;
            }
            kotlin.jvm.internal.OooOOO0.OooO0Oo(lValueOf);
        } catch (IOException e) {
            throw e;
        } catch (Throwable th4) {
            throw new OooOOO(th4);
        }
    }
}

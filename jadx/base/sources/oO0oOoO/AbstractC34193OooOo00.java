package oO0oOoO;

import Oooo0oO.C21111o0ooOoO;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import oO0oOo0.C34142OooO00o;
import oO0oOoO.C34177OooO0Oo;
import oO0oOooo.C34225OooO0o0;

/* JADX INFO: renamed from: oO0oOoO.OooOo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC34193OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public AbstractC34191OooOOoo f122831OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C34142OooO00o f122832OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C34142OooO00o f122833OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C34177OooO0Oo.OooO00o f122834OooO0Oo;

    public AbstractC34193OooOo00(C34142OooO00o c34142OooO00o, C34142OooO00o c34142OooO00o2, C34177OooO0Oo.OooO00o oooO00o) {
        this.f122832OooO0O0 = c34142OooO00o;
        this.f122833OooO0OO = c34142OooO00o2;
        this.f122834OooO0Oo = oooO00o;
    }

    public final byte[] OooO00o(C34225OooO0o0 c34225OooO0o0) throws C34179OooO0o0 {
        try {
            C34194OooOo0O c34194OooOo0OOooO0O0 = OooO0O0(c34225OooO0o0);
            C34178OooO0o c34178OooO0o = new C34178OooO0o(new BufferedInputStream(c34194OooOo0OOooO0O0.f122835OooO00o.OooO00o(new ByteArrayInputStream((byte[]) this.f122834OooO0Oo.f122812OooO00o.f85976OooO00o)), 32768));
            int i = C34180OooO0oO.f122814OooO00o;
            return oOO00.OooO00o.OooO00o(c34178OooO0o);
        } catch (IOException e) {
            throw new C34179OooO0o0(C21111o0ooOoO.OooO00o(e, new StringBuilder("unable to parse internal stream: ")), e);
        }
    }

    public abstract C34194OooOo0O OooO0O0(C34225OooO0o0 c34225OooO0o0) throws C34179OooO0o0, IOException;
}

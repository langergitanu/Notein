package o00o0OOo;

import java.io.IOException;
import java.util.Collection;
import o00o0OO.C25327OooO00o;
import o00o0OOO.InterfaceC25397OooO00o;

/* JADX INFO: renamed from: o00o0OOo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC25411OooO0o0 {

    /* JADX INFO: renamed from: o00o0OOo.OooO0o0$OooO00o */
    public interface OooO00o {
        String getId();

        long getSize();

        long getTimestamp();
    }

    /* JADX INFO: renamed from: o00o0OOo.OooO0o0$OooO0O0 */
    public interface OooO0O0 {
    }

    OooO0O0 OooO00o(String str, InterfaceC25397OooO00o interfaceC25397OooO00o) throws IOException;

    void OooO0O0();

    long OooO0OO(OooO00o oooO00o) throws IOException;

    C25327OooO00o OooO0Oo(String str, InterfaceC25397OooO00o interfaceC25397OooO00o) throws IOException;

    Collection<OooO00o> getEntries() throws IOException;

    boolean isExternal();
}

package oO00OoOo;

import com.google.api.client.http.HttpHeaders;
import com.google.common.base.Preconditions;
import com.google.common.primitives.UnsignedLongs;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import oO00Ooo.AbstractC32308OooOo0o;
import oO00Ooo.C32291OooO;
import oO00Ooo.C32302OooOOOo;
import oO0OOoOo.AbstractC33128OooO00o;

/* JADX INFO: renamed from: oO00OoOo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32290OooO00o extends AbstractC33128OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final List<String> f116174OooO00o = Collections.singletonList("X-Cloud-Trace-Context");

    static {
        new AbstractC32308OooOo0o.OooO00o(AbstractC32308OooOo0o.OooO00o.f116225OooO0O0);
    }

    @Override // oO0OOoOo.AbstractC33128OooO00o
    public final void OooO00o(C32302OooOOOo c32302OooOOOo, HttpHeaders httpHeaders, AbstractC33128OooO00o.AbstractC20300OooO00o abstractC20300OooO00o) {
        Preconditions.checkNotNull(c32302OooOOOo, "spanContext");
        Preconditions.checkNotNull(abstractC20300OooO00o, "setter");
        Preconditions.checkNotNull(httpHeaders, "carrier");
        StringBuilder sb = new StringBuilder();
        c32302OooOOOo.getClass();
        char[] cArr = new char[32];
        C32291OooO.OooO0O0(cArr, 0);
        C32291OooO.OooO0O0(cArr, 16);
        sb.append(new String(cArr));
        sb.append(IOUtils.DIR_SEPARATOR_UNIX);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.put(new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0});
        sb.append(UnsignedLongs.toString(byteBufferAllocate.getLong(0)));
        sb.append(";o=");
        sb.append("0");
        abstractC20300OooO00o.put(httpHeaders, "X-Cloud-Trace-Context", sb.toString());
    }
}

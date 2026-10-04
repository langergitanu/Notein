package o0ooOO0O;

import androidx.datastore.preferences.protobuf.o000oOoO;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Map;
import o0ooO0OO.C31431OooO00o;
import o0ooO0Oo.AbstractC31434OooO0O0;
import o0ooO0Oo.C31432OooO;
import o0ooO0Oo.C31433OooO00o;
import o0ooO0Oo.C31435OooO0OO;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31437OooO0o;
import o0ooO0Oo.C31441OooOO0;
import o0ooO0Oo.C31442OooOO0O;
import o0ooO0Oo.C31450OooOOoo;
import o0oooOO0.C31835OooO00o;

/* JADX INFO: renamed from: o0ooOO0O.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31609OooO0Oo {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final byte[] f113001OooO0O0 = {32};

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final byte[] f113002OooO0OO = {10};

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ByteArrayOutputStream f113003OooO00o;

    public C31609OooO0Oo(ByteArrayOutputStream byteArrayOutputStream) {
        this.f113003OooO00o = byteArrayOutputStream;
    }

    public final void OooO00o(Object obj) throws IOException {
        boolean z = obj instanceof C31450OooOOoo;
        byte[] bArr = f113001OooO0O0;
        ByteArrayOutputStream byteArrayOutputStream = this.f113003OooO00o;
        if (z) {
            byte[] bArr2 = C31607OooO0O0.f112962Oooo0oO;
            C31607OooO0O0.Oooo0(((C31450OooOOoo) obj).f112480OooOo, byteArrayOutputStream);
            byteArrayOutputStream.write(bArr);
            return;
        }
        if (obj instanceof C31437OooO0o) {
            byteArrayOutputStream.write(((C31437OooO0o) obj).f112224OooOoO0.getBytes("ISO-8859-1"));
            byteArrayOutputStream.write(bArr);
            return;
        }
        if (obj instanceof C31432OooO) {
            byteArrayOutputStream.write(String.valueOf(((C31432OooO) obj).f112212OooOo).getBytes("ISO-8859-1"));
            byteArrayOutputStream.write(bArr);
            return;
        }
        if (obj instanceof C31435OooO0OO) {
            if (((C31435OooO0OO) obj).f112220OooOo) {
                byteArrayOutputStream.write(C31435OooO0OO.f112217OooOoO0);
            } else {
                byteArrayOutputStream.write(C31435OooO0OO.f112216OooOoO);
            }
            byteArrayOutputStream.write(bArr);
            return;
        }
        if (obj instanceof C31441OooOO0) {
            ((C31441OooOO0) obj).Oooo00o(byteArrayOutputStream);
            byteArrayOutputStream.write(bArr);
            return;
        }
        if (obj instanceof C31433OooO00o) {
            C31433OooO00o c31433OooO00o = (C31433OooO00o) obj;
            byteArrayOutputStream.write(C31607OooO0O0.f112974Ooooo00);
            for (int i = 0; i < c31433OooO00o.f112214OooOo.size(); i++) {
                OooO00o(c31433OooO00o.Oooo0(i));
            }
            byteArrayOutputStream.write(C31607OooO0O0.f112975Ooooo0o);
            byteArrayOutputStream.write(bArr);
            return;
        }
        if (obj instanceof C31436OooO0Oo) {
            byteArrayOutputStream.write(C31607OooO0O0.f112962Oooo0oO);
            for (Map.Entry entry : ((C31436OooO0Oo) obj).f112222OooOoO0.entrySet()) {
                if (entry.getValue() != null) {
                    OooO00o(entry.getKey());
                    OooO00o(entry.getValue());
                }
            }
            byteArrayOutputStream.write(C31607OooO0O0.f112963Oooo0oo);
            byteArrayOutputStream.write(bArr);
            return;
        }
        if (!(obj instanceof C31431OooO00o)) {
            if (!(obj instanceof C31442OooOO0O)) {
                throw new IOException(o000oOoO.OooO00o(obj, "Error:Unknown type in content stream:"));
            }
            byteArrayOutputStream.write(CloudMetaExtra.DEFINE_NON_PARENT_ID.getBytes(C31835OooO00o.f113459OooO0Oo));
            byteArrayOutputStream.write(bArr);
            return;
        }
        C31431OooO00o c31431OooO00o = (C31431OooO00o) obj;
        boolean zEquals = c31431OooO00o.f112205OooO00o.equals("BI");
        byte[] bArr3 = f113002OooO0OO;
        if (!zEquals) {
            byteArrayOutputStream.write(c31431OooO00o.f112205OooO00o.getBytes(C31835OooO00o.f113459OooO0Oo));
            byteArrayOutputStream.write(bArr3);
            return;
        }
        byteArrayOutputStream.write("BI".getBytes(C31835OooO00o.f113459OooO0Oo));
        byteArrayOutputStream.write(bArr3);
        C31436OooO0Oo c31436OooO0Oo = c31431OooO00o.f112207OooO0OO;
        for (C31441OooOO0 c31441OooOO0 : c31436OooO0Oo.f112222OooOoO0.keySet()) {
            AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O = c31436OooO0Oo.o0000O0O(c31441OooOO0);
            c31441OooOO0.Oooo00o(byteArrayOutputStream);
            byteArrayOutputStream.write(bArr);
            OooO00o(abstractC31434OooO0O0O0000O0O);
            byteArrayOutputStream.write(bArr3);
        }
        Charset charset = C31835OooO00o.f113459OooO0Oo;
        byteArrayOutputStream.write("ID".getBytes(charset));
        byteArrayOutputStream.write(bArr3);
        byteArrayOutputStream.write(c31431OooO00o.f112206OooO0O0);
        byteArrayOutputStream.write(bArr3);
        byteArrayOutputStream.write("EI".getBytes(charset));
        byteArrayOutputStream.write(bArr3);
    }
}

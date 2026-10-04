package oO0OOo0o;

import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import com.google.common.p563io.BaseEncoding;
import com.huawei.hms.network.embedded.C18190ga;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: oO0OOo0o.OoooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33094OoooO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Logger f119651OooO0OO = Logger.getLogger(C33094OoooO.class.getName());

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooO00o f119652OooO0Oo = new OooO00o();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final BaseEncoding f119653OooO0o0 = BaseEncoding.base64().omitPadding();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Object[] f119654OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f119655OooO0O0;

    /* JADX INFO: renamed from: oO0OOo0o.OoooO$OooO00o */
    public class OooO00o implements OooO0OO<String> {
        @Override // oO0OOo0o.C33094OoooO.OooO0OO
        public final String OooO00o(String str) {
            return str;
        }

        @Override // oO0OOo0o.C33094OoooO.OooO0OO
        public final String OooO0O0(String str) {
            return str;
        }
    }

    /* JADX INFO: renamed from: oO0OOo0o.OoooO$OooO0O0 */
    public static class OooO0O0<T> extends AbstractC33095OooO0Oo<T> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final OooO0OO<T> f119656OooO0o0;

        public OooO0O0(String str, OooO0OO oooO0OO) {
            super(str, false, oooO0OO);
            Preconditions.checkArgument(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
            this.f119656OooO0o0 = (OooO0OO) Preconditions.checkNotNull(oooO0OO, "marshaller");
        }

        @Override // oO0OOo0o.C33094OoooO.AbstractC33095OooO0Oo
        public final T OooO00o(byte[] bArr) {
            return this.f119656OooO0o0.OooO0O0(new String(bArr, Charsets.US_ASCII));
        }

        @Override // oO0OOo0o.C33094OoooO.AbstractC33095OooO0Oo
        public final byte[] OooO0O0(T t) {
            return ((String) Preconditions.checkNotNull(this.f119656OooO0o0.OooO00o(t), "null marshaller.toAsciiString()")).getBytes(Charsets.US_ASCII);
        }
    }

    /* JADX INFO: renamed from: oO0OOo0o.OoooO$OooO0OO */
    public interface OooO0OO<T> {
        String OooO00o(T t);

        T OooO0O0(String str);
    }

    /* JADX INFO: renamed from: oO0OOo0o.OoooO$OooO0Oo, reason: case insensitive filesystem */
    public static abstract class AbstractC33095OooO0Oo<T> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final BitSet f119657OooO0Oo;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f119658OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final byte[] f119659OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Object f119660OooO0OO;

        static {
            BitSet bitSet = new BitSet(127);
            bitSet.set(45);
            bitSet.set(95);
            bitSet.set(46);
            for (char c = '0'; c <= '9'; c = (char) (c + 1)) {
                bitSet.set(c);
            }
            for (char c2 = 'a'; c2 <= 'z'; c2 = (char) (c2 + 1)) {
                bitSet.set(c2);
            }
            f119657OooO0Oo = bitSet;
        }

        public AbstractC33095OooO0Oo(String str, boolean z, Object obj) {
            String lowerCase = ((String) Preconditions.checkNotNull(str, "name")).toLowerCase(Locale.ROOT);
            Preconditions.checkNotNull(lowerCase, "name");
            Preconditions.checkArgument(!lowerCase.isEmpty(), "token must have at least 1 tchar");
            if (lowerCase.equals(C18190ga.f54963h)) {
                C33094OoooO.f119651OooO0OO.log(Level.WARNING, "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (Throwable) new RuntimeException("exception to show backtrace"));
            }
            for (int i = 0; i < lowerCase.length(); i++) {
                char cCharAt = lowerCase.charAt(i);
                if (!z || cCharAt != ':' || i != 0) {
                    Preconditions.checkArgument(f119657OooO0Oo.get(cCharAt), "Invalid character '%s' in key name '%s'", cCharAt, (Object) lowerCase);
                }
            }
            this.f119658OooO00o = lowerCase;
            this.f119659OooO0O0 = lowerCase.getBytes(Charsets.US_ASCII);
            this.f119660OooO0OO = obj;
        }

        public abstract T OooO00o(byte[] bArr);

        public abstract byte[] OooO0O0(T t);

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f119658OooO00o.equals(((AbstractC33095OooO0Oo) obj).f119658OooO00o);
        }

        public final int hashCode() {
            return this.f119658OooO00o.hashCode();
        }

        public final String toString() {
            return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("Key{name='"), this.f119658OooO00o, "'}");
        }
    }

    /* JADX INFO: renamed from: oO0OOo0o.OoooO$OooO0o */
    public static final class OooO0o<T> extends AbstractC33095OooO0Oo<T> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final InterfaceC33097OooO0oO<T> f119661OooO0o0;

        public OooO0o(String str, boolean z, InterfaceC33097OooO0oO interfaceC33097OooO0oO) {
            super(str, z, interfaceC33097OooO0oO);
            Preconditions.checkArgument(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
            this.f119661OooO0o0 = (InterfaceC33097OooO0oO) Preconditions.checkNotNull(interfaceC33097OooO0oO, "marshaller");
        }

        @Override // oO0OOo0o.C33094OoooO.AbstractC33095OooO0Oo
        public final T OooO00o(byte[] bArr) {
            return this.f119661OooO0o0.OooO0O0(bArr);
        }

        @Override // oO0OOo0o.C33094OoooO.AbstractC33095OooO0Oo
        public final byte[] OooO0O0(T t) {
            return (byte[]) Preconditions.checkNotNull(this.f119661OooO0o0.OooO00o(t), "null marshaller.toAsciiString()");
        }
    }

    /* JADX INFO: renamed from: oO0OOo0o.OoooO$OooO0o0, reason: case insensitive filesystem */
    public static final class C33096OooO0o0<T> {
        public C33096OooO0o0() {
            throw null;
        }

        public final byte[] OooO00o() {
            synchronized (this) {
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: oO0OOo0o.OoooO$OooO0oO, reason: case insensitive filesystem */
    public interface InterfaceC33097OooO0oO<T> {
        byte[] OooO00o(T t);

        T OooO0O0(byte[] bArr);
    }

    public final <T> void OooO00o(AbstractC33095OooO0Oo<T> abstractC33095OooO0Oo) {
        if (this.f119655OooO0O0 == 0) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = this.f119655OooO0O0;
            if (i >= i3) {
                Arrays.fill(this.f119654OooO00o, i2 * 2, i3 * 2, (Object) null);
                this.f119655OooO0O0 = i2;
                return;
            }
            if (!Arrays.equals(abstractC33095OooO0Oo.f119659OooO0O0, OooO0o0(i))) {
                byte[] bArrOooO0o0 = OooO0o0(i);
                Object[] objArr = this.f119654OooO00o;
                int i4 = i2 * 2;
                objArr[i4] = bArrOooO0o0;
                Object obj = objArr[(i * 2) + 1];
                if (objArr instanceof byte[][]) {
                    OooO0O0(objArr != null ? objArr.length : 0);
                }
                this.f119654OooO00o[i4 + 1] = obj;
                i2++;
            }
            i++;
        }
    }

    public final void OooO0O0(int i) {
        Object[] objArr = new Object[i];
        int i2 = this.f119655OooO0O0;
        if (i2 != 0) {
            System.arraycopy(this.f119654OooO00o, 0, objArr, 0, i2 * 2);
        }
        this.f119654OooO00o = objArr;
    }

    public final <T> T OooO0OO(AbstractC33095OooO0Oo<T> abstractC33095OooO0Oo) {
        for (int i = this.f119655OooO0O0 - 1; i >= 0; i--) {
            if (Arrays.equals(abstractC33095OooO0Oo.f119659OooO0O0, OooO0o0(i))) {
                Object obj = this.f119654OooO00o[(i * 2) + 1];
                if (obj instanceof byte[]) {
                    return abstractC33095OooO0Oo.OooO00o((byte[]) obj);
                }
                C33096OooO0o0 c33096OooO0o0 = (C33096OooO0o0) obj;
                c33096OooO0o0.getClass();
                return abstractC33095OooO0Oo.OooO00o(c33096OooO0o0.OooO00o());
            }
        }
        return null;
    }

    public final void OooO0Oo(C33094OoooO c33094OoooO) {
        int i = c33094OoooO.f119655OooO0O0;
        if (i == 0) {
            return;
        }
        Object[] objArr = this.f119654OooO00o;
        int length = objArr != null ? objArr.length : 0;
        int i2 = this.f119655OooO0O0;
        int i3 = length - (i2 * 2);
        if (i2 == 0 || i3 < i * 2) {
            OooO0O0((i * 2) + (i2 * 2));
        }
        System.arraycopy(c33094OoooO.f119654OooO00o, 0, this.f119654OooO00o, this.f119655OooO0O0 * 2, c33094OoooO.f119655OooO0O0 * 2);
        this.f119655OooO0O0 += c33094OoooO.f119655OooO0O0;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> void OooO0o(AbstractC33095OooO0Oo<T> abstractC33095OooO0Oo, T t) {
        Preconditions.checkNotNull(abstractC33095OooO0Oo, "key");
        Preconditions.checkNotNull(t, "value");
        int i = this.f119655OooO0O0;
        int i2 = i * 2;
        if (i2 == 0) {
            OooO0O0(Math.max(i * 4, 8));
        } else {
            Object[] objArr = this.f119654OooO00o;
            if (i2 == (objArr != null ? objArr.length : 0)) {
            }
        }
        int i3 = this.f119655OooO0O0;
        this.f119654OooO00o[i3 * 2] = abstractC33095OooO0Oo.f119659OooO0O0;
        this.f119654OooO00o[(i3 * 2) + 1] = abstractC33095OooO0Oo.OooO0O0(t);
        this.f119655OooO0O0++;
    }

    public final byte[] OooO0o0(int i) {
        return (byte[]) this.f119654OooO00o[i * 2];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int i = 0; i < this.f119655OooO0O0; i++) {
            if (i != 0) {
                sb.append(',');
            }
            byte[] bArrOooO0o0 = OooO0o0(i);
            Charset charset = Charsets.US_ASCII;
            String str = new String(bArrOooO0o0, charset);
            sb.append(str);
            sb.append('=');
            if (str.endsWith("-bin")) {
                Object obj = this.f119654OooO00o[(i * 2) + 1];
                sb.append(f119653OooO0o0.encode(obj instanceof byte[] ? (byte[]) obj : ((C33096OooO0o0) obj).OooO00o()));
            } else {
                Object obj2 = this.f119654OooO00o[(i * 2) + 1];
                sb.append(new String(obj2 instanceof byte[] ? (byte[]) obj2 : ((C33096OooO0o0) obj2).OooO00o(), charset));
            }
        }
        sb.append(')');
        return sb.toString();
    }
}

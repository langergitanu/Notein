package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.OooOO0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21805OooOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Charset f64482OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final byte[] f64483OooO0O0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.OooOoO$OooO00o */
    public interface OooO00o {
        int getNumber();
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.OooOoO$OooO0O0 */
    public interface OooO0O0 {
        boolean OooO00o();
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.OooOoO$OooO0OO */
    public interface OooO0OO<E> extends List<E>, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        OooO0OO<E> mutableCopyWithCapacity(int i);
    }

    static {
        Charset.forName("US-ASCII");
        f64482OooO00o = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f64483OooO0O0 = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new OooOO0.OooO00o(bArr, 0, 0, false).OooO0o0(0);
        } catch (C21807OooOoOO e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static void OooO00o(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int OooO0O0(long j) {
        return (int) (j ^ (j >>> 32));
    }
}

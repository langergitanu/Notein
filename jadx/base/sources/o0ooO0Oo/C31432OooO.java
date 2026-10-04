package o0ooO0Oo;

import androidx.core.location.LocationRequestCompat;
import com.aspose.words.StyleIdentifier;
import java.io.IOException;
import o0ooOO0O.C31607OooO0O0;

/* JADX INFO: renamed from: o0ooO0Oo.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31432OooO extends AbstractC31443OooOO0o {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final C31432OooO[] f112208OooOoO = new C31432OooO[StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_5];

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final C31432OooO f112209OooOoOO = o0Oo0oo(0);

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final C31432OooO f112210OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final C31432OooO f112211OooOoo0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final long f112212OooOo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final boolean f112213OooOoO0;

    static {
        o0Oo0oo(1L);
        o0Oo0oo(2L);
        o0Oo0oo(3L);
        f112211OooOoo0 = new C31432OooO(LocationRequestCompat.PASSIVE_INTERVAL, false);
        f112210OooOoo = new C31432OooO(Long.MIN_VALUE, false);
    }

    public C31432OooO(long j, boolean z) {
        this.f112212OooOo = j;
        this.f112213OooOoO0 = z;
    }

    public static C31432OooO o0Oo0oo(long j) {
        if (-100 > j || j > 256) {
            return new C31432OooO(j, true);
        }
        int i = ((int) j) + 100;
        C31432OooO[] c31432OooOArr = f112208OooOoO;
        if (c31432OooOArr[i] == null) {
            c31432OooOArr[i] = new C31432OooO(j, true);
        }
        return c31432OooOArr[i];
    }

    @Override // o0ooO0Oo.AbstractC31434OooO0O0
    public final Object OooOOoo(C31607OooO0O0 c31607OooO0O0) throws IOException {
        c31607OooO0O0.f112981OooOoO.write(String.valueOf(this.f112212OooOo).getBytes("ISO-8859-1"));
        return null;
    }

    @Override // o0ooO0Oo.AbstractC31443OooOO0o
    public final float OooOooo() {
        return this.f112212OooOo;
    }

    @Override // o0ooO0Oo.AbstractC31443OooOO0o
    public final int Oooo0() {
        return (int) this.f112212OooOo;
    }

    @Override // o0ooO0Oo.AbstractC31443OooOO0o
    public final long Oooo0OO() {
        return this.f112212OooOo;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C31432OooO) && ((int) ((C31432OooO) obj).f112212OooOo) == ((int) this.f112212OooOo);
    }

    public final int hashCode() {
        long j = this.f112212OooOo;
        return (int) (j ^ (j >> 32));
    }

    public final String toString() {
        return android.support.v4.media.session.OooO00o.OooO00o(this.f112212OooOo, "}", new StringBuilder("COSInt{"));
    }
}

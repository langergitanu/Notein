package o00O00o;

import OooOoOO.C20519OooO0Oo;
import Oooo0oO.C21023OooO0Oo;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import oO00ooO.C32447OooOOo;
import oO0o0O0o.C33599OooOo0O;

/* JADX INFO: loaded from: classes.dex */
public final class OooO implements Comparable<OooO> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final OooO f84121OooOoo0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f84122OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f84123OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final String f84124OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final int f84125OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C32447OooOOo f84126OooOoOO = C20519OooO0Oo.OooO0OO(new OooO0O0());

    public static final class OooO00o {
        public static OooO OooO00o(String str) {
            String strGroup;
            if (str == null || C33599OooOo0O.Oooo0o0(str)) {
                return null;
            }
            Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
            if (!matcher.matches() || (strGroup = matcher.group(1)) == null) {
                return null;
            }
            int i = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            if (strGroup2 == null) {
                return null;
            }
            int i2 = Integer.parseInt(strGroup2);
            String strGroup3 = matcher.group(3);
            if (strGroup3 == null) {
                return null;
            }
            int i3 = Integer.parseInt(strGroup3);
            String description = matcher.group(4) != null ? matcher.group(4) : "";
            OooOOO0.OooO0o(description, "description");
            return new OooO(i, i2, i3, description);
        }
    }

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<BigInteger> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final BigInteger invoke() {
            OooO oooO = OooO.this;
            return BigInteger.valueOf(oooO.f84123OooOo0o).shiftLeft(32).or(BigInteger.valueOf(oooO.f84122OooOo)).shiftLeft(32).or(BigInteger.valueOf(oooO.f84125OooOoO0));
        }
    }

    static {
        new OooO(0, 0, 0, "");
        f84121OooOoo0 = new OooO(0, 1, 0, "");
        new OooO(1, 0, 0, "");
    }

    public OooO(int i, int i2, int i3, String str) {
        this.f84123OooOo0o = i;
        this.f84122OooOo = i2;
        this.f84125OooOoO0 = i3;
        this.f84124OooOoO = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(OooO oooO) {
        OooO other = oooO;
        OooOOO0.OooO0oO(other, "other");
        Object value = this.f84126OooOoOO.getValue();
        OooOOO0.OooO0o(value, "<get-bigInteger>(...)");
        Object value2 = other.f84126OooOoOO.getValue();
        OooOOO0.OooO0o(value2, "<get-bigInteger>(...)");
        return ((BigInteger) value).compareTo((BigInteger) value2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof OooO)) {
            return false;
        }
        OooO oooO = (OooO) obj;
        return this.f84123OooOo0o == oooO.f84123OooOo0o && this.f84122OooOo == oooO.f84122OooOo && this.f84125OooOoO0 == oooO.f84125OooOoO0;
    }

    public final int hashCode() {
        return ((((527 + this.f84123OooOo0o) * 31) + this.f84122OooOo) * 31) + this.f84125OooOoO0;
    }

    public final String toString() {
        String str = this.f84124OooOoO;
        String strOooO00o = !C33599OooOo0O.Oooo0o0(str) ? com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o(CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR, str) : "";
        StringBuilder sb = new StringBuilder();
        sb.append(this.f84123OooOo0o);
        sb.append(FilenameUtils.EXTENSION_SEPARATOR);
        sb.append(this.f84122OooOo);
        sb.append(FilenameUtils.EXTENSION_SEPARATOR);
        return C21023OooO0Oo.OooO0OO(strOooO00o, this.f84125OooOoO0, sb);
    }
}

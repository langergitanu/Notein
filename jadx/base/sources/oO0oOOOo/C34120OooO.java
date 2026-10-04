package oO0oOOOo;

import com.huawei.hms.network.embedded.C18115b5;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: oO0oOOOo.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34120OooO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Pattern f122625OooO0O0 = Pattern.compile("^[\\p{L}\\p{N}]+$");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f122626OooO00o;

    public C34120OooO(String str) {
        this.f122626OooO00o = str.concat(C18115b5.CONNECTOR);
    }

    public final String OooO00o(Object obj) {
        String string = obj.toString();
        if (!f122625OooO0O0.matcher(string).matches()) {
            throw new IllegalArgumentException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Invalid key: ", string));
        }
        return this.f122626OooO00o + obj;
    }
}

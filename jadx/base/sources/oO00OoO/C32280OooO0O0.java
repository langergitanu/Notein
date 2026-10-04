package oO00OoO;

import androidx.datastore.preferences.protobuf.C21791OooO0o0;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: oO00OoO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32280OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o<String, Pattern> f116002OooO00o;

    /* JADX INFO: renamed from: oO00OoO.OooO0O0$OooO00o */
    public static class OooO00o<K, V> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public C32279OooO00o f116003OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f116004OooO0O0;
    }

    public C32280OooO0O0(int i) {
        OooO00o<String, Pattern> oooO00o = new OooO00o<>();
        oooO00o.f116004OooO0O0 = i;
        oooO00o.f116003OooO00o = new C32279OooO00o(oooO00o, C21791OooO0o0.OooO00o(i, 4, 3, 1));
        this.f116002OooO00o = oooO00o;
    }

    public final Pattern OooO00o(String str) {
        Object obj;
        OooO00o<String, Pattern> oooO00o = this.f116002OooO00o;
        synchronized (oooO00o) {
            obj = oooO00o.f116003OooO00o.get(str);
        }
        Pattern pattern = (Pattern) obj;
        if (pattern != null) {
            return pattern;
        }
        Pattern patternCompile = Pattern.compile(str);
        OooO00o<String, Pattern> oooO00o2 = this.f116002OooO00o;
        synchronized (oooO00o2) {
            oooO00o2.f116003OooO00o.put(str, patternCompile);
        }
        return patternCompile;
    }
}

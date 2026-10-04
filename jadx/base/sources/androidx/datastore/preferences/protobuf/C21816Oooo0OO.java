package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.EnumC21841o00oO0o;
import java.io.IOException;
import o0000oO0.C24328OooO0o;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Oooo0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21816Oooo0OO<K, V> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o<K, V> f64510OooO00o;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Oooo0OO$OooO00o */
    public static class OooO00o<K, V> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final EnumC21841o00oO0o.OooO00o f64511OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final EnumC21841o00oO0o.OooO0OO f64512OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final C24328OooO0o f64513OooO0OO;

        public OooO00o(EnumC21841o00oO0o.OooO00o oooO00o, EnumC21841o00oO0o.OooO0OO oooO0OO, C24328OooO0o c24328OooO0o) {
            this.f64511OooO00o = oooO00o;
            this.f64512OooO0O0 = oooO0OO;
            this.f64513OooO0OO = c24328OooO0o;
        }
    }

    public C21816Oooo0OO(EnumC21841o00oO0o.OooO00o oooO00o, EnumC21841o00oO0o.OooO0OO oooO0OO, C24328OooO0o c24328OooO0o) {
        this.f64510OooO00o = new OooO00o<>(oooO00o, oooO0OO, c24328OooO0o);
    }

    public static <K, V> int OooO00o(OooO00o<K, V> oooO00o, K k, V v) {
        return OooOo00.OooO0O0(oooO00o.f64512OooO0O0, 2, v) + OooOo00.OooO0O0(oooO00o.f64511OooO00o, 1, k);
    }

    public static <K, V> void OooO0O0(AbstractC21794OooOO0o abstractC21794OooOO0o, OooO00o<K, V> oooO00o, K k, V v) throws IOException {
        OooOo00.OooOO0O(abstractC21794OooOO0o, oooO00o.f64511OooO00o, 1, k);
        OooOo00.OooOO0O(abstractC21794OooOO0o, oooO00o.f64512OooO0O0, 2, v);
    }
}

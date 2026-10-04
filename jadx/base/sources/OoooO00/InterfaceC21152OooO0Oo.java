package OoooO00;

import java.util.Map;
import oO0O00.InterfaceC32497OooO0Oo;

/* JADX INFO: renamed from: OoooO00.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC21152OooO0Oo<K, V> extends Map, oO0O00.OooO00o {

    /* JADX INFO: renamed from: OoooO00.OooO0Oo$OooO00o */
    public interface OooO00o<K, V> extends Map<K, V>, InterfaceC32497OooO0Oo {
        InterfaceC21152OooO0Oo<K, V> build();
    }

    OooO00o<K, V> builder();
}

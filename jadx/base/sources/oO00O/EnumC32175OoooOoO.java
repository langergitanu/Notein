package oO00O;

import androidx.appcompat.widget.C21532OooOOo;
import com.google.android.material.internal.ViewUtils;

/* JADX INFO: renamed from: oO00O.OoooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public enum EnumC32175OoooOoO {
    /* JADX INFO: Fake field, exist only in values array */
    SSL3(ViewUtils.EDGE_TO_EDGE_FLAGS),
    /* JADX INFO: Fake field, exist only in values array */
    TLS10(769),
    /* JADX INFO: Fake field, exist only in values array */
    TLS11(770),
    TLS12(771);


    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f115440OooOo0o;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final OooO00o f115436OooOo = new OooO00o();

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final EnumC32175OoooOoO[] f115438OooOoO0 = values();

    /* JADX INFO: renamed from: oO00O.OoooOoO$OooO00o */
    public static final class OooO00o {
        public static EnumC32175OoooOoO OooO00o(int i) {
            if (768 > i || i >= 772) {
                throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "Invalid TLS version code "));
            }
            return EnumC32175OoooOoO.f115438OooOoO0[i - ViewUtils.EDGE_TO_EDGE_FLAGS];
        }
    }

    EnumC32175OoooOoO(int i) {
        this.f115440OooOo0o = i;
    }
}

package o00000O;

import Oooo0oO.C21105o000OoO;
import Oooo0oO.o000O0;
import Oooo0oO.o000O0O0;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.emoji2.text.OooO0OO;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public o000O0<Boolean> f81225OooO00o;

    public static final class OooO00o extends OooO0OO.AbstractC21864OooO0o0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ ParcelableSnapshotMutableState f81226OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ OooO0o f81227OooO0O0;

        public OooO00o(ParcelableSnapshotMutableState parcelableSnapshotMutableState, OooO0o oooO0o) {
            this.f81226OooO00o = parcelableSnapshotMutableState;
            this.f81227OooO0O0 = oooO0o;
        }

        @Override // androidx.emoji2.text.OooO0OO.AbstractC21864OooO0o0
        public final void OooO00o() {
            this.f81227OooO0O0.f81225OooO00o = C24107OooO0oo.f81233OooO00o;
        }

        @Override // androidx.emoji2.text.OooO0OO.AbstractC21864OooO0o0
        public final void OooO0O0() {
            this.f81226OooO00o.setValue(Boolean.TRUE);
            this.f81227OooO0O0.f81225OooO00o = new OooO(true);
        }
    }

    public final o000O0<Boolean> OooO00o() {
        androidx.emoji2.text.OooO0OO oooO0OOOooO00o = androidx.emoji2.text.OooO0OO.OooO00o();
        OooOOO0.OooO0o(oooO0OOOooO00o, "get()");
        if (oooO0OOOooO00o.OooO0O0() == 1) {
            return new OooO(true);
        }
        ParcelableSnapshotMutableState parcelableSnapshotMutableStateOooO0OO = C21105o000OoO.OooO0OO(Boolean.FALSE, o000O0O0.f61218OooO00o);
        oooO0OOOooO00o.OooO0oO(new OooO00o(parcelableSnapshotMutableStateOooO0OO, this));
        return parcelableSnapshotMutableStateOooO0OO;
    }
}

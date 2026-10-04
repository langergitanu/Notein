package o00000;

import Oooo0oO.C21105o000OoO;
import Oooo0oO.o000O0O0;
import OoooOOo.C21210OooOo0o;
import androidx.compose.p002ui.platform.AndroidComposeView;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* JADX INFO: renamed from: o00000.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24061OooOoo0 implements InterfaceC24059OooOoOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AndroidComposeView.C21601OooO0oO f81069OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C21210OooOo0o<InterfaceC24057OooOoO<?>, OooO0O0<?>> f81070OooO0O0 = new C21210OooOo0o<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o00000.OooO00o f81071OooO0OO;

    /* JADX INFO: renamed from: o00000.OooOoo0$OooO00o */
    public final class OooO00o implements OooOo {
        public OooO00o() {
        }

        @Override // o00000.OooOo
        public final void OooO00o() {
            C24061OooOoo0 c24061OooOoo0 = C24061OooOoo0.this;
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(c24061OooOoo0.f81071OooO0OO, o00000.OooO00o.f81029OooO00o)) {
                c24061OooOoo0.f81071OooO0OO = null;
            }
        }

        @Override // o00000.OooOo
        public final void OooO0O0() {
            C24061OooOoo0.this.f81071OooO0OO = o00000.OooO00o.f81029OooO00o;
        }
    }

    /* JADX INFO: renamed from: o00000.OooOoo0$OooO0O0 */
    public final class OooO0O0<T extends InterfaceC24058OooOoO0> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final T f81073OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ParcelableSnapshotMutableState f81074OooO0O0 = C21105o000OoO.OooO0OO(0, o000O0O0.f61218OooO00o);

        public OooO0O0(C24061OooOoo0 c24061OooOoo0, T t) {
            this.f81073OooO00o = t;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int OooO00o() {
            return ((Number) this.f81074OooO0O0.getValue()).intValue();
        }
    }

    public C24061OooOoo0(AndroidComposeView.C21601OooO0oO c21601OooO0oO) {
        this.f81069OooO00o = c21601OooO0oO;
    }
}

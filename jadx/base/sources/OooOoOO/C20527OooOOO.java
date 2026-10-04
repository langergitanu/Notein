package OooOoOO;

import OooOoOO.AbstractC20531OooOOo;
import Oooo0oO.C21105o000OoO;
import Oooo0oO.o000O0;
import Oooo0oO.o000O0O0;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import o00ooO0.C25751OooOoo;

/* JADX INFO: renamed from: OooOoOO.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20527OooOOO<T, V extends AbstractC20531OooOOo> implements o000O0<T> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f58637OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC20574Ooooooo<T, V> f58638OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public long f58639OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public V f58640OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public long f58641OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f58642OooOoo0;

    public /* synthetic */ C20527OooOOO(InterfaceC20574Ooooooo interfaceC20574Ooooooo, Object obj, AbstractC20531OooOOo abstractC20531OooOOo, int i) {
        this(interfaceC20574Ooooooo, obj, (i & 4) != 0 ? null : abstractC20531OooOOo, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    @Override // Oooo0oO.o000O0
    public final T getValue() {
        return this.f58637OooOo.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.f58637OooOo.getValue() + ", velocity=" + this.f58638OooOo0o.OooO0O0().invoke(this.f58640OooOoO0) + ", isRunning=" + this.f58642OooOoo0 + ", lastFrameTimeNanos=" + this.f58639OooOoO + ", finishedTimeNanos=" + this.f58641OooOoOO + ')';
    }

    public C20527OooOOO(InterfaceC20574Ooooooo<T, V> typeConverter, T t, V v, long j, long j2, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(typeConverter, "typeConverter");
        this.f58638OooOo0o = typeConverter;
        this.f58637OooOo = C21105o000OoO.OooO0OO(t, o000O0O0.f61218OooO00o);
        this.f58640OooOoO0 = v != null ? (V) C25751OooOoo.OooO00o(v) : (V) C25751OooOoo.OooO0OO(typeConverter.OooO00o().invoke(t));
        this.f58639OooOoO = j;
        this.f58641OooOoOO = j2;
        this.f58642OooOoo0 = z;
    }
}

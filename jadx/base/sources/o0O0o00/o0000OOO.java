package o0O0o00;

import android.graphics.RenderNode;
import androidx.core.util.Pools;

/* JADX INFO: loaded from: classes9.dex */
public final class o0000OOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Pools.SynchronizedPool<RenderNode> f88702OooO00o = new Pools.SynchronizedPool<>(500);

    public final RenderNode OooO00o(int i, int i2) {
        RenderNode renderNodeOooO00o = o0000OO.OooO00o(this.f88702OooO00o.acquire());
        if (renderNodeOooO00o == null) {
            renderNodeOooO00o = o0000OO0.OooO00o();
        } else {
            renderNodeOooO00o.discardDisplayList();
        }
        renderNodeOooO00o.setPosition(0, 0, i, i2);
        return renderNodeOooO00o;
    }
}

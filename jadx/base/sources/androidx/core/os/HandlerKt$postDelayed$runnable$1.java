package androidx.core.os;

import kotlin.Metadata;
import oO00ooO.C32460OooOooO;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m80612d2 = {"LoO00ooO/OooOooO;", "run", "()V", "<anonymous>"}, m80613k = 3, m80614mv = {1, 8, 0})
public final class HandlerKt$postDelayed$runnable$1 implements Runnable {
    final /* synthetic */ oO0O000o.OooO00o<C32460OooOooO> $action;

    public HandlerKt$postDelayed$runnable$1(oO0O000o.OooO00o<C32460OooOooO> oooO00o) {
        this.$action = oooO00o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.$action.invoke();
    }
}

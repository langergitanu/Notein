package o0O00000;

import com.hihonor.penkit.impl.estimate.HnRecycleQueueImpl;
import com.hihonor.stylus.penengine.estimate.HnMotionEventInfo;
import com.hihonor.stylus.penengine.feature.IFeature;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class OooO0OO implements IFeature {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HnRecycleQueueImpl f88123OooO00o = new HnRecycleQueueImpl();

    public static HnMotionEventInfo OooO0O0(OooO00o oooO00o) {
        return new HnMotionEventInfo(oooO00o.f88116OooO00o, oooO00o.f88117OooO0O0, oooO00o.f88118OooO0OO, oooO00o.f88119OooO0Oo, oooO00o.f88120OooO0o0);
    }

    public final void OooO00o() {
        this.f88123OooO00o.clear();
    }

    public final int OooO0OO(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(OooO0O0((OooO00o) it.next()));
        }
        return this.f88123OooO00o.fill(arrayList2);
    }
}

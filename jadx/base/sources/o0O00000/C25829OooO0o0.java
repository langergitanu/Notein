package o0O00000;

import com.hihonor.penkit.impl.estimate.HnRecycleQueueImpl;
import com.hihonor.penkit.impl.estimate.HnStrokeEstimateImpl;
import com.hihonor.stylus.penengine.estimate.HnMotionEventInfo;
import com.hihonor.stylus.penengine.feature.IFeature;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: o0O00000.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C25829OooO0o0 implements IFeature {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HnStrokeEstimateImpl f88126OooO00o = new HnStrokeEstimateImpl();

    public static OooO00o OooO00o(HnMotionEventInfo hnMotionEventInfo) {
        return new OooO00o(hnMotionEventInfo.getX(), hnMotionEventInfo.getY(), hnMotionEventInfo.getPress(), hnMotionEventInfo.getTilt(), hnMotionEventInfo.getEventTime());
    }

    public final int OooO0O0(OooO0OO oooO0OO, ArrayList arrayList) {
        HnRecycleQueueImpl hnRecycleQueueImpl = oooO0OO != null ? oooO0OO.f88123OooO00o : null;
        ArrayList arrayList2 = new ArrayList();
        int estimateEvent = this.f88126OooO00o.getEstimateEvent(hnRecycleQueueImpl, arrayList2);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add(OooO00o((HnMotionEventInfo) it.next()));
        }
        return estimateEvent;
    }

    public final boolean OooO0OO() {
        return this.f88126OooO00o.isFeatureEnable();
    }

    public final void OooO0Oo(float f) {
        this.f88126OooO00o.setRefreshRate(f);
    }
}

package o00ooO00;

import com.facebook.imagepipeline.producers.C22298Ooooo00;
import com.facebook.imagepipeline.producers.InterfaceC22288OoooO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.OooOOO0;
import o00o0o00.C25438OooO00o;

/* JADX INFO: renamed from: o00ooO00.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25756OooO00o implements InterfaceC25758OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f87903OooO00o;

    public C25756OooO00o(Set<? extends InterfaceC25758OooO0OO> set) {
        if (set == null) {
            this.f87903OooO00o = new ArrayList();
            return;
        }
        ArrayList arrayList = new ArrayList(set.size());
        this.f87903OooO00o = arrayList;
        for (Object obj : set) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.o000oOoO
    public final void OooO(InterfaceC22288OoooO interfaceC22288OoooO, String str, Map<String, String> map) {
        Iterator it = this.f87903OooO00o.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC25758OooO0OO) it.next()).OooO(interfaceC22288OoooO, str, map);
            } catch (Exception e) {
                C25438OooO00o.OooO0OO("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.o000oOoO
    public final void OooO00o(InterfaceC22288OoooO producerContext) {
        OooOOO0.OooO0oO(producerContext, "producerContext");
        Iterator it = this.f87903OooO00o.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC25758OooO0OO) it.next()).OooO00o(producerContext);
            } catch (Exception e) {
                C25438OooO00o.OooO0OO("ForwardingRequestListener2", "InternalListener exception in onIntermediateChunkStart", e);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.o000oOoO
    public final void OooO0O0(InterfaceC22288OoooO producerContext, String producerName, boolean z) {
        OooOOO0.OooO0oO(producerContext, "producerContext");
        OooOOO0.OooO0oO(producerName, "producerName");
        Iterator it = this.f87903OooO00o.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC25758OooO0OO) it.next()).OooO0O0(producerContext, producerName, z);
            } catch (Exception e) {
                C25438OooO00o.OooO0OO("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.o000oOoO
    public final void OooO0OO(InterfaceC22288OoooO producerContext, String producerName) {
        OooOOO0.OooO0oO(producerContext, "producerContext");
        OooOOO0.OooO0oO(producerName, "producerName");
        Iterator it = this.f87903OooO00o.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC25758OooO0OO) it.next()).OooO0OO(producerContext, producerName);
            } catch (Exception e) {
                C25438OooO00o.OooO0OO("ForwardingRequestListener2", "InternalListener exception in onProducerStart", e);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.o000oOoO
    public final boolean OooO0Oo(InterfaceC22288OoooO producerContext, String producerName) {
        OooOOO0.OooO0oO(producerContext, "producerContext");
        OooOOO0.OooO0oO(producerName, "producerName");
        ArrayList arrayList = this.f87903OooO00o;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((InterfaceC25758OooO0OO) it.next()).OooO0Oo(producerContext, producerName)) {
                return true;
            }
        }
        return false;
    }

    @Override // o00ooO00.InterfaceC25758OooO0OO
    public final void OooO0o(C22298Ooooo00 producerContext) {
        OooOOO0.OooO0oO(producerContext, "producerContext");
        Iterator it = this.f87903OooO00o.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC25758OooO0OO) it.next()).OooO0o(producerContext);
            } catch (Exception e) {
                C25438OooO00o.OooO0OO("ForwardingRequestListener2", "InternalListener exception in onRequestSuccess", e);
            }
        }
    }

    @Override // o00ooO00.InterfaceC25758OooO0OO
    public final void OooO0o0(InterfaceC22288OoooO producerContext) {
        OooOOO0.OooO0oO(producerContext, "producerContext");
        Iterator it = this.f87903OooO00o.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC25758OooO0OO) it.next()).OooO0o0(producerContext);
            } catch (Exception e) {
                C25438OooO00o.OooO0OO("ForwardingRequestListener2", "InternalListener exception in onRequestCancellation", e);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.o000oOoO
    public final void OooO0oO(InterfaceC22288OoooO interfaceC22288OoooO, String str) {
        Iterator it = this.f87903OooO00o.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC25758OooO0OO) it.next()).OooO0oO(interfaceC22288OoooO, str);
            } catch (Exception e) {
                C25438OooO00o.OooO0OO("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithCancellation", e);
            }
        }
    }

    @Override // o00ooO00.InterfaceC25758OooO0OO
    public final void OooO0oo(InterfaceC22288OoooO producerContext, Throwable throwable) {
        OooOOO0.OooO0oO(producerContext, "producerContext");
        OooOOO0.OooO0oO(throwable, "throwable");
        Iterator it = this.f87903OooO00o.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC25758OooO0OO) it.next()).OooO0oo(producerContext, throwable);
            } catch (Exception e) {
                C25438OooO00o.OooO0OO("ForwardingRequestListener2", "InternalListener exception in onRequestFailure", e);
            }
        }
    }

    @Override // o00ooO00.InterfaceC25758OooO0OO
    public final void OooOO0(C22298Ooooo00 c22298Ooooo00) {
        Iterator it = this.f87903OooO00o.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC25758OooO0OO) it.next()).OooOO0(c22298Ooooo00);
            } catch (Exception e) {
                C25438OooO00o.OooO0OO("ForwardingRequestListener2", "InternalListener exception in onRequestStart", e);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.o000oOoO
    public final void OooOO0O(InterfaceC22288OoooO interfaceC22288OoooO, String str, Throwable th, Map<String, String> map) {
        Iterator it = this.f87903OooO00o.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC25758OooO0OO) it.next()).OooOO0O(interfaceC22288OoooO, str, th, map);
            } catch (Exception e) {
                C25438OooO00o.OooO0OO("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithFailure", e);
            }
        }
    }
}

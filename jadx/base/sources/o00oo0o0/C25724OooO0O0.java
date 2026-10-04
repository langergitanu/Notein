package o00oo0o0;

import com.facebook.imagepipeline.producers.C22274OooOoOO;
import com.facebook.imagepipeline.producers.C22298Ooooo00;
import com.facebook.imagepipeline.producers.InterfaceC22291OoooO0O;
import kotlin.jvm.internal.OooOOO0;
import o00o0o.AbstractC25434OooO00o;
import o00o0oo.AbstractC25464OooO0OO;
import o00ooO.C25732OooO0O0;

/* JADX INFO: renamed from: o00oo0o0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25724OooO0O0<T> extends AbstractC25464OooO0OO<AbstractC25434OooO00o<Object>> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C22274OooOoOO f87806OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C22298Ooooo00 f87807OooO0oo;

    public C25724OooO0O0(InterfaceC22291OoooO0O producer, C22298Ooooo00 c22298Ooooo00, C22274OooOoOO c22274OooOoOO) {
        OooOOO0.OooO0oO(producer, "producer");
        this.f87807OooO0oo = c22298Ooooo00;
        this.f87806OooO = c22274OooOoOO;
        C25732OooO0O0.OooO00o();
        this.f86768OooO00o = c22298Ooooo00.f67290OooOoo0;
        C25732OooO0O0.OooO00o();
        c22274OooOoOO.OooOO0(c22298Ooooo00);
        C25732OooO0O0.OooO00o();
        producer.OooO00o(new C25723OooO00o(this), c22298Ooooo00);
    }

    @Override // o00o0oo.AbstractC25464OooO0OO
    public final void OooO0o0(AbstractC25434OooO00o<Object> abstractC25434OooO00o) {
        AbstractC25434OooO00o.OooOooo(abstractC25434OooO00o);
    }

    @Override // o00o0oo.AbstractC25464OooO0OO, o00o0oo.InterfaceC25467OooO0o0
    public final boolean close() {
        if (!super.close()) {
            return false;
        }
        if (OooO0OO()) {
            return true;
        }
        C22274OooOoOO c22274OooOoOO = this.f87806OooO;
        C22298Ooooo00 c22298Ooooo00 = this.f87807OooO0oo;
        c22274OooOoOO.OooO0o0(c22298Ooooo00);
        c22298Ooooo00.OooO0oO();
        return true;
    }

    @Override // o00o0oo.AbstractC25464OooO0OO, o00o0oo.InterfaceC25467OooO0o0
    public final Object getResult() {
        return AbstractC25434OooO00o.OooOOO0((AbstractC25434OooO00o) super.getResult());
    }
}

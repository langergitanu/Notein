package o00oo0Oo;

import com.facebook.imagepipeline.producers.C22294OoooOOo;
import com.facebook.imagepipeline.producers.InterfaceC22291OoooO0O;
import o00ooO.C25732OooO0O0;

/* JADX INFO: renamed from: o00oo0Oo.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C25706OooOoO implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f87752OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f87753OooOo0o;

    public /* synthetic */ C25706OooOoO(Object obj, int i) {
        this.f87753OooOo0o = i;
        this.f87752OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f87753OooOo0o) {
            case 0:
                C25722OoooO00 this$0 = (C25722OoooO00) this.f87752OooOo;
                kotlin.jvm.internal.OooOOO0.OooO0oO(this$0, "this$0");
                C25732OooO0O0.OooO00o();
                Object value = this$0.f87795OooOOO.getValue();
                kotlin.jvm.internal.OooOOO0.OooO0o(value, "getValue(...)");
                return new C22294OoooOOo((InterfaceC22291OoooO0O) value);
            default:
                return Long.valueOf(((o0Oo0O.OooOOO) this.f87752OooOo).f99427OooO0Oo.getValueAsLong("rconfig_integrity_check_interval_ms"));
        }
    }
}

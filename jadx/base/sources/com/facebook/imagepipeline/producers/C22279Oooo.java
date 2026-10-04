package com.facebook.imagepipeline.producers;

import android.util.Pair;
import com.facebook.imagepipeline.producers.AbstractC22290OoooO00;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.Oooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22279Oooo extends C22260OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Pair f67389OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ AbstractC22290OoooO00.OooO00o f67390OooO0O0;

    public C22279Oooo(AbstractC22290OoooO00.OooO00o oooO00o, Pair pair) {
        this.f67390OooO0O0 = oooO00o;
        this.f67389OooO00o = pair;
    }

    @Override // com.facebook.imagepipeline.producers.C22260OooO0Oo, com.facebook.imagepipeline.producers.InterfaceC22292OoooOO0
    public final void OooO00o() {
        OooO0OO.OooO0O0(this.f67390OooO0O0.OooOO0());
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC22292OoooOO0
    public final void OooO0O0() {
        boolean zRemove;
        ArrayList arrayList;
        OooO0OO oooO0OO;
        ArrayList arrayListOooOO0o;
        ArrayList arrayListOooOO0;
        synchronized (this.f67390OooO0O0) {
            try {
                zRemove = this.f67390OooO0O0.f67425OooO0O0.remove(this.f67389OooO00o);
                arrayList = null;
                if (!zRemove) {
                    oooO0OO = null;
                    arrayListOooOO0o = null;
                } else if (this.f67390OooO0O0.f67425OooO0O0.isEmpty()) {
                    oooO0OO = this.f67390OooO0O0.f67428OooO0o;
                    arrayListOooOO0o = null;
                } else {
                    ArrayList arrayListOooOO0O = this.f67390OooO0O0.OooOO0O();
                    arrayListOooOO0o = this.f67390OooO0O0.OooOO0o();
                    arrayListOooOO0 = this.f67390OooO0O0.OooOO0();
                    oooO0OO = null;
                    arrayList = arrayListOooOO0O;
                }
                arrayListOooOO0 = arrayListOooOO0o;
            } catch (Throwable th) {
                throw th;
            }
        }
        OooO0OO.OooO0Oo(arrayList);
        OooO0OO.OooO0o(arrayListOooOO0o);
        OooO0OO.OooO0O0(arrayListOooOO0);
        if (oooO0OO != null) {
            AbstractC22290OoooO00.this.getClass();
            oooO0OO.OooO0oO();
        }
        if (zRemove) {
            ((OooO) this.f67389OooO00o.first).OooO0O0();
        }
    }

    @Override // com.facebook.imagepipeline.producers.C22260OooO0Oo, com.facebook.imagepipeline.producers.InterfaceC22292OoooOO0
    public final void OooO0OO() {
        OooO0OO.OooO0Oo(this.f67390OooO0O0.OooOO0O());
    }

    @Override // com.facebook.imagepipeline.producers.C22260OooO0Oo, com.facebook.imagepipeline.producers.InterfaceC22292OoooOO0
    public final void OooO0Oo() {
        OooO0OO.OooO0o(this.f67390OooO0O0.OooOO0o());
    }
}

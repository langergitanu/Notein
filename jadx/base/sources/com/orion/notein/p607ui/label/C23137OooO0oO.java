package com.orion.notein.p607ui.label;

import com.orion.notein.p607ui.label.OooO0o;
import java.util.ArrayList;
import kotlin.jvm.internal.OooOOO0;
import o0Oo0ooO.C28421OooOOOo;
import o0Oo0ooO.C28422OooOOo;
import o0Oo0ooO.InterfaceC28462OooooOo;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: com.orion.notein.ui.label.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C23137OooO0oO implements InterfaceC28462OooooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooO0o.OooO0O0 f72052OooO00o;

    public C23137OooO0oO(OooO0o.OooO0O0 oooO0O0) {
        this.f72052OooO00o = oooO0O0;
    }

    @Override // o0Oo0ooO.InterfaceC28462OooooOo
    public final void OooO00o(C28422OooOOo c28422OooOOo, int i) {
        OooO0o.OooO0O0 oooO0O0 = this.f72052OooO00o;
        oooO0O0.f72003OooOO0 = i;
        int i2 = c28422OooOOo.f100769OooO00o;
        oooO0O0.f72004OooOO0O = Integer.valueOf(i2);
        C28421OooOOOo c28421OooOOOo = oooO0O0.f72001OooO0oO;
        Iterable iterable = c28421OooOOOo.f66021OooO00o.f65811OooO0o;
        OooOOO0.OooO0o(iterable, "getCurrentList(...)");
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable2, 10));
        int i3 = 0;
        for (Object obj : iterable2) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                C34429OooOOo0.OooOOo();
                throw null;
            }
            arrayList.add(C28422OooOOo.OooO00o((C28422OooOOo) obj, i3 == i, 3));
            i3 = i4;
        }
        c28421OooOOOo.OooO0Oo(arrayList);
        oooO0O0.OooO0O0(Integer.valueOf(i2));
        OooO0o.this.f71993OooO0O0.OooO00o(i);
    }
}

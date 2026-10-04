package com.orion.notein.p607ui.label;

import android.content.res.ColorStateList;
import android.widget.ImageView;
import androidx.core.widget.ImageViewCompat;
import com.orion.notein.p607ui.label.OooO0OO;
import java.util.ArrayList;
import kotlin.jvm.internal.OooOOO0;
import o0Oo0ooO.C28421OooOOOo;
import o0Oo0ooO.C28422OooOOo;
import o0Oo0ooO.InterfaceC28462OooooOo;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o implements InterfaceC28462OooooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooO0OO.OooO00o f71968OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ OooO0OO f71969OooO0O0;

    public OooO00o(OooO0OO.OooO00o oooO00o, OooO0OO oooO0OO) {
        this.f71968OooO00o = oooO00o;
        this.f71969OooO0O0 = oooO0OO;
    }

    @Override // o0Oo0ooO.InterfaceC28462OooooOo
    public final void OooO00o(C28422OooOOo c28422OooOOo, int i) {
        OooO0OO.OooO00o oooO00o = this.f71968OooO00o;
        oooO00o.f71973OooO = i;
        oooO00o.f71982OooOO0 = Integer.valueOf(c28422OooOOo.f100769OooO00o);
        C28421OooOOOo c28421OooOOOo = oooO00o.f71978OooO0o;
        Iterable iterable = c28421OooOOOo.f66021OooO00o.f65811OooO0o;
        OooOOO0.OooO0o(iterable, "getCurrentList(...)");
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable2, 10));
        int i2 = 0;
        for (Object obj : iterable2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C34429OooOOo0.OooOOo();
                throw null;
            }
            arrayList.add(C28422OooOOo.OooO00o((C28422OooOOo) obj, i2 == i, 3));
            i2 = i3;
        }
        c28421OooOOOo.OooO0Oo(arrayList);
        Integer num = oooO00o.f71982OooOO0;
        ImageView imageView = oooO00o.f71979OooO0o0;
        if (num != null) {
            ImageViewCompat.setImageTintList(imageView, ColorStateList.valueOf(num.intValue()));
        } else {
            ImageViewCompat.setImageTintList(imageView, null);
        }
        OooO0OO.InterfaceC19211OooO0OO interfaceC19211OooO0OO = this.f71969OooO0O0.f71972OooO0O0;
        if (interfaceC19211OooO0OO != null) {
            interfaceC19211OooO0OO.OooO00o(i);
        }
    }
}

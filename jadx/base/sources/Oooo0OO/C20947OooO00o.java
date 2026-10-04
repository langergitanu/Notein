package Oooo0OO;

import OooOoOO.C20559OoooOOO;
import OooOooO.C20738OooOOOo;
import Oooo0oO.C21105o000OoO;
import Oooo0oO.o0000OO0;
import Oooo0oO.o000O0O0;
import Oooo0oO.o00oO0O;
import OooooO0.C21293OooOO0;
import OooooOO.C21325OooOooo;
import OooooOO.C21328Oooo000;
import OooooOO.C21348Ooooo0o;
import OooooOO.InterfaceC21342OoooOOO;
import Oooooo0.C21397OooO00o;
import android.content.Context;
import android.graphics.Canvas;
import androidx.compose.material.ripple.RippleContainer;
import androidx.compose.material.ripple.RippleHostView;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import o00oO0O.C25508OooOoo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: Oooo0OO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20947OooO00o extends AbstractC20960OooOOOO implements o0000OO0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final boolean f60443OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final o00oO0O f60444OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final float f60445OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final o00oO0O f60446OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f60447OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final RippleContainer f60448OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f60449OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public long f60450OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public int f60451Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final C20559OoooOOO f60452Oooo00O;

    public C20947OooO00o() {
        throw null;
    }

    public C20947OooO00o(boolean z, float f, o00oO0O o00oo0o, o00oO0O o00oo0o2, RippleContainer rippleContainer) {
        super(o00oo0o2, z);
        this.f60443OooOo = z;
        this.f60445OooOoO0 = f;
        this.f60444OooOoO = o00oo0o;
        this.f60446OooOoOO = o00oo0o2;
        this.f60448OooOoo0 = rippleContainer;
        o000O0O0 o000o0o02 = o000O0O0.f61218OooO00o;
        this.f60447OooOoo = C21105o000OoO.OooO0OO(null, o000o0o02);
        this.f60449OooOooO = C21105o000OoO.OooO0OO(Boolean.TRUE, o000o0o02);
        this.f60450OooOooo = C21293OooOO0.f61728OooO0O0;
        this.f60451Oooo000 = -1;
        this.f60452Oooo00O = new C20559OoooOOO(this, 1);
    }

    @Override // Oooo0oO.o0000OO0
    public final void OooO0o0() {
    }

    @Override // Oooo0oO.o0000OO0
    public final void Oooo0OO() {
        o00000Oo();
    }

    @Override // Oooo0oO.o0000OO0
    public final void Oooo0oO() {
        o00000Oo();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // OooOoo0.oo000o
    public final void OoooO0(C25508OooOoo c25508OooOoo) {
        int iO0OoOo0;
        C21397OooO00o c21397OooO00o = c25508OooOoo.f86983OooOo0o;
        this.f60450OooOooo = c21397OooO00o.OooOOo0();
        float f = this.f60445OooOoO0;
        if (Float.isNaN(f)) {
            iO0OoOo0 = oO0O00O.OooO00o.OooO0O0(C20957OooOO0o.OooO00o(c25508OooOoo, this.f60443OooOo, c21397OooO00o.OooOOo0()));
        } else {
            iO0OoOo0 = c21397OooO00o.o0OoOo0(f);
        }
        this.f60451Oooo000 = iO0OoOo0;
        long j = ((C21348Ooooo0o) this.f60444OooOoO.getValue()).f61768OooO00o;
        float f2 = ((C20953OooO0oO) this.f60446OooOoOO.getValue()).f60475OooO0Oo;
        c25508OooOoo.Ooooo0o();
        o0O0O00(c25508OooOoo, f, j);
        InterfaceC21342OoooOOO interfaceC21342OoooOOOOooO00o = c21397OooO00o.f61911OooOo.OooO00o();
        ((Boolean) this.f60449OooOooO.getValue()).booleanValue();
        RippleHostView rippleHostView = (RippleHostView) this.f60447OooOoo.getValue();
        if (rippleHostView != null) {
            rippleHostView.OooO0o0(c21397OooO00o.OooOOo0(), j, this.f60451Oooo000, f2);
            Canvas canvas = C21328Oooo000.f61738OooO00o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC21342OoooOOOOooO00o, "<this>");
            rippleHostView.draw(((C21325OooOooo) interfaceC21342OoooOOOOooO00o).f61733OooO00o);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Oooo0OO.AbstractC20960OooOOOO
    public final void o000000O(C20738OooOOOo interaction) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interaction, "interaction");
        RippleHostView rippleHostView = (RippleHostView) this.f60447OooOoo.getValue();
        if (rippleHostView != null) {
            rippleHostView.OooO0Oo();
        }
    }

    public final void o00000Oo() {
        RippleContainer rippleContainer = this.f60448OooOoo0;
        rippleContainer.getClass();
        this.f60447OooOoo.setValue(null);
        C20959OooOOO0 c20959OooOOO0 = rippleContainer.f63315OooOoO;
        c20959OooOOO0.getClass();
        LinkedHashMap linkedHashMap = c20959OooOOO0.f60499OooO00o;
        RippleHostView rippleHostView = (RippleHostView) linkedHashMap.get(this);
        if (rippleHostView != null) {
            rippleHostView.OooO0OO();
            RippleHostView rippleHostView2 = (RippleHostView) linkedHashMap.get(this);
            if (rippleHostView2 != null) {
            }
            linkedHashMap.remove(this);
            rippleContainer.f63316OooOoO0.add(rippleHostView);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Oooo0OO.AbstractC20960OooOOOO
    public final void o0Oo0oo(C20738OooOOOo interaction, InterfaceC33636Oooo00o scope) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interaction, "interaction");
        kotlin.jvm.internal.OooOOO0.OooO0oO(scope, "scope");
        RippleContainer rippleContainer = this.f60448OooOoo0;
        rippleContainer.getClass();
        C20959OooOOO0 c20959OooOOO0 = rippleContainer.f63315OooOoO;
        c20959OooOOO0.getClass();
        LinkedHashMap linkedHashMap = c20959OooOOO0.f60499OooO00o;
        RippleHostView rippleHostView = (RippleHostView) linkedHashMap.get(this);
        if (rippleHostView == null) {
            ArrayList arrayList = rippleContainer.f63316OooOoO0;
            kotlin.jvm.internal.OooOOO0.OooO0oO(arrayList, "<this>");
            rippleHostView = (RippleHostView) (arrayList.isEmpty() ? null : arrayList.remove(0));
            LinkedHashMap linkedHashMap2 = c20959OooOOO0.f60500OooO0O0;
            if (rippleHostView == null) {
                int i = rippleContainer.f63317OooOoOO;
                ArrayList arrayList2 = rippleContainer.f63313OooOo;
                if (i > C34429OooOOo0.OooOO0O(arrayList2)) {
                    Context context = rippleContainer.getContext();
                    kotlin.jvm.internal.OooOOO0.OooO0o(context, "context");
                    rippleHostView = new RippleHostView(context);
                    rippleContainer.addView(rippleHostView);
                    arrayList2.add(rippleHostView);
                } else {
                    rippleHostView = (RippleHostView) arrayList2.get(rippleContainer.f63317OooOoOO);
                    kotlin.jvm.internal.OooOOO0.OooO0oO(rippleHostView, "rippleHostView");
                    C20947OooO00o c20947OooO00o = (C20947OooO00o) linkedHashMap2.get(rippleHostView);
                    if (c20947OooO00o != null) {
                        c20947OooO00o.f60447OooOoo.setValue(null);
                        RippleHostView rippleHostView2 = (RippleHostView) linkedHashMap.get(c20947OooO00o);
                        if (rippleHostView2 != null) {
                        }
                        linkedHashMap.remove(c20947OooO00o);
                        rippleHostView.OooO0OO();
                    }
                }
                int i2 = rippleContainer.f63317OooOoOO;
                if (i2 < rippleContainer.f63314OooOo0o - 1) {
                    rippleContainer.f63317OooOoOO = i2 + 1;
                } else {
                    rippleContainer.f63317OooOoOO = 0;
                }
            }
            linkedHashMap.put(this, rippleHostView);
            linkedHashMap2.put(rippleHostView, this);
        }
        RippleHostView rippleHostView3 = rippleHostView;
        rippleHostView3.OooO0O0(interaction, this.f60443OooOo, this.f60450OooOooo, this.f60451Oooo000, ((C21348Ooooo0o) this.f60444OooOoO.getValue()).f61768OooO00o, ((C20953OooO0oO) this.f60446OooOoOO.getValue()).f60475OooO0Oo, this.f60452Oooo00O);
        this.f60447OooOoo.setValue(rippleHostView3);
    }
}

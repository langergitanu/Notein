package o00oOo0o;

import Oooo0.OooOo00;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import o00O00oO.OooOO0O;
import o00OoOo0.C25069OooO00o;
import o00OoOoo.C25071OooO00o;
import o00o0OOO.InterfaceC25397OooO00o;
import o00o0Oo.InterfaceExecutorServiceC25418OooO0o0;
import o00o0Oo.OooO0o;
import o00o0Ooo.C25432OooOO0;
import o00oOOO0.C25583OooO0OO;
import o00oOOOO.C25585OooO00o;
import o00oOOOO.InterfaceC25586OooO0O0;
import o00oOOOo.C25587OooO00o;
import o00oOOOo.C25588OooO0O0;
import o00oOOOo.C25589OooO0OO;
import o00oOOo0.C25593OooO0O0;
import o00oOOo0.C25594OooO0OO;
import o00oOOo0.C25596OooO0o0;
import o00oOo0O.C25610OooO0O0;
import o00oOoo0.C25629OooO0Oo;
import o00oOoo0.InterfaceC25628OooO0OO;
import o00oOooO.C25631OooO00o;
import o00oo.InterfaceC25636OooO0Oo;
import o00oo0.C25641OooO00o;
import o00oo00O.C25647OooO00o;
import o00oo00O.C25649OooO0OO;
import o00oo0O0.InterfaceC25665OooOO0;
import o00oo0OO.AbstractC25682OooO0O0;

/* JADX INFO: renamed from: o00oOo0o.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25614OooO0Oo implements o0O0o.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C25432OooOO0 f87404OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00O00o0.OooO0O0 f87405OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0o f87406OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceExecutorServiceC25418OooO0o0 f87407OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final RealtimeSinceBootClock f87408OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final InterfaceC25665OooOO0<InterfaceC25397OooO00o, InterfaceC25636OooO0Oo> f87409OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final AbstractC25682OooO0O0 f87410OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C25432OooOO0 f87411OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C25432OooOO0 f87412OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final C25432OooOO0 f87413OooOO0;

    public C25614OooO0Oo(o00O00o0.OooO0O0 oooO0O0, OooO0o oooO0o, InterfaceExecutorServiceC25418OooO0o0 interfaceExecutorServiceC25418OooO0o0, RealtimeSinceBootClock realtimeSinceBootClock, AbstractC25682OooO0O0 abstractC25682OooO0O0, InterfaceC25665OooOO0 interfaceC25665OooOO0, C25069OooO00o c25069OooO00o, C25071OooO00o c25071OooO00o, C25432OooOO0 c25432OooOO0, C25432OooOO0 c25432OooOO02, C25432OooOO0 c25432OooOO03, C25432OooOO0 c25432OooOO04) {
        this.f87405OooO00o = oooO0O0;
        this.f87406OooO0O0 = oooO0o;
        this.f87407OooO0OO = interfaceExecutorServiceC25418OooO0o0;
        this.f87408OooO0Oo = realtimeSinceBootClock;
        this.f87410OooO0o0 = abstractC25682OooO0O0;
        this.f87409OooO0o = interfaceC25665OooOO0;
        this.f87411OooO0oO = c25432OooOO0;
        this.f87404OooO = c25432OooOO03;
        this.f87412OooO0oo = c25432OooOO02;
        this.f87413OooOO0 = c25432OooOO04;
    }

    @Override // o0O0o.OooO00o
    public final boolean OooO00o(InterfaceC25636OooO0Oo interfaceC25636OooO0Oo) {
        return interfaceC25636OooO0Oo instanceof o00oo.OooO0O0;
    }

    @Override // o0O0o.OooO00o
    public final Drawable OooO0O0(InterfaceC25636OooO0Oo interfaceC25636OooO0Oo) {
        InterfaceC25628OooO0OO interfaceC25628OooO0OO;
        C25629OooO0Oo c25629OooO0Oo;
        InterfaceC25586OooO0O0 c25588OooO0O0;
        C25593OooO0O0 c25593OooO0O0;
        C25594OooO0OO c25594OooO0OO = null;
        if (!(interfaceC25636OooO0Oo instanceof o00oo.OooO0O0)) {
            return null;
        }
        o00oo.OooO0O0 oooO0O0 = (o00oo.OooO0O0) interfaceC25636OooO0Oo;
        synchronized (oooO0O0) {
            C25629OooO0Oo c25629OooO0Oo2 = oooO0O0.f87493OooOoO;
            interfaceC25628OooO0OO = c25629OooO0Oo2 == null ? null : c25629OooO0Oo2.f87474OooO00o;
        }
        synchronized (oooO0O0) {
            c25629OooO0Oo = oooO0O0.f87493OooOoO;
        }
        c25629OooO0Oo.getClass();
        Bitmap.Config configOooO0oo = interfaceC25628OooO0OO != null ? interfaceC25628OooO0OO.OooO0oo() : null;
        InterfaceC25628OooO0OO interfaceC25628OooO0OO2 = c25629OooO0Oo.f87474OooO00o;
        Rect rect = new Rect(0, 0, interfaceC25628OooO0OO2.getWidth(), interfaceC25628OooO0OO2.getHeight());
        AnimatedFactoryV2Impl animatedFactoryV2Impl = (AnimatedFactoryV2Impl) this.f87405OooO00o.f84154OooO0O0;
        if (animatedFactoryV2Impl.f67254OooO0oO == null) {
            animatedFactoryV2Impl.f67254OooO0oO = new C25641OooO00o();
        }
        C25647OooO00o c25647OooO00o = new C25647OooO00o(animatedFactoryV2Impl.f67254OooO0oO, c25629OooO0Oo, rect, animatedFactoryV2Impl.f67251OooO0Oo);
        OooOO0O oooOO0O = new OooOO0O(c25647OooO00o);
        Integer num = 2;
        int iIntValue = num.intValue();
        if (iIntValue == 1) {
            c25588OooO0O0 = new C25588OooO0O0(new C25649OooO0OO(new C25587OooO00o(c25629OooO0Oo.hashCode(), false), this.f87409OooO0o), true);
        } else if (iIntValue == 2) {
            c25588OooO0O0 = new C25588OooO0O0(new C25649OooO0OO(new C25587OooO00o(c25629OooO0Oo.hashCode(), false), this.f87409OooO0o), false);
        } else if (iIntValue != 3) {
            c25588OooO0O0 = new OooOo00();
        } else {
            C25589OooO0OO c25589OooO0OO = new C25589OooO0OO();
            c25589OooO0OO.f87291OooO00o = -1;
            c25588OooO0O0 = c25589OooO0OO;
        }
        C25432OooOO0 c25432OooOO0 = this.f87411OooO0oO;
        C25631OooO00o c25631OooO00o = new C25631OooO00o(c25588OooO0O0, c25647OooO00o, ((Boolean) c25432OooOO0.f86707OooO00o).booleanValue());
        Integer num2 = 3;
        int iIntValue2 = num2.intValue();
        AbstractC25682OooO0O0 abstractC25682OooO0O0 = this.f87410OooO0o0;
        if (iIntValue2 > 0) {
            c25594OooO0OO = new C25594OooO0OO(iIntValue2);
            if (configOooO0oo == null) {
                configOooO0oo = Bitmap.Config.ARGB_8888;
            }
            c25593OooO0O0 = new C25593OooO0O0(abstractC25682OooO0O0, c25631OooO00o, configOooO0oo, this.f87407OooO0OO);
        } else {
            c25593OooO0O0 = null;
        }
        C25585OooO00o c25585OooO00o = new C25585OooO00o(this.f87410OooO0o0, c25588OooO0O0, oooOO0O, c25631OooO00o, ((Boolean) c25432OooOO0.f86707OooO00o).booleanValue(), ((Boolean) c25432OooOO0.f86707OooO00o).booleanValue() ? new C25596OooO0o0(c25629OooO0Oo.f87475OooO0O0, oooOO0O, c25631OooO00o, new o00oOo00.OooOO0O(abstractC25682OooO0O0, ((Integer) this.f87404OooO.f86707OooO00o).intValue(), ((Integer) this.f87413OooOO0.f86707OooO00o).intValue()), ((Boolean) this.f87412OooO0oo.f86707OooO00o).booleanValue()) : c25594OooO0OO, c25593OooO0O0);
        return new C25610OooO0O0(new C25583OooO0OO(c25585OooO00o, c25585OooO00o, this.f87408OooO0Oo, this.f87406OooO0O0));
    }
}

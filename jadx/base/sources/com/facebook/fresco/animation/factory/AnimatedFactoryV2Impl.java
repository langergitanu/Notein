package com.facebook.fresco.animation.factory;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import java.util.concurrent.LinkedBlockingQueue;
import o00O00o0.OooO0O0;
import o00OoOo0.C25069OooO00o;
import o00OoOoo.C25071OooO00o;
import o00o0OOO.InterfaceC25397OooO00o;
import o00o0Oo.C25416OooO0OO;
import o00o0Oo.InterfaceExecutorServiceC25418OooO0o0;
import o00o0Oo.OooO0o;
import o00o0Ooo.C25432OooOO0;
import o00o0o.AbstractC25434OooO00o;
import o00o0o0o.InterfaceC25449OooO0oO;
import o00oOo0o.C25611OooO00o;
import o00oOo0o.C25612OooO0O0;
import o00oOo0o.C25614OooO0Oo;
import o00oOooo.C25634OooO0OO;
import o00oOooo.InterfaceC25632OooO00o;
import o00oOooo.InterfaceC25633OooO0O0;
import o00oo.C25638OooO0oO;
import o00oo.InterfaceC25636OooO0Oo;
import o00oo.InterfaceC25640OooOO0o;
import o00oo0.C25641OooO00o;
import o00oo0O.C25651OooO00o;
import o00oo0O0.InterfaceC25665OooOO0;
import o00oo0OO.AbstractC25682OooO0O0;
import o00oo0Oo.InterfaceC25699OooOOOo;
import o00oo0oO.InterfaceC25727OooO0OO;
import o0O0o.OooO00o;

/* JADX INFO: loaded from: classes5.dex */
public class AnimatedFactoryV2Impl implements InterfaceC25632OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final InterfaceExecutorServiceC25418OooO0o0 f67247OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractC25682OooO0O0 f67248OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC25699OooOOOo f67249OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC25665OooOO0<InterfaceC25397OooO00o, InterfaceC25636OooO0Oo> f67250OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f67251OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public OooO0O0 f67252OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public C25634OooO0OO f67253OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public C25641OooO00o f67254OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public C25614OooO0Oo f67255OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f67256OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final boolean f67257OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final int f67258OooOO0o;

    public AnimatedFactoryV2Impl(AbstractC25682OooO0O0 abstractC25682OooO0O0, InterfaceC25699OooOOOo interfaceC25699OooOOOo, InterfaceC25665OooOO0<InterfaceC25397OooO00o, InterfaceC25636OooO0Oo> interfaceC25665OooOO0, boolean z, boolean z2, int i, int i2, InterfaceExecutorServiceC25418OooO0o0 interfaceExecutorServiceC25418OooO0o0) {
        this.f67248OooO00o = abstractC25682OooO0O0;
        this.f67249OooO0O0 = interfaceC25699OooOOOo;
        this.f67250OooO0OO = interfaceC25665OooOO0;
        this.f67256OooOO0 = i;
        this.f67257OooOO0O = z2;
        this.f67251OooO0Oo = z;
        this.f67247OooO = interfaceExecutorServiceC25418OooO0o0;
        this.f67258OooOO0o = i2;
    }

    @Override // o00oOooo.InterfaceC25632OooO00o
    public final OooO00o OooO00o() {
        if (this.f67255OooO0oo == null) {
            C25069OooO00o c25069OooO00o = new C25069OooO00o();
            InterfaceExecutorServiceC25418OooO0o0 c25416OooO0OO = this.f67247OooO;
            if (c25416OooO0OO == null) {
                c25416OooO0OO = new C25416OooO0OO(this.f67249OooO0O0.OooO0o(), new LinkedBlockingQueue());
            }
            InterfaceExecutorServiceC25418OooO0o0 interfaceExecutorServiceC25418OooO0o0 = c25416OooO0OO;
            C25071OooO00o c25071OooO00o = new C25071OooO00o();
            if (this.f67252OooO0o == null) {
                this.f67252OooO0o = new OooO0O0(this, 1);
            }
            OooO0O0 oooO0O0 = this.f67252OooO0o;
            if (OooO0o.f86694OooOo == null) {
                OooO0o.f86694OooOo = new OooO0o(new Handler(Looper.getMainLooper()));
            }
            this.f67255OooO0oo = new C25614OooO0Oo(oooO0O0, OooO0o.f86694OooOo, interfaceExecutorServiceC25418OooO0o0, RealtimeSinceBootClock.get(), this.f67248OooO00o, this.f67250OooO0OO, c25069OooO00o, c25071OooO00o, new C25432OooOO0(Boolean.valueOf(this.f67257OooOO0O)), new C25432OooOO0(Boolean.valueOf(this.f67251OooO0Oo)), new C25432OooOO0(Integer.valueOf(this.f67256OooOO0)), new C25432OooOO0(Integer.valueOf(this.f67258OooOO0o)));
        }
        return this.f67255OooO0oo;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [o00oOo0o.OooO00o] */
    @Override // o00oOooo.InterfaceC25632OooO00o
    public final C25611OooO00o OooO0O0() {
        return new InterfaceC25727OooO0OO() { // from class: o00oOo0o.OooO00o
            @Override // o00oo0oO.InterfaceC25727OooO0OO
            public final InterfaceC25636OooO0Oo OooO00o(C25638OooO0oO c25638OooO0oO, int i, InterfaceC25640OooOO0o interfaceC25640OooOO0o, C25651OooO00o c25651OooO00o) {
                AnimatedFactoryV2Impl animatedFactoryV2Impl = this.f87402OooO00o;
                if (animatedFactoryV2Impl.f67253OooO0o0 == null) {
                    animatedFactoryV2Impl.f67253OooO0o0 = new C25634OooO0OO(new C25613OooO0OO(animatedFactoryV2Impl), animatedFactoryV2Impl.f67248OooO00o, animatedFactoryV2Impl.f67257OooOO0O);
                }
                C25634OooO0OO c25634OooO0OO = animatedFactoryV2Impl.f67253OooO0o0;
                Bitmap.Config config = c25651OooO00o.f87564OooO0O0;
                c25634OooO0OO.getClass();
                InterfaceC25633OooO0O0 interfaceC25633OooO0O0 = C25634OooO0OO.f87489OooO0O0;
                if (interfaceC25633OooO0O0 == null) {
                    throw new UnsupportedOperationException("To encode animated webp please add the dependency to the animated-webp module");
                }
                AbstractC25434OooO00o abstractC25434OooO00oOooOOO0 = AbstractC25434OooO00o.OooOOO0(c25638OooO0oO.f87502OooOo0o);
                abstractC25434OooO00oOooOOO0.getClass();
                try {
                    InterfaceC25449OooO0oO interfaceC25449OooO0oO = (InterfaceC25449OooO0oO) abstractC25434OooO00oOooOOO0.Oooo000();
                    o00oo.OooO0O0 oooO0O0OooO00o = C25634OooO0OO.OooO00o(c25638OooO0oO.f87510Oooo000, c25651OooO00o, interfaceC25449OooO0oO.OooOO0o() != null ? interfaceC25633OooO0O0.OooO0OO(interfaceC25449OooO0oO.OooOO0o(), c25651OooO00o) : interfaceC25633OooO0O0.OooO0Oo(interfaceC25449OooO0oO.OooO(), interfaceC25449OooO0oO.size(), c25651OooO00o));
                    abstractC25434OooO00oOooOOO0.close();
                    return oooO0O0OooO00o;
                } catch (Throwable th) {
                    abstractC25434OooO00oOooOOO0.close();
                    throw th;
                }
            }
        };
    }

    @Override // o00oOooo.InterfaceC25632OooO00o
    public final C25612OooO0O0 OooO0OO() {
        return new C25612OooO0O0(this);
    }
}

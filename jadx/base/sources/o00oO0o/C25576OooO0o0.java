package o00oO0o;

import OoooOoO.InterfaceC21233OooO0o;
import androidx.compose.p002ui.platform.AndroidComposeView;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.OooOOOO;
import o00oO0O.C25485OooO0OO;
import o00oO0O.C25503OooOoOO;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: o00oO0o.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25576OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AndroidComposeView f87250OooO00o;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f87254OooO0o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Oooo.OooO0O0<C25485OooO0OO> f87251OooO0O0 = new Oooo.OooO0O0<>(new C25485OooO0OO[16]);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Oooo.OooO0O0<AbstractC25573OooO0OO<?>> f87252OooO0OO = new Oooo.OooO0O0<>(new AbstractC25573OooO0OO[16]);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Oooo.OooO0O0<C25503OooOoOO> f87253OooO0Oo = new Oooo.OooO0O0<>(new C25503OooOoOO[16]);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Oooo.OooO0O0<AbstractC25573OooO0OO<?>> f87255OooO0o0 = new Oooo.OooO0O0<>(new AbstractC25573OooO0OO[16]);

    /* JADX INFO: renamed from: o00oO0o.OooO0o0$OooO00o */
    public static final class OooO00o extends OooOOOO implements oO0O000o.OooO00o<C32460OooOooO> {
        public OooO00o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C32460OooOooO invoke() {
            C25576OooO0o0 c25576OooO0o0 = C25576OooO0o0.this;
            int i = 0;
            c25576OooO0o0.f87254OooO0o = false;
            HashSet hashSet = new HashSet();
            Oooo.OooO0O0<C25503OooOoOO> oooO0O0 = c25576OooO0o0.f87253OooO0Oo;
            int i2 = oooO0O0.f59746OooOoO0;
            Oooo.OooO0O0<AbstractC25573OooO0OO<?>> oooO0O02 = c25576OooO0o0.f87255OooO0o0;
            if (i2 > 0) {
                C25503OooOoOO[] c25503OooOoOOArr = oooO0O0.f59745OooOo0o;
                int i3 = 0;
                do {
                    C25503OooOoOO c25503OooOoOO = c25503OooOoOOArr[i3];
                    AbstractC25573OooO0OO<?> abstractC25573OooO0OO = oooO0O02.f59745OooOo0o[i3];
                    InterfaceC21233OooO0o.OooO0OO oooO0OO = c25503OooOoOO.f86970o000oOoO.f87088OooO0o0;
                    if (oooO0OO.f61612Oooo000) {
                        C25576OooO0o0.OooO0O0(oooO0OO, abstractC25573OooO0OO, hashSet);
                    }
                    i3++;
                } while (i3 < i2);
            }
            oooO0O0.OooO0o();
            oooO0O02.OooO0o();
            Oooo.OooO0O0<C25485OooO0OO> oooO0O03 = c25576OooO0o0.f87251OooO0O0;
            int i4 = oooO0O03.f59746OooOoO0;
            Oooo.OooO0O0<AbstractC25573OooO0OO<?>> oooO0O04 = c25576OooO0o0.f87252OooO0OO;
            if (i4 > 0) {
                C25485OooO0OO[] c25485OooO0OOArr = oooO0O03.f59745OooOo0o;
                do {
                    C25485OooO0OO c25485OooO0OO = c25485OooO0OOArr[i];
                    AbstractC25573OooO0OO<?> abstractC25573OooO0OO2 = oooO0O04.f59745OooOo0o[i];
                    if (c25485OooO0OO.f61612Oooo000) {
                        C25576OooO0o0.OooO0O0(c25485OooO0OO, abstractC25573OooO0OO2, hashSet);
                    }
                    i++;
                } while (i < i4);
            }
            oooO0O03.OooO0o();
            oooO0O04.OooO0o();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((C25485OooO0OO) it.next()).Oooo0O0();
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public C25576OooO0o0(AndroidComposeView androidComposeView) {
        this.f87250OooO00o = androidComposeView;
    }

    public static void OooO0O0(InterfaceC21233OooO0o.OooO0OO oooO0OO, AbstractC25573OooO0OO abstractC25573OooO0OO, HashSet hashSet) {
        boolean z;
        InterfaceC21233OooO0o.OooO0OO oooO0OO2 = oooO0OO.f61604OooOo0o;
        if (!oooO0OO2.f61612Oooo000) {
            throw new IllegalStateException("Check failed.");
        }
        Oooo.OooO0O0 oooO0O0 = new Oooo.OooO0O0(new InterfaceC21233OooO0o.OooO0OO[16]);
        InterfaceC21233OooO0o.OooO0OO oooO0OO3 = oooO0OO2.f61607OooOoOO;
        if (oooO0OO3 == null) {
            o00oO0O.OooO.OooO00o(oooO0O0, oooO0OO2);
        } else {
            oooO0O0.OooO0O0(oooO0OO3);
        }
        while (oooO0O0.OooOO0()) {
            InterfaceC21233OooO0o.OooO0OO oooO0OO4 = (InterfaceC21233OooO0o.OooO0OO) oooO0O0.OooOO0o(oooO0O0.f59746OooOoO0 - 1);
            if ((oooO0OO4.f61606OooOoO0 & 32) != 0) {
                for (InterfaceC21233OooO0o.OooO0OO oooO0OO5 = oooO0OO4; oooO0OO5 != null; oooO0OO5 = oooO0OO5.f61607OooOoOO) {
                    if ((oooO0OO5.f61603OooOo & 32) != 0) {
                        if (oooO0OO5 instanceof InterfaceC25575OooO0o) {
                            InterfaceC25575OooO0o interfaceC25575OooO0o = (InterfaceC25575OooO0o) oooO0OO5;
                            if (interfaceC25575OooO0o instanceof C25485OooO0OO) {
                                C25485OooO0OO c25485OooO0OO = (C25485OooO0OO) interfaceC25575OooO0o;
                                if ((c25485OooO0OO.f86864Oooo00O instanceof InterfaceC25574OooO0Oo) && c25485OooO0OO.f86866Oooo0O0.contains(abstractC25573OooO0OO)) {
                                    hashSet.add(interfaceC25575OooO0o);
                                }
                            }
                            z = !interfaceC25575OooO0o.OooO0oo().Oooo0oO(abstractC25573OooO0OO);
                        } else {
                            z = true;
                        }
                        if (z) {
                        }
                    }
                }
            }
            o00oO0O.OooO.OooO00o(oooO0O0, oooO0OO4);
        }
    }

    public final void OooO00o() {
        if (this.f87254OooO0o) {
            return;
        }
        this.f87254OooO0o = true;
        this.f87250OooO00o.OooOo0(new OooO00o());
    }
}

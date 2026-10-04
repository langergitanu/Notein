package oO0Ooo0O;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import oO000oo.C32132OooO0Oo;
import oO000oo.C32133OooO0o;
import oO000oo.C32136OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0OO.C33633Oooo0;
import oOo00Oo0.C34502OooO00o;

/* JADX INFO: renamed from: oO0Ooo0O.Oooo0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33416Oooo0oo {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C33417OooO0Oo f120800OooO0O0 = new C33417OooO0Oo();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final C34502OooO00o<C33416Oooo0oo> f120801OooO0OO = new C34502OooO00o<>("HttpSend");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f120802OooO00o = new ArrayList();

    /* JADX INFO: renamed from: oO0Ooo0O.Oooo0oo$OooO00o */
    public static final class OooO00o {
    }

    /* JADX INFO: renamed from: oO0Ooo0O.Oooo0oo$OooO0O0 */
    public static final class OooO0O0 implements InterfaceC33425OoooOo0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final oO000o0.OooO0o f120803OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f120804OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public ooOOOOOo.OooO0OO f120805OooO0OO;

        public OooO0O0(oO000o0.OooO0o client) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(client, "client");
            this.f120803OooO00o = client;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0Ooo0O.InterfaceC33425OoooOo0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object OooO00o(C32132OooO0Oo c32132OooO0Oo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
            C33406Oooo c33406Oooo;
            OooO0O0 oooO0O0;
            if (abstractC32479OooO0OO instanceof C33406Oooo) {
                c33406Oooo = (C33406Oooo) abstractC32479OooO0OO;
                int i = c33406Oooo.f120769OooOoO;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c33406Oooo.f120769OooOoO = i - Integer.MIN_VALUE;
                } else {
                    c33406Oooo = new C33406Oooo(this, abstractC32479OooO0OO);
                }
            }
            Object objOooO00o = c33406Oooo.f120767OooOo;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c33406Oooo.f120769OooOoO;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO00o);
                ooOOOOOo.OooO0OO oooO0OO = this.f120805OooO0OO;
                if (oooO0OO != null) {
                    C33633Oooo0.OooO0Oo(oooO0OO, null);
                }
                int i3 = this.f120804OooO0O0;
                if (i3 >= 20) {
                    throw new C33424OoooOOo("Max send count 20 exceeded. Consider increasing the property maxSendCount if more is required.");
                }
                this.f120804OooO0O0 = i3 + 1;
                C32136OooO0oo c32136OooO0oo = this.f120803OooO00o.f114955OooOoo;
                Object obj = c32132OooO0Oo.f115206OooO0Oo;
                c33406Oooo.f120768OooOo0o = this;
                c33406Oooo.f120769OooOoO = 1;
                objOooO00o = c32136OooO0oo.OooO00o(c32132OooO0Oo, obj, c33406Oooo);
                if (objOooO00o == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                oooO0O0 = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooO0O0 = c33406Oooo.f120768OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO00o);
            }
            ooOOOOOo.OooO0OO oooO0OO2 = objOooO00o instanceof ooOOOOOo.OooO0OO ? (ooOOOOOo.OooO0OO) objOooO00o : null;
            if (oooO0OO2 != null) {
                oooO0O0.f120805OooO0OO = oooO0OO2;
                return oooO0OO2;
            }
            throw new IllegalStateException(("Failed to execute send pipeline. Expected [HttpClientCall], but received " + objOooO00o).toString());
        }
    }

    /* JADX INFO: renamed from: oO0Ooo0O.Oooo0oo$OooO0OO */
    public static final class OooO0OO implements InterfaceC33425OoooOo0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final InterfaceC32510OooOOo0<InterfaceC33425OoooOo0, C32132OooO0Oo, Continuation<? super ooOOOOOo.OooO0OO>, Object> f120806OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final InterfaceC33425OoooOo0 f120807OooO0O0;

        /* JADX WARN: Multi-variable type inference failed */
        public OooO0OO(InterfaceC32510OooOOo0<? super InterfaceC33425OoooOo0, ? super C32132OooO0Oo, ? super Continuation<? super ooOOOOOo.OooO0OO>, ? extends Object> interceptor, InterfaceC33425OoooOo0 nextSender) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(interceptor, "interceptor");
            kotlin.jvm.internal.OooOOO0.OooO0oO(nextSender, "nextSender");
            this.f120806OooO00o = interceptor;
            this.f120807OooO0O0 = nextSender;
        }

        @Override // oO0Ooo0O.InterfaceC33425OoooOo0
        public final Object OooO00o(C32132OooO0Oo c32132OooO0Oo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
            return this.f120806OooO00o.invoke(this.f120807OooO0O0, c32132OooO0Oo, abstractC32479OooO0OO);
        }
    }

    /* JADX INFO: renamed from: oO0Ooo0O.Oooo0oo$OooO0Oo, reason: case insensitive filesystem */
    public static final class C33417OooO0Oo implements InterfaceC33394OooOo<OooO00o, C33416Oooo0oo> {
        @Override // oO0Ooo0O.InterfaceC33394OooOo
        public final C33416Oooo0oo OooO00o(InterfaceC32507OooOO0o<? super OooO00o, C32460OooOooO> interfaceC32507OooOO0o) {
            interfaceC32507OooOO0o.invoke(new OooO00o());
            return new C33416Oooo0oo();
        }

        @Override // oO0Ooo0O.InterfaceC33394OooOo
        public final void OooO0O0(C33416Oooo0oo c33416Oooo0oo, oO000o0.OooO0o scope) {
            C33416Oooo0oo plugin = c33416Oooo0oo;
            kotlin.jvm.internal.OooOOO0.OooO0oO(plugin, "plugin");
            kotlin.jvm.internal.OooOOO0.OooO0oO(scope, "scope");
            scope.f114954OooOoOO.OooO0o(C32133OooO0o.f115213OooOO0, new C33420OoooO00(plugin, scope, null));
        }

        @Override // oO0Ooo0O.InterfaceC33394OooOo
        public final C34502OooO00o<C33416Oooo0oo> getKey() {
            return C33416Oooo0oo.f120801OooO0OO;
        }
    }
}

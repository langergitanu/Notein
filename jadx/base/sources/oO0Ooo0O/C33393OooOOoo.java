package oO0Ooo0O;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO000oo.C32133OooO0o;
import oO000oo.InterfaceC32130OooO0O0;
import oO00OOoO.AbstractC32247OooO0oO;
import oO00OOoO.C32242OooO0O0;
import oO00OOoO.C32243OooO0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0Oo0Oo.AbstractC33200OooO0OO;
import oO0Oo0Oo.C33205OooO0oo;
import oO0Ooo0O.C33416Oooo0oo;
import oOo00Oo0.C34502OooO00o;

/* JADX INFO: renamed from: oO0Ooo0O.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33393OooOOoo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooO00o f120724OooO0Oo = new OooO00o();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final C34502OooO00o<C33393OooOOoo> f120725OooO0o0 = new C34502OooO00o<>("HttpResponseValidator");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<InterfaceC32508OooOOOo<AbstractC33200OooO0OO, Continuation<? super C32460OooOooO>, Object>> f120726OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<InterfaceC33389OooOOOO> f120727OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f120728OooO0OO;

    /* JADX INFO: renamed from: oO0Ooo0O.OooOOoo$OooO00o */
    public static final class OooO00o implements InterfaceC33394OooOo<OooO0O0, C33393OooOOoo> {
        @Override // oO0Ooo0O.InterfaceC33394OooOo
        public final C33393OooOOoo OooO00o(InterfaceC32507OooOO0o<? super OooO0O0, C32460OooOooO> interfaceC32507OooOO0o) {
            OooO0O0 oooO0O0 = new OooO0O0();
            interfaceC32507OooOO0o.invoke(oooO0O0);
            return new C33393OooOOoo(oOo000Oo.OooOo.Oooooo0(oooO0O0.f120729OooO00o), oOo000Oo.OooOo.Oooooo0(oooO0O0.f120730OooO0O0), oooO0O0.f120731OooO0OO);
        }

        @Override // oO0Ooo0O.InterfaceC33394OooOo
        public final void OooO0O0(C33393OooOOoo c33393OooOOoo, oO000o0.OooO0o scope) throws C32242OooO0O0 {
            C33393OooOOoo plugin = c33393OooOOoo;
            kotlin.jvm.internal.OooOOO0.OooO0oO(plugin, "plugin");
            kotlin.jvm.internal.OooOOO0.OooO0oO(scope, "scope");
            scope.f114954OooOoOO.OooO0o(C32133OooO0o.f115210OooO0o, new C33390OooOOOo(plugin, null));
            o00O00o0.OooO0O0 oooO0O0 = new o00O00o0.OooO0O0("BeforeReceive", 3);
            C33205OooO0oo c33205OooO0oo = scope.f114956OooOoo0;
            c33205OooO0oo.getClass();
            o00O00o0.OooO0O0 reference = C33205OooO0oo.f120159OooO0o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(reference, "reference");
            if (!c33205OooO0oo.OooO0o0(oooO0O0)) {
                int iOooO0OO = c33205OooO0oo.OooO0OO(reference);
                if (iOooO0OO == -1) {
                    throw new C32242OooO0O0("Phase " + reference + " was not registered for this pipeline");
                }
                c33205OooO0oo.f115812OooO00o.add(iOooO0OO, new C32243OooO0OO(oooO0O0, new AbstractC32247OooO0oO.OooO0O0()));
            }
            c33205OooO0oo.OooO0o(oooO0O0, new C33392OooOOo0(plugin, null));
            C33416Oooo0oo.C33417OooO0Oo c33417OooO0Oo = C33416Oooo0oo.f120800OooO0O0;
            ((C33416Oooo0oo) C33400OooOoO0.OooO00o(scope)).f120802OooO00o.add(new C33391OooOOo(plugin, null));
        }

        @Override // oO0Ooo0O.InterfaceC33394OooOo
        public final C34502OooO00o<C33393OooOOoo> getKey() {
            return C33393OooOOoo.f120725OooO0o0;
        }
    }

    /* JADX INFO: renamed from: oO0Ooo0O.OooOOoo$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList f120729OooO00o = new ArrayList();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ArrayList f120730OooO0O0 = new ArrayList();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f120731OooO0OO = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C33393OooOOoo(List<? extends InterfaceC32508OooOOOo<? super AbstractC33200OooO0OO, ? super Continuation<? super C32460OooOooO>, ? extends Object>> list, List<? extends InterfaceC33389OooOOOO> list2, boolean z) {
        this.f120726OooO00o = list;
        this.f120727OooO0O0 = list2;
        this.f120728OooO0OO = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C32460OooOooO OooO00o(C33393OooOOoo c33393OooOOoo, Throwable th, InterfaceC32130OooO0O0 interfaceC32130OooO0O0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C33396OooOo00 c33396OooOo00;
        Iterator it;
        c33393OooOOoo.getClass();
        if (abstractC32479OooO0OO instanceof C33396OooOo00) {
            c33396OooOo00 = (C33396OooOo00) abstractC32479OooO0OO;
            int i = c33396OooOo00.f120742OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c33396OooOo00.f120742OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c33396OooOo00 = new C33396OooOo00(c33393OooOOoo, abstractC32479OooO0OO);
            }
        }
        Object obj = c33396OooOo00.f120739OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c33396OooOo00.f120742OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C33398OooOo0o.f120747OooO00o.OooO0oo("Processing exception " + th + " for request " + interfaceC32130OooO0O0.getUrl());
            it = c33393OooOOoo.f120727OooO0O0.iterator();
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = c33396OooOo00.f120740OooOoO0;
            InterfaceC32130OooO0O0 interfaceC32130OooO0O02 = c33396OooOo00.f120737OooOo;
            Throwable th2 = c33396OooOo00.f120738OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            interfaceC32130OooO0O0 = interfaceC32130OooO0O02;
            th = th2;
        }
        while (it.hasNext()) {
            InterfaceC33389OooOOOO interfaceC33389OooOOOO = (InterfaceC33389OooOOOO) it.next();
            if (interfaceC33389OooOOOO instanceof C33387OooOOO) {
                ((C33387OooOOO) interfaceC33389OooOOOO).getClass();
                c33396OooOo00.f120738OooOo0o = th;
                c33396OooOo00.f120737OooOo = interfaceC32130OooO0O0;
                c33396OooOo00.f120740OooOoO0 = it;
                c33396OooOo00.f120742OooOoo0 = 1;
                throw null;
            }
            if (interfaceC33389OooOOOO instanceof C33427o000oOoO) {
                ((C33427o000oOoO) interfaceC33389OooOOOO).getClass();
                c33396OooOo00.f120738OooOo0o = th;
                c33396OooOo00.f120737OooOo = interfaceC32130OooO0O0;
                c33396OooOo00.f120740OooOoO0 = it;
                c33396OooOo00.f120742OooOoo0 = 2;
                throw null;
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0O0(C33393OooOOoo c33393OooOOoo, AbstractC33200OooO0OO abstractC33200OooO0OO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C33395OooOo0 c33395OooOo0;
        Iterator it;
        c33393OooOOoo.getClass();
        if (abstractC32479OooO0OO instanceof C33395OooOo0) {
            c33395OooOo0 = (C33395OooOo0) abstractC32479OooO0OO;
            int i = c33395OooOo0.f120736OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c33395OooOo0.f120736OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c33395OooOo0 = new C33395OooOo0(c33393OooOOoo, abstractC32479OooO0OO);
            }
        }
        Object obj = c33395OooOo0.f120735OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c33395OooOo0.f120736OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C33398OooOo0o.f120747OooO00o.OooO0oo("Validating response for request " + abstractC33200OooO0OO.OooO00o().OooO0Oo().getUrl());
            it = c33393OooOOoo.f120726OooO00o.iterator();
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = c33395OooOo0.f120732OooOo;
            abstractC33200OooO0OO = c33395OooOo0.f120733OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        while (it.hasNext()) {
            InterfaceC32508OooOOOo interfaceC32508OooOOOo = (InterfaceC32508OooOOOo) it.next();
            c33395OooOo0.f120733OooOo0o = abstractC33200OooO0OO;
            c33395OooOo0.f120732OooOo = it;
            c33395OooOo0.f120736OooOoOO = 1;
            if (interfaceC32508OooOOOo.invoke(abstractC33200OooO0OO, c33395OooOo0) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}

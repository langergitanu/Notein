package oO000oOo;

import Oooo0.C20850OoooOoO;
import io.ktor.utils.p616io.InterfaceC23986Ooooo0o;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o00OO0o0.C24999OooO0OO;
import oO000o0.OooO0o;
import oO00OOoO.AbstractC32246OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0Oo0Oo.AbstractC33200OooO0OO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0oO.C33882OooO00o;
import oOo0000O.InterfaceC34415OooO0oo;
import oOo0000O.OooO;
import oOo00Oo0.C34507OooO0o0;

/* JADX INFO: renamed from: oO000oOo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.client.plugins.observer.ResponseObserver$Plugin$install$1", m80623f = "ResponseObserver.kt", m80624l = {68, 80}, m80625m = "invokeSuspend")
public final class C32126OooO0Oo extends AbstractC32476OooO implements InterfaceC32510OooOOo0<AbstractC32246OooO0o0<AbstractC33200OooO0OO, C32460OooOooO>, AbstractC33200OooO0OO, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public OooO0o f115185OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public AbstractC33200OooO0OO f115186OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ AbstractC32246OooO0o0 f115187OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f115188OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ AbstractC33200OooO0OO f115189OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ OooO0o f115190OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C32127OooO0o0 f115191OooOoo0;

    /* JADX INFO: renamed from: oO000oOo.OooO0Oo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "io.ktor.client.plugins.observer.ResponseObserver$Plugin$install$1$1", m80623f = "ResponseObserver.kt", m80624l = {70, 76}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C32127OooO0o0 f115192OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f115193OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ AbstractC33200OooO0OO f115194OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C32127OooO0o0 c32127OooO0o0, AbstractC33200OooO0OO abstractC33200OooO0OO, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f115192OooOo = c32127OooO0o0;
            this.f115194OooOoO0 = abstractC33200OooO0OO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f115192OooOo, this.f115194OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
        
            if (r6.invoke(r2, r5) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
        
            if (r6.OooOOO(androidx.core.location.LocationRequestCompat.PASSIVE_INTERVAL, r5) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
        
            return r0;
         */
        /* JADX WARN: Type inference failed for: r6v5, types: [oO00ooo.OooO, oO0O000o.OooOOOo] */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f115193OooOo0o;
            AbstractC33200OooO0OO abstractC33200OooO0OO = this.f115194OooOoO0;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                ?? r6 = this.f115192OooOo.f115195OooO00o;
                this.f115193OooOo0o = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    return C32460OooOooO.f116667OooO00o;
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            InterfaceC23986Ooooo0o interfaceC23986Ooooo0oOooO0O0 = abstractC33200OooO0OO.OooO0O0();
            if (!interfaceC23986Ooooo0oOooO0O0.OooOoo()) {
                this.f115193OooOo0o = 2;
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32126OooO0Oo(C32127OooO0o0 c32127OooO0o0, OooO0o oooO0o, Continuation<? super C32126OooO0Oo> continuation) {
        super(3, continuation);
        this.f115191OooOoo0 = c32127OooO0o0;
        this.f115190OooOoo = oooO0o;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(AbstractC32246OooO0o0<AbstractC33200OooO0OO, C32460OooOooO> abstractC32246OooO0o0, AbstractC33200OooO0OO abstractC33200OooO0OO, Continuation<? super C32460OooOooO> continuation) {
        C32126OooO0Oo c32126OooO0Oo = new C32126OooO0Oo(this.f115191OooOoo0, this.f115190OooOoo, continuation);
        c32126OooO0Oo.f115187OooOoO = abstractC32246OooO0o0;
        c32126OooO0Oo.f115189OooOoOO = abstractC33200OooO0OO;
        return c32126OooO0Oo.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00af, code lost:
    
        if (r7.OooO0o0(r6, r12) == r0) goto L19;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AbstractC32246OooO0o0 abstractC32246OooO0o0;
        AbstractC33200OooO0OO abstractC33200OooO0OO;
        AbstractC33200OooO0OO abstractC33200OooO0OO2;
        OooO0o oooO0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f115188OooOoO0;
        C32127OooO0o0 c32127OooO0o0 = this.f115191OooOoo0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            abstractC32246OooO0o0 = this.f115187OooOoO;
            AbstractC33200OooO0OO abstractC33200OooO0OO3 = this.f115189OooOoOO;
            c32127OooO0o0.getClass();
            InterfaceC23986Ooooo0o interfaceC23986Ooooo0oOooO0O0 = abstractC33200OooO0OO3.OooO0O0();
            OooOOO0.OooO0oO(interfaceC23986Ooooo0oOooO0O0, "<this>");
            io.ktor.utils.p616io.OooO00o oooO00o = new io.ktor.utils.p616io.OooO00o(true);
            io.ktor.utils.p616io.OooO00o oooO00o2 = new io.ktor.utils.p616io.OooO00o(true);
            C33609OooO0oo.OooO0OO(abstractC33200OooO0OO3, null, null, new C34507OooO0o0(interfaceC23986Ooooo0oOooO0O0, oooO00o, oooO00o2, null), 3).invokeOnCompletion(new C20850OoooOoO(1, oooO00o, oooO00o2));
            AbstractC33200OooO0OO abstractC33200OooO0OOOooO0o0 = C24999OooO0OO.OooO0o(abstractC33200OooO0OO3.OooO00o(), oooO00o2).OooO0o0();
            AbstractC33200OooO0OO abstractC33200OooO0OOOooO0o02 = C24999OooO0OO.OooO0o(abstractC33200OooO0OO3.OooO00o(), oooO00o).OooO0o0();
            this.f115187OooOoO = abstractC32246OooO0o0;
            this.f115189OooOoOO = abstractC33200OooO0OOOooO0o0;
            this.f115186OooOo0o = abstractC33200OooO0OOOooO0o02;
            OooO0o oooO0o2 = this.f115190OooOoo;
            this.f115185OooOo = oooO0o2;
            this.f115188OooOoO0 = 1;
            Object obj2 = (C33882OooO00o) getContext().get(C33882OooO00o.f122058OooOoO0);
            if (obj2 == null) {
                obj2 = OooO.f123416OooOo0o;
            }
            if (obj2 != enumC32485OooO00o) {
                Object obj3 = obj2;
                abstractC33200OooO0OO = abstractC33200OooO0OOOooO0o02;
                obj = obj3;
                abstractC33200OooO0OO2 = abstractC33200OooO0OOOooO0o0;
                oooO0o = oooO0o2;
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        oooO0o = this.f115185OooOo;
        abstractC33200OooO0OO = this.f115186OooOo0o;
        abstractC33200OooO0OO2 = this.f115189OooOoOO;
        abstractC32246OooO0o0 = this.f115187OooOoO;
        C32446OooOOOo.OooO0O0(obj);
        C33609OooO0oo.OooO0OO(oooO0o, (InterfaceC34415OooO0oo) obj, null, new OooO00o(c32127OooO0o0, abstractC33200OooO0OO, null), 2);
        this.f115187OooOoO = null;
        this.f115189OooOoOO = null;
        this.f115186OooOo0o = null;
        this.f115185OooOo = null;
        this.f115188OooOoO0 = 2;
    }
}

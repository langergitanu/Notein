package oO000o;

import io.ktor.utils.p616io.InterfaceC23986Ooooo0o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import oO000o.OooO0O0;
import oO000oo.C32129OooO00o;
import oO000oo.C32132OooO0Oo;
import oO000oo.C32134OooO0o0;
import oO000oo.C32135OooO0oO;
import oO00O0o0.C32190OooOOo0;
import oO00O0o0.C32208Oooo0o0;
import oO00OOoO.AbstractC32246OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0O0OoO.C32709OooO0O0;
import oO0Oo0Oo.AbstractC33200OooO0OO;
import oO0Oo0Oo.C33198OooO00o;
import oOoo0.C34614OooOo0o;
import oOoo0.InterfaceC34606OooOOOo;

/* JADX INFO: renamed from: oO000o.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.client.engine.HttpClientEngine$install$1", m80623f = "HttpClientEngine.kt", m80624l = {70, 82}, m80625m = "invokeSuspend")
public final class C32082OooO0o0 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<AbstractC32246OooO0o0<Object, C32132OooO0Oo>, Object, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ AbstractC32246OooO0o0 f114920OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f114921OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ oO000o0.OooO0o f114922OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f114923OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ OooO0o f114924OooOoOO;

    /* JADX INFO: renamed from: oO000o.OooO0o0$OooO00o */
    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<Throwable, C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ oO000o0.OooO0o f114925OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(oO000o0.OooO0o oooO0o, AbstractC33200OooO0OO abstractC33200OooO0OO) {
            super(1);
            this.f114925OooOo0o = oooO0o;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(Throwable th) {
            if (th != null) {
                this.f114925OooOo0o.f114959Oooo000.OooO00o(C32709OooO0O0.f117615OooO0o0);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32082OooO0o0(oO000o0.OooO0o oooO0o, OooO0o oooO0o2, Continuation continuation) {
        super(3, continuation);
        this.f114922OooOoO = oooO0o;
        this.f114924OooOoOO = oooO0o2;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(AbstractC32246OooO0o0<Object, C32132OooO0Oo> abstractC32246OooO0o0, Object obj, Continuation<? super C32460OooOooO> continuation) {
        OooO0o oooO0o = this.f114924OooOoOO;
        C32082OooO0o0 c32082OooO0o0 = new C32082OooO0o0(this.f114922OooOoO, oooO0o, continuation);
        c32082OooO0o0.f114920OooOo = abstractC32246OooO0o0;
        c32082OooO0o0.f114923OooOoO0 = obj;
        return c32082OooO0o0.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x016c, code lost:
    
        if (r3.OooO0o0(r6, r12) == r0) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C32134OooO0o0 requestData;
        OooO0o oooO0o;
        AbstractC32246OooO0o0 abstractC32246OooO0o0;
        InterfaceC32083OooO0oO<?> next;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f114921OooOo0o;
        oO000o0.OooO0o client = this.f114922OooOoO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AbstractC32246OooO0o0 abstractC32246OooO0o02 = this.f114920OooOo;
            Object obj2 = this.f114923OooOoO0;
            C32132OooO0Oo c32132OooO0Oo = new C32132OooO0Oo();
            c32132OooO0Oo.OooO0o0((C32132OooO0Oo) abstractC32246OooO0o02.f115817OooOo0o);
            if (obj2 == null) {
                c32132OooO0Oo.f115206OooO0Oo = oO00O0oO.OooO0O0.f115612OooO00o;
                InterfaceC34606OooOOOo interfaceC34606OooOOOoOooO00o = C24035Oooo00o.OooO00o(Object.class);
                c32132OooO0Oo.OooO0OO(o000ooOO.OooOOO0.OooO(C34614OooOo0o.OooO0Oo(interfaceC34606OooOOOoOooO00o), C24035Oooo00o.f80943OooO00o.OooO0O0(Object.class), interfaceC34606OooOOOoOooO00o));
            } else if (obj2 instanceof oO00O0oO.OooO0OO) {
                c32132OooO0Oo.f115206OooO0Oo = obj2;
                c32132OooO0Oo.OooO0OO(null);
            } else {
                c32132OooO0Oo.f115206OooO0Oo = obj2;
                InterfaceC34606OooOOOo interfaceC34606OooOOOoOooO00o2 = C24035Oooo00o.OooO00o(Object.class);
                c32132OooO0Oo.OooO0OO(o000ooOO.OooOOO0.OooO(C34614OooOo0o.OooO0Oo(interfaceC34606OooOOOoOooO00o2), C24035Oooo00o.f80943OooO00o.OooO0O0(Object.class), interfaceC34606OooOOOoOooO00o2));
            }
            client.f114959Oooo000.OooO00o(C32709OooO0O0.f117612OooO0O0);
            requestData = c32132OooO0Oo.OooO00o();
            requestData.f115219OooO0o.OooO0o0(OooOO0O.f114930OooO0O0, client.f114960Oooo00O);
            Set<String> setKeySet = requestData.f115217OooO0OO.f123715OooO0OO.keySet();
            kotlin.jvm.internal.OooOOO0.OooO0oO(setKeySet, "<this>");
            Set setUnmodifiableSet = Collections.unmodifiableSet(setKeySet);
            kotlin.jvm.internal.OooOOO0.OooO0o(setUnmodifiableSet, "unmodifiableSet(this)");
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : setUnmodifiableSet) {
                if (C32190OooOOo0.f115537OooO00o.contains((String) obj3)) {
                    arrayList.add(obj3);
                }
            }
            if (!arrayList.isEmpty()) {
                String header = arrayList.toString();
                kotlin.jvm.internal.OooOOO0.OooO0oO(header, "header");
                throw new C32208Oooo0o0("Header(s) " + header + " are controlled by the engine and cannot be set explicitly");
            }
            Iterator<InterfaceC32083OooO0oO<?>> it = requestData.f115221OooO0oO.iterator();
            do {
                boolean zHasNext = it.hasNext();
                oooO0o = this.f114924OooOoOO;
                if (!zHasNext) {
                    this.f114920OooOo = abstractC32246OooO0o02;
                    this.f114923OooOoO0 = requestData;
                    this.f114921OooOo0o = 1;
                    Object objOooO00o = OooO0O0.OooO00o.OooO00o(oooO0o, requestData, this);
                    if (objOooO00o != enumC32485OooO00o) {
                        abstractC32246OooO0o0 = abstractC32246OooO0o02;
                        obj = objOooO00o;
                    }
                    return enumC32485OooO00o;
                }
                next = it.next();
            } while (oooO0o.OoooOOo().contains(next));
            throw new IllegalArgumentException(("Engine doesn't support " + next).toString());
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        requestData = (C32134OooO0o0) this.f114923OooOoO0;
        abstractC32246OooO0o0 = this.f114920OooOo;
        C32446OooOOOo.OooO0O0(obj);
        C32135OooO0oO responseData = (C32135OooO0oO) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(client, "client");
        kotlin.jvm.internal.OooOOO0.OooO0oO(requestData, "requestData");
        kotlin.jvm.internal.OooOOO0.OooO0oO(responseData, "responseData");
        ooOOOOOo.OooO0OO oooO0OO = new ooOOOOOo.OooO0OO(client);
        oooO0OO.f125912OooOo = new C32129OooO00o(oooO0OO, requestData);
        oooO0OO.f125914OooOoO0 = new C33198OooO00o(oooO0OO, responseData);
        Object obj4 = responseData.f115227OooO0o0;
        if (!(obj4 instanceof InterfaceC23986Ooooo0o)) {
            oooO0OO.getAttributes().OooO0o0(ooOOOOOo.OooO0OO.f125911OooOoOO, obj4);
        }
        AbstractC33200OooO0OO abstractC33200OooO0OOOooO0o0 = oooO0OO.OooO0o0();
        client.f114959Oooo000.OooO00o(C32709OooO0O0.f117613OooO0OO);
        oO00o00.OooO0OO.OooO0Oo(abstractC33200OooO0OOOooO0o0.OooOOO0()).invokeOnCompletion(new OooO00o(client, abstractC33200OooO0OOOooO0o0));
        this.f114920OooOo = null;
        this.f114923OooOoO0 = null;
        this.f114921OooOo0o = 2;
    }
}

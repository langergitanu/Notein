package oO0Ooo0O;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24034Oooo00O;
import kotlin.jvm.internal.C24035Oooo00o;
import o0000OOo.C24217OooO0O0;
import oO000oo.C32132OooO0Oo;
import oO00O0o0.InterfaceC32191OooOOoo;
import oO00OOoO.AbstractC32246OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0O00oo.C32520OooO0oo;
import oO0Ooo0O.C33416Oooo0oo;
import oO0o0O0o.C33591OooOOO;
import oOo000Oo.C34429OooOOo0;
import oOoo0.C34614OooOo0o;
import oOoo0.InterfaceC34606OooOOOo;

/* JADX INFO: renamed from: oO0Ooo0O.OoooO00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.client.plugins.HttpSend$Plugin$install$1", m80623f = "HttpSend.kt", m80624l = {104, 105}, m80625m = "invokeSuspend")
public final class C33420OoooO00 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<AbstractC32246OooO0o0<Object, C32132OooO0Oo>, Object, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ AbstractC32246OooO0o0 f120817OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f120818OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C33416Oooo0oo f120819OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f120820OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ oO000o0.OooO0o f120821OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33420OoooO00(C33416Oooo0oo c33416Oooo0oo, oO000o0.OooO0o oooO0o, Continuation<? super C33420OoooO00> continuation) {
        super(3, continuation);
        this.f120819OooOoO = c33416Oooo0oo;
        this.f120821OooOoOO = oooO0o;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(AbstractC32246OooO0o0<Object, C32132OooO0Oo> abstractC32246OooO0o0, Object obj, Continuation<? super C32460OooOooO> continuation) {
        C33420OoooO00 c33420OoooO00 = new C33420OoooO00(this.f120819OooOoO, this.f120821OooOoOO, continuation);
        c33420OoooO00.f120817OooOo = abstractC32246OooO0o0;
        c33420OoooO00.f120820OooOoO0 = obj;
        return c33420OoooO00.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cd, code lost:
    
        if (r1.OooO0o0((ooOOOOOo.OooO0OO) r11, r10) == r0) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v14, types: [T, oO0Ooo0O.Oooo0oo$OooO0O0] */
    /* JADX WARN: Type inference failed for: r7v3, types: [T, oO0Ooo0O.Oooo0oo$OooO0OO] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AbstractC32246OooO0o0 abstractC32246OooO0o0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f120818OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            abstractC32246OooO0o0 = this.f120817OooOo;
            Object obj2 = this.f120820OooOoO0;
            if (!(obj2 instanceof oO00O0oO.OooO0OO)) {
                throw new IllegalStateException(C33591OooOOO.OooO("\n|Fail to prepare request body for sending. \n|The body type is: " + C24035Oooo00o.f80943OooO00o.OooO0O0(obj2.getClass()) + ", with Content-Type: " + oO00O0o0.OooOo00.OooO0O0((InterfaceC32191OooOOoo) abstractC32246OooO0o0.f115817OooOo0o) + ".\n|\n|If you expect serialized body, please check that you have installed the corresponding plugin(like `ContentNegotiation`) and set `Content-Type` header.").toString());
            }
            C32132OooO0Oo c32132OooO0Oo = (C32132OooO0Oo) abstractC32246OooO0o0.f115817OooOo0o;
            if (obj2 == null) {
                oO00O0oO.OooO0O0 oooO0O0 = oO00O0oO.OooO0O0.f115612OooO00o;
                c32132OooO0Oo.getClass();
                c32132OooO0Oo.f115206OooO0Oo = oooO0O0;
                InterfaceC34606OooOOOo interfaceC34606OooOOOoOooO00o = C24035Oooo00o.OooO00o(oO00O0oO.OooO0OO.class);
                c32132OooO0Oo.OooO0OO(o000ooOO.OooOOO0.OooO(C34614OooOo0o.OooO0Oo(interfaceC34606OooOOOoOooO00o), C24035Oooo00o.f80943OooO00o.OooO0O0(oO00O0oO.OooO0OO.class), interfaceC34606OooOOOoOooO00o));
            } else if (obj2 != null) {
                c32132OooO0Oo.OooO0O0(obj2);
                c32132OooO0Oo.OooO0OO(null);
            } else {
                c32132OooO0Oo.OooO0O0(obj2);
                InterfaceC34606OooOOOo interfaceC34606OooOOOoOooO00o2 = C24035Oooo00o.OooO00o(oO00O0oO.OooO0OO.class);
                c32132OooO0Oo.OooO0OO(o000ooOO.OooOOO0.OooO(C34614OooOo0o.OooO0Oo(interfaceC34606OooOOOoOooO00o2), C24035Oooo00o.f80943OooO00o.OooO0O0(oO00O0oO.OooO0OO.class), interfaceC34606OooOOOoOooO00o2));
            }
            C33416Oooo0oo c33416Oooo0oo = this.f120819OooOoO;
            c33416Oooo0oo.getClass();
            ?? oooO0O02 = new C33416Oooo0oo.OooO0O0(this.f120821OooOoOO);
            C24034Oooo00O c24034Oooo00O = new C24034Oooo00O();
            c24034Oooo00O.f80942OooOo0o = oooO0O02;
            ArrayList arrayList = c33416Oooo0oo.f120802OooO00o;
            int iOooOO0O = C34429OooOOo0.OooOO0O(arrayList);
            C32520OooO0oo c32520OooO0oo = new C32520OooO0oo(iOooOO0O, C24217OooO0O0.OooO0oo(iOooOO0O, 0, -1), -1);
            while (c32520OooO0oo.f116817OooOoO0) {
                c24034Oooo00O.f80942OooOo0o = new C33416Oooo0oo.OooO0OO((InterfaceC32510OooOOo0) arrayList.get(c32520OooO0oo.nextInt()), (InterfaceC33425OoooOo0) c24034Oooo00O.f80942OooOo0o);
            }
            InterfaceC33425OoooOo0 interfaceC33425OoooOo0 = (InterfaceC33425OoooOo0) c24034Oooo00O.f80942OooOo0o;
            C32132OooO0Oo c32132OooO0Oo2 = (C32132OooO0Oo) abstractC32246OooO0o0.f115817OooOo0o;
            this.f120817OooOo = abstractC32246OooO0o0;
            this.f120818OooOo0o = 1;
            obj = interfaceC33425OoooOo0.OooO00o(c32132OooO0Oo2, this);
            if (obj != enumC32485OooO00o) {
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
        abstractC32246OooO0o0 = this.f120817OooOo;
        C32446OooOOOo.OooO0O0(obj);
        this.f120817OooOo = null;
        this.f120818OooOo0o = 2;
    }
}

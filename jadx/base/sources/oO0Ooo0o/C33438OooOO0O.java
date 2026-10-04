package oO0Ooo0o;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import oO000oo.C32132OooO0Oo;
import oO00O0o0.C32206Oooo0OO;
import oO00OOoO.AbstractC32246OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32510OooOOo0;
import oOo00Oo0.C34502OooO00o;

/* JADX INFO: renamed from: oO0Ooo0o.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.client.plugins.logging.Logging$setupRequestLogging$1", m80623f = "Logging.kt", m80624l = {84, 90}, m80625m = "invokeSuspend")
public final class C33438OooOO0O extends AbstractC32476OooO implements InterfaceC32510OooOOo0<AbstractC32246OooO0o0<Object, C32132OooO0Oo>, Object, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ AbstractC32246OooO0o0 f120877OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f120878OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C33436OooO0oo f120879OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33438OooOO0O(C33436OooO0oo c33436OooO0oo, Continuation<? super C33438OooOO0O> continuation) {
        super(3, continuation);
        this.f120879OooOoO0 = c33436OooO0oo;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(AbstractC32246OooO0o0<Object, C32132OooO0Oo> abstractC32246OooO0o0, Object obj, Continuation<? super C32460OooOooO> continuation) {
        C33438OooOO0O c33438OooOO0O = new C33438OooOO0O(this.f120879OooOoO0, continuation);
        c33438OooOO0O.f120877OooOo = abstractC32246OooO0o0;
        return c33438OooOO0O.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
    
        if (r1.OooO0o0(r9, r8) == r0) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009e  */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v11, types: [oO00OOoO.OooO0o0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [oO00OOoO.OooO0o0] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2, types: [oO00OOoO.OooO0o0] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOooO0O0;
        ?? r1;
        ?? r0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        ?? r12 = this.f120878OooOo0o;
        C33436OooO0oo c33436OooO0oo = this.f120879OooOoO0;
        try {
        } catch (Throwable unused) {
            objOooO0O0 = null;
            r1 = r12;
        }
        if (r12 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AbstractC32246OooO0o0 abstractC32246OooO0o0 = this.f120877OooOo;
            C32132OooO0Oo c32132OooO0Oo = (C32132OooO0Oo) abstractC32246OooO0o0.f115817OooOo0o;
            ArrayList arrayList = c33436OooO0oo.f120870OooO0OO;
            boolean zIsEmpty = arrayList.isEmpty();
            Object obj2 = abstractC32246OooO0o0.f115817OooOo0o;
            if (!zIsEmpty) {
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((Boolean) ((InterfaceC32507OooOO0o) it.next()).invoke(c32132OooO0Oo)).booleanValue()) {
                        }
                    }
                }
                oOo00Oo0.OooOOO0 oooOOO0 = ((C32132OooO0Oo) obj2).f115207OooO0o;
                C34502OooO00o<C32460OooOooO> c34502OooO00o = C33442OooOOOO.f120894OooO0O0;
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                oooOOO0.OooO0o0(c34502OooO00o, c32460OooOooO);
                return c32460OooOooO;
            }
            this.f120877OooOo = abstractC32246OooO0o0;
            this.f120878OooOo0o = 1;
            obj = C33436OooO0oo.OooO00o(c33436OooO0oo, (C32132OooO0Oo) obj2, this);
            r12 = abstractC32246OooO0o0;
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (r12 != 1) {
                if (r12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r0 = this.f120877OooOo;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    return C32460OooOooO.f116667OooO00o;
                } catch (Throwable th) {
                    th = th;
                    C32132OooO0Oo c32132OooO0Oo2 = (C32132OooO0Oo) r0.f115817OooOo0o;
                    if (C33434OooO0o0.OooO0OO(c33436OooO0oo.f120869OooO0O0)) {
                    }
                    throw th;
                }
            }
            AbstractC32246OooO0o0 abstractC32246OooO0o02 = this.f120877OooOo;
            C32446OooOOOo.OooO0O0(obj);
            r12 = abstractC32246OooO0o02;
        }
        objOooO0O0 = (oO00O0oO.OooO0OO) obj;
        r1 = r12;
        if (objOooO0O0 == null) {
            try {
                objOooO0O0 = r1.OooO0O0();
            } catch (Throwable th2) {
                th = th2;
                r0 = r1;
                C32132OooO0Oo c32132OooO0Oo22 = (C32132OooO0Oo) r0.f115817OooOo0o;
                if (C33434OooO0o0.OooO0OO(c33436OooO0oo.f120869OooO0O0)) {
                    c33436OooO0oo.f120868OooO00o.OooO00o("REQUEST " + C32206Oooo0OO.OooO00o(c32132OooO0Oo22.f115203OooO00o) + " failed with exception: " + th);
                }
                throw th;
            }
        }
        this.f120877OooOo = r1;
        this.f120878OooOo0o = 2;
    }
}

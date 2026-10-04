package OooO0Oo;

import java.lang.reflect.Constructor;
import java.util.ListIterator;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oOo000Oo.C34426OooOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f58217OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f58218OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OooOo(Object obj, int i) {
        super(1);
        this.f58218OooOo0o = i;
        this.f58217OooOo = obj;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        AbstractC20413OooOo0O abstractC20413OooOo0OPrevious;
        Object objOooO00o;
        switch (this.f58218OooOo0o) {
            case 0:
                OooO0OO backEvent = (OooO0OO) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(backEvent, "backEvent");
                C20418OooOoo c20418OooOoo = (C20418OooOoo) this.f58217OooOo;
                AbstractC20413OooOo0O abstractC20413OooOo0O = c20418OooOoo.f58229OooO0OO;
                if (abstractC20413OooOo0O == null) {
                    C34426OooOO0o<AbstractC20413OooOo0O> c34426OooOO0o = c20418OooOoo.f58228OooO0O0;
                    ListIterator<AbstractC20413OooOo0O> listIterator = c34426OooOO0o.listIterator(c34426OooOO0o.OooO0O0());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            abstractC20413OooOo0OPrevious = listIterator.previous();
                            if (abstractC20413OooOo0OPrevious.getIsEnabled()) {
                            }
                        } else {
                            abstractC20413OooOo0OPrevious = null;
                        }
                    }
                    abstractC20413OooOo0O = abstractC20413OooOo0OPrevious;
                }
                if (abstractC20413OooOo0O != null) {
                    abstractC20413OooOo0O.handleOnBackProgressed(backEvent);
                }
                return C32460OooOooO.f116667OooO00o;
            default:
                Throwable e = (Throwable) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(e, "e");
                try {
                    Object objNewInstance = ((Constructor) this.f58217OooOo).newInstance(e.getMessage(), e);
                    kotlin.jvm.internal.OooOOO0.OooO0o0(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
                    objOooO00o = (Throwable) objNewInstance;
                    break;
                } catch (Throwable th) {
                    objOooO00o = C32446OooOOOo.OooO00o(th);
                }
                if (objOooO00o instanceof C32445OooOOOO.OooO00o) {
                    objOooO00o = null;
                }
                return (Throwable) objOooO00o;
        }
    }
}

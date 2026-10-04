package OooO0Oo;

import java.util.ListIterator;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oOo000Oo.C34426OooOO0o;

/* JADX INFO: renamed from: OooO0Oo.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20414OooOo0o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f58222OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f58223OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20414OooOo0o(Object obj, int i) {
        super(1);
        this.f58223OooOo0o = i;
        this.f58222OooOo = obj;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        AbstractC20413OooOo0O abstractC20413OooOo0OPrevious;
        switch (this.f58223OooOo0o) {
            case 0:
                OooO0OO backEvent = (OooO0OO) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(backEvent, "backEvent");
                C20418OooOoo c20418OooOoo = (C20418OooOoo) this.f58222OooOo;
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
                AbstractC20413OooOo0O abstractC20413OooOo0O = abstractC20413OooOo0OPrevious;
                if (c20418OooOoo.f58229OooO0OO != null) {
                    c20418OooOoo.OooO0O0();
                }
                c20418OooOoo.f58229OooO0OO = abstractC20413OooOo0O;
                if (abstractC20413OooOo0O != null) {
                    abstractC20413OooOo0O.handleOnBackStarted(backEvent);
                }
                break;
            default:
                ((io.ktor.utils.p616io.OooO00o) this.f58222OooOo).OooO0Oo((Throwable) obj);
                break;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
